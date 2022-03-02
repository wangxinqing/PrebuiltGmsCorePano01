package defpackage;

/* renamed from: azeq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azeq implements azen {
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

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.romanesco"));
        a = agvx.a(agvw, "GrpcContactsUploader__enable_batch_upload", true);
        b = agvx.a(agvw, "GrpcContactsUploader__enable_incremental_upload", true);
        c = agvx.a(agvw, "GrpcContactsUploader__enable_sync_policy_engine", false);
        d = agvx.a(agvw, "GrpcContactsUploader__run_contacts_logger_via_proxy_executor", true);
        e = agvx.a(agvw, "GrpcContactsUploader__run_contacts_logger_via_spe", true);
        f = agvx.a(agvw, "GrpcContactsUploader__schedule_periodic_sync_on_init", true);
        g = agvx.a(agvw, "GrpcContactsUploader__schedule_periodic_sync_on_settings_changed", true);
        h = agvx.a(agvw, "GrpcContactsUploader__spe_change_oneoff_batch_sync_to_incremental", false);
        try {
            i = agvx.a(agvw, "GrpcContactsUploader__upload_contacts_batch_sync_policy", (auop) aucj.a((aucj) auop.d, new byte[]{10, 81, 10, 79, 10, 66, 8, 1, 16, 1, 40, 2, 48, 1, 66, 56, 10, 6, 8, 2, 18, 2, 8, 3, 10, 6, 8, 3, 18, 2, 8, 3, 10, 6, 8, 4, 18, 2, 8, 3, 10, 6, 8, 5, 18, 2, 8, 3, 10, 6, 8, 6, 18, 2, 8, 3, 10, 6, 8, 10, 18, 2, 8, 3, 10, 6, 8, 9, 18, 2, 8, 3, 18, 9, 10, 2, 8, 60, 18, 3, 8, -40, 4}), azeo.a);
            try {
                j = agvx.a(agvw, "GrpcContactsUploader__upload_contacts_incremental_sync_policy", (auop) aucj.a((aucj) auop.d, new byte[]{10, 81, 10, 79, 10, 66, 8, 1, 16, 1, 40, 2, 48, 1, 66, 56, 10, 6, 8, 2, 18, 2, 8, 3, 10, 6, 8, 3, 18, 2, 8, 3, 10, 6, 8, 4, 18, 2, 8, 3, 10, 6, 8, 5, 18, 2, 8, 3, 10, 6, 8, 6, 18, 2, 8, 3, 10, 6, 8, 10, 18, 2, 8, 3, 10, 6, 8, 9, 18, 2, 8, 3, 18, 9, 10, 2, 8, 60, 18, 3, 8, -40, 4}), azep.a);
            } catch (auda e2) {
                throw new AssertionError("Could not parse proto flag \"GrpcContactsUploader__upload_contacts_incremental_sync_policy\"");
            }
        } catch (auda e3) {
            throw new AssertionError("Could not parse proto flag \"GrpcContactsUploader__upload_contacts_batch_sync_policy\"");
        }
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

    public final auop i() {
        return (auop) i.c();
    }

    public final auop j() {
        return (auop) j.c();
    }
}
