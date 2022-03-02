package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: jfn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jfn implements jey {
    final Message a;
    final Object b;
    final /* synthetic */ jfo c;

    public jfn(jfo jfo, Message message, Object obj) {
        this.c = jfo;
        this.a = message;
        this.b = obj;
    }

    public final Object a() {
        return this.b;
    }

    public final Runnable b() {
        return this;
    }

    public final void run() {
        try {
            Runnable callback = this.a.getCallback();
            if (callback == null) {
                Handler.Callback callback2 = this.c.e;
                if (callback2 == null || !callback2.handleMessage(this.a)) {
                    this.c.handleMessage(this.a);
                }
            } else {
                callback.run();
            }
        } finally {
            this.a.recycle();
        }
    }

    public final String toString() {
        return this.c.toString();
    }
}
