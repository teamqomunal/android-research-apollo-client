package com.qomunal.opensource.androidresearch.domain.retrofit

import androidx.annotation.Keep

sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : Resource<T>(data)
    class Loading<T>(data: T? = null) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
}

sealed class DownloadResource {
    @Keep
    data class Success(val localPath: String) : DownloadResource()

    @Keep
    data class Loading(val progress: Int? = 0) : DownloadResource()

    @Keep
    data class Error(val message: String) : DownloadResource()
}

