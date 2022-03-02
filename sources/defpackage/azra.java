package defpackage;

/* renamed from: azra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azra implements azqz {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.udc"));
        a = agvx.a(agvw, "ClearcutFeature__background_api_reporting_fraction", 0.005d);
        agvx.a(agvw, "ClearcutFeature__context_manager_empty_buffer_reporting_fraction", 0.005d);
        b = agvx.a(agvw, "ClearcutFeature__proto_data_store_operations_reporting_interval", 1000);
    }

    public final double a() {
        return ((Double) a.c()).doubleValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
