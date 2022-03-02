package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

/* renamed from: tjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tjl extends ugp {
    final /* synthetic */ ugn a;

    public tjl(ugn ugn) {
        this.a = ugn;
    }

    public final void a(OnEndpointDistanceChangedParams onEndpointDistanceChangedParams) {
    }

    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        super.linkToDeath(deathRecipient, i);
        try {
            this.a.asBinder().linkToDeath(deathRecipient, i);
        } catch (RemoteException e) {
            tky.a(e, "Exception calling linkToDeath on IDiscoveryCallback", new Object[0]);
        }
    }

    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        this.a.asBinder().unlinkToDeath(deathRecipient, i);
        return super.unlinkToDeath(deathRecipient, i);
    }

    public final void a(OnEndpointFoundParams onEndpointFoundParams) {
        this.a.a(onEndpointFoundParams);
    }

    public final void a(OnEndpointLostParams onEndpointLostParams) {
        this.a.a(onEndpointLostParams);
    }

    public final void a(OnStoppedDiscoveryParams onStoppedDiscoveryParams) {
        this.a.a(onStoppedDiscoveryParams);
    }
}
