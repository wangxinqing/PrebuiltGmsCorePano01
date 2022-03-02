package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new euk();
    final int a;
    public final boolean b;
    public final String[] c;
    public final CredentialPickerConfig d;
    public final CredentialPickerConfig e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;

    public CredentialRequest(int i2, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.a = i2;
        this.b = z;
        this.c = (String[]) iva.a((Object) strArr);
        this.d = credentialPickerConfig == null ? eui.a() : credentialPickerConfig;
        this.e = credentialPickerConfig2 == null ? eui.a() : credentialPickerConfig2;
        if (i2 < 3) {
            this.f = true;
            this.g = null;
            this.h = null;
        } else {
            this.f = z2;
            this.g = str;
            this.h = str2;
        }
        this.i = z3;
    }

    public final Set a() {
        return new HashSet(Arrays.asList(this.c));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d, i2, false);
        ivx.a(parcel, 4, this.e, i2, false);
        ivx.a(parcel, 5, this.f);
        ivx.a(parcel, 6, this.g, false);
        ivx.a(parcel, 7, this.h, false);
        ivx.a(parcel, 8, this.i);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
