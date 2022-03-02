package com.google.android.gms.plus.model.posts;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.people.data.Audience;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Settings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yxq();
    public final int a;
    public final Audience b;
    public final Audience c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    public Settings(int i, Audience audience, Audience audience2, boolean z, boolean z2, int i2, int i3, int i4) {
        this.a = i;
        this.b = audience;
        this.c = audience2;
        this.d = z;
        this.e = z2;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Settings) {
            Settings settings = (Settings) obj;
            if (this.a == settings.a && ius.a(this.b, settings.b) && ius.a(this.c, settings.c) && this.d == settings.d && this.e == settings.e && this.f == settings.f && this.g == settings.g && this.h == settings.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, i, false);
        ivx.a(parcel, 2, this.c, i, false);
        ivx.a(parcel, 3, this.d);
        ivx.a(parcel, 4, this.e);
        ivx.b(parcel, 5, this.f);
        ivx.b(parcel, 6, this.g);
        ivx.b(parcel, 7, this.h);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
