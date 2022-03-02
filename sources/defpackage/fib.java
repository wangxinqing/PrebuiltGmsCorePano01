package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* renamed from: fib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fib implements fcu {
    public static final iwd a = ehv.b("ListSignInCredentialsOperation");
    private static final qcc e = qcb.b(fhq.a);
    public final Context b;
    public final String c;
    public final BeginSignInRequest d;

    public fib(Context context, String str, BeginSignInRequest beginSignInRequest) {
        iva.a((Object) context);
        this.b = context;
        iva.c(str);
        this.c = str;
        iva.a((Object) beginSignInRequest);
        this.d = beginSignInRequest;
    }

    public final aorr a(fde fde) {
        aorr aorr;
        amri a2 = hiq.a(this.b, this.c);
        if (a2.a()) {
            qaj qaj = (qaj) e.a();
            fia fia = new fia((String) a2.b(), this.d);
            fhp fhp = new fhp(this, fde);
            synchronized (qaj.a) {
                aorr = (aorr) qaj.b.b(fia);
                if (aorr == null) {
                    try {
                        aorr = fhp.a(fia);
                        qaj.b.a(fia, aorr);
                    } catch (Exception e2) {
                        aorr = aorl.a((Throwable) e2);
                    }
                }
            }
            return aorr;
        }
        throw qbf.a(28442);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_LIST_SIGNIN_CREDENTIALS;
    }
}
