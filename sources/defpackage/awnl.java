package defpackage;

/* renamed from: awnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awnl implements awnk {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth.api.credentials"));
        a = agvx.a(agvw, "AssistedSignInConfirmationDelay__delay_with_grants_needed_millis", 2000);
        b = agvx.a(agvw, "AssistedSignInConfirmationDelay__delay_without_grants_needed_millis", 1000);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
