package defpackage;

import android.os.IBinder;
import android.os.SystemClock;
import android.util.Pair;
import java.util.concurrent.TimeUnit;

/* renamed from: aihw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aihw implements Runnable {
    private final aiib a;
    private final rdz b;

    public aihw(aiib aiib, rdz rdz) {
        this.a = aiib;
        this.b = rdz;
    }

    public final void run() {
        aiib aiib = this.a;
        IBinder asBinder = this.b.asBinder();
        if (asBinder != null) {
            aihv aihv = (aihv) aiib.c.b((Object) asBinder);
            if (aihv != null) {
                aict aict = aiib.g;
                String str = aihv.b;
                if (aict.a() && aict.c.containsKey(str)) {
                    Pair pair = (Pair) aict.c.get(str);
                    if (((Integer) pair.first).intValue() == 1) {
                        aucd aucd = (aucd) aict.d.get(str);
                        int seconds = ((anyx) aucd.b).c + ((int) TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - ((Long) pair.second).longValue()));
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        anyx anyx = (anyx) aucd.b;
                        anyx anyx2 = anyx.d;
                        anyx.a |= 8;
                        anyx.c = seconds;
                        aict.d.put(str, aucd);
                        aict.c.remove(str);
                    } else {
                        aict.c.put(str, Pair.create(Integer.valueOf(((Integer) pair.first).intValue() - 1), (Long) pair.second));
                    }
                }
                aiib.c.a((Object) asBinder);
                return;
            }
            return;
        }
        aihr.a("Received null listener to remove", new Object[0]);
    }
}
