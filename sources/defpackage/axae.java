package defpackage;

/* renamed from: axae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axae implements axad {
    public static final agvx a;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms"));
        a = agvx.a(agvw, "Common__do_not_run_ulr_on_chrome_os_devices", false);
        agvx.a(agvw, "Common__only_use_location_manager_to_determine_location_mode", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
