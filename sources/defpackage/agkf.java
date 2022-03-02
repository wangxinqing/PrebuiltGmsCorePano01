package defpackage;

import android.os.health.HealthStats;

/* renamed from: agkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agkf extends agkg {
    public static final agkf a = new agkf();

    public final /* bridge */ /* synthetic */ audx a(audx audx, audx audx2) {
        baqt baqt = (baqt) audx;
        baqt baqt2 = (baqt) audx2;
        if (baqt == null || baqt2 == null) {
            return baqt;
        }
        aucd o = baqt.i.o();
        if ((baqt.a & 1) != 0) {
            long j = baqt.b - baqt2.b;
            if (j != 0) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                baqt baqt3 = (baqt) o.b;
                baqt3.a |= 1;
                baqt3.b = j;
            }
        }
        if ((baqt.a & 2) != 0) {
            long j2 = baqt.c - baqt2.c;
            if (j2 != 0) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                baqt baqt4 = (baqt) o.b;
                baqt4.a |= 2;
                baqt4.c = j2;
            }
        }
        if ((baqt.a & 4) != 0) {
            long j3 = baqt.d - baqt2.d;
            if (j3 != 0) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                baqt baqt5 = (baqt) o.b;
                baqt5.a |= 4;
                baqt5.d = j3;
            }
        }
        if ((baqt.a & 8) != 0) {
            long j4 = baqt.e - baqt2.e;
            if (j4 != 0) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                baqt baqt6 = (baqt) o.b;
                baqt6.a |= 8;
                baqt6.e = j4;
            }
        }
        if ((baqt.a & 16) != 0) {
            long j5 = baqt.f - baqt2.f;
            if (j5 != 0) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                baqt baqt7 = (baqt) o.b;
                baqt7.a |= 16;
                baqt7.f = j5;
            }
        }
        if ((baqt.a & 32) != 0) {
            long j6 = baqt.g - baqt2.g;
            if (j6 != 0) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                baqt baqt8 = (baqt) o.b;
                baqt8.a |= 32;
                baqt8.g = j6;
            }
        }
        baqp baqp = baqt.h;
        if (baqp == null) {
            baqp = baqp.d;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqt baqt9 = (baqt) o.b;
        baqp.getClass();
        baqt9.h = baqp;
        baqt9.a |= 64;
        baqt baqt10 = (baqt) o.i();
        if (agkj.a(baqt10)) {
            return null;
        }
        return baqt10;
    }

    private agkf() {
    }

    public final /* bridge */ /* synthetic */ audx a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        aucd o = baqt.i.o();
        long a2 = agkj.a(healthStats, 30001);
        if (a2 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqt baqt = (baqt) o.b;
            baqt.a |= 1;
            baqt.b = a2;
        }
        long a3 = agkj.a(healthStats, 30002);
        if (a3 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqt baqt2 = (baqt) o.b;
            baqt2.a |= 2;
            baqt2.c = a3;
        }
        long a4 = agkj.a(healthStats, 30003);
        if (a4 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqt baqt3 = (baqt) o.b;
            baqt3.a |= 4;
            baqt3.d = a4;
        }
        long a5 = agkj.a(healthStats, 30004);
        if (a5 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqt baqt4 = (baqt) o.b;
            baqt4.a |= 8;
            baqt4.e = a5;
        }
        long a6 = agkj.a(healthStats, 30005);
        if (a6 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqt baqt5 = (baqt) o.b;
            baqt5.a |= 16;
            baqt5.f = a6;
        }
        long a7 = agkj.a(healthStats, 30006);
        if (a7 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqt baqt6 = (baqt) o.b;
            baqt6.a |= 32;
            baqt6.g = a7;
        }
        if (str != null) {
            baqp a8 = agkj.a(str);
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqt baqt7 = (baqt) o.b;
            a8.getClass();
            baqt7.h = a8;
            baqt7.a |= 64;
        }
        baqt baqt8 = (baqt) o.i();
        if (!agkj.a(baqt8)) {
            return baqt8;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ String a(audx audx) {
        baqp baqp = ((baqt) audx).h;
        if (baqp == null) {
            baqp = baqp.d;
        }
        return baqp.c;
    }
}
