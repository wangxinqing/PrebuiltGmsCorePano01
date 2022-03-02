package defpackage;

import android.accounts.Account;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: aezt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aezt implements Callable {
    private final aezu a;
    private final Map b;

    public aezt(aezu aezu, Map map) {
        this.a = aezu;
        this.b = map;
    }

    public final Object call() {
        aezu aezu = this.a;
        Map map = this.b;
        synchronized (aezu.f) {
            for (Map.Entry entry : map.entrySet()) {
                aucd o = aulm.c.o();
                String str = (String) ((aorr) entry.getKey()).get();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aulm aulm = (aulm) o.b;
                str.getClass();
                aulm.a = 2;
                aulm.b = str;
                aulm aulm2 = (aulm) o.i();
                aezu.a.put(aulm2, (Account) entry.getValue());
                aezu.b.put((Account) entry.getValue(), aulm2);
            }
            aezu.g = null;
        }
        return null;
    }
}
