package defpackage;

import android.content.SharedPreferences;

/* renamed from: acss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acss extends acsr {
    public static acss a = null;

    public final void a(int i, boolean z, boolean z2, aucd aucd) {
        if (!aznq.b()) {
            c.c("DisabledEastworldProcessorEastworldStatsProcessor").a();
            c.d();
        } else if (i == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - d.getLong(":eastwroldStatsLastPeriodicUploadWallclockTime", 0) > aznq.a.a().e()) {
                aucd o = avvl.j.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avvl avvl = (avvl) o.b;
                avvl.b = 1;
                avvl.a = 1 | avvl.a;
                avvf avvf = (avvf) aucd.i();
                avvf.getClass();
                avvl.i = avvf;
                avvl.a |= 512;
                acsr.a(o, "EastworldStatsProcessor", "EASTWORLD_STATS", (int) aznq.a.a().f(), aucd);
                SharedPreferences.Editor edit = d.edit();
                edit.putLong(":eastwroldStatsLastPeriodicUploadWallclockTime", currentTimeMillis);
                edit.apply();
            }
        }
    }
}
