package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: fxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fxm implements amqy {
    static final amqy a = new fxm();

    private fxm() {
    }

    public final Object a(Object obj) {
        fvv fvv = (fvv) obj;
        anaf anaf = fxp.a;
        GoogleSignInAccount googleSignInAccount = fvv.b;
        if (googleSignInAccount != null) {
            return amri.c(googleSignInAccount);
        }
        throw fxi.a(irj.a(fvv.a));
    }
}
