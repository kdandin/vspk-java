/*
  Copyright (c) 2015, Alcatel-Lucent Inc
  All rights reserved.

  Redistribution and use in source and binary forms, with or without
  modification, are permitted provided that the following conditions are met:
      * Redistributions of source code must retain the above copyright
        notice, this list of conditions and the following disclaimer.
      * Redistributions in binary form must reproduce the above copyright
        notice, this list of conditions and the following disclaimer in the
        documentation and/or other materials provided with the distribution.
      * Neither the name of the copyright holder nor the names of its contributors
        may be used to endorse or promote products derived from this software without
        specific prior written permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY
  DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
  (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package net.nuagenetworks.vspk.v3_2;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v3_2.fetchers.PATNATPoolsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.PermissionsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.InfrastructureConfigsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.LocationsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.BootstrapsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.BootstrapActivationsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.NSPortsFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "nsgateway", resourceName = "nsgateways")
public class NSGateway extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum PermittedAction { ALL, DEPLOY, EXTEND, INSTANTIATE, READ, USE };
   public enum Personality { DC7X50, HARDWARE_VTEP, NSG, OTHER, VRSG, VSA, VSG };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum ConfigurationReloadState { APPLIED, PENDING, SENT, UNKNOWN };
   public enum ConfigurationStatus { FAILURE, SUCCESS, UNKNOWN };
   public enum BootstrapStatus { ACTIVE, CERTIFICATE_SIGNED, INACTIVE, NOTIFICATION_APP_REQ_ACK, NOTIFICATION_APP_REQ_SENT };

   
   @JsonProperty(value = "NATTraversalEnabled")
   protected Boolean NATTraversalEnabled;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "datapathID")
   protected String datapathID;
   
   @JsonProperty(value = "redundancyGroupID")
   protected String redundancyGroupID;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   
   @JsonProperty(value = "pending")
   protected Boolean pending;
   
   @JsonProperty(value = "permittedAction")
   protected PermittedAction permittedAction;
   
   @JsonProperty(value = "personality")
   protected Personality personality;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "enterpriseID")
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "locationID")
   protected String locationID;
   
   @JsonProperty(value = "configurationReloadState")
   protected ConfigurationReloadState configurationReloadState;
   
   @JsonProperty(value = "configurationStatus")
   protected ConfigurationStatus configurationStatus;
   
   @JsonProperty(value = "bootstrapID")
   protected String bootstrapID;
   
   @JsonProperty(value = "bootstrapStatus")
   protected BootstrapStatus bootstrapStatus;
   
   @JsonProperty(value = "associatedGatewaySecurityID")
   protected String associatedGatewaySecurityID;
   
   @JsonProperty(value = "associatedGatewaySecurityProfileID")
   protected String associatedGatewaySecurityProfileID;
   
   @JsonProperty(value = "autoDiscGatewayID")
   protected String autoDiscGatewayID;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "systemID")
   protected String systemID;
   

   
   @JsonIgnore
   private PATNATPoolsFetcher pATNATPools;
   
   @JsonIgnore
   private PermissionsFetcher permissions;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private InfrastructureConfigsFetcher infrastructureConfigs;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private LocationsFetcher locations;
   
   @JsonIgnore
   private BootstrapsFetcher bootstraps;
   
   @JsonIgnore
   private BootstrapActivationsFetcher bootstrapActivations;
   
   @JsonIgnore
   private NSPortsFetcher nSPorts;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public NSGateway() {
      
      pATNATPools = new PATNATPoolsFetcher(this);
      
      permissions = new PermissionsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      alarms = new AlarmsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      infrastructureConfigs = new InfrastructureConfigsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      locations = new LocationsFetcher(this);
      
      bootstraps = new BootstrapsFetcher(this);
      
      bootstrapActivations = new BootstrapActivationsFetcher(this);
      
      nSPorts = new NSPortsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   @JsonIgnore
   public Boolean getNATTraversalEnabled() {
      return NATTraversalEnabled;
   }

   @JsonIgnore
   public void setNATTraversalEnabled(Boolean value) { 
      this.NATTraversalEnabled = value;
   }
   @JsonIgnore
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
   }
   @JsonIgnore
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   @JsonIgnore
   public String getDatapathID() {
      return datapathID;
   }

   @JsonIgnore
   public void setDatapathID(String value) { 
      this.datapathID = value;
   }
   @JsonIgnore
   public String getRedundancyGroupID() {
      return redundancyGroupID;
   }

   @JsonIgnore
   public void setRedundancyGroupID(String value) { 
      this.redundancyGroupID = value;
   }
   @JsonIgnore
   public String getTemplateID() {
      return templateID;
   }

   @JsonIgnore
   public void setTemplateID(String value) { 
      this.templateID = value;
   }
   @JsonIgnore
   public Boolean getPending() {
      return pending;
   }

   @JsonIgnore
   public void setPending(Boolean value) { 
      this.pending = value;
   }
   @JsonIgnore
   public PermittedAction getPermittedAction() {
      return permittedAction;
   }

   @JsonIgnore
   public void setPermittedAction(PermittedAction value) { 
      this.permittedAction = value;
   }
   @JsonIgnore
   public Personality getPersonality() {
      return personality;
   }

   @JsonIgnore
   public void setPersonality(Personality value) { 
      this.personality = value;
   }
   @JsonIgnore
   public String getDescription() {
      return description;
   }

   @JsonIgnore
   public void setDescription(String value) { 
      this.description = value;
   }
   @JsonIgnore
   public String getEnterpriseID() {
      return enterpriseID;
   }

   @JsonIgnore
   public void setEnterpriseID(String value) { 
      this.enterpriseID = value;
   }
   @JsonIgnore
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   @JsonIgnore
   public String getLocationID() {
      return locationID;
   }

   @JsonIgnore
   public void setLocationID(String value) { 
      this.locationID = value;
   }
   @JsonIgnore
   public ConfigurationReloadState getConfigurationReloadState() {
      return configurationReloadState;
   }

   @JsonIgnore
   public void setConfigurationReloadState(ConfigurationReloadState value) { 
      this.configurationReloadState = value;
   }
   @JsonIgnore
   public ConfigurationStatus getConfigurationStatus() {
      return configurationStatus;
   }

   @JsonIgnore
   public void setConfigurationStatus(ConfigurationStatus value) { 
      this.configurationStatus = value;
   }
   @JsonIgnore
   public String getBootstrapID() {
      return bootstrapID;
   }

   @JsonIgnore
   public void setBootstrapID(String value) { 
      this.bootstrapID = value;
   }
   @JsonIgnore
   public BootstrapStatus getBootstrapStatus() {
      return bootstrapStatus;
   }

   @JsonIgnore
   public void setBootstrapStatus(BootstrapStatus value) { 
      this.bootstrapStatus = value;
   }
   @JsonIgnore
   public String getAssociatedGatewaySecurityID() {
      return associatedGatewaySecurityID;
   }

   @JsonIgnore
   public void setAssociatedGatewaySecurityID(String value) { 
      this.associatedGatewaySecurityID = value;
   }
   @JsonIgnore
   public String getAssociatedGatewaySecurityProfileID() {
      return associatedGatewaySecurityProfileID;
   }

   @JsonIgnore
   public void setAssociatedGatewaySecurityProfileID(String value) { 
      this.associatedGatewaySecurityProfileID = value;
   }
   @JsonIgnore
   public String getAutoDiscGatewayID() {
      return autoDiscGatewayID;
   }

   @JsonIgnore
   public void setAutoDiscGatewayID(String value) { 
      this.autoDiscGatewayID = value;
   }
   @JsonIgnore
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
   }
   @JsonIgnore
   public String getSystemID() {
      return systemID;
   }

   @JsonIgnore
   public void setSystemID(String value) { 
      this.systemID = value;
   }
   

   
   @JsonIgnore
   public PATNATPoolsFetcher getPATNATPools() {
      return pATNATPools;
   }
   
   @JsonIgnore
   public PermissionsFetcher getPermissions() {
      return permissions;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public InfrastructureConfigsFetcher getInfrastructureConfigs() {
      return infrastructureConfigs;
   }
   
   @JsonIgnore
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   
   @JsonIgnore
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public LocationsFetcher getLocations() {
      return locations;
   }
   
   @JsonIgnore
   public BootstrapsFetcher getBootstraps() {
      return bootstraps;
   }
   
   @JsonIgnore
   public BootstrapActivationsFetcher getBootstrapActivations() {
      return bootstrapActivations;
   }
   
   @JsonIgnore
   public NSPortsFetcher getNSPorts() {
      return nSPorts;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "NSGateway [" + "NATTraversalEnabled=" + NATTraversalEnabled + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", datapathID=" + datapathID + ", redundancyGroupID=" + redundancyGroupID + ", templateID=" + templateID + ", pending=" + pending + ", permittedAction=" + permittedAction + ", personality=" + personality + ", description=" + description + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", locationID=" + locationID + ", configurationReloadState=" + configurationReloadState + ", configurationStatus=" + configurationStatus + ", bootstrapID=" + bootstrapID + ", bootstrapStatus=" + bootstrapStatus + ", associatedGatewaySecurityID=" + associatedGatewaySecurityID + ", associatedGatewaySecurityProfileID=" + associatedGatewaySecurityProfileID + ", autoDiscGatewayID=" + autoDiscGatewayID + ", externalID=" + externalID + ", systemID=" + systemID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}