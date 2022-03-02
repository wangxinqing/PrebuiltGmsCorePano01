package com.google.android.gms.auth.firstparty.shared;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountCredentials extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gdv();
    final int a;
    public boolean b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public final String i;

    @Deprecated
    public AccountCredentials() {
        this("com.google");
    }

    public final Account a() {
        if (!TextUtils.isEmpty(this.c)) {
            return new Account(this.c, this.i);
        }
        return null;
    }

    public AccountCredentials(int i2, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = i2;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.a(parcel, 8, this.h, false);
        ivx.a(parcel, 9, this.i, false);
        ivx.b(parcel, a2);
    }

    public AccountCredentials(Account account) {
        this(account.type);
        this.c = account.name;
    }

    public AccountCredentials(String str) {
        this.a = 2;
        iva.a(str, (Object) "Account type can't be empty.");
        this.i = str;
    }
}
