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


import net.nuagenetworks.vspk.v5_0.fetchers.AddressRangesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.BGPNeighborsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.ContainersFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.ContainerInterfacesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.ContainerResyncsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.DefaultGatewaysFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.DHCPOptionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EnterprisePermissionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.EventLogsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.IKEGatewayConnectionsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.IPReservationsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.PATIPEntriesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.ProxyARPFiltersFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.QOSsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VMResyncsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.StatisticsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.StatisticsPoliciesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.TCAsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VirtualIPsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VMsFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VMInterfacesFetcher;
import net.nuagenetworks.vspk.v5_0.fetchers.VPortsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "subnet", resourceName = "subnets")
public class Subnet extends RestObject {

   private static final long serialVersionUID = 1L;

   
   
   public enum DHCPRelayStatus { DISABLED, ENABLED };
   
   public enum DPI { DISABLED, ENABLED, INHERITED };
   
   public enum IPType { DUALSTACK, IPV4 };
   
   public enum PATEnabled { DISABLED, ENABLED, INHERITED };
   
   public enum DefaultAction { DROP_TRAFFIC, USE_UNDERLAY };
   
   public enum Encryption { DISABLED, ENABLED, INHERITED };
   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   
   public enum EntityState { MARKED_FOR_DELETION, UNDER_CONSTRUCTION };
   
   public enum FlowCollectionEnabled { DISABLED, ENABLED, INHERITED };
   
   public enum MaintenanceMode { DISABLED, ENABLED, ENABLED_INHERITED };
   
   public enum Multicast { DISABLED, ENABLED, INHERITED };
   
   public enum ResourceType { FLOATING, NSG_VNF, PUBLIC, STANDARD };
   
   public enum UnderlayEnabled { DISABLED, ENABLED, INHERITED };
   
   public enum UseGlobalMAC { DISABLED, ENABLED };

   
   @JsonProperty(value = "DHCPRelayStatus")
   protected DHCPRelayStatus DHCPRelayStatus;
   
   @JsonProperty(value = "DPI")
   protected DPI DPI;
   
   @JsonProperty(value = "IPType")
   protected IPType IPType;
   
   @JsonProperty(value = "IPv6Address")
   protected String IPv6Address;
   
   @JsonProperty(value = "IPv6Gateway")
   protected String IPv6Gateway;
   
   @JsonProperty(value = "PATEnabled")
   protected PATEnabled PATEnabled;
   
   @JsonProperty(value = "accessRestrictionEnabled")
   protected Boolean accessRestrictionEnabled;
   
   @JsonProperty(value = "address")
   protected String address;
   
   @JsonProperty(value = "advertise")
   protected Boolean advertise;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "associatedSharedNetworkResourceID")
   protected String associatedSharedNetworkResourceID;
   
   @JsonProperty(value = "defaultAction")
   protected DefaultAction defaultAction;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "dynamicIpv6Address")
   protected Boolean dynamicIpv6Address;
   
   @JsonProperty(value = "encryption")
   protected Encryption encryption;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "entityState")
   protected EntityState entityState;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "flowCollectionEnabled")
   protected FlowCollectionEnabled flowCollectionEnabled;
   
   @JsonProperty(value = "gateway")
   protected String gateway;
   
   @JsonProperty(value = "gatewayMACAddress")
   protected String gatewayMACAddress;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "maintenanceMode")
   protected MaintenanceMode maintenanceMode;
   
   @JsonProperty(value = "multiHomeEnabled")
   protected Boolean multiHomeEnabled;
   
   @JsonProperty(value = "multicast")
   protected Multicast multicast;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "netmask")
   protected String netmask;
   
   @JsonProperty(value = "policyGroupID")
   protected Long policyGroupID;
   
   @JsonProperty(value = "proxyARP")
   protected Boolean proxyARP;
   
   @JsonProperty(value = "public")
   protected Boolean public_;
   
   @JsonProperty(value = "resourceType")
   protected ResourceType resourceType;
   
   @JsonProperty(value = "routeDistinguisher")
   protected String routeDistinguisher;
   
   @JsonProperty(value = "routeTarget")
   protected String routeTarget;
   
   @JsonProperty(value = "serviceID")
   protected Long serviceID;
   
   @JsonProperty(value = "splitSubnet")
   protected Boolean splitSubnet;
   
   @JsonProperty(value = "templateID")
   protected String templateID;
   
   @JsonProperty(value = "underlay")
   protected Boolean underlay;
   
   @JsonProperty(value = "underlayEnabled")
   protected UnderlayEnabled underlayEnabled;
   
   @JsonProperty(value = "useGlobalMAC")
   protected UseGlobalMAC useGlobalMAC;
   
   @JsonProperty(value = "vnId")
   protected Long vnId;
   

   
   @JsonIgnore
   private AddressRangesFetcher addressRanges;
   
   @JsonIgnore
   private BGPNeighborsFetcher bGPNeighbors;
   
   @JsonIgnore
   private ContainersFetcher containers;
   
   @JsonIgnore
   private ContainerInterfacesFetcher containerInterfaces;
   
   @JsonIgnore
   private ContainerResyncsFetcher containerResyncs;
   
   @JsonIgnore
   private DefaultGatewaysFetcher defaultGateways;
   
   @JsonIgnore
   private DHCPOptionsFetcher dHCPOptions;
   
   @JsonIgnore
   private EnterprisePermissionsFetcher enterprisePermissions;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private IKEGatewayConnectionsFetcher iKEGatewayConnections;
   
   @JsonIgnore
   private IPReservationsFetcher iPReservations;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private PATIPEntriesFetcher pATIPEntries;
   
   @JsonIgnore
   private ProxyARPFiltersFetcher proxyARPFilters;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private VMResyncsFetcher vMResyncs;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   
   @JsonIgnore
   private StatisticsPoliciesFetcher statisticsPolicies;
   
   @JsonIgnore
   private TCAsFetcher tCAs;
   
   @JsonIgnore
   private VirtualIPsFetcher virtualIPs;
   
   @JsonIgnore
   private VMsFetcher vMs;
   
   @JsonIgnore
   private VMInterfacesFetcher vMInterfaces;
   
   @JsonIgnore
   private VPortsFetcher vPorts;
   
   @SuppressWarnings("static-access")
   public Subnet() {
      PATEnabled = PATEnabled.INHERITED;
      multicast = Multicast.INHERITED;
      IPType = IPType.IPV4;
      maintenanceMode = MaintenanceMode.DISABLED;
      
      addressRanges = new AddressRangesFetcher(this);
      
      bGPNeighbors = new BGPNeighborsFetcher(this);
      
      containers = new ContainersFetcher(this);
      
      containerInterfaces = new ContainerInterfacesFetcher(this);
      
      containerResyncs = new ContainerResyncsFetcher(this);
      
      defaultGateways = new DefaultGatewaysFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      enterprisePermissions = new EnterprisePermissionsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      iKEGatewayConnections = new IKEGatewayConnectionsFetcher(this);
      
      iPReservations = new IPReservationsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      pATIPEntries = new PATIPEntriesFetcher(this);
      
      proxyARPFilters = new ProxyARPFiltersFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      vMResyncs = new VMResyncsFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
      statisticsPolicies = new StatisticsPoliciesFetcher(this);
      
      tCAs = new TCAsFetcher(this);
      
      virtualIPs = new VirtualIPsFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      vMInterfaces = new VMInterfacesFetcher(this);
      
      vPorts = new VPortsFetcher(this);
      
   }

   
   @JsonIgnore
   public DHCPRelayStatus getDHCPRelayStatus() {
      return DHCPRelayStatus;
   }

   @JsonIgnore
   public void setDHCPRelayStatus(DHCPRelayStatus value) { 
      this.DHCPRelayStatus = value;
   }
   
   @JsonIgnore
   public DPI getDPI() {
      return DPI;
   }

   @JsonIgnore
   public void setDPI(DPI value) { 
      this.DPI = value;
   }
   
   @JsonIgnore
   public IPType getIPType() {
      return IPType;
   }

   @JsonIgnore
   public void setIPType(IPType value) { 
      this.IPType = value;
   }
   
   @JsonIgnore
   public String getIPv6Address() {
      return IPv6Address;
   }

   @JsonIgnore
   public void setIPv6Address(String value) { 
      this.IPv6Address = value;
   }
   
   @JsonIgnore
   public String getIPv6Gateway() {
      return IPv6Gateway;
   }

   @JsonIgnore
   public void setIPv6Gateway(String value) { 
      this.IPv6Gateway = value;
   }
   
   @JsonIgnore
   public PATEnabled getPATEnabled() {
      return PATEnabled;
   }

   @JsonIgnore
   public void setPATEnabled(PATEnabled value) { 
      this.PATEnabled = value;
   }
   
   @JsonIgnore
   public Boolean getAccessRestrictionEnabled() {
      return accessRestrictionEnabled;
   }

   @JsonIgnore
   public void setAccessRestrictionEnabled(Boolean value) { 
      this.accessRestrictionEnabled = value;
   }
   
   @JsonIgnore
   public String getAddress() {
      return address;
   }

   @JsonIgnore
   public void setAddress(String value) { 
      this.address = value;
   }
   
   @JsonIgnore
   public Boolean getAdvertise() {
      return advertise;
   }

   @JsonIgnore
   public void setAdvertise(Boolean value) { 
      this.advertise = value;
   }
   
   @JsonIgnore
   public String getAssociatedMulticastChannelMapID() {
      return associatedMulticastChannelMapID;
   }

   @JsonIgnore
   public void setAssociatedMulticastChannelMapID(String value) { 
      this.associatedMulticastChannelMapID = value;
   }
   
   @JsonIgnore
   public String getAssociatedSharedNetworkResourceID() {
      return associatedSharedNetworkResourceID;
   }

   @JsonIgnore
   public void setAssociatedSharedNetworkResourceID(String value) { 
      this.associatedSharedNetworkResourceID = value;
   }
   
   @JsonIgnore
   public DefaultAction getDefaultAction() {
      return defaultAction;
   }

   @JsonIgnore
   public void setDefaultAction(DefaultAction value) { 
      this.defaultAction = value;
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
   public Boolean getDynamicIpv6Address() {
      return dynamicIpv6Address;
   }

   @JsonIgnore
   public void setDynamicIpv6Address(Boolean value) { 
      this.dynamicIpv6Address = value;
   }
   
   @JsonIgnore
   public Encryption getEncryption() {
      return encryption;
   }

   @JsonIgnore
   public void setEncryption(Encryption value) { 
      this.encryption = value;
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
   public EntityState getEntityState() {
      return entityState;
   }

   @JsonIgnore
   public void setEntityState(EntityState value) { 
      this.entityState = value;
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
   public FlowCollectionEnabled getFlowCollectionEnabled() {
      return flowCollectionEnabled;
   }

   @JsonIgnore
   public void setFlowCollectionEnabled(FlowCollectionEnabled value) { 
      this.flowCollectionEnabled = value;
   }
   
   @JsonIgnore
   public String getGateway() {
      return gateway;
   }

   @JsonIgnore
   public void setGateway(String value) { 
      this.gateway = value;
   }
   
   @JsonIgnore
   public String getGatewayMACAddress() {
      return gatewayMACAddress;
   }

   @JsonIgnore
   public void setGatewayMACAddress(String value) { 
      this.gatewayMACAddress = value;
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
   public MaintenanceMode getMaintenanceMode() {
      return maintenanceMode;
   }

   @JsonIgnore
   public void setMaintenanceMode(MaintenanceMode value) { 
      this.maintenanceMode = value;
   }
   
   @JsonIgnore
   public Boolean getMultiHomeEnabled() {
      return multiHomeEnabled;
   }

   @JsonIgnore
   public void setMultiHomeEnabled(Boolean value) { 
      this.multiHomeEnabled = value;
   }
   
   @JsonIgnore
   public Multicast getMulticast() {
      return multicast;
   }

   @JsonIgnore
   public void setMulticast(Multicast value) { 
      this.multicast = value;
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
   public String getNetmask() {
      return netmask;
   }

   @JsonIgnore
   public void setNetmask(String value) { 
      this.netmask = value;
   }
   
   @JsonIgnore
   public Long getPolicyGroupID() {
      return policyGroupID;
   }

   @JsonIgnore
   public void setPolicyGroupID(Long value) { 
      this.policyGroupID = value;
   }
   
   @JsonIgnore
   public Boolean getProxyARP() {
      return proxyARP;
   }

   @JsonIgnore
   public void setProxyARP(Boolean value) { 
      this.proxyARP = value;
   }
   
   @JsonIgnore
   public Boolean getPublic_() {
      return public_;
   }

   @JsonIgnore
   public void setPublic_(Boolean value) { 
      this.public_ = value;
   }
   
   @JsonIgnore
   public ResourceType getResourceType() {
      return resourceType;
   }

   @JsonIgnore
   public void setResourceType(ResourceType value) { 
      this.resourceType = value;
   }
   
   @JsonIgnore
   public String getRouteDistinguisher() {
      return routeDistinguisher;
   }

   @JsonIgnore
   public void setRouteDistinguisher(String value) { 
      this.routeDistinguisher = value;
   }
   
   @JsonIgnore
   public String getRouteTarget() {
      return routeTarget;
   }

   @JsonIgnore
   public void setRouteTarget(String value) { 
      this.routeTarget = value;
   }
   
   @JsonIgnore
   public Long getServiceID() {
      return serviceID;
   }

   @JsonIgnore
   public void setServiceID(Long value) { 
      this.serviceID = value;
   }
   
   @JsonIgnore
   public Boolean getSplitSubnet() {
      return splitSubnet;
   }

   @JsonIgnore
   public void setSplitSubnet(Boolean value) { 
      this.splitSubnet = value;
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
   public Boolean getUnderlay() {
      return underlay;
   }

   @JsonIgnore
   public void setUnderlay(Boolean value) { 
      this.underlay = value;
   }
   
   @JsonIgnore
   public UnderlayEnabled getUnderlayEnabled() {
      return underlayEnabled;
   }

   @JsonIgnore
   public void setUnderlayEnabled(UnderlayEnabled value) { 
      this.underlayEnabled = value;
   }
   
   @JsonIgnore
   public UseGlobalMAC getUseGlobalMAC() {
      return useGlobalMAC;
   }

   @JsonIgnore
   public void setUseGlobalMAC(UseGlobalMAC value) { 
      this.useGlobalMAC = value;
   }
   
   @JsonIgnore
   public Long getVnId() {
      return vnId;
   }

   @JsonIgnore
   public void setVnId(Long value) { 
      this.vnId = value;
   }
   

   
   @JsonIgnore
   public AddressRangesFetcher getAddressRanges() {
      return addressRanges;
   }
   
   @JsonIgnore
   public BGPNeighborsFetcher getBGPNeighbors() {
      return bGPNeighbors;
   }
   
   @JsonIgnore
   public ContainersFetcher getContainers() {
      return containers;
   }
   
   @JsonIgnore
   public ContainerInterfacesFetcher getContainerInterfaces() {
      return containerInterfaces;
   }
   
   @JsonIgnore
   public ContainerResyncsFetcher getContainerResyncs() {
      return containerResyncs;
   }
   
   @JsonIgnore
   public DefaultGatewaysFetcher getDefaultGateways() {
      return defaultGateways;
   }
   
   @JsonIgnore
   public DHCPOptionsFetcher getDHCPOptions() {
      return dHCPOptions;
   }
   
   @JsonIgnore
   public EnterprisePermissionsFetcher getEnterprisePermissions() {
      return enterprisePermissions;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public IKEGatewayConnectionsFetcher getIKEGatewayConnections() {
      return iKEGatewayConnections;
   }
   
   @JsonIgnore
   public IPReservationsFetcher getIPReservations() {
      return iPReservations;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public PATIPEntriesFetcher getPATIPEntries() {
      return pATIPEntries;
   }
   
   @JsonIgnore
   public ProxyARPFiltersFetcher getProxyARPFilters() {
      return proxyARPFilters;
   }
   
   @JsonIgnore
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   
   @JsonIgnore
   public VMResyncsFetcher getVMResyncs() {
      return vMResyncs;
   }
   
   @JsonIgnore
   public StatisticsFetcher getStatistics() {
      return statistics;
   }
   
   @JsonIgnore
   public StatisticsPoliciesFetcher getStatisticsPolicies() {
      return statisticsPolicies;
   }
   
   @JsonIgnore
   public TCAsFetcher getTCAs() {
      return tCAs;
   }
   
   @JsonIgnore
   public VirtualIPsFetcher getVirtualIPs() {
      return virtualIPs;
   }
   
   @JsonIgnore
   public VMsFetcher getVMs() {
      return vMs;
   }
   
   @JsonIgnore
   public VMInterfacesFetcher getVMInterfaces() {
      return vMInterfaces;
   }
   
   @JsonIgnore
   public VPortsFetcher getVPorts() {
      return vPorts;
   }
   

   public String toString() {
      return "Subnet [" + "DHCPRelayStatus=" + DHCPRelayStatus + ", DPI=" + DPI + ", IPType=" + IPType + ", IPv6Address=" + IPv6Address + ", IPv6Gateway=" + IPv6Gateway + ", PATEnabled=" + PATEnabled + ", accessRestrictionEnabled=" + accessRestrictionEnabled + ", address=" + address + ", advertise=" + advertise + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", associatedSharedNetworkResourceID=" + associatedSharedNetworkResourceID + ", defaultAction=" + defaultAction + ", description=" + description + ", dynamicIpv6Address=" + dynamicIpv6Address + ", encryption=" + encryption + ", entityScope=" + entityScope + ", entityState=" + entityState + ", externalID=" + externalID + ", flowCollectionEnabled=" + flowCollectionEnabled + ", gateway=" + gateway + ", gatewayMACAddress=" + gatewayMACAddress + ", lastUpdatedBy=" + lastUpdatedBy + ", maintenanceMode=" + maintenanceMode + ", multiHomeEnabled=" + multiHomeEnabled + ", multicast=" + multicast + ", name=" + name + ", netmask=" + netmask + ", policyGroupID=" + policyGroupID + ", proxyARP=" + proxyARP + ", public_=" + public_ + ", resourceType=" + resourceType + ", routeDistinguisher=" + routeDistinguisher + ", routeTarget=" + routeTarget + ", serviceID=" + serviceID + ", splitSubnet=" + splitSubnet + ", templateID=" + templateID + ", underlay=" + underlay + ", underlayEnabled=" + underlayEnabled + ", useGlobalMAC=" + useGlobalMAC + ", vnId=" + vnId + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}