package com.google.android.gms.plus.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlusCommonExtras extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ytw();
    public final int a;
    public String b;
    public String c;

    public PlusCommonExtras() {
        this.a = 1;
        this.b = "";
        this.c = "";
    }

    public static PlusCommonExtras b(Intent intent) {
        if (intent == null) {
            return new PlusCommonExtras();
        }
        PlusCommonExtras plusCommonExtras = (PlusCommonExtras) ivy.a(intent, "android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", CREATOR);
        return plusCommonExtras == null ? new PlusCommonExtras() : plusCommonExtras;
    }

    public final void a(Intent intent) {
        ivy.a((SafeParcelable) this, intent, "android.gms.plus.internal.PlusCommonExtras.extraPlusCommon");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PlusCommonExtras) {
            PlusCommonExtras plusCommonExtras = (PlusCommonExtras) obj;
            if (this.a != plusCommonExtras.a || !ius.a(this.b, plusCommonExtras.b) || !ius.a(this.c, plusCommonExtras.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("versionCode", Integer.valueOf(this.a));
        a2.a("Gpsrc", this.b);
        a2.a("ClientCallingPackage", this.c);
        return a2.toString();
    }

    public PlusCommonExtras(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final void a(Bundle bundle) {
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", ivy.a(this));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }

    public static PlusCommonExtras b(Bundle bundle) {
        byte[] bArr;
        if (bundle != null) {
            bArr = bundle.getByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon");
        } else {
            bArr = null;
        }
        if (bArr == null) {
            return new PlusCommonExtras();
        }
        PlusCommonExtras plusCommonExtras = (PlusCommonExtras) ivy.a(bArr, CREATOR);
        return plusCommonExtras == null ? new PlusCommonExtras() : plusCommonExtras;
    }
}
