package defpackage;

import android.content.Context;
import java.io.PrintWriter;
import java.util.Set;

/* renamed from: ahqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahqa extends rhb implements rni, rnh {
    private static final jjg a = jjg.a("BlueskyRegistrant");

    public static synchronized ahqa b(Context context) {
        synchronized (ahqa.class) {
            c(context);
            ((anih) a.d()).a("Can not run Bluesky on this device, enableBluesky() = false");
        }
        return null;
    }

    public static void c(Context context) {
        if (jkr.e() && axxp.a.a().blueskyEnabled()) {
            jix.g(context);
            if (!jix.c(context) && !jix.b(context) && !jix.a(context)) {
                jix.h(context);
            }
        }
    }

    public final void a() {
    }

    public final void a(Context context) {
    }

    public final void a(PrintWriter printWriter) {
        throw null;
    }

    public final void a(String str, boolean z) {
        throw null;
    }

    public final void a(Set set) {
        throw null;
    }
}
