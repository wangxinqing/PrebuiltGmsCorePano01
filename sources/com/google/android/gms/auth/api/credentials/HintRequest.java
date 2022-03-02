package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new evd();
    final int a;
    public final CredentialPickerConfig b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final String g;
    public final String h;

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.a = i;
        iva.a((Object) credentialPickerConfig);
        this.b = credentialPickerConfig;
        this.c = z;
        this.d = z2;
        this.e = (String[]) iva.a((Object) strArr);
        if (this.a < 2) {
            this.f = true;
            this.g = null;
            this.h = null;
            return;
        }
        this.f = z3;
        this.g = str;
        this.h = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, i, false);
        ivx.a(parcel, 2, this.c);
        ivx.a(parcel, 3, this.d);
        ivx.a(parcel, 4, this.e, false);
        ivx.a(parcel, 5, this.f);
        ivx.a(parcel, 6, this.g, false);
        ivx.a(parcel, 7, this.h, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
