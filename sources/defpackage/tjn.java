package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResponseParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;

/* renamed from: tjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tjn extends ugg {
    final /* synthetic */ ugu a;
    final /* synthetic */ uge b;
    final /* synthetic */ ugk c;

    public tjn(ugu ugu, uge uge, ugk ugk) {
        this.a = ugu;
        this.b = uge;
        this.c = ugk;
    }

    public final void a(OnBandwidthChangedParams onBandwidthChangedParams) {
    }

    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        super.linkToDeath(deathRecipient, i);
        try {
            this.b.asBinder().linkToDeath(deathRecipient, i);
        } catch (RemoteException e) {
            tky.a(e, "Exception calling linkToDeath on IConnectionEventListener", new Object[0]);
        }
    }

    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        this.b.asBinder().unlinkToDeath(deathRecipient, i);
        return super.unlinkToDeath(deathRecipient, i);
    }

    public final void a(OnConnectionInitiatedParams onConnectionInitiatedParams) {
        ((anih) ((anih) tky.a.d()).a("tjn", "a", 107, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Auto accepting the connection to endpoint %s, because I was the device that initiated it. This is a workaround for legacy clients.", (Object) onConnectionInitiatedParams.a);
        ugu ugu = this.a;
        udp udp = new udp();
        udp.a((uha) new tjm());
        udp.a(onConnectionInitiatedParams.a);
        udp.a(this.b);
        ugu.a(udp.a);
    }

    public final void a(OnConnectionResultParams onConnectionResultParams) {
        ugk ugk = this.c;
        uhp uhp = new uhp();
        String str = onConnectionResultParams.a;
        OnConnectionResponseParams onConnectionResponseParams = uhp.a;
        onConnectionResponseParams.a = str;
        onConnectionResponseParams.b = onConnectionResultParams.b;
        onConnectionResponseParams.c = onConnectionResultParams.c;
        ugk.a(onConnectionResponseParams);
    }

    public final void a(OnDisconnectedParams onDisconnectedParams) {
        this.b.a(onDisconnectedParams);
    }
}
