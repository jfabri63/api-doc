package io.bitmax.api.examples.account.rest;

import io.bitmax.api.rest.client.BitMaxRestApiClientAccount;

public class GetOneOrderExample {
    public static void main(String[] args) {
        String apiKey = "<apikey>";
        String secret = "<secret>";

        BitMaxRestApiClientAccount restClient = new BitMaxRestApiClientAccount(apiKey, secret);

        System.out.println(restClient.getOrder("<order_coid>"));
    }
}
