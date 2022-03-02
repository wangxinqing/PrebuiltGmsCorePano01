package defpackage;

import android.os.Binder;
import android.os.Parcel;
import android.os.Process;

/* renamed from: lxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lxj extends Binder {
    private final Binder a;
    private final int b = Process.myUid();

    public lxj(Binder binder) {
        this.a = binder;
        String interfaceDescriptor = binder.getInterfaceDescriptor();
        attachInterface(binder.queryLocalInterface(interfaceDescriptor), interfaceDescriptor);
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (this.b == Binder.getCallingUid()) {
            return this.a.transact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        parcel2.writeException(new SecurityException("Bad uid"));
        return false;
    }
}
