package defpackage;

import android.accounts.Account;
import android.util.Pair;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: wup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wup implements wuk {
    static final wls a;

    static {
        wlr wlr = new wlr();
        wlr.a = 526;
        a = wlr.a();
    }

    public static String a(Account account) {
        return String.format("%s@%s", new Object[]{account.name, account.type});
    }

    public static final wur b(icc icc) {
        iey iey = (iey) icc;
        qub a2 = qub.a(iey.d);
        iby c = wlt.c(iey.d, a);
        Account[] a3 = a2.a("com.google");
        ArrayList arrayList = new ArrayList();
        aoru b = jfm.b(9);
        for (Account account : a3) {
            arrayList.add(c.a((ihb) new wlx(account, "com.android.contacts")).a((Executor) b, (acvz) new wuo(account)));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                arrayList2.add((Pair) acws.a((acwa) arrayList.get(i), 10, TimeUnit.SECONDS));
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                String a4 = a(a3[i]);
                String valueOf = String.valueOf(e.getMessage());
                arrayList2.add(Pair.create(a4, valueOf.length() == 0 ? new String("Sync status lookup failed: ") : "Sync status lookup failed: ".concat(valueOf)));
            }
        }
        anab h = anaf.h();
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) arrayList2.get(i2);
            h.a((String) pair.first, (String) pair.second);
        }
        return new wur("fsa2_sync_status", h.a());
    }

    public final String a() {
        return "fsa2_sync_status";
    }

    public final void b() {
    }

    public final /* bridge */ /* synthetic */ wuj a(icc icc) {
        return b(icc);
    }
}
