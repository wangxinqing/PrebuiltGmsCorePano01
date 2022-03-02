package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: abvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abvg implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ abvi c;

    public abvg(abvi abvi, int i, String str) {
        this.c = abvi;
        this.a = i;
        this.b = str;
    }

    public final void run() {
        abvi abvi = this.c;
        if (!abvi.s) {
            abvi.j.a(this.a);
            this.c.n.a(2051, Bundle.EMPTY);
            aboy aboy = this.c.k;
            int i = this.a;
            String str = this.b;
            ((abvj) aboy).c.b = null;
            try {
                aboy.b.a(i, str);
            } catch (RemoteException e) {
                aboy.a.a((Throwable) e);
            }
            this.c.a();
            return;
        }
        abvi.h.b("Dropping error %s", abpp.g(this.a));
    }
}
