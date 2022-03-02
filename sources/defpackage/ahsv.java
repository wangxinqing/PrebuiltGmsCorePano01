package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ahsv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahsv {
    private final List a = new ArrayList();

    public final synchronized void a() {
        this.a.add(Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public final synchronized int b() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - 60000;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() < elapsedRealtime) {
                it.remove();
            }
        }
        return this.a.size();
    }
}
