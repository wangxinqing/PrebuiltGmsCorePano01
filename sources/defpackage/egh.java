package defpackage;

import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* renamed from: egh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class egh extends Service {
    protected volatile egg a;
    protected int b = Integer.MAX_VALUE;
    protected int c = 0;
    protected qvr d;

    /* access modifiers changed from: protected */
    public abstract egg b();

    /* access modifiers changed from: protected */
    public abstract void c();

    /* access modifiers changed from: protected */
    public abstract boolean d();

    /* access modifiers changed from: protected */
    public final void f() {
        this.c = 0;
    }

    public IBinder onBind(Intent intent) {
        if (this.a == null && d()) {
            this.a = b();
        }
        this.d.post(new egc(this));
        return null;
    }

    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("ReleasableService");
        handlerThread.start();
        this.d = new qvr(handlerThread.getLooper());
    }

    public final void onDestroy() {
        super.onDestroy();
        this.d.post(new egb(this));
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        this.d.post(new ega(this, i2));
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        egg egg = this.a;
        this.a = null;
        this.d.post(new egd(this, egg));
        return false;
    }
}
