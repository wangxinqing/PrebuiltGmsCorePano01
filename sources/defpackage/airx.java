package defpackage;

import android.os.SystemClock;
import java.util.Collections;

/* renamed from: airx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class airx implements airs {
    final /* synthetic */ airy a;

    public airx(airy airy) {
        this.a = airy;
    }

    public final void a(aizy aizy, aqek aqek) {
        long j;
        airy airy = this.a;
        if (!airy.l) {
            airy.m = false;
            airy.a(aizy, (aibr[]) null, true);
            airr airr = this.a.J;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (aqek == null) {
                airr.b = elapsedRealtime;
                if (!airr.c) {
                    if (airr.a.size() > 3) {
                        airr.a.removeFirst();
                    }
                    airr.a.add(Long.valueOf(elapsedRealtime));
                    Collections.sort(airr.a);
                    if (!airr.e) {
                        j = 1800000;
                    } else {
                        j = 600000;
                    }
                    if (airr.a.size() >= 3 && elapsedRealtime - ((Long) airr.a.getFirst()).longValue() < j) {
                        airr.c = true;
                        return;
                    }
                    return;
                }
                return;
            }
            airr.a();
            airr.b = 0;
        }
    }
}
