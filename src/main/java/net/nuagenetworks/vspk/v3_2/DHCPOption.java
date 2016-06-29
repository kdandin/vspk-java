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


import net.nuagenetworks.vspk.v3_2.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v3_2.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "dhcpoption", resourceName = "dhcpoptions")
public class DHCPOption extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "value")
   protected String value;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "actualType")
   protected Long actualType;
   
   @JsonProperty(value = "actualValues")
   protected java.util.List<String> actualValues;
   
   @JsonProperty(value = "length")
   protected String length;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "type")
   protected String type;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public DHCPOption() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   @JsonIgnore
   public String getValue() {
      return value;
   }

   @JsonIgnore
   public void setValue(String value) { 
      this.value = value;
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
   public Long getActualType() {
      return actualType;
   }

   @JsonIgnore
   public void setActualType(Long value) { 
      this.actualType = value;
   }
   @JsonIgnore
   public java.util.List<String> getActualValues() {
      return actualValues;
   }

   @JsonIgnore
   public void setActualValues(java.util.List<String> value) { 
      this.actualValues = value;
   }
   @JsonIgnore
   public String getLength() {
      return length;
   }

   @JsonIgnore
   public void setLength(String value) { 
      this.length = value;
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
   public String getType() {
      return type;
   }

   @JsonIgnore
   public void setType(String value) { 
      this.type = value;
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
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "DHCPOption [" + "value=" + value + ", lastUpdatedBy=" + lastUpdatedBy + ", actualType=" + actualType + ", actualValues=" + actualValues + ", length=" + length + ", entityScope=" + entityScope + ", externalID=" + externalID + ", type=" + type + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}