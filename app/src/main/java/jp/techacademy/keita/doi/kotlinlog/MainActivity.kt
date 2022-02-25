package jp.techacademy.keita.doi.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

// パッケージレベルに定義した定数
const val MY_TAG = "kotlintest"

// パッケージレベルに定義した関数
fun formatMyTag(): String {
    return "[$MY_TAG]"
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var human1 = Human("human1", 10, "hobby_a")
        human1.say()
        human1.think()

        var human2 = Human("human2", 5, "hobby_b")
        human2.say()
        human2.think()
    }
}