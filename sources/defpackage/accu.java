package defpackage;

import android.os.Bundle;

/* renamed from: accu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class accu implements Runnable {
    final /* synthetic */ accj a;
    final /* synthetic */ int b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ accv d;

    public accu(accv accv, accj accj, int i, Bundle bundle) {
        this.d = accv;
        this.a = accj;
        this.b = i;
        this.c = bundle;
    }

    public final void run() {
        oq oqVar;
        Object obj;
        this.a.b(this.b, this.c);
        accv accv = this.d;
        accj accj = accv.b;
        if (accj != null && (oqVar = (oq) accv.a.poll()) != null && (obj = oqVar.a) != null && oqVar.b != null) {
            this.d.a(accj, ((Integer) obj).intValue(), (Bundle) oqVar.b);
        }
    }
}
