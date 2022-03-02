package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: cab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cab extends bzi {
    private final long f;
    private final long g;
    private List h;
    private final bwp i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cab(defpackage.atly r9) {
        /*
            r8 = this;
            int r0 = r9.a
            int r0 = defpackage.atlx.a(r0)
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r0 = 1
        L_0x000a:
            atjs r6 = defpackage.atjs.SUN_STATE_FENCE
            int[] r7 = new int[r1]
            r1 = 0
            r2 = 43
            r7[r1] = r2
            java.lang.Class<cab> r3 = defpackage.cab.class
            int r5 = r0 + -1
            r2 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            caa r9 = new caa
            java.lang.String r0 = "SunStateFenceImpl"
            r9.<init>(r8, r0)
            r8.i = r9
            audx r9 = r8.c
            atly r9 = (defpackage.atly) r9
            long r0 = r9.b
            r8.f = r0
            long r0 = r9.c
            r8.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cab.<init>(atly):void");
    }

    public final int a(long j) {
        if (!jir.a((Collection) this.h)) {
            int i2 = this.b;
            boolean z = true;
            if (i2 == 1 || i2 == 2) {
                List list = this.h;
                int size = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z = false;
                        break;
                    }
                    long longValue = ((Long) list.get(i3)).longValue();
                    long j2 = this.f;
                    i3++;
                    if (bzi.a(j, longValue + j2, (this.g - j2) - 1)) {
                        break;
                    }
                }
                return a(z);
            }
            ((anih) ((anih) bxk.a.c()).a("cab", "a", 101, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[SunStateFenceImpl] Unknown sunStateFence type for matching = %s", this.b);
            return b();
        }
        ((anih) ((anih) bxk.a.c()).a("cab", "a", 91, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[SunStateFenceImpl] Not received a sun-state context to use for evaluation.");
        return b();
    }

    public final long b(long j) {
        List list = this.h;
        int size = list.size();
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            long j3 = this.f + longValue;
            if (j >= j3) {
                long j4 = longValue + this.g;
                if (j < j4) {
                    j2 = Math.min(j2, j4);
                }
            } else {
                j2 = Math.min(j2, j3);
            }
        }
        return j2 - j;
    }

    public final void a(atjl atjl) {
        atjv a = atjv.a(atjl.e);
        if (a == null) {
            a = atjv.UNKNOWN_CONTEXT_NAME;
        }
        if (a == atjv.SUN_STATE) {
            atmb atmb = atjl.g;
            if (atmb == null) {
                atmb = atmb.e;
            }
            int a2 = atma.a(atmb.b);
            if (a2 != 0) {
                int i2 = 2;
                if (a2 == 2) {
                    atjm atjm = atjl.h;
                    if (atjm == null) {
                        atjm = atjm.a;
                    }
                    auci auci = atup.f;
                    atjm.a(auci);
                    if (atjm.m.a(auci.d)) {
                        atjm atjm2 = atjl.h;
                        if (atjm2 == null) {
                            atjm2 = atjm.a;
                        }
                        auci auci2 = atup.f;
                        atjm2.a(auci2);
                        Object b = atjm2.m.b(auci2.d);
                        if (b == null) {
                            b = auci2.b;
                        } else {
                            auci2.a(b);
                        }
                        atup atup = (atup) b;
                        ((anih) ((anih) bxk.a.c()).a("cab", "a", 77, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[SunStateFenceImpl] Updating fence schedule using received sunState context");
                        int i3 = this.b;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                i2 = 1;
                            } else {
                                i2 = 3;
                            }
                        }
                        aucx aucx = atup.b;
                        int size = aucx.size();
                        int i4 = 0;
                        while (i4 < size) {
                            atuo atuo = (atuo) aucx.get(i4);
                            int a3 = atun.a(atuo.b);
                            if (a3 == 0) {
                                a3 = 1;
                            }
                            i4++;
                            if (a3 == i2) {
                                this.h = atuo.c;
                                this.i.a(b(cbi.i().a()), bvq.a("SunStateFenceImpl#fenceEvalOp"));
                                return;
                            }
                        }
                        return;
                    }
                    ((anih) ((anih) bxk.a.c()).a("cab", "a", 71, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[SunStateFenceImpl] apply(): Invalid sunState context data received");
                }
            }
        }
    }
}
