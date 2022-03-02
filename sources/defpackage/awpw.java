package defpackage;

/* renamed from: awpw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awpw implements awpv {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.backup"));
        agvx.a(agvw, "backup_always_enable_target_components", false);
        agvx.a(agvw, "backup_disable_dolly_for_first_party_apps", true);
        agvx.a(agvw, "backup_enable_transport_clearcut_event_logger", true);
        agvx.a(agvw, "backup_enforce_user_opt_in", true);
        agvx.a(agvw, "full_backup_restore_whitelist", "com.google.android.deskclock,com.android.providers.telephony,com.android.wallpaperbackup,com.google.android.apps.nexuslauncher,com.google.android.apps.paidtasks,com.google.android.apps.chrome.document,com.google.android.apps.chrome,com.chrome.beta,com.android.chrome,com.chrome.dev,com.chrome.canary,com.chrome.work,org.chromium.chrome,com.google.android.apps.books,com.google.android.apps.enterprise.cpanel,com.google.android.apps.gamut,com.google.android.apps.jobs,com.google.android.keep,com.google.android.apps.tachyon,com.google.android.apps.fitness,com.android.launcher3,com.google.android.apps.youtube.vr,com.google.android.apps.chromecast.app,com.google.android.calculator,com.google.android.inputmethod.latin,com.google.android.inputmethod.latin.canary,");
        agvx.a(agvw, "backup_full_backup_scheduler_backoff_exponential_in_secs", 600);
        agvx.a(agvw, "backup_full_backup_scheduler_bad_package_max_backoff_in_secs", 259200);
        agvx.a(agvw, "backup_full_backup_scheduler_bad_package_min_backoff_in_secs", 86400);
        agvx.a(agvw, "backup_full_backup_scheduler_max_moratorium_in_secs", 86400);
        agvx.a(agvw, "backup_full_restore_http_connection_attempts", 3);
        agvx.a(agvw, "backup_log_full_backup_schedule", false);
        agvx.a(agvw, "backup_log_full_backup_schedule_period_hours", 24);
        agvx.a(agvw, "backup_min_delay_per_app_secs", 86400);
        agvx.a(agvw, "backup_min_time_between_snapshots_ms", 604800000);
        agvx.a(agvw, "backup_min_wait_between_writing_backup_pass_time_ms", 30000);
        agvx.a(agvw, "backup_rate_limit_fuzz_range_hrs", 12);
        agvx.a(agvw, "backup_rate_limited_apps", "");
        agvx.a(agvw, "Transport__backup_reject_package_when_account_not_set", true);
        agvx.a(agvw, "backup_scotty_server_upload_url", "https://android.googleapis.com/backup/upload");
        agvx.a(agvw, "backup_send_snapshot_logs", true);
        agvx.a(agvw, "backup_send_snapshot_when_backup_disabled", true);
        agvx.a(agvw, "backup_server_environment_logging_key", 1);
        a = agvx.a(agvw, "backup_server_url", "https://android.clients.google.com/backup");
        agvx.a(agvw, "backup_should_abort_kv_if_full_backup_is_in_progress", true);
        agvx.a(agvw, "backup_should_listen_to_backup_account_changed_outside_transport_p", true);
        agvx.a(agvw, "backup_should_listen_to_backup_account_changed_outside_transport_pre_p", false);
        agvx.a(agvw, "backup_silent_feedback_sampling_rate_job_scheduler", 0.01d);
        agvx.a(agvw, "backup_silent_feedback_sampling_rate_transport", 0.001d);
        agvx.a(agvw, "backup_stats_min_update_interval_hrs", 12);
        agvx.a(agvw, "backup_wifi_bounce_delay_ms", 1200000);
        agvx.a(agvw, "enable_backup_restore_playlog", true);
        agvx.a(agvw, "full_backup_app_quota_in_mega", 25);
        agvx.a(agvw, "full_backup_interval_in_secs", 0);
        agvx.a(agvw, "full_backup_quota_backoff_in_hours", 168);
        agvx.a(agvw, "full_restore_http_connection_initial_timeout_in_secs", 5);
        agvx.a(agvw, "full_restore_http_connection_retry_initial_delay_in_secs", 5);
        agvx.a(agvw, "full_restore_read_chunk_max_attempts", 2);
        agvx.a(agvw, "gcm_package_backup_enabled", true);
        agvx.a(agvw, "is_kv_backup_enabled", true);
        agvx.a(agvw, "key_value_backup_restore_whitelist", "");
        agvx.a(agvw, "kv_backup_min_delay_secs", 86400);
        agvx.a(agvw, "Transport__log_http_response_in_full_backup", false);
        b = agvx.a(agvw, "sidewinder_backup_server_url", "https://android.googleapis.com/backup");
        agvx.a(agvw, "sw_full_backup_whitelist", "");
        agvx.a(agvw, "sw_key_value_backup_whitelist", "@pm@,com.android.vending,com.android.nfc,com.android.providers.userdictionary,com.google.android.calendar,com.google.android.dialer,com.google.android.inputmethod.latin");
        agvx.a(agvw, "test_backup_dump_transport_clearcut_logs_to_file", false);
        agvx.a(agvw, "testing_backup_enable_systrace", false);
        c = agvx.a(agvw, "Transport__use_sidewinder_backup_server_url_system_property", true);
    }

    public final String a() {
        return (String) a.c();
    }

    public final String b() {
        return (String) b.c();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
