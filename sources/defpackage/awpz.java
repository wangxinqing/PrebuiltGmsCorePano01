package defpackage;

/* renamed from: awpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awpz implements awpy {
    public static final agvx a;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.backup"));
        a = agvx.a(agvw, "WifiD2dFeature__backup_handle_source_wifi_d2d_intent", false);
        agvx.a(agvw, "WifiD2dFeature__backup_source_post_setup_calls_max_retries", 2);
        agvx.a(agvw, "WifiD2dFeature__backup_source_post_setup_calls_timeout_millis", 30000);
        agvx.a(agvw, "WifiD2dFeature__backup_wifi_d2d_source_connection_timeout_millis", 180000);
        agvx.a(agvw, "WifiD2dFeature__backup_wifi_d2d_source_max_connection_retries", 2);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
