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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * Represents knowledge base resource.
 *
 * Note: resource `projects.agent.knowledgeBases` is deprecated, please use
 * `projects.knowledgeBases` instead.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1KnowledgeBase extends com.google.api.client.json.GenericJson {

  /**
   * Required. The display name of the knowledge base. The name must be 1024 bytes or less;
   * otherwise, the creation request fails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The knowledge base resource name. The name must be empty when creating a knowledge base.
   * Format: `projects//knowledgeBases/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The display name of the knowledge base. The name must be 1024 bytes or less;
   * otherwise, the creation request fails.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the knowledge base. The name must be 1024 bytes or less;
   * otherwise, the creation request fails.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1KnowledgeBase setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The knowledge base resource name. The name must be empty when creating a knowledge base.
   * Format: `projects//knowledgeBases/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The knowledge base resource name. The name must be empty when creating a knowledge base.
   * Format: `projects//knowledgeBases/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1KnowledgeBase setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1KnowledgeBase set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1KnowledgeBase) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1KnowledgeBase clone() {
    return (GoogleCloudDialogflowV2beta1KnowledgeBase) super.clone();
  }

}