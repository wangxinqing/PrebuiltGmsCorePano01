package defpackage;

import android.bluetooth.BluetoothSocket;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: tyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tyn implements Runnable {
    private final tyt a;

    public tyn(tyt tyt) {
        this.a = tyt;
    }

    public final void run() {
        tyt tyt = this.a;
        BluetoothSocket bluetoothSocket = tyt.d;
        try {
            if (aymw.j()) {
                tyt.b(bluetoothSocket);
            }
            DataInputStream dataInputStream = new DataInputStream(bluetoothSocket.getInputStream());
            byte[] bArr = new byte[65536];
            ((anih) tsp.a.d()).a("RfcommEventStreamMedium: [%s] Start read loop", (Object) tyt.c);
            while (bluetoothSocket.isConnected()) {
                int readUnsignedByte = dataInputStream.readUnsignedByte();
                int readUnsignedByte2 = dataInputStream.readUnsignedByte();
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                int i = 0;
                while (i < readUnsignedShort) {
                    i += dataInputStream.read(bArr, i, readUnsignedShort - i);
                }
                ((anih) tsp.a.d()).a("RfcommEventStreamMedium: [%s] Received EventGroup=%d, EventCode=%d, AdditionalDataLength=%d, BytesRead=%d", tyt.c, Integer.valueOf(readUnsignedByte), Integer.valueOf(readUnsignedByte2), Integer.valueOf(readUnsignedShort), Integer.valueOf(i));
                tyt.a((of) new typ(tyt, readUnsignedByte, readUnsignedByte2, Arrays.copyOf(bArr, readUnsignedShort)));
            }
        } catch (IOException e) {
            if (aymz.b()) {
                ((anih) tsp.a.c()).a("RfcommEventStreamMedium: [%s] Failed to read from socket. Retry times remaining %s", (Object) tyt.c, (Object) tyt.e);
            } else {
                anih anih = (anih) tsp.a.b();
                anih.a((Throwable) e);
                anih.a("RfcommEventStreamMedium: [%s] Failed to read from socket. Retry times remaining %s", (Object) tyt.c, (Object) tyt.e);
            }
            if (tyt.e.get() > 0) {
                tyg tyg = new tyg(tyt);
                aosr.a(TimeUnit.SECONDS.toMillis(aymt.a.a().aP()) * ((long) Math.pow(2.0d, (double) ((aymt.v() - ((long) tyt.e.decrementAndGet())) - 1))), TimeUnit.MILLISECONDS);
                tyt.a((Runnable) tyg);
                return;
            }
            tyt.a((Runnable) new tyh(tyt, bluetoothSocket));
        }
    }
}
