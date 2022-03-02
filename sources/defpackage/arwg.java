package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: arwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arwg {
    public final arwf a;

    public arwg(arwf arwf) {
        this.a = arwf;
    }

    public static arwg a(String str) {
        HandlerThread handlerThread = new HandlerThread(str, 10);
        handlerThread.start();
        return new arwg(new arwl(str, handlerThread.getLooper()));
    }

    public final void b() {
        arwf arwf = this.a;
        if (aynf.a.a().i()) {
            Thread thread = Looper.myLooper().getThread();
            Thread thread2 = ((arwl) arwf).c.getLooper().getThread();
            if (thread.getId() != thread2.getId()) {
                throw new IllegalStateException(String.format("This method must run in the EventLoop thread '%s (id: %s)'. Was called from thread '%s (id: %s)'.", new Object[]{thread2.getName(), Long.valueOf(thread2.getId()), thread.getName(), Long.valueOf(thread.getId())}));
            }
        }
    }

    public final Handler c() {
        return ((arwl) this.a).c;
    }

    public final void d(arwm arwm) {
        arwl arwl = (arwl) this.a;
        arwl.c.post(new arwh(arwl, arwm));
    }

    public final void e(arwm arwm) {
        arwf arwf = this.a;
        if (arwm != null) {
            ((arwl) arwf).c.removeMessages(0, arwm);
        }
    }

    public final void c(arwm arwm) {
        ((arwl) this.a).c.a(arwm, 0, false);
    }

    public final void a() {
        arwl arwl = (arwl) this.a;
        Looper looper = arwl.c.getLooper();
        looper.getThread().getName();
        looper.getThread().getId();
        looper.quit();
        arwl.e = true;
    }

    public final boolean b(arwm arwm) {
        return ((arwl) this.a).c.hasMessages(0, arwm);
    }

    public final void a(arwm arwm) {
        ((arwl) this.a).a(arwm, false);
    }

    public final void a(arwm arwm, long j) {
        ((arwl) this.a).c.a(arwm, j, false);
    }
}
