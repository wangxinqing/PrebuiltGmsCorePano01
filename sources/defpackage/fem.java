package defpackage;

import android.accounts.Account;
import android.content.ContentValues;
import android.os.SystemClock;
import com.google.android.gms.auth.api.identity.MatchPasswordResult;
import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* renamed from: fem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fem implements aoqb {
    private final fez a;
    private final MatchPasswordResult b;

    public fem(fez fez, MatchPasswordResult matchPasswordResult) {
        this.a = fez;
        this.b = matchPasswordResult;
    }

    public final aorr a(Object obj) {
        aosh aosh;
        fez fez = this.a;
        MatchPasswordResult matchPasswordResult = this.b;
        wla wla = (wla) obj;
        List<Account> list = matchPasswordResult.a;
        if (wla == null || wla.b().a() <= 0) {
            ilm a2 = DataHolder.a(new String[]{"account_name", "display_name", "given_name", "family_name", "avatar"});
            for (Account account : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("account_name", account.name);
                contentValues.put("display_name", account.name);
                contentValues.putNull("given_name");
                contentValues.putNull("family_name");
                contentValues.putNull("avatar");
                a2.a(contentValues);
            }
            wla = new fet(a2);
        }
        amzy a3 = amzy.a((Iterable) wla.b());
        anab h = anaf.h();
        for (Account account2 : matchPasswordResult.a) {
            fer fer = new fer(account2);
            Iterator it = a3.iterator();
            amrl.a((Object) it);
            amrl.a((Object) fer);
            while (it.hasNext()) {
                Object next = it.next();
                if (fer.a(next)) {
                    xaa xaa = (xaa) next;
                    fcp a4 = fcp.a(xaa.c(), xaa.d(), xaa.c(), (String) null);
                    a4.f = xaa.i();
                    h.a(a4, account2);
                }
            }
            throw new NoSuchElementException();
        }
        wla.c();
        fez.n = h.a();
        fez.m.c((fcp) fez.n.keySet().e().get(0));
        fez.k.c(amzy.a((Collection) fez.n.keySet().e()));
        fez.j.c(matchPasswordResult);
        fex fex = fez.p;
        long c = awnv.c();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = fex.b;
        long j2 = c - (elapsedRealtime - j);
        if (j != 0 && j2 >= 0) {
            aosh f = aosh.f();
            fex.c.h.execute(new feu(j2, f));
            aosh = f;
        } else {
            fex.a.cancel();
            aosh = aorl.a((Object) null);
        }
        return aopr.a(aosh, fen.a, (Executor) fez.e);
    }
}
