package defpackage;

import android.os.health.TimerStat;

/* renamed from: agki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agki extends agkg {
    public static final agki a = new agki();

    public final /* bridge */ /* synthetic */ audx a(audx audx, audx audx2) {
        return agkj.a((baqv) audx, (baqv) audx2);
    }

    private agki() {
    }

    public final /* bridge */ /* synthetic */ audx a(String str, Object obj) {
        return agkj.a(str, (TimerStat) obj);
    }

    public final /* bridge */ /* synthetic */ String a(audx audx) {
        baqv baqv = (baqv) audx;
        baqp baqp = baqv.d;
        if (baqp == null) {
            baqp = baqp.d;
        }
        if ((baqp.a & 2) == 0) {
            baqp baqp2 = baqv.d;
            if (baqp2 == null) {
                baqp2 = baqp.d;
            }
            return Long.toHexString(baqp2.b);
        }
        baqp baqp3 = baqv.d;
        if (baqp3 == null) {
            baqp3 = baqp.d;
        }
        return baqp3.c;
    }
}
