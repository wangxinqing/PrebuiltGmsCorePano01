package defpackage;

/* renamed from: axsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axsf implements axse {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.icing"));
        a = agvx.a(agvw, "gms_icing_disable_sms_corpus", false);
        b = agvx.a(agvw, "gms_icing_enable_app_indexing_debug", true);
        c = agvx.a(agvw, "gms_icing_enable_calendar_indexing", true);
        d = agvx.a(agvw, "gms_icing_enable_cld3_model_in_assets", true);
        e = agvx.a(agvw, "gms_icing_enable_get_debug_info_api", true);
        f = agvx.a(agvw, "gms_icing_enable_icing_dumper", true);
        g = agvx.a(agvw, "gms_icing_enable_indexing_services", true);
        agvx.a(agvw, "enable_legacy_assist_app_context_uploads", false);
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

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }
}
