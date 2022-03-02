package defpackage;

import android.text.TextUtils;
import com.android.volley.toolbox.ImageRequest;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: ozz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ozz {
    public static final agvx A = agvx.a(G, "gms_icing_silent_feedback_mdh_sample_interval", 500);
    public static final agvx B = agvx.a(G, "gms_icing_mdh_task_reschedule_sample_interval", 50);
    public static final agvx C = agvx.a(G, "gms_icing_mdh_flags_change_sample_interval", 50);
    public static final agvx D = agvx.a(G, "gms_icing_mdh_registration_write_delay_seconds", 5);
    public static final agvx E = agvx.a(G, "gms_icing_mdh_immediate_scheduler_execution_delay_seconds", 0);
    public static final agvx F = agvx.a(G, "gms_icing_mdh_broadcast_listeners_blacklisted_packages", "");
    private static final agvw G;
    public static final agvx a;
    public static final agvx b = agvx.a(G, "gms_icing_mdh_call_credentials_stats_sample_interval", (int) ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
    public static final agvx c = agvx.a(G, "gms_icing_mdh_sync_stats_sample_interval", 100);
    public static final agvx d = agvx.a(G, "gms_icing_mdh_notification_stats_sample_interval", (int) ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
    public static final agvx e = agvx.a(G, "gms_icing_mdh_server_host_override", "");
    public static final agvx f = agvx.a(G, "gms_icing_mdh_server_port_override", 0);
    public static final agvx g = agvx.a(G, "gms_icing_mdh_grpc_deadline_seconds", TimeUnit.MINUTES.toSeconds(5));
    public static final agvx h = agvx.a(G, "gms_icing_mdh_notifications_sender_id", "1064998223678");
    public static final agvx i = agvx.a(G, "gms_icing_mdh_sync_periodic_task_period", TimeUnit.HOURS.toSeconds(48));
    public static final agvx j = agvx.a(G, "gms_icing_mdh_sync_periodic_task_flex", TimeUnit.HOURS.toSeconds(24));
    public static final agvx k = agvx.a(G, "gms_icing_mdh_sync_periodic_requires_charging", true);
    public static final agvx l = agvx.a(G, "gms_icing_mdh_sync_unconditional_threshold", TimeUnit.HOURS.toSeconds(6));
    public static final agvx m = agvx.a(G, "gms_icing_mdh_sync_outdated_threshold", TimeUnit.HOURS.toSeconds(1));
    public static final agvx n = agvx.a(G, "gms_icing_mdh_sync_refresh_minimum_timeout_millis", TimeUnit.SECONDS.toMillis(0));
    public static final agvx o = agvx.a(G, "gms_icing_mdh_sync_post_write_start_timeout_fraction", 0.9d);
    public static final agvx p = agvx.a(G, "gms_icing_mdh_sync_notification_delay_seconds", TimeUnit.MINUTES.toSeconds(2));
    public static final agvx q = agvx.a(G, "gms_icing_mdh_sync_notification_delay_fraction", 0.5d);
    public static final agvx r = agvx.a(G, "gms_icing_mdh_sync_throttle_trigger_on_first", true);
    public static final agvx s = agvx.a(G, "gms_icing_mdh_sync_throttle_delay_start", TimeUnit.MINUTES.toSeconds(10));
    public static final agvx t = agvx.a(G, "gms_icing_mdh_sync_max_execution_delay", TimeUnit.MINUTES.toSeconds(5));
    public static final agvx u = agvx.a(G, "gms_icing_mdh_wipeout_period", TimeUnit.DAYS.toSeconds(1));
    public static final agvx v = agvx.a(G, "gms_icing_mdh_wipeout_flex", TimeUnit.HOURS.toSeconds(12));
    public static final agvx w = agvx.a(G, "gms_icing_mdh_wipeout_requires_charging", true);
    public static final agvx x = agvx.a(G, "gms_icing_mdh_subscriptions_cleanup_period", TimeUnit.DAYS.toSeconds(2));
    public static final agvx y = agvx.a(G, "gms_icing_mdh_subscriptions_cleanup_flex", TimeUnit.DAYS.toSeconds(1));
    public static final agvx z = agvx.a(G, "gms_icing_mdh_subscriptions_cleanup_requires_charging", true);

    static {
        agvw agvw = new agvw(yef.a("com.google.android.gms.icing"));
        G = agvw;
        a = agvx.a(agvw, "gms_icing_mdh_channel_event_sample_interval", 100);
        agvx.a(G, "gms_icing_mdh_notifications_registration_stats_sample_interval", 100);
        agvx.a(G, "gms_icing_mdh_scheduler_missing_active_network_default", false);
    }

    public static Set a() {
        if (!"".equals(F.c())) {
            return new HashSet(Arrays.asList(TextUtils.split((String) F.c(), ",")));
        }
        return anfv.a;
    }
}
