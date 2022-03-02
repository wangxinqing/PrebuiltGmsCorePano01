package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: opj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class opj implements ServiceConnection {
    final /* synthetic */ opk a;

    public opj(opk opk) {
        this.a = opk;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        opo opo;
        opk opk = this.a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.http.IGoogleHttpService");
            opo = queryLocalInterface instanceof opo ? (opo) queryLocalInterface : new opm(iBinder);
        } else {
            opo = null;
        }
        opk.a = opo;
        this.a.b.countDown();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
