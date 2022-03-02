package defpackage;

import android.content.Context;
import com.android.volley.toolbox.ImageRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: sud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sud {
    public static final suc A = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, sqv.a);
    public static final suc B = a("measurement.upload.retry_time", 1800000L, 1800000L, sqw.a);
    public static final suc C = a("measurement.upload.retry_count", 6, 6, sqx.a);
    public static final suc D = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, sqy.a);
    public static final suc E = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, sqz.a);
    public static final suc F = a("measurement.audience.filter_result_max_count", 200, 200, srb.a);
    public static final suc G = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, src.a);
    public static final suc H = a("measurement.experiment.max_ids", 50, 50, sri.a);
    public static final suc I = a("measurement.max_bundles_per_iteration", 1, 1, srj.a);
    public static final suc J = a("measurement.validation.internal_limits_internal_event_params", false, false, srk.a);
    public static final suc K = a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", true, true, srm.a);
    public static final suc L = a("measurement.client.sessions.session_id_enabled", true, true, srn.a);
    public static final suc M = a("measurement.service.sessions.session_number_enabled", true, true, sro.a);
    public static final suc N = a("measurement.client.sessions.background_sessions_enabled", true, true, srp.a);
    public static final suc O = a("measurement.client.sessions.remove_expired_session_properties_enabled", true, true, srq.a);
    public static final suc P = a("measurement.service.sessions.session_number_backfill_enabled", true, true, srr.a);
    public static final suc Q = a("measurement.service.sessions.remove_disabled_session_number", true, true, srs.a);
    public static final suc R = a("measurement.collection.firebase_global_collection_flag_enabled", true, true, srv.a);
    public static final suc S = a("measurement.collection.efficient_engagement_reporting_enabled_2", false, false, srx.a);
    public static final suc T = a("measurement.collection.redundant_engagement_removal_enabled", false, false, sry.a);
    public static final suc U = a("measurement.personalized_ads_signals_collection_enabled", true, true, srz.a);
    public static final suc V = a("measurement.personalized_ads_property_translation_enabled", true, true, ssa.a);
    public static final suc W = a("measurement.experiment.enable_experiment_reporting", true, true, ssb.a);
    public static final suc X = a("measurement.collection.log_event_and_bundle_v2", true, true, ssc.a);
    public static final suc Y = a("measurement.quality.checksum", false);
    public static final suc Z = a("measurement.sdk.dynamite.use_dynamite3", false, false, sse.a);
    public static final List a = Collections.synchronizedList(new ArrayList());
    public static final suc aA = a("measurement.collection.service.update_with_analytics_fix", false, false, stn.a);
    public static final suc aB = a("measurement.service.disable_install_state_reporting", true, true, stp.a);
    public static final suc aC = a("measurement.client.firebase_feature_rollout.v1.enable", true, true, str.a);
    public static final suc aD = a("measurement.config.string.always_update_disk_on_set", true, true, stt.a);
    public static final suc aE = a("measurement.scheduler.task_thread.cleanup_on_exit", false, false, stu.a);
    public static final suc aF = a("measurement.upload.file_truncate_fix", false, false, stv.a);
    public static final suc aG = a("measurement.engagement_time_main_thread", true, true, stw.a);
    public static final suc aH = a("measurement.sdk.referrer.delayed_install_referrer_api", false, false, stx.a);
    public static final suc aI = a("measurement.logging.improved_messaging_q4_2019_client", true, true, sty.a);
    public static final suc aJ = a("measurement.logging.improved_messaging_q4_2019_service", true, true, spu.a);
    public static final suc aK = a("measurement.gold.enhanced_ecommerce.format_logs", false, false, spv.a);
    public static final suc aL = a("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", false, false, spw.a);
    public static final suc aM = a("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", false, false, spx.a);
    public static final suc aN = a("measurement.gold.enhanced_ecommerce.log_nested_complex_events.dev", false, false, spy.a);
    public static final suc aO = a("measurement.gold.enhanced_ecommerce.updated_schema.client.dev", false, false, spz.a);
    public static final suc aP = a("measurement.gold.enhanced_ecommerce.updated_schema.service", false, false, sqa.a);
    public static final suc aQ = a("measurement.androidId.delete_feature", true, true, sqf.a);
    public static final suc aa = a("measurement.sdk.dynamite.allow_remote_dynamite", false, false, ssf.a);
    public static final suc ab = a("measurement.sdk.collection.validate_param_names_alphabetical", true, true, ssg.a);
    public static final suc ac = a("measurement.collection.event_safelist", true, true, ssi.a);
    public static final suc ad = a("measurement.service.audience.scoped_filters_v27", true, true, ssj.a);
    public static final suc ae = a("measurement.service.audience.session_scoped_event_aggregates", true, true, ssk.a);
    public static final suc af = a("measurement.service.audience.session_scoped_user_engagement", true, true, ssl.a);
    public static final suc ag = a("measurement.service.audience.scoped_engagement_removal_when_session_expired", true, true, ssm.a);
    public static final suc ah = a("measurement.client.audience.scoped_engagement_removal_when_session_expired", true, true, ssn.a);
    public static final suc ai = a("measurement.service.audience.remove_disabled_session_scoped_user_engagement", false, false, sso.a);
    public static final suc aj = a("measurement.service.audience.use_bundle_timestamp_for_property_filters", true, true, ssp.a);
    public static final suc ak = a("measurement.service.audience.fix_prepending_previous_sequence_timestamp", true, true, ssq.a);
    public static final suc al = a("measurement.service.audience.invalidate_config_cache_after_app_unisntall", true, true, ssr.a);
    public static final suc am = a("measurement.service.audience.fix_skip_audience_with_failed_filters", true, true, sst.a);
    public static final suc an = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true, true, ssx.a);
    public static final suc ao = a("measurement.app_launch.event_ordering_fix", true, true, ssy.a);
    public static final suc ap = a("measurement.sdk.collection.last_deep_link_referrer2", true, true, ssz.a);
    public static final suc aq = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, false, sta.a);
    public static final suc ar = a("measurement.sdk.collection.last_gclid_from_referrer2", false, false, stb.a);
    public static final suc as = a("measurement.sdk.collection.worker_thread_referrer", true, true, stc.a);
    public static final suc at = a("measurement.sdk.collection.enable_extend_user_property_size", true, true, ste.a);
    public static final suc au = a("measurement.upload.file_lock_state_check", false, false, stf.a);
    public static final suc av = a("measurement.sampling.calculate_bundle_timestamp_before_sampling", true, true, stg.a);
    public static final suc aw = a("measurement.lifecycle.app_backgrounded_tracking", true, true, sti.a);
    public static final suc ax = a("measurement.lifecycle.app_in_background_parameter", false, false, stj.a);
    public static final suc ay = a("measurement.lifecycle.app_backgrounded_engagement", false, false, stl.a);
    public static final suc az = a("measurement.service.fix_gmp_version", true, true, stm.a);
    public static final suc b = a("measurement.ad_id_cache_time", 10000L, 10000L, spt.a);
    public static final suc c = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, sqp.a);
    public static final suc d = a("measurement.config.cache_time", 86400000L, 3600000L, sra.a);
    public static final suc e = a("measurement.config.url_scheme", "https", "https", srl.a);
    public static final suc f = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", srw.a);
    public static final suc g = a("measurement.upload.max_bundles", 100, 100, ssh.a);
    public static final suc h = a("measurement.upload.max_batch_size", 65536, 65536, sss.a);
    public static final suc i = a("measurement.upload.max_bundle_size", 65536, 65536, std.a);
    public static final suc j;
    public static final suc k = a("measurement.upload.max_events_per_day", 100000, 100000, stz.a);
    public static final suc l;
    public static final suc m = a("measurement.upload.max_public_events_per_day", 50000, 50000, sqg.a);
    public static final suc n = a("measurement.upload.max_conversions_per_day", 10000, 10000, sqh.a);
    public static final suc o = a("measurement.upload.max_realtime_events_per_day", 10, 10, sqi.a);
    public static final suc p = a("measurement.store.max_stored_events_per_app", 100000, 100000, sqj.a);
    public static final suc q = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", sqk.a);
    public static final suc r = a("measurement.upload.backoff_period", 43200000L, 43200000L, sql.a);
    public static final suc s = a("measurement.upload.window_interval", 3600000L, 3600000L, sqm.a);
    public static final suc t = a("measurement.upload.interval", 3600000L, 3600000L, sqn.a);
    public static final suc u = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, sqo.a);
    public static final suc v = a("measurement.upload.debug_upload_interval", 1000L, 1000L, sqq.a);
    public static final suc w = a("measurement.upload.minimum_delay", 500L, 500L, sqr.a);
    public static final suc x = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, sqs.a);
    public static final suc y = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, sqt.a);
    public static final suc z = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, squ.a);

    static {
        Collections.synchronizedSet(new HashSet());
        Integer valueOf = Integer.valueOf(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        j = a("measurement.upload.max_events_per_bundle", valueOf, valueOf, sto.a);
        l = a("measurement.upload.max_error_events_per_day", valueOf, valueOf, sqe.a);
        a("measurement.upload.max_public_user_properties", 25);
        a("measurement.upload.max_event_name_cardinality", 500);
        a("measurement.upload.max_public_event_params", 25);
        a("measurement.test.boolean_flag", false, false, srd.a);
        a("measurement.test.string_flag", "---", "---", sre.a);
        a("measurement.test.long_flag", -1L, -1L, srf.a);
        a("measurement.test.int_flag", -2, -2, srg.a);
        Double valueOf2 = Double.valueOf(-3.0d);
        a("measurement.test.double_flag", valueOf2, valueOf2, srh.a);
        a("measurement.client.sessions.start_session_before_view_screen", true, true, srt.a);
        a("measurement.client.sessions.check_on_startup", true, true, sru.a);
        a("measurement.module.collection.conditionally_omit_admob_app_id", true, true, ssd.a);
        a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, false, ssu.a);
        a("measurement.audience.refresh_event_count_filters_timestamp", false, false, ssv.a);
        a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, false, ssw.a);
        a("measurement.ga.ga_app_id", false, false, sth.a);
        a("measurement.integration.disable_firebase_instance_id", false, false, stk.a);
        a("measurement.service.use_appinfo_modified", false, false, stq.a);
        a("measurement.client.sessions.check_on_reset_and_enable", false, false, sts.a);
        a("measurement.collection.synthetic_data_mitigation", false, false, sqb.a);
        a("measurement.service.configurable_service_limits", false, false, sqc.a);
        a("measurement.client.configurable_service_limits", false, false, sqd.a);
    }

    public static Map a(Context context) {
        aguy a2 = aguy.a(context.getContentResolver(), agvj.a("com.google.android.gms.measurement"));
        return a2 != null ? a2.a() : Collections.emptyMap();
    }

    static suc a(String str, Object obj) {
        return a(str, obj, obj, (sua) null);
    }

    static suc a(String str, Object obj, Object obj2, sua sua) {
        suc suc = new suc(str, obj, obj2, sua);
        a.add(suc);
        return suc;
    }
}
