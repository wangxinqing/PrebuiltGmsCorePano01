package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: arxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class arxl implements Runnable {
    private final arxt a;
    private final Account b;
    private final arxs c;
    private final long d;
    private final Throwable e;

    public arxl(arxt arxt, Account account, arxs arxs, long j, Throwable th) {
        this.a = arxt;
        this.b = account;
        this.c = arxs;
        this.d = j;
        this.e = th;
    }

    public final void run() {
        int i;
        arxt arxt = this.a;
        Account account = this.b;
        arxs arxs = this.c;
        long j = this.d;
        Throwable th = this.e;
        try {
            i = ((List) arxt.a(account).get()).size();
        } catch (InterruptedException | ExecutionException e2) {
            anih anih = (anih) aryq.a.c();
            anih.a(e2);
            ((anih) anih.a("arxt", "b", 237, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Failed to read the footprints for logging device count.");
            i = -1;
        }
        Context context = arxt.b;
        context.startService(arza.a(context, arxs.a().y, arxs.d(), j, i, th));
    }
}
