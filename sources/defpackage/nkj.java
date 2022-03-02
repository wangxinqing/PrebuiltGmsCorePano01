package defpackage;

import android.util.Log;

/* renamed from: nkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class nkj implements Runnable {
    private final nkk a;
    private final long b;

    public nkj(nkk nkk, long j) {
        this.a = nkk;
        this.b = j;
    }

    public final void run() {
        String str;
        double d;
        nkk nkk = this.a;
        long j = this.b;
        amkw b2 = amlv.b();
        if (b2 != null) {
            str = amlv.c(b2);
        } else {
            str = "<no trace>";
        }
        amks a2 = amlv.a(ammb.a);
        if (j >= ((long) nkk.c)) {
            double d2 = (double) j;
            double d3 = (double) nkk.b;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = Math.min(d2 / d3, 1.0d);
        } else {
            double d4 = (double) nkk.a;
            Double.isNaN(d4);
            d = 1.0d / d4;
        }
        Log.i("GmsTraceSample", String.format("%dms performing %s [%.1f%% sampled, %d omitted, %s]", new Object[]{Long.valueOf(j), str, Double.valueOf(d * 100.0d), Integer.valueOf(nkk.d.getAndSet(0)), nkl.a(a2)}));
    }
}
