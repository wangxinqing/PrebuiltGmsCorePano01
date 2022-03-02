package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.concurrent.CountDownLatch;

/* renamed from: aegl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aegl implements ServiceConnection {
    final /* synthetic */ aegn a;

    public aegl(aegn aegn) {
        this.a = aegn;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        aehu aehu;
        aehz aehz;
        anil anil = aehd.a;
        aegn aegn = this.a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.bluetooth.fastpair.IFastPairLoggingService");
            aehu = queryLocalInterface instanceof aehu ? (aehu) queryLocalInterface : new aehs(iBinder);
        } else {
            aehu = null;
        }
        aegn.e = aehu;
        aegn aegn2 = this.a;
        if (aegn2.c == null || (aehz = aegn2.d) == null) {
            aegn aegn3 = this.a;
            ((anih) ((anih) aehd.a.c()).a("aegl", "onServiceConnected", 71, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: No extra logging information (%s) or address (%s)", (Object) aegn3.d, (Object) aegn3.c);
        } else {
            try {
                aegn2.e.a(aehz.a(), this.a.c);
            } catch (RemoteException e) {
                anih anih = (anih) aehd.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("aegl", "onServiceConnected", 68, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: Failed to initialize logging service.");
            }
        }
        CountDownLatch countDownLatch = this.a.f;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        anil anil = aehd.a;
    }
}
