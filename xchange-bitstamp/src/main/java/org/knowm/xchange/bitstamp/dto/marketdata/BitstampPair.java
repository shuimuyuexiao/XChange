package org.knowm.xchange.bitstamp.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BitstampPair {

    private final String name;
    private final String urlSymbol;
    private final int baseDecimals;
    private final int counterDecimals;
    private final String minimumOrder;
    private final String trading;
    private final String description;

    public BitstampPair(
            @JsonProperty("name") String name,
            @JsonProperty("url_symbol") String urlSymbol,
            @JsonProperty("base_decimals") int baseDecimals,
            @JsonProperty("counter_decimals") int counterDecimals,
            @JsonProperty("minimum_order") String minimumOrder,
            @JsonProperty("trading") String trading,
            @JsonProperty("description") String description
            ) {
        this.name = name;
        this.urlSymbol = urlSymbol;
        this.baseDecimals = baseDecimals;
        this.counterDecimals = counterDecimals;
        this.minimumOrder = minimumOrder;
        this.trading = trading;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getUrlSymbol() {
        return urlSymbol;
    }

    public int getBaseDecimals() {
        return baseDecimals;
    }

    public int getCounterDecimals() {
        return counterDecimals;
    }

    public String getMinimumOrder() {
        return minimumOrder;
    }

    public String getTrading() {
        return trading;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "BitstampPairs [name = " + name
                + ",urlSymbol = " + urlSymbol
                + ",baseDecimals = " + baseDecimals
                + ",counterDecimals = " + counterDecimals
                + ",minimumOrder = " + minimumOrder
                + ",trading = " + trading
                + ",description = " + description + "]";
    }
}
