package defpackage;

import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanSettings;
import java.util.List;

/* renamed from: tgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tgn {
    private static tgn a;
    private final BluetoothLeScanner b;

    private tgn(BluetoothLeScanner bluetoothLeScanner) {
        this.b = bluetoothLeScanner;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized defpackage.tgn a() {
        /*
            java.lang.Class<tgn> r0 = defpackage.tgn.class
            monitor-enter(r0)
            tgn r1 = a     // Catch:{ all -> 0x0022 }
            if (r1 != 0) goto L_0x001e
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ all -> 0x0022 }
            r2 = 0
            if (r1 == 0) goto L_0x001c
            android.bluetooth.le.BluetoothLeScanner r1 = r1.getBluetoothLeScanner()     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x001c
            tgn r2 = new tgn     // Catch:{ all -> 0x0022 }
            r2.<init>(r1)     // Catch:{ all -> 0x0022 }
            a = r2     // Catch:{ all -> 0x0022 }
            goto L_0x001e
        L_0x001c:
            monitor-exit(r0)
            return r2
        L_0x001e:
            tgn r1 = a     // Catch:{ all -> 0x0022 }
            monitor-exit(r0)
            return r1
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgn.a():tgn");
    }

    public final void a(ScanCallback scanCallback) {
        try {
            this.b.stopScan(scanCallback);
        } catch (IllegalStateException | NullPointerException e) {
        }
    }

    public final boolean a(List list, ScanSettings scanSettings, ScanCallback scanCallback) {
        try {
            this.b.startScan(list, scanSettings, scanCallback);
            return true;
        } catch (IllegalStateException | NullPointerException e) {
            return false;
        }
    }
}
