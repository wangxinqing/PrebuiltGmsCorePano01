package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;

/* renamed from: itd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class itd implements ServiceConnection {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final itb e;
    public ComponentName f;
    final /* synthetic */ itc g;

    public itd(itc itc, itb itb) {
        this.g = itc;
        this.e = itb;
    }

    public final void a(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        itc itc = this.g;
        jca jca = itc.d;
        Context context = itc.b;
        Intent a2 = this.e.a(context);
        int i = jca.b;
        jca.a(context, jca.a(serviceConnection), str, a2, 3);
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.a) {
            this.g.c.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection onServiceConnected : this.a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.a) {
            this.g.c.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection onServiceDisconnected : this.a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }

    public final void a(String str) {
        this.b = 3;
        itc itc = this.g;
        jca jca = itc.d;
        Context context = itc.b;
        boolean a2 = jca.a(context, str, this.e.a(context), (ServiceConnection) this, this.e.c);
        this.c = a2;
        if (a2) {
            Message obtainMessage = this.g.c.obtainMessage(1, this.e);
            itc itc2 = this.g;
            itc2.c.sendMessageDelayed(obtainMessage, itc2.e);
            return;
        }
        this.b = 2;
        try {
            itc itc3 = this.g;
            itc3.d.a(itc3.b, (ServiceConnection) this);
        } catch (IllegalArgumentException e2) {
        }
    }

    public final boolean a() {
        return this.a.isEmpty();
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }
}
