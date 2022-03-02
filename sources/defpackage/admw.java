package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: admw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class admw implements adob {
    private static final iwd a = adnt.e("DefaultThrottler");
    private static final long b = TimeUnit.SECONDS.toMillis(3);
    private final adrn c = ((adrn) adrn.a.b());
    private final AtomicBoolean d = new AtomicBoolean(false);

    private admw() {
    }

    public static admw a() {
        return new admw();
    }

    public final void b() {
        ArrayList arrayList = new ArrayList();
        for (String parseLong : amsk.a(',').a((CharSequence) ayou.a.a().o())) {
            arrayList.add(Long.valueOf(Long.parseLong(parseLong)));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        amzy amzy = (amzy) this.c.b(adls.l);
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (true) {
            if (i < amzy.size() && i < arrayList.size()) {
                if (elapsedRealtime < ((Long) amzy.get(i)).longValue()) {
                    this.c.a(adls.l);
                    break;
                }
                j2 = Math.max(j2, ((Long) amzy.get(i)).longValue() + ((Long) arrayList.get(i)).longValue());
                i++;
            } else {
                j = j2;
            }
        }
        j = j2;
        if (SystemClock.elapsedRealtime() < j) {
            a.c("Throttling: current time=%d, earliest retry time=%d.", Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(j));
        }
        while (!this.d.get() && SystemClock.elapsedRealtime() < j) {
            SystemClock.sleep(b);
        }
        amzy amzy2 = (amzy) this.c.b(adls.l);
        if (!this.d.get()) {
            amzt j3 = amzy.j();
            j3.c(Long.valueOf(SystemClock.elapsedRealtime()));
            if (amzy2.size() >= 15) {
                j3.b((Iterable) amzy2.subList(0, 14));
            } else {
                j3.b((Iterable) amzy2);
            }
            this.c.a(adls.l.b(j3.a()));
        }
    }

    public final void c() {
        this.d.set(true);
    }
}
