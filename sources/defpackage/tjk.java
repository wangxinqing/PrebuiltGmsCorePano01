package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: tjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tjk extends ugd {
    final /* synthetic */ ugr a;

    public tjk(ugr ugr) {
        this.a = ugr;
    }

    public final void a(OnDisconnectedParams onDisconnectedParams) {
        ugr ugr = this.a;
        String str = onDisconnectedParams.a;
        Parcel aQ = ugr.aQ();
        aQ.writeString(str);
        ugr.b(1008, aQ);
    }

    public final void a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams) {
    }

    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        super.linkToDeath(deathRecipient, i);
        try {
            this.a.a.linkToDeath(deathRecipient, i);
        } catch (RemoteException e) {
            tky.a(e, "Exception calling linkToDeath on INearbyConnectionCallbacks", new Object[0]);
        }
    }

    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        this.a.a.unlinkToDeath(deathRecipient, i);
        return super.unlinkToDeath(deathRecipient, i);
    }

    public final void a(OnPayloadReceivedParams onPayloadReceivedParams) {
        ParcelablePayload parcelablePayload = onPayloadReceivedParams.b;
        if (parcelablePayload.b == 1) {
            ugr ugr = this.a;
            String str = onPayloadReceivedParams.a;
            byte[] bArr = parcelablePayload.c;
            boolean z = onPayloadReceivedParams.c;
            Parcel aQ = ugr.aQ();
            aQ.writeString(str);
            aQ.writeByteArray(bArr);
            bhx.a(aQ, z);
            ugr.b(1007, aQ);
        }
    }
}
