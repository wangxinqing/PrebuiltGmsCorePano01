package defpackage;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: arwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arwk extends qvr {
    final /* synthetic */ arwl a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arwk(arwl arwl, Looper looper) {
        super(looper);
        this.a = arwl;
    }

    private final void a(long j, long j2, arwm arwm, String str) {
        arwl arwl = this.a;
        long j3 = arwl.a;
        if (((anih) arwl.d.c()).l()) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
            if (elapsedRealtime > j) {
                ((anih) this.a.d.c()).a("%s %s %s", (Object) arwm, (Object) str, (Object) new SimpleDateFormat("mm:ss.SSS", Locale.US).format(Long.valueOf(elapsedRealtime)));
            }
        }
    }

    public final void handleMessage(Message message) {
        arwm arwm = (arwm) message.obj;
        arwl arwl = this.a;
        long j = arwl.a;
        if (!arwl.e) {
            jjg jjg = this.a.d;
            a(arwl.b, (((long) message.arg1) << 32) | (((long) message.arg2) & 4294967295L), arwm, "was delayed for");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                arwm.run();
                a(arwl.a, elapsedRealtime, arwm, "ran for");
            } catch (Exception e) {
                anih anih = (anih) this.a.d.b();
                anih.a((Throwable) e);
                anih.a("%s crashed.", (Object) arwm);
                throw e;
            } catch (Throwable th) {
                a(arwl.a, elapsedRealtime, arwm, "ran for");
                throw th;
            }
        } else {
            ((anih) this.a.d.c()).a("Runnable %s attempted to run after the EventLoop was destroyed. Ignoring.", (Object) arwm);
        }
    }

    public final boolean a(arwm arwm, long j, boolean z) {
        arwl arwl = this.a;
        long j2 = arwl.a;
        if (arwl.e) {
            ((anih) this.a.d.c()).a("%s not posted since EventLoop is destroyed", (Object) arwm);
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        Message obtainMessage = obtainMessage(0, (int) (elapsedRealtime >> 32), (int) elapsedRealtime, arwm);
        boolean sendMessageAtFrontOfQueue = z ? sendMessageAtFrontOfQueue(obtainMessage) : sendMessageDelayed(obtainMessage, j);
        if (!sendMessageAtFrontOfQueue) {
            ((anih) this.a.d.c()).a("%s not posted since looper is exiting", (Object) arwm);
        }
        return sendMessageAtFrontOfQueue;
    }
}
