package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* renamed from: tzt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tzt implements tzs {
    private final Map a = new HashMap();

    public final boolean a(String str) {
        return SystemClock.elapsedRealtime() > (this.a.containsKey(str) ? ((Long) this.a.get(str)).longValue() : 0);
    }

    public final void b(String str) {
        this.a.put(str, Long.valueOf(SystemClock.elapsedRealtime() + aymt.j()));
    }
}
