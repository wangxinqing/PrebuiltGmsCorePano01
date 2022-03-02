package defpackage;

import android.bluetooth.BluetoothDevice;
import com.google.android.gms.nearby.mediums.BluetoothClassic$BluetoothPairingDialogZapper;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

/* renamed from: ujn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ujn extends urq {
    public final String a;
    public upc b;
    private final BluetoothClassic$BluetoothPairingDialogZapper c;
    private final BluetoothDevice d;
    private final String e;
    private final tfw f;
    private final SecureRandom i = new SecureRandom();

    public ujn(BluetoothClassic$BluetoothPairingDialogZapper bluetoothClassic$BluetoothPairingDialogZapper, BluetoothDevice bluetoothDevice, String str, tfw tfw) {
        super(23, tfw);
        this.c = bluetoothClassic$BluetoothPairingDialogZapper;
        this.d = bluetoothDevice;
        this.e = str;
        this.a = String.format("{%s:%s}", new Object[]{bluetoothDevice.getName(), str});
        this.f = tfw;
    }

    public final int b() {
        ujl ujl = new ujl(this);
        arzi arzi = new arzi(aymi.a.a().u() + ((long) this.i.nextInt((int) aymi.a.a().t())));
        arzi.a = this.f.c();
        upc upc = (upc) arzk.a((Callable) ujl, "ConnectToBluetoothDevice", arzi.a());
        this.b = upc;
        if (upc == null) {
            return 3;
        }
        jjg jjg = ulh.a;
        return a(24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038 A[SYNTHETIC, Splitter:B:16:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.upc c() {
        /*
            r11 = this;
            java.lang.String r0 = "ujn"
            java.lang.String r1 = "c"
            r2 = 0
            com.google.android.gms.nearby.mediums.BluetoothClassic$BluetoothPairingDialogZapper r3 = r11.c     // Catch:{ IOException -> 0x0028 }
            r3.a()     // Catch:{ IOException -> 0x0028 }
            android.bluetooth.BluetoothDevice r3 = r11.d     // Catch:{ IOException -> 0x0028 }
            java.lang.String r4 = r11.e     // Catch:{ IOException -> 0x0028 }
            java.util.UUID r4 = defpackage.ujq.a((java.lang.String) r4)     // Catch:{ IOException -> 0x0028 }
            android.bluetooth.BluetoothSocket r3 = r3.createInsecureRfcommSocketToServiceRecord(r4)     // Catch:{ IOException -> 0x0028 }
            r3.connect()     // Catch:{ IOException -> 0x0024 }
            upc r4 = new upc     // Catch:{ IOException -> 0x0024 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0024 }
            com.google.android.gms.nearby.mediums.BluetoothClassic$BluetoothPairingDialogZapper r0 = r11.c
            r0.b()
            return r4
        L_0x0024:
            r4 = move-exception
            goto L_0x002b
        L_0x0026:
            r0 = move-exception
            goto L_0x0077
        L_0x0028:
            r3 = move-exception
            r4 = r3
            r3 = r2
        L_0x002b:
            java.lang.String r5 = "Bluetooth"
            java.lang.String r6 = r11.a     // Catch:{ all -> 0x0026 }
            java.lang.String r7 = "ulu"
            java.lang.String r8 = "a"
            java.lang.String r9 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            if (r3 != 0) goto L_0x0038
            goto L_0x0057
        L_0x0038:
            r3.close()     // Catch:{ IOException -> 0x003e }
            jjg r3 = defpackage.ulh.a     // Catch:{ all -> 0x0026 }
            goto L_0x0057
        L_0x003e:
            r3 = move-exception
            jjg r10 = defpackage.ulh.a     // Catch:{ all -> 0x0026 }
            anie r10 = r10.c()     // Catch:{ all -> 0x0026 }
            anih r10 = (defpackage.anih) r10     // Catch:{ all -> 0x0026 }
            r10.a((java.lang.Throwable) r3)     // Catch:{ all -> 0x0026 }
            r3 = 51
            anie r3 = r10.a((java.lang.String) r7, (java.lang.String) r8, (int) r3, (java.lang.String) r9)     // Catch:{ all -> 0x0026 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0026 }
            java.lang.String r7 = "Failed to close %sSocket %s"
            r3.a((java.lang.String) r7, (java.lang.Object) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x0026 }
        L_0x0057:
            jjg r3 = defpackage.ulh.a     // Catch:{ all -> 0x0026 }
            anie r3 = r3.d()     // Catch:{ all -> 0x0026 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0026 }
            r3.a((java.lang.Throwable) r4)     // Catch:{ all -> 0x0026 }
            r4 = 1105(0x451, float:1.548E-42)
            anie r0 = r3.a((java.lang.String) r0, (java.lang.String) r1, (int) r4, (java.lang.String) r9)     // Catch:{ all -> 0x0026 }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x0026 }
            java.lang.String r1 = "Failed to connect via insecure Rfcomm BluetoothSocket to %s"
            java.lang.String r3 = r11.a     // Catch:{ all -> 0x0026 }
            r0.a((java.lang.String) r1, (java.lang.Object) r3)     // Catch:{ all -> 0x0026 }
            com.google.android.gms.nearby.mediums.BluetoothClassic$BluetoothPairingDialogZapper r0 = r11.c
            r0.b()
            return r2
        L_0x0077:
            com.google.android.gms.nearby.mediums.BluetoothClassic$BluetoothPairingDialogZapper r1 = r11.c
            r1.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujn.c():upc");
    }
}
