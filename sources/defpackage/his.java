package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: his  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class his {
    public static final agvx a;
    public static final agvx b = agvx.a(s, "password_api_grpc_host", "chromesyncpasswords-pa.googleapis.com");
    public static final agvx c = agvx.a(s, "password_api_grpc_port", 443);
    public static final agvx d = agvx.a(s, "password_api_server_scope", "https://www.googleapis.com/auth/login_manager");
    public static final agvx e = agvx.a(s, "sync_entity_api_grpc_host", "chromesyncentities-pa.googleapis.com");
    public static final agvx f = agvx.a(s, "sync_entity_api_grpc_port", 443);
    public static final agvx g = agvx.a(s, "sync_entity_api_server_scope", "https://www.googleapis.com/auth/login_manager");
    public static final agvx h = agvx.a(s, "affiliation_api_server_url", "https://www.googleapis.com");
    public static final agvx i = agvx.a(s, "affiliation_api_server_path", "/affiliation/v1");
    public static final agvx j = agvx.a(s, "affiliation_api_apiary_trace", "");
    public static final agvx k = agvx.a(s, "sync:delay_for_gsync_tickle", TimeUnit.MINUTES.toMillis(2));
    public static final agvx l = agvx.a(s, "sync:foreground_rate_limit_millis", TextUtils.join(",", new Long[]{Long.valueOf(TimeUnit.SECONDS.toMillis(10))}));
    public static final agvx m = agvx.a(s, "sync:rate_limit_millis", TextUtils.join(",", new Long[]{Long.valueOf(TimeUnit.SECONDS.toMillis(10)), Long.valueOf(TimeUnit.MINUTES.toMillis(1)), Long.valueOf(TimeUnit.MINUTES.toMillis(5)), Long.valueOf(TimeUnit.HOURS.toMillis(1))}));
    public static final agvx n = agvx.a(s, "sync:min_delay_on_server_error_millis", TimeUnit.MINUTES.toMillis(2));
    public static final agvx o = agvx.a(s, "sync:max_delay_on_server_error_millis", TimeUnit.DAYS.toMillis(14));
    public static final agvx p = agvx.a(s, "sync:delay_on_server_overload_millis", TimeUnit.DAYS.toMillis(3));
    public static final agvx q = agvx.a(s, "affiliation_version", 1);
    public static final agvx r = agvx.a(s, "enabled_log_types", "");
    private static final agvw s;

    static {
        agvw a2 = new agvw(yef.a("com.google.android.gms.chromesync")).a("gms:chromesync:");
        s = a2;
        a = agvx.a(a2, "chrome_dashboard_link", "https://www.google.com/settings/chrome/sync");
        agvx.a(s, "password_api_use_grpc", true);
        agvx.a(s, "affiliation_api_grpc_host", "www.googleapis.com");
        agvx.a(s, "affiliation_api_grpc_port", 443);
        agvx.a(s, "affiliation_api_grpc_server_scope", "https://www.googleapis.com/auth/login_manager");
    }
}
