package defpackage;

import android.os.SystemClock;
import java.util.Random;

/* renamed from: agng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agng {
    private final float a;
    private final Random b;

    private agng(float f, Random random) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        amrl.a(z, (Object) "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }

    public static agng a(float f) {
        return new agng(f, new Random(SystemClock.elapsedRealtime()));
    }

    public final boolean a() {
        return this.b.nextFloat() < this.a;
    }
}
