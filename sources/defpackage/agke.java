package defpackage;

import android.os.health.HealthStats;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: agke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agke extends agkg {
    public static final agke a = new agke();

    public final /* bridge */ /* synthetic */ audx a(audx audx, audx audx2) {
        baqr baqr = (baqr) audx;
        baqr baqr2 = (baqr) audx2;
        if (baqr == null || baqr2 == null) {
            return baqr;
        }
        baqq baqq = (baqq) baqr.e.o();
        baqq.a(agkh.a.a((List) baqr.b, (List) baqr2.b));
        baqq.b(agkd.a.a((List) baqr.c, (List) baqr2.c));
        baqp baqp = baqr.d;
        if (baqp == null) {
            baqp = baqp.d;
        }
        if (baqq.c) {
            baqq.c();
            baqq.c = false;
        }
        baqr baqr3 = (baqr) baqq.b;
        baqp.getClass();
        baqr3.d = baqp;
        baqr3.a |= 1;
        baqr baqr4 = (baqr) baqq.i();
        if (agkj.a(baqr4)) {
            return null;
        }
        return baqr4;
    }

    private agke() {
    }

    public final /* bridge */ /* synthetic */ audx a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        baqq baqq = (baqq) baqr.e.o();
        baqq.a(agkh.a.a(agkj.d(healthStats, 40001)));
        baqq.b(agkd.a.a((Map) (healthStats != null && healthStats.hasMeasurements(40002)) ? healthStats.getMeasurements(40002) : Collections.emptyMap()));
        if (str != null) {
            baqp a2 = agkj.a(str);
            if (baqq.c) {
                baqq.c();
                baqq.c = false;
            }
            baqr baqr = (baqr) baqq.b;
            a2.getClass();
            baqr.d = a2;
            baqr.a |= 1;
        }
        baqr baqr2 = (baqr) baqq.i();
        if (!agkj.a(baqr2)) {
            return baqr2;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ String a(audx audx) {
        baqp baqp = ((baqr) audx).d;
        if (baqp == null) {
            baqp = baqp.d;
        }
        return baqp.c;
    }
}
