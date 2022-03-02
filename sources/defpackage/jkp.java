package defpackage;

import android.content.pm.PackageManager;
import android.os.Handler;

/* renamed from: jkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jkp extends jkn implements PackageManager.OnPermissionsChangedListener {
    private final PackageManager a;
    private final Object b = new Object();
    private jkm c;
    private Handler d;

    public jkp(PackageManager packageManager) {
        this.a = packageManager;
    }

    public final void a(jkm jkm, Handler handler) {
        synchronized (this.b) {
            if (this.c == null) {
                this.a.addOnPermissionsChangeListener(this);
            }
            this.c = jkm;
            this.d = handler;
        }
    }

    public final boolean a() {
        return true;
    }

    public final void b() {
        synchronized (this.b) {
            if (this.c != null) {
                this.a.removeOnPermissionsChangeListener(this);
                this.c = null;
                this.d = null;
            }
        }
    }

    public final void onPermissionsChanged(int i) {
        jkm jkm;
        Handler handler;
        synchronized (this.b) {
            jkm = this.c;
            handler = this.d;
        }
        if (jkm != null) {
            handler.post(new jko(jkm, i));
        }
    }
}
