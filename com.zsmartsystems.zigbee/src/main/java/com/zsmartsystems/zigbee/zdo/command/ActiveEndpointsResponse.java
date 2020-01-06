/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zdo.command;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;
import com.zsmartsystems.zigbee.zdo.ZdoResponse;
import com.zsmartsystems.zigbee.zdo.ZdoStatus;

/**
 * Active Endpoints Response value object class.
 * <p>
 * <p>
 * The Active_EP_rsp is generated by a remote device in response to an Active_EP_req directed
 * to the remote device. This command shall be unicast to the originator of the Active_EP_req
 * command.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2020-01-06T18:45:28Z")
public class ActiveEndpointsResponse extends ZdoResponse {
    /**
     * The ZDO cluster ID.
     */
    public static int CLUSTER_ID = 0x8005;

    /**
     * NWK Addr Of Interest command message field.
     */
    private Integer nwkAddrOfInterest;

    /**
     * Active Ep List command message field.
     */
    private List<Integer> activeEpList;

    /**
     * Default constructor.
     */
    public ActiveEndpointsResponse() {
        clusterId = CLUSTER_ID;
    }

    /**
     * Gets NWK Addr Of Interest.
     *
     * @return the NWK Addr Of Interest
     */
    public Integer getNwkAddrOfInterest() {
        return nwkAddrOfInterest;
    }

    /**
     * Sets NWK Addr Of Interest.
     *
     * @param nwkAddrOfInterest the NWK Addr Of Interest
     * @return the ActiveEndpointsResponse command
     */
    public ActiveEndpointsResponse setNwkAddrOfInterest(final Integer nwkAddrOfInterest) {
        this.nwkAddrOfInterest = nwkAddrOfInterest;
        return this;
    }

    /**
     * Gets Active Ep List.
     *
     * @return the Active Ep List
     */
    public List<Integer> getActiveEpList() {
        return activeEpList;
    }

    /**
     * Sets Active Ep List.
     *
     * @param activeEpList the Active Ep List
     * @return the ActiveEndpointsResponse command
     */
    public ActiveEndpointsResponse setActiveEpList(final List<Integer> activeEpList) {
        this.activeEpList = activeEpList;
        return this;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        super.serialize(serializer);

        serializer.serialize(status, ZclDataType.ZDO_STATUS);
        serializer.serialize(nwkAddrOfInterest, ZclDataType.NWK_ADDRESS);
        serializer.serialize(activeEpList.size(), ZclDataType.UNSIGNED_8_BIT_INTEGER);
        for (int cnt = 0; cnt < activeEpList.size(); cnt++) {
            serializer.serialize(activeEpList.get(cnt), ZclDataType.ENDPOINT);
        }
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        super.deserialize(deserializer);

        // Create lists
        activeEpList = new ArrayList<Integer>();

        status = (ZdoStatus) deserializer.deserialize(ZclDataType.ZDO_STATUS);
        if (status != ZdoStatus.SUCCESS) {
            // Don't read the full response if we have an error
            return;
        }
        nwkAddrOfInterest = (Integer) deserializer.deserialize(ZclDataType.NWK_ADDRESS);
        Integer activeEpCnt = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        if (activeEpCnt != null) {
            for (int cnt = 0; cnt < activeEpCnt; cnt++) {
                activeEpList.add((Integer) deserializer.deserialize(ZclDataType.ENDPOINT));
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(152);
        builder.append("ActiveEndpointsResponse [");
        builder.append(super.toString());
        builder.append(", status=");
        builder.append(status);
        builder.append(", nwkAddrOfInterest=");
        builder.append(String.format("%04X", nwkAddrOfInterest));
        builder.append(", activeEpList=");
        builder.append(activeEpList);
        builder.append(']');
        return builder.toString();
    }

}
