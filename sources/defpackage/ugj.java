package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnConnectionResponseParams;

/* renamed from: ugj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ugj extends bhw implements ugk {
    final /* synthetic */ ugr a;

    public ugj() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
    }

    public final void a(OnConnectionResponseParams onConnectionResponseParams) {
        ugr ugr = this.a;
        String str = onConnectionResponseParams.a;
        int i = onConnectionResponseParams.b;
        byte[] bArr = onConnectionResponseParams.c;
        Parcel aQ = ugr.aQ();
        aQ.writeString(str);
        aQ.writeInt(i);
        aQ.writeByteArray(bArr);
        ugr.b(1006, aQ);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ugj(ugr ugr) {
        super("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
        this.a = ugr;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a((OnConnectionResponseParams) bhx.a(parcel, OnConnectionResponseParams.CREATOR));
        return true;
    }
}
