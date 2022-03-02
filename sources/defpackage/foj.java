package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: foj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class foj implements fcu {
    private final fjh a;

    public foj(Context context) {
        this.a = fjh.a(context);
    }

    public final aorr a(fde fde) {
        amzy a2 = fcg.a();
        ArrayList arrayList = new ArrayList();
        anhk i = a2.listIterator();
        while (i.hasNext()) {
            pyv pyv = (pyv) i.next();
            qbk qbk = qbk.AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_FIRST_TIME_WELCOME_NEEDED;
            fjh fjh = this.a;
            aorr a3 = aopr.a(fjh.a.a(pyv, fko.a("credentials_need_first_time_welcome", false)), (aoqb) new fiy(fjh, pyv), (Executor) aoqm.a);
            fde.a(qbk, a3);
            arrayList.add(a3);
        }
        return aorl.c((Iterable) arrayList).a(foi.a, (Executor) aoqm.a);
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_SET_IS_FIRST_TIME_WELCOME_SHOWN;
    }
}
