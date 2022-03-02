package defpackage;

import android.os.health.HealthStats;

/* renamed from: agkh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agkh extends agkg {
    public static final agkh a = new agkh();

    public final /* bridge */ /* synthetic */ audx a(audx audx, audx audx2) {
        int i;
        int i2;
        baqu baqu = (baqu) audx;
        baqu baqu2 = (baqu) audx2;
        if (baqu == null || baqu2 == null) {
            return baqu;
        }
        aucd o = baqu.e.o();
        if (!((baqu.a & 1) == 0 || (i2 = baqu.b - baqu2.b) == 0)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqu baqu3 = (baqu) o.b;
            baqu3.a |= 1;
            baqu3.b = i2;
        }
        if (!((baqu.a & 2) == 0 || (i = baqu.c - baqu2.c) == 0)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqu baqu4 = (baqu) o.b;
            baqu4.a |= 2;
            baqu4.c = i;
        }
        baqp baqp = baqu.d;
        if (baqp == null) {
            baqp = baqp.d;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqu baqu5 = (baqu) o.b;
        baqp.getClass();
        baqu5.d = baqp;
        baqu5.a |= 4;
        baqu baqu6 = (baqu) o.i();
        if (agkj.a(baqu6)) {
            return null;
        }
        return baqu6;
    }

    private agkh() {
    }

    public final /* bridge */ /* synthetic */ audx a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        aucd o = baqu.e.o();
        int a2 = (int) agkj.a(healthStats, 50001);
        if (a2 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqu baqu = (baqu) o.b;
            baqu.a |= 1;
            baqu.b = a2;
        }
        int a3 = (int) agkj.a(healthStats, 50002);
        if (a3 != 0) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqu baqu2 = (baqu) o.b;
            baqu2.a |= 2;
            baqu2.c = a3;
        }
        if (str != null) {
            baqp a4 = agkj.a(str);
            if (o.c) {
                o.c();
                o.c = false;
            }
            baqu baqu3 = (baqu) o.b;
            a4.getClass();
            baqu3.d = a4;
            baqu3.a |= 4;
        }
        baqu baqu4 = (baqu) o.i();
        if (!agkj.a(baqu4)) {
            return baqu4;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ String a(audx audx) {
        baqp baqp = ((baqu) audx).d;
        if (baqp == null) {
            baqp = baqp.d;
        }
        return baqp.c;
    }
}
