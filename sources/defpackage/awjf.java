package defpackage;

/* renamed from: awjf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awjf implements awje {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.auth_account")).a();
        a = agvx.a(a2, "CachedLoaders__use_cache_result_for_pre_add_account", true);
        b = agvx.a(a2, "CachedLoaders__use_cache_result_for_token_activity", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
