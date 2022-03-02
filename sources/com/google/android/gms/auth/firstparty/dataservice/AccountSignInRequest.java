package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gbh();
    final int a;
    public AppDescription b;
    public boolean c;
    public boolean d;
    public CaptchaSolution e;
    public AccountCredentials f;

    public AccountSignInRequest() {
        this.a = 1;
    }

    public AccountSignInRequest(int i, AppDescription appDescription, boolean z, boolean z2, CaptchaSolution captchaSolution, AccountCredentials accountCredentials) {
        this.a = i;
        this.b = appDescription;
        this.c = z;
        this.d = z2;
        this.e = captchaSolution;
        this.f = accountCredentials;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.a(parcel, 6, this.f, i, false);
        ivx.b(parcel, a2);
    }
}
