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
 * Settings that control the rate at which a budget is spent.
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
public final class Pacing extends com.google.api.client.json.GenericJson {

  /**
   * Maximum number of impressions to serve every day.
   *
   * Applicable when the budget is impression based. Must be greater than 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dailyMaxImpressions;

  /**
   * Maximum currency amount to spend every day in micros of advertiser's currency.
   *
   * Applicable when the budget is currency based. Must be greater than 0. For example, for 1.5
   * standard unit of the currency, set this field to 1500000.
   *
   * The value assigned will be rounded to whole billable units for the relevant currency by the
   * following rules: any positive value less than a single billable unit will be rounded up to one
   * billable unit and any value larger than a single billable unit will be rounded down to the
   * nearest billable value. For example, if the currency's billable unit is 0.01, and this field is
   * set to 10257770, it will round down to 10250000, a value of 10.25. If set to 505, it will round
   * up to 10000, a value of 0.01.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dailyMaxMicros;

  /**
   * Required. The time period in which the pacing budget will be spent.
   *
   * When automatic budget allocation is enabled at the insertion order via auto_budget_allocation,
   * this field is output only and defaults to `PACING_PERIOD_FLIGHT`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pacingPeriod;

  /**
   * Required. The type of pacing that defines how the budget amount will be spent across the
   * pacing_period.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pacingType;

  /**
   * Maximum number of impressions to serve every day.
   *
   * Applicable when the budget is impression based. Must be greater than 0.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDailyMaxImpressions() {
    return dailyMaxImpressions;
  }

  /**
   * Maximum number of impressions to serve every day.
   *
   * Applicable when the budget is impression based. Must be greater than 0.
   * @param dailyMaxImpressions dailyMaxImpressions or {@code null} for none
   */
  public Pacing setDailyMaxImpressions(java.lang.Long dailyMaxImpressions) {
    this.dailyMaxImpressions = dailyMaxImpressions;
    return this;
  }

  /**
   * Maximum currency amount to spend every day in micros of advertiser's currency.
   *
   * Applicable when the budget is currency based. Must be greater than 0. For example, for 1.5
   * standard unit of the currency, set this field to 1500000.
   *
   * The value assigned will be rounded to whole billable units for the relevant currency by the
   * following rules: any positive value less than a single billable unit will be rounded up to one
   * billable unit and any value larger than a single billable unit will be rounded down to the
   * nearest billable value. For example, if the currency's billable unit is 0.01, and this field is
   * set to 10257770, it will round down to 10250000, a value of 10.25. If set to 505, it will round
   * up to 10000, a value of 0.01.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDailyMaxMicros() {
    return dailyMaxMicros;
  }

  /**
   * Maximum currency amount to spend every day in micros of advertiser's currency.
   *
   * Applicable when the budget is currency based. Must be greater than 0. For example, for 1.5
   * standard unit of the currency, set this field to 1500000.
   *
   * The value assigned will be rounded to whole billable units for the relevant currency by the
   * following rules: any positive value less than a single billable unit will be rounded up to one
   * billable unit and any value larger than a single billable unit will be rounded down to the
   * nearest billable value. For example, if the currency's billable unit is 0.01, and this field is
   * set to 10257770, it will round down to 10250000, a value of 10.25. If set to 505, it will round
   * up to 10000, a value of 0.01.
   * @param dailyMaxMicros dailyMaxMicros or {@code null} for none
   */
  public Pacing setDailyMaxMicros(java.lang.Long dailyMaxMicros) {
    this.dailyMaxMicros = dailyMaxMicros;
    return this;
  }

  /**
   * Required. The time period in which the pacing budget will be spent.
   *
   * When automatic budget allocation is enabled at the insertion order via auto_budget_allocation,
   * this field is output only and defaults to `PACING_PERIOD_FLIGHT`.
   * @return value or {@code null} for none
   */
  public java.lang.String getPacingPeriod() {
    return pacingPeriod;
  }

  /**
   * Required. The time period in which the pacing budget will be spent.
   *
   * When automatic budget allocation is enabled at the insertion order via auto_budget_allocation,
   * this field is output only and defaults to `PACING_PERIOD_FLIGHT`.
   * @param pacingPeriod pacingPeriod or {@code null} for none
   */
  public Pacing setPacingPeriod(java.lang.String pacingPeriod) {
    this.pacingPeriod = pacingPeriod;
    return this;
  }

  /**
   * Required. The type of pacing that defines how the budget amount will be spent across the
   * pacing_period.
   * @return value or {@code null} for none
   */
  public java.lang.String getPacingType() {
    return pacingType;
  }

  /**
   * Required. The type of pacing that defines how the budget amount will be spent across the
   * pacing_period.
   * @param pacingType pacingType or {@code null} for none
   */
  public Pacing setPacingType(java.lang.String pacingType) {
    this.pacingType = pacingType;
    return this;
  }

  @Override
  public Pacing set(String fieldName, Object value) {
    return (Pacing) super.set(fieldName, value);
  }

  @Override
  public Pacing clone() {
    return (Pacing) super.clone();
  }

}
