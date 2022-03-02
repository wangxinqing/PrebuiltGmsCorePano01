package defpackage;

/* renamed from: ctk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ctk extends dr {
    public ctk(eb ebVar) {
        super(ebVar);
    }

    public final String a() {
        return "INSERT OR REPLACE INTO `per_device_dismissed_onboarding_flow` (`dismissalId`) VALUES (?)";
    }

    public final /* bridge */ /* synthetic */ void a(C0000do doVar, Object obj) {
        Long l = ((cto) obj).a;
        if (l == null) {
            doVar.a(1);
        } else {
            doVar.a(1, l.longValue());
        }
    }
}
