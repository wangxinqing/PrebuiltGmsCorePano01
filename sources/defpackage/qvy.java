package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: qvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class qvy implements ServiceConnection {
    private final qvs a;

    public qvy(String str) {
        this.a = qvu.d.a(getClass(), 12, str, "ServiceConnection");
    }

    public abstract void a(ComponentName componentName);

    public abstract void a(ComponentName componentName, IBinder iBinder);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        amky a2 = this.a.a(componentName, "onServiceConnected");
        try {
            a(componentName, iBinder);
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        amky a2 = this.a.a(componentName, "onServiceDisconnected");
        try {
            a(componentName);
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
