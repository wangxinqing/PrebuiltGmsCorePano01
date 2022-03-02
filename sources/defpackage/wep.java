package defpackage;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: wep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wep implements Callable {
    private final wgu a;

    public wep(wgu wgu) {
        this.a = wgu;
    }

    public final Object call() {
        wcg wcg = this.a.n;
        ArrayList arrayList = new ArrayList();
        Account b = wcg.c.b();
        if (b != null && !wcg.a.c(b)) {
            wcg.a.a(b);
            wcp wcp = wcg.b;
            Boolean bool = (Boolean) thr.a("updateContactsReachability", acws.a((Executor) wcp.e, (Callable) new wcl(wcp, b)), ayni.h());
            if (bool == null || !bool.booleanValue()) {
                wcg.a.a();
            }
        }
        aucx aucx = wcg.a.b(b).a;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(wcg.a((vig) aucx.get(i)));
        }
        return arrayList;
    }
}
