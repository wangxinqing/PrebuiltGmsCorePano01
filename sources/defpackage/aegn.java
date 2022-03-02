package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.libraries.bluetooth.fastpair.Event;
import java.util.ArrayDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: aegn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aegn {
    public Short a;
    public BluetoothDevice b;
    public String c;
    public aehz d;
    public aehu e;
    public CountDownLatch f;
    private final ArrayDeque g;
    private final ServiceConnection h = new aegl(this);
    private final tue i;

    public aegn(tue tue) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = tue;
        arrayDeque.push(new aegm(aspb.UNKNOWN_EVENT_TYPE));
    }

    private final aegk d() {
        aegm aegm = (aegm) this.g.pop();
        aegk f2 = Event.f();
        f2.a(aegm.a);
        f2.a(aegm.b);
        Short sh = this.a;
        if (sh != null) {
            f2.a = sh;
        }
        BluetoothDevice bluetoothDevice = this.b;
        if (bluetoothDevice != null) {
            f2.b = bluetoothDevice;
        }
        if (this.g.isEmpty()) {
            this.g.push(new aegm(aspb.UNKNOWN_EVENT_TYPE));
        }
        return f2;
    }

    /* access modifiers changed from: package-private */
    public final void a(Context context) {
        context.unbindService(this.h);
        this.e = null;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.e != null;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        Event a2 = d().a();
        tue tue = this.i;
        if (tue != null) {
            tue.a(a2);
        }
        aehu aehu = this.e;
        if (aehu != null) {
            try {
                aehu.a(a2);
            } catch (RemoteException e2) {
                anih anih = (anih) aehd.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("aegn", "b", 158, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: Failed to send succeeded event.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        aegm aegm = (aegm) this.g.peek();
        return (aegm == null || aegm.a == aspb.UNKNOWN_EVENT_TYPE) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final void a(Context context, String str, aehz aehz) {
        if (!a()) {
            this.c = str;
            this.d = aehz;
            this.f = new CountDownLatch(1);
            anil anil = aehd.a;
            Intent intent = new Intent("com.google.android.gms.nearby.discovery.fastpair.ACTION_LOGGING");
            intent.setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsBoundBrokerService");
            try {
                if (context.bindService(intent, this.h, 1)) {
                    this.f.await(500, TimeUnit.MILLISECONDS);
                }
            } catch (SecurityException e2) {
                anih anih = (anih) aehd.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("aegn", "a", 111, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: Failed binding to logging service.");
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                anih anih2 = (anih) aehd.a.c();
                anih2.a((Throwable) e3);
                ((anih) anih2.a("aegn", "a", 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: Interrupted while binding to logging.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(aspb aspb) {
        this.g.push(new aegm(aspb));
    }

    /* access modifiers changed from: package-private */
    public final void a(Exception exc) {
        aegk d2 = d();
        d2.c = exc;
        Event a2 = d2.a();
        tue tue = this.i;
        if (tue != null) {
            tue.a(a2, exc);
        }
        aehu aehu = this.e;
        if (aehu != null) {
            try {
                aehu.b(a2);
            } catch (RemoteException e2) {
                anih anih = (anih) aehd.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("aegn", "a", 144, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: Failed to send failed event.");
            }
        }
    }
}
