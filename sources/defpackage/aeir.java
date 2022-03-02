package defpackage;

import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: aeir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeir extends aekj {
    final /* synthetic */ aeiy a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aeir(aeiy aeiy, Object... objArr) {
        super(objArr);
        this.a = aeiy;
    }

    public final void a() {
        if (!this.a.d.c()) {
            throw new BluetoothException("gatt.discoverServices returned false.");
        }
    }
}
