package defpackage;

import com.google.android.gms.auth.api.identity.ListSignInCredentialsResult;

/* renamed from: exv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class exv implements amqy {
    private final eyf a;

    public exv(eyf eyf) {
        this.a = eyf;
    }

    public final Object a(Object obj) {
        this.a.o = ((ListSignInCredentialsResult) obj).a;
        return amri.b(qcp.CHOOSE_MULTI_CREDENTIAL);
    }
}
