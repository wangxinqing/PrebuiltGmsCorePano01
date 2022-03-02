package com.google.android.gms.romanesco.restoresettings;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FastScroller extends RelativeLayout {
    public zwn a;
    public abk b;
    public boolean c;
    public View d;
    private final int e;
    private boolean f;

    public FastScroller(Context context) {
        super(context);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.fast_scroller_touch_target_width);
    }

    private static final int a(int i, int i2) {
        return Math.min(Math.max(0, i2), i);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = findViewById(R.id.fast_scroller_scroll_bar);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.c || Build.VERSION.SDK_INT < 23) {
            return false;
        }
        float f2 = 0.0f;
        if (!this.f && ((float) (getWidth() - this.e)) - motionEvent.getX() > 0.0f) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            this.f = false;
            this.d.setSelected(false);
            return true;
        }
        this.f = true;
        this.d.setSelected(true);
        a(motionEvent.getY());
        float y = motionEvent.getY();
        int a2 = this.a.a();
        if (this.d.getY() != 0.0f) {
            if (this.d.getY() + ((float) this.d.getHeight()) < ((float) getHeight())) {
                f2 = y / ((float) getHeight());
            } else {
                f2 = 1.0f;
            }
        }
        this.b.e(a(a2 - 1, (int) (f2 * ((float) a2))), 0);
        return true;
    }

    public final void a(float f2) {
        int height = this.d.getHeight();
        this.d.setY((float) a(getHeight() - height, (int) (f2 - ((float) (height / 2)))));
    }

    public FastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.fast_scroller_touch_target_width);
    }
}
