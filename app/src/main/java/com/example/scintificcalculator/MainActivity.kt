package com.example.scintificcalculator

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.scintificcalculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {


    private lateinit var calTxt: TextView
    private lateinit var resultTxt: TextView

    private lateinit var btn0: Button
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button

    private lateinit var logBtn: Button
    private lateinit var lnBtn: Button
    private lateinit var brac2: Button
    private lateinit var brac1: Button
    private lateinit var expBtn: Button
    private lateinit var delBtn: Button
    private lateinit var acBtn: Button
    private lateinit var multBtn: Button
    private lateinit var divBtn: Button
    private lateinit var plusBtn: Button
    private lateinit var minusBtn: Button
    private lateinit var ansBtn: Button
    private lateinit var equalBtn: Button
    private lateinit var dotBtn: Button

    private lateinit var piBtn: Button
    private lateinit var percentBtn: Button

    private lateinit var sinBtn: Button
    private lateinit var cosBtn: Button
    private lateinit var tanBtn: Button
    private lateinit var asinBtn: Button
    private lateinit var acosBtn: Button
    private lateinit var atanBtn: Button
    private lateinit var sinhBtn: Button
    private lateinit var tanhBtn: Button

    private lateinit var sqrtBtn: Button
    private lateinit var powBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            R.layout.activity_main
        )

        calTxt = binding.calTxt
        resultTxt = binding.resultTxt

        btn0 = binding.btn0
        btn1 = binding.btn1
        btn2 = binding.btn2
        btn3 = binding.btn3
        btn4 = binding.btn4
        btn5 = binding.btn5
        btn6 = binding.btn6
        btn7 = binding.btn7
        btn8 = binding.btn8
        btn9 = binding.btn9
        dotBtn = binding.dotBtn


        brac2 = binding.brac2
        brac1 = binding.brac1

        logBtn = binding.logBtn
        lnBtn = binding.lnBtn
        sinBtn = binding.sinBtn
        cosBtn = binding.cosBtn
        tanBtn = binding.tanBtn
        expBtn = binding.expBtn

        asinBtn = binding.asinBtn
        acosBtn = binding.acosBtn
        atanBtn = binding.atanBtn
        percentBtn = binding.percentBtn
        sinhBtn = binding.sinhBtn
        tanhBtn = binding.tanhBtn
        sqrtBtn = binding.sqrtBtn
        powBtn = binding.powBtn

        delBtn = binding.delBtn
        acBtn = binding.acBtn

        multBtn = binding.multBtn
        divBtn = binding.divBtn
        plusBtn = binding.plusBtn
        minusBtn = binding.minusBtn

        ansBtn = binding.ansBtn
        equalBtn = binding.equalBtn
        piBtn = binding.piBtn


        btn0.setOnClickListener {
            "${calTxt.text}0".also { calTxt.text = it }
        }

        btn1.setOnClickListener {
            "${calTxt.text}1".also { calTxt.text = it }
        }

        btn2.setOnClickListener {
            prepareTxt()
            "${calTxt.text}2".also { calTxt.text = it }
        }

        btn3.setOnClickListener {
            prepareTxt()
            "${calTxt.text}3".also { calTxt.text = it }
        }

        btn4.setOnClickListener {
            prepareTxt()
            "${calTxt.text}4".also { calTxt.text = it }
        }

        btn5.setOnClickListener {
            prepareTxt()
            "${calTxt.text}5".also { calTxt.text = it }
        }

        btn6.setOnClickListener {
            prepareTxt()
            "${calTxt.text}6".also { calTxt.text = it }
        }

        btn7.setOnClickListener {
            prepareTxt()
            "${calTxt.text}7".also { calTxt.text = it }
        }

        btn8.setOnClickListener {
            prepareTxt()
            "${calTxt.text}8".also { calTxt.text = it }
        }

        btn9.setOnClickListener {
            prepareTxt()
            "${calTxt.text}9".also { calTxt.text = it }
        }

        dotBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}.".also { calTxt.text = it }
        }

        plusBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}+".also { calTxt.text = it }
        }

        multBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}*".also { calTxt.text = it }
        }

        minusBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}-".also { calTxt.text = it }
        }

        divBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}/".also { calTxt.text = it }
        }

        logBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}log".also { calTxt.text = it }
        }

        lnBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}ln".also { calTxt.text = it }
        }

        sinBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}sin".also { calTxt.text = it }
        }

        cosBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}cos".also { calTxt.text = it }
        }

        tanBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}tan".also { calTxt.text = it }
        }

        brac1.setOnClickListener {
            prepareTxt()
            "${calTxt.text}(".also { calTxt.text = it }
        }

        brac2.setOnClickListener {
            prepareTxt()
            "${calTxt.text})".also { calTxt.text = it }
        }
        expBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}e".also { calTxt.text = it }
        }
        piBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}pi".also { calTxt.text = it }
        }

        asinBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}asin".also { calTxt.text = it }
        }
        acosBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}acos".also { calTxt.text = it }
        }
        atanBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}atan".also { calTxt.text = it }
        }
        sinhBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}sinh".also { calTxt.text = it }
        }
        tanhBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}tanh".also { calTxt.text = it }
        }
        sqrtBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}sqrt".also { calTxt.text = it }
        }

        powBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}^".also { calTxt.text = it }
        }
        powBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}^".also { calTxt.text = it }
        }
        percentBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}%".also { calTxt.text = it }
        }
        sqrtBtn.setOnClickListener {
            prepareTxt()
            "${calTxt.text}sqrt".also { calTxt.text = it }
        }



        acBtn.setOnClickListener {
            calTxt.text = "0"
            resultTxt.text = "0"
        }

        delBtn.setOnClickListener {
            calTxt.text = removeLastChar(calTxt.text.toString())
        }

        equalBtn.setOnClickListener {
            resultTxt.text = showResult()//secondNo.toString()
        }

        ansBtn.setOnClickListener {
            calTxt.text = showResult()//secondNo.toString()
        }
    }

    private fun showResult(): String {
        try {
            val text = calTxt.text.toString()
            val expBuild = ExpressionBuilder(text).build()
            val eval = expBuild.evaluate()
            val longEval = eval.toLong()
            return if (eval == longEval.toDouble()) {
                longEval.toString()
            } else {
                eval.toString()
            }
        } catch (e: Exception) {
            Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
        }
        return "0"
    }

    private fun prepareTxt() {
        if (calTxt.text.toString() == "0") {
            calTxt.text = ""
        }
    }

    private fun removeLastChar(s: String?): String? {
        return if (s == null || s.isEmpty()) {
            "0"
        } else s.substring(0, s.length - 1)
    }
}

fun <T> T.lazyLog(tag: String = "LAZY_LOG"): T {
    Log.i(tag, toString())
    return this
}