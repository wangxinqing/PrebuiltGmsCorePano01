package defpackage;

import com.android.volley.DefaultRetryPolicy;
import java.util.concurrent.TimeUnit;

/* renamed from: jzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jzq {
    public static final agvx A = agvx.a(bf, "content_cache_shared_max_bytes", 100000000);
    public static final agvx B = agvx.a(bf, "content_cache_shared_max_total_space_fraction", 0.05d);
    public static final agvx C = agvx.a(bf, "content_internal_max_bytes", 200000000);
    public static final agvx D = agvx.a(bf, "content_internal_max_total_space_fraction", 0.25d);
    public static final agvx E = agvx.a(bf, "content_internal_min_free_space_bytes", 5242880);
    public static final agvx F = agvx.a(bf, "content_maintenance_min_interval_millis", TimeUnit.MILLISECONDS.convert(30, TimeUnit.SECONDS));
    public static final agvx G = agvx.a(bf, "control_progress_api_whitelist", "576267593750,900820440409");
    public static final agvx H = agvx.a(bf, "device_status_report_min_interval_millis", TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS));
    public static final agvx I = agvx.a(bf, "disable_features_manchego", "");
    public static final agvx J = agvx.a(bf, "disable_sync", false);
    public static final agvx K = agvx.a(bf, "server_url", "https://www.googleapis.com");
    public static final agvx L = agvx.a(bf, "enable_apiary_backend_traces", true);
    public static final agvx M = agvx.a(bf, "enable_folder_color_in_file_picker", false);
    public static final agvx N = agvx.a(bf, "enable_folder_color_sync", true);
    public static final agvx O = agvx.a(bf, "enable_folder_color_update", true);
    public static final agvx P = agvx.a(bf, "enable_open_file_dialog_search", true);
    public static final agvx Q = agvx.a(bf, "enable_open_file_dialog_sort_options", true);
    public static final agvx R = agvx.a(bf, "enable_permission", false);
    public static final agvx S = agvx.a(bf, "enable_push_notification", true);
    public static final agvx T = agvx.a(bf, "enable_query_result_projection", true);
    public static final agvx U = agvx.a(bf, "event_router_idle_timeout_millis", TimeUnit.MILLISECONDS.convert(5, TimeUnit.SECONDS));
    public static final agvx V = agvx.a(bf, "folder_color_default_color", "#8f8f8f");
    public static final agvx W = agvx.a(bf, "force_full_sync_level", 0);
    public static final agvx X = agvx.a(bf, "limiter_default_max_tokens", 10);
    public static final agvx Y = agvx.a(bf, "limiter_token_period_millis", 10);
    public static final agvx Z = agvx.a(bf, "max_concurrent_downloads", 5);
    public static final agvx a;
    public static final agvx aA = agvx.a(bf, "singleton_local_id_version", "");
    public static final agvx aB = agvx.a(bf, "sleep_after_recursive_apply_on_server_millis", TimeUnit.MILLISECONDS.convert(10, TimeUnit.SECONDS));
    public static final agvx aC = agvx.a(bf, "streaming_api_whitelist", "");
    public static final agvx aD = agvx.a(bf, "sync_down_description_length_limit", 100000);
    public static final agvx aE = agvx.a(bf, "sync_down_mime_type_length_limit", 100000);
    public static final agvx aF = agvx.a(bf, "sync_down_title_length_limit", 100000);
    public static final agvx aG = agvx.a(bf, "sync_max_feeds_app_data", 40);
    public static final agvx aH = agvx.a(bf, "sync_max_feeds_drive_files", 28);
    public static final agvx aI = agvx.a(bf, "sync_max_feeds_drive_folders", 10);
    public static final agvx aJ = agvx.a(bf, "sync_max_feeds_photos", 2);
    public static final agvx aK = agvx.a(bf, "sync_more_max_feeds_to_retrieve", 1);
    public static final agvx aL = agvx.a(bf, "sync_scheduler_first_party_rate_limit_max_stored_tokens", 20);
    public static final agvx aM = agvx.a(bf, "sync_scheduler_first_party_rate_limit_token_period_millis", TimeUnit.MILLISECONDS.convert(5, TimeUnit.SECONDS));
    public static final agvx aN = agvx.a(bf, "sync_scheduler_max_concurrent", 1);
    public static final agvx aO = agvx.a(bf, "sync_scheduler_on_connect_rate_limit_max_stored_tokens", 5);
    public static final agvx aP = agvx.a(bf, "sync_scheduler_on_connect_rate_limit_token_period_millis", TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS));
    public static final agvx aQ = agvx.a(bf, "sync_scheduler_rate_limit_max_stored_tokens", 5);
    public static final agvx aR = agvx.a(bf, "sync_scheduler_rate_limit_token_period_millis", TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES));
    public static final agvx aS = agvx.a(bf, "sync_scheduler_wakelock_timeout_seconds", TimeUnit.SECONDS.convert(10, TimeUnit.MINUTES));
    public static final agvx aT = agvx.a(bf, "thumbnail_url_format", "https://lh3.googleusercontent.com/d/%s");
    public static final agvx aU = agvx.a(bf, "tombstone_old_max_size", 0);
    public static final agvx aV = agvx.a(bf, "tombstone_time_interval_ms", TimeUnit.MILLISECONDS.convert(30, TimeUnit.DAYS));
    public static final agvx aW = agvx.a(bf, "unsubscribed_keep_time_ms", TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
    public static final agvx aX = agvx.a(bf, "unsubscribed_refresh_time_ms", TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
    public static final agvx aY = agvx.a(bf, "upload_chunk_backoff_growth_factor", 2.0d);
    public static final agvx aZ = agvx.a(bf, "upload_initial_chunk_backoff_seconds", 1.0d);
    public static final agvx aa = agvx.a(bf, "max_concurrent_pin_downloads", 4);
    public static final agvx ab = agvx.a(bf, "max_description_code_points", 100000);
    public static final agvx ac = agvx.a(bf, "max_incomplete_downloads", 10);
    public static final agvx ad = agvx.a(bf, "max_mime_type_code_points", 100000);
    public static final agvx ae = agvx.a(bf, "max_pin_download_retries", 5);
    public static final agvx af = agvx.a(bf, "max_title_code_points", 100000);
    public static final agvx ag = agvx.a(bf, "metrics_logging_mode", 0);
    public static final agvx ah = agvx.a(bf, "mime_type_pattern", ".+");
    public static final agvx ai = agvx.a(bf, "min_push_notification_battery_level_percent", 12);
    public static final agvx aj = agvx.a(bf, "permission_api_whitelist", "383787855441,412042324140");
    public static final agvx ak = agvx.a(bf, "persisted_event_attempts", 3);
    public static final agvx al = agvx.a(bf, "persisted_event_retry_interval_millis", TimeUnit.MILLISECONDS.convert(10, TimeUnit.MINUTES));
    public static final agvx am = agvx.a(bf, "persisted_event_snooze_interval_millis", TimeUnit.MILLISECONDS.convert(5, TimeUnit.MINUTES));
    public static final agvx an = agvx.a(bf, "persisted_event_snooze_growth_base", 2);
    public static final agvx ao = agvx.a(bf, "propagate_file_scope", false);
    public static final agvx ap = agvx.a(bf, "realtime_compaction_mutation_threshold", 100);
    public static final agvx aq = agvx.a(bf, "realtime_oldest_supported_client_lib_version", 6000000);
    public static final agvx ar = agvx.a(bf, "realtime_oldest_supported_gmscore_version", 6000000);
    public static final agvx as = agvx.a(bf, "realtime_persist_undo", false);
    public static final agvx at = agvx.a(bf, "realtime_server_url", "https://drive.google.com/otservice");
    public static final agvx au = agvx.a(bf, "reset_on_reboot_delay_millis", TimeUnit.MILLISECONDS.convert(2, TimeUnit.MINUTES));
    public static final agvx av = agvx.a(bf, "request_photos_space_when_syncing", true);
    public static final agvx aw = agvx.a(bf, "search_max_feeds_to_retrieve", 1);
    public static final agvx ax = agvx.a(bf, "search_query_cache_expiration_ms", TimeUnit.MILLISECONDS.convert(2, TimeUnit.MINUTES));
    public static final agvx ay = agvx.a(bf, "server_default_timeout_ms", (int) DefaultRetryPolicy.DEFAULT_TIMEOUT_MS);
    public static final agvx az = agvx.a(bf, "server_jobset", "prod");
    public static final agvx b = agvx.a(bf, "operation_queue_backoff_max_wait_millis", TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES));
    public static final agvx ba = agvx.a(bf, "upload_chunk_retry_count_max", 4);
    public static final agvx bb = agvx.a(bf, "use_full_access_for_downloads", true);
    public static final agvx bc = agvx.a(bf, "use_held_lock", false);
    public static final agvx bd = agvx.a(bf, "verbose_volley_logging", false);
    public static final agvx be = agvx.a(bf, "wifi_lock_workaround_device_regex", "ZTE~(SmartTab7|SmartTab10)~13");
    private static final agvw bf;
    public static final agvx c = agvx.a(bf, "operation_queue_backoff_wait_growth_factor", 2.0d);
    public static final agvx d = agvx.a(bf, "operation_queue_max_attempt_count", 6);
    public static final agvx e = agvx.a(bf, "action_queue_num_threads", 4);
    public static final agvx f = agvx.a(bf, "action_queue_num_threads_non_uploads", 1);
    public static final agvx g = agvx.a(bf, "action_queue_rate_limited_retry_check_interval_ms", TimeUnit.MILLISECONDS.convert(15, TimeUnit.SECONDS));
    public static final agvx h = agvx.a(bf, "activity_level_low_min_count_threshold", 1);
    public static final agvx i = agvx.a(bf, "activity_level_low_push_notification_sync_interval_ms", TimeUnit.MILLISECONDS.convert(3, TimeUnit.HOURS));
    public static final agvx j = agvx.a(bf, "activity_level_low_window_size_ms", TimeUnit.MILLISECONDS.convert(24, TimeUnit.HOURS));
    public static final agvx k = agvx.a(bf, "activity_level_high_min_count_threshold", 2);
    public static final agvx l = agvx.a(bf, "activity_level_high_push_notification_sync_interval_ms", TimeUnit.MILLISECONDS.convert(5, TimeUnit.MINUTES));
    public static final agvx m = agvx.a(bf, "activity_level_high_window_size_ms", TimeUnit.MILLISECONDS.convert(30, TimeUnit.MINUTES));
    public static final agvx n = agvx.a(bf, "always_send_modified_date", true);
    public static final agvx o = agvx.a(bf, "apiary_trace_token", "");
    public static final agvx p = agvx.a(bf, "app_auth_cache_time_ms", TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS));
    public static final agvx q = agvx.a(bf, "binary_diff_upload_chunksize_scaling", 0.25d);
    public static final agvx r = agvx.a(bf, "binary_diff_upload_min_chunksize", 32);
    public static final agvx s = agvx.a(bf, "binary_diff_upload_min_filesize", 170);
    public static final agvx t = agvx.a(bf, "binary_diff_upload_max_chunksize", 16384);
    public static final agvx u = agvx.a(bf, "changelog_sync_limit", 2499);
    public static final agvx v = agvx.a(bf, "cleanup_action_min_interval_millis", TimeUnit.MILLISECONDS.convert(5, TimeUnit.MINUTES));
    public static final agvx w = agvx.a(bf, "cleanup_custom_props_on_creation", true);
    public static final agvx x = agvx.a(bf, "content_cache_internal_max_bytes", 100000000);
    public static final agvx y = agvx.a(bf, "content_cache_internal_max_total_space_fraction", 0.05d);
    public static final agvx z = agvx.a(bf, "content_cache_internal_min_free_space_bytes", 20000000);

    static {
        agvw b2 = new agvw(yef.a("com.google.android.gms.drive")).a("drive:").b("gms:drive:");
        bf = b2;
        a = agvx.a(b2, "operation_queue_backoff_init_wait", TimeUnit.MILLISECONDS.convert(1, TimeUnit.SECONDS));
        agvx.a(bf, "enable_db_transaction_counter_check_min_api", 0);
        agvx.a(bf, "realtime_cache_duration_millis", TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
        agvx.a(bf, "sync_database_yield_backoff_millis", 600);
        agvx.a(bf, "sync_max_num_backoff", 2);
    }
}