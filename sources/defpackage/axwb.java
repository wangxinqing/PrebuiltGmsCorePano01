package defpackage;

/* renamed from: axwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axwb implements axwa {
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
        agvw agvw = new agvw(agvj.a("com.google.android.gms.ipa"));
        a = agvx.a(agvw, "Ipa__app_usage_report_generation_task_flex_minutes", 30);
        b = agvx.a(agvw, "Ipa__app_usage_report_generation_task_period_hours", 72);
        c = agvx.a(agvw, "Ipa__apps_corpus_maintenance_task_flex_minutes", 30);
        d = agvx.a(agvw, "Ipa__apps_corpus_maintenance_task_period_hours", 168);
        e = agvx.a(agvw, "Ipa__backfill_empty_corpus_in_apps_corpus_maintenance", true);
        f = agvx.a(agvw, "Ipa__bootstrap_index_apps_on_module_update", true);
        g = agvx.a(agvw, "Ipa__contact_data_num_results_per_chunk", 500);
        h = agvx.a(agvw, "Ipa__contact_data_num_total_results", 10000);
        i = agvx.a(agvw, "Ipa__days_until_apps_refresh", 85);
        j = agvx.a(agvw, "Ipa__enable_app_usage_report_generation", true);
        k = agvx.a(agvw, "Ipa__enable_apps_corpus_indexing", true);
        l = agvx.a(agvw, "Ipa__enable_audio_files_indexing", true);
        m = agvx.a(agvw, "Ipa__enable_audio_properties_indexing", true);
        agvx.a(agvw, "Ipa__enable_coarse_classifier_document_detection", false);
        n = agvx.a(agvw, "Ipa__enable_content_uri_triggered_tasks", true);
        o = agvx.a(agvw, "Ipa__enable_id_based_mediastore_indexing", true);
        p = agvx.a(agvw, "Ipa__enable_mediastore_indexing", true);
        q = agvx.a(agvw, "Ipa__enable_music_and_podcast_filters", true);
        agvx.a(agvw, "Ipa__enable_non_media_files_indexing", false);
        agvx.a(agvw, "Ipa__enable_non_media_ocr_tagging", false);
        r = agvx.a(agvw, "Ipa__enable_patch_api_sms_mms", false);
        s = agvx.a(agvw, "Ipa__enable_sms_contact_annotation", false);
        t = agvx.a(agvw, "Ipa__enable_sms_contact_annotation_table", true);
        u = agvx.a(agvw, "Ipa__enable_sms_indexer", true);
        v = agvx.a(agvw, "Ipa__icing_query_timeout_seconds", 5);
        w = agvx.a(agvw, "Ipa__log_event_sample_interval", 10);
        x = agvx.a(agvw, "Ipa__max_allowed_indexables_in_mediastore_instant_indexing", 1000);
        y = agvx.a(agvw, "Ipa__max_ids_allowed_in_wherein_clause", 500);
        agvx.a(agvw, "Ipa__max_ids_to_delete_from_mediastore_indexer_intermediate_store", 500);
        z = agvx.a(agvw, "Ipa__max_sms_deferral_time_millis", 30000);
        A = agvx.a(agvw, "Ipa__mediastore_batch_indexing_task_flex_minutes", 30);
        B = agvx.a(agvw, "Ipa__mediastore_batch_indexing_task_period_hours", 6);
        C = agvx.a(agvw, "Ipa__mediastore_batch_indexing_timeout_secs", 120000);
        D = agvx.a(agvw, "Ipa__mediastore_corpora_maintenance_task_flex_hours", 12);
        E = agvx.a(agvw, "Ipa__mediastore_corpora_maintenance_task_period_days", 7);
        F = agvx.a(agvw, "Ipa__mediastore_corpora_maintenance_timeout_secs", 120000);
        G = agvx.a(agvw, "Ipa__mediastore_indexing_max_remove_batch_size", 50);
        H = agvx.a(agvw, "Ipa__mediastore_indexing_max_update_batch_size", 30);
        I = agvx.a(agvw, "Ipa__mediastore_instant_index_scheduling_delay_seconds", 30);
        J = agvx.a(agvw, "Ipa__mediastore_instant_indexing_timeout_secs", 60000);
        K = agvx.a(agvw, "Ipa__message_indexing_max_remove_batch_size", 100);
        L = agvx.a(agvw, "Ipa__message_indexing_max_update_batch_size", 30);
        M = agvx.a(agvw, "Ipa__min_sms_deferral_time_millis", 5000);
        N = agvx.a(agvw, "Ipa__mms_sms_query_batch_size", 100);
        O = agvx.a(agvw, "Ipa__require_idle_apps_corpus_maintenance", true);
        P = agvx.a(agvw, "Ipa__requires_idle_device_mediastore_batch_indexing_task", true);
        Q = agvx.a(agvw, "Ipa__requires_idle_device_mediastore_corpora_maintenance_task", true);
        R = agvx.a(agvw, "Ipa__requires_idle_device_sms_corpus_batch_indexing_task", false);
        S = agvx.a(agvw, "Ipa__requires_idle_device_sms_corpus_maintenance_task", false);
        T = agvx.a(agvw, "Ipa__schedule_mediastore_corpus_maint_on_config_change", false);
        U = agvx.a(agvw, "Ipa__sms_corpus_batch_indexing_task_flex_seconds", 10800);
        V = agvx.a(agvw, "Ipa__sms_corpus_batch_indexing_task_seconds", 14400);
        W = agvx.a(agvw, "Ipa__sms_corpus_instant_indexing_maximum_messages", 1000);
        X = agvx.a(agvw, "Ipa__sms_corpus_update_index_task_flex_seconds", 1296000);
        Y = agvx.a(agvw, "Ipa__sms_corpus_update_index_task_period_seconds", 2592000);
        Z = agvx.a(agvw, "Ipa__sms_mms_indexing_max_days", 90);
        aa = agvx.a(agvw, "Ipa__tv_device_resolution_method", 2);
        ab = agvx.a(agvw, "Ipa__use_intent_scheme_for_uri", true);
    }

    public final long A() {
        return ((Long) A.c()).longValue();
    }

    public final long B() {
        return ((Long) B.c()).longValue();
    }

    public final long C() {
        return ((Long) C.c()).longValue();
    }

    public final long D() {
        return ((Long) D.c()).longValue();
    }

    public final long E() {
        return ((Long) E.c()).longValue();
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

    public final long I() {
        return ((Long) I.c()).longValue();
    }

    public final long J() {
        return ((Long) J.c()).longValue();
    }

    public final long K() {
        return ((Long) K.c()).longValue();
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

    public final boolean P() {
        return ((Boolean) P.c()).booleanValue();
    }

    public final boolean Q() {
        return ((Boolean) Q.c()).booleanValue();
    }

    public final boolean R() {
        return ((Boolean) R.c()).booleanValue();
    }

    public final boolean S() {
        return ((Boolean) S.c()).booleanValue();
    }

    public final boolean T() {
        return ((Boolean) T.c()).booleanValue();
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

    public final long X() {
        return ((Long) X.c()).longValue();
    }

    public final long Y() {
        return ((Long) Y.c()).longValue();
    }

    public final long Z() {
        return ((Long) Z.c()).longValue();
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long aa() {
        return ((Long) aa.c()).longValue();
    }

    public final boolean ab() {
        return ((Boolean) ab.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
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

    public final long g() {
        return ((Long) g.c()).longValue();
    }

    public final long h() {
        return ((Long) h.c()).longValue();
    }

    public final long i() {
        return ((Long) i.c()).longValue();
    }

    public final boolean j() {
        return ((Boolean) j.c()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) k.c()).booleanValue();
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

    public final boolean p() {
        return ((Boolean) p.c()).booleanValue();
    }

    public final boolean q() {
        return ((Boolean) q.c()).booleanValue();
    }

    public final boolean r() {
        return ((Boolean) r.c()).booleanValue();
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

    public final long w() {
        return ((Long) w.c()).longValue();
    }

    public final long x() {
        return ((Long) x.c()).longValue();
    }

    public final long y() {
        return ((Long) y.c()).longValue();
    }

    public final long z() {
        return ((Long) z.c()).longValue();
    }
}
