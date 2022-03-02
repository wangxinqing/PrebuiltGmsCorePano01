package defpackage;

import android.os.PowerManager;
import android.os.SystemClock;
import com.google.android.gms.chromesync.sync.SyncIntentOperation;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/* renamed from: hnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hnx {
    public final hkx a = ((hkx) hkx.i.b());
    private final Random b = new SecureRandom();
    private final jbs c = new jbs(ihs.b());
    private final PowerManager d = ((PowerManager) ihs.b().getSystemService("power"));

    private final long a(long j) {
        double d2 = (double) j;
        Double.isNaN(d2);
        return (long) (((this.b.nextDouble() * 0.4d) + 0.8d) * d2);
    }

    public final long a(pyv pyv) {
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList((Collection) this.a.a(pyv, hkx.h));
        arrayList.add(Long.valueOf(elapsedRealtime));
        while (true) {
            i = 0;
            if (arrayList.size() <= 10) {
                break;
            }
            arrayList.remove(0);
        }
        this.a.a(pyv, hkx.h, amzy.a((Collection) arrayList));
        String str = this.d.isScreenOn() ? (String) his.l.c() : (String) his.m.c();
        ArrayList arrayList2 = new ArrayList();
        for (String valueOf : amsk.a(',').a().a((CharSequence) str)) {
            arrayList2.add(Long.valueOf(valueOf));
        }
        while (i < arrayList2.size() && i < arrayList.size()) {
            elapsedRealtime = Math.max(elapsedRealtime, ((Long) arrayList.get((arrayList.size() - 1) - i)).longValue() + a(((Long) arrayList2.get(i)).longValue()));
            i++;
        }
        return elapsedRealtime;
    }

    public final long a(pyv pyv, long j) {
        long longValue = ((Long) this.a.a(pyv, hkx.f)).longValue();
        if (j <= longValue) {
            return longValue;
        }
        this.a.a(pyv, hkx.f, Long.valueOf(j));
        return j;
    }

    public final void a(long j, hnw hnw) {
        this.c.a("ChromeSync-SyncScheduler", 3, j, SyncIntentOperation.a(hnw), "com.google.android.gms");
    }

    public final void a(hnw hnw, int i) {
        long j;
        pyv pyv = hnw.a;
        long a2 = a(pyv);
        if ((i >> 8) == 1) {
            long longValue = ((Long) this.a.a(pyv, hkx.g)).longValue();
            if (longValue == -1) {
                j = ((Long) his.n.c()).longValue();
            } else {
                j = Math.min(longValue + longValue, ((Long) his.o.c()).longValue());
            }
            this.a.a(pyv, hkx.g, Long.valueOf(j));
            a2 = Math.max(a2, SystemClock.elapsedRealtime() + a(j));
        }
        if (i == 258) {
            a2 = Math.max(a2, SystemClock.elapsedRealtime() + a(((Long) his.p.c()).longValue()));
        }
        a(a(pyv, a2), hnw);
    }
}
