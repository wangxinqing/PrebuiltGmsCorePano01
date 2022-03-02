package defpackage;

/* renamed from: fnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fnn implements aoqb {
    private final String a;
    private final boolean b;

    public fnn(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final aorr a(Object obj) {
        String str = this.a;
        boolean z = this.b;
        fkw a2 = fkw.a();
        qbk qbk = qbk.AUTH_API_CREDENTIALS_APP_SETTINGS_DATA_PROVIDER_SET_AUTO_SIGNIN_ENABLED_FOR_APP;
        a2.a(str, z);
        aorr a3 = aorl.a((Object) Boolean.valueOf(z));
        ((fde) obj).a(qbk, a3);
        return a3;
    }
}
