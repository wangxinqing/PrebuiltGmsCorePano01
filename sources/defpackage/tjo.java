package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;

/* renamed from: tjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tjo extends ugw {
    final /* synthetic */ uge a;

    public tjo(uge uge) {
        this.a = uge;
    }

    public final void a(OnPayloadReceivedParams onPayloadReceivedParams) {
        this.a.a(onPayloadReceivedParams);
    }

    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        super.linkToDeath(deathRecipient, i);
        try {
            this.a.asBinder().linkToDeath(deathRecipient, i);
        } catch (RemoteException e) {
            tky.a(e, "Exception calling linkToDeath on IConnectionEventListener", new Object[0]);
        }
    }

    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        this.a.asBinder().unlinkToDeath(deathRecipient, i);
        return super.unlinkToDeath(deathRecipient, i);
    }

    public final void a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams) {
        this.a.a(onPayloadTransferUpdateParams);
    }
}
