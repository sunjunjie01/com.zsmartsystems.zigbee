/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.general;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * Discover Attributes Extended value object class.
 * <p>
 * Cluster: <b>General</b>. Command ID 0x15 is sent <b>TO</b> the server.
 * This command is a <b>generic</b> command used across the profile.
 * <p>
 * The Discover Attributes Extended command is generated when a remote device wishes to
 * discover the identifiers and types of the attributes on a device which are supported within
 * the cluster to which this command is directed, including whether the attribute is readable,
 * writeable or reportable.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2020-01-06T18:45:28Z")
public class DiscoverAttributesExtended extends ZclCommand {
    /**
     * The command ID.
     */
    public static int COMMAND_ID = 0x15;

    /**
     * Start Attribute Identifier command message field.
     */
    private Integer startAttributeIdentifier;

    /**
     * Maximum Attribute Identifiers command message field.
     */
    private Integer maximumAttributeIdentifiers;

    /**
     * Default constructor.
     */
    public DiscoverAttributesExtended() {
        commandId = COMMAND_ID;
        genericCommand = true;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    /**
     * Sets the cluster ID for <i>generic</i> commands. {@link DiscoverAttributesExtended} is a <i>generic</i> command.
     * <p>
     * For commands that are not <i>generic</i>, this method will do nothing as the cluster ID is fixed.
     * To test if a command is <i>generic</i>, use the {@link #isGenericCommand} method.
     *
     * @param clusterId the cluster ID used for <i>generic</i> commands as an {@link Integer}
     */
    @Override
    public void setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * Gets Start Attribute Identifier.
     *
     * @return the Start Attribute Identifier
     */
    public Integer getStartAttributeIdentifier() {
        return startAttributeIdentifier;
    }

    /**
     * Sets Start Attribute Identifier.
     *
     * @param startAttributeIdentifier the Start Attribute Identifier
     * @return the DiscoverAttributesExtended command
     */
    public DiscoverAttributesExtended setStartAttributeIdentifier(final Integer startAttributeIdentifier) {
        this.startAttributeIdentifier = startAttributeIdentifier;
        return this;
    }

    /**
     * Gets Maximum Attribute Identifiers.
     *
     * @return the Maximum Attribute Identifiers
     */
    public Integer getMaximumAttributeIdentifiers() {
        return maximumAttributeIdentifiers;
    }

    /**
     * Sets Maximum Attribute Identifiers.
     *
     * @param maximumAttributeIdentifiers the Maximum Attribute Identifiers
     * @return the DiscoverAttributesExtended command
     */
    public DiscoverAttributesExtended setMaximumAttributeIdentifiers(final Integer maximumAttributeIdentifiers) {
        this.maximumAttributeIdentifiers = maximumAttributeIdentifiers;
        return this;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(startAttributeIdentifier, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(maximumAttributeIdentifiers, ZclDataType.UNSIGNED_8_BIT_INTEGER);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        startAttributeIdentifier = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        maximumAttributeIdentifiers = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(120);
        builder.append("DiscoverAttributesExtended [");
        builder.append(super.toString());
        builder.append(", startAttributeIdentifier=");
        builder.append(startAttributeIdentifier);
        builder.append(", maximumAttributeIdentifiers=");
        builder.append(maximumAttributeIdentifiers);
        builder.append(']');
        return builder.toString();
    }

}
