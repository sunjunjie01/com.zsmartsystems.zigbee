/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.groups;

import java.util.List;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * Get Group Membership Response value object class.
 * <p>
 * Cluster: <b>Groups</b>. Command ID 0x02 is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the Groups cluster.
 * <p>
 * The get group membership response command is sent by the groups cluster server in response to
 * a get group membership command.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2020-01-06T18:45:28Z")
public class GetGroupMembershipResponse extends ZclCommand {
    /**
     * The cluster ID to which this command belongs.
     */
    public static int CLUSTER_ID = 0x0004;

    /**
     * The command ID.
     */
    public static int COMMAND_ID = 0x02;

    /**
     * Capacity command message field.
     */
    private Integer capacity;

    /**
     * Group Count command message field.
     */
    private Integer groupCount;

    /**
     * Group List command message field.
     */
    private List<Integer> groupList;

    /**
     * Default constructor.
     */
    public GetGroupMembershipResponse() {
        clusterId = CLUSTER_ID;
        commandId = COMMAND_ID;
        genericCommand = false;
        commandDirection = ZclCommandDirection.SERVER_TO_CLIENT;
    }

    /**
     * Gets Capacity.
     *
     * @return the Capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    /**
     * Sets Capacity.
     *
     * @param capacity the Capacity
     * @return the GetGroupMembershipResponse command
     */
    public GetGroupMembershipResponse setCapacity(final Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Gets Group Count.
     *
     * @return the Group Count
     */
    public Integer getGroupCount() {
        return groupCount;
    }

    /**
     * Sets Group Count.
     *
     * @param groupCount the Group Count
     * @return the GetGroupMembershipResponse command
     */
    public GetGroupMembershipResponse setGroupCount(final Integer groupCount) {
        this.groupCount = groupCount;
        return this;
    }

    /**
     * Gets Group List.
     *
     * @return the Group List
     */
    public List<Integer> getGroupList() {
        return groupList;
    }

    /**
     * Sets Group List.
     *
     * @param groupList the Group List
     * @return the GetGroupMembershipResponse command
     */
    public GetGroupMembershipResponse setGroupList(final List<Integer> groupList) {
        this.groupList = groupList;
        return this;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(capacity, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(groupCount, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(groupList, ZclDataType.N_X_UNSIGNED_16_BIT_INTEGER);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        capacity = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        groupCount = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        groupList = (List<Integer>) deserializer.deserialize(ZclDataType.N_X_UNSIGNED_16_BIT_INTEGER);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(116);
        builder.append("GetGroupMembershipResponse [");
        builder.append(super.toString());
        builder.append(", capacity=");
        builder.append(capacity);
        builder.append(", groupCount=");
        builder.append(groupCount);
        builder.append(", groupList=");
        builder.append(groupList);
        builder.append(']');
        return builder.toString();
    }

}
