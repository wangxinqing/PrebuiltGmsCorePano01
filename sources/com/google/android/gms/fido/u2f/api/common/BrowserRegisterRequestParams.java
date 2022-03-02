package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BrowserRegisterRequestParams extends BrowserRequestParams {
    public static final Parcelable.Creator CREATOR = new nbm();
    public final RegisterRequestParams a;
    public final Uri b;

    public BrowserRegisterRequestParams(RegisterRequestParams registerRequestParams, Uri uri) {
        boolean z;
        iva.a((Object) registerRequestParams);
        this.a = registerRequestParams;
        iva.a((Object) uri);
        boolean z2 = true;
        if (uri.getScheme() != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "origin scheme must be non-empty");
        iva.b(uri.getAuthority() == null ? false : z2, "origin authority must be non-empty");
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BrowserRegisterRequestParams) {
            BrowserRegisterRequestParams browserRegisterRequestParams = (BrowserRegisterRequestParams) obj;
            return ius.a(this.a, browserRegisterRequestParams.a) && ius.a(this.b, browserRegisterRequestParams.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
