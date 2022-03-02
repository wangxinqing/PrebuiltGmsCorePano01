package defpackage;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: jcm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jcm {
    private static WeakReference a;

    public static int a(String str) {
        if (str.contains("wlan")) {
            return 1;
        }
        if (!str.contains("eth")) {
            return !str.contains("rmnet") ? -1 : 0;
        }
        return 3;
    }

    private static synchronized ivk b() {
        synchronized (jcm.class) {
            if (a != null) {
                ivk ivk = (ivk) a.get();
                if (ivk != null) {
                    return ivk;
                }
            }
            ivk ivk2 = new ivk(ihs.b(), "InterfaceTypeMap", true, true);
            a = new WeakReference(ivk2);
            return ivk2;
        }
    }

    public static String a(int i) {
        if (i == 0) {
            return "MOBILE";
        }
        if (i != 1) {
            return i != 3 ? Integer.toString(i) : "ETHERNET";
        }
        return "WIFI";
    }

    public static Map a() {
        return b().getAll();
    }
}
