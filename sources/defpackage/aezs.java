package defpackage;

import android.accounts.Account;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: aezs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aezs implements aoqb {
    private final aezu a;

    public aezs(aezu aezu) {
        this.a = aezu;
    }

    public final aorr a(Object obj) {
        aorr aorr;
        aezu aezu = this.a;
        HashMap hashMap = new HashMap();
        for (Account account : (List) obj) {
            try {
                aorr = aorl.a((Object) eim.f(aezu.c, account.name));
            } catch (eif e) {
                aorr = aorl.a((Throwable) new aetk(e));
            } catch (IOException e2) {
                aorr = aorl.a((Throwable) e2);
            }
            hashMap.put(aorr, account);
        }
        return aorl.b((Iterable) hashMap.keySet()).a((Callable) new aezt(aezu, hashMap), aezu.d);
    }
}
