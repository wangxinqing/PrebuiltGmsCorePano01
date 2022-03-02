package defpackage;

/* renamed from: bzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzs extends bzi {
    private int f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bzs(defpackage.atlc r9) {
        /*
            r8 = this;
            int r0 = r9.a
            int r0 = defpackage.atlb.a(r0)
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r0 = 1
        L_0x000a:
            atjs r6 = defpackage.atjs.PHONE_CALL_FENCE
            int[] r7 = new int[r1]
            r2 = 0
            r3 = 37
            r7[r2] = r3
            java.lang.Class<bzs> r3 = defpackage.bzs.class
            int r5 = r0 + -1
            r2 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzs.<init>(atlc):void");
    }

    public final int a(long j) {
        int i = this.f;
        boolean z = true;
        if (i == 1) {
            return b();
        }
        if (this.b != 1) {
            ((anih) ((anih) bxk.a.b()).a("bzs", "a", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PhoneCallFenceImpl] Unknown trigger type=%s", this.b);
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
        if (a == atjv.PHONE_CALL) {
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
                auci auci = attk.d;
                atjm.a(auci);
                if (atjm.m.a(auci.d)) {
                    atjm atjm2 = atjl.h;
                    if (atjm2 == null) {
                        atjm2 = atjm.a;
                    }
                    auci auci2 = attk.d;
                    atjm2.a(auci2);
                    Object b = atjm2.m.b(auci2.d);
                    if (b == null) {
                        b = auci2.b;
                    } else {
                        auci2.a(b);
                    }
                    int a3 = attj.a(((attk) b).b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    this.f = a3;
                    return;
                }
                ((anih) ((anih) bxk.a.c()).a("bzs", "a", 48, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[PhoneCallFenceImpl] No phone call data.");
            }
        }
    }
}
