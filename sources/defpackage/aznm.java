package defpackage;

/* renamed from: aznm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aznm implements aznl {
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
        agvw a2 = new agvw("com.google.android.metrics").a("gms:stats:");
        a = agvx.a(a2, "DropBox__broadcast_enabled", true);
        b = agvx.a(a2, "DropBox__default_max_entry_size", 196608);
        c = agvx.a(a2, "DropBox__is_charging_required", true);
        d = agvx.a(a2, "DropBox__logcat_start", "(?m)^(stack:|memory near|\\-\\-\\-\\-\\-\\-\\-\\-\\- beginning of)");
        e = agvx.a(a2, "DropBox__max_split", 100);
        f = agvx.a(a2, "DropBox__package_manager", false);
        g = agvx.a(a2, "DropBox__package_pattern", "Package: ((?:\\w+\\.)*\\w+) v(\\d+) \\(((?:[^()]+|(?:\\([^)]*\\)?)+)+)\\)");
        h = agvx.a(a2, "DropBox__record_interval_secs", 86400);
        i = agvx.a(a2, "DropBox__split_entries", true);
        j = agvx.a(a2, "use_phenotype_flags_for_dropbox_task", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final String d() {
        return (String) d.c();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final String g() {
        return (String) g.c();
    }

    public final long h() {
        return ((Long) h.c()).longValue();
    }

    public final boolean i() {
        return ((Boolean) i.c()).booleanValue();
    }

    public final boolean j() {
        return ((Boolean) j.c()).booleanValue();
    }
}
