package defpackage;

import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.Arrays;

/* renamed from: aekj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aekj {
    private final Object[] a;

    public aekj(Object... objArr) {
        this.a = objArr;
    }

    public void a() {
        throw new RuntimeException("Not implemented");
    }

    public void c() {
    }

    public final boolean equals(Object obj) {
        if (obj == null || !aekj.class.isInstance(obj)) {
            return false;
        }
        return Arrays.equals(this.a, ((aekj) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return amre.a('-').a(this.a);
    }

    public void a(aekl aekl) {
        try {
            a();
        } catch (BluetoothException e) {
            aekl.a(this, (Object) e);
        }
    }
}
