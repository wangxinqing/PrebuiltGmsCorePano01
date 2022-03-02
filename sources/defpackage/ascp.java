package defpackage;

import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.content.Context;
import android.os.ParcelUuid;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: ascp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ascp {
    public final asht a;
    public final ascs b;
    public boolean c = false;
    public asco d;

    public ascp(Context context, ascs ascs) {
        this.b = ascs;
        this.a = (asht) thl.a(context, asht.class);
    }

    public final tgm a() {
        tgm a2 = tgm.a();
        if (a2 == null) {
            if (this.b.k()) {
                jjg jjg = asil.a;
                this.b.n().edit().putBoolean("IS_BLE_ADVERTISING_SUPPORTED", false).commit();
            } else {
                ((anih) ((anih) asil.a.c()).a("ascp", "a", 176, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleAdvertiseImplL: Failed to get advertiser. Bluetooth is off (must be enabled).");
            }
        }
        return a2;
    }

    public final void b() {
        asco asco;
        jjg jjg = asil.a;
        tgm a2 = a();
        if (!(a2 == null || (asco = this.d) == null)) {
            a2.a(asco);
            this.d = null;
        }
        this.c = false;
    }

    public final boolean a(int i, UUID uuid, byte[] bArr, boolean z, aseu aseu) {
        if (this.c) {
            b();
        }
        jjg jjg = asil.a;
        tgm a2 = a();
        if (a2 != null) {
            AdvertiseSettings build = new AdvertiseSettings.Builder().setAdvertiseMode(2).setTxPowerLevel(i).setConnectable(z).build();
            AdvertiseData.Builder builder = new AdvertiseData.Builder();
            boolean z2 = true;
            if (aseu == aseu.BLE_ADVERTISE_MANUFACTURER_DATA) {
                int length = bArr.length;
                byte[] bArr2 = new byte[(length + 2)];
                bArr2[0] = (byte) (length + 1);
                bArr2[1] = 16;
                System.arraycopy(bArr, 0, bArr2, 2, length);
                builder.addManufacturerData(224, bArr2);
            } else if (uuid != null) {
                ParcelUuid parcelUuid = new ParcelUuid(uuid);
                builder.addServiceUuid(parcelUuid).addServiceData(parcelUuid, bArr);
            } else {
                ((anih) ((anih) asil.a.b()).a("ascp", "a", 74, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleAdvertise: does not support advertise service data without uuid.");
                return false;
            }
            this.d = new asco();
            if (!a2.a(build, builder.build(), this.d)) {
                ((anih) ((anih) asil.a.b()).a("ascp", "a", 82, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleAdvertise: failed to start advertising.");
                return false;
            }
            asco asco = this.d;
            auyn auyn = this.a.b.h;
            if (auyn == null) {
                auyn = auyn.j;
            }
            try {
                if (!asco.a.await(auyn.d, TimeUnit.MILLISECONDS)) {
                    z2 = false;
                } else if (!asco.b) {
                    z2 = false;
                }
            } catch (InterruptedException e) {
                ((anih) ((anih) asil.a.c()).a("asco", "a", 143, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleAdvertiseImplL: timed out waiting for advertising to start");
                z2 = false;
            }
            this.c = z2;
        }
        if (!this.c) {
            b();
        }
        return this.c;
    }
}
