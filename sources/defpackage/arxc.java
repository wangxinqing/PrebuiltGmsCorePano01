package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: arxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arxc implements ServiceConnection {
    final /* synthetic */ arxe a;

    public arxc(arxe arxe) {
        this.a = arxe;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        arxz arxz;
        arxe arxe = this.a;
        if (arxe.c != null) {
            if (iBinder != null) {
                try {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.common.fastpair.IDiscoveryService");
                    arxz = !(queryLocalInterface instanceof arxz) ? new arxx(iBinder) : (arxz) queryLocalInterface;
                } catch (RemoteException e) {
                    anih anih = (anih) aryq.a.b();
                    anih.a((Throwable) e);
                    ((anih) anih.a("arxc", "onServiceConnected", 64, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DevicesListFragment failed to register with Service");
                    return;
                }
            } else {
                arxz = null;
            }
            arxe.a = arxz;
            arxe arxe2 = this.a;
            arxe2.a.a(arxe2.c);
            Context context = this.a.b;
            context.startService(arza.b(context).setAction("com.google.android.gms.nearby.discovery.ACTION_LIST_ACTIVITY_REQUEST_DATA"));
            return;
        }
        ((anih) ((anih) aryq.a.b()).a("arxc", "onServiceConnected", 53, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring onServiceConnected because we have no serviceCallback");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        try {
            arxe arxe = this.a;
            arxe.a.b(arxe.c);
        } catch (RemoteException e) {
            anih anih = (anih) aryq.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("arxc", "onServiceDisconnected", 82, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DevicesListChimeraActivity failed to unregister from the discovery service");
        }
        this.a.a = null;
    }
}
