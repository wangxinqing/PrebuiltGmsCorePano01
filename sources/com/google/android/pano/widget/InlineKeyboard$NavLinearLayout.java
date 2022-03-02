package com.google.android.pano.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InlineKeyboard$NavLinearLayout extends RelativeLayout implements akhe {
    private ViewGroup a;
    private View b;
    private int c;

    public InlineKeyboard$NavLinearLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final boolean a(akhd akhd) {
        int i;
        if (akhd.f == 3) {
            akhb akhb = (akhb) akhd;
            int i2 = akhb.d;
            if (i2 > 5) {
                i2 = 5;
            }
            int i3 = akhb.c;
            ViewGroup viewGroup = this.a;
            int indexOfChild = viewGroup.indexOfChild(viewGroup.getFocusedChild());
            int childCount = this.a.getChildCount();
            int i4 = i2 + 1;
            if (i3 == 17) {
                i = -2;
            } else {
                i = 2;
            }
            int i5 = indexOfChild + (i4 * i);
            int i6 = childCount - 1;
            if (i5 > i6) {
                i5 = i6;
            } else if (i5 < 0) {
                i5 = 0;
            }
            View childAt = this.a.getChildAt(i5);
            if (childAt != null) {
                childAt.requestFocus();
                return true;
            }
        }
        return false;
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.a.bringToFront();
        int x = ((int) view2.getX()) + ((view2.getWidth() - this.c) / 2);
        if (x < 0) {
            x = 0;
        } else if (x > this.a.getWidth() - this.c) {
            x = this.a.getWidth() - this.c;
        }
        invalidate();
        if (this.b.getVisibility() == 8) {
            this.b.setX((float) x);
            this.b.setVisibility(0);
            return;
        }
        this.b.animate().x((float) x).setDuration(250).setInterpolator(new DecelerateInterpolator(1.5f)).start();
    }

    public InlineKeyboard$NavLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InlineKeyboard$NavLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.keyboard_keys_layout, this, true);
        this.a = (ViewGroup) findViewById(R.id.keys);
        View findViewById = findViewById(R.id.circle);
        this.b = findViewById;
        findViewById.setVisibility(8);
        this.c = context.getResources().getDimensionPixelOffset(R.dimen.key_circle_size);
    }
}
