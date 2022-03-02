package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import java.util.concurrent.Callable;

/* renamed from: eyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class eyn implements Callable {
    private final ezb a;

    public eyn(ezb ezb) {
        this.a = ezb;
    }

    public final Object call() {
        ezb ezb = this.a;
        qah a2 = qah.a((Account) ezb.b.h.b(), (Iterable) qah.a);
        a2.a(5);
        a2.a(ezb.b.c, ezb.a());
        TokenResponse a3 = ezb.g.a(a2.a());
        boolean z = true;
        if (a3.b().equals(gei.SUCCESS)) {
            z = false;
        } else if (!a3.b().equals(gei.NEED_REMOTE_CONSENT) && !a3.b().equals(gei.NEED_PERMISSION)) {
            throw new IllegalStateException("This should never happen.");
        }
        return Boolean.valueOf(z);
    }
}
