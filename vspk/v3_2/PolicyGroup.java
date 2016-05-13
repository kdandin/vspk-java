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


package vspk.v3_2;

import bambou.RestObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

import vspk.v3_2.fetchers.EventLogsFetcher;
import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.JobsFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;
import vspk.v3_2.fetchers.VPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PolicyGroup extends RestObject {

   public final static String REST_NAME = "policygroup";
   public final static String RESOURCE_NAME = "policygroups";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum Type { HARDWARE, SOFTWARE };

   
   @JsonProperty(value = "EVPNCommunityTag")
   protected String EVPNCommunityTag;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "external")
   protected boolean external;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "policyGroupID")
   protected int policyGroupID;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   
   @JsonProperty(value = "type")
   protected Type type;
   

   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private VPortsFetcher vPorts;
   

   public PolicyGroup() {
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      vPorts = new VPortsFetcher(this);
      
   }

   public String getEVPNCommunityTag() {
      return EVPNCommunityTag;
   }

   public void setEVPNCommunityTag(String value) { 
      this.EVPNCommunityTag = value;
   }
   public String getDescription() {
      return description;
   }

   public void setDescription(String value) { 
      this.description = value;
   }
   public EntityScope getEntityScope() {
      return entityScope;
   }

   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   public boolean getExternal() {
      return external;
   }

   public void setExternal(boolean value) { 
      this.external = value;
   }
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String value) { 
      this.name = value;
   }
   public int getPolicyGroupID() {
      return policyGroupID;
   }

   public void setPolicyGroupID(int value) { 
      this.policyGroupID = value;
   }
   public String getTemplateID() {
      return templateID;
   }

   public void setTemplateID(String value) { 
      this.templateID = value;
   }
   public Type getType() {
      return type;
   }

   public void setType(Type value) { 
      this.type = value;
   }
   

   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public VPortsFetcher getVPorts() {
      return vPorts;
   }
   

   public String toString() {
      return "PolicyGroup [" + "EVPNCommunityTag=" + EVPNCommunityTag + ", description=" + description + ", entityScope=" + entityScope + ", external=" + external + ", externalID=" + externalID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", policyGroupID=" + policyGroupID + ", templateID=" + templateID + ", type=" + type + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}