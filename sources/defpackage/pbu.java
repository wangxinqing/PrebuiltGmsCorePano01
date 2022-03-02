package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: pbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pbu {
    public static final ExecutorService a = jfb.a(4, 10);
    public static volatile phy b;
    private static volatile pdg c;

    public static pdg a() {
        if (c == null) {
            c = new pdg(new oyt(ihs.b(), "MobileDataHub"));
        }
        return c;
    }
}
