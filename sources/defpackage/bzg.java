package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: bzg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzg extends bzi {
    private int f;
    private int g;
    private long h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bzg(defpackage.atjb r9) {
        /*
            r8 = this;
            int r0 = r9.a
            int r0 = defpackage.atja.a(r0)
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r0 = 1
        L_0x000a:
            atjs r6 = defpackage.atjs.ACTIVITY_FENCE
            int[] r7 = new int[r1]
            r1 = 0
            r2 = 6
            r7[r1] = r2
            java.lang.Class<bzg> r3 = defpackage.bzg.class
            r1 = -1
            int r5 = r0 + -1
            r2 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r2 = -1
            r8.h = r2
            r8.f = r1
            r8.g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzg.<init>(atjb):void");
    }

    public final int a(long j) {
        if (this.f == -1) {
            return b();
        }
        int a = atja.a(this.b);
        int i = a - 1;
        if (a != 0) {
            boolean z = false;
            if (i == 1) {
                if (this.f == 1) {
                    z = true;
                }
                return a(z);
            } else if (i == 2) {
                if (this.f == 1 && this.g == 0) {
                    if (bzi.a(j, this.h, a())) {
                        z = true;
                    }
                }
                return a(z, a());
            } else if (i != 3) {
                ((anih) ((anih) bxk.a.c()).a("bzg", "a", 181, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ActivityFenceImpl] Unknown activity fence type = %s", this.b);
                return b();
            } else {
                if (this.f == 0 && this.g == 1) {
                    if (bzi.a(j, this.h, a())) {
                        z = true;
                    }
                }
                return a(z, a());
            }
        } else {
            throw null;
        }
    }

    public final long a() {
        return ((atjb) this.c).b;
    }

    public final void a(atjl atjl) {
        atrs atrs;
        atjv a = atjv.a(atjl.e);
        if (a == null) {
            a = atjv.UNKNOWN_CONTEXT_NAME;
        }
        if (a == atjv.DETECTED_ACTIVITY) {
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
                auci auci = atrs.c;
                atjm.a(auci);
                boolean a3 = atjm.m.a(auci.d);
                atrq atrq = null;
                if (a3) {
                    atjm atjm2 = atjl.h;
                    if (atjm2 == null) {
                        atjm2 = atjm.a;
                    }
                    auci auci2 = atrs.c;
                    atjm2.a(auci2);
                    Object b = atjm2.m.b(auci2.d);
                    if (b == null) {
                        b = auci2.b;
                    } else {
                        auci2.a(b);
                    }
                    atrs = (atrs) b;
                } else {
                    atrs = null;
                }
                if (atrs == null || atrs.a.size() == 0) {
                    ((anih) ((anih) bxk.a.c()).a("bzg", "a", 82, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ActivityFenceImpl] Invalid activity record received for context.");
                    return;
                }
                int i = 0;
                aucx aucx = atrs.a;
                int size = aucx.size();
                atrq atrq2 = (atrq) atrs.a.get(0);
                ArrayList arrayList = null;
                for (int i2 = 0; i2 < size; i2++) {
                    atrq atrq3 = (atrq) aucx.get(i2);
                    int i3 = atrq3.c;
                    if (i3 > atrq2.c) {
                        atrq2 = atrq3;
                    }
                    if (atrq == null || i3 > atrq.c) {
                        atrp a4 = atrp.a(atrq3.b);
                        if (a4 == null) {
                            a4 = atrp.IN_VEHICLE;
                        }
                        if (a4 != atrp.ON_FOOT) {
                            atrq = atrq3;
                        }
                    }
                    if (atrq3.c >= ((int) awuz.a.a().ae())) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(atrq3);
                    }
                }
                if (atrq2.c >= ((int) awuz.a.a().an())) {
                    Iterator it = new aucu(((atjb) this.c).c, atjb.d).iterator();
                    loop1:
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        atrp atrp = (atrp) it.next();
                        if (atrq2 != null) {
                            atrp a5 = atrp.a(atrq2.b);
                            if (a5 == null) {
                                a5 = atrp.IN_VEHICLE;
                            }
                            if (a5 == atrp) {
                                i = 1;
                                break;
                            }
                        }
                        if (atrq != null) {
                            atrp a6 = atrp.a(atrq.b);
                            if (a6 == null) {
                                a6 = atrp.IN_VEHICLE;
                            }
                            if (a6 == atrp) {
                                i = 1;
                                break;
                            }
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                atrp a7 = atrp.a(((atrq) arrayList.get(i4)).b);
                                if (a7 == null) {
                                    a7 = atrp.IN_VEHICLE;
                                }
                                i4++;
                                if (a7 == atrp) {
                                    i = 1;
                                    break loop1;
                                }
                            }
                            continue;
                        }
                    }
                    int i5 = this.f;
                    if (i != i5) {
                        this.g = i5;
                        this.f = i;
                        atmb atmb2 = atjl.g;
                        if (atmb2 == null) {
                            atmb2 = atmb.e;
                        }
                        this.h = atmb2.c;
                    }
                }
            }
        }
    }
}
