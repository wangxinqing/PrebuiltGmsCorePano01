package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GplusInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gcm();
    final int a;
    @Deprecated
    String b;
    CaptchaSolution c;
    Account d;

    public GplusInfoRequest() {
        this.a = 2;
    }

    public GplusInfoRequest(int i, String str, CaptchaSolution captchaSolution, Account account) {
        this.a = i;
        this.b = str;
        this.c = captchaSolution;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.b(parcel, a2);
    }
}
