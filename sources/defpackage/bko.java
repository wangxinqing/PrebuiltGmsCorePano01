package defpackage;

import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;
import java.io.Closeable;

/* renamed from: bko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bko extends Binder implements Closeable {
    private volatile Binder a;

    public bko(Binder binder, String str) {
        this.a = binder;
        attachInterface(binder.queryLocalInterface(str), str);
    }

    public final void close() {
        this.a = null;
        attachInterface((IInterface) null, "");
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Binder binder = this.a;
        if (binder != null) {
            return binder.transact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        parcel2.writeException(new IllegalStateException("IBinder used after unbindService"));
        return false;
    }
}
