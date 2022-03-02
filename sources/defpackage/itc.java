package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import java.util.HashMap;

/* renamed from: itc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class itc {
    private static final Object f = new Object();
    private static itc g;
    public final HashMap a;
    public final Context b;
    public final Handler c;
    public final jca d;
    public final long e;
    private final long h;

    public itc() {
    }

    public static itc a(Context context) {
        synchronized (f) {
            if (g == null) {
                g = new itc(context.getApplicationContext());
            }
        }
        return g;
    }

    public itc(Context context) {
        this.a = new HashMap();
        this.b = context.getApplicationContext();
        this.c = new qvr(context.getMainLooper(), new ite(this));
        this.d = jca.a();
        this.h = 5000;
        this.e = 300000;
    }

    public final void a(ComponentName componentName, ServiceConnection serviceConnection) {
        a(new itb(componentName), serviceConnection);
    }

    /* access modifiers changed from: protected */
    public final void a(itb itb, ServiceConnection serviceConnection) {
        iva.a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            itd itd = (itd) this.a.get(itb);
            if (itd == null) {
                String valueOf = String.valueOf(itb);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (itd.a(serviceConnection)) {
                itc itc = itd.g;
                jca jca = itc.d;
                Context context = itc.b;
                int i = jca.b;
                jca.a(context, jca.a(serviceConnection), (String) null, (Intent) null, 4);
                itd.a.remove(serviceConnection);
                if (itd.a()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, itb), this.h);
                }
            } else {
                String valueOf2 = String.valueOf(itb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final void a(String str, ServiceConnection serviceConnection) {
        a(new itb(str), serviceConnection);
    }

    public final void a(String str, String str2, ServiceConnection serviceConnection, boolean z) {
        a(new itb(str, str2, z), serviceConnection);
    }

    public final boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return a(new itb(componentName), serviceConnection, str);
    }

    /* access modifiers changed from: protected */
    public final boolean a(itb itb, ServiceConnection serviceConnection, String str) {
        boolean z;
        iva.a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        ServiceConnection a2 = itf.a(serviceConnection);
        synchronized (this.a) {
            itd itd = (itd) this.a.get(itb);
            if (itd == null) {
                itd = new itd(this, itb);
                itd.a(serviceConnection, a2, str);
                itd.a(str);
                this.a.put(itb, itd);
            } else {
                this.c.removeMessages(0, itb);
                if (!itd.a(serviceConnection)) {
                    itd.a(serviceConnection, a2, str);
                    int i = itd.b;
                    if (i == 1) {
                        a2.onServiceConnected(itd.f, itd.d);
                    } else if (i == 2) {
                        itd.a(str);
                    }
                } else {
                    String valueOf = String.valueOf(itb);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = itd.c;
        }
        return z;
    }

    public final boolean a(String str, ServiceConnection serviceConnection, String str2) {
        return a(new itb(str), serviceConnection, str2);
    }
}
