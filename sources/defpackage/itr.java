package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: itr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class itr extends bhw implements its {
    public itr() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mby b = b();
            parcel2.writeNoException();
            bhx.a(parcel2, (IInterface) b);
        } else if (i != 2) {
            return false;
        } else {
            int c = c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        }
        return true;
    }
}
