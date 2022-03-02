package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: tzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tzv extends qvy {
    final /* synthetic */ aosh a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tzv(String str, aosh aosh) {
        super(str);
        this.a = aosh;
    }

    public final void a(ComponentName componentName) {
        ((anih) tsp.a.d()).a("FastPair: Device detail service disconnected with DiscoveryService");
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        Object obj;
        ((anih) tsp.a.d()).a("FastPair: Device detail service connected with DiscoveryService");
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.common.fastpair.IDeviceStatusService");
            obj = queryLocalInterface instanceof arxw ? (arxw) queryLocalInterface : new arxu(iBinder);
        } else {
            obj = null;
        }
        this.a.b(obj);
    }
}
