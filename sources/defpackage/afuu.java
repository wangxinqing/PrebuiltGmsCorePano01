package defpackage;

import android.accounts.Account;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: afuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afuu implements aoqb {
    private final afva a;
    private final List b;

    public afuu(afva afva, List list) {
        this.a = afva;
        this.b = list;
    }

    public final aorr a(Object obj) {
        afva afva = this.a;
        List list = this.b;
        amzt j = amzy.j();
        anhk i = ((amzy) obj).listIterator();
        while (i.hasNext()) {
            afjh afjh = (afjh) i.next();
            if (afva.a(afjh)) {
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        j.c(afva.a.a(afva.b(afjh)));
                        break;
                    }
                    int i3 = i2 + 1;
                    if (afva.a(afjh, (Account) list.get(i2))) {
                        break;
                    }
                    i2 = i3;
                }
            }
        }
        return aopr.a(aorl.d(j.a()), afuw.a, (Executor) aoqm.a);
    }
}
