package defpackage;

/* renamed from: axtz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axtz implements axty {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.icing.mdh")).a();
        a = agvx.a(a2, "Storage__enable_upload_changes_request_size_limit", true);
        b = agvx.a(a2, "gms_icing_mdh_upload_changes_request_size_limit_bytes", 10000000);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
