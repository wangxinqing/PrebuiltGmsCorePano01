package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: bzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzj extends bzi {
    private ArrayList f;
    private long g;
    private long h;
    private Set i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bzj(defpackage.atji r9) {
        /*
            r8 = this;
            int r0 = r9.a
            int r0 = defpackage.atjh.a(r0)
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r0 = 1
        L_0x000a:
            atjs r6 = defpackage.atjs.BEACON_FENCE
            int[] r7 = new int[r1]
            r1 = 0
            r2 = 26
            r7[r1] = r2
            java.lang.Class<bzj> r3 = defpackage.bzj.class
            int r5 = r0 + -1
            r2 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = -1
            r8.g = r0
            r8.h = r0
            r9 = 0
            r8.i = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzj.<init>(atji):void");
    }

    public final int a(long j) {
        int i2 = this.b;
        if (i2 == 1) {
            long j2 = this.g;
            if (j2 == -1) {
                return b();
            }
            boolean a = bzi.a(j, j2, j());
            new Object[1][0] = Boolean.valueOf(a);
            return a(a);
        } else if (i2 == 2) {
            long j3 = this.h;
            if (j3 == -1) {
                return b();
            }
            boolean a2 = bzi.a(j, j3, j());
            new Object[1][0] = Boolean.valueOf(a2);
            return a(a2);
        } else if (i2 != 3) {
            ((anih) ((anih) bxk.a.b()).a("bzj", "a", 192, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[BeaconFenceImpl] Unknown beacon fence trigger type=%s", this.b);
            return b();
        } else {
            Set set = this.i;
            if (set != null) {
                return a(!set.isEmpty());
            }
            return b();
        }
    }

    public final long j() {
        return ((atji) this.c).b;
    }

    public final List a() {
        if (this.f == null) {
            this.f = new ArrayList();
            aucx aucx = ((atji) this.c).c;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                atjf atjf = (atjf) aucx.get(i2);
                ArrayList arrayList = this.f;
                iva.a((Object) atjf);
                arrayList.add(atjf);
            }
        }
        return this.f;
    }

    public final void a(atjl atjl) {
        atjv a = atjv.a(atjl.e);
        if (a == null) {
            a = atjv.UNKNOWN_CONTEXT_NAME;
        }
        if (a == atjv.DETECTED_BEACON) {
            atjm atjm = atjl.h;
            if (atjm == null) {
                atjm = atjm.a;
            }
            auci auci = atru.e;
            atjm.a(auci);
            if (atjm.m.a(auci.d)) {
                atjm atjm2 = atjl.h;
                if (atjm2 == null) {
                    atjm2 = atjm.a;
                }
                auci auci2 = atru.e;
                atjm2.a(auci2);
                Object b = atjm2.m.b(auci2.d);
                if (b == null) {
                    b = auci2.b;
                } else {
                    auci2.a(b);
                }
                atru atru = (atru) b;
                int i2 = this.b;
                if (i2 == 1) {
                    atmb atmb = atjl.g;
                    if (atmb == null) {
                        atmb = atmb.e;
                    }
                    int a2 = atma.a(atmb.b);
                    if (a2 != 0 && a2 == 2 && a(atru)) {
                        atmb atmb2 = atjl.g;
                        if (atmb2 == null) {
                            atmb2 = atmb.e;
                        }
                        this.g = atmb2.c;
                    }
                } else if (i2 == 2) {
                    atmb atmb3 = atjl.g;
                    if (atmb3 == null) {
                        atmb3 = atmb.e;
                    }
                    int a3 = atma.a(atmb3.b);
                    if ((a3 == 0 || a3 != 2) && a(atru)) {
                        atmb atmb4 = atjl.g;
                        if (atmb4 == null) {
                            atmb4 = atmb.e;
                        }
                        this.h = atmb4.d;
                    }
                } else if (i2 != 3) {
                    ((anih) ((anih) bxk.a.b()).a("bzj", "a", 151, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[BeaconFenceImpl] Unknown beacon fence trigger type=%s", this.b);
                } else if (a(atru)) {
                    if (this.i == null) {
                        this.i = new HashSet();
                    }
                    atmb atmb5 = atjl.g;
                    if (atmb5 == null) {
                        atmb5 = atmb.e;
                    }
                    int a4 = atma.a(atmb5.b);
                    if (a4 != 0 && a4 == 2) {
                        this.i.add(atru);
                    } else {
                        this.i.remove(atru);
                    }
                }
            } else {
                ((anih) ((anih) bxk.a.c()).a("bzj", "a", 110, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[BeaconFenceImpl] No detected beacon data.");
            }
        }
    }

    public final boolean a(atru atru) {
        List a = a();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            atjf atjf = (atjf) a.get(i2);
            Object[] objArr = {atjf.b, atjf.c, atjf.d};
            Object[] objArr2 = new Object[3];
            atrt atrt = atru.b;
            if (atrt == null) {
                atrt = atrt.d;
            }
            objArr2[0] = atrt.b;
            atrt atrt2 = atru.b;
            if (atrt2 == null) {
                atrt2 = atrt.d;
            }
            objArr2[1] = atrt2.c;
            objArr2[2] = atru.c.k();
            atrt atrt3 = atru.b;
            if (atrt3 == null) {
                atrt3 = atrt.d;
            }
            if (TextUtils.equals(atrt3.b, atjf.b)) {
                atrt atrt4 = atru.b;
                if (atrt4 == null) {
                    atrt4 = atrt.d;
                }
                if (TextUtils.equals(atrt4.c, atjf.c) && ((atjf.a & 4) == 0 || !atjf.d.j() || atru.c.equals(atjf.d))) {
                    return true;
                }
            }
        }
        return false;
    }
}
