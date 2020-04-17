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
 * Targeting details for digital content label. This will be populated in the details field of an
 * AssignedTargetingOption when targeting_type is `TARGETING_TYPE_DIGITAL_CONTENT_LABEL_EXCLUSION`.
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
public final class DigitalContentLabelAssignedTargetingOptionDetails extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The display name of the digital content label rating tier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentRatingTier;

  /**
   * Required. ID of the digital content label to be EXCLUDED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String excludedTargetingOptionId;

  /**
   * Output only. The display name of the digital content label rating tier.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentRatingTier() {
    return contentRatingTier;
  }

  /**
   * Output only. The display name of the digital content label rating tier.
   * @param contentRatingTier contentRatingTier or {@code null} for none
   */
  public DigitalContentLabelAssignedTargetingOptionDetails setContentRatingTier(java.lang.String contentRatingTier) {
    this.contentRatingTier = contentRatingTier;
    return this;
  }

  /**
   * Required. ID of the digital content label to be EXCLUDED.
   * @return value or {@code null} for none
   */
  public java.lang.String getExcludedTargetingOptionId() {
    return excludedTargetingOptionId;
  }

  /**
   * Required. ID of the digital content label to be EXCLUDED.
   * @param excludedTargetingOptionId excludedTargetingOptionId or {@code null} for none
   */
  public DigitalContentLabelAssignedTargetingOptionDetails setExcludedTargetingOptionId(java.lang.String excludedTargetingOptionId) {
    this.excludedTargetingOptionId = excludedTargetingOptionId;
    return this;
  }

  @Override
  public DigitalContentLabelAssignedTargetingOptionDetails set(String fieldName, Object value) {
    return (DigitalContentLabelAssignedTargetingOptionDetails) super.set(fieldName, value);
  }

  @Override
  public DigitalContentLabelAssignedTargetingOptionDetails clone() {
    return (DigitalContentLabelAssignedTargetingOptionDetails) super.clone();
  }

}
