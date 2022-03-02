package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: aryy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aryy implements ServiceConnection {
    final /* synthetic */ aosh a;

    public aryy(aosh aosh) {
        this.a = aosh;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.b((Object) iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
