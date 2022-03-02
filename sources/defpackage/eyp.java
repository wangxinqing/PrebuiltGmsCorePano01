package defpackage;

import android.accounts.Account;
import android.net.Uri;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.concurrent.Callable;

/* renamed from: eyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class eyp implements Callable {
    private final ezb a;

    public eyp(ezb ezb) {
        this.a = ezb;
    }

    public final Object call() {
        ezb ezb = this.a;
        qah a2 = qah.a((Account) ezb.b.h.b(), ezb.b.d.a);
        a2.a(true);
        a2.b(true);
        a2.a(5);
        a2.a(ezb.b.c, ezb.a());
        a2.a(gda.GRANTED);
        String str = ezb.g.a(a2.a()).d;
        amri a3 = qae.a(str);
        if (a3.a()) {
            qad qad = (qad) a3.b();
            return new SignInCredential((String) qad.e.b(), (String) qad.b.c(), (String) qad.c.c(), (String) qad.d.c(), (Uri) qad.f.c(), (String) null, str);
        }
        throw new IllegalStateException("Invalid token");
    }
}
