package com.example.mahmoud.quizapp;

/**
 * Created by Mahmoud on 2/24/2018.
 */

public class TrueOrFalse {
    private int mQusetionId;
    private boolean trueOrfalse;

    public TrueOrFalse(int mQusetionId, boolean trueOrfalse) {
        this.mQusetionId = mQusetionId;
        this.trueOrfalse = trueOrfalse;
    }

    public int getmQusetionId() {
        return mQusetionId;
    }

    public void setmQusetionId(int mQusetionId) {
        this.mQusetionId = mQusetionId;
    }

    public boolean isTrueOrfalse() {
        return trueOrfalse;
    }

    public void setTrueOrfalse(boolean trueOrfalse) {
        this.trueOrfalse = trueOrfalse;
    }
}
