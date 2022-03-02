package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;

/* renamed from: arxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arxo implements aora {
    final /* synthetic */ Account a;
    final /* synthetic */ arxs b;
    final /* synthetic */ long c;
    final /* synthetic */ aora d;
    final /* synthetic */ arxt e;

    public arxo(arxt arxt, Account account, arxs arxs, long j, aora aora) {
        this.e = arxt;
        this.a = account;
        this.b = arxs;
        this.c = j;
        this.d = aora;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        aryq aryq = aryq.a;
        if (aymz.b()) {
            this.e.a(this.a, this.b, SystemClock.elapsedRealtime() - this.c, (Throwable) null);
        } else {
            arxt arxt = this.e;
            int i = arxt.c;
            Context context = arxt.b;
            context.startService(arza.a(context, this.b.a().y, this.b.d(), SystemClock.elapsedRealtime() - this.c, -1, (Throwable) null));
        }
        aora aora = this.d;
        if (aora != null) {
            aora.a((Object) voidR);
        }
    }

    public final void a(Throwable th) {
        anih anih = (anih) aryq.a.c();
        anih.a(th);
        ((anih) anih.a("arxo", "a", 191, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Footprints Manager: Write failed.");
        if (aymz.b()) {
            this.e.a(this.a, this.b, SystemClock.elapsedRealtime() - this.c, th);
        } else {
            arxt arxt = this.e;
            int i = arxt.c;
            Context context = arxt.b;
            context.startService(arza.a(context, this.b.a().y, this.b.d(), SystemClock.elapsedRealtime() - this.c, -1, th));
        }
        aora aora = this.d;
        if (aora != null) {
            aora.a(th);
        }
    }
}
