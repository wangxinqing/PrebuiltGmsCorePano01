package defpackage;

import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: fhs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fhs implements Callable {
    private final aorr a;
    private final aorr b;

    public fhs(aorr aorr, aorr aorr2) {
        this.a = aorr;
        this.b = aorr2;
    }

    public final Object call() {
        aorr aorr = this.a;
        aorr aorr2 = this.b;
        iwd iwd = fib.a;
        amzt j = amzy.j();
        amzt j2 = amzy.j();
        j2.b((Iterable) aorl.a((Future) aorr));
        j2.b((Iterable) aorl.a((Future) aorr2));
        anaa a2 = anfb.a(j2.a(), fhy.a);
        anhj a3 = a2.b().iterator();
        while (a3.hasNext()) {
            String str = (String) a3.next();
            InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) anfk.a(fca.a(fhz.a)).b((Iterable) a2.g(str));
            if (!TextUtils.isEmpty(internalSignInCredentialWrapper.g.f) || a2.g(str).size() <= 1) {
                j.c(internalSignInCredentialWrapper);
            } else {
                j.c(new InternalSignInCredentialWrapper(internalSignInCredentialWrapper.f, internalSignInCredentialWrapper.g, internalSignInCredentialWrapper.h, true));
            }
        }
        return j.a();
    }
}
