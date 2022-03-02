package defpackage;

import android.accounts.Account;
import android.os.Parcel;

/* renamed from: itl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class itl extends bhw implements itm {
    public itl() {
        super("com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        Account a = a();
        parcel2.writeNoException();
        bhx.b(parcel2, a);
        return true;
    }
}
