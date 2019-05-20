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

package com.google.api.services.vault.v1.model;

/**
 * Definition of the saved query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SavedQuery extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The server generated timestamp at which saved query was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Name of the saved query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. The matter id of the associated matter. The server does not look at this field
   * during create and always uses matter id in the URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String matterId;

  /**
   * The underlying Query object which contains all the information of the saved query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Query query;

  /**
   * A unique identifier for the saved query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String savedQueryId;

  /**
   * Output only. The server generated timestamp at which saved query was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The server generated timestamp at which saved query was created.
   * @param createTime createTime or {@code null} for none
   */
  public SavedQuery setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Name of the saved query.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Name of the saved query.
   * @param displayName displayName or {@code null} for none
   */
  public SavedQuery setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. The matter id of the associated matter. The server does not look at this field
   * during create and always uses matter id in the URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getMatterId() {
    return matterId;
  }

  /**
   * Output only. The matter id of the associated matter. The server does not look at this field
   * during create and always uses matter id in the URL.
   * @param matterId matterId or {@code null} for none
   */
  public SavedQuery setMatterId(java.lang.String matterId) {
    this.matterId = matterId;
    return this;
  }

  /**
   * The underlying Query object which contains all the information of the saved query.
   * @return value or {@code null} for none
   */
  public Query getQuery() {
    return query;
  }

  /**
   * The underlying Query object which contains all the information of the saved query.
   * @param query query or {@code null} for none
   */
  public SavedQuery setQuery(Query query) {
    this.query = query;
    return this;
  }

  /**
   * A unique identifier for the saved query.
   * @return value or {@code null} for none
   */
  public java.lang.String getSavedQueryId() {
    return savedQueryId;
  }

  /**
   * A unique identifier for the saved query.
   * @param savedQueryId savedQueryId or {@code null} for none
   */
  public SavedQuery setSavedQueryId(java.lang.String savedQueryId) {
    this.savedQueryId = savedQueryId;
    return this;
  }

  @Override
  public SavedQuery set(String fieldName, Object value) {
    return (SavedQuery) super.set(fieldName, value);
  }

  @Override
  public SavedQuery clone() {
    return (SavedQuery) super.clone();
  }

}