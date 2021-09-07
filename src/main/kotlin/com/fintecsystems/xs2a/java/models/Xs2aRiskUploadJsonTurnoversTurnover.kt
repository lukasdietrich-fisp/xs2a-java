package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param bookingDate
 * @param amount
 * @param currency
 * @param purpose
 * @param counterIban
 * @param counterBic
 * @param counterHolder
 */

data class Xs2aRiskUploadJsonTurnoversTurnover(
    @Json(name = "booking_date")
    var bookingDate: LocalDateTime,
    @Json(name = "amount")
    var amount: Float,
    @Json(name = "currency")
    var currency: CurrencyId? = null,
    @Json(name = "purpose")
    var purpose: List<String>,
    @Json(name = "counter_iban")
    var counterIban: String? = null,
    @Json(name = "counter_bic")
    var counterBic: String? = null,
    @Json(name = "counter_holder")
    var counterHolder: String? = null,
)

