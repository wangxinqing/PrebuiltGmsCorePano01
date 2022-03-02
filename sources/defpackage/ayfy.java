package defpackage;

/* renamed from: ayfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayfy implements ayfx {
    public static final agvx a;

    static {
        agvw b = new agvw("com.google.android.gms.lockbox").a("gms:lockbox:policy").b();
        a = agvx.a(b, "get_opt_in_udc_only", true);
        agvx.a(b, "set_opt_in_calls_facs", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
