package me.giocode

import kotlin.random.Random

class RandomizedSet {

    val storage = mutableListOf<Int>()

    fun insert(value: Int): Boolean {
        if (!storage.contains(value)) {
            storage.add(value)
            return true
        }
        return false
    }

    fun remove(value: Int): Boolean {
        if (storage.contains(value)) {
            storage.remove(value)
            return true
        }
        return false
    }

    fun getRandom(): Int {
        return if (storage.count() == 1)
            storage[0] else
            storage[Random.nextInt(0, storage.count() - 1)]
    }

    fun toIntList(): List<Int> {
        return storage
    }
}