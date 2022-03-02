package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: nk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nk {
    public final Object a = new Object();
    public HandlerThread b;
    public Handler c;
    public final int d;
    private int e;
    private final Handler.Callback f = new nf(this);
    private final int g;
    private final String h;

    public nk(String str) {
        this.h = str;
        this.g = 10;
        this.d = 10000;
        this.e = 0;
    }

    public final void a(Runnable runnable) {
        synchronized (this.a) {
            if (this.b == null) {
                HandlerThread handlerThread = new HandlerThread(this.h, this.g);
                this.b = handlerThread;
                handlerThread.start();
                this.c = new Handler(this.b.getLooper(), this.f);
                this.e++;
            }
            this.c.removeMessages(0);
            Handler handler = this.c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }
}
