package jp.techacademy.keita.doi.kotlinlog

import android.util.Log

class Human(name: String, age: Int, var hobby: String) : Animal(name, age), Thinkable {

    override fun say() {
        Log.d(formatMyTag(), "私の名前は" + this.name + "です。年は" + this.age + "です。")
    }

    override fun think() {
        Log.d(formatMyTag(), "私は" + this.hobby + "について考える。")
    }
}