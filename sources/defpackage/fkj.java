package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: fkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fkj implements amqy {
    private final Credential a;

    public fkj(Credential credential) {
        this.a = credential;
    }

    public final Object a(Object obj) {
        Credential credential = this.a;
        fkm.a.e("Failed to get id token.", (Exception) obj, new Object[0]);
        return credential;
    }
}
