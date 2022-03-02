package defpackage;

/* renamed from: aztg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aztg implements aztf {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.ulr"));
        a = agvx.a(agvw, "Ulr__enable_clearcut_lr_autoenabling_logging", true);
        b = agvx.a(agvw, "Ulr__enable_clearcut_lr_autoenabling_logging_storage_path", true);
        c = agvx.a(agvw, "Ulr__enable_clearcut_response_error_logging", false);
        d = agvx.a(agvw, "Ulr__never_init_ble", true);
        e = agvx.a(agvw, "Ulr__stop_place_detection_with_connectionless", true);
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
}
