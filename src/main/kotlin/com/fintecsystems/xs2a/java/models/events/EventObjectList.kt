package com.fintecsystems.xs2a.java.models.events

import com.fintecsystems.xs2a.java.models.common.PaginatedList
import com.squareup.moshi.Json

class EventObjectList(
    @Json(name = "total")
    total: Int,
    @Json(name = "per_page")
    perPage: Int,
    @Json(name = "current_page")
    currentPage: Int,
    @Json(name = "last_page")
    lastPage: Int,
    @Json(name = "from")
    from: Int,
    @Json(name = "to")
    to: Int,
    @Json(name = "data")
    data: List<EventObject>
): PaginatedList<EventObject>(total, perPage, currentPage, lastPage, from, to, data)