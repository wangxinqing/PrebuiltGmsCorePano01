package com.google.android.gms.plus.model.posts;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlusPage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yxo();
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public PlusPage(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PlusPage) {
            PlusPage plusPage = (PlusPage) obj;
            if (this.a != plusPage.a || !ius.a(this.b, plusPage.b) || !ius.a(this.c, plusPage.c) || !ius.a(this.d, plusPage.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c, this.d});
    }

    public PlusPage(String str, String str2, String str3) {
        this(1, str, str2, str3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
