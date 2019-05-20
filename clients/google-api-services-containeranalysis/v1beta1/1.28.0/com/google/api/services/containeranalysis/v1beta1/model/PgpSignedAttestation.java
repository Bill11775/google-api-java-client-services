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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * An attestation wrapper with a PGP-compatible signature. This message only supports `ATTACHED`
 * signatures, where the payload that is signed is included alongside the signature itself in the
 * same file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PgpSignedAttestation extends com.google.api.client.json.GenericJson {

  /**
   * Type (for example schema) of the attestation payload that was signed. The verifier must ensure
   * that the provided type is one that the verifier supports, and that the attestation payload is a
   * valid instantiation of that type (for example by validating a JSON schema).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentType;

  /**
   * The cryptographic fingerprint of the key used to generate the signature, as output by, e.g.
   * `gpg --list-keys`. This should be the version 4, full 160-bit fingerprint, expressed as a 40
   * character hexidecimal string. See https://tools.ietf.org/html/rfc4880#section-12.2 for details.
   * Implementations may choose to acknowledge "LONG", "SHORT", or other abbreviated key IDs, but
   * only the full fingerprint is guaranteed to work. In gpg, the full fingerprint can be retrieved
   * from the `fpr` field returned when calling --list-keys with --with-colons.  For example: ```
   * gpg --with-colons --with-fingerprint --force-v4-certs \     --list-keys attester@example.com
   * tru::1:1513631572:0:3:1:5 pub:...... fpr:::::::::24FF6481B76AC91E66A00AC657A93A81EF3AE6FB: ```
   * Above, the fingerprint is `24FF6481B76AC91E66A00AC657A93A81EF3AE6FB`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pgpKeyId;

  /**
   * Required. The raw content of the signature, as output by GNU Privacy Guard (GPG) or equivalent.
   * Since this message only supports attached signatures, the payload that was signed must be
   * attached. While the signature format supported is dependent on the verification implementation,
   * currently only ASCII-armored (`--armor` to gpg), non-clearsigned (`--sign` rather than
   * `--clearsign` to gpg) are supported. Concretely, `gpg --sign --armor --output=signature.gpg
   * payload.json` will create the signature content expected in this field in `signature.gpg` for
   * the `payload.json` attestation payload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String signature;

  /**
   * Type (for example schema) of the attestation payload that was signed. The verifier must ensure
   * that the provided type is one that the verifier supports, and that the attestation payload is a
   * valid instantiation of that type (for example by validating a JSON schema).
   * @return value or {@code null} for none
   */
  public java.lang.String getContentType() {
    return contentType;
  }

  /**
   * Type (for example schema) of the attestation payload that was signed. The verifier must ensure
   * that the provided type is one that the verifier supports, and that the attestation payload is a
   * valid instantiation of that type (for example by validating a JSON schema).
   * @param contentType contentType or {@code null} for none
   */
  public PgpSignedAttestation setContentType(java.lang.String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * The cryptographic fingerprint of the key used to generate the signature, as output by, e.g.
   * `gpg --list-keys`. This should be the version 4, full 160-bit fingerprint, expressed as a 40
   * character hexidecimal string. See https://tools.ietf.org/html/rfc4880#section-12.2 for details.
   * Implementations may choose to acknowledge "LONG", "SHORT", or other abbreviated key IDs, but
   * only the full fingerprint is guaranteed to work. In gpg, the full fingerprint can be retrieved
   * from the `fpr` field returned when calling --list-keys with --with-colons.  For example: ```
   * gpg --with-colons --with-fingerprint --force-v4-certs \     --list-keys attester@example.com
   * tru::1:1513631572:0:3:1:5 pub:...... fpr:::::::::24FF6481B76AC91E66A00AC657A93A81EF3AE6FB: ```
   * Above, the fingerprint is `24FF6481B76AC91E66A00AC657A93A81EF3AE6FB`.
   * @return value or {@code null} for none
   */
  public java.lang.String getPgpKeyId() {
    return pgpKeyId;
  }

  /**
   * The cryptographic fingerprint of the key used to generate the signature, as output by, e.g.
   * `gpg --list-keys`. This should be the version 4, full 160-bit fingerprint, expressed as a 40
   * character hexidecimal string. See https://tools.ietf.org/html/rfc4880#section-12.2 for details.
   * Implementations may choose to acknowledge "LONG", "SHORT", or other abbreviated key IDs, but
   * only the full fingerprint is guaranteed to work. In gpg, the full fingerprint can be retrieved
   * from the `fpr` field returned when calling --list-keys with --with-colons.  For example: ```
   * gpg --with-colons --with-fingerprint --force-v4-certs \     --list-keys attester@example.com
   * tru::1:1513631572:0:3:1:5 pub:...... fpr:::::::::24FF6481B76AC91E66A00AC657A93A81EF3AE6FB: ```
   * Above, the fingerprint is `24FF6481B76AC91E66A00AC657A93A81EF3AE6FB`.
   * @param pgpKeyId pgpKeyId or {@code null} for none
   */
  public PgpSignedAttestation setPgpKeyId(java.lang.String pgpKeyId) {
    this.pgpKeyId = pgpKeyId;
    return this;
  }

  /**
   * Required. The raw content of the signature, as output by GNU Privacy Guard (GPG) or equivalent.
   * Since this message only supports attached signatures, the payload that was signed must be
   * attached. While the signature format supported is dependent on the verification implementation,
   * currently only ASCII-armored (`--armor` to gpg), non-clearsigned (`--sign` rather than
   * `--clearsign` to gpg) are supported. Concretely, `gpg --sign --armor --output=signature.gpg
   * payload.json` will create the signature content expected in this field in `signature.gpg` for
   * the `payload.json` attestation payload.
   * @return value or {@code null} for none
   */
  public java.lang.String getSignature() {
    return signature;
  }

  /**
   * Required. The raw content of the signature, as output by GNU Privacy Guard (GPG) or equivalent.
   * Since this message only supports attached signatures, the payload that was signed must be
   * attached. While the signature format supported is dependent on the verification implementation,
   * currently only ASCII-armored (`--armor` to gpg), non-clearsigned (`--sign` rather than
   * `--clearsign` to gpg) are supported. Concretely, `gpg --sign --armor --output=signature.gpg
   * payload.json` will create the signature content expected in this field in `signature.gpg` for
   * the `payload.json` attestation payload.
   * @param signature signature or {@code null} for none
   */
  public PgpSignedAttestation setSignature(java.lang.String signature) {
    this.signature = signature;
    return this;
  }

  @Override
  public PgpSignedAttestation set(String fieldName, Object value) {
    return (PgpSignedAttestation) super.set(fieldName, value);
  }

  @Override
  public PgpSignedAttestation clone() {
    return (PgpSignedAttestation) super.clone();
  }

}