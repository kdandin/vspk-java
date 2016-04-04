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

import vspk.v3_2.fetchers.GlobalMetadatasFetcher;
import vspk.v3_2.fetchers.MetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BootstrapActivation extends RestObject {

   public final static String REST_NAME = "bootstrapactivation";
   public final static String RESOURCE_NAME = "bootstrapactivations";

   
   public enum Action { AUTHENTICATE, BOOTSTRAP_COMPLETE, CERTIFICATE_RENEW, CERTIFICATE_REVOKE, CERTIFICATE_SIGNED, CONFIRM, INITIATE, INITIATE_RENEW, NEW_NCPE_AUTH_REQUIRED, NO_AUTH_REQUIRED, ROLLBACK, ROLLED_BACK, UNSPECIFIED };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "action")
   protected Action action;
   
   @JsonProperty(value = "cacert")
   protected String cacert;
   
   @JsonProperty(value = "cert")
   protected String cert;
   
   @JsonProperty(value = "configURL")
   protected String configURL;
   
   @JsonProperty(value = "csr")
   protected String csr;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "hash")
   protected String hash;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "seed")
   protected String seed;
   
   @JsonProperty(value = "srkPassword")
   protected String srkPassword;
   
   @JsonProperty(value = "status")
   protected String status;
   
   @JsonProperty(value = "tpmOwnerPassword")
   protected String tpmOwnerPassword;
   
   @JsonProperty(value = "vsdTime")
   protected int vsdTime;
   

   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   

   public BootstrapActivation() {
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
   }

   public Action getAction() {
      return action;
   }

   public void setAction(Action value) { 
      this.action = value;
   }
   public String getCacert() {
      return cacert;
   }

   public void setCacert(String value) { 
      this.cacert = value;
   }
   public String getCert() {
      return cert;
   }

   public void setCert(String value) { 
      this.cert = value;
   }
   public String getConfigURL() {
      return configURL;
   }

   public void setConfigURL(String value) { 
      this.configURL = value;
   }
   public String getCsr() {
      return csr;
   }

   public void setCsr(String value) { 
      this.csr = value;
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
   public String getHash() {
      return hash;
   }

   public void setHash(String value) { 
      this.hash = value;
   }
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   public String getSeed() {
      return seed;
   }

   public void setSeed(String value) { 
      this.seed = value;
   }
   public String getSrkPassword() {
      return srkPassword;
   }

   public void setSrkPassword(String value) { 
      this.srkPassword = value;
   }
   public String getStatus() {
      return status;
   }

   public void setStatus(String value) { 
      this.status = value;
   }
   public String getTpmOwnerPassword() {
      return tpmOwnerPassword;
   }

   public void setTpmOwnerPassword(String value) { 
      this.tpmOwnerPassword = value;
   }
   public int getVsdTime() {
      return vsdTime;
   }

   public void setVsdTime(int value) { 
      this.vsdTime = value;
   }
   

   
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   

   public String toString() {
      return "BootstrapActivation [" + "action=" + action + ", cacert=" + cacert + ", cert=" + cert + ", configURL=" + configURL + ", csr=" + csr + ", entityScope=" + entityScope + ", externalID=" + externalID + ", hash=" + hash + ", lastUpdatedBy=" + lastUpdatedBy + ", seed=" + seed + ", srkPassword=" + srkPassword + ", status=" + status + ", tpmOwnerPassword=" + tpmOwnerPassword + ", vsdTime=" + vsdTime + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
		        + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}