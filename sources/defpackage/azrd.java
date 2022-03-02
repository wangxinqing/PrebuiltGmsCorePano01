package defpackage;

/* renamed from: azrd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azrd implements azrc {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.udc")).a("gms.udc.");
        a = agvx.a(a2, "consent_title_contrast_ratio", 3.0d);
        b = agvx.a(a2, "ConsentFlowUiFeature__enable_md2_night_mode", false);
        c = agvx.a(a2, "expose_ct_on_write_consent", true);
        d = agvx.a(a2, "ConsentFlowUiFeature__md2_use_auto_night_mode_by_default", false);
        e = agvx.a(a2, "minimum_illustration_width_percentage", 0.45d);
        agvx.a(a2, "ConsentFlowUiFeature__throw_exception_on_things_variant", false);
        agvx.a(a2, "ConsentFlowUiFeature__throw_exception_on_unsupported_builds", true);
        agvx.a(a2, "ConsentFlowUiFeature__throw_exception_on_wear_variant", false);
        f = agvx.a(a2, "use_legacy_header_resizer_logic", false);
        g = agvx.a(a2, "ConsentFlowUiFeature__use_md2_app_compat_theme", false);
    }

    public final double a() {
        return ((Double) a.c()).doubleValue();
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

    public final double e() {
        return ((Double) e.c()).doubleValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }
}
