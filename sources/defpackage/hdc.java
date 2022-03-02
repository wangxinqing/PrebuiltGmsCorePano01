package defpackage;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: hdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hdc implements Runnable {
    final /* synthetic */ hdd a;
    private final hcy b;

    public hdc(hdd hdd, hcy hcy) {
        this.a = hdd;
        this.b = hcy;
    }

    public final void run() {
        try {
            this.b.a(this.a);
        } catch (jbk e) {
            Log.e(this.a.e, e.getMessage(), e);
            throw null;
        } catch (RemoteException e2) {
        }
        this.a.d.lock();
        try {
            hdd hdd = this.a;
            hdd.c--;
            hdd.a();
        } finally {
            this.a.d.unlock();
        }
    }
}
