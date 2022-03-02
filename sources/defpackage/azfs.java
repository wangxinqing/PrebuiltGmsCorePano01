package defpackage;

/* renamed from: azfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azfs implements azfr {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.security"));
        a = agvx.a(agvw, "device_name_base_url", "https://android.googleapis.com");
        agvx.a(agvw, "mdm_device_admin_state_url", "");
        b = agvx.a(agvw, "mdm_remote_payload_response_url", "https://android.googleapis.com/nova/remote_payload");
        c = agvx.a(agvw, "mdm_sitrep_url", "https://android.googleapis.com/nova/sitrep");
    }

    public final String a() {
        return (String) a.c();
    }

    public final String b() {
        return (String) b.c();
    }

    public final String c() {
        return (String) c.c();
    }
}
