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
 * The status related settings of the inventory source.
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
public final class InventorySourceStatus extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The configuration status of the inventory source.
   *
   * Only applicable for guaranteed inventory sources. Acceptable values are
   * `INVENTORY_SOURCE_CONFIG_STATUS_PENDING` and `INVENTORY_SOURCE_CONFIG_STATUS_COMPLETED`.
   *
   * An inventory source must be configured (fill in the required fields, choose creatives, and
   * select a default campaign) before it can serve.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String configStatus;

  /**
   * The user-provided reason for pausing this inventory source.
   *
   * Must not exceed 100 characters.
   *
   * Only applicable when entity_status is set to `ENTITY_STATUS_PAUSED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityPauseReason;

  /**
   * Whether or not the inventory source is servable.
   *
   * Acceptable values are `ENTITY_STATUS_ACTIVE`, `ENTITY_STATUS_ARCHIVED`, and
   * `ENTITY_STATUS_PAUSED`. Default value is `ENTITY_STATUS_ACTIVE`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityStatus;

  /**
   * Output only. The seller-provided reason for pausing this inventory source.
   *
   * Only applicable for inventory sources synced directly from the publishers and when
   * seller_status is set to `ENTITY_STATUS_PAUSED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sellerPauseReason;

  /**
   * Output only. The status set by the seller for the inventory source.
   *
   * Only applicable for inventory sources synced directly from the publishers. Acceptable values
   * are `ENTITY_STATUS_ACTIVE` and `ENTITY_STATUS_PAUSED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sellerStatus;

  /**
   * Output only. The configuration status of the inventory source.
   *
   * Only applicable for guaranteed inventory sources. Acceptable values are
   * `INVENTORY_SOURCE_CONFIG_STATUS_PENDING` and `INVENTORY_SOURCE_CONFIG_STATUS_COMPLETED`.
   *
   * An inventory source must be configured (fill in the required fields, choose creatives, and
   * select a default campaign) before it can serve.
   * @return value or {@code null} for none
   */
  public java.lang.String getConfigStatus() {
    return configStatus;
  }

  /**
   * Output only. The configuration status of the inventory source.
   *
   * Only applicable for guaranteed inventory sources. Acceptable values are
   * `INVENTORY_SOURCE_CONFIG_STATUS_PENDING` and `INVENTORY_SOURCE_CONFIG_STATUS_COMPLETED`.
   *
   * An inventory source must be configured (fill in the required fields, choose creatives, and
   * select a default campaign) before it can serve.
   * @param configStatus configStatus or {@code null} for none
   */
  public InventorySourceStatus setConfigStatus(java.lang.String configStatus) {
    this.configStatus = configStatus;
    return this;
  }

  /**
   * The user-provided reason for pausing this inventory source.
   *
   * Must not exceed 100 characters.
   *
   * Only applicable when entity_status is set to `ENTITY_STATUS_PAUSED`.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityPauseReason() {
    return entityPauseReason;
  }

  /**
   * The user-provided reason for pausing this inventory source.
   *
   * Must not exceed 100 characters.
   *
   * Only applicable when entity_status is set to `ENTITY_STATUS_PAUSED`.
   * @param entityPauseReason entityPauseReason or {@code null} for none
   */
  public InventorySourceStatus setEntityPauseReason(java.lang.String entityPauseReason) {
    this.entityPauseReason = entityPauseReason;
    return this;
  }

  /**
   * Whether or not the inventory source is servable.
   *
   * Acceptable values are `ENTITY_STATUS_ACTIVE`, `ENTITY_STATUS_ARCHIVED`, and
   * `ENTITY_STATUS_PAUSED`. Default value is `ENTITY_STATUS_ACTIVE`.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityStatus() {
    return entityStatus;
  }

  /**
   * Whether or not the inventory source is servable.
   *
   * Acceptable values are `ENTITY_STATUS_ACTIVE`, `ENTITY_STATUS_ARCHIVED`, and
   * `ENTITY_STATUS_PAUSED`. Default value is `ENTITY_STATUS_ACTIVE`.
   * @param entityStatus entityStatus or {@code null} for none
   */
  public InventorySourceStatus setEntityStatus(java.lang.String entityStatus) {
    this.entityStatus = entityStatus;
    return this;
  }

  /**
   * Output only. The seller-provided reason for pausing this inventory source.
   *
   * Only applicable for inventory sources synced directly from the publishers and when
   * seller_status is set to `ENTITY_STATUS_PAUSED`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSellerPauseReason() {
    return sellerPauseReason;
  }

  /**
   * Output only. The seller-provided reason for pausing this inventory source.
   *
   * Only applicable for inventory sources synced directly from the publishers and when
   * seller_status is set to `ENTITY_STATUS_PAUSED`.
   * @param sellerPauseReason sellerPauseReason or {@code null} for none
   */
  public InventorySourceStatus setSellerPauseReason(java.lang.String sellerPauseReason) {
    this.sellerPauseReason = sellerPauseReason;
    return this;
  }

  /**
   * Output only. The status set by the seller for the inventory source.
   *
   * Only applicable for inventory sources synced directly from the publishers. Acceptable values
   * are `ENTITY_STATUS_ACTIVE` and `ENTITY_STATUS_PAUSED`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSellerStatus() {
    return sellerStatus;
  }

  /**
   * Output only. The status set by the seller for the inventory source.
   *
   * Only applicable for inventory sources synced directly from the publishers. Acceptable values
   * are `ENTITY_STATUS_ACTIVE` and `ENTITY_STATUS_PAUSED`.
   * @param sellerStatus sellerStatus or {@code null} for none
   */
  public InventorySourceStatus setSellerStatus(java.lang.String sellerStatus) {
    this.sellerStatus = sellerStatus;
    return this;
  }

  @Override
  public InventorySourceStatus set(String fieldName, Object value) {
    return (InventorySourceStatus) super.set(fieldName, value);
  }

  @Override
  public InventorySourceStatus clone() {
    return (InventorySourceStatus) super.clone();
  }

}
