package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import com.google.android.gms.R;

/* renamed from: vwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vwn extends RotateDrawable {
    public int a = 8000;
    public ValueAnimator b;
    private final Context c;
    private Drawable d;
    private int e = 0;
    private int f = 0;

    public vwn(Context context) {
        this.c = context;
    }

    public final Drawable a() {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable;
        }
        Drawable a2 = kf.a(this.c, (int) R.drawable.sharing_progress_waiting);
        this.d = a2;
        setDrawable(a2);
        return a2;
    }

    public final void draw(Canvas canvas) {
        a();
        canvas.save();
        canvas.translate((float) this.e, (float) this.f);
        super.draw(canvas);
        canvas.restore();
    }

    public final void invalidateSelf() {
        a();
        super.invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        super.onLevelChange((i * 4) % 10000);
        a().setLevel(this.a);
        return true;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        this.e = i;
        this.f = i2;
        super.setBounds(0, 0, i3 - i, i4 - i2);
    }
}
