package defpackage;

/* renamed from: ctl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ctl extends dq {
    public ctl(eb ebVar) {
        super(ebVar);
    }

    public final String a() {
        return "DELETE FROM `per_device_dismissed_onboarding_flow` WHERE `dismissalId` = ?";
    }
}
