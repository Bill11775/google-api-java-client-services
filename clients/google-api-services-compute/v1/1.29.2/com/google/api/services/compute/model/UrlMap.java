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

package com.google.api.services.compute.model;

/**
 * Represents a URL Map resource.
 *
 * A URL map resource is a component of certain types of load balancers. This resource defines
 * mappings from host names and URL paths to either a backend service or a backend bucket.
 *
 * To use this resource, the backend service must have a loadBalancingScheme of either EXTERNAL,
 * INTERNAL_SELF_MANAGED, or INTERNAL_MANAGED For more information, read URL Map Concepts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UrlMap extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * The full or partial URL of the defaultService resource to which traffic is directed if none of
   * the hostRules match. If defaultRouteAction is additionally specified, advanced routing actions
   * like URL Rewrites, etc. take effect prior to sending the request to the backend. However, if
   * defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices.
   * Conversely, if routeAction specifies any weightedBackendServices, service must not be
   * specified. Only one of defaultService, defaultUrlRedirect  or
   * defaultRouteAction.weightedBackendService must be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultService;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a UrlMap. An up-to-date
   * fingerprint must be provided in order to update the UrlMap, otherwise the request will fail
   * with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a UrlMap.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * The list of HostRules to use against the URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HostRule> hostRules;

  static {
    // hack to force ProGuard to consider HostRule used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(HostRule.class);
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#urlMaps for url maps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The list of named PathMatchers to use against the URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PathMatcher> pathMatchers;

  static {
    // hack to force ProGuard to consider PathMatcher used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PathMatcher.class);
  }

  /**
   * [Output Only] URL of the region where the regional URL map resides. This field is not
   * applicable to global URL maps. You must specify this field as part of the HTTP request URL. It
   * is not settable as a field in the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The list of expected URL mapping tests. Request to update this UrlMap will succeed only if all
   * of the test cases pass. You can specify a maximum of 100 tests per UrlMap.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UrlMapTest> tests;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public UrlMap setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * The full or partial URL of the defaultService resource to which traffic is directed if none of
   * the hostRules match. If defaultRouteAction is additionally specified, advanced routing actions
   * like URL Rewrites, etc. take effect prior to sending the request to the backend. However, if
   * defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices.
   * Conversely, if routeAction specifies any weightedBackendServices, service must not be
   * specified. Only one of defaultService, defaultUrlRedirect  or
   * defaultRouteAction.weightedBackendService must be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultService() {
    return defaultService;
  }

  /**
   * The full or partial URL of the defaultService resource to which traffic is directed if none of
   * the hostRules match. If defaultRouteAction is additionally specified, advanced routing actions
   * like URL Rewrites, etc. take effect prior to sending the request to the backend. However, if
   * defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices.
   * Conversely, if routeAction specifies any weightedBackendServices, service must not be
   * specified. Only one of defaultService, defaultUrlRedirect  or
   * defaultRouteAction.weightedBackendService must be set.
   * @param defaultService defaultService or {@code null} for none
   */
  public UrlMap setDefaultService(java.lang.String defaultService) {
    this.defaultService = defaultService;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public UrlMap setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a UrlMap. An up-to-date
   * fingerprint must be provided in order to update the UrlMap, otherwise the request will fail
   * with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a UrlMap.
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a UrlMap. An up-to-date
   * fingerprint must be provided in order to update the UrlMap, otherwise the request will fail
   * with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a UrlMap.
   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a UrlMap. An up-to-date
   * fingerprint must be provided in order to update the UrlMap, otherwise the request will fail
   * with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a UrlMap.
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public UrlMap setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a UrlMap. An up-to-date
   * fingerprint must be provided in order to update the UrlMap, otherwise the request will fail
   * with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a UrlMap.
   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public UrlMap encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
    return this;
  }

  /**
   * The list of HostRules to use against the URL.
   * @return value or {@code null} for none
   */
  public java.util.List<HostRule> getHostRules() {
    return hostRules;
  }

  /**
   * The list of HostRules to use against the URL.
   * @param hostRules hostRules or {@code null} for none
   */
  public UrlMap setHostRules(java.util.List<HostRule> hostRules) {
    this.hostRules = hostRules;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public UrlMap setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#urlMaps for url maps.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#urlMaps for url maps.
   * @param kind kind or {@code null} for none
   */
  public UrlMap setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public UrlMap setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The list of named PathMatchers to use against the URL.
   * @return value or {@code null} for none
   */
  public java.util.List<PathMatcher> getPathMatchers() {
    return pathMatchers;
  }

  /**
   * The list of named PathMatchers to use against the URL.
   * @param pathMatchers pathMatchers or {@code null} for none
   */
  public UrlMap setPathMatchers(java.util.List<PathMatcher> pathMatchers) {
    this.pathMatchers = pathMatchers;
    return this;
  }

  /**
   * [Output Only] URL of the region where the regional URL map resides. This field is not
   * applicable to global URL maps. You must specify this field as part of the HTTP request URL. It
   * is not settable as a field in the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the regional URL map resides. This field is not
   * applicable to global URL maps. You must specify this field as part of the HTTP request URL. It
   * is not settable as a field in the request body.
   * @param region region or {@code null} for none
   */
  public UrlMap setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public UrlMap setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The list of expected URL mapping tests. Request to update this UrlMap will succeed only if all
   * of the test cases pass. You can specify a maximum of 100 tests per UrlMap.
   * @return value or {@code null} for none
   */
  public java.util.List<UrlMapTest> getTests() {
    return tests;
  }

  /**
   * The list of expected URL mapping tests. Request to update this UrlMap will succeed only if all
   * of the test cases pass. You can specify a maximum of 100 tests per UrlMap.
   * @param tests tests or {@code null} for none
   */
  public UrlMap setTests(java.util.List<UrlMapTest> tests) {
    this.tests = tests;
    return this;
  }

  @Override
  public UrlMap set(String fieldName, Object value) {
    return (UrlMap) super.set(fieldName, value);
  }

  @Override
  public UrlMap clone() {
    return (UrlMap) super.clone();
  }

}
