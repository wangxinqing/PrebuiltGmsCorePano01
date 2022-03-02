package defpackage;

import android.location.Location;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: snl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class snl {
    private static snl c;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final AtomicReference b = new AtomicReference();

    private snl() {
    }

    public static synchronized snl a() {
        snl snl;
        synchronized (snl.class) {
            if (c == null) {
                c = new snl();
            }
            snl = c;
        }
        return snl;
    }

    public final void a(Location location) {
        this.b.set(location);
    }
}
