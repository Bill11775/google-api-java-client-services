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

package com.google.api.services.displayvideo.v1.model;

/**
 * Settings that control how partner revenue is calculated.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PartnerRevenueModel extends com.google.api.client.json.GenericJson {

  /**
   * Required. The markup amount of the partner revenue model. Must be greater than or equal to 0.
   *
   * * When the markup_type is set to be `PARTNER_REVENUE_MODEL_MARKUP_TYPE_CPM`, this field
   * represents the CPM markup in micros of advertiser's currency. For example, 1500000 represents
   * 1.5 standard units of the currency. * When the markup_type is set to be
   * `PARTNER_REVENUE_MODEL_MARKUP_TYPE_MEDIA_COST_MARKUP`, this field represents the media cost
   * percent markup in millis. For example, 100 represents 0.1% (decimal 0.001). * When the
   * markup_type is set to be `PARTNER_REVENUE_MODEL_MARKUP_TYPE_TOTAL_MEDIA_COST_MARKUP`, this
   * field represents the total media cost percent markup in millis. For example, 100 represents
   * 0.1% (decimal 0.001).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long markupAmount;

  /**
   * Required. The markup type of the partner revenue model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String markupType;

  /**
   * Required. The markup amount of the partner revenue model. Must be greater than or equal to 0.
   *
   * * When the markup_type is set to be `PARTNER_REVENUE_MODEL_MARKUP_TYPE_CPM`, this field
   * represents the CPM markup in micros of advertiser's currency. For example, 1500000 represents
   * 1.5 standard units of the currency. * When the markup_type is set to be
   * `PARTNER_REVENUE_MODEL_MARKUP_TYPE_MEDIA_COST_MARKUP`, this field represents the media cost
   * percent markup in millis. For example, 100 represents 0.1% (decimal 0.001). * When the
   * markup_type is set to be `PARTNER_REVENUE_MODEL_MARKUP_TYPE_TOTAL_MEDIA_COST_MARKUP`, this
   * field represents the total media cost percent markup in millis. For example, 100 represents
   * 0.1% (decimal 0.001).
   * @return value or {@code null} for none
   */
  public java.lang.Long getMarkupAmount() {
    return markupAmount;
  }

  /**
   * Required. The markup amount of the partner revenue model. Must be greater than or equal to 0.
   *
   * * When the markup_type is set to be `PARTNER_REVENUE_MODEL_MARKUP_TYPE_CPM`, this field
   * represents the CPM markup in micros of advertiser's currency. For example, 1500000 represents
   * 1.5 standard units of the currency. * When the markup_type is set to be
   * `PARTNER_REVENUE_MODEL_MARKUP_TYPE_MEDIA_COST_MARKUP`, this field represents the media cost
   * percent markup in millis. For example, 100 represents 0.1% (decimal 0.001). * When the
   * markup_type is set to be `PARTNER_REVENUE_MODEL_MARKUP_TYPE_TOTAL_MEDIA_COST_MARKUP`, this
   * field represents the total media cost percent markup in millis. For example, 100 represents
   * 0.1% (decimal 0.001).
   * @param markupAmount markupAmount or {@code null} for none
   */
  public PartnerRevenueModel setMarkupAmount(java.lang.Long markupAmount) {
    this.markupAmount = markupAmount;
    return this;
  }

  /**
   * Required. The markup type of the partner revenue model.
   * @return value or {@code null} for none
   */
  public java.lang.String getMarkupType() {
    return markupType;
  }

  /**
   * Required. The markup type of the partner revenue model.
   * @param markupType markupType or {@code null} for none
   */
  public PartnerRevenueModel setMarkupType(java.lang.String markupType) {
    this.markupType = markupType;
    return this;
  }

  @Override
  public PartnerRevenueModel set(String fieldName, Object value) {
    return (PartnerRevenueModel) super.set(fieldName, value);
  }

  @Override
  public PartnerRevenueModel clone() {
    return (PartnerRevenueModel) super.clone();
  }

}
