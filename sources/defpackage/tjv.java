package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;

/* renamed from: tjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tjv extends ugg {
    public uge a;
    public uha b;
    private final ugb c;

    public tjv(ugb ugb) {
        this.c = ugb;
    }

    public final void a(OnBandwidthChangedParams onBandwidthChangedParams) {
    }

    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        super.linkToDeath(deathRecipient, i);
        uge uge = this.a;
        if (uge != null) {
            try {
                uge.asBinder().linkToDeath(deathRecipient, i);
            } catch (RemoteException e) {
                tky.a(e, "Exception calling linkToDeath on IConnectionEventListener", new Object[0]);
            }
        }
    }

    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        uge uge = this.a;
        if (uge != null) {
            uge.asBinder().unlinkToDeath(deathRecipient, i);
        }
        return super.unlinkToDeath(deathRecipient, i);
    }

    public final void a(OnConnectionInitiatedParams onConnectionInitiatedParams) {
        ugb ugb = this.c;
        uhn uhn = new uhn();
        String str = onConnectionInitiatedParams.a;
        OnConnectionRequestParams onConnectionRequestParams = uhn.a;
        onConnectionRequestParams.a = str;
        onConnectionRequestParams.b = onConnectionInitiatedParams.b;
        onConnectionRequestParams.c = onConnectionInitiatedParams.e;
        ugb.a(onConnectionRequestParams);
    }

    public final void a(OnConnectionResultParams onConnectionResultParams) {
        if (onConnectionResultParams.b != 0) {
            ((anih) ((anih) tky.a.d()).a("tjv", "a", 447, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ApiCompat.AdvertiserConnectionLifecycleListener has rewritten the connection result to endpoint %s from %d to %d so that legacy clients will understand it.", (Object) onConnectionResultParams.a, (Object) Integer.valueOf(onConnectionResultParams.b), (Object) 13);
            this.b.a(13);
            return;
        }
        this.b.a(0);
    }

    public final void a(OnDisconnectedParams onDisconnectedParams) {
        uge uge = this.a;
        if (uge == null) {
            ((anih) ((anih) tky.a.c()).a("tjv", "a", 465, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("AdvertiserConnectionLifecycleListener.onDisconnected was called for endpoint %s, but a ConnectionEventListener has not been set yet.", (Object) onDisconnectedParams.a);
        } else {
            uge.a(onDisconnectedParams);
        }
    }
}
