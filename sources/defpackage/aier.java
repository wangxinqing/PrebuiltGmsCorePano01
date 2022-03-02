package defpackage;

import android.location.GpsSatellite;
import java.util.Iterator;

/* renamed from: aier  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aier implements ajpp, ajpx {
    public final ajpq a;
    public final ajpz b;
    public final Object c = new Object();
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;

    public aier(ajpq ajpq) {
        this.a = ajpq;
        this.b = null;
    }

    public final void a(ahyn ahyn) {
        int i = 0;
        for (int i2 = 0; i2 < ahyn.a(); i2++) {
            if (ahyn.d(i2)) {
                i++;
            }
        }
        synchronized (this.c) {
            this.d = i;
        }
    }

    public aier(ajpz ajpz) {
        this.b = ajpz;
        this.a = null;
    }

    public final void a(Iterable iterable) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((GpsSatellite) it.next()).usedInFix()) {
                i++;
            }
        }
        synchronized (this.c) {
            this.d = i;
        }
    }
}
