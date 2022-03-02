package defpackage;

/* renamed from: axzo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axzo implements axzn {
    public static final agvx arDndDecisionEngineEnabled;
    public static final agvx carDndRuleActionEnabled;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        arDndDecisionEngineEnabled = agvx.a(a, "ar_dnd_decision_engine_enabled", true);
        carDndRuleActionEnabled = agvx.a(a, "car_dnd_rule_action_enabled", true);
    }

    public boolean arDndDecisionEngineEnabled() {
        return ((Boolean) arDndDecisionEngineEnabled.c()).booleanValue();
    }

    public boolean carDndRuleActionEnabled() {
        return ((Boolean) carDndRuleActionEnabled.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }
}
