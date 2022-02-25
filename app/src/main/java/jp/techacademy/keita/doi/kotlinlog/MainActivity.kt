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

    companion object {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        Log.d("kotlintest", "ログへの出力テスト")

        // 整数型の変数をnumという名前で作成して、10を代入する
        var num = 10
        Log.d("kotlintest", Integer.toString(num))

        // numに50を代入する
        // 変数や定数に .toString() と記述する方法もある
        num = 50
        Log.d("kotlintest", num.toString())

        val num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest", "10 + 5 - 2 * 4 / 2 = " + num1)

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest", "num2 < num3 = " + (num2 < num3))

        num = 60

        if (num >= 90) {
            Log.d("kotlintest", "優")
        } else if (num >= 75) {
            Log.d("kotlintest", "良")
        } else if (num >= 60) {
            Log.d("kotlintest", "可")
        } else {
            Log.d("kotlintest", "不可")
        }

        val drink = 1

        when (drink) {
            0 -> {
                Log.d("kotlintest", "コーヒーを注文しました")
            }
            1 -> Log.d("kotlintest", "紅茶を注文しました")
            2 -> Log.d("kotlintest", "ミルクを注文しました")
            else -> Log.d("kotlintest", "オーダーミスです")
        }

        val message = when (drink) {
            0 -> "コーヒーを注文しました"
            1 -> "紅茶を注文しました"
            2 -> "ミルクを注文しました"
            else -> "オーダーミスです"
        }
        Log.d("kotlintest", message)

        /*
        for (i in 1 until 6) {
            Log.d("kotlintest", "for文の " + i + "回目")
        }
        */

        var plus = 10 plus 5
        Log.d("kotlintest", plus.toString())

        num = 1 //事前にvar num の定義が残っている場合は、エラーがでるので、var を削除しましょう。

        while (num < 6) {
            Log.d("kotlintest", "while文の " + num + "回目")
            num++
        }

        val points = arrayOf(10, 6, 15, 23, 17)

        for (i in points) {
            Log.d("kotlintest", i.toString())
        }

        val asc = Array(5, { i -> (i * i).toString() })
        asc.forEach {
            Log.d("kotlintest", it)
        }

        val numA = 100
        val numB = 0
        var ans = 0

        try{
            ans = numA / numB
        } catch (e : Exception) {
            Log.d("kotlintest", "0で割ろうとしました")
            // 例外情報から、メッセージを表示
            Log.d("kotlintest", e.message.toString())
        } finally {
            Log.d("kotlintest", "ans = " + ans.toString())
        }

        // 引数に50と1000を指定してtotal関数を呼び出す
//        total(50, 1000)

        // 引数の値を変えることで処理内容を簡単に変更できる
//        total(1, 1111)

        val t = total(50, 1000)   // ここでtotalからsumを返してもらう
        Log.d("kotlintest", t.toString())
        */

//        val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
//
//        dog.say()
//        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")
//
//        val bigdog = BigDog("ヨーゼフ", 15)     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る
//
//        bigdog.say()
//        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")

        val str1 = "Hello"
        val str2 = "World"
        val str3 = "Hello"

        if (str1.equals(str2)) {
            Log.d("kotlintest", "str1とstr2は一緒です")
        } else {
            Log.d("kotlintest", "str1とstr2は異なります")
        }

        if (str1.equals(str3)) {
            Log.d("kotlintest", "str1とstr3は一緒です")
        } else {
            Log.d("kotlintest", "str1とstr3は異なります")
        }

//        val i = 100
//        val str = i.toString() + " * 100 = ${i * 100}"
//        Log.d("kotlintest", str)

        Human("a",0,"a").think()

        val str: String? = null
        val l = str?.length ?: -1
        Log.d("kotlintest", l.toString())
    }

    /*
    // firstとlast、2つの引数を指定する
    private fun total(first: Int, last: Int) {
        var sum = 0
        for (i in first..last)  {
            sum += i
        }

        Log.d("kotlintest", sum.toString())
    }
    */

    // firstとlast、2つの引数と戻り値の型（int）を指定した関数に修正
    private fun total(first: Int, last: Int): Int {
        var sum = 0
        for (i in first..last)  {
            sum += i
        }

        return sum
    }

    infix fun Int.plus(x: Int): Int {
        return this + x
    }
}