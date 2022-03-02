package defpackage;

import android.os.Build;

/* renamed from: aecx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aecx {
    public static final agvx a;
    private static final agvw b;

    static {
        agvw b2 = new agvw(agvj.a("com.google.android.gms.instantapps")).a("gms:wh:").b("Legacy__");
        b = b2;
        int i = Build.VERSION.SDK_INT;
        a = agvx.a(b2, "enable_westinghouse_support", true);
    }

    @Deprecated
    public static synchronized boolean a() {
        boolean booleanValue;
        synchronized (aecx.class) {
            booleanValue = ((Boolean) a.c()).booleanValue();
        }
        return booleanValue;
    }
}
