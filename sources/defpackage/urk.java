package defpackage;

import android.bluetooth.BluetoothSocket;
import android.content.Context;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: urk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class urk {
    protected final String a;
    public final CountDownLatch b = new CountDownLatch(1);
    public final url c;
    public final ExecutorService d = tid.b();
    public final ExecutorService e = tid.b();
    public amog f;
    public amoq g;
    public upm h;
    public final BluetoothSocket i;
    public final int j;
    private final Context k;

    public urk(Context context, String str, amog amog, BluetoothSocket bluetoothSocket, url url, int i2) {
        this.k = context;
        this.a = str;
        this.f = amog;
        this.i = bluetoothSocket;
        this.c = url;
        this.j = i2;
        if (amog instanceof ampi) {
            this.g = new ampq(amog, new urj(this));
        }
        if (this.f instanceof amoz) {
            this.g = new ampo(amog, new urj(this));
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void a(InputStream inputStream) {
        this.e.execute(new ure(this, inputStream));
    }

    /* access modifiers changed from: protected */
    public abstract void a(upu upu);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(InputStream inputStream) {
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream));
            while (true) {
                int readInt = dataInputStream.readInt();
                int i2 = upu.d;
                if (readInt > 3) {
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr);
                    b(bArr);
                } else {
                    ((anih) ((anih) ulh.a.c()).a("urk", "b", 421, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PhysicalBleSocket get invalid BlePacket length(%s) from %s", readInt, (Object) this.a);
                    this.c.a();
                    return;
                }
            }
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("urk", "b", 434, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PhysicalBleSocket failed to read BlePacket from %s on L2CAP", (Object) this.a);
            this.c.a();
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(upu upu);

    /* access modifiers changed from: protected */
    public final boolean c() {
        BluetoothSocket bluetoothSocket = this.i;
        if (bluetoothSocket != null) {
            try {
                a(bluetoothSocket.getInputStream());
                return true;
            } catch (IOException e2) {
                return false;
            }
        } else if (this.g != null) {
            return d();
        } else {
            return false;
        }
    }

    public final boolean d() {
        try {
            if (this.b.await(aymi.i(), TimeUnit.MILLISECONDS)) {
                return true;
            }
            ((anih) ((anih) ulh.a.c()).a("urk", "d", 199, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PhysicalBleSocket failed to initialize Weave protocol with %s because it never received a connection callback", (Object) this.a);
            return false;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.c()).a("urk", "d", 207, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PhysicalBleSocket failed to initialize Weave protocol with %s because it was interrupted while waiting for connection establishment", (Object) this.a);
            return false;
        }
    }

    public final amog e() {
        try {
            return (amog) new ampb(this.k, new urf(), urm.a, urm.c, urm.d, (int) aymi.e()).a(this.a).get(aymi.i(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            anih anih = (anih) ulh.a.c();
            anih.a(e2);
            ((anih) anih.a("urk", "e", 243, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PhysicalBleSocket failed to establish a GATT connection to server %s.", (Object) this.a);
            return null;
        }
    }

    public final void a(Runnable runnable) {
        this.d.execute(runnable);
    }

    public final void b(byte[] bArr) {
        upu a2 = upu.a(bArr);
        if (a2 == null) {
            ((anih) ((anih) ulh.a.c()).a("urk", "b", 395, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PhysicalBleSocket connected to %s was unable to parse incoming data.", (Object) this.a);
        } else if (b(a2)) {
            a((Runnable) new urd(this, a2));
        } else {
            ((anih) ((anih) ulh.a.b()).a("urk", "b", 404, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("PhysicalBleSocket connected to %s but received unexpected packet with service ID hash %s, data %s", (Object) this.a, (Object) ulu.a(a2.b), (Object) ulu.a(a2.c));
        }
    }
}
