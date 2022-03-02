package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.ParcelUuid;
import android.os.SystemClock;
import com.google.android.gms.beacon.BleSettings;
import com.google.location.nearby.direct.bluetooth.state.BluetoothAdapterWrapper$1;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ascs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ascs {
    public final Context a;
    public final asht b;
    public final BluetoothAdapter c;
    public final ascp d;
    public final arwg e;
    public boolean f;
    public Long g;
    public final BroadcastReceiver h = new BluetoothAdapterWrapper$1(this, "nearby");
    private final Set i = new HashSet();

    public ascs(Context context) {
        long j;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.a = context;
        this.b = (asht) thl.a(context, asht.class);
        this.c = defaultAdapter;
        this.e = (arwg) thl.a(context, arwg.class);
        this.f = false;
        ascp ascp = null;
        if (a()) {
            if (defaultAdapter.isEnabled()) {
                j = 0L;
            } else {
                j = null;
            }
            this.g = j;
            context.registerReceiver(this.h, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
        this.d = c() ? new ascp(context, this) : ascp;
    }

    private static boolean a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    private final gte p() {
        if (b()) {
            return (gte) thl.a(this.a, gte.class);
        }
        jjg jjg = asil.a;
        return null;
    }

    private final boolean q() {
        int e2 = e();
        if (e2 == 10 || e2 == 12) {
            return true;
        }
        jjg jjg = asil.a;
        return false;
    }

    public final int d() {
        return this.c.getScanMode();
    }

    public final int e() {
        int state = this.c.getState();
        if (state != 12 || k()) {
            return state;
        }
        return 11;
    }

    public final boolean f() {
        gte p = p();
        if (p != null) {
            try {
                if (((Boolean) acws.a(p.a(), 2, TimeUnit.SECONDS)).booleanValue()) {
                    return true;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            }
        }
        return false;
    }

    public final boolean g() {
        return this.c.isDiscovering();
    }

    public final boolean h() {
        jjg jjg = asil.a;
        return this.c.disable();
    }

    public final void i() {
        try {
            this.a.unregisterReceiver(this.h);
        } catch (IllegalArgumentException e2) {
            ((anih) ((anih) asil.a.c()).a("ascs", "i", 361, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unregistered bluetooth broadcast receiver when it wasn't registered.");
        }
        this.f = true;
    }

    public final String j() {
        return this.c.getName();
    }

    public final boolean k() {
        if (this.f) {
            return false;
        }
        Long l = this.g;
        if (l == null) {
            return this.c.isEnabled();
        }
        auyt auyt = this.b.b;
        long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
        if (this.c.isEnabled()) {
            auyo auyo = auyt.g;
            if (auyo == null) {
                auyo = auyo.j;
            }
            if (auyo.i <= elapsedRealtime) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int l() {
        int i2;
        try {
            i2 = ((Integer) tgf.a((Object) this.c).a("getDiscoverableTimeout", new Class[0]).a(new Object[0])).intValue();
            try {
                jjg jjg = asil.a;
            } catch (tgg e2) {
            }
        } catch (tgg e3) {
            i2 = 120;
        }
        if (i2 != -1) {
            return i2;
        }
        return 120;
    }

    public final int m() {
        try {
            return ((Integer) tgf.a((Object) this.c).a("getConnectionState", new Class[0]).a(new Object[0])).intValue();
        } catch (tgg e2) {
            return Integer.MIN_VALUE;
        }
    }

    public final SharedPreferences n() {
        return this.a.getSharedPreferences("copresence_bluetooth_preferences", 0);
    }

    public final boolean o() {
        if (!k()) {
            return aynf.a.a().b() && jkr.b() && this.c.isBleScanAlwaysAvailable();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.a.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        int i2 = Build.VERSION.SDK_INT;
        return a(this.a);
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        int i2 = Build.VERSION.SDK_INT;
        return a(this.a) && n().getBoolean("IS_BLE_ADVERTISING_SUPPORTED", true);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2, int i3) {
        jjg jjg = asil.a;
        StringBuilder sb = new StringBuilder(52);
        sb.append("setScanMode to ");
        sb.append(i2);
        sb.append(" with duration ");
        sb.append(i3);
        sb.toString();
        try {
            boolean booleanValue = ((Boolean) tgf.a((Object) this.c).a("setScanMode", Integer.TYPE, Integer.TYPE).a(Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("setScanMode to ");
            sb2.append(i2);
            sb2.append(" with duration ");
            sb2.append(i3);
            sb2.toString();
            return booleanValue;
        } catch (tgg e2) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(BleSettings bleSettings, gth gth) {
        gte p;
        gtj gtj = new gtj(bleSettings);
        gtj.a = 1;
        BleSettings a2 = gtj.a();
        jjg jjg = asil.a;
        if (q() && o() && (p = p()) != null) {
            try {
                acws.a(p.a(gth, a2), aymn.b(), TimeUnit.SECONDS);
                this.i.add(gth);
                return true;
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(gth gth) {
        jjg jjg = asil.a;
        if (!q()) {
            return false;
        }
        gte p = p();
        if (p != null) {
            try {
                if (!((Boolean) acws.a(p.a(gth), aymn.b(), TimeUnit.SECONDS)).booleanValue()) {
                    return true;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                return true;
            }
        }
        this.i.remove(gth);
        return true;
    }

    public final boolean a(String str) {
        jjg jjg = asil.a;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "setName to ".concat(valueOf);
        } else {
            new String("setName to ");
        }
        boolean name = this.c.setName(str);
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() != 0) {
            "setName to ".concat(valueOf2);
        } else {
            new String("setName to ");
        }
        return name;
    }

    public final boolean a(UUID uuid, byte[] bArr, boolean z, aseu aseu) {
        boolean z2;
        ascp ascp = this.d;
        if (ascp != null) {
            if (ascp.c) {
                ascp.b();
            }
            jjg jjg = asil.a;
            tgm a2 = ascp.a();
            if (a2 != null) {
                AdvertiseSettings build = new AdvertiseSettings.Builder().setAdvertiseMode(2).setTxPowerLevel(3).setConnectable(z).build();
                AdvertiseData.Builder builder = new AdvertiseData.Builder();
                if (aseu == aseu.BLE_ADVERTISE_MANUFACTURER_DATA) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[(length + 2)];
                    bArr2[0] = (byte) (length + 1);
                    bArr2[1] = 16;
                    System.arraycopy(bArr, 0, bArr2, 2, length);
                    builder.addManufacturerData(224, bArr2);
                } else if (uuid == null) {
                    ((anih) ((anih) asil.a.b()).a("ascp", "a", 74, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleAdvertise: does not support advertise service data without uuid.");
                } else {
                    ParcelUuid parcelUuid = new ParcelUuid(uuid);
                    builder.addServiceUuid(parcelUuid).addServiceData(parcelUuid, bArr);
                }
                ascp.d = new asco();
                if (!a2.a(build, builder.build(), ascp.d)) {
                    ((anih) ((anih) asil.a.b()).a("ascp", "a", 82, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleAdvertise: failed to start advertising.");
                } else {
                    asco asco = ascp.d;
                    auyn auyn = ascp.a.b.h;
                    if (auyn == null) {
                        auyn = auyn.j;
                    }
                    try {
                        if (!asco.a.await(auyn.d, TimeUnit.MILLISECONDS) || !asco.b) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } catch (InterruptedException e2) {
                        ((anih) ((anih) asil.a.c()).a("asco", "a", 143, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleAdvertiseImplL: timed out waiting for advertising to start");
                        z2 = false;
                    }
                    ascp.c = z2;
                }
            }
            if (!ascp.c) {
                ascp.b();
            }
            if (ascp.c) {
                return true;
            }
        }
        return false;
    }
}
