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

package com.google.adexchangebuyer2.v2beta1.model;

/**
 * Represents a list of targeted and excluded URLs (e.g google.com). For Private Auction and AdX
 * Preferred Deals, URLs are either included or excluded. For DFP Programmatic Guaranteed and
 * Preferred Deals, this doesn't apply.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UrlTargeting extends com.google.api.client.json.GenericJson {

  /**
   * A list of URLs to be excluded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> excludedUrls;

  /**
   * A list of URLs to be included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetedUrls;

  /**
   * A list of URLs to be excluded.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExcludedUrls() {
    return excludedUrls;
  }

  /**
   * A list of URLs to be excluded.
   * @param excludedUrls excludedUrls or {@code null} for none
   */
  public UrlTargeting setExcludedUrls(java.util.List<java.lang.String> excludedUrls) {
    this.excludedUrls = excludedUrls;
    return this;
  }

  /**
   * A list of URLs to be included.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetedUrls() {
    return targetedUrls;
  }

  /**
   * A list of URLs to be included.
   * @param targetedUrls targetedUrls or {@code null} for none
   */
  public UrlTargeting setTargetedUrls(java.util.List<java.lang.String> targetedUrls) {
    this.targetedUrls = targetedUrls;
    return this;
  }

  @Override
  public UrlTargeting set(String fieldName, Object value) {
    return (UrlTargeting) super.set(fieldName, value);
  }

  @Override
  public UrlTargeting clone() {
    return (UrlTargeting) super.clone();
  }

}
