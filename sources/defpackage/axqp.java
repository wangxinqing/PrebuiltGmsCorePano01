package defpackage;

/* renamed from: axqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axqp implements axqo {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        a = agvx.a(a2, "AndroidGoogleHelp__enable_c2c_activity_a11y_fixes", false);
        b = agvx.a(a2, "AndroidGoogleHelp__enable_chat_error_after_queue", false);
        c = agvx.a(a2, "AndroidGoogleHelp__enable_ignore_chat_queue_status", false);
        d = agvx.a(a2, "AndroidGoogleHelp__ignore_chat_queue_status_timeout_ms", 3000);
        e = agvx.a(a2, "AndroidGoogleHelp__process_list_conversation_after_join", false);
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
}
