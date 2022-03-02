package defpackage;

/* renamed from: azau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azau implements azat {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.phonesky_recovery")).a();
        a = agvx.a(a2, "PhoneskyRecoveryFeature__user_interacted_rollback_debounce_duration_ms", 3600000);
        b = agvx.a(a2, "PhoneskyRecoveryFeature__user_interacted_rollback_latchsky_enabled", false);
        c = agvx.a(a2, "PhoneskyRecoveryFeature__user_interacted_rollback_notification_success_duration_ms", 259200000);
        d = agvx.a(a2, "PhoneskyRecoveryFeature__user_interacted_rollback_phonesky_versions", "");
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final String d() {
        return (String) d.c();
    }
}
