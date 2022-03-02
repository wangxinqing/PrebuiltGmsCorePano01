package defpackage;

/* renamed from: ayhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayhc implements ayha {
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
            a = agvx.a(a2, "ProfileFeature__base_get_people_request", (aqvp) aucj.a((aucj) aqvp.g, new byte[0]), ayhb.a);
            b = agvx.a(a2, "ProfileFeature__download_photos_when_photo_files_not_openable", true);
            c = agvx.a(a2, "ProfileFeature__enable_per_account_push_handling", false);
            d = agvx.a(a2, "ProfileFeature__enable_push_message_handler", false);
            e = agvx.a(a2, "ProfileFeature__enable_push_payload_validation", false);
            f = agvx.a(a2, "ProfileFeature__enable_requesting_private_long_avatar_url", false);
            g = agvx.a(a2, "ProfileFeature__enable_strong_reads_on_push", false);
            h = agvx.a(a2, "ProfileFeature__oneoff_syncs_only_dirty_accounts", false);
            i = agvx.a(a2, "ProfileFeature__populate_client_version_in_requests", false);
            j = agvx.a(a2, "ProfileFeature__profile_server_host", "");
            k = agvx.a(a2, "ProfileFeature__profile_server_port", -1);
            l = agvx.a(a2, "ProfileFeature__push_message_payload_key", "");
            m = agvx.a(a2, "ProfileFeature__store_updated_profile_info_when_photo_downloader_fails", true);
        } catch (auda e2) {
            throw new AssertionError("Could not parse proto flag \"ProfileFeature__base_get_people_request\"");
        }
    }

    public final aqvp a() {
        return (aqvp) a.c();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
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

    public final String j() {
        return (String) j.c();
    }

    public final long k() {
        return ((Long) k.c()).longValue();
    }

    public final String l() {
        return (String) l.c();
    }

    public final boolean m() {
        return ((Boolean) m.c()).booleanValue();
    }
}
