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
 * Represents a targetable content instream position, which could be used by video and audio ads.
 * This will be populated in the content_instream_position_details field when targeting_type is
 * `TARGETING_TYPE_CONTENT_INSTREAM_POSITION`.
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
public final class ContentInstreamPositionTargetingOptionDetails extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The content instream position.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentInstreamPosition;

  /**
   * Output only. The content instream position.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentInstreamPosition() {
    return contentInstreamPosition;
  }

  /**
   * Output only. The content instream position.
   * @param contentInstreamPosition contentInstreamPosition or {@code null} for none
   */
  public ContentInstreamPositionTargetingOptionDetails setContentInstreamPosition(java.lang.String contentInstreamPosition) {
    this.contentInstreamPosition = contentInstreamPosition;
    return this;
  }

  @Override
  public ContentInstreamPositionTargetingOptionDetails set(String fieldName, Object value) {
    return (ContentInstreamPositionTargetingOptionDetails) super.set(fieldName, value);
  }

  @Override
  public ContentInstreamPositionTargetingOptionDetails clone() {
    return (ContentInstreamPositionTargetingOptionDetails) super.clone();
  }

}
