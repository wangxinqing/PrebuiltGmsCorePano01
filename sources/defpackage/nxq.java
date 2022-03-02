package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: nxq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nxq extends bhw implements IInterface {
    final /* synthetic */ aabx a;

    public nxq() {
        super("com.google.android.gms.gcm.nts.INetworkTaskCallback");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nxq(aabx aabx) {
        super("com.google.android.gms.gcm.nts.INetworkTaskCallback");
        this.a = aabx;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        this.a.a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
