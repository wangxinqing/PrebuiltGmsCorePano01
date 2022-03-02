package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;

/* renamed from: abxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abxa extends bhw implements abxb {
    public final abpw a;
    protected final Handler b;

    public abxa() {
        super("com.google.android.gms.smartdevice.d2d.internal.ISourceConnectionListener");
    }

    public void a(int i) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(3, Integer.valueOf(i)));
    }

    public void b() {
        this.b.sendEmptyMessage(1);
    }

    public abxa(abpw abpw) {
        this();
        this.b = new abxy(this, Looper.getMainLooper());
        iva.a((Object) abpw, (Object) "listener cannot be null.");
        this.a = abpw;
    }

    public void a(BootstrapOptions bootstrapOptions) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(0, bootstrapOptions));
    }

    public void a(VerificationInfo verificationInfo) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(4, verificationInfo));
    }

    public void a(String str) {
        Handler handler = this.b;
        handler.sendMessage(handler.obtainMessage(2, str));
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((BootstrapOptions) bhx.a(parcel, BootstrapOptions.CREATOR));
        } else if (i == 2) {
            b();
        } else if (i == 3) {
            a(parcel.readString());
        } else if (i == 4) {
            a(parcel.readInt());
        } else if (i != 5) {
            return false;
        } else {
            a((VerificationInfo) bhx.a(parcel, VerificationInfo.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
