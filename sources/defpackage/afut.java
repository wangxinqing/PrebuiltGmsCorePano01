package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;

/* renamed from: afut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class afut implements aoqb {
    private final afva a;
    private final Account b;
    private final String c;

    public afut(afva afva, Account account, String str) {
        this.a = afva;
        this.b = account;
        this.c = str;
    }

    public final aorr a(Object obj) {
        afva afva = this.a;
        Account account = this.b;
        String str = this.c;
        amzt j = amzy.j();
        anhk i = ((amzy) obj).listIterator();
        while (i.hasNext()) {
            afjh afjh = (afjh) i.next();
            if (afva.a(afjh) && afva.a(afjh, account)) {
                amrl.a(afva.a(afjh));
                if (!afjh.b.substring(17).equals(str)) {
                    j.c(afva.a.a(afva.b(afjh)));
                }
            }
        }
        return aopr.a(aorl.d(j.a()), afuy.a, (Executor) aoqm.a);
    }
}
