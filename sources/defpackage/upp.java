package defpackage;

import android.bluetooth.BluetoothSocket;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: upp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class upp implements Runnable {
    private final upt a;
    private final BluetoothSocket b;

    public upp(upt upt, BluetoothSocket bluetoothSocket) {
        this.a = upt;
        this.b = bluetoothSocket;
    }

    public final void run() {
        DataOutputStream dataOutputStream;
        ukd ukd;
        byte[] bArr;
        upt upt = this.a;
        BluetoothSocket bluetoothSocket = this.b;
        String address = bluetoothSocket.getRemoteDevice().getAddress();
        jjg jjg = ulh.a;
        tfu b2 = tfu.b(new upr(bluetoothSocket), aymi.g(), upt.c);
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(bluetoothSocket.getInputStream()));
            DataOutputStream dataOutputStream2 = new DataOutputStream(new BufferedOutputStream(bluetoothSocket.getOutputStream()));
            while (true) {
                try {
                    int readInt = dataInputStream.readInt();
                    if (upn.a(readInt)) {
                        byte[] bArr2 = new byte[readInt];
                        dataInputStream.readFully(bArr2);
                        upn a2 = upn.a(bArr2);
                        if (a2 != null) {
                            int i = a2.a;
                            if (i != 1) {
                                if (i == 2) {
                                    jjt.a((Closeable) bluetoothSocket);
                                    break;
                                } else if (i == 3) {
                                    if (upt.e.containsKey(address)) {
                                        ((anih) ((anih) ulh.a.b()).a("upt", "a", 181, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Receive duplicate data connection request from remote MAC address %s", (Object) address);
                                        upt.a(dataOutputStream2, upn.c());
                                        upt.b(bluetoothSocket);
                                    } else {
                                        urc a3 = uqq.a(address, bluetoothSocket, new upq(upt, address), upt.h);
                                        if (a3 == null) {
                                            ((anih) ((anih) ulh.a.b()).a("upt", "a", 195, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create MultiplexBleSocket for remote address %s, the reason may be not enable MulitplexBleSocketV2 or failed to read BlePacket.", (Object) address);
                                            upt.a(dataOutputStream2, upn.c());
                                            upt.b(bluetoothSocket);
                                        } else {
                                            upt.a(dataOutputStream2, upn.a(23, (byte[]) null));
                                            upt.e.put(address, a3);
                                        }
                                    }
                                }
                            } else {
                                byte[] bArr3 = a2.b;
                                Iterator it = upt.g.values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        ukd = null;
                                        break;
                                    }
                                    ukd = (ukd) it.next();
                                    if (Arrays.equals(bArr3, upn.b(ukd.a))) {
                                        break;
                                    }
                                }
                                if (ukd != null) {
                                    byte[] bArr4 = ukd.b;
                                    int length = bArr4.length;
                                    if (length < 8) {
                                        ((anih) ((anih) ulh.a.d()).a("upn", "b", 201, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot serialize BleL2capPacket for RESPONSE_ADVERTISEMENT : expected min %d advertisement raw bytes, but got %d", 8, length);
                                        bArr = null;
                                    } else {
                                        bArr = upn.a(21, bArr4);
                                    }
                                    if (bArr == null) {
                                        ((anih) ((anih) ulh.a.b()).a("upt", "a", 148, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("The cached advertisement with invalid format! raw data : %s", (Object) ulu.a(ukd.b));
                                        upt.a(dataOutputStream2, upn.a());
                                    } else {
                                        upt.a(dataOutputStream2, bArr);
                                    }
                                } else {
                                    upt.a(dataOutputStream2, upn.a());
                                }
                            }
                        } else {
                            String valueOf = String.valueOf(ulu.a(bArr2));
                            throw new IOException(valueOf.length() == 0 ? new String("Got invalid BleL2capPacket bytes from server! raw data : ") : "Got invalid BleL2capPacket bytes from server! raw data : ".concat(valueOf));
                        }
                    } else {
                        throw new IOException("Got invalid length of BleL2capPacket from client!");
                    }
                } catch (IOException e) {
                    e = e;
                    dataOutputStream = dataOutputStream2;
                    try {
                        anih anih = (anih) ulh.a.b();
                        anih.a((Throwable) e);
                        ((anih) anih.a("upt", "a", 166, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read/write data from incoming L2CAP socket.");
                        jjt.a((Closeable) bluetoothSocket);
                        jjt.a((Closeable) dataOutputStream);
                        b2.b();
                    } catch (Throwable th) {
                        b2.b();
                        throw th;
                    }
                }
            }
        } catch (IOException e2) {
            e = e2;
            dataOutputStream = null;
            anih anih2 = (anih) ulh.a.b();
            anih2.a((Throwable) e);
            ((anih) anih2.a("upt", "a", 166, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to read/write data from incoming L2CAP socket.");
            jjt.a((Closeable) bluetoothSocket);
            jjt.a((Closeable) dataOutputStream);
            b2.b();
        }
        b2.b();
    }
}
