package defpackage;

/* renamed from: aztp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aztp implements azto {
    public static final agvx a;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.usagereporting")).a("gms:usagereporting:");
        agvx.a(a2, "disable_handset_checkbox_settings_injection", true);
        a = agvx.a(a2, "ignore_headless_auto_checkbox", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
