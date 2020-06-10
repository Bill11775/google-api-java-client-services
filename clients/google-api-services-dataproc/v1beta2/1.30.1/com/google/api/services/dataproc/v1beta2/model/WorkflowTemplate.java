/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dataproc.v1beta2.model;

/**
 * A Dataproc workflow template resource. Next ID: 11
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkflowTemplate extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time template was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. The template id.The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist
   * of between 3 and 50 characters..
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Required. The Directed Acyclic Graph of Jobs to submit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderedJob> jobs;

  static {
    // hack to force ProGuard to consider OrderedJob used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OrderedJob.class);
  }

  /**
   * Optional. The labels to associate with this template. These labels will be propagated to all
   * jobs and clusters created by the workflow instance.Label keys must contain 1 to 63 characters,
   * and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).Label values may be empty,
   * but, if present, must contain 1 to 63 characters, and must conform to RFC 1035
   * (https://www.ietf.org/rfc/rfc1035.txt).No more than 32 labels can be associated with a
   * template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. The resource name of the workflow template, as described in
   * https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates,
   * the resource name of the  template has the following format:
   * projects/{project_id}/regions/{region}/workflowTemplates/{template_id} For
   * projects.locations.workflowTemplates, the resource name of the  template has the following
   * format:  projects/{project_id}/locations/{location}/workflowTemplates/{template_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Template parameters whose values are substituted into the template. Values for
   * parameters must be provided when the template is instantiated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TemplateParameter> parameters;

  static {
    // hack to force ProGuard to consider TemplateParameter used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TemplateParameter.class);
  }

  /**
   * Required. WorkflowTemplate scheduling information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WorkflowTemplatePlacement placement;

  /**
   * Output only. The time template was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Used to perform a consistent read-modify-write.This field should be left blank for a
   * CreateWorkflowTemplate request. It is required for an UpdateWorkflowTemplate request, and must
   * match the current server version. A typical update template flow would fetch the current
   * template with a GetWorkflowTemplate request, which will return the current template with the
   * version field filled in with the current server version. The user updates other fields in the
   * template, then returns it as part of the UpdateWorkflowTemplate request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer version;

  /**
   * Output only. The time template was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time template was created.
   * @param createTime createTime or {@code null} for none
   */
  public WorkflowTemplate setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. The template id.The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist
   * of between 3 and 50 characters..
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Required. The template id.The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist
   * of between 3 and 50 characters..
   * @param id id or {@code null} for none
   */
  public WorkflowTemplate setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Required. The Directed Acyclic Graph of Jobs to submit.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderedJob> getJobs() {
    return jobs;
  }

  /**
   * Required. The Directed Acyclic Graph of Jobs to submit.
   * @param jobs jobs or {@code null} for none
   */
  public WorkflowTemplate setJobs(java.util.List<OrderedJob> jobs) {
    this.jobs = jobs;
    return this;
  }

  /**
   * Optional. The labels to associate with this template. These labels will be propagated to all
   * jobs and clusters created by the workflow instance.Label keys must contain 1 to 63 characters,
   * and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).Label values may be empty,
   * but, if present, must contain 1 to 63 characters, and must conform to RFC 1035
   * (https://www.ietf.org/rfc/rfc1035.txt).No more than 32 labels can be associated with a
   * template.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. The labels to associate with this template. These labels will be propagated to all
   * jobs and clusters created by the workflow instance.Label keys must contain 1 to 63 characters,
   * and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt).Label values may be empty,
   * but, if present, must contain 1 to 63 characters, and must conform to RFC 1035
   * (https://www.ietf.org/rfc/rfc1035.txt).No more than 32 labels can be associated with a
   * template.
   * @param labels labels or {@code null} for none
   */
  public WorkflowTemplate setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. The resource name of the workflow template, as described in
   * https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates,
   * the resource name of the  template has the following format:
   * projects/{project_id}/regions/{region}/workflowTemplates/{template_id} For
   * projects.locations.workflowTemplates, the resource name of the  template has the following
   * format:  projects/{project_id}/locations/{location}/workflowTemplates/{template_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the workflow template, as described in
   * https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates,
   * the resource name of the  template has the following format:
   * projects/{project_id}/regions/{region}/workflowTemplates/{template_id} For
   * projects.locations.workflowTemplates, the resource name of the  template has the following
   * format:  projects/{project_id}/locations/{location}/workflowTemplates/{template_id}
   * @param name name or {@code null} for none
   */
  public WorkflowTemplate setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Template parameters whose values are substituted into the template. Values for
   * parameters must be provided when the template is instantiated.
   * @return value or {@code null} for none
   */
  public java.util.List<TemplateParameter> getParameters() {
    return parameters;
  }

  /**
   * Optional. Template parameters whose values are substituted into the template. Values for
   * parameters must be provided when the template is instantiated.
   * @param parameters parameters or {@code null} for none
   */
  public WorkflowTemplate setParameters(java.util.List<TemplateParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Required. WorkflowTemplate scheduling information.
   * @return value or {@code null} for none
   */
  public WorkflowTemplatePlacement getPlacement() {
    return placement;
  }

  /**
   * Required. WorkflowTemplate scheduling information.
   * @param placement placement or {@code null} for none
   */
  public WorkflowTemplate setPlacement(WorkflowTemplatePlacement placement) {
    this.placement = placement;
    return this;
  }

  /**
   * Output only. The time template was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time template was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public WorkflowTemplate setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Optional. Used to perform a consistent read-modify-write.This field should be left blank for a
   * CreateWorkflowTemplate request. It is required for an UpdateWorkflowTemplate request, and must
   * match the current server version. A typical update template flow would fetch the current
   * template with a GetWorkflowTemplate request, which will return the current template with the
   * version field filled in with the current server version. The user updates other fields in the
   * template, then returns it as part of the UpdateWorkflowTemplate request.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Optional. Used to perform a consistent read-modify-write.This field should be left blank for a
   * CreateWorkflowTemplate request. It is required for an UpdateWorkflowTemplate request, and must
   * match the current server version. A typical update template flow would fetch the current
   * template with a GetWorkflowTemplate request, which will return the current template with the
   * version field filled in with the current server version. The user updates other fields in the
   * template, then returns it as part of the UpdateWorkflowTemplate request.
   * @param version version or {@code null} for none
   */
  public WorkflowTemplate setVersion(java.lang.Integer version) {
    this.version = version;
    return this;
  }

  @Override
  public WorkflowTemplate set(String fieldName, Object value) {
    return (WorkflowTemplate) super.set(fieldName, value);
  }

  @Override
  public WorkflowTemplate clone() {
    return (WorkflowTemplate) super.clone();
  }

}
