package defpackage;

/* renamed from: axvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axvd implements axvc {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.instantapps")).a();
        a = agvx.a(a2, "LevelDbFlags__handle_data_corruption_on_delete", false);
        b = agvx.a(a2, "LevelDbFlags__handle_data_corruption_on_get", false);
        c = agvx.a(a2, "LevelDbFlags__handle_data_corruption_on_put", false);
        d = agvx.a(a2, "LevelDbFlags__handle_data_corruption_on_wipe_all", false);
        e = agvx.a(a2, "LevelDbFlags__handle_data_corruption_on_write_batch", false);
        f = agvx.a(a2, "LevelDbFlags__time_between_reinitialization_ms", -1);
        g = agvx.a(a2, "LevelDbFlags__verify_domain_filter_added_package_after_full_sync", false);
        h = agvx.a(a2, "LevelDbFlags__verify_domain_filter_added_package_after_trim_sync", false);
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

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }
}
