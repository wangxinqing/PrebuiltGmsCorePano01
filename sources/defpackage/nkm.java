package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: nkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nkm implements ServiceConnection {
    private final ServiceConnection a;
    private final jff b;
    private jff c;

    public nkm(ServiceConnection serviceConnection, jff jff, jff jff2) {
        this.a = serviceConnection;
        this.c = jff;
        this.b = jff2;
    }

    public final void onNullBinding(ComponentName componentName) {
        amky amky;
        jff jff = this.c;
        if (jff != null) {
            amky = jff.b();
        } else {
            amky = null;
        }
        try {
            this.c = null;
            this.a.onNullBinding(componentName);
            if (amky != null) {
                amky.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        amky amky;
        jff jff = this.c;
        if (jff != null) {
            amky = jff.b();
        } else {
            amky = null;
        }
        try {
            this.c = null;
            this.a.onServiceConnected(componentName, iBinder);
            if (amky != null) {
                amky.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.c = null;
        amky b2 = this.b.b();
        try {
            this.a.onServiceDisconnected(componentName);
            b2.close();
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
