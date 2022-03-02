package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class VerifyPinRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gdf();
    final int a;
    @Deprecated
    public final String b;
    public final String c;
    public final Account d;
    public String e;
    public Bundle f;

    public VerifyPinRequest(int i, String str, String str2, Account account, String str3, Bundle bundle) {
        this.a = i;
        this.c = str2;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
        this.b = this.d.name;
        this.e = str3;
        this.f = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.b(parcel, a2);
    }
}
