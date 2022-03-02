package defpackage;

/* renamed from: axtk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axtk implements axtj {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.icing.mdh")).a();
        a = agvx.a(a2, "AppsUploadFeature__accounts_upload_log_read_match_event", false);
        b = agvx.a(a2, "AppsUploadFeature__enable_subscribe_before_each_upload", false);
        c = agvx.a(a2, "AppsUploadFeature__enable_sync_policy_download", false);
        d = agvx.a(a2, "AppsUploadFeature__package_event_skip_upload_for_unchanged", false);
        e = agvx.a(a2, "AppsUploadFeature__sync_policy_download_throttling_seconds", 172800);
        f = agvx.a(a2, "AppsUploadFeature__sync_policy_requires_charging", false);
        g = agvx.a(a2, "AppsUploadFeature__sync_policy_requires_unmetered", false);
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

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
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
}
