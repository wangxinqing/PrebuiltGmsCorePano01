package defpackage;

/* renamed from: azkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azkb implements azka {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.smartdevice"));
        a = agvx.a(agvw, "DirectTransfer__allow_source_activity_customization", true);
        b = agvx.a(agvw, "DirectTransfer__check_3p_in_progress", true);
        c = agvx.a(agvw, "DirectTransfer__erase_result_receiver_type", true);
        d = agvx.a(agvw, "DirectTransfer__use_account_transfer", true);
        e = agvx.a(agvw, "DirectTransfer__wait_sending_complete_message", false);
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
}
