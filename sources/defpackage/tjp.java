package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnConnectionRequestParams;

/* renamed from: tjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tjp extends uga {
    final /* synthetic */ ugr a;

    public tjp(ugr ugr) {
        this.a = ugr;
    }

    public final void a(OnConnectionRequestParams onConnectionRequestParams) {
        ugr ugr = this.a;
        String str = onConnectionRequestParams.a;
        String str2 = onConnectionRequestParams.b;
        byte[] bArr = onConnectionRequestParams.c;
        Parcel aQ = ugr.aQ();
        aQ.writeString(str);
        aQ.writeString((String) null);
        aQ.writeString(str2);
        aQ.writeByteArray(bArr);
        ugr.b(1001, aQ);
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
}
