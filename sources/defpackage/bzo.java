package defpackage;

import java.util.Set;

/* renamed from: bzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzo extends bzi {
    private final Set f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bzo(defpackage.atjz r9) {
        /*
            r8 = this;
            int r0 = r9.a
            int r0 = defpackage.atjy.a(r0)
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r0 = 1
        L_0x000a:
            atjs r6 = defpackage.atjs.INSTALLED_APPS_FENCE
            int[] r7 = new int[r1]
            r1 = 0
            r2 = 39
            r7[r1] = r2
            java.lang.Class<bzo> r3 = defpackage.bzo.class
            int r5 = r0 + -1
            r2 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            r8.f = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzo.<init>(atjz):void");
    }

    private final boolean a() {
        for (atsb atsb : this.f) {
            if (atsb.b.equals(((atjz) this.c).b)) {
                return true;
            }
        }
        return false;
    }

    public final int a(long j) {
        if (this.f.size() == 0) {
            return b();
        }
        int i = this.b;
        if (i == 1) {
            return a(a());
        }
        if (i == 2) {
            return a(!a());
        }
        ((anih) ((anih) bxk.a.b()).a("bzo", "a", 86, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[InstalledAppsFenceImpl] Unknown trigger type=%s", this.b);
        return b();
    }

    public final void a(atjl atjl) {
        atjv a = atjv.a(atjl.e);
        if (a == null) {
            a = atjv.UNKNOWN_CONTEXT_NAME;
        }
        if (a == atjv.INSTALLED_APPS) {
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
                auci auci = atsa.c;
                atjm.a(auci);
                if (atjm.m.a(auci.d)) {
                    atjm atjm2 = atjl.h;
                    if (atjm2 == null) {
                        atjm2 = atjm.a;
                    }
                    auci auci2 = atsa.c;
                    atjm2.a(auci2);
                    Object b = atjm2.m.b(auci2.d);
                    if (b == null) {
                        b = auci2.b;
                    } else {
                        auci2.a(b);
                    }
                    this.f.clear();
                    this.f.addAll(((atsa) b).a);
                    return;
                }
                ((anih) ((anih) bxk.a.c()).a("bzo", "a", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[InstalledAppsFenceImpl] No installed apps data.");
            }
        }
    }
}
