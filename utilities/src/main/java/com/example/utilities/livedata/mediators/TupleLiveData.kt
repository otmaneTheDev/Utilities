package com.example.utilities.livedata.mediators

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData

class PairLiveData<A, B>(first: LiveData<A>, second: LiveData<B>) : MediatorLiveData<Pair<A?, B?>>() {
    init {
        addSource(first) { value = Pair(it, second.value) }
        addSource(second) { value = Pair(first.value, it) }
    }
}

class TripleLiveData<A, B, C>(first: LiveData<A>, second: LiveData<B>, third: LiveData<C>) : MediatorLiveData<Triple<A?, B?, C?>>() {
    init {
        addSource(first) { value = Triple(it, second.value, third.value) }
        addSource(second) { value = Triple(first.value, it, third.value) }
        addSource(third) { value = Triple(first.value, second.value, it) }
    }
}