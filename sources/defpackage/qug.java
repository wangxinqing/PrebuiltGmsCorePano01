package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: qug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qug {
    public static quh a = new quf();
    private static boolean b = false;

    public static Map a() {
        return a.a();
    }

    public static Set b() {
        return a.b();
    }

    public static synchronized void a(quh quh) {
        synchronized (qug.class) {
            if (!b) {
                a = quh;
                b = true;
            } else {
                throw new IllegalStateException("Factory already set.");
            }
        }
    }
}
