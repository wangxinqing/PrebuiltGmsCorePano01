package defpackage;

import android.accounts.Account;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: acnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class acnc implements Callable {
    private final Map a;
    private final String b;

    public acnc(Map map, String str) {
        this.a = map;
        this.b = str;
    }

    public final Object call() {
        Map map = this.a;
        String str = this.b;
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : map.entrySet()) {
            Account account = (Account) entry.getKey();
            try {
                if (((Boolean) aorl.a((Future) entry.getValue())).booleanValue()) {
                    hashSet.add(account);
                    acnj.a.b("%s has feature %s", account.name, str);
                }
            } catch (ExecutionException e) {
                acnj.a.e("Failed to find %s status for %s", e, str, account.name);
            }
        }
        return hashSet;
    }
}
