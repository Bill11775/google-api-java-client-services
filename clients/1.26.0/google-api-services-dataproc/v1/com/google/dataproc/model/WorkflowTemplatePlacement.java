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

package com.google.dataproc.model;

/**
 * Specifies workflow execution target.Either managed_cluster or cluster_selector is required.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkflowTemplatePlacement extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A selector that chooses target cluster for jobs based on metadata.The selector is
   * evaluated at the time each job is submitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClusterSelector clusterSelector;

  /**
   * Optional. A cluster that is managed by the workflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedCluster managedCluster;

  /**
   * Optional. A selector that chooses target cluster for jobs based on metadata.The selector is
   * evaluated at the time each job is submitted.
   * @return value or {@code null} for none
   */
  public ClusterSelector getClusterSelector() {
    return clusterSelector;
  }

  /**
   * Optional. A selector that chooses target cluster for jobs based on metadata.The selector is
   * evaluated at the time each job is submitted.
   * @param clusterSelector clusterSelector or {@code null} for none
   */
  public WorkflowTemplatePlacement setClusterSelector(ClusterSelector clusterSelector) {
    this.clusterSelector = clusterSelector;
    return this;
  }

  /**
   * Optional. A cluster that is managed by the workflow.
   * @return value or {@code null} for none
   */
  public ManagedCluster getManagedCluster() {
    return managedCluster;
  }

  /**
   * Optional. A cluster that is managed by the workflow.
   * @param managedCluster managedCluster or {@code null} for none
   */
  public WorkflowTemplatePlacement setManagedCluster(ManagedCluster managedCluster) {
    this.managedCluster = managedCluster;
    return this;
  }

  @Override
  public WorkflowTemplatePlacement set(String fieldName, Object value) {
    return (WorkflowTemplatePlacement) super.set(fieldName, value);
  }

  @Override
  public WorkflowTemplatePlacement clone() {
    return (WorkflowTemplatePlacement) super.clone();
  }

}
