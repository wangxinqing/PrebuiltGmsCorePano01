package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OauthRedirect extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tbj();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    private OauthRedirect() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OauthRedirect) {
            OauthRedirect oauthRedirect = (OauthRedirect) obj;
            return ius.a(this.a, oauthRedirect.a) && ius.a(this.b, oauthRedirect.b) && ius.a(this.c, oauthRedirect.c) && ius.a(this.d, oauthRedirect.d) && ius.a(this.e, oauthRedirect.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public OauthRedirect(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.b(parcel, a2);
    }
}
