package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.toolbox.ImageRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: ozx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ozx {
    public static final agvx A = agvx.a(ct, "gms_icing_developer_key", "745476177629.apps.googleusercontent.com");
    public static final agvx B = agvx.a(ct, "gms_icing_report_usage_rate_limit_interval_ms", 86400000);
    public static final agvx C = agvx.a(ct, "gms_icing_report_usage_rate_limit_per_corpus_bytes", 1048576);
    public static final agvx D = agvx.a(ct, "gms_icing_enable_third_party_context", false);
    public static final agvx E = agvx.a(ct, "gms_icing_enable_usage_report_to_platform_corpora", true);
    public static final agvx F = agvx.a(ct, "gms_icing_enable_action_notification_broadcast", true);
    public static final agvx G = agvx.a(ct, "gms_icing_action_notification_limit_per_second", 60);
    public static final agvx H = agvx.a(ct, "gms_icing_action_notification_limit_per_day", 2000);
    public static final agvx I = agvx.a(ct, "gms_icing_whitelisted_packages_for_keyboard_notification", "com.google.android.apps.messaging,com.google.android.apps.chrome,com.chrome.canary,com.chrome.dev,com.chrome.beta,com.android.chrome,com.google.android.apps.maps,com.google.android.apps.gmm.qp,com.google.android.apps.gmm,com.google.android.apps.gmm.fishfood,com.google.android.apps.gmm.dev");
    public static final agvx J = agvx.a(ct, "gms_icing_report_usage_timout_ms", TimeUnit.SECONDS.toMillis(2));
    public static final agvx K = agvx.a(ct, "gms_icing_request_indexing_content_fetch_delay_millis", TimeUnit.SECONDS.toMillis(1));
    public static final agvx L = agvx.a(ct, "gms_icing_update_app_params_start_delay_secs", TimeUnit.HOURS.toSeconds(1));
    public static final agvx M = agvx.a(ct, "gms_icing_update_app_params_end_delay_secs", TimeUnit.HOURS.toSeconds(6));
    public static final agvx N = agvx.a(ct, "gms_icing_global_search_app_package_names", "com.google.android.googlequicksearchbox,com.google.android.apps.nexuslauncher,com.google.android.carassistant");
    public static final agvx O = agvx.a(ct, "gms_icing_debug_app_package_names", "");
    public static final agvx P = agvx.a(ct, "gms_icing_enable_annotation_payload_api", true);
    public static final agvx Q = agvx.a(ct, "gms_icing_app_history_upload_enabled", true);
    public static final agvx R = agvx.a(ct, "gms_icing_app_history_upload_immediate", true);
    public static final agvx S = agvx.a(ct, "gms_icing_app_history_upload_start_delay_secs", TimeUnit.MINUTES.toSeconds(30));
    public static final agvx T = agvx.a(ct, "gms_icing_app_history_upload_end_delay_secs", TimeUnit.HOURS.toSeconds(6));
    public static final agvx U = agvx.a(ct, "gms_icing_help_settings_url", "https://support.google.com/websearch?p=ws_searchdata");
    public static final agvx V = agvx.a(ct, "gms_icing_min_sms_deferral_time_millis", TimeUnit.SECONDS.toMillis(5));
    public static final agvx W = agvx.a(ct, "gms_icing_max_sms_deferral_time_millis", TimeUnit.SECONDS.toMillis(30));
    public static final agvx X = agvx.a(ct, "gms_icing_min_sms_deletion_delay_time_millis", TimeUnit.HOURS.toMillis(1));
    public static final agvx Y = agvx.a(ct, "gms_icing_cld3_max_detected_text_bytes", 100);
    public static final agvx Z = agvx.a(ct, "gms_icing_enable_saft_segmenter", true);
    public static final agvx a;
    public static final agvx aA = agvx.a(ct, "gms_icing_enable_3p_version_7_to_8_upgrade", true);
    public static final agvx aB = agvx.a(ct, "gms_icing_enable_3p_version_8_to_9_upgrade", true);
    public static final agvx aC = agvx.a(ct, "gms_icing_enable_3p_version_9_to_8_downgrade", true);
    public static final agvx aD = agvx.a(ct, "gms_icing_get_indexable_from_sequence_table", true);
    public static final agvx aE = agvx.a(ct, "gms_icing_enable_clean_app_indexing_db_on_maintenance", true);
    public static final agvx aF = agvx.a(ct, "gms_icing_3p_database_helper_version", -1);
    public static final agvx aG = agvx.a(ct, "gms_icing_app_indexing_task_queue_max_size", (int) ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
    public static final agvx aH = agvx.a(ct, "gms_icing_enable_updateindex_oneoff_schedule", true);
    public static final agvx aI = agvx.a(ct, "gms_icing_enable_updateindex_oneoff_task", true);
    public static final agvx aJ = agvx.a(ct, "gms_icing_enable_updateindex_periodic_schedule", true);
    public static final agvx aK = agvx.a(ct, "gms_icing_enable_updateindex_periodic_task", true);
    public static final agvx aL = agvx.a(ct, "gms_icing_enable_updateindex_from_content_provider", false);
    public static final agvx aM = agvx.a(ct, "gms_icing_enable_updateindex_intentsending", true);
    public static final agvx aN = agvx.a(ct, "gms_icing_enable_update_index_internally", true);
    public static final agvx aO = agvx.a(ct, "gms_icing_clear_internal_corpora_on_content_incarnation_mismatch", true);
    public static final agvx aP = agvx.a(ct, "gms_icing_app_indexing_blacklisted_packages", "");
    public static final agvx aQ = agvx.a(ct, "gms_icing_app_indexing_rejected_types", "");
    public static final agvx aR = agvx.a(ct, "gms_icing_app_history_debug_enabled", false);
    public static final agvx aS = agvx.a(ct, "gms_icing_report_usage_num_running_tasks", 3);
    public static final agvx aT = agvx.a(ct, "gms_icing_usage_stats_delta_millis", TimeUnit.MINUTES.toMillis(1));
    public static final agvx aU = agvx.a(ct, "gms_icing_calendar_indexing_by_content_uri_triggered_task", false);
    public static final agvx aV = agvx.a(ct, "gms_icing_calendar_indexing_on_provider_changed", true);
    public static final agvx aW = agvx.a(ct, "gms_icing_calendar_indexing_on_rebuild_index", true);
    public static final agvx aX = agvx.a(ct, "gms_icing_clear_calendar_data", false);
    public static final agvx aY = agvx.a(ct, "gms_icing_calendar_indexing_task_time_before_millis", TimeUnit.SECONDS.toMillis(1));
    public static final agvx aZ = agvx.a(ct, "gms_icing_calendar_indexing_task_time_between_millis", TimeUnit.SECONDS.toMillis(30));
    public static final agvx aa = agvx.a(ct, "gms_icing_enable_address_annotator_data_files", false);
    public static final agvx ab = agvx.a(ct, "gms_icing_annotator_enable_address_multiple_countries", false);
    public static final agvx ac = agvx.a(ct, "gms_icing_disable_apps_indexing_urda", false);
    public static final agvx ad = agvx.a(ct, "gms_icing_corpora_migration_aware_min_gsa_version", Integer.MAX_VALUE);
    public static final agvx ae = agvx.a(ct, "gms_icing_enable_app_indexing_content_corpora_min_gsa_version", 300651176);
    public static final agvx af = agvx.a(ct, "gms_icing_enable_null_corpora_for_agsa_min_version", 300721602);
    public static final agvx ag = agvx.a(ct, "gms_icing_disable_contacts_corpus", false);
    public static final agvx ah = agvx.a(ct, "gms_icing_contacts_provider_initial_poll_delay_ms", TimeUnit.MINUTES.toMillis(5));
    public static final agvx ai = agvx.a(ct, "gms_icing_contacts_provider_repoll_period_ms", TimeUnit.MINUTES.toMillis(5));
    public static final agvx aj = agvx.a(ct, "gms_icing_contacts_provider_max_repoll_attempts", 3);
    public static final agvx ak = agvx.a(ct, "gms_icing_contacts_provider_change_batching_delay_ms", TimeUnit.SECONDS.toMillis(30));
    public static final agvx al = agvx.a(ct, "gms_icing_contacts_update_all_interval_with_delta_ms", TimeUnit.DAYS.toMillis(7));
    public static final agvx am = agvx.a(ct, "gms_icing_mms_sms_query_batch_size", 100);
    public static final agvx an = agvx.a(ct, "gms_icing_enable_content_uri_triggered_task", true);
    public static final agvx ao = agvx.a(ct, "gms_icing_send_contact_changed_broadcast_no_updates", false);
    public static final agvx ap = agvx.a(ct, "gms_icing_debug_ce_allow_http_localhost", false);
    public static final agvx aq = agvx.a(ct, "gms_icing_enable_app_indexing", true);
    public static final agvx ar = agvx.a(ct, "gms_icing_enable_user_actions", true);
    public static final agvx as = agvx.a(ct, "gms_icing_enable_validate_intent_uri", true);
    public static final agvx at = agvx.a(ct, "gms_icing_enable_3p_error_cache", true);
    public static final agvx au = agvx.a(ct, "gms_icing_enable_3p_error_cache_clear_ttl", true);
    public static final agvx av = agvx.a(ct, "gms_icing_enable_3p_error_cache_clear_at_uninstall", true);
    public static final agvx aw = agvx.a(ct, "gms_icing_enable_3p_user_action_cache", true);
    public static final agvx ax = agvx.a(ct, "gms_icing_enable_3p_user_action_cache_clear_ttl", true);
    public static final agvx ay = agvx.a(ct, "gms_icing_enable_3p_user_action_cache_clear_at_uninstall", true);
    public static final agvx az = agvx.a(ct, "gms_icing_enable_3p_user_action_associated_indexable", true);
    public static final agvx b = agvx.a(ct, "gms_icing_enable_gcm_task_for_internal_corpora_maintenance", true);
    public static final agvx bA = agvx.a(ct, "gms_icing_ime_package_names", "com.android.inputmethod.latin,com.google.android.inputmethod.latin,com.google.android.inputmethod.latin.dev,com.google.android.inputmethod.latin.canary,com.google.android.inputmethod.pinyin,com.google.android.inputmethod.korean,com.google.android.inputmethod.japanese,com.google.android.apps.inputmethod.hindi,com.google.android.apps.inputmethod.cantonese,com.google.android.apps.inputmethod.zhuyin");
    public static final agvx bB = agvx.a(ct, "gms_icing_app_indexing_type_access_whitelist", "com.android.inputmethod.latin=Sticker,StickerPack;com.google.android.inputmethod.latin=Sticker,StickerPack;com.google.android.inputmethod.latin.dev=Sticker,StickerPack;com.google.android.inputmethod.latin.canary=Sticker,StickerPack;com.google.android.inputmethod.pinyin=Sticker,StickerPack;com.google.android.inputmethod.korean=Sticker,StickerPack;com.google.android.inputmethod.japanese=Sticker,StickerPack;com.google.android.apps.inputmethod.hindi=Sticker,StickerPack;com.google.android.apps.inputmethod.cantonese=Sticker,StickerPack;com.google.android.apps.inputmethod.zhuyin=Sticker,StickerPack");
    public static final agvx bC = agvx.a(ct, "gms_icing_enable_icing_permission_checker_in_authenticate", true);
    public static final agvx bD = agvx.a(ct, "gms_icing_allow_query_with_null_package_name_not_null_corpus_name", true);
    public static final agvx bE = agvx.a(ct, "gms_icing_access_control_list", cs);
    public static final agvx bF = agvx.a(ct, "gms_icing_search_corpus_config_override_proto", (Object) null, ozw.a);
    public static final agvx bG = agvx.a(ct, "gms_icing_search_corpus_config_override_enabled", true);
    public static final agvx bH = agvx.a(ct, "global_search_mobile_application_corpus_min_gmscore_client_sdk_version", Integer.MAX_VALUE);
    public static final agvx bI = agvx.a(ct, "global_search_sms_corpus_min_gmscore_client_sdk_version", 11200000);
    public static final agvx bJ = agvx.a(ct, "global_search_message_corpus_min_gmscore_client_sdk_version", 12200000);
    public static final agvx bK = agvx.a(ct, "global_search_photograph_corpus_min_gsa_version", 12200000);
    public static final agvx bL = agvx.a(ct, "global_search_event_corpus_min_gmscore_client_sdk_version", 11200000);
    public static final agvx bM = agvx.a(ct, "global_search_apdl_contacts_corpus_min_gmscore_client_sdk_version", Integer.MAX_VALUE);
    public static final agvx bN = agvx.a(ct, "global_search_gmail_min_gmscore_client_sdk_version", Integer.MAX_VALUE);
    public static final agvx bO = agvx.a(ct, "gms_icing_app_indexing_database_helper_silent_feedback_interval_millis", TimeUnit.DAYS.toMillis(1));
    public static final agvx bP = agvx.a(ct, "gms_icing_sherlog_account_name", "");
    public static final agvx bQ = agvx.a(ct, "gms_icing_low_power_percentage", 0.15d);
    public static final agvx bR = agvx.a(ct, "gms_icing_one_off_rebuild_index_start_delay_seconds", TimeUnit.MINUTES.toSeconds(15));
    public static final agvx bS = agvx.a(ct, "gms_icing_one_off_rebuild_index_end_delay_seconds", TimeUnit.HOURS.toSeconds(36));
    public static final agvx bT = agvx.a(ct, "gms_icing_one_off_rebuild_index_require_charging", true);
    public static final agvx bU = agvx.a(ct, "gms_icing_one_off_rebuild_index_network_State", 2);
    public static final agvx bV = agvx.a(ct, "gms_icing_periodic_rebuild_index_period_seconds", TimeUnit.DAYS.toSeconds(1));
    public static final agvx bW = agvx.a(ct, "gms_icing_periodic_rebuild_index_flex_seconds", TimeUnit.HOURS.toSeconds(12));
    public static final agvx bX = agvx.a(ct, "gms_icing_periodic_rebuild_index_package_interval_millis", TimeUnit.DAYS.toMillis(30));
    public static final agvx bY = agvx.a(ct, "gms_icing_periodic_rebuild_index_min_package_interval_millis", TimeUnit.DAYS.toMillis(15));
    public static final agvx bZ = agvx.a(ct, "gms_icing_periodic_rebuild_index_require_charging", true);
    public static final agvx ba = agvx.a(ct, "gms_icing_calendar_index_time_before_millis", TimeUnit.DAYS.toMillis(366));
    public static final agvx bb = agvx.a(ct, "gms_icing_calendar_index_time_after_millis", TimeUnit.DAYS.toMillis(366));
    public static final agvx bc = agvx.a(ct, "gms_icing_calendar_max_attendees", Integer.MAX_VALUE);
    public static final agvx bd = agvx.a(ct, "gms_icing_calendar_indexing_max_tasks", 100);
    public static final agvx be = agvx.a(ct, "gms_icing_calendar_indexing_max_update_batch_size", 25);
    public static final agvx bf = agvx.a(ct, "gms_icing_calendar_indexing_max_remove_batch_size", 50);
    public static final agvx bg = agvx.a(ct, "gms_icing_calendar_silent_feedback_interval_millis", TimeUnit.DAYS.toMillis(1));
    public static final agvx bh = agvx.a(ct, "gms_icing_enable_corpora_aging_in_compaction", true);
    public static final agvx bi = agvx.a(ct, "gms_icing_app_indexing_document_max_age_secs", (int) TimeUnit.DAYS.toSeconds(90));
    public static final agvx bj = agvx.a(ct, "gms_icing_max_num_rows_per_table", 10000);
    public static final agvx bk = agvx.a(ct, "gms_icing_max_num_query_terms", 50);
    public static final agvx bl = agvx.a(ct, "gms_icing_disable_clipped_retrieval_optimization", false);
    public static final agvx bm = agvx.a(ct, "gms_icing_data_download_period_secs", TimeUnit.DAYS.toSeconds(1));
    public static final agvx bn = agvx.a(ct, "gms_icing_refill_docs_cursor_to_fix_b30750453", true);
    public static final agvx bo = agvx.a(ct, "gms_icing_enable_global_query_section_restricts", true);
    public static final agvx bp = agvx.a(ct, "gms_icing_s2_cells_per_box", 50);
    public static final agvx bq = agvx.a(ct, "gms_icing_s2_cells_per_in_l", 15);
    public static final agvx br = agvx.a(ct, "gms_icing_enable_annotator_blobs", true);
    public static final agvx bs = agvx.a(ct, "gms_icing_enable_index_on_low_ram_device", true);
    public static final agvx bt = agvx.a(ct, "gms_icing_skip_init_on_low_memory", true);
    public static final agvx bu = agvx.a(ct, "gms_icing_do_not_act_on_gsa_removal_if_running_as_api_test", false);
    public static final agvx bv = agvx.a(ct, "gms_icing_tv_device_resolution_method", 2);
    public static final agvx bw = agvx.a(ct, "gms_icing_udc_should_send_settings_changed_broadcast", false);
    public static final agvx bx = agvx.a(ct, "gms_icing_lockbox_connection_timeout_millis", 500);
    public static final agvx by = agvx.a(ct, "gms_icing_annotator_enable_date_range_extraction", false);
    public static final agvx bz = agvx.a(ct, "gms_icing_enable_subscriber_number_extraction", true);
    public static final agvx c = agvx.a(ct, "gms_icing_internal_corpora_maintenance_frequency_secs", TimeUnit.DAYS.toSeconds(1));
    public static final agvx ca = agvx.a(ct, "gms_icing_periodic_rebuild_index_network_state", 2);
    public static final agvx cb = agvx.a(ct, "gms_icing_wake_lock_watchdog_sleep_millis", TimeUnit.MINUTES.toMillis(10));
    public static final agvx cc = agvx.a(ct, "gms_icing_contact_name_section_weight", 10);
    public static final agvx cd = agvx.a(ct, "gms_icing_contact_email_telephone_section_weight", 3);
    public static final agvx ce = agvx.a(ct, "gms_icing_contact_corpus_current_version", "8");
    public static final agvx cf = agvx.a(ct, "gms_icing_max_samples_per_clearcut_counter", 100);
    public static final agvx cg = agvx.a(ct, "gms_icing_app_indexing_batch_max_tasks", 100);
    public static final agvx ch = agvx.a(ct, "gms_icing_app_indexing_batch_max_rows", 5000);
    public static final agvx ci = agvx.a(ct, "gms_icing_allow_flag_change_to_invalidate_ground_truth", true);
    public static final agvx cj = agvx.a(ct, "gms_icing_relevance_ranking_strategy_st_sort_expr", "(MUL _MAX_HIT_WEIGHT _CORPUS_WEIGHT (ADD 0.5 (MUL 0.5 (EXP (DIV (MAX 0 (SUB _TIMESTAMP (MAX _LAST_USED_TIMESTAMP _CREATED_TIMESTAMP))) -604800)))))");
    public static final agvx ck = agvx.a(ct, "gms_icing_packages_whitelisted_for_appdatasearch_indexing_api_on_p", "com.google.android.gms");
    public static final agvx cl = agvx.a(ct, "gms_icing_slice_retrieval_timeout_ms", TimeUnit.SECONDS.toMillis(10));
    public static final agvx cm = agvx.a(ct, "gms_icing_serialized_slice_bytes_clearcut_counter_bucket_size", 1024);
    public static final agvx cn = agvx.a(ct, "gms_icing_slice_retrieval_latency_ms_clearcut_counter_bucket_size", 100);

    /* renamed from: co  reason: collision with root package name */
    public static final agvx f17co = agvx.a(ct, "gms_icing_max_serialized_slice_bytes", 204800);
    public static final agvx cp = agvx.a(ct, "gms_icing_max_document_size", 65535);
    public static final agvx cq = agvx.a(ct, "gms_icing_query_response_bytes_limit", 1048576);
    public static final agvx cr = agvx.a(ct, "gms_icing_update_via_patch_filter", Collections.emptyList(), new pab());
    private static final byte[] cs = new byte[0];
    private static final agvw ct;
    public static final agvx d = agvx.a(ct, "gms_icing_gcm_tasks_require_device_idle", true);
    public static final agvx e = agvx.a(ct, "gms_icing_internal_corpora_maintenance_flex_secs", TimeUnit.HOURS.toSeconds(12));
    public static final agvx f = agvx.a(ct, "gms_icing_compact_interval_ms", 604800000);
    public static final agvx g = agvx.a(ct, "gms_icing_maintenance_force_interval_ms", 2419200000L);
    public static final agvx h = agvx.a(ct, "gms_icing_storage_threshold_bytes", 0);
    public static final agvx i = agvx.a(ct, "gms_icing_storage_threshold_percent", 0);
    public static final agvx j = agvx.a(ct, "gms_icing_storage_compact_threshold", 10);
    public static final agvx k = agvx.a(ct, "gms_icing_log_debug_ui_stats", true);
    public static final agvx l = agvx.a(ct, "gms_icing_log_corpus_stats", true);
    public static final agvx m = agvx.a(ct, "gms_icing_log_in_worker_thread", true);
    public static final agvx n = agvx.a(ct, "gms_icing_enable_logging_api_stats", true);
    public static final agvx o = agvx.a(ct, "gms_icing_enable_silent_feedback", true);
    public static final agvx p = agvx.a(ct, "gms_icing_context_engine_proto_base_url", "");
    public static final agvx q = agvx.a(ct, "gms_icing_context_engine_proto_path", "");
    public static final agvx r = agvx.a(ct, "gms_icing_context_engine_proto_override", "");
    public static final agvx s = agvx.a(ct, "gms_icing_context_engine_proto_enable_logging", false);
    public static final agvx t = agvx.a(ct, "gms_icing_context_engine_timeout_millis", (int) DefaultRetryPolicy.DEFAULT_TIMEOUT_MS);
    public static final agvx u = agvx.a(ct, "gms_icing_context_engine_request_timeout_millis", TimeUnit.SECONDS.toMillis(10));
    public static final agvx v = agvx.a(ct, "gms_icing_context_engine_retry_count", 1);
    public static final agvx w = agvx.a(ct, "gms_icing_context_engine_backoff_mult", 2.0d);
    public static final agvx x = agvx.a(ct, "gms_icing_seldon_base_auth_scope", "https://www.googleapis.com/auth/contextengine");
    public static final agvx y = agvx.a(ct, "gms_icing_footprints_api_auth_scope", "oauth2:https://www.googleapis.com/auth/webhistory");
    public static final agvx z = agvx.a(ct, "gms_icing_footprints_api_url_base", "https://history.google.com/history/api");

    static {
        agvw agvw = new agvw(yef.a("com.google.android.gms.icing"));
        ct = agvw;
        a = agvx.a(agvw, "gms_icing_maintenance_frequency_ms", 86400000);
        agvx.a(ct, "gms_icing_enabled_annotators_for_annotation_api", "");
        agvx.a(ct, "gms_icing_contacts_update_all_interval_without_delta_ms", TimeUnit.DAYS.toMillis(1));
        agvx.a(ct, "gms_icing_enable_send_rebuild_index_for_apdl_index", true);
        agvx.a(ct, "gms_icing_message_indexing_max_remove_batch_size", 100);
        agvx.a(ct, "gms_icing_ime_whitelisted_packages", "com.google.android.gm,com.google.android.gms");
        agvx.a(ct, "Icing__contacts_logger_disabled", false);
    }

    public static Set a() {
        return new HashSet(Arrays.asList(TextUtils.split((String) bA.c(), ",")));
    }

    public static boolean b(String str) {
        return jhx.a((Object[]) ((String) aP.c()).split(","), (Object) str);
    }

    public static boolean c(String str) {
        return ((Boolean) aq.c()).booleanValue() && !b(str);
    }

    public static boolean a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        int i2 = Build.VERSION.SDK_INT;
        return Settings.Global.getInt(contentResolver, "adb_enabled", 0) != 0;
    }

    public static boolean a(String str) {
        return jhx.a((Object[]) ((String) I.c()).split(","), (Object) str);
    }
}
