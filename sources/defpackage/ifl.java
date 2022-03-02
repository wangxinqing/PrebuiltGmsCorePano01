package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: ifl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ifl implements Runnable {
    final /* synthetic */ ConnectionResult a;
    final /* synthetic */ ifm b;

    public ifl(ifm ifm, ConnectionResult connectionResult) {
        this.b = ifm;
        this.a = connectionResult;
    }

    public final void run() {
        ifm ifm = this.b;
        ifn ifn = ifm.f;
        Status status = ifn.a;
        ifj ifj = (ifj) ifn.l.get(ifm.b);
        if (ifj == null) {
            return;
        }
        if (this.a.b()) {
            ifm ifm2 = this.b;
            ifm2.e = true;
            if (!ifm2.a.g()) {
                try {
                    ibo ibo = this.b.a;
                    ibo.a((itm) null, ibo.q());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    ifj.a(new ConnectionResult(10));
                }
            } else {
                this.b.a();
            }
        } else {
            ifj.a(this.a);
        }
    }
}
