package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: aank  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aank implements Handler.Callback {
    private static aank d;
    public final aang a;
    public final aauk b;
    private final Handler c = new qvr(Looper.getMainLooper(), this);

    static {
        aank.class.getSimpleName();
    }

    private aank(aang aang, aauk aauk) {
        this.a = aang;
        this.b = aauk;
    }

    public static synchronized aank a(Context context) {
        aank aank;
        synchronized (aank.class) {
            if (d == null) {
                d = new aank(aang.a(context), aauk.a(context));
            }
            aank = d;
        }
        return aank;
    }

    static synchronized void b() {
        synchronized (aank.class) {
            d = null;
        }
    }

    public final boolean handleMessage(Message message) {
        jfm.b(9).execute(new aanj(this, message.what));
        return true;
    }

    public final synchronized void a() {
        if (!this.c.hasMessages(1) && !this.c.hasMessages(2) && !this.c.hasMessages(3)) {
            b();
        }
    }

    public final synchronized void b(int i) {
        if (!(i == 1 || i == 2)) {
            i = 3;
        }
        if (!this.c.hasMessages(i)) {
            Handler handler = this.c;
            handler.sendMessageAtTime(handler.obtainMessage(i, (Object) null), SystemClock.uptimeMillis() + aans.a);
        }
    }

    public final synchronized void a(int i) {
        this.c.removeMessages(i, (Object) null);
        a();
    }
}
