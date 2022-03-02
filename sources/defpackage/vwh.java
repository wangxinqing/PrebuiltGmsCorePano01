package defpackage;

import java.util.Locale;

/* renamed from: vwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vwh {
    public final int a = ((int) aync.k());
    public final int b = ((int) aync.j());
    public long c;
    public double d = 0.0d;
    public double e = 0.0d;
    public boolean f = true;

    public final String toString() {
        return String.format(Locale.US, "WeightedAverage<lastValue: %s, smoothedValue: %s>", new Object[]{Double.valueOf(this.d), Double.valueOf(this.e)});
    }
}
