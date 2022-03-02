package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import com.google.android.gms.R;

/* renamed from: zd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class zd extends SeekBar {
    private final ze a;

    public zd(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ze zeVar = this.a;
        Drawable drawable = zeVar.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(zeVar.b.getDrawableState())) {
            zeVar.b.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        ze zeVar = this.a;
        if (zeVar.c != null) {
            int max = zeVar.b.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = zeVar.c.getIntrinsicWidth();
                int intrinsicHeight = zeVar.c.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth >> 1;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight >> 1;
                }
                zeVar.c.setBounds(-i, -i2, i, i2);
                float width = ((float) ((zeVar.b.getWidth() - zeVar.b.getPaddingLeft()) - zeVar.b.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) zeVar.b.getPaddingLeft(), (float) (zeVar.b.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    zeVar.c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public zd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public zd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aeq.a((View) this, getContext());
        ze zeVar = new ze(this);
        this.a = zeVar;
        zeVar.a(attributeSet, i);
    }
}
