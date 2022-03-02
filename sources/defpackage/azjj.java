package defpackage;

/* renamed from: azjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azjj implements azji {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.smartdevice"));
        a = agvx.a(agvw, "AutoSupport__forbid_unsupported_accounts_from_transferring", false);
        b = agvx.a(agvw, "AutoSupport__show_lock_screen_without_prompt", false);
        c = agvx.a(agvw, "AutoSupport__source_custom_screens", false);
        d = agvx.a(agvw, "AutoSupport__unsupported_accounts_lookup_timeout_ms", 3000);
        e = agvx.a(agvw, "AutoSupport__use_advertisement_options", true);
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

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }
}
