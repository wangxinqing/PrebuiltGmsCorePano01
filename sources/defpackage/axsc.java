package defpackage;

/* renamed from: axsc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axsc implements axrz {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.icing"));
        a = agvx.a(agvw, "disable_remove_fanout_for_messaging", true);
        b = agvx.a(agvw, "disable_update_fanout_for_messaging", true);
        c = agvx.a(agvw, "enable_search_and_upload_whitelist_all_google_apps", false);
        try {
            d = agvx.a(agvw, "firebase_corpora_trimmable_exception_whitelist", (auib) aucj.a((aucj) auib.b, new byte[0]), axsa.a);
            try {
                e = agvx.a(agvw, "search_and_upload_whitelist", (auib) aucj.a((aucj) auib.b, new byte[0]), axsb.a);
                f = agvx.a(agvw, "gms_icing_wake_lock_timeout", 180000);
            } catch (auda e2) {
                throw new AssertionError("Could not parse proto flag \"search_and_upload_whitelist\"");
            }
        } catch (auda e3) {
            throw new AssertionError("Could not parse proto flag \"firebase_corpora_trimmable_exception_whitelist\"");
        }
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final auib d() {
        return (auib) d.c();
    }

    public final auib e() {
        return (auib) e.c();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
    }
}
