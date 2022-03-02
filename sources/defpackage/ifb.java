package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: ifb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ifb extends qvr {
    final /* synthetic */ ifc a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ifb(ifc ifc, Looper looper) {
        super(looper);
        this.a = ifc;
    }

    public final void handleMessage(Message message) {
        Lock lock;
        int i = message.what;
        if (i == 1) {
            ifa ifa = (ifa) message.obj;
            ifc ifc = this.a;
            ifc.a.lock();
            try {
                if (ifc.j != ifa.c) {
                    lock = ifc.a;
                } else {
                    ifa.a();
                    lock = ifc.a;
                }
                lock.unlock();
            } catch (Throwable th) {
                ifc.a.unlock();
                throw th;
            }
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
