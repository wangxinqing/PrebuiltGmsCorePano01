package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* renamed from: qdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class qdb extends Service {
    private Binder a;

    public qdb() {
        qvh qvh = qvj.b;
        jlt jlt = new jlt("EnhancedIntentService");
        int i = qvp.a;
        qvh.a(jlt);
        new Object();
    }

    public abstract void handleIntent(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (this.a == null) {
            this.a = new qda();
        }
        return this.a;
    }

    public final void onDestroy() {
        throw null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        throw null;
    }
}
