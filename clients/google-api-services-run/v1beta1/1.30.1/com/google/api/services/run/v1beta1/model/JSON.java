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

package com.google.api.services.run.v1beta1.model;

/**
 * JSON represents any valid JSON value. These types are supported: bool, int64, float64, string,
 * []interface{}, map[string]interface{} and nil.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JSON extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String raw;

  /**
   * @see #decodeRaw()
   * @return value or {@code null} for none
   */
  public java.lang.String getRaw() {
    return raw;
  }

  /**

   * @see #getRaw()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeRaw() {
    return com.google.api.client.util.Base64.decodeBase64(raw);
  }

  /**
   * @see #encodeRaw()
   * @param raw raw or {@code null} for none
   */
  public JSON setRaw(java.lang.String raw) {
    this.raw = raw;
    return this;
  }

  /**

   * @see #setRaw()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public JSON encodeRaw(byte[] raw) {
    this.raw = com.google.api.client.util.Base64.encodeBase64URLSafeString(raw);
    return this;
  }

  @Override
  public JSON set(String fieldName, Object value) {
    return (JSON) super.set(fieldName, value);
  }

  @Override
  public JSON clone() {
    return (JSON) super.clone();
  }

}
