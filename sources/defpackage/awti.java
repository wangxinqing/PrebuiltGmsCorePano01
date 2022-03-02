package defpackage;

/* renamed from: awti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awti implements awtg {
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
    public static final agvx s;

    static {
        agvw a2 = new agvw("direct_boot:com.google.android.gms.playlog.uploader").a("gms:playlog:logstore:");
        a = agvx.a(a2, "ClearcutLogStore__catch_eofexception_read_logs", false);
        b = agvx.a(a2, "ClearcutLogStore__compression_algorithm_for_flat_file", "NONE");
        c = agvx.a(a2, "ClearcutLogStore__delete_sqlite_log_store", true);
        agvx.a(a2, "ClearcutLogStore__disable_sqlite_upload", true);
        d = agvx.a(a2, "disable_wal_journal", false);
        agvx.a(a2, "ClearcutLogStore__enable_direct_boot", true);
        e = agvx.a(a2, "ClearcutLogStore__enforce_log_cap_per_log_source", false);
        f = agvx.a(a2, "ClearcutLogStore__internal_event_age_cutoff_millis", 604800000);
        try {
            g = agvx.a(a2, "ClearcutLogStore__log_cap_policy", (avsp) aucj.a((aucj) avsp.d, new byte[0]), awth.a);
            h = agvx.a(a2, "ClearcutLogStore__log_file_age", false);
            i = agvx.a(a2, "log_file_age_cutoff_millis", 1152921504606846976L);
            j = agvx.a(a2, "ClearcutLogStore__max_entries_in_file_cache", 400);
            k = agvx.a(a2, "max_entries_in_file_cache", 40);
            l = agvx.a(a2, "max_log_file_size_bytes", 1048576);
            m = agvx.a(a2, "max_storage_size_bytes", 10485760);
            n = agvx.a(a2, "ClearcutLogStore__read_event_count", false);
            agvx.a(a2, "read_from_flat_file_storage", true);
            agvx.a(a2, "ClearcutLogStore__reorder_events_use_boot_count_uptime", true);
            o = agvx.a(a2, "sqlite_log_reader_uses_single_query", false);
            p = agvx.a(a2, "timestamp_events_kill_switch", true);
            q = agvx.a(a2, "vacuum_interval_millis", 0);
            r = agvx.a(a2, "ClearcutLogStore__warn_byte_threshold", 100000);
            s = agvx.a(a2, "ClearcutLogStore__warn_event_threshold", 1024);
            agvx.a(a2, "write_to_flat_file_storage", true);
        } catch (auda e2) {
            throw new AssertionError("Could not parse proto flag \"ClearcutLogStore__log_cap_policy\"");
        }
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final String b() {
        return (String) b.c();
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

    public final long f() {
        return ((Long) f.c()).longValue();
    }

    public final avsp g() {
        return (avsp) g.c();
    }

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }

    public final long i() {
        return ((Long) i.c()).longValue();
    }

    public final long j() {
        return ((Long) j.c()).longValue();
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

    public final boolean o() {
        return ((Boolean) o.c()).booleanValue();
    }

    public final boolean p() {
        return ((Boolean) p.c()).booleanValue();
    }

    public final long q() {
        return ((Long) q.c()).longValue();
    }

    public final long r() {
        return ((Long) r.c()).longValue();
    }

    public final long s() {
        return ((Long) s.c()).longValue();
    }
}
