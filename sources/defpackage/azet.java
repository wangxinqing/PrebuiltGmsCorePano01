package defpackage;

/* renamed from: azet  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azet implements azes {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.romanesco"));
        a = agvx.a(agvw, "Network__people_api_grpc_port", 443);
        b = agvx.a(agvw, "Network__people_api_hostname", "people-pa.googleapis.com");
        c = agvx.a(agvw, "Network__restore_contacts_grpc_timeout", 30000);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final String b() {
        return (String) b.c();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }
}
