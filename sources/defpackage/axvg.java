package defpackage;

/* renamed from: axvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axvg implements axvf {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.instantapps")).a();
        a = agvx.a(a2, "OResolution__allow_devman_routing", false);
        agvx.a(a2, "OResolution__enable_android_tv_intersplit_navigation", false);
        b = agvx.a(a2, "OResolution__filter_out_persistent_installed_packages", true);
        c = agvx.a(a2, "OResolution__include_extra_metadata_in_instant_app_resolve_info", false);
        agvx.a(a2, "OResolution__skip_resolution_when_opted_out", true);
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
}
