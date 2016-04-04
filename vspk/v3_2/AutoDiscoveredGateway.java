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
import vspk.v3_2.fetchers.MetadatasFetcher;
import vspk.v3_2.fetchers.NSPortsFetcher;
import vspk.v3_2.fetchers.PortsFetcher;
import vspk.v3_2.fetchers.WANServicesFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AutoDiscoveredGateway extends RestObject {

   public final static String REST_NAME = "autodiscoveredgateway";
   public final static String RESOURCE_NAME = "autodiscoveredgateways";

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum Personality { DC7X50, HARDWARE_VTEP, NSG, OTHER, VRSG, VSA, VSG };

   
   @JsonProperty(value = "controllers")
   protected java.util.List<String> controllers;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "gatewayID")
   protected String gatewayID;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "peer")
   protected String peer;
   
   @JsonProperty(value = "personality")
   protected Personality personality;
   
   @JsonProperty(value = "systemID")
   protected String systemID;
   
   @JsonProperty(value = "vtep")
   protected String vtep;
   

   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private NSPortsFetcher nSPorts;
   
   @JsonIgnore
   private PortsFetcher ports;
   
   @JsonIgnore
   private WANServicesFetcher wANServices;
   

   public AutoDiscoveredGateway() {
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      nSPorts = new NSPortsFetcher(this);
      
      ports = new PortsFetcher(this);
      
      wANServices = new WANServicesFetcher(this);
      
   }

   public java.util.List<String> getControllers() {
      return controllers;
   }

   public void setControllers(java.util.List<String> value) { 
      this.controllers = value;
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
   public String getExternalID() {
      return externalID;
   }

   public void setExternalID(String value) { 
      this.externalID = value;
   }
   public String getGatewayID() {
      return gatewayID;
   }

   public void setGatewayID(String value) { 
      this.gatewayID = value;
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
   public String getPeer() {
      return peer;
   }

   public void setPeer(String value) { 
      this.peer = value;
   }
   public Personality getPersonality() {
      return personality;
   }

   public void setPersonality(Personality value) { 
      this.personality = value;
   }
   public String getSystemID() {
      return systemID;
   }

   public void setSystemID(String value) { 
      this.systemID = value;
   }
   public String getVtep() {
      return vtep;
   }

   public void setVtep(String value) { 
      this.vtep = value;
   }
   

   
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   public NSPortsFetcher getNSPorts() {
      return nSPorts;
   }
   
   public PortsFetcher getPorts() {
      return ports;
   }
   
   public WANServicesFetcher getWANServices() {
      return wANServices;
   }
   

   public String toString() {
      return "AutoDiscoveredGateway [" + "controllers=" + controllers + ", description=" + description + ", entityScope=" + entityScope + ", externalID=" + externalID + ", gatewayID=" + gatewayID + ", lastUpdatedBy=" + lastUpdatedBy + ", name=" + name + ", peer=" + peer + ", personality=" + personality + ", systemID=" + systemID + ", vtep=" + vtep + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}