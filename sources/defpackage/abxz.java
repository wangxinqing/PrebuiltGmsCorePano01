package defpackage;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: abxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abxz extends qvr {
    final /* synthetic */ abxj a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abxz(abxj abxj, Looper looper) {
        super(looper);
        this.a = abxj;
    }

    public final void handleMessage(Message message) {
        try {
            int i = message.what;
            if (i == 0) {
                this.a.a.a();
            } else if (i == 1) {
                this.a.a.a((D2DDevice) message.obj);
            } else if (i == 2) {
                this.a.a.a(((Integer) message.obj).intValue());
            } else if (i == 3) {
                this.a.a.b((D2DDevice) message.obj);
            } else {
                int i2 = message.what;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unrecognized message: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (RemoteException e) {
            Log.e("SmartDevice", "Error invoking ISourceScanListener.", e);
        }
    }
}
