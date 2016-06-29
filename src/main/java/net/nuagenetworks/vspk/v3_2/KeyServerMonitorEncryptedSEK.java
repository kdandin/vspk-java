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

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "keyservermonitorencryptedsek", resourceName = "keyservermonitorencryptedseks")
public class KeyServerMonitorEncryptedSEK extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "NSGCertificateSerialNumber")
   protected Float NSGCertificateSerialNumber;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "gatewaySecuredDataID")
   protected String gatewaySecuredDataID;
   
   @JsonProperty(value = "keyServerCertificateSerialNumber")
   protected Float keyServerCertificateSerialNumber;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "associatedKeyServerMonitorSEKCreationTime")
   protected Float associatedKeyServerMonitorSEKCreationTime;
   
   @JsonProperty(value = "associatedKeyServerMonitorSEKID")
   protected String associatedKeyServerMonitorSEKID;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public KeyServerMonitorEncryptedSEK() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   @JsonIgnore
   public Float getNSGCertificateSerialNumber() {
      return NSGCertificateSerialNumber;
   }

   @JsonIgnore
   public void setNSGCertificateSerialNumber(Float value) { 
      this.NSGCertificateSerialNumber = value;
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
   public String getGatewaySecuredDataID() {
      return gatewaySecuredDataID;
   }

   @JsonIgnore
   public void setGatewaySecuredDataID(String value) { 
      this.gatewaySecuredDataID = value;
   }
   @JsonIgnore
   public Float getKeyServerCertificateSerialNumber() {
      return keyServerCertificateSerialNumber;
   }

   @JsonIgnore
   public void setKeyServerCertificateSerialNumber(Float value) { 
      this.keyServerCertificateSerialNumber = value;
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
   public Float getAssociatedKeyServerMonitorSEKCreationTime() {
      return associatedKeyServerMonitorSEKCreationTime;
   }

   @JsonIgnore
   public void setAssociatedKeyServerMonitorSEKCreationTime(Float value) { 
      this.associatedKeyServerMonitorSEKCreationTime = value;
   }
   @JsonIgnore
   public String getAssociatedKeyServerMonitorSEKID() {
      return associatedKeyServerMonitorSEKID;
   }

   @JsonIgnore
   public void setAssociatedKeyServerMonitorSEKID(String value) { 
      this.associatedKeyServerMonitorSEKID = value;
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
   

   public String toString() {
      return "KeyServerMonitorEncryptedSEK [" + "NSGCertificateSerialNumber=" + NSGCertificateSerialNumber + ", lastUpdatedBy=" + lastUpdatedBy + ", gatewaySecuredDataID=" + gatewaySecuredDataID + ", keyServerCertificateSerialNumber=" + keyServerCertificateSerialNumber + ", entityScope=" + entityScope + ", associatedKeyServerMonitorSEKCreationTime=" + associatedKeyServerMonitorSEKCreationTime + ", associatedKeyServerMonitorSEKID=" + associatedKeyServerMonitorSEKID + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}