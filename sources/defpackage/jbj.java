package defpackage;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.Service;

/* renamed from: jbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jbj {
    public int a;
    public final Object b = new Object();
    public Intent c;
    public final Service d;
    public final amth e;

    public jbj(Service service) {
        amtm a2 = amtm.a();
        a2.a(4);
        a2.e();
        this.e = a2.d();
        this.d = service;
    }

    public final void a() {
        synchronized (this.b) {
            int i = this.a;
            if (i > 0) {
                int i2 = i - 1;
                this.a = i2;
                if (i2 == 0) {
                    for (jbi b2 : ((amuo) this.e).a.keySet()) {
                        try {
                            b2.b();
                        } catch (RuntimeException e2) {
                            Log.e("LifecycleSync", "Failed to execute a callback", e2);
                        }
                    }
                    this.d.stopSelf();
                }
            }
        }
    }
}
