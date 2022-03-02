package defpackage;

import java.util.logging.Logger;

/* renamed from: azyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azyd {
    static final Logger a = Logger.getLogger(azyd.class.getName());
    public static final azyd b = new azyd();

    private azyd() {
    }

    public static azyd a() {
        azyd a2 = azyb.a.a();
        return a2 == null ? b : a2;
    }

    public final azyd b() {
        azyd a2 = azyb.a.a(this);
        return a2 == null ? b : a2;
    }

    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public final void a(azyd azyd) {
        a(azyd, "toAttach");
        azyb.a.a(this, azyd);
    }
}
