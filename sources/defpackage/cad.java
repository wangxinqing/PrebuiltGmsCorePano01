package defpackage;

import com.google.android.gms.awareness.fence.FenceState;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: cad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cad extends bzi {
    private TimeZone f;
    private final bwp g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cad(defpackage.atme r8) {
        /*
            r7 = this;
            int r0 = r8.b
            atmd r0 = defpackage.atmd.a(r0)
            if (r0 == 0) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            atmd r0 = defpackage.atmd.UNKNOWN_TIME_FENCE_TRIGGER_TYPE
        L_0x000b:
            int r4 = r0.n
            boolean r0 = r8.f
            if (r0 != 0) goto L_0x0014
            atjs r0 = defpackage.atjs.TIME_FENCE
            goto L_0x0016
        L_0x0014:
            atjs r0 = defpackage.atjs.LOCAL_TIME_FENCE
        L_0x0016:
            r5 = r0
            boolean r0 = r8.f
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0025
            int[] r0 = new int[r2]
            r2 = 45
            r0[r1] = r2
            r6 = r0
            goto L_0x002c
        L_0x0025:
            int[] r0 = new int[r2]
            r2 = -1
            r0[r1] = r2
            r6 = r0
        L_0x002c:
            java.lang.Class<cad> r2 = defpackage.cad.class
            r1 = r7
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            cac r8 = new cac
            java.lang.String r0 = "TimeFenceImpl"
            r8.<init>(r7, r0)
            r7.g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cad.<init>(atme):void");
    }

    private final int a(int i, long j) {
        Calendar l = l();
        l.setTimeInMillis(j);
        if (l.get(7) == i) {
            return FenceState.a(a(Long.valueOf(bvl.b(j, a())), Long.valueOf(j()), Long.valueOf(k())));
        }
        return 1;
    }

    private final Calendar l() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(a());
        instance.setLenient(false);
        return instance;
    }

    public final long b(long j) {
        atme atme = (atme) this.c;
        if (!atme.f) {
            return Long.MAX_VALUE;
        }
        atmd a = atmd.a(atme.b);
        if (a == null) {
            a = atmd.UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
        }
        if (a == atmd.ABSOLUTE_INTERVAL) {
            long c = bvl.c(j(), a());
            long c2 = bvl.c(k(), a());
            if (j < c) {
                return c - j;
            }
            if (j < c2) {
                return c2 - j;
            }
            return Long.MAX_VALUE;
        }
        long b = bvl.b(j, a());
        if (b < j()) {
            return j() - b;
        }
        if (b < k()) {
            return k() - b;
        }
        return (j() + 86400000) - b;
    }

    public final long j() {
        return ((atme) this.c).d;
    }

    public final long k() {
        return ((atme) this.c).e;
    }

    private static final boolean a(Long l, Long l2, Long l3) {
        return l.longValue() >= l2.longValue() && l.longValue() < l3.longValue();
    }

    public final int a(long j) {
        switch (this.b) {
            case 1:
                return a(a(Long.valueOf(j), Long.valueOf(bvl.c(j(), a())), Long.valueOf(bvl.c(k(), a()))));
            case 2:
                return a(a(Long.valueOf(bvl.b(j, a())), Long.valueOf(j()), Long.valueOf(k())));
            case 3:
                Calendar l = l();
                l.setTimeInMillis(j);
                if (l.get(7) == 7 || l.get(7) == 1) {
                    return a(a(Long.valueOf(bvl.b(j, a())), Long.valueOf(j()), Long.valueOf(k())));
                }
                return a(false);
            case 4:
                Calendar l2 = l();
                l2.setTimeInMillis(j);
                if (l2.get(7) == 7 || l2.get(7) == 1) {
                    return a(false);
                }
                return a(a(Long.valueOf(bvl.b(j, a())), Long.valueOf(j()), Long.valueOf(k())));
            case 5:
                int a = a(1, j);
                this.e = a;
                return a;
            case 6:
                int a2 = a(2, j);
                this.e = a2;
                return a2;
            case 7:
                int a3 = a(3, j);
                this.e = a3;
                return a3;
            case 8:
                int a4 = a(4, j);
                this.e = a4;
                return a4;
            case 9:
                int a5 = a(5, j);
                this.e = a5;
                return a5;
            case 10:
                int a6 = a(6, j);
                this.e = a6;
                return a6;
            case 11:
                int a7 = a(7, j);
                this.e = a7;
                return a7;
            default:
                ((anih) ((anih) bxk.a.c()).a("cad", "a", 195, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[TimeFenceImpl] Unknown time fence type for fence metching = %s", this.b);
                return b();
        }
    }

    public final TimeZone a() {
        TimeZone timeZone = this.f;
        if (timeZone != null) {
            return timeZone;
        }
        atme atme = (atme) this.c;
        if (atme.f) {
            this.f = TimeZone.getDefault();
        } else if ((atme.a & 2) == 0 || atme.c.isEmpty()) {
            return null;
        } else {
            this.f = TimeZone.getTimeZone(((atme) this.c).c);
        }
        return this.f;
    }

    public final void a(atjl atjl) {
        atme atme = (atme) this.c;
        if (atme.f) {
            atmd a = atmd.a(atme.b);
            if (a == null) {
                a = atmd.UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
            }
            if (a != atmd.ABSOLUTE_INTERVAL) {
                atjv a2 = atjv.a(atjl.e);
                if (a2 == null) {
                    a2 = atjv.UNKNOWN_CONTEXT_NAME;
                }
                if (a2 == atjv.TIME_PROPERTY) {
                    atmb atmb = atjl.g;
                    if (atmb == null) {
                        atmb = atmb.e;
                    }
                    int a3 = atma.a(atmb.b);
                    if (a3 != 0 && a3 == 2) {
                        atjm atjm = atjl.h;
                        if (atjm == null) {
                            atjm = atjm.a;
                        }
                        auci auci = atuq.d;
                        atjm.a(auci);
                        if (atjm.m.a(auci.d)) {
                            atjm atjm2 = atjl.h;
                            if (atjm2 == null) {
                                atjm2 = atjm.a;
                            }
                            auci auci2 = atuq.d;
                            atjm2.a(auci2);
                            Object b = atjm2.m.b(auci2.d);
                            if (b == null) {
                                b = auci2.b;
                            } else {
                                auci2.a(b);
                            }
                            atuq atuq = (atuq) b;
                            new Object[1][0] = atuq;
                            this.f = TimeZone.getTimeZone(atuq.b);
                            this.g.a(b(cbi.i().a()), bvq.a("TimeFenceImpl#fenceEvalOp"));
                            return;
                        }
                        ((anih) ((anih) bxk.a.b()).a("cad", "a", 115, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[TimeFenceImpl] could not read TimeProperty proto from ContextData");
                        return;
                    }
                }
                Object[] objArr = new Object[1];
                atjv a4 = atjv.a(atjl.e);
                if (a4 == null) {
                    a4 = atjv.UNKNOWN_CONTEXT_NAME;
                }
                objArr[0] = Integer.valueOf(a4.bA);
            }
        }
    }
}
