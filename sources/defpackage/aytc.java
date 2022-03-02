package defpackage;

/* renamed from: aytc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aytc implements aytb {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "FsaBugFixesY2020w06__catch_contacts_counter_security_exception_enabled", true);
        b = agvx.a(agvw, "FsaBugFixesY2020w06__not_retry_for_security_exception_auth_error_enabled", false);
        c = agvx.a(agvw, "FsaBugFixesY2020w06__request_expedite_sync_after_initialization_disabled", false);
        d = agvx.a(agvw, "FsaBugFixesY2020w06__retry_with_sync_coordinator_for_security_exception_auth_error_enabled", true);
        e = agvx.a(agvw, "FsaBugFixesY2020w06__security_exception_stack_trace_substring", "tying to get authenticator types for");
        f = agvx.a(agvw, "FsaBugFixesY2020w06__use_actual_moved_contact_count", true);
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

    public final String e() {
        return (String) e.c();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }
}
