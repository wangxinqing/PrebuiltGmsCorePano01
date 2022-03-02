package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;

/* renamed from: ugc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ugc extends bhv implements uge {
    public ugc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
    }

    public final void a(OnDisconnectedParams onDisconnectedParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onDisconnectedParams);
        c(3, aQ);
    }

    public final void a(OnPayloadReceivedParams onPayloadReceivedParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onPayloadReceivedParams);
        c(2, aQ);
    }

    public final void a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onPayloadTransferUpdateParams);
        c(4, aQ);
    }
}
