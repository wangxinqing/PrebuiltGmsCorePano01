package defpackage;

/* renamed from: vvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vvn implements acvf {
    private final vvq a;

    public vvn(vvq vvq) {
        this.a = vvq;
    }

    public final Object a(acwa acwa) {
        vvq vvq = this.a;
        boolean booleanValue = ((Boolean) acwa.d()).booleanValue();
        if (booleanValue) {
            thp.a(vvq.a, "com.google.android.gms.nearby.sharing.DEVICE_CONTACTS_CONSENT_ENABLED");
        }
        return Boolean.valueOf(booleanValue);
    }
}
