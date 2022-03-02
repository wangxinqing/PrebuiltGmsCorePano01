package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: nf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nf implements Handler.Callback {
    final /* synthetic */ nk a;

    public nf(nk nkVar) {
        this.a = nkVar;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            nk nkVar = this.a;
            synchronized (nkVar.a) {
                if (!nkVar.c.hasMessages(1)) {
                    nkVar.b.quit();
                    nkVar.b = null;
                    nkVar.c = null;
                }
            }
            return true;
        } else if (i != 1) {
            return true;
        } else {
            nk nkVar2 = this.a;
            ((Runnable) message.obj).run();
            synchronized (nkVar2.a) {
                nkVar2.c.removeMessages(0);
                Handler handler = nkVar2.c;
                handler.sendMessageDelayed(handler.obtainMessage(0), (long) nkVar2.d);
            }
            return true;
        }
    }
}
