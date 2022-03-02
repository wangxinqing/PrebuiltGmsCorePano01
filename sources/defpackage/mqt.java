package defpackage;

import android.accounts.Account;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* renamed from: mqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class mqt implements Callable {
    private final mqv a;
    private final Account b;
    private final String c;

    public mqt(mqv mqv, Account account, String str) {
        this.a = mqv;
        this.b = account;
        this.c = str;
    }

    public final Object call() {
        mqv mqv = this.a;
        Account account = this.b;
        String str = this.c;
        anbh b2 = anbh.b(mqv.a.a(account, str));
        synchronized (mqv) {
            mqv.d = b2;
            anbh anbh = mqv.d;
            CookieManager cookieManager = mqv.c;
            amzt j = amzy.j();
            anhj a2 = anbh.iterator();
            while (a2.hasNext()) {
                String str2 = (String) a2.next();
                for (mqu mqu : mqv.a(str2, cookieManager)) {
                    j.c(mqv.a(str2, mqu.a));
                }
            }
            mqv.e = j.a();
            mqv.a(account);
        }
        return null;
    }
}
