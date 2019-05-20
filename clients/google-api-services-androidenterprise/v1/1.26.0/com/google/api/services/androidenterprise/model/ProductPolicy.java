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

package com.google.api.services.androidenterprise.model;

/**
 * The policy for a product.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductPolicy extends com.google.api.client.json.GenericJson {

  /**
   * The auto-install policy for the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutoInstallPolicy autoInstallPolicy;

  /**
   * The managed configuration for the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedConfiguration managedConfiguration;

  /**
   * The ID of the product. For example, "app:com.google.android.gm".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * Grants the device visibility to the specified product release track(s), identified by trackIds.
   * The list of release tracks of a product can be obtained by calling Products.Get.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> trackIds;

  /**
   * Deprecated. Use trackIds instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tracks;

  /**
   * The auto-install policy for the product.
   * @return value or {@code null} for none
   */
  public AutoInstallPolicy getAutoInstallPolicy() {
    return autoInstallPolicy;
  }

  /**
   * The auto-install policy for the product.
   * @param autoInstallPolicy autoInstallPolicy or {@code null} for none
   */
  public ProductPolicy setAutoInstallPolicy(AutoInstallPolicy autoInstallPolicy) {
    this.autoInstallPolicy = autoInstallPolicy;
    return this;
  }

  /**
   * The managed configuration for the product.
   * @return value or {@code null} for none
   */
  public ManagedConfiguration getManagedConfiguration() {
    return managedConfiguration;
  }

  /**
   * The managed configuration for the product.
   * @param managedConfiguration managedConfiguration or {@code null} for none
   */
  public ProductPolicy setManagedConfiguration(ManagedConfiguration managedConfiguration) {
    this.managedConfiguration = managedConfiguration;
    return this;
  }

  /**
   * The ID of the product. For example, "app:com.google.android.gm".
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The ID of the product. For example, "app:com.google.android.gm".
   * @param productId productId or {@code null} for none
   */
  public ProductPolicy setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Grants the device visibility to the specified product release track(s), identified by trackIds.
   * The list of release tracks of a product can be obtained by calling Products.Get.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTrackIds() {
    return trackIds;
  }

  /**
   * Grants the device visibility to the specified product release track(s), identified by trackIds.
   * The list of release tracks of a product can be obtained by calling Products.Get.
   * @param trackIds trackIds or {@code null} for none
   */
  public ProductPolicy setTrackIds(java.util.List<java.lang.String> trackIds) {
    this.trackIds = trackIds;
    return this;
  }

  /**
   * Deprecated. Use trackIds instead.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTracks() {
    return tracks;
  }

  /**
   * Deprecated. Use trackIds instead.
   * @param tracks tracks or {@code null} for none
   */
  public ProductPolicy setTracks(java.util.List<java.lang.String> tracks) {
    this.tracks = tracks;
    return this;
  }

  @Override
  public ProductPolicy set(String fieldName, Object value) {
    return (ProductPolicy) super.set(fieldName, value);
  }

  @Override
  public ProductPolicy clone() {
    return (ProductPolicy) super.clone();
  }

}