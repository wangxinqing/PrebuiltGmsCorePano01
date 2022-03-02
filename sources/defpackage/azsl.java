package defpackage;

/* renamed from: azsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azsl implements azsk {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.ulr"));
        a = agvx.a(agvw, "Ulr__enable_clearcut_device_settings_logging", false);
        b = agvx.a(agvw, "Ulr__enable_private_mode_toggle_logging", false);
        agvx.a(agvw, "Ulr__enable_storage_logging", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
