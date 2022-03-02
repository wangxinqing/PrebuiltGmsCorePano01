package defpackage;

/* renamed from: axro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axro implements axrn {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.icing"));
        a = agvx.a(agvw, "gms_icing_enable_sherlog", false);
        b = agvx.a(agvw, "gms_icing_enable_task_tracker", false);
        c = agvx.a(agvw, "gms_icing_enable_wake_lock_watchdog", false);
        d = agvx.a(agvw, "gms_icing_show_1p_features_in_debug_ui", false);
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
}
