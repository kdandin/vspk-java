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

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "ikeencryptionprofile", resourceName = "ikeencryptionprofiles")
public class IKEEncryptionprofile extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum DPDMode { ON_DEMAND, PERIODIC, REPLY_ONLY };
   public enum IPSecAuthenticationAlgorithm { HMAC_SHA1, HMAC_SHA256, HMAC_SHA512 };
   public enum IPSecEncryptionAlgorithm { AES128, AES192, AES256, TRIPLE_DES };
   public enum IPSecSAReplayWindowSize { WINDOW_SIZE_0, WINDOW_SIZE_1024, WINDOW_SIZE_128, WINDOW_SIZE_256, WINDOW_SIZE_32, WINDOW_SIZE_512, WINDOW_SIZE_64 };
   public enum ISAKMPAuthenticationMode { PRE_SHARED_KEY, RSA_SIGNATURE };
   public enum ISAKMPDiffieHelmanGroupIdentifier { GROUP_14_2048_BIT_DH, GROUP_15_3072_BIT_DH, GROUP_16_4096_BIT_DH, GROUP_19_256_BIT_ECDH, GROUP_1_768_BIT_DH, GROUP_20_384_BIT_ECDH, GROUP_24_2048_BIT_ECDH, GROUP_2_1024_BIT_DH, GROUP_5_1536_BIT_DH };
   public enum ISAKMPEncryptionAlgorithm { AES128, AES192, AES256, TRIPLE_DES };
   public enum ISAKMPHashAlgorithm { MD5, SHA1, SHA256 };
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "DPDInterval")
   protected Long DPDInterval;
   
   @JsonProperty(value = "DPDMode")
   protected DPDMode DPDMode;
   
   @JsonProperty(value = "DPDRetryInterval")
   protected Long DPDRetryInterval;
   
   @JsonProperty(value = "DPDTimeout")
   protected Long DPDTimeout;
   
   @JsonProperty(value = "IPSecAuthenticationAlgorithm")
   protected IPSecAuthenticationAlgorithm IPSecAuthenticationAlgorithm;
   
   @JsonProperty(value = "IPSecDontFragment")
   protected Boolean IPSecDontFragment;
   
   @JsonProperty(value = "IPSecEnablePFS")
   protected Boolean IPSecEnablePFS;
   
   @JsonProperty(value = "IPSecEncryptionAlgorithm")
   protected IPSecEncryptionAlgorithm IPSecEncryptionAlgorithm;
   
   @JsonProperty(value = "IPSecPreFragment")
   protected Boolean IPSecPreFragment;
   
   @JsonProperty(value = "IPSecSALifetime")
   protected Long IPSecSALifetime;
   
   @JsonProperty(value = "IPSecSAReplayWindowSize")
   protected IPSecSAReplayWindowSize IPSecSAReplayWindowSize;
   
   @JsonProperty(value = "ISAKMPAuthenticationMode")
   protected ISAKMPAuthenticationMode ISAKMPAuthenticationMode;
   
   @JsonProperty(value = "ISAKMPDiffieHelmanGroupIdentifier")
   protected ISAKMPDiffieHelmanGroupIdentifier ISAKMPDiffieHelmanGroupIdentifier;
   
   @JsonProperty(value = "ISAKMPEncryptionAlgorithm")
   protected ISAKMPEncryptionAlgorithm ISAKMPEncryptionAlgorithm;
   
   @JsonProperty(value = "ISAKMPEncryptionKeyLifetime")
   protected Long ISAKMPEncryptionKeyLifetime;
   
   @JsonProperty(value = "ISAKMPHashAlgorithm")
   protected ISAKMPHashAlgorithm ISAKMPHashAlgorithm;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "sequence")
   protected Long sequence;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "associatedEnterpriseID")
   protected String associatedEnterpriseID;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public IKEEncryptionprofile() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   @JsonIgnore
   public Long getDPDInterval() {
      return DPDInterval;
   }

   @JsonIgnore
   public void setDPDInterval(Long value) { 
      this.DPDInterval = value;
   }
   @JsonIgnore
   public DPDMode getDPDMode() {
      return DPDMode;
   }

   @JsonIgnore
   public void setDPDMode(DPDMode value) { 
      this.DPDMode = value;
   }
   @JsonIgnore
   public Long getDPDRetryInterval() {
      return DPDRetryInterval;
   }

   @JsonIgnore
   public void setDPDRetryInterval(Long value) { 
      this.DPDRetryInterval = value;
   }
   @JsonIgnore
   public Long getDPDTimeout() {
      return DPDTimeout;
   }

   @JsonIgnore
   public void setDPDTimeout(Long value) { 
      this.DPDTimeout = value;
   }
   @JsonIgnore
   public IPSecAuthenticationAlgorithm getIPSecAuthenticationAlgorithm() {
      return IPSecAuthenticationAlgorithm;
   }

   @JsonIgnore
   public void setIPSecAuthenticationAlgorithm(IPSecAuthenticationAlgorithm value) { 
      this.IPSecAuthenticationAlgorithm = value;
   }
   @JsonIgnore
   public Boolean getIPSecDontFragment() {
      return IPSecDontFragment;
   }

   @JsonIgnore
   public void setIPSecDontFragment(Boolean value) { 
      this.IPSecDontFragment = value;
   }
   @JsonIgnore
   public Boolean getIPSecEnablePFS() {
      return IPSecEnablePFS;
   }

   @JsonIgnore
   public void setIPSecEnablePFS(Boolean value) { 
      this.IPSecEnablePFS = value;
   }
   @JsonIgnore
   public IPSecEncryptionAlgorithm getIPSecEncryptionAlgorithm() {
      return IPSecEncryptionAlgorithm;
   }

   @JsonIgnore
   public void setIPSecEncryptionAlgorithm(IPSecEncryptionAlgorithm value) { 
      this.IPSecEncryptionAlgorithm = value;
   }
   @JsonIgnore
   public Boolean getIPSecPreFragment() {
      return IPSecPreFragment;
   }

   @JsonIgnore
   public void setIPSecPreFragment(Boolean value) { 
      this.IPSecPreFragment = value;
   }
   @JsonIgnore
   public Long getIPSecSALifetime() {
      return IPSecSALifetime;
   }

   @JsonIgnore
   public void setIPSecSALifetime(Long value) { 
      this.IPSecSALifetime = value;
   }
   @JsonIgnore
   public IPSecSAReplayWindowSize getIPSecSAReplayWindowSize() {
      return IPSecSAReplayWindowSize;
   }

   @JsonIgnore
   public void setIPSecSAReplayWindowSize(IPSecSAReplayWindowSize value) { 
      this.IPSecSAReplayWindowSize = value;
   }
   @JsonIgnore
   public ISAKMPAuthenticationMode getISAKMPAuthenticationMode() {
      return ISAKMPAuthenticationMode;
   }

   @JsonIgnore
   public void setISAKMPAuthenticationMode(ISAKMPAuthenticationMode value) { 
      this.ISAKMPAuthenticationMode = value;
   }
   @JsonIgnore
   public ISAKMPDiffieHelmanGroupIdentifier getISAKMPDiffieHelmanGroupIdentifier() {
      return ISAKMPDiffieHelmanGroupIdentifier;
   }

   @JsonIgnore
   public void setISAKMPDiffieHelmanGroupIdentifier(ISAKMPDiffieHelmanGroupIdentifier value) { 
      this.ISAKMPDiffieHelmanGroupIdentifier = value;
   }
   @JsonIgnore
   public ISAKMPEncryptionAlgorithm getISAKMPEncryptionAlgorithm() {
      return ISAKMPEncryptionAlgorithm;
   }

   @JsonIgnore
   public void setISAKMPEncryptionAlgorithm(ISAKMPEncryptionAlgorithm value) { 
      this.ISAKMPEncryptionAlgorithm = value;
   }
   @JsonIgnore
   public Long getISAKMPEncryptionKeyLifetime() {
      return ISAKMPEncryptionKeyLifetime;
   }

   @JsonIgnore
   public void setISAKMPEncryptionKeyLifetime(Long value) { 
      this.ISAKMPEncryptionKeyLifetime = value;
   }
   @JsonIgnore
   public ISAKMPHashAlgorithm getISAKMPHashAlgorithm() {
      return ISAKMPHashAlgorithm;
   }

   @JsonIgnore
   public void setISAKMPHashAlgorithm(ISAKMPHashAlgorithm value) { 
      this.ISAKMPHashAlgorithm = value;
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
   public Long getSequence() {
      return sequence;
   }

   @JsonIgnore
   public void setSequence(Long value) { 
      this.sequence = value;
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
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   @JsonIgnore
   public String getAssociatedEnterpriseID() {
      return associatedEnterpriseID;
   }

   @JsonIgnore
   public void setAssociatedEnterpriseID(String value) { 
      this.associatedEnterpriseID = value;
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
      return "IKEEncryptionprofile [" + "DPDInterval=" + DPDInterval + ", DPDMode=" + DPDMode + ", DPDRetryInterval=" + DPDRetryInterval + ", DPDTimeout=" + DPDTimeout + ", IPSecAuthenticationAlgorithm=" + IPSecAuthenticationAlgorithm + ", IPSecDontFragment=" + IPSecDontFragment + ", IPSecEnablePFS=" + IPSecEnablePFS + ", IPSecEncryptionAlgorithm=" + IPSecEncryptionAlgorithm + ", IPSecPreFragment=" + IPSecPreFragment + ", IPSecSALifetime=" + IPSecSALifetime + ", IPSecSAReplayWindowSize=" + IPSecSAReplayWindowSize + ", ISAKMPAuthenticationMode=" + ISAKMPAuthenticationMode + ", ISAKMPDiffieHelmanGroupIdentifier=" + ISAKMPDiffieHelmanGroupIdentifier + ", ISAKMPEncryptionAlgorithm=" + ISAKMPEncryptionAlgorithm + ", ISAKMPEncryptionKeyLifetime=" + ISAKMPEncryptionKeyLifetime + ", ISAKMPHashAlgorithm=" + ISAKMPHashAlgorithm + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", sequence=" + sequence + ", description=" + description + ", entityScope=" + entityScope + ", associatedEnterpriseID=" + associatedEnterpriseID + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}