package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountNameCheckRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gbd();
    final int a;
    @Deprecated
    String b;
    public String c;
    public String d;
    public AppDescription e;
    public CaptchaSolution f;
    public Account g;

    public AccountNameCheckRequest() {
        this.a = 2;
    }

    public AccountNameCheckRequest(int i, String str, String str2, String str3, AppDescription appDescription, CaptchaSolution captchaSolution, Account account) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = appDescription;
        this.f = captchaSolution;
        if (account != null || TextUtils.isEmpty(str)) {
            this.g = account;
        } else {
            this.g = new Account(str, "com.google");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.a(parcel, 6, this.f, i, false);
        ivx.a(parcel, 7, this.g, i, false);
        ivx.b(parcel, a2);
    }
}
