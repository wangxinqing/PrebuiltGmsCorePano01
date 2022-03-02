package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;

/* renamed from: ugw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ugw extends bhw implements ugx {
    public ugw() {
        super("com.google.android.gms.nearby.internal.connection.IPayloadListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            a((OnPayloadReceivedParams) bhx.a(parcel, OnPayloadReceivedParams.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            a((OnPayloadTransferUpdateParams) bhx.a(parcel, OnPayloadTransferUpdateParams.CREATOR));
            return true;
        }
    }
}
