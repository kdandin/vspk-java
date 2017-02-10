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

package net.nuagenetworks.vspk.v4_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.NSPortTemplatesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "nsgatewaytemplate", resourceName = "nsgatewaytemplates")
public class NSGatewayTemplate extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum SSHService { DISABLED, ENABLED };
   public enum Personality { NSG, NSGBR };
   public enum InstanceSSHOverride { ALLOWED, DISALLOWED };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "SSHService")
   protected SSHService SSHService;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "personality")
   protected Personality personality;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "infrastructureAccessProfileID")
   protected String infrastructureAccessProfileID;
   
   @JsonProperty(value = "infrastructureProfileID")
   protected String infrastructureProfileID;
   
   @JsonProperty(value = "instanceSSHOverride")
   protected InstanceSSHOverride instanceSSHOverride;
   
   @JsonProperty(value = "enterpriseID")
   protected String enterpriseID;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private NSPortTemplatesFetcher nSPortTemplates;
   

   public NSGatewayTemplate() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      nSPortTemplates = new NSPortTemplatesFetcher(this);
      
   }

   @JsonIgnore
   public SSHService getSSHService() {
      return SSHService;
   }

   @JsonIgnore
   public void setSSHService(SSHService value) { 
      this.SSHService = value;
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
   public String getInfrastructureAccessProfileID() {
      return infrastructureAccessProfileID;
   }

   @JsonIgnore
   public void setInfrastructureAccessProfileID(String value) { 
      this.infrastructureAccessProfileID = value;
   }
   @JsonIgnore
   public String getInfrastructureProfileID() {
      return infrastructureProfileID;
   }

   @JsonIgnore
   public void setInfrastructureProfileID(String value) { 
      this.infrastructureProfileID = value;
   }
   @JsonIgnore
   public InstanceSSHOverride getInstanceSSHOverride() {
      return instanceSSHOverride;
   }

   @JsonIgnore
   public void setInstanceSSHOverride(InstanceSSHOverride value) { 
      this.instanceSSHOverride = value;
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
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
   }
   

   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public NSPortTemplatesFetcher getNSPortTemplates() {
      return nSPortTemplates;
   }
   

   public String toString() {
      return "NSGatewayTemplate [" + "SSHService=" + SSHService + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", personality=" + personality + ", description=" + description + ", infrastructureAccessProfileID=" + infrastructureAccessProfileID + ", infrastructureProfileID=" + infrastructureProfileID + ", instanceSSHOverride=" + instanceSSHOverride + ", enterpriseID=" + enterpriseID + ", entityScope=" + entityScope + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}