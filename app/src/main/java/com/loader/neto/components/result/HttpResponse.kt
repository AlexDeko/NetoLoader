package com.loader.neto.components.result

interface HttpResponse {

    val statusCode: Int

    val statusMessage: String?

    val url: String?
}