package defpackage;

import android.content.Context;
import android.hardware.SensorEventListener;

/* renamed from: ahux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahux {
    public static final int[] a = {1, 2, 4};
    public final ajbg b;
    public final aizy c;
    public final Object d = new Object();
    public boolean e = false;
    ahuw f;
    public boolean g = false;
    public long h = 0;
    final Runnable i = new ahuv(this);
    public final ahtn j;

    public ahux(Context context, ajbg ajbg, aizy aizy) {
        this.j = new ahtn(context);
        this.c = aizy;
        int i2 = ahvx.b;
        this.b = ajbg;
    }

    public final void a(boolean z, long j2) {
        synchronized (this.d) {
            ahuw ahuw = this.f;
            if (ahuw != null) {
                this.j.a((SensorEventListener) ahuw);
            }
            this.e = z;
            this.g = false;
            this.h = j2;
            this.b.c(ajbe.COLLECTIONLIB);
        }
    }

    public final long b() {
        long j2;
        synchronized (this.d) {
            j2 = this.h;
        }
        return j2;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.d) {
            z = this.e;
        }
        return z;
    }
}
