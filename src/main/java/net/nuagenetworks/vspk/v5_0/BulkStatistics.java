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

package net.nuagenetworks.vspk.v5_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "bulkstatistics", resourceName = "bulkstatistics")
public class BulkStatistics extends RestObject {

   private static final long serialVersionUID = 1L;

   

   
   @JsonProperty(value = "data")
   protected java.util.List<com.fasterxml.jackson.databind.JsonNode> data;
   
   @JsonProperty(value = "endTime")
   protected Long endTime;
   
   @JsonProperty(value = "numberOfDataPoints")
   protected Long numberOfDataPoints;
   
   @JsonProperty(value = "startTime")
   protected Long startTime;
   
   @JsonProperty(value = "version")
   protected Long version;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public BulkStatistics() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   
   @JsonIgnore
   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getData() {
      return data;
   }

   @JsonIgnore
   public void setData(java.util.List<com.fasterxml.jackson.databind.JsonNode> value) { 
      this.data = value;
   }
   
   @JsonIgnore
   public Long getEndTime() {
      return endTime;
   }

   @JsonIgnore
   public void setEndTime(Long value) { 
      this.endTime = value;
   }
   
   @JsonIgnore
   public Long getNumberOfDataPoints() {
      return numberOfDataPoints;
   }

   @JsonIgnore
   public void setNumberOfDataPoints(Long value) { 
      this.numberOfDataPoints = value;
   }
   
   @JsonIgnore
   public Long getStartTime() {
      return startTime;
   }

   @JsonIgnore
   public void setStartTime(Long value) { 
      this.startTime = value;
   }
   
   @JsonIgnore
   public Long getVersion() {
      return version;
   }

   @JsonIgnore
   public void setVersion(Long value) { 
      this.version = value;
   }
   

   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "BulkStatistics [" + "data=" + data + ", endTime=" + endTime + ", numberOfDataPoints=" + numberOfDataPoints + ", startTime=" + startTime + ", version=" + version + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}