package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import com.google.android.gms.nearby.bootstrap.Device;
import java.lang.reflect.InvocationTargetException;

/* renamed from: tcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tcz extends tdn {
    public static final anil a = anil.a("NearbyBootstrap");
    private final BluetoothAdapter v;
    private final int w;
    private final String x;
    private final tcy y = new tcy(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tcz(ased ased, arwa arwa, BluetoothAdapter bluetoothAdapter, String str, String str2, byte b, tdv tdv, tdy tdy, tde tde) {
        super(ased, arwa, str, str2, b, tdv, tdy, tde);
        this.v = bluetoothAdapter;
        this.w = bluetoothAdapter.getScanMode();
        this.x = bluetoothAdapter.getName();
    }

    /* access modifiers changed from: protected */
    public final Device a(asem asem) {
        if ((asem.a & 2) == 0) {
            return null;
        }
        asfs asfs = asem.c;
        if (asfs == null) {
            asfs = asfs.f;
        }
        int a2 = asfy.a(asfs.b);
        if ((a2 != 0 && a2 != 1) || (asem.a & 4) == 0) {
            return null;
        }
        asfv asfv = asem.d;
        if (asfv == null) {
            asfv = asfv.d;
        }
        String str = asfv.c;
        String a3 = tcv.a(str);
        String b = tcv.b(str);
        asfv asfv2 = asem.d;
        if (asfv2 == null) {
            asfv2 = asfv.d;
        }
        return new Device(a3, b, tcv.a(asfv2.b.k()), tcv.c(str));
    }

    /* access modifiers changed from: protected */
    public final asel b() {
        aucd o = asel.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asel asel = (asel) o.b;
        asel.b = 1;
        asel.a = 1 | asel.a;
        return (asel) o.i();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        boolean z;
        this.y.b();
        if (!a(this.w)) {
            ((anih) ((anih) a.c()).a("tcz", "c", 111, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothTargetDevice: fail to revert bluetooth scan mode");
        }
        String str = this.x;
        if (str == null) {
            z = this.v.setName(Build.MODEL);
        } else {
            z = this.v.setName(str);
        }
        if (!z) {
            ((anih) ((anih) a.b()).a("tcz", "c", 120, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothTargetDevice: unable to reset device name.");
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        BluetoothAdapter bluetoothAdapter = this.v;
        String str = this.l;
        String str2 = this.m;
        byte b = this.n;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append("[");
        sb.append(str);
        sb.append("]");
        sb.append((char) (b + 48));
        sb.append(str2);
        bluetoothAdapter.setName(sb.toString());
        if (!a(23)) {
            ((anih) ((anih) a.c()).a("tcz", "a", 92, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothTargetDevice: fail to start discoverable mode on BT Adapter");
            return false;
        } else if (!aymf.a.a().a()) {
            return true;
        } else {
            this.y.a();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i) {
        Class<BluetoothAdapter> cls = BluetoothAdapter.class;
        try {
            return ((Boolean) cls.getMethod("setScanMode", new Class[]{Integer.TYPE}).invoke(this.v, new Object[]{Integer.valueOf(i)})).booleanValue();
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            anih anih = (anih) a.c();
            anih.a(e);
            ((anih) anih.a("tcz", "a", 79, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothTargetDevice: Fail to call hidden api BluetoothAdapter.setScanMode(%s)", i);
            return false;
        }
    }
}
