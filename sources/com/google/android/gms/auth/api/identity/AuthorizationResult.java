package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AuthorizationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new frx();
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final GoogleSignInAccount e;
    public final PendingIntent f;

    public AuthorizationResult(String str, String str2, String str3, List list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        iva.a((Object) list);
        this.d = list;
        this.f = pendingIntent;
        this.e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthorizationResult) {
            AuthorizationResult authorizationResult = (AuthorizationResult) obj;
            if (!ius.a(this.a, authorizationResult.a) || !ius.a(this.b, authorizationResult.b) || !ius.a(this.c, authorizationResult.c) || !ius.a(this.d, authorizationResult.d) || !ius.a(this.f, authorizationResult.f) || !ius.a(this.e, authorizationResult.e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.f, this.e});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.a(parcel, 6, this.f, i, false);
        ivx.b(parcel, a2);
    }
}
