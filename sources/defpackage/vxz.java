package defpackage;

import android.os.Parcel;

/* renamed from: vxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class vxz extends bhw implements vya {
    public vxz() {
        super("com.google.android.gms.nearby.sharing.internal.IBooleanResultListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a(bhx.a(parcel));
        return true;
    }
}
