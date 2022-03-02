package defpackage;

import android.accounts.Account;

/* renamed from: wbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wbz implements Runnable {
    private final wcf a;

    public wbz(wcf wcf) {
        this.a = wcf;
    }

    public final void run() {
        wcf wcf = this.a;
        ((anih) ((anih) vvj.a.d()).a("wcf", "i", 268, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Running certificates syncing task.");
        wcf.d();
        Account b = wcf.a.b();
        if (b != null && !wcf.c) {
            wcf.c = wcf.f(b);
        }
    }
}
