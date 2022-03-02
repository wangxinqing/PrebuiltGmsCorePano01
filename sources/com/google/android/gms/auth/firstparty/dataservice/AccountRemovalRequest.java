package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountRemovalRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gbf();
    final int a;
    @Deprecated
    String b;
    public Account c;

    public AccountRemovalRequest() {
        this.a = 2;
    }

    public AccountRemovalRequest(int i, String str, Account account) {
        this.a = i;
        this.b = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.c = account;
        } else {
            this.c = new Account(str, "com.google");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
