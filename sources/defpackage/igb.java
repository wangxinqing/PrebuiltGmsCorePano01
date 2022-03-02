package defpackage;

import android.os.Looper;
import android.os.Message;

/* renamed from: igb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class igb extends qvr {
    final /* synthetic */ ige a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public igb(ige ige, Looper looper) {
        super(looper);
        this.a = ige;
    }

    public final void handleMessage(Message message) {
        boolean z = true;
        if (message.what != 1) {
            z = false;
        }
        iva.b(z);
        igd igd = (igd) message.obj;
        Object obj = this.a.a;
        if (obj != null) {
            try {
                igd.a(obj);
            } catch (RuntimeException e) {
                igd.a();
                throw e;
            }
        } else {
            igd.a();
        }
    }
}
