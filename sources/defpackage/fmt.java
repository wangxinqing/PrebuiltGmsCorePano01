package defpackage;

import android.accounts.Account;
import android.net.Uri;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: fmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fmt implements Callable {
    private final aorr a;
    private final aorr b;

    public fmt(aorr aorr, aorr aorr2) {
        this.a = aorr;
        this.b = aorr2;
    }

    public final Object call() {
        Uri uri;
        aorr aorr = this.a;
        aorr aorr2 = this.b;
        wla wla = (wla) aorl.a((Future) aorr);
        try {
            amzt j = amzy.j();
            Iterator it = ((List) aorl.a((Future) aorr2)).iterator();
            while (it.hasNext()) {
                fna fna = (fna) it.next();
                amri d = anbs.d(amym.a((Iterable) wla.b()).a(), new fmx(fna));
                if (d.a()) {
                    xaa xaa = (xaa) d.b();
                    if (xaa.i() != null) {
                        String i = xaa.i();
                        iva.a((Object) i);
                        uri = Uri.parse(i);
                    } else {
                        uri = null;
                    }
                    Account account = fna.a;
                    Iterator it2 = it;
                    SignInCredential signInCredential = r7;
                    SignInCredential signInCredential2 = new SignInCredential(account.name, xaa.d(), xaa.f(), xaa.g(), uri, (String) null, (String) null);
                    j.c(new InternalSignInCredentialWrapper(account, signInCredential, fna.b, false));
                    it = it2;
                } else {
                    Iterator it3 = it;
                }
            }
            return j.a();
        } finally {
            wla.b().c();
            wla.c();
        }
    }
}
