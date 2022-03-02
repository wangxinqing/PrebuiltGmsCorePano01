package defpackage;

import java.util.Locale;

/* renamed from: ahuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahuu {
    public final int a;
    public final long b;
    public final long c;
    public int d;
    public long e;

    public ahuu(int i, long j) {
        this.a = i;
        this.b = 1500;
        this.c = j;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "SensorScannerConfig [mNumSamplesToSkip=%d/%d, mTimeoutForSkip=%d, mSensorTimeSpan=%d, mMotionTimeoutForStop=%d]", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.e)});
    }

    public ahuu(int i, long j, long j2, long j3) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.e = j3;
    }
}
