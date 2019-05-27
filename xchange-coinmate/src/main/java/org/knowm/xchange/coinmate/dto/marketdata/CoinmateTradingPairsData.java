package org.knowm.xchange.coinmate.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class CoinmateTradingPairsData {

    public String getName() {
        return name;
    }

    public String getFirstCurrency() {
        return firstCurrency;
    }

    public String getSecondCurrency() {
        return secondCurrency;
    }

    public int getPriceDecimals() {
        return priceDecimals;
    }

    public int getLotDecimals() {
        return lotDecimals;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public String getTradesWebSocketChannelId() {
        return tradesWebSocketChannelId;
    }

    public String getOrderBookWebSocketChannelId() {
        return orderBookWebSocketChannelId;
    }

    public String getTradeStatisticsWebSocketChannelId() {
        return tradeStatisticsWebSocketChannelId;
    }

    private final String name;
    private final String firstCurrency;
    private final String secondCurrency;
    private final int priceDecimals;
    private final int lotDecimals;
    private final BigDecimal minAmount;
    private final String tradesWebSocketChannelId;
    private final String orderBookWebSocketChannelId;
    private final String tradeStatisticsWebSocketChannelId;

    @JsonCreator
    public CoinmateTradingPairsData(
            @JsonProperty("name") String name,
            @JsonProperty("firstCurrency") String firstCurrency,
            @JsonProperty("secondCurrency") String secondCurrency,
            @JsonProperty("priceDecimals") int priceDecimals,
            @JsonProperty("lotDecimals") int lotDecimals,
            @JsonProperty("minAmount") BigDecimal minAmount,
            @JsonProperty("tradesWebSocketChannelId") String tradesWebSocketChannelId,
            @JsonProperty("orderBookWebSocketChannelId") String orderBookWebSocketChannelId,
            @JsonProperty("tradeStatisticsWebSocketChannelId") String tradeStatisticsWebSocketChannelId
    ){
        this.name = name;
        this.firstCurrency = firstCurrency;
        this.secondCurrency = secondCurrency;
        this.priceDecimals = priceDecimals;
        this.lotDecimals = lotDecimals;
        this.minAmount = minAmount;
        this.tradeStatisticsWebSocketChannelId = tradeStatisticsWebSocketChannelId;
        this.orderBookWebSocketChannelId = orderBookWebSocketChannelId;
        this.tradesWebSocketChannelId = tradesWebSocketChannelId;
    }

    @Override
    public String toString() {
        return "CoinmateTradingPairsData [name = " + name
                + ",firstCurrency = " + firstCurrency
                + ",secondCurrency = " + secondCurrency
                + ",priceDecimals = " + priceDecimals
                + ",lotDecimals = " + lotDecimals
                + ",minAmount = " + minAmount + "]";
    }
}
