package defpackage;

/* renamed from: aynh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aynh implements ayng {
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

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.nearby")).a("nearby:");
        a = agvx.a(a2, "ble_scan_always_available", true);
        b = agvx.a(a2, "common_ble_scan_always_available", false);
        c = agvx.a(a2, "common_enable_analytics_debug_log", false);
        agvx.a(a2, "common_enable_counters", true);
        d = agvx.a(a2, "common_first_party_whitelist", "com.google.android.apps.testing.devicewhisperer.deviceagents.copresence:EDA6413C3E3A95492114FE07CD953AD897E40D1A,com.google.android.apps.testing.devicewhisperer.deviceagents.nearby:EDA6413C3E3A95492114FE07CD953AD897E40D1A,com.google.android.libraries.testing.devicewhisperer.codesnippets.audiomodem:EDA6413C3E3A95492114FE07CD953AD897E40D1A,com.google.location.nearby.apps.debug:EDA6413C3E3A95492114FE07CD953AD897E40D1A,com.google.android.apps.jamkiosk:E6A1A1EF628816E3F2BBF49BD36A0A255B5D7B54,com.google.android.apps.jamkiosk:527024372B122A89A9F09F07D1851C2CC3E7EDFB,com.google.android.gms.nearby.sample.backgroundsubscriber:61ED377E85D386A8DFEE6B864BD85B0BFAA5AF81");
        e = agvx.a(a2, "common_first_party_whitelist_bypass", false);
        agvx.a(a2, "common_log_hashed_salted_bluetooth_address", true);
        f = agvx.a(a2, "common_reset_salt_time_if_invalid_period", true);
        g = agvx.a(a2, "common_second_party_whitelist", "");
        agvx.a(a2, "direct_lazily_initialize_fast_pair_scanner", true);
        h = agvx.a(a2, "nearby_dont_synchronize_cancelable_alarm", true);
        i = agvx.a(a2, "eventloop_check_thread", true);
        j = agvx.a(a2, "log_hashed_device_address", true);
        k = agvx.a(a2, "salt_last_used_time_millis", 7200000);
        l = agvx.a(a2, "salt_preference_update_threshold_millis", 300000);
        m = agvx.a(a2, "salt_ttl_millis", 86400000);
        n = agvx.a(a2, "use_unified_app_whitelist", true);
        o = agvx.a(a2, "common_user_type", "prod");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final String d() {
        return (String) d.c();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final String g() {
        return (String) g.c();
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

    public final boolean n() {
        return ((Boolean) n.c()).booleanValue();
    }

    public final String o() {
        return (String) o.c();
    }
}
