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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Response for successful Annotation store evaluation operations. This structure is included in the
 * response upon operation completion.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EvaluateAnnotationStoreResponse extends com.google.api.client.json.GenericJson {

  /**
   * The evaluated Annotation store, in the format of `projects/{project_id}/locations/{location_id}
   * /datasets/{dataset_id}/annotationStores/{annotation_store_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String evalStore;

  /**
   * The number of Annotations in the ground truth Annotation store successfully processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long goldenCount;

  /**
   * The ground truth Annotation store, in the format of `projects/{project_id}/locations/{location_
   * id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String goldenStore;

  /**
   * The number of Annotations in the eval store that match with corresponding annotations in the
   * ground truth Annotation store. Two matched annotations both annotate the same resource defined
   * in AnnotationSource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long matchedCount;

  /**
   * The evaluated Annotation store, in the format of `projects/{project_id}/locations/{location_id}
   * /datasets/{dataset_id}/annotationStores/{annotation_store_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getEvalStore() {
    return evalStore;
  }

  /**
   * The evaluated Annotation store, in the format of `projects/{project_id}/locations/{location_id}
   * /datasets/{dataset_id}/annotationStores/{annotation_store_id}`.
   * @param evalStore evalStore or {@code null} for none
   */
  public EvaluateAnnotationStoreResponse setEvalStore(java.lang.String evalStore) {
    this.evalStore = evalStore;
    return this;
  }

  /**
   * The number of Annotations in the ground truth Annotation store successfully processed.
   * @return value or {@code null} for none
   */
  public java.lang.Long getGoldenCount() {
    return goldenCount;
  }

  /**
   * The number of Annotations in the ground truth Annotation store successfully processed.
   * @param goldenCount goldenCount or {@code null} for none
   */
  public EvaluateAnnotationStoreResponse setGoldenCount(java.lang.Long goldenCount) {
    this.goldenCount = goldenCount;
    return this;
  }

  /**
   * The ground truth Annotation store, in the format of `projects/{project_id}/locations/{location_
   * id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoldenStore() {
    return goldenStore;
  }

  /**
   * The ground truth Annotation store, in the format of `projects/{project_id}/locations/{location_
   * id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}`.
   * @param goldenStore goldenStore or {@code null} for none
   */
  public EvaluateAnnotationStoreResponse setGoldenStore(java.lang.String goldenStore) {
    this.goldenStore = goldenStore;
    return this;
  }

  /**
   * The number of Annotations in the eval store that match with corresponding annotations in the
   * ground truth Annotation store. Two matched annotations both annotate the same resource defined
   * in AnnotationSource.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMatchedCount() {
    return matchedCount;
  }

  /**
   * The number of Annotations in the eval store that match with corresponding annotations in the
   * ground truth Annotation store. Two matched annotations both annotate the same resource defined
   * in AnnotationSource.
   * @param matchedCount matchedCount or {@code null} for none
   */
  public EvaluateAnnotationStoreResponse setMatchedCount(java.lang.Long matchedCount) {
    this.matchedCount = matchedCount;
    return this;
  }

  @Override
  public EvaluateAnnotationStoreResponse set(String fieldName, Object value) {
    return (EvaluateAnnotationStoreResponse) super.set(fieldName, value);
  }

  @Override
  public EvaluateAnnotationStoreResponse clone() {
    return (EvaluateAnnotationStoreResponse) super.clone();
  }

}
