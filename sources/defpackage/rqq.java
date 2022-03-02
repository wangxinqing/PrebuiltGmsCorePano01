package defpackage;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: rqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rqq {
    public final ViewGroup a;
    public final rss b;
    public View c;

    public rqq(ViewGroup viewGroup, rss rss) {
        iva.a((Object) rss);
        this.b = rss;
        iva.a((Object) viewGroup);
        this.a = viewGroup;
    }

    public final void a(rqs rqs) {
        try {
            this.b.a((rts) new rtr(rqs));
        } catch (RemoteException e) {
            throw new rvl(e);
        }
    }
}
