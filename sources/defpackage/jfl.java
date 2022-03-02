package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import com.google.android.chimera.Service;

/* renamed from: jfl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jfl extends Service {
    public volatile jfp a;
    private volatile jfk b;
    private final int c;

    public jfl() {
        this.c = 10;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Intent intent);

    public IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        this.a = new jfp(this.c);
        this.a.start();
        this.b = new jfk(this, this.a);
    }

    public void onDestroy() {
        this.a.quit();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Message obtain = Message.obtain();
        obtain.arg1 = i2;
        obtain.obj = intent;
        this.b.sendMessage(obtain);
        return 2;
    }

    public jfl(int i) {
        this.c = i;
    }
}
