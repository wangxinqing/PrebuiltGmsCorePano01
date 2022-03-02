package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.cast.JGCastService;

/* renamed from: vvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vvf extends Animator {
    public final ViewGroup a;
    public final ViewGroup b;
    public ValueAnimator c;
    public long d = 300;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    private TimeInterpolator k = new LinearInterpolator();
    private long l = 0;

    public vvf(ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = (ViewGroup) viewGroup.getParent();
    }

    public final void a(int i2, int i3, int i4, int i5) {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(i4 - i2, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(i5 - i3, JGCastService.FLAG_PRIVATE_DISPLAY));
        this.a.layout(i2, i3, i4, i5);
        ViewGroup viewGroup = this.a;
        if (Build.VERSION.SDK_INT < 29) {
            viewGroup.setLeft(i2);
            viewGroup.setTop(i3);
            viewGroup.setRight(i4);
            viewGroup.setBottom(i5);
            return;
        }
        viewGroup.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    public final void cancel() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c = null;
        }
    }

    public final void end() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.c = null;
        }
    }

    public final long getDuration() {
        return this.d;
    }

    public final TimeInterpolator getInterpolator() {
        return this.k;
    }

    public final long getStartDelay() {
        return this.l;
    }

    public final boolean isRunning() {
        return this.c != null;
    }

    public final Animator setDuration(long j2) {
        this.d = j2;
        return this;
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        this.k = timeInterpolator;
    }

    public final void setStartDelay(long j2) {
        this.l = j2;
    }

    public final void start() {
        if (!isRunning()) {
            wil.a(this.b, true);
            a(this.e, this.f, this.g, this.h);
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, this.j - this.i});
            this.c = ofInt;
            ofInt.setDuration(this.d);
            this.c.setInterpolator(this.k);
            this.c.addUpdateListener(new vvd(this));
            this.c.addListener(new vve(this));
            this.c.start();
        }
    }
}
