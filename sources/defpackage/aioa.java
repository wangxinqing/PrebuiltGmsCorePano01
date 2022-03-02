package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aioa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aioa {
    public final String F;
    public final acrz G;
    public int H;
    public final Object I = new Object();
    public int J;
    public ainy K;
    public HandlerThread L;
    private final LinkedList a = new LinkedList();

    public aioa(String str, acrz acrz) {
        new AtomicInteger();
        this.J = 0;
        HandlerThread handlerThread = new HandlerThread(str);
        this.L = handlerThread;
        handlerThread.start();
        Looper looper = this.L.getLooper();
        this.F = str;
        this.G = acrz;
        this.K = new ainy(looper, this);
    }

    private final Message d(Message message) {
        if (!b()) {
            return message;
        }
        synchronized (this.I) {
            this.H++;
            if (b()) {
                this.G.a(10000);
            }
        }
        return a(-4, message);
    }

    public final Message a(int i, Object obj) {
        return Message.obtain(this.K, i, obj);
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    public final void b(int i) {
        synchronized (this.a) {
            ListIterator listIterator = this.a.listIterator();
            while (listIterator.hasNext()) {
                ainz ainz = (ainz) listIterator.next();
                int i2 = ainz.b;
                if (i >= 0) {
                    CountDownLatch countDownLatch = ainz.a;
                    throw null;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b(ains ains) {
        this.K.l = ains;
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        return this.G != null;
    }

    /* access modifiers changed from: protected */
    public final ains c() {
        ainy ainy = this.K;
        if (ainy != null) {
            return ainy.d[ainy.f].a;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public String a(int i) {
        if (i == -4) {
            return "SM_WRAPPED_MESSAGE";
        }
        if (i == -3) {
            return "SM_WAIT_IDLE_CMD";
        }
        if (i == -2) {
            return "SM_INIT_CMD";
        }
        if (i == -1) {
            return "SM_QUIT_CMD";
        }
        return i + "(0x" + Integer.toHexString(i) + ")";
    }

    public final void b(int i, Object obj) {
        b(a(i, obj));
    }

    public final Message c(int i) {
        return Message.obtain(this.K, i);
    }

    /* access modifiers changed from: protected */
    public final void a(ains ains) {
        this.K.a(ains);
    }

    /* access modifiers changed from: protected */
    public final void c(Message message) {
        ainy ainy = this.K;
        if (ainy != null) {
            Message d = d(message);
            qvr.a(d, 0);
            ainy.sendMessageAtFrontOfQueue(d);
        }
    }

    public final void b(Message message) {
        ainy ainy = this.K;
        if (ainy != null) {
            ainy.sendMessage(d(message));
        }
    }

    /* access modifiers changed from: protected */
    public final void d() {
        c(c(8));
    }

    /* access modifiers changed from: protected */
    public final void a(Message message) {
        ainy ainy = this.K;
        boolean z = ainy.a;
        Message obtainMessage = ainy.obtainMessage();
        obtainMessage.copyFrom(message);
        ainy.m.add(obtainMessage);
    }

    public final void d(int i) {
        b(c(i));
    }
}
