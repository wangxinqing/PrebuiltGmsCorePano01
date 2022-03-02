package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.gms.R;

/* renamed from: yd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yd extends AppCompatImageView implements yi {
    final /* synthetic */ yh a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yd(yh yhVar, Context context) {
        super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
        this.a = yhVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        afg.a(this, getContentDescription());
        setOnTouchListener(new yc(this, this));
    }

    public final boolean d() {
        return false;
    }

    public final boolean e() {
        return false;
    }

    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.a.c();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            ma.a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
