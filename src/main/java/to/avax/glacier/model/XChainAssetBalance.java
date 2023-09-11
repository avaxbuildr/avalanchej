/*
 *
 * Crypto.bi AvalancheJ - An experimental (unofficial) Java library for interacting with the Avalanche Platform
 * Copyright (C) 2023 REKTBuildr
 *
 *
 * For more information, visit:
 * https://crypto.bi
 *
 *
 **/
package to.avax.glacier.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;

import java.io.IOException;
import java.math.BigDecimal;
/**
 * XChainAssetBalance
 */

public class XChainAssetBalance {
  @JsonProperty("assetId")
  private String assetId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("denomination")
  private BigDecimal denomination = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("utxoCount")
  private BigDecimal utxoCount = null;

  public XChainAssetBalance assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Unique ID for an asset.
   * @return assetId
  **/

  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public XChainAssetBalance name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of this asset.
   * @return name
  **/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public XChainAssetBalance symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol for this asset (max 4 characters).
   * @return symbol
  **/

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public XChainAssetBalance denomination(BigDecimal denomination) {
    this.denomination = denomination;
    return this;
  }

   /**
   * Denomination of this asset to represent fungibility.
   * @return denomination
  **/

  public BigDecimal getDenomination() {
    return denomination;
  }

  public void setDenomination(BigDecimal denomination) {
    this.denomination = denomination;
  }

  public XChainAssetBalance type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of asset like SECP256K1 or NFT.
   * @return type
  **/

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public XChainAssetBalance amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount of the asset.
   * @return amount
  **/

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public XChainAssetBalance utxoCount(BigDecimal utxoCount) {
    this.utxoCount = utxoCount;
    return this;
  }

   /**
   * Get utxoCount
   * @return utxoCount
  **/

  public BigDecimal getUtxoCount() {
    return utxoCount;
  }

  public void setUtxoCount(BigDecimal utxoCount) {
    this.utxoCount = utxoCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XChainAssetBalance xchainAssetBalance = (XChainAssetBalance) o;
    return Objects.equals(this.assetId, xchainAssetBalance.assetId) &&
        Objects.equals(this.name, xchainAssetBalance.name) &&
        Objects.equals(this.symbol, xchainAssetBalance.symbol) &&
        Objects.equals(this.denomination, xchainAssetBalance.denomination) &&
        Objects.equals(this.type, xchainAssetBalance.type) &&
        Objects.equals(this.amount, xchainAssetBalance.amount) &&
        Objects.equals(this.utxoCount, xchainAssetBalance.utxoCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, name, symbol, denomination, type, amount, utxoCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XChainAssetBalance {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    denomination: ").append(toIndentedString(denomination)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    utxoCount: ").append(toIndentedString(utxoCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
