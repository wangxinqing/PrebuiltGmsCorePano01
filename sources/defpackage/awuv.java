package defpackage;

/* renamed from: awuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awuv implements awuq {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.contextmanager")).a();
        agvx.a(a2, "acl_server_retry_timeout_millis", 1800000);
        try {
            agvx.a(a2, "acl_set_override", (atnh) aucj.a((aucj) atnh.d, new byte[0]), awur.a);
            try {
                a = agvx.a(a2, "context_acl_anonymous_acl", (atnh) aucj.a((aucj) atnh.d, new byte[0]), awus.a);
                try {
                    b = agvx.a(a2, "context_acl_context_acl", (atnh) aucj.a((aucj) atnh.d, new byte[0]), awut.a);
                    try {
                        c = agvx.a(a2, "context_acl_synchronizable_contexts", (atqy) aucj.a((aucj) atqy.b, new byte[]{10, 3, 8, -110, 78, 10, 3, 8, -108, 78, 10, 3, 8, -109, 78, 10, 3, 8, -107, 78}), awuu.a);
                        d = agvx.a(a2, "no_acl_fetching_if_gms", true);
                    } catch (auda e) {
                        throw new AssertionError("Could not parse proto flag \"context_acl_synchronizable_contexts\"");
                    }
                } catch (auda e2) {
                    throw new AssertionError("Could not parse proto flag \"context_acl_context_acl\"");
                }
            } catch (auda e3) {
                throw new AssertionError("Could not parse proto flag \"context_acl_anonymous_acl\"");
            }
        } catch (auda e4) {
            throw new AssertionError("Could not parse proto flag \"acl_set_override\"");
        }
    }

    public final atnh a() {
        return (atnh) a.c();
    }

    public final atnh b() {
        return (atnh) b.c();
    }

    public final atqy c() {
        return (atqy) c.c();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }
}
