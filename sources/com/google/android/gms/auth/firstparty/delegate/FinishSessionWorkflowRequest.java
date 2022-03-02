package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FinishSessionWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gdk();
    public final int a;
    public final AppDescription b;
    public final String c;
    public AccountAuthenticatorResponse d;
    private Bundle e;

    public FinishSessionWorkflowRequest(int i, Bundle bundle, AppDescription appDescription, String str, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        this.a = i;
        iva.a((Object) bundle, (Object) "sessionBundle cannot be null");
        this.e = bundle;
        iva.a((Object) appDescription, (Object) "callingAppDescription cannot be null");
        this.b = appDescription;
        iva.a(str, (Object) "accountType must be provided");
        this.c = str;
        this.d = accountAuthenticatorResponse;
    }

    public final Bundle a() {
        return new Bundle(this.e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, a(), false);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d, i, false);
        ivx.b(parcel, a2);
    }
}
