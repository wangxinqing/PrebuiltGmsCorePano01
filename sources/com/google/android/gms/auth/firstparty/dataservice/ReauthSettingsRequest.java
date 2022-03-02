package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReauthSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gcy();
    final int a;
    @Deprecated
    public final String b;
    public final boolean c;
    public final Account d;
    public String e;

    public ReauthSettingsRequest(int i, String str, boolean z, Account account, String str2) {
        this.a = i;
        this.b = str;
        this.c = z;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
        this.e = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.b(parcel, a2);
    }

    public ReauthSettingsRequest(Account account, boolean z) {
        this(3, (String) null, z, account, (String) null);
    }
}
