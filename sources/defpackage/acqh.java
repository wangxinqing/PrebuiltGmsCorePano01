package defpackage;

import android.bluetooth.BluetoothAdapter;

/* renamed from: acqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acqh extends acqg {
    public final BluetoothAdapter a = BluetoothAdapter.getDefaultAdapter();

    public final boolean b() {
        return this.a.isEnabled();
    }

    public final boolean c() {
        return this.a.enable();
    }

    public final String d() {
        return this.a.getAddress();
    }

    public final void e() {
        this.a.disable();
    }
}
