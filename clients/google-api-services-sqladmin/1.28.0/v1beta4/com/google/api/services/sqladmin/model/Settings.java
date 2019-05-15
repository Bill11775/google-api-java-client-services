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

package com.google.api.services.sqladmin.model;

/**
 * Database instance settings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Settings extends com.google.api.client.json.GenericJson {

  /**
   * The activation policy specifies when the instance is activated; it is applicable only when the
   * instance state is RUNNABLE. Valid values: ALWAYS: The instance is on, and remains so even in
   * the absence of connection requests. NEVER: The instance is off; it is not activated, even if a
   * connection request arrives. ON_DEMAND: First Generation instances only. The instance responds
   * to incoming requests, and turns itself off when not in use. Instances with PER_USE pricing turn
   * off after 15 minutes of inactivity. Instances with PER_PACKAGE pricing turn off after 12 hours
   * of inactivity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String activationPolicy;

  /**
   * The App Engine app IDs that can access this instance. First Generation instances only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> authorizedGaeApplications;

  /**
   * Availability type (PostgreSQL instances only). Potential values: ZONAL: The instance serves
   * data from only one zone. Outages in that zone affect data accessibility. REGIONAL: The instance
   * can serve data from more than one zone in a region (it is highly available). For more
   * information, see Overview of the High Availability Configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String availabilityType;

  /**
   * The daily backup configuration for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BackupConfiguration backupConfiguration;

  /**
   * Configuration specific to read replica instances. Indicates whether database flags for crash-
   * safe replication are enabled. This property is only applicable to First Generation instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean crashSafeReplicationEnabled;

  /**
   * The size of data disk, in GB. The data disk size minimum is 10GB. Not used for First Generation
   * instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dataDiskSizeGb;

  /**
   * The type of data disk: PD_SSD (default) or PD_HDD. Not used for First Generation instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataDiskType;

  /**
   * The database flags passed to the instance at startup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DatabaseFlags> databaseFlags;

  static {
    // hack to force ProGuard to consider DatabaseFlags used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DatabaseFlags.class);
  }

  /**
   * Configuration specific to read replica instances. Indicates whether replication is enabled or
   * not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean databaseReplicationEnabled;

  /**
   * The settings for IP Management. This allows to enable or disable the instance IP and manage
   * which external networks can connect to the instance. The IPv4 address cannot be disabled for
   * Second Generation instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IpConfiguration ipConfiguration;

  /**
   * This is always sql#settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The location preference settings. This allows the instance to be located as near as possible to
   * either an App Engine app or Compute Engine zone for better performance. App Engine co-location
   * is only applicable to First Generation instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LocationPreference locationPreference;

  /**
   * The maintenance window for this instance. This specifies when the instance can be restarted for
   * maintenance purposes. Not used for First Generation instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MaintenanceWindow maintenanceWindow;

  /**
   * The pricing plan for this instance. This can be either PER_USE or PACKAGE. Only PER_USE is
   * supported for Second Generation instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pricingPlan;

  /**
   * The type of replication this instance uses. This can be either ASYNCHRONOUS or SYNCHRONOUS.
   * This property is only applicable to First Generation instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String replicationType;

  /**
   * The version of instance settings. This is a required field for update method to make sure
   * concurrent updates are handled properly. During update, use the most recent settingsVersion
   * value for this instance and do not try to update this value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long settingsVersion;

  /**
   * Configuration to increase storage size automatically. The default value is true. Not used for
   * First Generation instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean storageAutoResize;

  /**
   * The maximum size to which storage capacity can be automatically increased. The default value is
   * 0, which specifies that there is no limit. Not used for First Generation instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long storageAutoResizeLimit;

  /**
   * The tier (or machine type) for this instance, for example db-n1-standard-1 (MySQL instances) or
   * db-custom-1-3840 (PostgreSQL instances). For MySQL instances, this property determines whether
   * the instance is First or Second Generation. For more information, see Instance Settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tier;

  /**
   * User-provided labels, represented as a dictionary where each label is a single key value pair.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> userLabels;

  /**
   * The activation policy specifies when the instance is activated; it is applicable only when the
   * instance state is RUNNABLE. Valid values: ALWAYS: The instance is on, and remains so even in
   * the absence of connection requests. NEVER: The instance is off; it is not activated, even if a
   * connection request arrives. ON_DEMAND: First Generation instances only. The instance responds
   * to incoming requests, and turns itself off when not in use. Instances with PER_USE pricing turn
   * off after 15 minutes of inactivity. Instances with PER_PACKAGE pricing turn off after 12 hours
   * of inactivity.
   * @return value or {@code null} for none
   */
  public java.lang.String getActivationPolicy() {
    return activationPolicy;
  }

  /**
   * The activation policy specifies when the instance is activated; it is applicable only when the
   * instance state is RUNNABLE. Valid values: ALWAYS: The instance is on, and remains so even in
   * the absence of connection requests. NEVER: The instance is off; it is not activated, even if a
   * connection request arrives. ON_DEMAND: First Generation instances only. The instance responds
   * to incoming requests, and turns itself off when not in use. Instances with PER_USE pricing turn
   * off after 15 minutes of inactivity. Instances with PER_PACKAGE pricing turn off after 12 hours
   * of inactivity.
   * @param activationPolicy activationPolicy or {@code null} for none
   */
  public Settings setActivationPolicy(java.lang.String activationPolicy) {
    this.activationPolicy = activationPolicy;
    return this;
  }

  /**
   * The App Engine app IDs that can access this instance. First Generation instances only.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAuthorizedGaeApplications() {
    return authorizedGaeApplications;
  }

  /**
   * The App Engine app IDs that can access this instance. First Generation instances only.
   * @param authorizedGaeApplications authorizedGaeApplications or {@code null} for none
   */
  public Settings setAuthorizedGaeApplications(java.util.List<java.lang.String> authorizedGaeApplications) {
    this.authorizedGaeApplications = authorizedGaeApplications;
    return this;
  }

  /**
   * Availability type (PostgreSQL instances only). Potential values: ZONAL: The instance serves
   * data from only one zone. Outages in that zone affect data accessibility. REGIONAL: The instance
   * can serve data from more than one zone in a region (it is highly available). For more
   * information, see Overview of the High Availability Configuration.
   * @return value or {@code null} for none
   */
  public java.lang.String getAvailabilityType() {
    return availabilityType;
  }

  /**
   * Availability type (PostgreSQL instances only). Potential values: ZONAL: The instance serves
   * data from only one zone. Outages in that zone affect data accessibility. REGIONAL: The instance
   * can serve data from more than one zone in a region (it is highly available). For more
   * information, see Overview of the High Availability Configuration.
   * @param availabilityType availabilityType or {@code null} for none
   */
  public Settings setAvailabilityType(java.lang.String availabilityType) {
    this.availabilityType = availabilityType;
    return this;
  }

  /**
   * The daily backup configuration for the instance.
   * @return value or {@code null} for none
   */
  public BackupConfiguration getBackupConfiguration() {
    return backupConfiguration;
  }

  /**
   * The daily backup configuration for the instance.
   * @param backupConfiguration backupConfiguration or {@code null} for none
   */
  public Settings setBackupConfiguration(BackupConfiguration backupConfiguration) {
    this.backupConfiguration = backupConfiguration;
    return this;
  }

  /**
   * Configuration specific to read replica instances. Indicates whether database flags for crash-
   * safe replication are enabled. This property is only applicable to First Generation instances.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCrashSafeReplicationEnabled() {
    return crashSafeReplicationEnabled;
  }

  /**
   * Configuration specific to read replica instances. Indicates whether database flags for crash-
   * safe replication are enabled. This property is only applicable to First Generation instances.
   * @param crashSafeReplicationEnabled crashSafeReplicationEnabled or {@code null} for none
   */
  public Settings setCrashSafeReplicationEnabled(java.lang.Boolean crashSafeReplicationEnabled) {
    this.crashSafeReplicationEnabled = crashSafeReplicationEnabled;
    return this;
  }

  /**
   * The size of data disk, in GB. The data disk size minimum is 10GB. Not used for First Generation
   * instances.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDataDiskSizeGb() {
    return dataDiskSizeGb;
  }

  /**
   * The size of data disk, in GB. The data disk size minimum is 10GB. Not used for First Generation
   * instances.
   * @param dataDiskSizeGb dataDiskSizeGb or {@code null} for none
   */
  public Settings setDataDiskSizeGb(java.lang.Long dataDiskSizeGb) {
    this.dataDiskSizeGb = dataDiskSizeGb;
    return this;
  }

  /**
   * The type of data disk: PD_SSD (default) or PD_HDD. Not used for First Generation instances.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataDiskType() {
    return dataDiskType;
  }

  /**
   * The type of data disk: PD_SSD (default) or PD_HDD. Not used for First Generation instances.
   * @param dataDiskType dataDiskType or {@code null} for none
   */
  public Settings setDataDiskType(java.lang.String dataDiskType) {
    this.dataDiskType = dataDiskType;
    return this;
  }

  /**
   * The database flags passed to the instance at startup.
   * @return value or {@code null} for none
   */
  public java.util.List<DatabaseFlags> getDatabaseFlags() {
    return databaseFlags;
  }

  /**
   * The database flags passed to the instance at startup.
   * @param databaseFlags databaseFlags or {@code null} for none
   */
  public Settings setDatabaseFlags(java.util.List<DatabaseFlags> databaseFlags) {
    this.databaseFlags = databaseFlags;
    return this;
  }

  /**
   * Configuration specific to read replica instances. Indicates whether replication is enabled or
   * not.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDatabaseReplicationEnabled() {
    return databaseReplicationEnabled;
  }

  /**
   * Configuration specific to read replica instances. Indicates whether replication is enabled or
   * not.
   * @param databaseReplicationEnabled databaseReplicationEnabled or {@code null} for none
   */
  public Settings setDatabaseReplicationEnabled(java.lang.Boolean databaseReplicationEnabled) {
    this.databaseReplicationEnabled = databaseReplicationEnabled;
    return this;
  }

  /**
   * The settings for IP Management. This allows to enable or disable the instance IP and manage
   * which external networks can connect to the instance. The IPv4 address cannot be disabled for
   * Second Generation instances.
   * @return value or {@code null} for none
   */
  public IpConfiguration getIpConfiguration() {
    return ipConfiguration;
  }

  /**
   * The settings for IP Management. This allows to enable or disable the instance IP and manage
   * which external networks can connect to the instance. The IPv4 address cannot be disabled for
   * Second Generation instances.
   * @param ipConfiguration ipConfiguration or {@code null} for none
   */
  public Settings setIpConfiguration(IpConfiguration ipConfiguration) {
    this.ipConfiguration = ipConfiguration;
    return this;
  }

  /**
   * This is always sql#settings.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#settings.
   * @param kind kind or {@code null} for none
   */
  public Settings setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The location preference settings. This allows the instance to be located as near as possible to
   * either an App Engine app or Compute Engine zone for better performance. App Engine co-location
   * is only applicable to First Generation instances.
   * @return value or {@code null} for none
   */
  public LocationPreference getLocationPreference() {
    return locationPreference;
  }

  /**
   * The location preference settings. This allows the instance to be located as near as possible to
   * either an App Engine app or Compute Engine zone for better performance. App Engine co-location
   * is only applicable to First Generation instances.
   * @param locationPreference locationPreference or {@code null} for none
   */
  public Settings setLocationPreference(LocationPreference locationPreference) {
    this.locationPreference = locationPreference;
    return this;
  }

  /**
   * The maintenance window for this instance. This specifies when the instance can be restarted for
   * maintenance purposes. Not used for First Generation instances.
   * @return value or {@code null} for none
   */
  public MaintenanceWindow getMaintenanceWindow() {
    return maintenanceWindow;
  }

  /**
   * The maintenance window for this instance. This specifies when the instance can be restarted for
   * maintenance purposes. Not used for First Generation instances.
   * @param maintenanceWindow maintenanceWindow or {@code null} for none
   */
  public Settings setMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

  /**
   * The pricing plan for this instance. This can be either PER_USE or PACKAGE. Only PER_USE is
   * supported for Second Generation instances.
   * @return value or {@code null} for none
   */
  public java.lang.String getPricingPlan() {
    return pricingPlan;
  }

  /**
   * The pricing plan for this instance. This can be either PER_USE or PACKAGE. Only PER_USE is
   * supported for Second Generation instances.
   * @param pricingPlan pricingPlan or {@code null} for none
   */
  public Settings setPricingPlan(java.lang.String pricingPlan) {
    this.pricingPlan = pricingPlan;
    return this;
  }

  /**
   * The type of replication this instance uses. This can be either ASYNCHRONOUS or SYNCHRONOUS.
   * This property is only applicable to First Generation instances.
   * @return value or {@code null} for none
   */
  public java.lang.String getReplicationType() {
    return replicationType;
  }

  /**
   * The type of replication this instance uses. This can be either ASYNCHRONOUS or SYNCHRONOUS.
   * This property is only applicable to First Generation instances.
   * @param replicationType replicationType or {@code null} for none
   */
  public Settings setReplicationType(java.lang.String replicationType) {
    this.replicationType = replicationType;
    return this;
  }

  /**
   * The version of instance settings. This is a required field for update method to make sure
   * concurrent updates are handled properly. During update, use the most recent settingsVersion
   * value for this instance and do not try to update this value.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSettingsVersion() {
    return settingsVersion;
  }

  /**
   * The version of instance settings. This is a required field for update method to make sure
   * concurrent updates are handled properly. During update, use the most recent settingsVersion
   * value for this instance and do not try to update this value.
   * @param settingsVersion settingsVersion or {@code null} for none
   */
  public Settings setSettingsVersion(java.lang.Long settingsVersion) {
    this.settingsVersion = settingsVersion;
    return this;
  }

  /**
   * Configuration to increase storage size automatically. The default value is true. Not used for
   * First Generation instances.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStorageAutoResize() {
    return storageAutoResize;
  }

  /**
   * Configuration to increase storage size automatically. The default value is true. Not used for
   * First Generation instances.
   * @param storageAutoResize storageAutoResize or {@code null} for none
   */
  public Settings setStorageAutoResize(java.lang.Boolean storageAutoResize) {
    this.storageAutoResize = storageAutoResize;
    return this;
  }

  /**
   * The maximum size to which storage capacity can be automatically increased. The default value is
   * 0, which specifies that there is no limit. Not used for First Generation instances.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStorageAutoResizeLimit() {
    return storageAutoResizeLimit;
  }

  /**
   * The maximum size to which storage capacity can be automatically increased. The default value is
   * 0, which specifies that there is no limit. Not used for First Generation instances.
   * @param storageAutoResizeLimit storageAutoResizeLimit or {@code null} for none
   */
  public Settings setStorageAutoResizeLimit(java.lang.Long storageAutoResizeLimit) {
    this.storageAutoResizeLimit = storageAutoResizeLimit;
    return this;
  }

  /**
   * The tier (or machine type) for this instance, for example db-n1-standard-1 (MySQL instances) or
   * db-custom-1-3840 (PostgreSQL instances). For MySQL instances, this property determines whether
   * the instance is First or Second Generation. For more information, see Instance Settings.
   * @return value or {@code null} for none
   */
  public java.lang.String getTier() {
    return tier;
  }

  /**
   * The tier (or machine type) for this instance, for example db-n1-standard-1 (MySQL instances) or
   * db-custom-1-3840 (PostgreSQL instances). For MySQL instances, this property determines whether
   * the instance is First or Second Generation. For more information, see Instance Settings.
   * @param tier tier or {@code null} for none
   */
  public Settings setTier(java.lang.String tier) {
    this.tier = tier;
    return this;
  }

  /**
   * User-provided labels, represented as a dictionary where each label is a single key value pair.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getUserLabels() {
    return userLabels;
  }

  /**
   * User-provided labels, represented as a dictionary where each label is a single key value pair.
   * @param userLabels userLabels or {@code null} for none
   */
  public Settings setUserLabels(java.util.Map<String, java.lang.String> userLabels) {
    this.userLabels = userLabels;
    return this;
  }

  @Override
  public Settings set(String fieldName, Object value) {
    return (Settings) super.set(fieldName, value);
  }

  @Override
  public Settings clone() {
    return (Settings) super.clone();
  }

}