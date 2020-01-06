/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.price;

import java.util.Calendar;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * Publish Currency Conversion Command value object class.
 * <p>
 * Cluster: <b>Price</b>. Command ID 0x0D is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the Price cluster.
 * <p>
 * The PublishCurrencyConversion command is sent in response to a GetCurrencyConversion
 * command or when a new currency becomes available.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2020-01-06T18:45:28Z")
public class PublishCurrencyConversionCommand extends ZclCommand {
    /**
     * The cluster ID to which this command belongs.
     */
    public static int CLUSTER_ID = 0x0700;

    /**
     * The command ID.
     */
    public static int COMMAND_ID = 0x0D;

    /**
     * Provider ID command message field.
     * <p>
     * An unsigned 32-bit field containing a unique identifier for the commodity provider.
     * This field allows differentiation in deregulated markets where multiple commodity
     * providers may be available.
     */
    private Integer providerId;

    /**
     * Issuer Event ID command message field.
     * <p>
     * Unique identifier generated by the commodity provider. When new information is
     * provided that replaces older information for the same time period, this field allows
     * devices to determine which information is newer. The value contained in this field is a
     * unique number managed by upstream servers or a UTC based time stamp (UTCTime data type)
     * identifying when the Publish command was issued. Thus, newer information will have a
     * value in the Issuer Event ID field that is larger than older information.
     */
    private Integer issuerEventId;

    /**
     * Start Time command message field.
     * <p>
     * A UTCTime field to denote the time at which the new currency becomes valid. A start
     * date/time of 0x00000000 shall indicate that the command should be executed
     * immediately. A start date/time of 0xFFFFFFFF shall cause an existing but pending
     * PublishCurrencyConversion command with the same Provider ID and Issuer Event ID to be
     * cancelled.
     */
    private Calendar startTime;

    /**
     * Old Currency command message field.
     * <p>
     * An unsigned 16-bit field containing identifying information concerning the old local
     * unit of currency used in the Price cluster. The value of the Old Currency field should
     * match the values defined by ISO 4217.
     */
    private Integer oldCurrency;

    /**
     * New Currency command message field.
     * <p>
     * An unsigned 16-bit field containing identifying information concerning the new local
     * unit of currency used in the Price cluster. The value of the New Currency field should
     * match the values defined by ISO 4217.
     */
    private Integer newCurrency;

    /**
     * Conversion Factor command message field.
     * <p>
     * The format and use of this field is the same as for the ConversionFactor attribute.
     */
    private Integer conversionFactor;

    /**
     * Conversion Factor Trailing Digit command message field.
     * <p>
     * The format and use of this field is the same as for the ConversionFactorTrailingDigit
     * attribute.
     */
    private Integer conversionFactorTrailingDigit;

    /**
     * Currency Change Control Flags command message field.
     * <p>
     * A 32-bit mask that denotes the functions that are required to be carried out on
     * processing of this command.
     */
    private Integer currencyChangeControlFlags;

    /**
     * Default constructor.
     */
    public PublishCurrencyConversionCommand() {
        clusterId = CLUSTER_ID;
        commandId = COMMAND_ID;
        genericCommand = false;
        commandDirection = ZclCommandDirection.SERVER_TO_CLIENT;
    }

    /**
     * Gets Provider ID.
     * <p>
     * An unsigned 32-bit field containing a unique identifier for the commodity provider.
     * This field allows differentiation in deregulated markets where multiple commodity
     * providers may be available.
     *
     * @return the Provider ID
     */
    public Integer getProviderId() {
        return providerId;
    }

    /**
     * Sets Provider ID.
     * <p>
     * An unsigned 32-bit field containing a unique identifier for the commodity provider.
     * This field allows differentiation in deregulated markets where multiple commodity
     * providers may be available.
     *
     * @param providerId the Provider ID
     * @return the PublishCurrencyConversionCommand command
     */
    public PublishCurrencyConversionCommand setProviderId(final Integer providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * Gets Issuer Event ID.
     * <p>
     * Unique identifier generated by the commodity provider. When new information is
     * provided that replaces older information for the same time period, this field allows
     * devices to determine which information is newer. The value contained in this field is a
     * unique number managed by upstream servers or a UTC based time stamp (UTCTime data type)
     * identifying when the Publish command was issued. Thus, newer information will have a
     * value in the Issuer Event ID field that is larger than older information.
     *
     * @return the Issuer Event ID
     */
    public Integer getIssuerEventId() {
        return issuerEventId;
    }

    /**
     * Sets Issuer Event ID.
     * <p>
     * Unique identifier generated by the commodity provider. When new information is
     * provided that replaces older information for the same time period, this field allows
     * devices to determine which information is newer. The value contained in this field is a
     * unique number managed by upstream servers or a UTC based time stamp (UTCTime data type)
     * identifying when the Publish command was issued. Thus, newer information will have a
     * value in the Issuer Event ID field that is larger than older information.
     *
     * @param issuerEventId the Issuer Event ID
     * @return the PublishCurrencyConversionCommand command
     */
    public PublishCurrencyConversionCommand setIssuerEventId(final Integer issuerEventId) {
        this.issuerEventId = issuerEventId;
        return this;
    }

    /**
     * Gets Start Time.
     * <p>
     * A UTCTime field to denote the time at which the new currency becomes valid. A start
     * date/time of 0x00000000 shall indicate that the command should be executed
     * immediately. A start date/time of 0xFFFFFFFF shall cause an existing but pending
     * PublishCurrencyConversion command with the same Provider ID and Issuer Event ID to be
     * cancelled.
     *
     * @return the Start Time
     */
    public Calendar getStartTime() {
        return startTime;
    }

    /**
     * Sets Start Time.
     * <p>
     * A UTCTime field to denote the time at which the new currency becomes valid. A start
     * date/time of 0x00000000 shall indicate that the command should be executed
     * immediately. A start date/time of 0xFFFFFFFF shall cause an existing but pending
     * PublishCurrencyConversion command with the same Provider ID and Issuer Event ID to be
     * cancelled.
     *
     * @param startTime the Start Time
     * @return the PublishCurrencyConversionCommand command
     */
    public PublishCurrencyConversionCommand setStartTime(final Calendar startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Gets Old Currency.
     * <p>
     * An unsigned 16-bit field containing identifying information concerning the old local
     * unit of currency used in the Price cluster. The value of the Old Currency field should
     * match the values defined by ISO 4217.
     *
     * @return the Old Currency
     */
    public Integer getOldCurrency() {
        return oldCurrency;
    }

    /**
     * Sets Old Currency.
     * <p>
     * An unsigned 16-bit field containing identifying information concerning the old local
     * unit of currency used in the Price cluster. The value of the Old Currency field should
     * match the values defined by ISO 4217.
     *
     * @param oldCurrency the Old Currency
     * @return the PublishCurrencyConversionCommand command
     */
    public PublishCurrencyConversionCommand setOldCurrency(final Integer oldCurrency) {
        this.oldCurrency = oldCurrency;
        return this;
    }

    /**
     * Gets New Currency.
     * <p>
     * An unsigned 16-bit field containing identifying information concerning the new local
     * unit of currency used in the Price cluster. The value of the New Currency field should
     * match the values defined by ISO 4217.
     *
     * @return the New Currency
     */
    public Integer getNewCurrency() {
        return newCurrency;
    }

    /**
     * Sets New Currency.
     * <p>
     * An unsigned 16-bit field containing identifying information concerning the new local
     * unit of currency used in the Price cluster. The value of the New Currency field should
     * match the values defined by ISO 4217.
     *
     * @param newCurrency the New Currency
     * @return the PublishCurrencyConversionCommand command
     */
    public PublishCurrencyConversionCommand setNewCurrency(final Integer newCurrency) {
        this.newCurrency = newCurrency;
        return this;
    }

    /**
     * Gets Conversion Factor.
     * <p>
     * The format and use of this field is the same as for the ConversionFactor attribute.
     *
     * @return the Conversion Factor
     */
    public Integer getConversionFactor() {
        return conversionFactor;
    }

    /**
     * Sets Conversion Factor.
     * <p>
     * The format and use of this field is the same as for the ConversionFactor attribute.
     *
     * @param conversionFactor the Conversion Factor
     * @return the PublishCurrencyConversionCommand command
     */
    public PublishCurrencyConversionCommand setConversionFactor(final Integer conversionFactor) {
        this.conversionFactor = conversionFactor;
        return this;
    }

    /**
     * Gets Conversion Factor Trailing Digit.
     * <p>
     * The format and use of this field is the same as for the ConversionFactorTrailingDigit
     * attribute.
     *
     * @return the Conversion Factor Trailing Digit
     */
    public Integer getConversionFactorTrailingDigit() {
        return conversionFactorTrailingDigit;
    }

    /**
     * Sets Conversion Factor Trailing Digit.
     * <p>
     * The format and use of this field is the same as for the ConversionFactorTrailingDigit
     * attribute.
     *
     * @param conversionFactorTrailingDigit the Conversion Factor Trailing Digit
     * @return the PublishCurrencyConversionCommand command
     */
    public PublishCurrencyConversionCommand setConversionFactorTrailingDigit(final Integer conversionFactorTrailingDigit) {
        this.conversionFactorTrailingDigit = conversionFactorTrailingDigit;
        return this;
    }

    /**
     * Gets Currency Change Control Flags.
     * <p>
     * A 32-bit mask that denotes the functions that are required to be carried out on
     * processing of this command.
     *
     * @return the Currency Change Control Flags
     */
    public Integer getCurrencyChangeControlFlags() {
        return currencyChangeControlFlags;
    }

    /**
     * Sets Currency Change Control Flags.
     * <p>
     * A 32-bit mask that denotes the functions that are required to be carried out on
     * processing of this command.
     *
     * @param currencyChangeControlFlags the Currency Change Control Flags
     * @return the PublishCurrencyConversionCommand command
     */
    public PublishCurrencyConversionCommand setCurrencyChangeControlFlags(final Integer currencyChangeControlFlags) {
        this.currencyChangeControlFlags = currencyChangeControlFlags;
        return this;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(providerId, ZclDataType.UNSIGNED_32_BIT_INTEGER);
        serializer.serialize(issuerEventId, ZclDataType.UNSIGNED_32_BIT_INTEGER);
        serializer.serialize(startTime, ZclDataType.UTCTIME);
        serializer.serialize(oldCurrency, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(newCurrency, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(conversionFactor, ZclDataType.UNSIGNED_32_BIT_INTEGER);
        serializer.serialize(conversionFactorTrailingDigit, ZclDataType.BITMAP_8_BIT);
        serializer.serialize(currencyChangeControlFlags, ZclDataType.UNSIGNED_32_BIT_INTEGER);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        providerId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
        issuerEventId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
        startTime = (Calendar) deserializer.deserialize(ZclDataType.UTCTIME);
        oldCurrency = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        newCurrency = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        conversionFactor = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
        conversionFactorTrailingDigit = (Integer) deserializer.deserialize(ZclDataType.BITMAP_8_BIT);
        currencyChangeControlFlags = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(320);
        builder.append("PublishCurrencyConversionCommand [");
        builder.append(super.toString());
        builder.append(", providerId=");
        builder.append(providerId);
        builder.append(", issuerEventId=");
        builder.append(issuerEventId);
        builder.append(", startTime=");
        builder.append(startTime);
        builder.append(", oldCurrency=");
        builder.append(oldCurrency);
        builder.append(", newCurrency=");
        builder.append(newCurrency);
        builder.append(", conversionFactor=");
        builder.append(conversionFactor);
        builder.append(", conversionFactorTrailingDigit=");
        builder.append(conversionFactorTrailingDigit);
        builder.append(", currencyChangeControlFlags=");
        builder.append(currencyChangeControlFlags);
        builder.append(']');
        return builder.toString();
    }

}
