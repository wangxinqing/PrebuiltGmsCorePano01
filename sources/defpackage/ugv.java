package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;

/* renamed from: ugv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ugv extends bhv implements ugx {
    public ugv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IPayloadListener");
    }

    public final void a(OnPayloadReceivedParams onPayloadReceivedParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onPayloadReceivedParams);
        c(2, aQ);
    }

    public final void a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onPayloadTransferUpdateParams);
        c(3, aQ);
    }
}
