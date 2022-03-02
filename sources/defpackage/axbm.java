package defpackage;

/* renamed from: axbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axbm implements axbl {
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

    static {
        agvw b2 = new agvw("direct_boot:gms_chimera_phenotype_flags").a("gms:common:devicedoctor:").b();
        a = agvx.a(b2, "DeviceDoctor__defer_safeboot_logging", true);
        b = agvx.a(b2, "DeviceDoctor__fixer_framework_use_alternate_validity_time_for_non_complete_fixes", true);
        c = agvx.a(b2, "DeviceDoctor__safeboot_checkin_enabled", true);
        d = agvx.a(b2, "SafeBoot__safeboot_checkin_fix_valid_for_seconds", 3600);
        e = agvx.a(b2, "DeviceDoctor__safeboot_clearcut_sos_enabled", true);
        f = agvx.a(b2, "SafeBoot__safeboot_clearcut_sos_fix_valid_for_seconds", 3600);
        agvx.a(b2, "SafeBoot__safeboot_consent_migration_enabled", false);
        g = agvx.a(b2, "DeviceDoctor__safeboot_enabled", true);
        h = agvx.a(b2, "SafeBoot__safeboot_fast_check_enabled", true);
        i = agvx.a(b2, "SafeBoot__safeboot_lazy_data_fetch_enabled", true);
        j = agvx.a(b2, "DeviceDoctor__safeboot_phenotype_fix_enabled", true);
        k = agvx.a(b2, "SafeBoot__safeboot_phenotype_fix_valid_for_seconds", 900);
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

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
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
}
