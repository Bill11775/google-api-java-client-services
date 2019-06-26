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

package com.google.api.services.run.v1alpha1.model;

/**
 * TrafficTarget holds a single entry of the routing table for a Route.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TrafficTarget extends com.google.api.client.json.GenericJson {

  /**
   * ConfigurationName of a configuration to whose latest revision we will send this portion of
   * traffic. When the "status.latestReadyRevisionName" of the referenced configuration changes, we
   * will automatically migrate traffic from the prior "latest ready" revision to the new one. This
   * field is never set in Route's status, only its spec. This is mutually exclusive with
   * RevisionName.
   *
   * Cloud Run currently supports a single ConfigurationName.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String configurationName;

  /**
   * LatestRevision may be optionally provided to indicate that the latest ready Revision of the
   * Configuration should be used for this traffic target. When provided LatestRevision must be true
   * if RevisionName is empty; it must be false when RevisionName is non-empty.
   *
   * Not currently supported in Cloud Run. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean latestRevision;

  /**
   * Name is optionally used to expose a dedicated hostname for referencing this target exclusively.
   *
   * Not currently supported by Cloud Run. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Percent specifies percent of the traffic to this Revision or Configuration. This defaults to
   * zero if unspecified.
   *
   * Cloud Run currently requires 100 percent for a single ConfigurationName TrafficTarget entry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer percent;

  /**
   * RevisionName of a specific revision to which to send this portion of traffic. This is mutually
   * exclusive with ConfigurationName.
   *
   * Providing RevisionName in spec is not currently supported by Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionName;

  /**
   * Tag is optionally used to expose a dedicated url for referencing this target exclusively.
   *
   * Not currently supported in Cloud Run. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tag;

  /**
   * Output only. URL displays the URL for accessing named traffic targets. URL is displayed in
   * status, and is disallowed on spec. URL must contain a scheme (e.g. http://) and a hostname, but
   * may not contain anything else (e.g. basic auth, url path, etc.
   *
   * Not currently supported in Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * ConfigurationName of a configuration to whose latest revision we will send this portion of
   * traffic. When the "status.latestReadyRevisionName" of the referenced configuration changes, we
   * will automatically migrate traffic from the prior "latest ready" revision to the new one. This
   * field is never set in Route's status, only its spec. This is mutually exclusive with
   * RevisionName.
   *
   * Cloud Run currently supports a single ConfigurationName.
   * @return value or {@code null} for none
   */
  public java.lang.String getConfigurationName() {
    return configurationName;
  }

  /**
   * ConfigurationName of a configuration to whose latest revision we will send this portion of
   * traffic. When the "status.latestReadyRevisionName" of the referenced configuration changes, we
   * will automatically migrate traffic from the prior "latest ready" revision to the new one. This
   * field is never set in Route's status, only its spec. This is mutually exclusive with
   * RevisionName.
   *
   * Cloud Run currently supports a single ConfigurationName.
   * @param configurationName configurationName or {@code null} for none
   */
  public TrafficTarget setConfigurationName(java.lang.String configurationName) {
    this.configurationName = configurationName;
    return this;
  }

  /**
   * LatestRevision may be optionally provided to indicate that the latest ready Revision of the
   * Configuration should be used for this traffic target. When provided LatestRevision must be true
   * if RevisionName is empty; it must be false when RevisionName is non-empty.
   *
   * Not currently supported in Cloud Run. +optional
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLatestRevision() {
    return latestRevision;
  }

  /**
   * LatestRevision may be optionally provided to indicate that the latest ready Revision of the
   * Configuration should be used for this traffic target. When provided LatestRevision must be true
   * if RevisionName is empty; it must be false when RevisionName is non-empty.
   *
   * Not currently supported in Cloud Run. +optional
   * @param latestRevision latestRevision or {@code null} for none
   */
  public TrafficTarget setLatestRevision(java.lang.Boolean latestRevision) {
    this.latestRevision = latestRevision;
    return this;
  }

  /**
   * Name is optionally used to expose a dedicated hostname for referencing this target exclusively.
   *
   * Not currently supported by Cloud Run. +optional
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name is optionally used to expose a dedicated hostname for referencing this target exclusively.
   *
   * Not currently supported by Cloud Run. +optional
   * @param name name or {@code null} for none
   */
  public TrafficTarget setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Percent specifies percent of the traffic to this Revision or Configuration. This defaults to
   * zero if unspecified.
   *
   * Cloud Run currently requires 100 percent for a single ConfigurationName TrafficTarget entry.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPercent() {
    return percent;
  }

  /**
   * Percent specifies percent of the traffic to this Revision or Configuration. This defaults to
   * zero if unspecified.
   *
   * Cloud Run currently requires 100 percent for a single ConfigurationName TrafficTarget entry.
   * @param percent percent or {@code null} for none
   */
  public TrafficTarget setPercent(java.lang.Integer percent) {
    this.percent = percent;
    return this;
  }

  /**
   * RevisionName of a specific revision to which to send this portion of traffic. This is mutually
   * exclusive with ConfigurationName.
   *
   * Providing RevisionName in spec is not currently supported by Cloud Run.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionName() {
    return revisionName;
  }

  /**
   * RevisionName of a specific revision to which to send this portion of traffic. This is mutually
   * exclusive with ConfigurationName.
   *
   * Providing RevisionName in spec is not currently supported by Cloud Run.
   * @param revisionName revisionName or {@code null} for none
   */
  public TrafficTarget setRevisionName(java.lang.String revisionName) {
    this.revisionName = revisionName;
    return this;
  }

  /**
   * Tag is optionally used to expose a dedicated url for referencing this target exclusively.
   *
   * Not currently supported in Cloud Run. +optional
   * @return value or {@code null} for none
   */
  public java.lang.String getTag() {
    return tag;
  }

  /**
   * Tag is optionally used to expose a dedicated url for referencing this target exclusively.
   *
   * Not currently supported in Cloud Run. +optional
   * @param tag tag or {@code null} for none
   */
  public TrafficTarget setTag(java.lang.String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Output only. URL displays the URL for accessing named traffic targets. URL is displayed in
   * status, and is disallowed on spec. URL must contain a scheme (e.g. http://) and a hostname, but
   * may not contain anything else (e.g. basic auth, url path, etc.
   *
   * Not currently supported in Cloud Run.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * Output only. URL displays the URL for accessing named traffic targets. URL is displayed in
   * status, and is disallowed on spec. URL must contain a scheme (e.g. http://) and a hostname, but
   * may not contain anything else (e.g. basic auth, url path, etc.
   *
   * Not currently supported in Cloud Run.
   * @param url url or {@code null} for none
   */
  public TrafficTarget setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public TrafficTarget set(String fieldName, Object value) {
    return (TrafficTarget) super.set(fieldName, value);
  }

  @Override
  public TrafficTarget clone() {
    return (TrafficTarget) super.clone();
  }

}
