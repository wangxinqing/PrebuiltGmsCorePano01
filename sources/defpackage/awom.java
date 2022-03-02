package defpackage;

/* renamed from: awom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awom implements awol {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth.api.credentials"));
        a = agvx.a(agvw, "SignInCredentialCacheStrategy__expiration_since_last_access_seconds", 10);
        b = agvx.a(agvw, "SignInCredentialCacheStrategy__max_entry_count", 10);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
