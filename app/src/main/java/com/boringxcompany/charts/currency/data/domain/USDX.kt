package com.boringxcompany.charts.currency.data.domain

import kotlinx.serialization.Serializable

@Serializable
data class USDX(
    val CHANGE24HOUR: Double,
    val CHANGEDAY: Double,
    val CHANGEHOUR: Double,
    val CHANGEPCT24HOUR: Double,
    val CHANGEPCTDAY: Double,
    val CHANGEPCTHOUR: Double,
    val CIRCULATINGSUPPLY: Double,
    val CIRCULATINGSUPPLYMKTCAP: Double,
    val CONVERSIONLASTUPDATE: Int,
    val CONVERSIONSYMBOL: String,
    val CONVERSIONTYPE: String,
    val FLAGS: String,
    val FROMSYMBOL: String,
    val HIGH24HOUR: Double,
    val HIGHDAY: Double,
    val HIGHHOUR: Double,
    val IMAGEURL: String,
    val LASTMARKET: String,
    val LASTTRADEID: String,
    val LASTUPDATE: Int,
    val LASTVOLUME: Double,
    val LASTVOLUMETO: Double,
    val LOW24HOUR: Double,
    val LOWDAY: Double,
    val LOWHOUR: Double,
    val MARKET: String,
    val MEDIAN: Double,
    val MKTCAP: Double,
    val MKTCAPPENALTY: Int,
    val OPEN24HOUR: Double,
    val OPENDAY: Double,
    val OPENHOUR: Double,
    val PRICE: Double,
    val SUPPLY: Double,
    val TOPTIERVOLUME24HOUR: Double,
    val TOPTIERVOLUME24HOURTO: Double,
    val TOSYMBOL: String,
    val TOTALTOPTIERVOLUME24H: Double,
    val TOTALTOPTIERVOLUME24HTO: Double,
    val TOTALVOLUME24H: Double,
    val TOTALVOLUME24HTO: Double,
    val TYPE: String,
    val VOLUME24HOUR: Double,
    val VOLUME24HOURTO: Double,
    val VOLUMEDAY: Double,
    val VOLUMEDAYTO: Double,
    val VOLUMEHOUR: Double,
    val VOLUMEHOURTO: Double
)