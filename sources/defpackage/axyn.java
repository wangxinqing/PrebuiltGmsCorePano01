package defpackage;

/* renamed from: axyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axyn implements axym {
    public static final agvx chreCcTransitionDetectionEnabled;
    public static final agvx chreCcTransitionHealthEventEnabled;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        chreCcTransitionDetectionEnabled = agvx.a(a, "chre_cc_transition_detection_enabled", false);
        chreCcTransitionHealthEventEnabled = agvx.a(a, "chre_cc_transition_health_event_enabled", false);
    }

    public boolean chreCcTransitionDetectionEnabled() {
        return ((Boolean) chreCcTransitionDetectionEnabled.c()).booleanValue();
    }

    public boolean chreCcTransitionHealthEventEnabled() {
        return ((Boolean) chreCcTransitionHealthEventEnabled.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }
}
