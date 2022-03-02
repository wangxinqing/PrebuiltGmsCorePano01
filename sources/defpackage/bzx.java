package defpackage;

/* renamed from: bzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzx extends bzi {
    private int f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bzx(defpackage.atlr r9) {
        /*
            r8 = this;
            int r0 = r9.a
            int r0 = defpackage.atlq.a(r0)
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r0 = 1
        L_0x000a:
            atjs r6 = defpackage.atjs.PROXIMITY_DISTANCE_FENCE
            int[] r7 = new int[r1]
            r2 = 0
            r3 = 38
            r7[r2] = r3
            java.lang.Class<bzx> r3 = defpackage.bzx.class
            int r5 = r0 + -1
            r2 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzx.<init>(atlr):void");
    }

    public final int a(long j) {
        int i = this.f;
        boolean z = true;
        if (i == 1) {
            return b();
        }
        if (this.b != 1) {
            ((anih) ((anih) bxk.a.b()).a("bzx", "a", 66, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProximityDistanceFenceImpl] Unknown trigger type=%s", this.b);
            return b();
        }
        if (i != 2) {
            z = false;
        }
        return a(z);
    }

    public final void a(atjl atjl) {
        atjv a = atjv.a(atjl.e);
        if (a == null) {
            a = atjv.UNKNOWN_CONTEXT_NAME;
        }
        if (a == atjv.PROXIMITY_DISTANCE) {
            atmb atmb = atjl.g;
            if (atmb == null) {
                atmb = atmb.e;
            }
            int a2 = atma.a(atmb.b);
            if (a2 != 0 && a2 == 2) {
                atjm atjm = atjl.h;
                if (atjm == null) {
                    atjm = atjm.a;
                }
                auci auci = atua.c;
                atjm.a(auci);
                if (atjm.m.a(auci.d)) {
                    atjm atjm2 = atjl.h;
                    if (atjm2 == null) {
                        atjm2 = atjm.a;
                    }
                    auci auci2 = atua.c;
                    atjm2.a(auci2);
                    Object b = atjm2.m.b(auci2.d);
                    if (b == null) {
                        b = auci2.b;
                    } else {
                        auci2.a(b);
                    }
                    int a3 = attz.a(((atua) b).a);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    this.f = a3;
                    return;
                }
                ((anih) ((anih) bxk.a.c()).a("bzx", "a", 48, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ProximityDistanceFenceImpl] No proximity distance data.");
            }
        }
    }
}
