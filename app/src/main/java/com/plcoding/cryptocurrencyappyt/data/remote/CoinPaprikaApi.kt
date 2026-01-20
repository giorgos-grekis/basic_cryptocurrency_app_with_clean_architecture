package com.plcoding.cryptocurrencyappyt.data.remote

import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDto
import retrofit2.http.GET

class CoinPaprikaApi {

//    https://api.coinpaprika.com/v1/coins

//    {
    //    "id": "btc-bitcoin",
    //    "name": "Bitcoin",
    //    "symbol": "BTC",
    //    "rank": 1,
    //    "is_new": false,
    //    "is_active": true,
    //    "type": "coin"
//     },
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coindId: String):
}