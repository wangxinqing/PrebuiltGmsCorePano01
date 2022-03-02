package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

/* renamed from: abxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abxj extends bhw implements abxk {
    public final abst a;
    protected final Handler b;

    public abxj() {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceScanListener");
    }

    public final void a(int i) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(2, Integer.valueOf(i)));
    }

    public final void b() {
        this.b.sendEmptyMessage(0);
    }

    public final void a(D2DDevice d2DDevice) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(1, d2DDevice));
    }

    public final void b(D2DDevice d2DDevice) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(3, d2DDevice));
    }

    public abxj(abst abst) {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceScanListener");
        this.b = new abxz(this, Looper.getMainLooper());
        iva.a((Object) abst, (Object) "listener cannot be null.");
        this.a = abst;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((D2DDevice) bhx.a(parcel, D2DDevice.CREATOR));
        } else if (i == 2) {
            b();
        } else if (i == 3) {
            a(parcel.readInt());
        } else if (i != 4) {
            return false;
        } else {
            b((D2DDevice) bhx.a(parcel, D2DDevice.CREATOR));
        }
        return true;
    }
}
