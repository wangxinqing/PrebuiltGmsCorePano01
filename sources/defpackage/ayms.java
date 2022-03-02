package defpackage;

/* renamed from: ayms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayms implements aymr {
    public static final agvx A;
    public static final agvx B;
    public static final agvx C;
    public static final agvx D;
    public static final agvx E;
    public static final agvx F;
    public static final agvx G;
    public static final agvx H;
    public static final agvx I;
    public static final agvx J;
    public static final agvx K;
    public static final agvx L;
    public static final agvx M;
    public static final agvx N;
    public static final agvx O;
    public static final agvx P;
    public static final agvx Q;
    public static final agvx R;
    public static final agvx S;
    public static final agvx T;
    public static final agvx U;
    public static final agvx V;
    public static final agvx W;
    public static final agvx X;
    public static final agvx Y;
    public static final agvx Z;
    public static final agvx a;
    public static final agvx aa;
    public static final agvx ab;
    public static final agvx ac;
    public static final agvx ad;
    public static final agvx ae;
    public static final agvx af;
    public static final agvx ag;
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
    public static final agvx l;
    public static final agvx m;
    public static final agvx n;
    public static final agvx o;
    public static final agvx p;
    public static final agvx q;
    public static final agvx r;
    public static final agvx s;
    public static final agvx t;
    public static final agvx u;
    public static final agvx v;
    public static final agvx w;
    public static final agvx x;
    public static final agvx y;
    public static final agvx z;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.nearby")).a("nearbydiscovery:");
        a = agvx.a(a2, "action_url_chromecast", "intent:#Intent;action=com.google.android.apps.chromecast.app.DEVICES;category=android.intent.category.DEFAULT;package=com.google.android.apps.chromecast.app;end");
        b = agvx.a(a2, "action_url_chromecast_with_mac", "intent:#Intent;action=com.google.android.apps.chromecast.app.DEVICE_SETUP;category=android.intent.category.DEFAULT;package=com.google.android.apps.chromecast.app;S.com.google.android.apps.chromecast.app.extra.HOTSPOT_BSSID=%s;end");
        agvx.a(a2, "action_url_smartsetup", "intent:#Intent;action=com.google.android.gms.settings.SMART_DEVICE_DISCOVERY;package=com.google.android.gms;end");
        c = agvx.a(a2, "action_url_wear", "intent:#Intent;action=com.google.android.wearable.STATUS;category=android.intent.category.DEFAULT;category=android.intent.category.LAUNCHER;package=com.google.android.wearable.app;component=com.google.android.wearable.app/com.google.android.clockwork.companion.StatusActivity;end");
        d = agvx.a(a2, "app_install_expiration_millis", 600000);
        e = agvx.a(a2, "auto_launch_play_store", false);
        agvx.a(a2, "awareness_evaluation_time_out_millis", 1000);
        agvx.a(a2, "beacon_staleness_millis", 120000);
        f = agvx.a(a2, "bypass_system_feature_ble_check", false);
        g = agvx.a(a2, "discovery_check_bluetooth_permission_for_intent_extra", true);
        h = agvx.a(a2, "discovery_check_event_stream_status_before_calling_stopself", true);
        i = agvx.a(a2, "check_server_identity_id", false);
        agvx.a(a2, "chrome_custom_tab_enabled", true);
        agvx.a(a2, "chrome_custom_tab_report_enabled", false);
        j = agvx.a(a2, "chromecast_enabled", true);
        k = agvx.a(a2, "chromecast_rssi_threshold", -90);
        l = agvx.a(a2, "discovery_clear_stored_relevances_before_add", true);
        m = agvx.a(a2, "default_beacon_notification_enabled", true);
        n = agvx.a(a2, "default_debug_mode_enabled", false);
        o = agvx.a(a2, "default_device_notification_enabled", true);
        p = agvx.a(a2, "desired_icon_size", 32);
        q = agvx.a(a2, "device_setup_uptime_threshold_minutes", 10);
        r = agvx.a(a2, "devices_help_context", "nearby_devices");
        agvx.a(a2, "discovery_devices_show_debug_results_switch", true);
        agvx.a(a2, "discovery_disable_awareness_google_api", true);
        s = agvx.a(a2, "discovery_disable_awareness_google_api_and_update_ui_directly", true);
        agvx.a(a2, "discovery_disable_links_channels", true);
        t = agvx.a(a2, "discovery_disable_location_requirement", false);
        agvx.a(a2, "discovery_disable_nearby_list_view", true);
        u = agvx.a(a2, "discovery_disable_show_notification_after_user_click", true);
        v = agvx.a(a2, "discovery_time_duration_not_show_notification_after_click", 15000);
        agvx.a(a2, "disable_shortcut_for_oreo_plus", true);
        agvx.a(a2, "disable_user_identifiers_in_discoverer_logs", false);
        w = agvx.a(a2, "enabled", true);
        agvx.a(a2, "discovery_help_context", "nearby_discoveries");
        agvx.a(a2, "do_not_open_uraw_again", false);
        agvx.a(a2, "enable_discovery_settings", true);
        x = agvx.a(a2, "enable_keep_around_notifications", true);
        y = agvx.a(a2, "enable_notification_channel", true);
        z = agvx.a(a2, "discovery_enable_switching_to_similar_alternative_packages_when_installed", false);
        A = agvx.a(a2, "discovery_fast_pair_while_bluetooth_off", true);
        B = agvx.a(a2, "discovery_fix_service_lifecycle", true);
        C = agvx.a(a2, "discovery_fix_service_lifecycle_part2", true);
        D = agvx.a(a2, "generic_device_enabled", true);
        E = agvx.a(a2, "global_max_distance_for_testing", 0.0d);
        agvx.a(a2, "discoverer_help_menu_url", "https://support.google.com/mobile/?p=google_settings_nearby");
        F = agvx.a(a2, "initial_notification_backoff_time_sec", 86400);
        G = agvx.a(a2, "item_deletable_millis", 90000000);
        H = agvx.a(a2, "item_expiration_millis", 20000);
        agvx.a(a2, "list_activity_refresh_loading_time_millis", 8000);
        I = agvx.a(a2, "listen_for_bluetooth_bond_intents", true);
        J = agvx.a(a2, "max_distance_hysteresis_min", 0.7d);
        K = agvx.a(a2, "max_distance_hysteresis_ratio", 1.0d);
        L = agvx.a(a2, "min_android_version", 19);
        M = agvx.a(a2, "min_icon_size", 16);
        agvx.a(a2, "mute_opt_in_notification_quiet_time_millis", 500);
        N = agvx.a(a2, "notification_backoff_factor", 2);
        O = agvx.a(a2, "notification_enabled", true);
        P = agvx.a(a2, "notification_max_dismiss_count", 5);
        agvx.a(a2, "notification_priority_default_relevance_bad", 100);
        agvx.a(a2, "notification_priority_default_relevance_good", 300);
        agvx.a(a2, "notification_priority_default_relevance_great", 400);
        agvx.a(a2, "notification_priority_default_relevance_neutral", 200);
        agvx.a(a2, "notification_priority_default_relevance_ok", 200);
        agvx.a(a2, "notification_priority_default_relevance_poor", 100);
        Q = agvx.a(a2, "notification_priority_educated_relevance_bad", 100);
        R = agvx.a(a2, "notification_priority_educated_relevance_good", 300);
        S = agvx.a(a2, "notification_priority_educated_relevance_great", 400);
        T = agvx.a(a2, "notification_priority_educated_relevance_neutral", 200);
        U = agvx.a(a2, "notification_priority_educated_relevance_ok", 300);
        V = agvx.a(a2, "notification_priority_educated_relevance_poor", 100);
        agvx.a(a2, "notification_report_enabled", false);
        agvx.a(a2, "popular_here_enabled", true);
        agvx.a(a2, "popular_here_max_number", 6);
        agvx.a(a2, "rebrand_devices_from_nearby_list_view", true);
        agvx.a(a2, "rebrand_devices_from_nearby_notifications", true);
        agvx.a(a2, "discovery_remove_foreground_client", true);
        W = agvx.a(a2, "service_shut_down_millis", 180000);
        X = agvx.a(a2, "discovery_fast_pair_set_lost_when_pairing_process_done", true);
        agvx.a(a2, "smart_setup_rssi_threshold", -85);
        agvx.a(a2, "smartsetup_enabled", false);
        agvx.a(a2, "targeting_enabled", true);
        agvx.a(a2, "discovery_turn_on_device_notifications_when_pairing", true);
        Y = agvx.a(a2, "ui_update_limit_for_nearby_device_millis", 500);
        Z = agvx.a(a2, "ui_update_limit_millis", 1500);
        agvx.a(a2, "discovery_unmute_device_when_clicked_in_list_view", true);
        aa = agvx.a(a2, "use_chromecast_uptime", true);
        ab = agvx.a(a2, "use_chromecast_url_with_mac", true);
        agvx.a(a2, "use_connectionless_api_for_location", true);
        agvx.a(a2, "discovery_messages_use_connectionless_clients", true);
        agvx.a(a2, "use_identical_action_intent_for_single_group_summary_notification", true);
        agvx.a(a2, "use_is_initial_sticky_broadcast", true);
        ac = agvx.a(a2, "use_on_update", true);
        ad = agvx.a(a2, "discovery_use_sub_intent_handlers_and_receivers", false);
        ae = agvx.a(a2, "warm_welcome_counter_cap", 3);
        af = agvx.a(a2, "wear_enabled", true);
        ag = agvx.a(a2, "wear_rssi_threshold", -80);
    }

    public final boolean A() {
        return ((Boolean) A.c()).booleanValue();
    }

    public final boolean B() {
        return ((Boolean) B.c()).booleanValue();
    }

    public final boolean C() {
        return ((Boolean) C.c()).booleanValue();
    }

    public final boolean D() {
        return ((Boolean) D.c()).booleanValue();
    }

    public final double E() {
        return ((Double) E.c()).doubleValue();
    }

    public final long F() {
        return ((Long) F.c()).longValue();
    }

    public final long G() {
        return ((Long) G.c()).longValue();
    }

    public final long H() {
        return ((Long) H.c()).longValue();
    }

    public final boolean I() {
        return ((Boolean) I.c()).booleanValue();
    }

    public final double J() {
        return ((Double) J.c()).doubleValue();
    }

    public final double K() {
        return ((Double) K.c()).doubleValue();
    }

    public final long L() {
        return ((Long) L.c()).longValue();
    }

    public final long M() {
        return ((Long) M.c()).longValue();
    }

    public final long N() {
        return ((Long) N.c()).longValue();
    }

    public final boolean O() {
        return ((Boolean) O.c()).booleanValue();
    }

    public final long P() {
        return ((Long) P.c()).longValue();
    }

    public final long Q() {
        return ((Long) Q.c()).longValue();
    }

    public final long R() {
        return ((Long) R.c()).longValue();
    }

    public final long S() {
        return ((Long) S.c()).longValue();
    }

    public final long T() {
        return ((Long) T.c()).longValue();
    }

    public final long U() {
        return ((Long) U.c()).longValue();
    }

    public final long V() {
        return ((Long) V.c()).longValue();
    }

    public final long W() {
        return ((Long) W.c()).longValue();
    }

    public final boolean X() {
        return ((Boolean) X.c()).booleanValue();
    }

    public final long Y() {
        return ((Long) Y.c()).longValue();
    }

    public final long Z() {
        return ((Long) Z.c()).longValue();
    }

    public final String a() {
        return (String) a.c();
    }

    public final boolean aa() {
        return ((Boolean) aa.c()).booleanValue();
    }

    public final boolean ab() {
        return ((Boolean) ab.c()).booleanValue();
    }

    public final boolean ac() {
        return ((Boolean) ac.c()).booleanValue();
    }

    public final boolean ad() {
        return ((Boolean) ad.c()).booleanValue();
    }

    public final long ae() {
        return ((Long) ae.c()).longValue();
    }

    public final boolean af() {
        return ((Boolean) af.c()).booleanValue();
    }

    public final long ag() {
        return ((Long) ag.c()).longValue();
    }

    public final String b() {
        return (String) b.c();
    }

    public final String c() {
        return (String) c.c();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
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

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) i.c()).booleanValue();
    }

    public final boolean j() {
        return ((Boolean) j.c()).booleanValue();
    }

    public final long k() {
        return ((Long) k.c()).longValue();
    }

    public final boolean l() {
        return ((Boolean) l.c()).booleanValue();
    }

    public final boolean m() {
        return ((Boolean) m.c()).booleanValue();
    }

    public final boolean n() {
        return ((Boolean) n.c()).booleanValue();
    }

    public final boolean o() {
        return ((Boolean) o.c()).booleanValue();
    }

    public final long p() {
        return ((Long) p.c()).longValue();
    }

    public final long q() {
        return ((Long) q.c()).longValue();
    }

    public final String r() {
        return (String) r.c();
    }

    public final boolean s() {
        return ((Boolean) s.c()).booleanValue();
    }

    public final boolean t() {
        return ((Boolean) t.c()).booleanValue();
    }

    public final boolean u() {
        return ((Boolean) u.c()).booleanValue();
    }

    public final long v() {
        return ((Long) v.c()).longValue();
    }

    public final boolean w() {
        return ((Boolean) w.c()).booleanValue();
    }

    public final boolean x() {
        return ((Boolean) x.c()).booleanValue();
    }

    public final boolean y() {
        return ((Boolean) y.c()).booleanValue();
    }

    public final boolean z() {
        return ((Boolean) z.c()).booleanValue();
    }
}
