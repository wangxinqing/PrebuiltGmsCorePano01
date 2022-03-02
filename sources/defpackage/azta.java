package defpackage;

/* renamed from: azta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azta implements azsz {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;
    public static final agvx i;
    public static final agvx j;
    public static final agvx k;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.ulr"));
        a = agvx.a(agvw, "UlrGrpc__enable_api_userdatas_grpc", false);
        b = agvx.a(agvw, "UlrGrpc__enable_api_utils_grpc", false);
        agvx.a(agvw, "UlrGrpc__enable_convert_json_to_lite", false);
        c = agvx.a(agvw, "UlrGrpc__enable_grpc_compression", true);
        d = agvx.a(agvw, "UlrGrpc__enable_grpc_data", false);
        agvx.a(agvw, "UlrGrpc__enable_grpc_data_api", false);
        e = agvx.a(agvw, "UlrGrpc__enable_grpc_error_logging", false);
        f = agvx.a(agvw, "UlrGrpc__enable_grpc_settings_api", false);
        g = agvx.a(agvw, "UlrGrpc__enable_json_get_delete", true);
        h = agvx.a(agvw, "UlrGrpc__grpc_compressor_name", "gzip");
        i = agvx.a(agvw, "UlrGrpc__ratio_logging_stack_trace", 1.0d);
        j = agvx.a(agvw, "UlrGrpc__reporting_api_server_host", "userlocation.googleapis.com");
        k = agvx.a(agvw, "UlrGrpc__reporting_api_server_port", 443);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final String h() {
        return (String) h.c();
    }

    public final double i() {
        return ((Double) i.c()).doubleValue();
    }

    public final String j() {
        return (String) j.c();
    }

    public final long k() {
        return ((Long) k.c()).longValue();
    }
}
