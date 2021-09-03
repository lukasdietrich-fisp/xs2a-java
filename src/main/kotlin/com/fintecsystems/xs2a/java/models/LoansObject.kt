
package com.fintecsystems.xs2a.java.models


import com.squareup.moshi.Json

/**
 * 
 * @param loansCount Number of different recognized loan agreements.
 * @param loansAmount Sum of monthly loan commitments, i. Sum of all rates of current loan commitments.
 * @param subprimeLenderCount The number of different subprime lenders is counted in this feature.
 */

data class LoansObject (
    /* Number of different recognized loan agreements. */
    @Json(name = "loans_count")
    val loansCount: Int,
    /* Sum of monthly loan commitments, i. Sum of all rates of current loan commitments. */
    @Json(name = "loans_amount")
    val loansAmount: Float,
    /* The number of different subprime lenders is counted in this feature. */
    @Json(name = "subprime_lender_count")
    val subprimeLenderCount: Int
)

