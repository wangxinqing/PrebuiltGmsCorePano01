package defpackage;

import android.util.Pair;
import com.google.android.gms.udc.ConsistencyInformation;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: adhq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adhq {
    private static adhq a;
    private final Map b = new ConcurrentHashMap();

    private adhq() {
    }

    public static adhq a() {
        if (a == null) {
            a = new adhq();
        }
        return a;
    }

    public final void a(String str, ConsistencyInformation consistencyInformation) {
        this.b.put(str, new Pair(Long.valueOf(System.currentTimeMillis()), consistencyInformation));
    }
}
