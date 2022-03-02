package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new irl();
    final int a;
    @Deprecated
    final IBinder b;
    public final Scope[] c;
    public Integer d;
    public Integer e;
    Account f;

    public AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2, Account account) {
        this.a = i;
        this.b = iBinder;
        this.c = scopeArr;
        this.d = num;
        this.e = num2;
        this.f = account;
    }

    public final Account a() {
        itm itm;
        Account account = this.f;
        if (account != null) {
            return account;
        }
        IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof itm) {
            itm = (itm) queryLocalInterface;
        } else {
            itm = new itk(iBinder);
        }
        return irh.a(itm);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AuthAccountRequest(Account account, Set set) {
        this(3, (IBinder) null, (Scope[]) set.toArray(new Scope[set.size()]), (Integer) null, (Integer) null, account);
        iva.a((Object) account);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, (Parcelable[]) this.c, i);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, i, false);
        ivx.b(parcel, a2);
    }
}
