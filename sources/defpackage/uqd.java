package defpackage;

import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: uqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uqd implements Closeable {
    public static final uqe a = new uqk((byte[]) null, (InputStream) null, (OutputStream) null, (OutputStream) null, (url) null);
    public final Map b = new nz();
    public final BlockingQueue c = new LinkedBlockingQueue();
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final ampk e;
    private final ExecutorService f = tid.b();

    private uqd(BluetoothGattServer bluetoothGattServer, ampk ampk) {
        this.e = ampk;
        ampk.a(aeka.a(bluetoothGattServer), (ampj) new uqb(this));
    }

    public static uqd a(Context context) {
        ampk ampk = new ampk(urm.a, urm.e, urm.f, new aekc());
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            ((anih) ((anih) ulh.a.d()).a("uqd", "a", 67, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleServerSocket failed to retrieve a BluetoothManager for this device.");
            return null;
        }
        BluetoothGattServer openGattServer = bluetoothManager.openGattServer(context, ampk.b);
        if (openGattServer != null) {
            return new uqd(openGattServer, ampk);
        }
        ((anih) ((anih) ulh.a.d()).a("uqd", "a", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleServerSocket failed to open a GATT server for this device.");
        return null;
    }

    public final void close() {
        if (this.d.compareAndSet(false, true)) {
            tid.a(this.f, "BleServerSocket.weaveThreadOffloader");
            this.e.a(false);
            this.c.add(a);
        }
    }

    public final void a(Runnable runnable) {
        this.f.execute(runnable);
    }
}
