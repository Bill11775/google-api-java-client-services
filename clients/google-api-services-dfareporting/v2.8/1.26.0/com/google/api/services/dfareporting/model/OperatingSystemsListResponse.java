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

package com.google.api.services.dfareporting.model;

/**
 * Operating System List Response
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OperatingSystemsListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#operatingSystemsListResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Operating system collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OperatingSystem> operatingSystems;

  static {
    // hack to force ProGuard to consider OperatingSystem used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OperatingSystem.class);
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#operatingSystemsListResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#operatingSystemsListResponse".
   * @param kind kind or {@code null} for none
   */
  public OperatingSystemsListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Operating system collection.
   * @return value or {@code null} for none
   */
  public java.util.List<OperatingSystem> getOperatingSystems() {
    return operatingSystems;
  }

  /**
   * Operating system collection.
   * @param operatingSystems operatingSystems or {@code null} for none
   */
  public OperatingSystemsListResponse setOperatingSystems(java.util.List<OperatingSystem> operatingSystems) {
    this.operatingSystems = operatingSystems;
    return this;
  }

  @Override
  public OperatingSystemsListResponse set(String fieldName, Object value) {
    return (OperatingSystemsListResponse) super.set(fieldName, value);
  }

  @Override
  public OperatingSystemsListResponse clone() {
    return (OperatingSystemsListResponse) super.clone();
  }

}