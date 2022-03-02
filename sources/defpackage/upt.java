package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: upt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class upt {
    public int a = 0;
    public final aoru b = tid.a(4);
    public final ScheduledExecutorService c = tid.a();
    public BluetoothServerSocket d;
    public final Map e = new nz();
    public final BluetoothAdapter f;
    public final Map g;
    public final uqo h;
    private final List i = new ArrayList();

    public upt(BluetoothAdapter bluetoothAdapter, Map map, uqo uqo) {
        this.f = bluetoothAdapter;
        this.g = map;
        this.h = uqo;
    }

    private final void a(DataOutputStream dataOutputStream, String str, BluetoothSocket bluetoothSocket) {
        if (this.e.containsKey(str)) {
            ((anih) ((anih) ulh.a.b()).a("upt", "a", 181, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Receive duplicate data connection request from remote MAC address %s", (Object) str);
            a(dataOutputStream, upn.c());
            b(bluetoothSocket);
            return;
        }
        urc a2 = uqq.a(str, bluetoothSocket, new upq(this, str), this.h);
        if (a2 == null) {
            ((anih) ((anih) ulh.a.b()).a("upt", "a", 195, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create MultiplexBleSocket for remote address %s, the reason may be not enable MulitplexBleSocketV2 or failed to read BlePacket.", (Object) str);
            a(dataOutputStream, upn.c());
            b(bluetoothSocket);
            return;
        }
        a(dataOutputStream, upn.b());
        this.e.put(str, a2);
    }

    public static void b(BluetoothSocket bluetoothSocket) {
        new ups(bluetoothSocket).start();
    }

    static final /* synthetic */ void c(BluetoothSocket bluetoothSocket) {
        ((anih) ((anih) ulh.a.d()).a("upt", "c", 223, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("L2capServerHandler timed out for handling incoming L2CAP socket after %d ms.", aymi.g());
        jjt.a((Closeable) bluetoothSocket);
    }

    public final void b() {
        while (true) {
            try {
                BluetoothSocket accept = this.d.accept();
                if (accept == null) {
                    ((anih) ((anih) ulh.a.b()).a("upt", "b", 108, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed! Got null incoming L2CAP socket.");
                } else {
                    a(accept);
                    this.b.execute(new upp(this, accept));
                }
            } catch (IOException e2) {
                return;
            }
        }
    }

    public final synchronized void c() {
        List list = this.i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            jjt.a((Closeable) (BluetoothSocket) list.get(i2));
        }
        this.i.clear();
        jjt.a((Closeable) this.d);
        this.d = null;
        tid.a(this.b, "BleL2capServer.socketHandlerThreadPool");
        tid.a(this.c, "BleL2capServer.timeoutAlarmExecutor");
    }

    public static void a(DataOutputStream dataOutputStream, byte[] bArr) {
        dataOutputStream.writeInt(bArr.length);
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
    }

    public final synchronized void a(BluetoothSocket bluetoothSocket) {
        this.i.add(bluetoothSocket);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, BluetoothSocket bluetoothSocket) {
        DataOutputStream dataOutputStream;
        ukd ukd;
        byte[] bArr;
        String str2 = str;
        BluetoothSocket bluetoothSocket2 = bluetoothSocket;
        jjg jjg = ulh.a;
        tfu b2 = tfu.b(new upr(bluetoothSocket2), aymi.g(), this.c);
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
                            int i2 = a2.a;
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    jjt.a((Closeable) bluetoothSocket);
                                    break;
                                } else if (i2 == 3) {
                                    if (this.e.containsKey(str2)) {
                                        ((anih) ((anih) ulh.a.b()).a("upt", "a", 181, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Receive duplicate data connection request from remote MAC address %s", (Object) str2);
                                        a(dataOutputStream2, upn.c());
                                        b(bluetoothSocket);
                                    } else {
                                        urc a3 = uqq.a(str2, bluetoothSocket2, new upq(this, str2), this.h);
                                        if (a3 == null) {
                                            ((anih) ((anih) ulh.a.b()).a("upt", "a", 195, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create MultiplexBleSocket for remote address %s, the reason may be not enable MulitplexBleSocketV2 or failed to read BlePacket.", (Object) str2);
                                            a(dataOutputStream2, upn.c());
                                            b(bluetoothSocket);
                                        } else {
                                            a(dataOutputStream2, upn.b());
                                            this.e.put(str2, a3);
                                        }
                                    }
                                }
                            } else {
                                byte[] bArr3 = a2.b;
                                Iterator it = this.g.values().iterator();
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
                                if (ukd == null) {
                                    a(dataOutputStream2, upn.a());
                                } else {
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
                                        a(dataOutputStream2, upn.a());
                                    } else {
                                        a(dataOutputStream2, bArr);
                                    }
                                }
                            }
                        } else {
                            String valueOf = String.valueOf(ulu.a(bArr2));
                            throw new IOException(valueOf.length() == 0 ? new String("Got invalid BleL2capPacket bytes from server! raw data : ") : "Got invalid BleL2capPacket bytes from server! raw data : ".concat(valueOf));
                        }
                    } else {
                        throw new IOException("Got invalid length of BleL2capPacket from client!");
                    }
                } catch (IOException e2) {
                    e = e2;
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
        } catch (IOException e3) {
            e = e3;
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

    public final boolean a() {
        try {
            BluetoothServerSocket listenUsingInsecureL2capChannel = this.f.listenUsingInsecureL2capChannel();
            this.d = listenUsingInsecureL2capChannel;
            this.a = listenUsingInsecureL2capChannel.getPsm();
            new jfx(9, new upo(this)).start();
            return true;
        } catch (IOException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("upt", "a", 92, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to listen incoming L2CAP socket.");
            return false;
        }
    }
}
