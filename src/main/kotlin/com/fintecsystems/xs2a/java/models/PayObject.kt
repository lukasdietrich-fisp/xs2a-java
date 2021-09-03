
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param id Transaction id
 * @param transaction Internal XS2A transaction id. This id will be the same for the whole transaction
 * @param senderHolder Account holder of the sender account
 * @param senderIban IBAN of the sender account
 * @param senderBic BIC of the sender account
 * @param senderBankName Name of the sender bank
 * @param senderCountryId Two letter country code id, e.g. AT, CH, DE or the sender account
 * @param recipientHolder Account holder of the recipient account
 * @param recipientIban IBAN of the recipient account
 * @param recipientBic BIC of the recipient account
 * @param recipientBankName Name of the recipient bank
 * @param recipientCountryId Two letter country code id, e.g. AT, CH, DE or the recipient account
 * @param purpose Purpose of transfer
 * @param amount Amount to transfer
 * @param currencyId Currency id of amount, e.g. 'EUR'
 * @param testmode Indicates whether or not it is a test transaction
 * @param paymentStatus Payment status of the transaction, values NONE, RECEIVED, LOSS
 * @param metadata Custom data will be returned unchanged. If no data was submitted, this field will be null
 * @param merchantId Data will be returned unchanged
 * @param `object` Object type, in this case a xs2a_payment
 */

data class PayObject (
    /* Transaction id */
    @Json(name = "id")
    val id: String,
    /* Internal XS2A transaction id. This id will be the same for the whole transaction */
    @Json(name = "transaction")
    val transaction: String,
    /* Account holder of the sender account */
    @Json(name = "sender_holder")
    val senderHolder: String? = null,
    /* IBAN of the sender account */
    @Json(name = "sender_iban")
    val senderIban: String? = null,
    /* BIC of the sender account */
    @Json(name = "sender_bic")
    val senderBic: String? = null,
    /* Name of the sender bank */
    @Json(name = "sender_bank_name")
    val senderBankName: String? = null,
    /* Two letter country code id, e.g. AT, CH, DE or the sender account */
    @Json(name = "sender_country_id")
    val senderCountryId: CountryId? = null,
    /* Account holder of the recipient account */
    @Json(name = "recipient_holder")
    val recipientHolder: String? = null,
    /* IBAN of the recipient account */
    @Json(name = "recipient_iban")
    val recipientIban: String? = null,
    /* BIC of the recipient account */
    @Json(name = "recipient_bic")
    val recipientBic: String? = null,
    /* Name of the recipient bank */
    @Json(name = "recipient_bank_name")
    val recipientBankName: String? = null,
    /* Two letter country code id, e.g. AT, CH, DE or the recipient account */
    @Json(name = "recipient_country_id")
    val recipientCountryId: CountryId? = null,
    /* Purpose of transfer */
    @Json(name = "purpose")
    val purpose: String,
    /* Amount to transfer */
    @Json(name = "amount")
    val amount: Float,
    /* Currency id of amount, e.g. 'EUR' */
    @Json(name = "currency_id")
    val currencyId: CurrencyId? = null,
    /* Indicates whether or not it is a test transaction */
    @Json(name = "testmode")
    val testmode: Boolean,
    /* Payment status of the transaction, values NONE, RECEIVED, LOSS */
    @Json(name = "payment_status")
    val paymentStatus: PaymentStatus,
    /* Custom data will be returned unchanged. If no data was submitted, this field will be null */
    @Json(name = "metadata")
    val metadata: Map<String, Any>? = null,
    /* Data will be returned unchanged */
    @Json(name = "merchant_id")
    val merchantId: String? = null,
    /* Object type, in this case a xs2a_payment */
    @Json(name = "object")
    val `object`: String
)

enum class PaymentStatus(val value: String) {
    @Json(name = "RECEIVED")
    RECEIVED("RECEIVED"),

    @Json(name = "LOSS")
    LOSS("LOSS"),

    @Json(name = "NONE")
    NONE("NONE");

    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
     **/
    override fun toString(): String {
        return value
    }
}