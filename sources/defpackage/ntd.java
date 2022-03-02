package defpackage;

import android.os.Parcel;

/* renamed from: ntd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ntd extends bhw implements nte {
    final /* synthetic */ aabx a;

    public ntd() {
        super("com.google.android.gms.gcm.INetworkTaskCallback");
    }

    public final void a(int i) {
        this.a.a(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ntd(aabx aabx) {
        super("com.google.android.gms.gcm.INetworkTaskCallback");
        this.a = aabx;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
