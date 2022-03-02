package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: upm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class upm {
    public final String a;
    public final int b;
    public final BluetoothSocket c;
    private final ScheduledExecutorService d = tid.a();

    public upm(BluetoothDevice bluetoothDevice, int i) {
        this.a = bluetoothDevice.getAddress();
        this.b = i;
        this.c = bluetoothDevice.createInsecureL2capChannel(i);
    }

    public static upm a(BluetoothDevice bluetoothDevice, int i) {
        try {
            return new upm(bluetoothDevice, i);
        } catch (IOException e) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("upm", "a", 86, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create BleL2capClient with address %s and psm %s", (Object) bluetoothDevice.getAddress(), i);
            return null;
        }
    }

    private final boolean f() {
        try {
            this.c.connect();
            return true;
        } catch (IOException e) {
            anih anih = (anih) ulh.a.d();
            anih.a((Throwable) e);
            ((anih) anih.a("upm", "f", 165, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to connect via insecure L2cap BluetoothSocket to %s", this.b);
            return false;
        }
    }

    private final boolean g() {
        boolean z;
        tfu d2 = d();
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(this.c.getInputStream()));
            a(new DataOutputStream(new BufferedOutputStream(this.c.getOutputStream())), upn.a(3, (byte[]) null));
            if (a(dataInputStream).a == 23) {
                z = true;
            } else {
                z = false;
            }
            ((anih) ((anih) ulh.a.d()).a("upm", "g", 206, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleL2capClient data connection to device %s was successful? %b", (Object) this.a, z);
            return z;
        } catch (IOException e) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("upm", "g", 212, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to request data connection on L2CAP socket!");
            return false;
        } finally {
            d2.b();
        }
    }

    public final void b() {
        jjt.a((Closeable) this.c);
        tid.a(this.d, "BleL2capClient.timeoutAlarmExecutor");
    }

    public final void c() {
        new upl(this).start();
    }

    public final tfu d() {
        jjg jjg = ulh.a;
        return tfu.b(new upk(this), aymi.g(), this.d);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        ((anih) ((anih) ulh.a.b()).a("upm", "e", 294, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("L2capClientHandler timed out for handling outgoing L2CAP socket after %d ms.", aymi.g());
        b();
    }

    public static upm a(String str, int i) {
        BluetoothDevice a2 = urm.a(str);
        if (a2 != null) {
            try {
                return new upm(a2, i);
            } catch (IOException e) {
                anih anih = (anih) ulh.a.b();
                anih.a((Throwable) e);
                ((anih) anih.a("upm", "a", 106, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create BleL2capClient with address %s and psm %s", (Object) a2.getAddress(), i);
                return null;
            }
        } else {
            anih anih2 = (anih) ((anih) ulh.a.b()).a("upm", "a", 98, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            throw null;
        }
    }

    public static upn a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        if (upn.a(readInt)) {
            byte[] bArr = new byte[readInt];
            dataInputStream.readFully(bArr);
            upn a2 = upn.a(bArr);
            if (a2 != null) {
                return a2;
            }
            String valueOf = String.valueOf(ulu.a(bArr));
            throw new IOException(valueOf.length() == 0 ? new String("Got invalid BleL2capPacket bytes from server! raw data : ") : "Got invalid BleL2capPacket bytes from server! raw data : ".concat(valueOf));
        }
        throw new IOException("Got invalid length of BleL2capPacket from server!");
    }

    public static void a(DataOutputStream dataOutputStream, byte[] bArr) {
        dataOutputStream.writeInt(bArr.length);
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
    }

    public final boolean a() {
        aosh f = aosh.f();
        new jfx(9, new upj(this, f)).start();
        Boolean bool = (Boolean) thr.c("BleL2capClient.connect", f, aymi.a.a().i());
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Set set, upg upg) {
        tfu d2 = d();
        try {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(this.c.getInputStream()));
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(this.c.getOutputStream()));
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (true) {
                byte[] bArr = null;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (TextUtils.isEmpty(str)) {
                    ((anih) ((anih) ulh.a.d()).a("upn", "a", 190, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot serialize BleL2capPacket for REQUEST_ADVERTISEMENT without serviceId");
                } else {
                    bArr = upn.a(1, upn.b(str));
                }
                if (bArr != null) {
                    a(dataOutputStream, bArr);
                    upn a2 = a(dataInputStream);
                    int i = a2.a;
                    if (i == 21) {
                        arrayList.add(a2.c);
                    } else if (i == 22) {
                        jjg jjg = ulh.a;
                    }
                }
            }
            a(dataOutputStream, upn.a(2, (byte[]) null));
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                upg.a(i2, (byte[]) arrayList.get(i2));
            }
            return true;
        } catch (IOException e) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("upm", "a", 282, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to fetch advertisement on L2CAP socket!");
            return false;
        } finally {
            d2.b();
        }
    }
}
