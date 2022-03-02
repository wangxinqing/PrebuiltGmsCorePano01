package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;

/* renamed from: ugd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ugd extends bhw implements uge {
    public ugd() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            a((OnPayloadReceivedParams) bhx.a(parcel, OnPayloadReceivedParams.CREATOR));
            return true;
        } else if (i == 3) {
            a((OnDisconnectedParams) bhx.a(parcel, OnDisconnectedParams.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            OnPayloadTransferUpdateParams onPayloadTransferUpdateParams = (OnPayloadTransferUpdateParams) bhx.a(parcel, OnPayloadTransferUpdateParams.CREATOR);
            return true;
        }
    }
}
