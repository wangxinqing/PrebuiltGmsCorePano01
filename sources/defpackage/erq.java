package defpackage;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;

/* renamed from: erq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class erq {
    public final erx a;
    public final err b;
    public final Handler c = new qvr(Looper.getMainLooper());
    private AsyncTask d;

    public erq(erx erx, err err) {
        this.a = erx;
        this.b = err;
    }

    public final void a(String str, boolean z) {
        AsyncTask asyncTask = this.d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.d = null;
        }
        erp erp = new erp(this, new ero(this), str, z);
        this.d = erp;
        erp.execute(new Void[0]);
    }
}
