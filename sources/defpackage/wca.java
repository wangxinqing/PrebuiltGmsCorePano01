package defpackage;

import android.accounts.Account;
import java.util.List;

/* renamed from: wca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wca implements Runnable {
    private final wcf a;

    public wca(wcf wcf) {
        this.a = wcf;
    }

    public final void run() {
        wcf wcf = this.a;
        Account b = wcf.a.b();
        if (b != null) {
            List b2 = wcf.b.b(b);
            if (!b2.isEmpty()) {
                wcf.a(b, b2);
            }
        }
    }
}
