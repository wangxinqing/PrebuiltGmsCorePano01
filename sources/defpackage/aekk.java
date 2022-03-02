package defpackage;

import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: aekk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aekk extends aekj {
    public aekk(Object... objArr) {
        super(objArr);
    }

    public final void a(aekl aekl) {
        try {
            Object b = b();
            if (b == null) {
                b = aekl.a;
            }
            aekl.a((aekj) this, b);
        } catch (BluetoothException e) {
            aekl.a((aekj) this, (Object) e);
        }
    }

    public Object b() {
        throw new RuntimeException("Not implemented");
    }
}
