package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Arrays;

/* renamed from: edv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class edv {
    protected final IInterface d;
    public final String e;

    public edv(IInterface iInterface, String str) {
        this.d = iInterface;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof edv)) {
            try {
                IInterface iInterface = this.d;
                IInterface iInterface2 = ((edv) obj).d;
                if (iInterface == iInterface2) {
                    return true;
                }
                if (iInterface == null) {
                    return false;
                }
                if (iInterface2 == null || iInterface.asBinder() != iInterface2.asBinder()) {
                    return false;
                }
                return true;
            } catch (ClassCastException e2) {
            }
        }
        return false;
    }

    public final int hashCode() {
        IBinder iBinder;
        Object[] objArr = new Object[1];
        IInterface iInterface = this.d;
        if (iInterface != null) {
            iBinder = iInterface.asBinder();
        } else {
            iBinder = null;
        }
        objArr[0] = iBinder;
        return Arrays.hashCode(objArr);
    }
}
