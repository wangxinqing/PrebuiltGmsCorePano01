package defpackage;

import java.util.Iterator;
import java.util.Set;

/* renamed from: bvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bvh implements Runnable {
    final /* synthetic */ bvk a;
    private final bve b;
    private final long c;
    private final long d;

    public bvh(bvk bvk, bve bve, long j, long j2) {
        this.a = bvk;
        iva.b(j2 >= j);
        iva.a((Object) bve);
        this.b = bve;
        this.c = j;
        this.d = j2;
    }

    public final void run() {
        boolean z;
        long b2 = cbi.i().b();
        long j = this.c;
        long j2 = j != 0 ? b2 + j : 0;
        long j3 = this.d;
        long j4 = j3 != Long.MAX_VALUE ? j3 + b2 : Long.MAX_VALUE;
        bvj bvj = this.a.a;
        bvi bvi = new bvi(this.b, j2, j4);
        long j5 = bvi.c;
        if (j5 < bvj.b) {
            bvj.b = j5;
            z = true;
        } else {
            z = false;
        }
        Set a2 = bvj.c.c((Object) bvi.a);
        if (a2 != null) {
            if (!bvi.a()) {
                Iterator it = a2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bvj.a(bvi);
                        break;
                    }
                    bvi bvi2 = (bvi) it.next();
                    if (!bvi2.a() && bvi2.a.equals(bvi.a)) {
                        if (bvi2.c > bvi.c) {
                            cle cle = bvj.a;
                            Long valueOf = Long.valueOf(bvi2.b);
                            Set set = (Set) cle.get(valueOf);
                            if (set != null && set.remove(bvi2) && set.isEmpty()) {
                                cle.remove(valueOf);
                            }
                            bvj.c.c(bvi2.a, bvi2);
                            bvj.a(bvi);
                        }
                    }
                }
            } else {
                bvj.a(bvi);
            }
        } else {
            bvj.a(bvi);
        }
        if (z || this.a.a.b < b2) {
            this.a.a();
        }
    }
}
