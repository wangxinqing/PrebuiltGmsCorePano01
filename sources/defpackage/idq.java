package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: idq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class idq extends qvr {
    public idq() {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            icm icm = (icm) pair.first;
            icl icl = (icl) pair.second;
            try {
                icm.a(icl);
            } catch (RuntimeException e) {
                BasePendingResult.b(icl);
                throw e;
            }
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i2);
            Log.wtf("BasePendingResult", sb.toString(), new Exception());
        } else {
            ((BasePendingResult) message.obj).c(Status.d);
        }
    }

    public final void a(icm icm, icl icl) {
        sendMessage(obtainMessage(1, new Pair(BasePendingResult.b(icm), icl)));
    }

    public idq(Looper looper) {
        super(looper);
    }
}
