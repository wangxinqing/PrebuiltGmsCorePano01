package defpackage;

/* renamed from: awhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awhk implements awhi {
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
    public static final agvx l;
    public static final agvx m;
    public static final agvx n;
    public static final agvx o;
    public static final agvx p;
    public static final agvx q;
    public static final agvx r;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.ads"));
        a = agvx.a(agvw, "gads:ad_settings_page_reporting:enabled", false);
        b = agvx.a(agvw, "adid_prefs_more_url", "https://support.google.com/googleplay/answer/3405269");
        agvx.a(agvw, "gms:ads:ads_preferences_base_url", "https://www.google.com/ads/preferences/");
        c = agvx.a(agvw, "gads:event_attestation:common_payload_cache_duration_in_ms", 3600000);
        d = agvx.a(agvw, "gads:event_attestation:common_payload_cache_size", 5);
        try {
            e = agvx.a(agvw, "gads:event_attestation:destination_domain_public_key", (aotr) aucj.a((aucj) aotr.b, new byte[]{10, 19, 10, 15, 100, 111, 117, 98, 108, 101, 99, 108, 105, 99, 107, 46, 110, 101, 116, 18, 0}), awhj.a);
            f = agvx.a(agvw, "gads:event_attestation:enable_migration", false);
            agvx.a(agvw, "enable_gms_adid_setting", true);
            g = agvx.a(agvw, "gads:event_attestation:enable_device_integrity", false);
            h = agvx.a(agvw, "gads:event_attestation:enable_service", false);
            i = agvx.a(agvw, "gads:event_attestation:enable_reporting", false);
            agvx.a(agvw, "enable_gms_limit_ad_tracking_setting", true);
            j = agvx.a(agvw, "gads:impression_attestation:enable_impression", false);
            k = agvx.a(agvw, "gads:event_attestation:device_integrity_token_timeout_in_s", 300);
            l = agvx.a(agvw, "gads:event_attestation:oneoff_task_flex_in_s", 3600);
            m = agvx.a(agvw, "gads:event_attestation:periodic_task_flex_in_s", 18000);
            n = agvx.a(agvw, "gads:event_attestation:periodic_task_period_in_s", 43200);
            o = agvx.a(agvw, "gads:adid_info_gmscore_upgrade_reporting:enabled", false);
            p = agvx.a(agvw, "gads:adid_notification:first_party_check:enabled", true);
            q = agvx.a(agvw, "vending_ad_prefs_more_url", "https://www.google.com/ads/preferences/html/mobile-about.html");
            r = agvx.a(agvw, "gads:adid_reporting:enabled", false);
        } catch (auda e2) {
            throw new AssertionError("Could not parse proto flag \"gads:event_attestation:destination_domain_public_key\"");
        }
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final String b() {
        return (String) b.c();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final aotr e() {
        return (aotr) e.c();
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

    public final long l() {
        return ((Long) l.c()).longValue();
    }

    public final long m() {
        return ((Long) m.c()).longValue();
    }

    public final long n() {
        return ((Long) n.c()).longValue();
    }

    public final boolean o() {
        return ((Boolean) o.c()).booleanValue();
    }

    public final boolean p() {
        return ((Boolean) p.c()).booleanValue();
    }

    public final String q() {
        return (String) q.c();
    }

    public final boolean r() {
        return ((Boolean) r.c()).booleanValue();
    }
}
