package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.content.Context;
import com.google.android.gms.nearby.mediums.BluetoothClassic$BluetoothPairingDialogZapper;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* renamed from: ujq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ujq {
    public final Context a;
    public final uru b;
    public urq c;
    public urq d;
    private final BluetoothClassic$BluetoothPairingDialogZapper e;
    private final BluetoothAdapter f;
    private final Map g = new nz();
    private final aoru h;

    public ujq(Context context, uru uru) {
        aoru b2 = tid.b();
        this.a = context.getApplicationContext();
        this.b = uru;
        this.h = b2;
        this.f = BluetoothAdapter.getDefaultAdapter();
        this.e = new BluetoothClassic$BluetoothPairingDialogZapper(this.a);
        if (b()) {
            upf.a().c(this.a);
        }
    }

    public static UUID a(String str) {
        return UUID.nameUUIDFromBytes(str.getBytes());
    }

    private final boolean e() {
        return this.d != null;
    }

    private final boolean f() {
        return this.c != null;
    }

    public final boolean b() {
        return aymi.a.a().aE() && this.a.getPackageManager().hasSystemFeature("android.hardware.bluetooth") && this.f != null;
    }

    public final synchronized void c() {
        if (!e()) {
            ((anih) ((anih) ulh.a.d()).a("ujq", "c", 230, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop Bluetooth Classic advertising because it was never turned on.");
            return;
        }
        this.b.c(this.d);
        this.d = null;
        jjg jjg = ulh.a;
    }

    public final synchronized void d() {
        if (!f()) {
            ((anih) ((anih) ulh.a.d()).a("ujq", "d", 294, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop stop Bluetooth Classic discovery because it never started.");
            return;
        }
        this.b.c(this.c);
        this.c = null;
        jjg jjg = ulh.a;
    }

    public static boolean a(urt urt) {
        urt urt2 = urt.UNKNOWN;
        int ordinal = urt.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new AssertionError(String.format("Unknown RegistrationResult %s", new Object[]{urt}));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final synchronized BluetoothDevice e(String str) {
        if (str == null) {
            ((anih) ((anih) ulh.a.b()).a("ujq", "e", 508, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to get remote Bluetooth device because a null bluetoothMacAddress was passed in.");
            return null;
        } else if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            ((anih) ((anih) ulh.a.b()).a("ujq", "e", 516, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s is not a valid Bluetooth MAC address", (Object) str);
            return null;
        } else {
            try {
                return this.f.getRemoteDevice(str);
            } catch (IllegalArgumentException e2) {
                ((anih) ((anih) ulh.a.d()).a("ujq", "e", 523, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("A valid Bluetooth Device could not be generated from %s", (Object) str);
                return null;
            }
        }
    }

    public final synchronized upc a(BluetoothDevice bluetoothDevice, String str, tfw tfw) {
        if (bluetoothDevice == null || str == null) {
            ((anih) ((anih) ulh.a.b()).a("ujq", "a", 464, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to create client Bluetooth socket because at least one of bluetoothDevice or serviceName is null.");
            return null;
        }
        ujn ujn = new ujn(this.e, bluetoothDevice, str, tfw);
        if (!a(this.b.b(ujn))) {
            ((anih) ((anih) ulh.a.c()).a("ujq", "a", 475, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create client Bluetooth socket because we failed to register the MediumOperation.");
            return null;
        }
        upc upc = ujn.b;
        upc.a(new uje(this, ujn));
        return upc;
    }

    public final synchronized boolean b(String str) {
        if (str == null) {
            ((anih) ((anih) ulh.a.b()).a("ujq", "b", 182, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start Bluetooth Classic advertising because a null deviceName was passed in.");
            return false;
        } else if (e()) {
            ((anih) ((anih) ulh.a.b()).a("ujq", "b", 189, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start Bluetooth Classic advertising with device name %s because we're already discoverable with device name %s.", (Object) str, (Object) this.f.getName());
            return false;
        } else if (!b()) {
            ((anih) ((anih) ulh.a.d()).a("ujq", "b", 197, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't start Bluetooth Classic advertising because Bluetooth is not available.");
            return false;
        } else {
            ujk ujk = new ujk(this.a, this.f, str);
            if (!a(this.b.b(ujk))) {
                jjg jjg = ulh.a;
                return false;
            }
            this.d = ujk;
            jjg jjg2 = ulh.a;
            return true;
        }
    }

    public final synchronized boolean c(String str) {
        return this.g.containsKey(str);
    }

    public final synchronized void d(String str) {
        if (str == null) {
            ((anih) ((anih) ulh.a.b()).a("ujq", "d", 411, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to stop accepting Bluetooth Classic connections because the serviceName is null.");
        } else if (!c(str)) {
            ((anih) ((anih) ulh.a.d()).a("ujq", "d", 418, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't stop accepting Bluetooth Classic connections for %s because it was never started.", (Object) str);
        } else {
            try {
                ((BluetoothServerSocket) this.g.remove(str)).close();
            } catch (IOException e2) {
                anih anih = (anih) ulh.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("ujq", "d", 441, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to close Bluetooth Classic server socket for %s.", (Object) str);
            }
            this.e.b();
            jjg jjg = ulh.a;
        }
    }

    public final synchronized void a() {
        tid.a(this.h, "BluetoothClassic.singleThreadOffloader");
        d();
        Iterator it = new ob((Collection) this.g.keySet()).iterator();
        while (it.hasNext()) {
            d((String) it.next());
        }
        c();
    }

    public final void a(Runnable runnable) {
        this.h.execute(runnable);
    }

    public final synchronized void a(urq urq) {
        this.b.c(urq);
    }

    public final synchronized boolean a(String str, tom tom) {
        if (str == null || tom == null) {
            ((anih) ((anih) ulh.a.b()).a("ujq", "a", 317, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start accepting Bluetooth Classic connections because at least one of serviceName or acceptedConnectionCallback is null.");
            return false;
        } else if (c(str)) {
            ((anih) ((anih) ulh.a.b()).a("ujq", "a", 324, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start accepting Bluetooth Classic connections for %s because a Bluetooth server is already in-progress for that service name.", (Object) str);
            return false;
        } else if (!b()) {
            ((anih) ((anih) ulh.a.d()).a("ujq", "a", 332, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't start accepting Bluetooth Classic connections for %s because Bluetooth is not available.", (Object) str);
            return false;
        } else {
            this.e.a();
            try {
                BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord = this.f.listenUsingInsecureRfcommWithServiceRecord(str, a(str));
                new uji(this, 9, listenUsingInsecureRfcommWithServiceRecord, tom, str).start();
                this.g.put(str, listenUsingInsecureRfcommWithServiceRecord);
                jjg jjg = ulh.a;
                return true;
            } catch (IOException e2) {
                anih anih = (anih) ulh.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("ujq", "a", 354, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start accepting Bluetooth Classic connections for %s.", (Object) str);
                return false;
            }
        }
    }

    public final synchronized boolean a(tou tou) {
        if (tou == null) {
            ((anih) ((anih) ulh.a.b()).a("ujq", "a", 251, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start Bluetooth Classic discovery because a null discoveredDeviceCallback was passed in.");
            return false;
        } else if (f()) {
            ((anih) ((anih) ulh.a.b()).a("ujq", "a", 258, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Refusing to start Bluetooth Classic discovery because another discovery is already in-progress.");
            return false;
        } else if (!b()) {
            ((anih) ((anih) ulh.a.d()).a("ujq", "a", 265, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't start Bluetooth Classic discovery because Bluetooth is not available.");
            return false;
        } else {
            ujp ujp = new ujp(this.a, this.f, this.h, tou);
            if (!a(this.b.b(ujp))) {
                ((anih) ((anih) ulh.a.b()).a("ujq", "a", 274, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start Bluetooth Classic discovery because we were unable to register the MediumOperation.");
                return false;
            }
            this.c = ujp;
            jjg jjg = ulh.a;
            return true;
        }
    }
}
