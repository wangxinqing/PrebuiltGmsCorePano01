package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

/* renamed from: ahxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahxg extends ahwp {
    public static final Set l = ahup.a(ahup.GPS_SATELLITE, ahup.GPS, ahup.GYROSCOPE);
    public final ahss k = new ahxf(this);
    public ahtp m;
    public long n = -1;
    public final ahxi o;
    public long p = Long.MAX_VALUE;
    private final ahxb q;
    private final ahxu r;
    private final ahwq s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ahxg(defpackage.ajbd r15, defpackage.aizy r16, defpackage.ajbg r17, defpackage.ahqq r18, defpackage.ajbx r19, defpackage.ajph r20, defpackage.ahwm r21, defpackage.ahxb r22, defpackage.ahxu r23) {
        /*
            r14 = this;
            r10 = r14
            r11 = r22
            ahwq r12 = new ahwq
            java.util.List r0 = defpackage.ahxu.j
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r3 = r0
            ahyw r3 = (defpackage.ahyw) r3
            r0 = r12
            r1 = r16
            r2 = r17
            r4 = r22
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            ahxi r13 = new ahxi
            aizz r0 = r15.g()
            ajaa r1 = r15.h()
            r3 = r16
            r13.<init>(r11, r3, r0, r1)
            ahwo r9 = defpackage.ahwo.IDLE
            java.lang.String r1 = "IOCollector"
            r0 = r14
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            ahxf r0 = new ahxf
            r0.<init>(r14)
            r10.k = r0
            r0 = -1
            r10.n = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10.p = r0
            r10.q = r11
            r0 = r23
            r10.r = r0
            r10.s = r12
            r10.o = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxg.<init>(ajbd, aizy, ajbg, ahqq, ajbx, ajph, ahwm, ahxb, ahxu):void");
    }

    /* access modifiers changed from: private */
    public final void f(boolean z) {
        this.m = null;
        this.n = -1;
        if (z) {
            this.d.a(ajbe.IN_OUT_DOOR_COLLECTOR, 0, (aizx) null);
        }
    }

    public final boolean b(long j) {
        aiba aiba;
        long j2;
        ahxq ahxq;
        int i;
        long j3 = j;
        long j4 = this.p;
        if (j4 != Long.MAX_VALUE && -10000 + j4 <= j3 && j3 <= j4 + 180000) {
            int i2 = this.r.i;
            boolean bf = this.b.l().bf();
            boolean a = ahxc.a(16);
            if (i2 == 1 && bf && a) {
                this.p = Long.MAX_VALUE;
                this.q.j();
                HashMap hashMap = new HashMap(1);
                hashMap.put(ahup.GYROSCOPE, 1);
                ahtp a2 = this.b.b().a(false, l, hashMap, 10000, (ahuu) null, this.k, this.a, (aizx) null);
                this.m = a2;
                if (a2 != null) {
                    a2.a();
                    this.n = j3;
                }
                if (this.m != null) {
                    this.j = ahwo.IN_OUT_DOOR_COLLECTION_WAIT;
                }
            }
        } else if (j4 != Long.MAX_VALUE && j3 > j4 + 180000) {
            this.p = Long.MAX_VALUE;
            this.q.j();
        }
        if (this.j != ahwo.IN_OUT_DOOR_COLLECTION_WAIT && this.p == Long.MAX_VALUE && this.r.h && ahxc.a(16)) {
            ahwq ahwq = this.s;
            if (ahwq.d.h) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(ahwq.a.b());
                aiba a3 = aiba.a(Long.valueOf(ahwq.h.i()), ahxq.USING_FULL_TIME_SPANS);
                Object obj = a3.a;
                if (obj != null) {
                    j2 = ((Long) obj).longValue();
                } else {
                    j2 = 0;
                }
                Object obj2 = a3.b;
                if (obj2 != null) {
                    ahxq = (ahxq) obj2;
                } else {
                    ahxq = ahxq.USING_FULL_TIME_SPANS;
                }
                long timeInMillis = instance.getTimeInMillis() - 300000;
                if (j2 == 0 || -86400000 + j2 >= instance.getTimeInMillis() || timeInMillis >= j2) {
                    aiba = aiba.a(0L, ahxq.USING_FULL_TIME_SPANS);
                } else {
                    aiba = ahwq.a(j2, ahxq);
                }
                Object obj3 = aiba.a;
                if (obj3 == null || ((Long) obj3).longValue() == 0) {
                    if (ahwq.g == null) {
                        aiba = aiba.a(Long.MAX_VALUE, ahxq.USING_FULL_TIME_SPANS);
                    } else {
                        Date k2 = ahwq.h.k();
                        if (k2 == null) {
                            ahwq.h.a(instance);
                            i = 6;
                        } else {
                            Calendar instance2 = Calendar.getInstance();
                            instance2.setTime(k2);
                            if (!ahyw.a(instance2, instance)) {
                                ahwq.h.a(instance);
                                i = 6;
                            } else {
                                i = Math.max(0, 6 - ahwq.h.m());
                            }
                        }
                        if (i > 0 && !ahwq.g.a(instance)) {
                            aiba = ahwq.a(instance, i);
                        } else {
                            Calendar instance3 = Calendar.getInstance();
                            instance3.setTime(instance.getTime());
                            instance3.add(5, 1);
                            ahyw.a(instance3, ahwq.g.a);
                            ahwq.h.a(instance3);
                            aiba = ahwq.a(instance3, 6);
                        }
                    }
                }
            } else {
                aiba = aiba.a(Long.MAX_VALUE, ahxq.USING_FULL_TIME_SPANS);
            }
            Long l2 = (Long) aiba.a;
            if (l2 != null) {
                this.p = l2.longValue();
            }
        }
        if (this.j == ahwo.IDLE) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        ahtp ahtp = this.m;
        if (ahtp != null) {
            if (this.r.i != 1) {
                ahtp.b();
                if (!this.r.d() || !a()) {
                    f(false);
                    this.j = ahwo.IDLE;
                    return true;
                }
            }
            return false;
        }
        this.j = ahwo.IDLE;
        return true;
    }
}
