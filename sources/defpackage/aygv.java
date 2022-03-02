package defpackage;

/* renamed from: aygv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aygv implements aygs {
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

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.mdisync")).a();
        try {
            a = agvx.a(a2, "CoreFeature__api_blacklist", (sej) aucj.a((aucj) sej.b, new byte[0]), aygt.a);
            b = agvx.a(a2, "CoreFeature__cel_severe_sampling_interval", 10);
            c = agvx.a(a2, "CoreFeature__cel_warning_sampling_interval", 100);
            d = agvx.a(a2, "CoreFeature__clearcut_sampling_interval", 1000);
            e = agvx.a(a2, "CoreFeature__dasu_sampling_interval", 100);
            f = agvx.a(a2, "CoreFeature__enable_client_error_logging", true);
            g = agvx.a(a2, "CoreFeature__enable_dasu_logging", false);
            h = agvx.a(a2, "CoreFeature__enable_mdd_maintenance", false);
            i = agvx.a(a2, "CoreFeature__enable_mdi_sync_api", true);
            j = agvx.a(a2, "CoreFeature__enable_push_message_handlers", false);
            agvx.a(a2, "CoreFeature__enable_sync_stats", true);
            k = agvx.a(a2, "CoreFeature__enable_sync_with_stats", false);
            agvx.a(a2, "CoreFeature__gaia_logging_logsource", "MDI_SYNC_COMPONENTS_GAIA");
            try {
                l = agvx.a(a2, "CoreFeature__sync_policy_policies", (aunm) aucj.a((aucj) aunm.b, new byte[]{10, 72, 8, 1, 18, 68, 10, 64, 10, 26, 10, 16, 8, 1, 58, 12, 8, 1, 18, 2, 8, 30, 26, 4, 8, -32, -88, 1, 18, 6, 10, 0, 18, 2, 8, 1, 18, 34, 10, 18, 8, 2, 16, 2, 58, 12, 8, 1, 18, 2, 8, 30, 26, 4, 8, -32, -88, 1, 18, 12, 10, 4, 8, -32, -88, 1, 18, 4, 8, -16, -105, 1, 18, 0, 10, 72, 8, 2, 18, 68, 10, 64, 10, 26, 10, 16, 8, 3, 58, 12, 8, 1, 18, 2, 8, 30, 26, 4, 8, -32, -88, 1, 18, 6, 10, 0, 18, 2, 8, 1, 18, 34, 10, 18, 8, 3, 16, 2, 58, 12, 8, 1, 18, 2, 8, 30, 26, 4, 8, -32, -88, 1, 18, 12, 10, 4, 8, -32, -88, 1, 18, 4, 8, -16, -105, 1, 18, 0}), aygu.a);
                m = agvx.a(a2, "CoreFeature__use_gmscore_channel_provider", true);
            } catch (auda e2) {
                throw new AssertionError("Could not parse proto flag \"CoreFeature__sync_policy_policies\"");
            }
        } catch (auda e3) {
            throw new AssertionError("Could not parse proto flag \"CoreFeature__api_blacklist\"");
        }
    }

    public final sej a() {
        return (sej) a.c();
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

    public final long e() {
        return ((Long) e.c()).longValue();
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

    public final boolean k() {
        return ((Boolean) k.c()).booleanValue();
    }

    public final aunm l() {
        return (aunm) l.c();
    }

    public final boolean m() {
        return ((Boolean) m.c()).booleanValue();
    }
}
