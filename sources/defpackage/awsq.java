package defpackage;

/* renamed from: awsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awsq implements awsp {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw("direct_boot:com.google.android.gms.playlog.uploader").a("gms:playlog:apitimeout:");
        a = agvx.a(a2, "ApiTimeOut__boot_count_api_timeout_ms", 250);
        b = agvx.a(a2, "ApiTimeOut__phenotype_api_timeout_ms", 250);
        c = agvx.a(a2, "ApiTimeOut__pseudonymous_id_api_timeout_ms", 250);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }
}
