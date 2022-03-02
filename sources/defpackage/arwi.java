package defpackage;

import android.os.MessageQueue;

/* renamed from: arwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class arwi implements MessageQueue.IdleHandler {
    private final arwl a;
    private final arwm b;

    public arwi(arwl arwl, arwm arwm) {
        this.a = arwl;
        this.b = arwm;
    }

    public final boolean queueIdle() {
        arwl arwl = this.a;
        arwm arwm = this.b;
        if (arwl.c.hasMessages(0)) {
            return true;
        }
        arwm.run();
        return false;
    }
}
