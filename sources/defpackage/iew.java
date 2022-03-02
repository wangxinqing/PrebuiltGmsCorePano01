package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: iew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iew extends qvr {
    final /* synthetic */ iey a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iew(iey iey, Looper looper) {
        super(looper);
        this.a = iey;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            iey iey = this.a;
            int i2 = iey.n;
            iey.b.lock();
            try {
                if (iey.m()) {
                    iey.k();
                }
            } finally {
                iey.b.unlock();
            }
        } else if (i != 2) {
            int i3 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i3);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            iey iey2 = this.a;
            int i4 = iey.n;
            iey2.l();
        }
    }
}
