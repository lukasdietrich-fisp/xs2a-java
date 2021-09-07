package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json
import java.time.LocalDateTime

/**
 *
 * @param accounts
 * @param `object` Object type, in this case a  xs2a_all_accounts_check
 * @param createdAt Creation date of the object
 */

data class Xs2aAllAccountsCheckResponse(
    @Json(name = "accounts")
    var accounts: List<BankAccountObject>,
    /* Object type, in this case a  xs2a_all_accounts_check */
    @Json(name = "object")
    var `object`: String,
    /* Creation date of the object */
    @Json(name = "created_at")
    var createdAt: LocalDateTime
)

