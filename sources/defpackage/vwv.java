package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import java.util.UUID;

/* renamed from: vwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vwv extends vwy {
    private final BluetoothAdapter e = BluetoothAdapter.getDefaultAdapter();
    private tgm f;
    private final int g;
    private final int h;
    private AdvertiseCallback i;

    public vwv(Context context, boolean z, int i2, int i3) {
        super(context, z, new vxa(context), new vww(context));
        this.g = i2;
        this.h = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r0 = r2.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean f() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x003a
            android.content.Context r0 = r2.a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "android.hardware.bluetooth"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto L_0x003a
            android.content.Context r0 = r2.a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "android.hardware.bluetooth_le"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto L_0x003a
            android.bluetooth.BluetoothAdapter r0 = r2.e
            if (r0 == 0) goto L_0x003a
            tgm r1 = r2.f
            if (r1 == 0) goto L_0x003a
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x003a
            android.bluetooth.BluetoothAdapter r0 = r2.e
            boolean r0 = r0.isMultipleAdvertisementSupported()
            if (r0 == 0) goto L_0x003a
            r0 = 1
            return r0
        L_0x003a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vwv.f():boolean");
    }

    public final void b() {
        if (f()) {
            AdvertiseCallback advertiseCallback = this.i;
            if (advertiseCallback == null) {
                ((anih) ((anih) vvj.a.b()).a("vwv", "b", 138, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to stop BLE advertising experiment %s. Never started", (Object) this);
                return;
            }
            tgm tgm = this.f;
            if (tgm == null) {
                ((anih) ((anih) vvj.a.b()).a("vwv", "b", 144, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to stop BLE advertising experiment %s. Unexpected state.", (Object) this);
                return;
            }
            tgm.a(advertiseCallback);
            this.i = null;
            return;
        }
        jjg jjg = vvj.a;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f = tgm.a();
        }
        if (f()) {
            tgm tgm = this.f;
            if (tgm != null) {
                AdvertiseData build = new AdvertiseData.Builder().setIncludeDeviceName(false).setIncludeTxPowerLevel(false).addServiceUuid(new ParcelUuid(UUID.randomUUID())).build();
                AdvertiseSettings build2 = new AdvertiseSettings.Builder().setAdvertiseMode(this.g).setTxPowerLevel(this.h).setConnectable(false).build();
                vwu vwu = new vwu();
                if (!tgm.a(build2, build, vwu)) {
                    ((anih) ((anih) vvj.a.b()).a("vwv", "a", 115, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start BLE advertising experiment %s", (Object) this);
                    return;
                }
                this.i = vwu;
                jjg jjg = vvj.a;
                return;
            }
            ((anih) ((anih) vvj.a.b()).a("vwv", "a", 72, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start BLE advertising experiment %s. Unexpected state.", (Object) this);
            return;
        }
        jjg jjg2 = vvj.a;
    }
}
