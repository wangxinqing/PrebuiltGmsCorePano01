package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ukm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ukm extends urq {
    public final BluetoothAdapter a;
    public final aejw b;
    public final aejb c;
    public final Context d;
    aeiy e;
    upm f;
    private final upg i;
    private final int j;
    private final Set k;

    public ukm(Context context, BluetoothAdapter bluetoothAdapter, aejw aejw, aejb aejb, int i2, upg upg, tfw tfw, int i3, Set set) {
        super(36, tfw);
        upm upm;
        this.d = context;
        this.a = bluetoothAdapter;
        this.b = aejw;
        this.c = aejb;
        this.j = i2;
        this.i = upg;
        this.k = set;
        if (i3 > 0 && ukz.f()) {
            BluetoothDevice bluetoothDevice = this.b.a;
            try {
                upm = new upm(bluetoothDevice, i3);
            } catch (IOException e2) {
                anih anih = (anih) ulh.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("upm", "a", 86, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create BleL2capClient with address %s and psm %s", (Object) bluetoothDevice.getAddress(), i3);
                upm = null;
            }
            this.f = upm;
        }
    }

    private static boolean a(aeiy aeiy, int i2) {
        try {
            aeiy.a(urm.a, urm.a(i2));
            return true;
        } catch (BluetoothException e2) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("ukm", "a", 2629, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't read advertisement for slot %d on peripheral %s. Failed to find the corresponding characteristic.", i2, (Object) aeiy.d.a());
            return false;
        }
    }

    private final boolean c() {
        if (!aymi.a.a().m()) {
            try {
                aeiy a2 = new aejf(this.d, aejv.a(this.a)).a(this.b, this.c);
                this.e = a2;
                a2.a(aymi.m());
                return true;
            } catch (BluetoothException e2) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("ukm", "g", 2571, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't connect to an advertisement GATT server for peripheral %s.(legacy)", (Object) this.b);
                return false;
            }
        } else {
            aosh f2 = aosh.f();
            try {
                new ukl(this, f2).start();
                this.e = (aeiy) f2.get(aymi.m(), TimeUnit.MILLISECONDS);
                return true;
            } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                anih anih2 = (anih) ulh.a.b();
                anih2.a(e3);
                ((anih) anih2.a("ukm", "c", 2520, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create GATT connection to peripheral %s.", (Object) this.b);
                if (e3 instanceof InterruptedException) {
                    f2.cancel(true);
                    Thread.currentThread().interrupt();
                }
                return false;
            }
        }
    }

    private final boolean g() {
        try {
            aeiy a2 = new aejf(this.d, aejv.a(this.a)).a(this.b, this.c);
            this.e = a2;
            a2.a(aymi.m());
            return true;
        } catch (BluetoothException e2) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("ukm", "g", 2571, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't connect to an advertisement GATT server for peripheral %s.(legacy)", (Object) this.b);
            return false;
        }
    }

    private final boolean h() {
        boolean z = true;
        for (int i2 = 0; i2 < this.j; i2++) {
            if (!this.i.a(i2)) {
                aeiy aeiy = this.e;
                try {
                    aeiy.a(urm.a, urm.a(i2));
                    try {
                        this.i.a(i2, this.e.b(urm.a, urm.a(i2)));
                        jjg jjg = ulh.a;
                    } catch (BluetoothException e2) {
                        anih anih = (anih) ulh.a.c();
                        anih.a((Throwable) e2);
                        ((anih) anih.a("ukm", "h", 2606, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't read advertisement for slot %d on peripheral %s.", i2, (Object) this.b);
                        z = false;
                    }
                } catch (BluetoothException e3) {
                    anih anih2 = (anih) ulh.a.c();
                    anih2.a((Throwable) e3);
                    ((anih) anih2.a("ukm", "a", 2629, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't read advertisement for slot %d on peripheral %s. Failed to find the corresponding characteristic.", i2, (Object) aeiy.d.a());
                }
            }
        }
        return z;
    }

    public final int b() {
        boolean z;
        int i2;
        boolean z2;
        tfu d2;
        byte[] bArr;
        if (c()) {
            upm upm = this.f;
            if (upm != null) {
                Set<String> set = this.k;
                upg upg = this.i;
                try {
                    if (upm.a()) {
                        d2 = upm.d();
                        try {
                            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(upm.c.getInputStream()));
                            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(upm.c.getOutputStream()));
                            ArrayList arrayList = new ArrayList();
                            for (String str : set) {
                                if (TextUtils.isEmpty(str)) {
                                    ((anih) ((anih) ulh.a.d()).a("upn", "a", 190, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot serialize BleL2capPacket for REQUEST_ADVERTISEMENT without serviceId");
                                    bArr = null;
                                } else {
                                    bArr = upn.a(1, upn.b(str));
                                }
                                if (bArr != null) {
                                    upm.a(dataOutputStream, bArr);
                                    upn a2 = upm.a(dataInputStream);
                                    int i3 = a2.a;
                                    if (i3 == 21) {
                                        arrayList.add(a2.c);
                                    } else if (i3 == 22) {
                                        jjg jjg = ulh.a;
                                    }
                                }
                            }
                            upm.a(dataOutputStream, upn.a(2, (byte[]) null));
                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                upg.a(i4, (byte[]) arrayList.get(i4));
                            }
                            d2.b();
                            upm.c();
                            this.i.a(true);
                            return 2;
                        } catch (IOException e2) {
                            anih anih = (anih) ulh.a.b();
                            anih.a((Throwable) e2);
                            ((anih) anih.a("upm", "a", 282, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to fetch advertisement on L2CAP socket!");
                            d2.b();
                        }
                    }
                    upm.c();
                    i2 = 0;
                    z = true;
                } catch (Throwable th) {
                    upm.c();
                    throw th;
                }
            } else {
                i2 = 0;
                z = true;
            }
            while (i2 < this.j) {
                if (!this.i.a(i2)) {
                    aeiy aeiy = this.e;
                    try {
                        aeiy.a(urm.a, urm.a(i2));
                        try {
                            this.i.a(i2, this.e.b(urm.a, urm.a(i2)));
                            jjg jjg2 = ulh.a;
                        } catch (BluetoothException e3) {
                            anih anih2 = (anih) ulh.a.c();
                            anih2.a((Throwable) e3);
                            ((anih) anih2.a("ukm", "h", 2606, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't read advertisement for slot %d on peripheral %s.", i2, (Object) this.b);
                            z = false;
                        }
                    } catch (BluetoothException e4) {
                        anih anih3 = (anih) ulh.a.c();
                        anih3.a((Throwable) e4);
                        ((anih) anih3.a("ukm", "a", 2629, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't read advertisement for slot %d on peripheral %s. Failed to find the corresponding characteristic.", i2, (Object) aeiy.d.a());
                    }
                }
                i2++;
            }
            upg upg2 = this.i;
            if (upg2.a().isEmpty()) {
                z2 = false;
            } else {
                z2 = z;
            }
            upg2.a(z2);
            return 2;
        }
        this.i.a(false);
        return 2;
    }

    public final void a() {
        try {
            aeiy aeiy = this.e;
            if (aeiy != null) {
                aeiy.close();
                this.e = null;
            }
        } catch (BluetoothException e2) {
        }
    }
}
