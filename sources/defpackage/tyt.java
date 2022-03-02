package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tyt implements tyb {
    public final ExecutorService a = jfm.b(10);
    public final Context b;
    public final BluetoothDevice c;
    public BluetoothSocket d;
    public final AtomicInteger e = new AtomicInteger(0);
    public boolean f = false;
    private final ExecutorService g = jfm.b(10);
    private final ExecutorService h = jfm.b(10);
    private final AtomicReference i = new AtomicReference();
    private tys j = tys.DISCONNECTED;
    private final amrm k;

    public tyt(Context context, BluetoothDevice bluetoothDevice, amrm amrm) {
        this.b = context;
        this.c = bluetoothDevice;
        this.k = amrm;
    }

    private final void a(tys tys) {
        if (!this.j.equals(tys)) {
            this.j = tys;
            ((anih) tsp.a.d()).a("RfcommEventStreamMedium: [%s] Change to %s", (Object) this.c, (Object) tys);
        }
    }

    public final void b(BluetoothSocket bluetoothSocket) {
        ((anih) tsp.a.d()).a("RfcommEventStreamMedium: [%s] Cancel device discovery.", (Object) this.c);
        BluetoothAdapter.getDefaultAdapter().cancelDiscovery();
        try {
            bluetoothSocket.connect();
            ((anih) tsp.a.d()).a("RfcommEventStreamMedium: [%s] Connect rfcomm channel.", (Object) this.c);
            this.e.set((int) aymt.v());
            a((of) new tyq(this));
        } catch (NullPointerException e2) {
            throw new IOException(e2);
        }
    }

    public final boolean c() {
        boolean a2 = this.k.a(this.c);
        if (a2 && !this.f) {
            a(tys.CONNECTED);
            a(this.d);
            try {
                this.d = this.c.createRfcommSocketToServiceRecord(UUID.fromString(aymt.a.a().Q()));
                if (!aymw.j()) {
                    try {
                        b(this.d);
                    } catch (IOException e2) {
                        anih anih = (anih) tsp.a.d();
                        anih.a((Throwable) e2);
                        anih.a("RfcommEventStreamMedium: [%s] Failed to connect the socket", (Object) this.c);
                        a(this.d);
                        e();
                        return false;
                    }
                }
                this.h.execute(new tyn(this));
                return true;
            } catch (IOException e3) {
                ((anih) tsp.a.d()).a("RfcommEventStreamMedium: [%s] Failed to create the socket", (Object) this.c);
                e();
                return false;
            }
        } else {
            ((anih) tsp.a.d()).a("RfcommEventStreamMedium: [%s] Skip connect, isProfileConnected=%b, isDisconnectRequested=%b", (Object) this.c, (Object) Boolean.valueOf(a2), (Object) Boolean.valueOf(this.f));
            e();
            return false;
        }
    }

    public final boolean d() {
        return !this.f && this.j.equals(tys.CONNECTED);
    }

    public final void e() {
        a((of) new tyr(this));
        b((txz) null);
        a(tys.DISCONNECTED);
    }

    public final void a() {
        ((anih) tsp.a.d()).a("RfcommEventStreamMedium: [%s] Disconnect is requested", (Object) this.c);
        a((Runnable) new tyj(this));
    }

    public final void a(int i2, int i3, byte[] bArr) {
        a((Runnable) new tym(this, i2, i3, bArr));
    }

    public final void a(BluetoothSocket bluetoothSocket) {
        if (bluetoothSocket != null) {
            try {
                bluetoothSocket.close();
                ((anih) tsp.a.d()).a("RfcommEventStreamMedium: [%s] Close socket done", (Object) this.c);
            } catch (IOException e2) {
                anih anih = (anih) tsp.a.c();
                anih.a((Throwable) e2);
                anih.a("RfcommEventStreamMedium: [%s] Failed to close the socket", (Object) this.c);
            }
        }
    }

    public final void a(Runnable runnable) {
        this.g.execute(runnable);
    }

    public final void b(txz txz) {
        this.i.set(txz);
    }

    public final void a(of ofVar) {
        txz txz = (txz) this.i.get();
        if (txz != null) {
            ofVar.a(txz);
        }
    }

    public final boolean b() {
        return a(new tyl(this), "isConnected");
    }

    public final void a(txz txz) {
        ((anih) tsp.a.d()).a("RfcommEventStreamMedium: [%s] Event stream listener is set", (Object) this.c);
        a((Runnable) new tyk(this, txz));
    }

    public final boolean a(amsv amsv, String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        a((Runnable) new tyo(atomicBoolean, amsv, countDownLatch));
        try {
            countDownLatch.await();
            return atomicBoolean.get();
        } catch (InterruptedException e2) {
            anih anih = (anih) tsp.a.c();
            anih.a((Throwable) e2);
            anih.a("RfcommEventStreamMedium: [%s] Failed to wait for %s", (Object) this.c, (Object) str);
            return false;
        }
    }
}
