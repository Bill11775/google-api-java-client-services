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

package com.google.api.services.docs.v1.model;

/**
 * An embedded object in the document.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EmbeddedObject extends com.google.api.client.json.GenericJson {

  /**
   * The description of the embedded object. The `title` and `description` are both combined to
   * display alt text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The properties of an embedded drawing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EmbeddedDrawingProperties embeddedDrawingProperties;

  /**
   * The border of the embedded object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EmbeddedObjectBorder embeddedObjectBorder;

  /**
   * The properties of an image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageProperties imageProperties;

  /**
   * A reference to the external linked source content. For example, it contains a reference to the
   * source Sheets chart when the embedded object is a linked chart.
   *
   * If unset, then the embedded object is not linked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LinkedContentReference linkedContentReference;

  /**
   * The bottom margin of the embedded object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginBottom;

  /**
   * The left margin of the embedded object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginLeft;

  /**
   * The right margin of the embedded object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginRight;

  /**
   * The top margin of the embedded object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension marginTop;

  /**
   * The size of the embedded object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Size size;

  /**
   * The title of the embedded object. The `title` and `description` are both combined to display
   * alt text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The description of the embedded object. The `title` and `description` are both combined to
   * display alt text.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the embedded object. The `title` and `description` are both combined to
   * display alt text.
   * @param description description or {@code null} for none
   */
  public EmbeddedObject setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The properties of an embedded drawing.
   * @return value or {@code null} for none
   */
  public EmbeddedDrawingProperties getEmbeddedDrawingProperties() {
    return embeddedDrawingProperties;
  }

  /**
   * The properties of an embedded drawing.
   * @param embeddedDrawingProperties embeddedDrawingProperties or {@code null} for none
   */
  public EmbeddedObject setEmbeddedDrawingProperties(EmbeddedDrawingProperties embeddedDrawingProperties) {
    this.embeddedDrawingProperties = embeddedDrawingProperties;
    return this;
  }

  /**
   * The border of the embedded object.
   * @return value or {@code null} for none
   */
  public EmbeddedObjectBorder getEmbeddedObjectBorder() {
    return embeddedObjectBorder;
  }

  /**
   * The border of the embedded object.
   * @param embeddedObjectBorder embeddedObjectBorder or {@code null} for none
   */
  public EmbeddedObject setEmbeddedObjectBorder(EmbeddedObjectBorder embeddedObjectBorder) {
    this.embeddedObjectBorder = embeddedObjectBorder;
    return this;
  }

  /**
   * The properties of an image.
   * @return value or {@code null} for none
   */
  public ImageProperties getImageProperties() {
    return imageProperties;
  }

  /**
   * The properties of an image.
   * @param imageProperties imageProperties or {@code null} for none
   */
  public EmbeddedObject setImageProperties(ImageProperties imageProperties) {
    this.imageProperties = imageProperties;
    return this;
  }

  /**
   * A reference to the external linked source content. For example, it contains a reference to the
   * source Sheets chart when the embedded object is a linked chart.
   *
   * If unset, then the embedded object is not linked.
   * @return value or {@code null} for none
   */
  public LinkedContentReference getLinkedContentReference() {
    return linkedContentReference;
  }

  /**
   * A reference to the external linked source content. For example, it contains a reference to the
   * source Sheets chart when the embedded object is a linked chart.
   *
   * If unset, then the embedded object is not linked.
   * @param linkedContentReference linkedContentReference or {@code null} for none
   */
  public EmbeddedObject setLinkedContentReference(LinkedContentReference linkedContentReference) {
    this.linkedContentReference = linkedContentReference;
    return this;
  }

  /**
   * The bottom margin of the embedded object.
   * @return value or {@code null} for none
   */
  public Dimension getMarginBottom() {
    return marginBottom;
  }

  /**
   * The bottom margin of the embedded object.
   * @param marginBottom marginBottom or {@code null} for none
   */
  public EmbeddedObject setMarginBottom(Dimension marginBottom) {
    this.marginBottom = marginBottom;
    return this;
  }

  /**
   * The left margin of the embedded object.
   * @return value or {@code null} for none
   */
  public Dimension getMarginLeft() {
    return marginLeft;
  }

  /**
   * The left margin of the embedded object.
   * @param marginLeft marginLeft or {@code null} for none
   */
  public EmbeddedObject setMarginLeft(Dimension marginLeft) {
    this.marginLeft = marginLeft;
    return this;
  }

  /**
   * The right margin of the embedded object.
   * @return value or {@code null} for none
   */
  public Dimension getMarginRight() {
    return marginRight;
  }

  /**
   * The right margin of the embedded object.
   * @param marginRight marginRight or {@code null} for none
   */
  public EmbeddedObject setMarginRight(Dimension marginRight) {
    this.marginRight = marginRight;
    return this;
  }

  /**
   * The top margin of the embedded object.
   * @return value or {@code null} for none
   */
  public Dimension getMarginTop() {
    return marginTop;
  }

  /**
   * The top margin of the embedded object.
   * @param marginTop marginTop or {@code null} for none
   */
  public EmbeddedObject setMarginTop(Dimension marginTop) {
    this.marginTop = marginTop;
    return this;
  }

  /**
   * The size of the embedded object.
   * @return value or {@code null} for none
   */
  public Size getSize() {
    return size;
  }

  /**
   * The size of the embedded object.
   * @param size size or {@code null} for none
   */
  public EmbeddedObject setSize(Size size) {
    this.size = size;
    return this;
  }

  /**
   * The title of the embedded object. The `title` and `description` are both combined to display
   * alt text.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the embedded object. The `title` and `description` are both combined to display
   * alt text.
   * @param title title or {@code null} for none
   */
  public EmbeddedObject setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public EmbeddedObject set(String fieldName, Object value) {
    return (EmbeddedObject) super.set(fieldName, value);
  }

  @Override
  public EmbeddedObject clone() {
    return (EmbeddedObject) super.clone();
  }

}