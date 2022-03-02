package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StartAddAccountSessionWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gdp();
    public final int a;
    public List b;
    public Bundle c;
    public final AppDescription d;
    public final String e;
    public AccountAuthenticatorResponse f;
    public boolean g;
    public boolean h;
    public String i;
    public String j;

    public StartAddAccountSessionWorkflowRequest(int i2, List list, Bundle bundle, AppDescription appDescription, String str, AccountAuthenticatorResponse accountAuthenticatorResponse, boolean z, boolean z2, String str2, String str3) {
        this.a = i2;
        this.b = list;
        this.c = bundle;
        iva.a((Object) appDescription);
        this.d = appDescription;
        this.e = str;
        this.f = accountAuthenticatorResponse;
        this.g = z;
        this.h = z2;
        this.i = str2;
        this.j = str3;
    }

    public final List a() {
        List list = this.b;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        return null;
    }

    public final Bundle b() {
        return new Bundle(this.c);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, a(), false);
        ivx.a(parcel, 3, b(), false);
        ivx.a(parcel, 4, this.d, i2, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, i2, false);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h);
        ivx.a(parcel, 9, this.i, false);
        ivx.a(parcel, 10, this.j, false);
        ivx.b(parcel, a2);
    }
}
