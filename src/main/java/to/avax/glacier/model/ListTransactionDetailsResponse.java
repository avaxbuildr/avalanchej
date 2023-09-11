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

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;
import to.avax.glacier.model.TransactionDetails;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ListTransactionDetailsResponse
 */

public class ListTransactionDetailsResponse {
  @JsonProperty("nextPageToken")
  private String nextPageToken = null;

  @JsonProperty("transactions")
  private List<TransactionDetails> transactions = new ArrayList<TransactionDetails>();

  public ListTransactionDetailsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * A token, which can be sent as &#x60;pageToken&#x60; to retrieve the next page. If this field is omitted or empty, there are no subsequent pages.
   * @return nextPageToken
  **/

  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public ListTransactionDetailsResponse transactions(List<TransactionDetails> transactions) {
    this.transactions = transactions;
    return this;
  }

  public ListTransactionDetailsResponse addTransactionsItem(TransactionDetails transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/

  public List<TransactionDetails> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<TransactionDetails> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTransactionDetailsResponse listTransactionDetailsResponse = (ListTransactionDetailsResponse) o;
    return Objects.equals(this.nextPageToken, listTransactionDetailsResponse.nextPageToken) &&
        Objects.equals(this.transactions, listTransactionDetailsResponse.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionDetailsResponse {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
