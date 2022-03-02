package defpackage;

/* renamed from: axep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axep implements axeo {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.droidguard"));
        a = agvx.a(agvw, "droidguard_enable_client_library_telemetry", false);
        b = agvx.a(agvw, "droidguard_flows_with_fine_client_library_telemetry", "");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final String b() {
        return (String) b.c();
    }
}
