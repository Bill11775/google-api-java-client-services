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

package com.google.api.services.accesscontextmanager.v1beta.model;

/**
 * `ServicePerimeterConfig` specifies a set of GCP resources that describe specific Service
 * Perimeter configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Context Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServicePerimeterConfig extends com.google.api.client.json.GenericJson {

  /**
   * A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be
   * accessed from the internet. `AccessLevels` listed must be in the same policy as this
   * `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no
   * `AccessLevel` names are listed, resources within the perimeter can only be accessed via GCP
   * calls with request origins within the perimeter. Example:
   * `"accessPolicies/MY_POLICY/accessLevels/MY_LEVEL"`. For Service Perimeter Bridge, must be
   * empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> accessLevels;

  /**
   * A list of GCP resources that are inside of the service perimeter. Currently only projects are
   * allowed. Format: `projects/{project_number}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resources;

  /**
   * GCP services that are subject to the Service Perimeter restrictions. Must contain a list of
   * services. For example, if `storage.googleapis.com` is specified, access to the storage buckets
   * inside the perimeter must meet the perimeter's access restrictions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> restrictedServices;

  /**
   * GCP services that are not subject to the Service Perimeter restrictions. Deprecated. Must be
   * set to a single wildcard "*".
   *
   * The wildcard means that unless explicitly specified by "restricted_services" list, any service
   * is treated as unrestricted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unrestrictedServices;

  /**
   * Alpha. Configuration for within Perimeter allowed APIs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VpcServiceRestriction vpcServiceRestriction;

  /**
   * A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be
   * accessed from the internet. `AccessLevels` listed must be in the same policy as this
   * `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no
   * `AccessLevel` names are listed, resources within the perimeter can only be accessed via GCP
   * calls with request origins within the perimeter. Example:
   * `"accessPolicies/MY_POLICY/accessLevels/MY_LEVEL"`. For Service Perimeter Bridge, must be
   * empty.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAccessLevels() {
    return accessLevels;
  }

  /**
   * A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be
   * accessed from the internet. `AccessLevels` listed must be in the same policy as this
   * `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no
   * `AccessLevel` names are listed, resources within the perimeter can only be accessed via GCP
   * calls with request origins within the perimeter. Example:
   * `"accessPolicies/MY_POLICY/accessLevels/MY_LEVEL"`. For Service Perimeter Bridge, must be
   * empty.
   * @param accessLevels accessLevels or {@code null} for none
   */
  public ServicePerimeterConfig setAccessLevels(java.util.List<java.lang.String> accessLevels) {
    this.accessLevels = accessLevels;
    return this;
  }

  /**
   * A list of GCP resources that are inside of the service perimeter. Currently only projects are
   * allowed. Format: `projects/{project_number}`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResources() {
    return resources;
  }

  /**
   * A list of GCP resources that are inside of the service perimeter. Currently only projects are
   * allowed. Format: `projects/{project_number}`
   * @param resources resources or {@code null} for none
   */
  public ServicePerimeterConfig setResources(java.util.List<java.lang.String> resources) {
    this.resources = resources;
    return this;
  }

  /**
   * GCP services that are subject to the Service Perimeter restrictions. Must contain a list of
   * services. For example, if `storage.googleapis.com` is specified, access to the storage buckets
   * inside the perimeter must meet the perimeter's access restrictions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRestrictedServices() {
    return restrictedServices;
  }

  /**
   * GCP services that are subject to the Service Perimeter restrictions. Must contain a list of
   * services. For example, if `storage.googleapis.com` is specified, access to the storage buckets
   * inside the perimeter must meet the perimeter's access restrictions.
   * @param restrictedServices restrictedServices or {@code null} for none
   */
  public ServicePerimeterConfig setRestrictedServices(java.util.List<java.lang.String> restrictedServices) {
    this.restrictedServices = restrictedServices;
    return this;
  }

  /**
   * GCP services that are not subject to the Service Perimeter restrictions. Deprecated. Must be
   * set to a single wildcard "*".
   *
   * The wildcard means that unless explicitly specified by "restricted_services" list, any service
   * is treated as unrestricted.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnrestrictedServices() {
    return unrestrictedServices;
  }

  /**
   * GCP services that are not subject to the Service Perimeter restrictions. Deprecated. Must be
   * set to a single wildcard "*".
   *
   * The wildcard means that unless explicitly specified by "restricted_services" list, any service
   * is treated as unrestricted.
   * @param unrestrictedServices unrestrictedServices or {@code null} for none
   */
  public ServicePerimeterConfig setUnrestrictedServices(java.util.List<java.lang.String> unrestrictedServices) {
    this.unrestrictedServices = unrestrictedServices;
    return this;
  }

  /**
   * Alpha. Configuration for within Perimeter allowed APIs.
   * @return value or {@code null} for none
   */
  public VpcServiceRestriction getVpcServiceRestriction() {
    return vpcServiceRestriction;
  }

  /**
   * Alpha. Configuration for within Perimeter allowed APIs.
   * @param vpcServiceRestriction vpcServiceRestriction or {@code null} for none
   */
  public ServicePerimeterConfig setVpcServiceRestriction(VpcServiceRestriction vpcServiceRestriction) {
    this.vpcServiceRestriction = vpcServiceRestriction;
    return this;
  }

  @Override
  public ServicePerimeterConfig set(String fieldName, Object value) {
    return (ServicePerimeterConfig) super.set(fieldName, value);
  }

  @Override
  public ServicePerimeterConfig clone() {
    return (ServicePerimeterConfig) super.clone();
  }

}
