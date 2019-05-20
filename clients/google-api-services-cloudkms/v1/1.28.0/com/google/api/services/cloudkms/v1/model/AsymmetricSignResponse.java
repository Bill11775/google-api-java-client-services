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

package com.google.api.services.cloudkms.v1.model;

/**
 * Response message for KeyManagementService.AsymmetricSign.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Key Management Service (KMS) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AsymmetricSignResponse extends com.google.api.client.json.GenericJson {

  /**
   * The created signature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String signature;

  /**
   * The created signature.
   * @see #decodeSignature()
   * @return value or {@code null} for none
   */
  public java.lang.String getSignature() {
    return signature;
  }

  /**
   * The created signature.
   * @see #getSignature()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeSignature() {
    return com.google.api.client.util.Base64.decodeBase64(signature);
  }

  /**
   * The created signature.
   * @see #encodeSignature()
   * @param signature signature or {@code null} for none
   */
  public AsymmetricSignResponse setSignature(java.lang.String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * The created signature.
   * @see #setSignature()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public AsymmetricSignResponse encodeSignature(byte[] signature) {
    this.signature = com.google.api.client.util.Base64.encodeBase64URLSafeString(signature);
    return this;
  }

  @Override
  public AsymmetricSignResponse set(String fieldName, Object value) {
    return (AsymmetricSignResponse) super.set(fieldName, value);
  }

  @Override
  public AsymmetricSignResponse clone() {
    return (AsymmetricSignResponse) super.clone();
  }

}