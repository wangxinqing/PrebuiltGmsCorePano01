package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;

/* renamed from: abwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abwx extends bhw implements abwy {
    public final abpu a;
    protected final Handler b;

    public abwx() {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceBootstrapListener");
    }

    public final void a(BootstrapProgressResult bootstrapProgressResult) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(0, bootstrapProgressResult));
    }

    public final void b() {
        this.b.sendEmptyMessage(1);
    }

    public final void a(String str) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(2, str));
    }

    public abwx(abpu abpu) {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceBootstrapListener");
        this.b = new abxx(this, Looper.getMainLooper());
        iva.a((Object) abpu, (Object) "listener cannot be null.");
        this.a = abpu;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((BootstrapProgressResult) bhx.a(parcel, BootstrapProgressResult.CREATOR));
        } else if (i == 2) {
            b();
        } else if (i != 3) {
            return false;
        } else {
            a(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
