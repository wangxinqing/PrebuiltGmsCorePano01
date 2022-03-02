package defpackage;

import android.animation.TimeInterpolator;

/* renamed from: aeng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeng implements TimeInterpolator {
    private final TimeInterpolator a;

    public aeng(TimeInterpolator timeInterpolator) {
        this.a = timeInterpolator;
    }

    public static TimeInterpolator a(boolean z, TimeInterpolator timeInterpolator) {
        return !z ? new aeng(timeInterpolator) : timeInterpolator;
    }

    public final float getInterpolation(float f) {
        return 1.0f - this.a.getInterpolation(f);
    }
}
