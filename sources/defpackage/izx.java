package defpackage;

import java.util.HashMap;

/* renamed from: izx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class izx {
    private static izx b;
    public final HashMap a = new HashMap();

    private izx() {
    }

    public static izx a() {
        izx izx;
        synchronized (izx.class) {
            if (b == null) {
                b = new izx();
            }
            izx = b;
        }
        return izx;
    }

    public final void a(String str) {
        synchronized (this.a) {
            if (!this.a.containsKey(str)) {
                this.a.put(str, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
