package defpackage;

/* renamed from: ayqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayqe implements ayqc {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.update"));
        a = agvx.a(agvw, "enable_tv_api_service", true);
        try {
            b = agvx.a(agvw, "tv_api_clients_whitelist", (auib) aucj.a((aucj) auib.b, new byte[]{10, 39, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 116, 117, 110, 103, 115, 116, 101, 110, 46, 115, 101, 116, 117, 112, 119, 114, 97, 105, 116, 104}), ayqd.a);
        } catch (auda e) {
            throw new AssertionError("Could not parse proto flag \"tv_api_clients_whitelist\"");
        }
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final auib b() {
        return (auib) b.c();
    }
}
