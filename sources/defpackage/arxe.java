package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;

/* renamed from: arxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arxe {
    public arxz a;
    public final Context b;
    public aryb c;
    private final String d;
    private final arxd e;
    private final ServiceConnection f = new arxc(this);

    public arxe(Context context, String str, arxd arxd) {
        this.b = context;
        this.d = str;
        this.e = arxd;
    }

    public final void a() {
        if (this.c == null) {
            this.c = new aryb(this.b, this.e);
            Intent b2 = arza.b(this.b);
            b2.setAction(this.d);
            this.b.bindService(b2, this.f, 1);
        }
    }

    public final void b() {
        aryb aryb = this.c;
        if (aryb != null) {
            arxz arxz = this.a;
            if (arxz != null) {
                try {
                    arxz.b(aryb);
                } catch (RemoteException e2) {
                    anih anih = (anih) aryq.a.b();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("arxe", "b", 121, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DevicesListActivity failed to unregister from the discovery service");
                }
            }
            this.b.unbindService(this.f);
            aryb aryb2 = this.c;
            aryb2.a = null;
            aryb2.b = null;
            this.c = null;
        }
    }
}
