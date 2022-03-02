package defpackage;

/* renamed from: aypu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aypu implements aypt {
    public static final agvx a;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.update"));
        a = agvx.a(agvw, "enable_settings_suggestion", false);
        agvx.a(agvw, "settings_suggestion_escalation_phases", "");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
