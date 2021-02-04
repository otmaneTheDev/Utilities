package com.example.utilities.livedata.livedatastatus

class MutableLiveDataStatus<T> : LiveDataStatus<T>() {
    public override fun postLoading() {
        super.postLoading()
    }

    public override fun postError(throwable: Throwable?) {
        super.postError(throwable)
    }

    public override fun postSuccess(data: T) {
        super.postSuccess(data)
    }

    public override fun postEmpty() {
        super.postEmpty()
    }

}