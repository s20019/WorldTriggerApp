package jp.ac.it_college.std.s20019.worldtriggerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.ac.it_college.std.s20019.worldtriggerapp.databinding.ActivityPlayBinding
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader

class PlayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // JSONファイルを読み込む処理
        val assetManager = resources.assets
        val inputStream = assetManager.open("question.json")
        val bufferedReader = BufferedReader(InputStreamReader(inputStream))
        val str: String = bufferedReader.readText()

        val jsonObject = JSONObject(str)
        val triggerArray = jsonObject.getJSONArray("trigger")
        val triggerObj = triggerArray.getJSONObject(0)
        val start = triggerObj.getString("start")

        // 最初の質問を表示
        binding.question.text = start

        var s = "s"           // 質問のおおもと
        val plus1 = "1"
        val plus2 = "2"

        binding.yesButton.setOnClickListener {
            // YESの場合は末尾に２が追加される
            s += plus2

            SensorySniper(s)
            PerfectAllRounder(s)
            SurpriseAttacker(s)
            CrazyAttacker(s)
            NaturalAttacker(s)
            CrossrangeAllRounder(s)
            MiddlerangeAllRounder(s)
            Shooter(s)
            TacticsSniper(s)
            HappyOperator(s)
            Osamu(s)

            binding.question.text = triggerObj.getString(s)
        }

        binding.noButton.setOnClickListener {
            // NOの場合は末尾に１が追加される
            s += plus1

            SensorySniper(s)
            PerfectAllRounder(s)
            SurpriseAttacker(s)
            CrazyAttacker(s)
            NaturalAttacker(s)
            CrossrangeAllRounder(s)
            MiddlerangeAllRounder(s)
            Shooter(s)
            TacticsSniper(s)
            HappyOperator(s)
            Osamu(s)

            binding.question.text = triggerObj.getString(s)
        }
    }

    private fun SensorySniper(trigger: String) {
        val list = listOf("s1221", "s111111", "s21111", "s2121", "s221111", "s12111", "s11121", "s1121111")

        if (trigger in list) {
            val assetManager = resources.assets
            val inputStream = assetManager.open("position.json")
            val bufferedReader = BufferedReader(InputStreamReader(inputStream))
            val str: String = bufferedReader.readText()

            val jsonObject = JSONObject(str)
            val positionArray = jsonObject.getJSONArray("position")
            val positionObj = positionArray.getJSONObject(0)

            val position = positionObj.getString(trigger)
            val upperText = "よくわからんが当たれたOK！"
            val lowerText = "ムダな所にこだわりがある！"
            val imageNum = 1

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("POSITION", position)
            intent.putExtra("UPPER", upperText)
            intent.putExtra("LOWER", lowerText)
            intent.putExtra("IMAGE", imageNum)
            startActivity(intent)
            finish()
        }
    }

    private fun PerfectAllRounder(trigger: String) {
        val list = listOf("s1111121", "s121121", "s12221", "s211121", "s21221", "s111221", "s2211121", "s11211121")

        if (trigger in list) {
            val assetManager = resources.assets
            val inputStream = assetManager.open("position.json")
            val bufferedReader = BufferedReader(InputStreamReader(inputStream))
            val str: String = bufferedReader.readText()

            val jsonObject = JSONObject(str)
            val positionArray = jsonObject.getJSONArray("position")
            val positionObj = positionArray.getJSONObject(0)

            val position = positionObj.getString(trigger)
            val upperText = "左フックからお菓子作りまで！"
            val lowerText = "トリオン怪獣を弟子にできるぞ！"
            val imageNum = 2

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("POSITION", position)
            intent.putExtra("UPPER", upperText)
            intent.putExtra("LOWER", lowerText)
            intent.putExtra("IMAGE", imageNum)
            startActivity(intent)
            finish()
        }
    }

    private fun SurpriseAttacker(trigger: String) {
        val list = listOf("s22212", "s22122", "s112122", "s112212")

        if (trigger in list) {
            val assetManager = resources.assets
            val inputStream = assetManager.open("position.json")
            val bufferedReader = BufferedReader(InputStreamReader(inputStream))
            val str: String = bufferedReader.readText()

            val jsonObject = JSONObject(str)
            val positionArray = jsonObject.getJSONArray("position")
            val positionObj = positionArray.getJSONObject(0)

            val position = positionObj.getString(trigger)
            val upperText = "血のにじむような首ちょんぱ！"
            val lowerText = "首ちょんぱしたりされたりするぞ！"
            val imageNum = 3

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("POSITION", position)
            intent.putExtra("UPPER", upperText)
            intent.putExtra("LOWER", lowerText)
            intent.putExtra("IMAGE", imageNum)
            startActivity(intent)
            finish()
        }
    }

    private fun CrazyAttacker(trigger: String) {
        val list = listOf("s11222", "s2222")

        if (trigger in list) {
            val assetManager = resources.assets
            val inputStream = assetManager.open("position.json")
            val bufferedReader = BufferedReader(InputStreamReader(inputStream))
            val str: String = bufferedReader.readText()

            val jsonObject = JSONObject(str)
            val positionArray = jsonObject.getJSONArray("position")
            val positionObj = positionArray.getJSONObject(0)

            val position = positionObj.getString(trigger)
            val upperText = "ヒャッハー！戦闘だァー！"
            val lowerText = "たよりになるけどあたまがわるい！"
            val imageNum = 4

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("POSITION", position)
            intent.putExtra("UPPER", upperText)
            intent.putExtra("LOWER", lowerText)
            intent.putExtra("IMAGE", imageNum)
            startActivity(intent)
            finish()
        }
    }

    private fun NaturalAttacker(trigger: String) {
        val list = listOf("s2221121", "s11221121", "s2212121", "s11212121", "s11112121", "s1212121", "s22112121", "s2112121")

        if (trigger in list) {
            val assetManager = resources.assets
            val inputStream = assetManager.open("position.json")
            val bufferedReader = BufferedReader(InputStreamReader(inputStream))
            val str: String = bufferedReader.readText()

            val jsonObject = JSONObject(str)
            val positionArray = jsonObject.getJSONArray("position")
            val positionObj = positionArray.getJSONObject(0)

            val position = positionObj.getString(trigger)
            val upperText = "はしゃぐネコ科の大動物！"
            val lowerText = "騙し合いはちょっぴり苦手だ！"
            val imageNum = 5

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("POSITION", position)
            intent.putExtra("UPPER", upperText)
            intent.putExtra("LOWER", lowerText)
            intent.putExtra("IMAGE", imageNum)
            startActivity(intent)
            finish()
        }
    }

    private fun CrossrangeAllRounder(trigger: String) {
        val list = listOf("s2221122", "s11221122", "s2212122", "s11212122", "s11112122", "s1212122", "s22112122", "s2112122")

        if (trigger in list) {
            val assetManager = resources.assets
            val inputStream = assetManager.open("position.json")
            val bufferedReader = BufferedReader(InputStreamReader(inputStream))
            val str: String = bufferedReader.readText()

            val jsonObject = JSONObject(str)
            val positionArray = jsonObject.getJSONArray("position")
            val positionObj = positionArray.getJSONObject(0)

            val position = positionObj.getString(trigger)
            val upperText = "器用さと不器用さの両立！"
            val lowerText = "マジメさを武器に貧乏くじを引こう！"
            val imageNum = 6

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("POSITION", position)
            intent.putExtra("UPPER", upperText)
            intent.putExtra("LOWER", lowerText)
            intent.putExtra("IMAGE", imageNum)
            startActivity(intent)
            finish()
        }
    }

    private fun MiddlerangeAllRounder(trigger: String) {
        val list = listOf("s22211111", "s112211111", "s22121111", "s112121111", "s111121111", "s12121111", "s221121111", "s21121111")

        if (trigger in list) {
            val assetManager = resources.assets
            val inputStream = assetManager.open("position.json")
            val bufferedReader = BufferedReader(InputStreamReader(inputStream))
            val str: String = bufferedReader.readText()

            val jsonObject = JSONObject(str)
            val positionArray = jsonObject.getJSONArray("position")
            val positionObj = positionArray.getJSONObject(0)

            val position = positionObj.getString(trigger)
            val upperText = "誰とでもうまくやれる！"
            val lowerText = "みんなでなかよく敵をハチの巣だ！"
            val imageNum = 7

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("POSITION", position)
            intent.putExtra("UPPER", upperText)
            intent.putExtra("LOWER", lowerText)
            intent.putExtra("IMAGE", imageNum)
            startActivity(intent)
            finish()
        }
    }

    private fun Shooter(trigger: String) {
        val list = listOf("s2221112", "s11221112", "2212112", "s11212112", "s11112112", "s1212112", "s22112112", "s2112112")

        if (trigger in list) {
            val assetManager = resources.assets
            val inputStream = assetManager.open("position.json")
            val bufferedReader = BufferedReader(InputStreamReader(inputStream))
            val str: String = bufferedReader.readText()

            val jsonObject = JSONObject(str)
            val positionArray = jsonObject.getJSONArray("position")
            val positionObj = positionArray.getJSONObject(0)

            val position = positionObj.getString(trigger)
            val upperText = "エビフライが大好き！"
            val lowerText = "弾を練りまわしてニヤニヤしよう！"
            val imageNum = 8

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("POSITION", position)
            intent.putExtra("UPPER", upperText)
            intent.putExtra("LOWER", lowerText)
            intent.putExtra("IMAGE", imageNum)
            startActivity(intent)
            finish()
        }
    }

    private fun TacticsSniper(trigger: String) {
        val list = listOf("s1111122", "s121122", "s12222", "s211122", "s21222", "s111222", "s2211122", "s11211122")

        if (trigger in list) {
            val assetManager = resources.assets
            val inputStream = assetManager.open("position.json")
            val bufferedReader = BufferedReader(InputStreamReader(inputStream))
            val str: String = bufferedReader.readText()

            val jsonObject = JSONObject(str)
            val positionArray = jsonObject.getJSONArray("position")
            val positionObj = positionArray.getJSONObject(0)

            val position = positionObj.getString(trigger)
            val upperText = "縁の下の頭脳派野郎！"
            val lowerText = "目立たないけど死ににくい！"
            val imageNum = 9

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("POSITION", position)
            intent.putExtra("UPPER", upperText)
            intent.putExtra("LOWER", lowerText)
            intent.putExtra("IMAGE", imageNum)
            startActivity(intent)
            finish()
        }
    }

    private fun HappyOperator(trigger: String) {
        val list = listOf("s22211112", "s112211112", "s22121112", "s112121112", "s111121112", "s12121112", "s221121112", "s21121112")

        if (trigger in list) {
            val assetManager = resources.assets
            val inputStream = assetManager.open("position.json")
            val bufferedReader = BufferedReader(InputStreamReader(inputStream))
            val str: String = bufferedReader.readText()

            val jsonObject = JSONObject(str)
            val positionArray = jsonObject.getJSONArray("position")
            val positionObj = positionArray.getJSONObject(0)

            val position = positionObj.getString(trigger)
            val upperText = "おかし片手に戦争だ！"
            val lowerText = "どら焼きもあるしけっこう楽しい！"
            val imageNum = 10

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("POSITION", position)
            intent.putExtra("UPPER", upperText)
            intent.putExtra("LOWER", lowerText)
            intent.putExtra("IMAGE", imageNum)
            startActivity(intent)
            finish()
        }
    }

    private fun Osamu(trigger: String) {
        val list = listOf("s111122", "s12122", "s221122", "s21122")

        if (trigger in list) {
            val assetManager = resources.assets
            val inputStream = assetManager.open("position.json")
            val bufferedReader = BufferedReader(InputStreamReader(inputStream))
            val str: String = bufferedReader.readText()

            val jsonObject = JSONObject(str)
            val positionArray = jsonObject.getJSONArray("position")
            val positionObj = positionArray.getJSONObject(0)

            val position = positionObj.getString(trigger)
            val upperText = "メガネがあれば才能なんて！"
            val lowerText = "君こそがこの漫画の主人公だ！"
            val imageNum = 11

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("POSITION", position)
            intent.putExtra("UPPER", upperText)
            intent.putExtra("LOWER", lowerText)
            intent.putExtra("IMAGE", imageNum)
            startActivity(intent)
            finish()
        }
    }
}