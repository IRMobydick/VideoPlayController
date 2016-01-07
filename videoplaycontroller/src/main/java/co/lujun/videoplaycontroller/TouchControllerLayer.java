package co.lujun.videoplaycontroller;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;

/**
 * Author: lujun(http://blog.lujun.co)
 * Date: 2015/12/18 11:34
 */
public class TouchControllerLayer extends ViewGroup {

    /** Video title size*/
    private int mVTitleSize;

    /** Controlling title size*/
    private int mCTitleSize;

    /** Time size**/
    private int mTimeSize;

    /** Video title color*/
    private int mVTitleColor;

    /** Controlling title color*/
    private int mCTitleColor;

    /** Time color*/
    private int mTimeColor;

    /** Current volume(0-100)*/
    private int mCurVolume;

    /** Screen orientation*/
    private int mScreenOrientation;

    /** Video title*/
    private String mVideoTitle;

    /** Controlling title*/
    private String mControlingTitle;

    /** Current brightness(0-100)*/
    private int mCurBrightness;

    /** Current play progress*/
    private int mCurProgress;

    private int mScreenWidth = 0;

    private int mScreenHeight = 0;

    public TouchControllerLayer(Context context){
        this(context, null);
    }

    public TouchControllerLayer(Context context, AttributeSet attrs){
        this(context, attrs, 0);
    }

    public TouchControllerLayer(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr){
        DisplayMetrics metrics = new DisplayMetrics();
        WindowManager manager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        manager.getDefaultDisplay().getMetrics(metrics);
        mScreenWidth = metrics.widthPixels;
        mScreenHeight = metrics.heightPixels;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        measureChildren(widthMeasureSpec, heightMeasureSpec);

        int widthMeasureSpecSize = MeasureSpec.getSize(widthMeasureSpec);
        int widthMeasureSpecMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMeasureSpaceSize = MeasureSpec.getSize(heightMeasureSpec);
        int heightMeasureSpaceMode = MeasureSpec.getMode(heightMeasureSpec);

        if (mScreenOrientation == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE){

        }else if (mScreenOrientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT){

        }else {
            setMeasuredDimension(0, 0);
        }

//        if (widthMeasureSpecMode == MeasureSpec.AT_MOST
//                && heightMeasureSpaceMode == MeasureSpec.AT_MOST){
//            setMeasuredDimension(0, 0);
//        }else if (widthMeasureSpecMode == MeasureSpec.AT_MOST){
//            setMeasuredDimension(0, heightMeasureSpaceSize);
//        }else if (heightMeasureSpaceMode == MeasureSpec.AT_MOST){
//            setMeasuredDimension(widthMeasureSpecSize, 0);
//        }
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
