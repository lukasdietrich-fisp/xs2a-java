
package com.fintecsystems.xs2a.java.models

import com.squareup.moshi.Json

/**
 * 
 * @param total Total number of results.
 * @param perPage Number of objects per page
 * @param currentPage Current page.
 * @param lastPage Last page, usually the total of available pages.
 * @param from Showing results from index element.
 * @param to Showing results to index element.
 * @param data 
 */

data class PayTransactionList (
    /* Total number of results. */
    @Json(name = "total")
    val total: Int,
    /* Number of objects per page */
    @Json(name = "per_page")
    val perPage: Int,
    /* Current page. */
    @Json(name = "current_page")
    val currentPage: Int,
    /* Last page, usually the total of available pages. */
    @Json(name = "last_page")
    val lastPage: Int,
    /* Showing results from index element. */
    @Json(name = "from")
    val from: Int,
    /* Showing results to index element. */
    @Json(name = "to")
    val to: Int,
    @Json(name = "data")
    val data: List<PayObject>
)
