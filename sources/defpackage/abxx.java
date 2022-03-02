package defpackage;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;

/* renamed from: abxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abxx extends qvr {
    final /* synthetic */ abwx a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abxx(abwx abwx, Looper looper) {
        super(looper);
        this.a = abwx;
    }

    public final void handleMessage(Message message) {
        try {
            int i = message.what;
            if (i == 0) {
                ((ackz) ((abza) this.a.a).a).a.b.a((BootstrapProgressResult) message.obj);
            } else if (i == 1) {
                abpu abpu = this.a.a;
                ((abza) abpu).b.g("source-bootstrap-api");
                abpu abpu2 = ((abza) abpu).a;
                ((ackz) abpu2).a.c.a();
                ((ackz) abpu2).a.b.g();
            } else if (i == 2) {
                ((ackz) ((abza) this.a.a).a).a.b.b((String) message.obj);
            } else {
                int i2 = message.what;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unrecognized message: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (RemoteException e) {
            Log.e("SmartDevice", "Error invoking ISourceBootstrapListener.", e);
        }
    }
}
