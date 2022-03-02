package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: jfo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jfo extends Handler {
    static final Looper c;
    public final jfz d;
    public final Handler.Callback e;

    static {
        HandlerThread handlerThread = new HandlerThread("GlobalDispatchingHandlerThread", 9);
        handlerThread.start();
        c = handlerThread.getLooper();
    }

    public jfo(jfp jfp) {
        this(jfp, (Handler.Callback) null);
    }

    public final void dispatchMessage(Message message) {
        Runnable callback = message.getCallback();
        if (callback != null) {
            this.d.b(callback);
            return;
        }
        this.d.b((Runnable) new jfn(this, Message.obtain(message), (Object) null));
    }

    public final boolean sendMessageAtTime(Message message, long j) {
        if (this.d.isShutdown()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append(valueOf);
            sb.append(" sendMessageAtTime() called with no mQueue");
            RuntimeException runtimeException = new RuntimeException(sb.toString());
            Log.w("Looper", runtimeException.getMessage(), runtimeException);
            return false;
        }
        Message obtain = Message.obtain(this, new jfn(this, message, jge.a(j)));
        obtain.what = message.what;
        obtain.obj = message.obj;
        return super.sendMessageAtTime(obtain, j);
    }

    public jfo(jfp jfp, Handler.Callback callback) {
        super(c);
        this.d = jfp.a;
        this.e = callback;
    }
}
