package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

/* renamed from: tjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tjr extends ugm {
    final /* synthetic */ ugr a;

    public tjr(ugr ugr) {
        this.a = ugr;
    }

    public final void a(OnEndpointFoundParams onEndpointFoundParams) {
        ugr ugr = this.a;
        String str = onEndpointFoundParams.a;
        String str2 = onEndpointFoundParams.b;
        String str3 = onEndpointFoundParams.c;
        Parcel aQ = ugr.aQ();
        aQ.writeString(str);
        aQ.writeString((String) null);
        aQ.writeString(str2);
        aQ.writeString(str3);
        ugr.b(1002, aQ);
    }

    public final void a(OnStoppedDiscoveryParams onStoppedDiscoveryParams) {
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

    public final void a(OnEndpointLostParams onEndpointLostParams) {
        ugr ugr = this.a;
        String str = onEndpointLostParams.a;
        Parcel aQ = ugr.aQ();
        aQ.writeString(str);
        ugr.b(1003, aQ);
    }
}
