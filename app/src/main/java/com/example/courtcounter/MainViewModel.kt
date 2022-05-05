package com.example.courtcounter

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    /**
     * Mutable LiveData for Team A
     */
    private val _score_A = MutableLiveData<Int>()
    val score_A : LiveData<Int>
    get() = _score_A

    /**
     * Mutable LiveData for Team A
     */
    private val _score_B = MutableLiveData<Int>()
    val score_B : LiveData<Int>
    get() = _score_B


    /**
     * Initialize block setting the scores to Zeros
     */
    init {
    Log.i("initial", "value is 0")
    _score_A.value= 0
        _score_B.value = 0
    }



    /**
     * onePoint() is called when the +1 point is clicked  for Team A
     * 1 point is then added to the score of Team A
     */
    fun onePoint_A (): LiveData<Int>{
        _score_A.value=_score_A.value?.plus(1)
        Log.i("onePoint", "one point is clicked $_score_A.value")
        return _score_A
    }


    /**
     * onePoint() is called when the +1 point is clicked  for Team B
     * 1 point is then added to the score of Team B
     */
    fun onePoint_B (): LiveData<Int>{
        _score_B.value=_score_B.value?.plus(1)
        Log.i("onePoint", "one point is clicked $_score_B.value")
        return _score_B
    }


    /**
     * threePoint is called when the +2 point is clicked for Team A
     * 2 point is then added to the score of Team A
     */
    fun twoPoint_A(): LiveData<Int>{
        _score_A.value = _score_A.value?.plus(2)
        return _score_A
    }

    /**
     * twoPoint is called when the +2 point is clicked for Team B
     * 2 point is then added to the score of Team B
     */
    fun twoPoint_B(): LiveData<Int>{
        _score_B.value = _score_B.value?.plus(2)
        return _score_B
    }


    /**
     * threePoint is called when the +3 point is clicked for Team A
     * 3 point is then added to the score of Team A
     */
    fun threePoint_A(): LiveData<Int>{
        _score_A.value = _score_A.value?.plus(3)
        return _score_A
    }

    /**
     * threePoint is called when the +3 point is clicked for Team B
     * 3 point is then added to the score of Team B
     */
    fun threePoint_B(): LiveData<Int>{
        _score_B.value = _score_B.value?.plus(3)
        return _score_B
    }

    fun Reset(){
        _score_A.value = 0
        _score_B.value = 0
    }




}