package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlayLoggerContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new htd();
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final int i;
    public final Integer j;

    public PlayLoggerContext(String str, int i2, int i3, String str2, String str3, String str4, boolean z, avsd avsd) {
        iva.a((Object) str);
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.g = str2;
        this.d = str3;
        this.e = str4;
        this.f = !z;
        this.h = z;
        this.i = avsd.f;
        this.j = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayLoggerContext) {
            PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
            return ius.a(this.a, playLoggerContext.a) && this.b == playLoggerContext.b && this.c == playLoggerContext.c && ius.a(this.g, playLoggerContext.g) && ius.a(this.d, playLoggerContext.d) && ius.a(this.e, playLoggerContext.e) && this.f == playLoggerContext.f && this.h == playLoggerContext.h && this.i == playLoggerContext.i && this.j == playLoggerContext.j;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.g, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.h), Integer.valueOf(this.i), this.j});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.g + ",uploadAccount=" + this.d + ",loggingId=" + this.e + ",logAndroidId=" + this.f + ",isAnonymous=" + this.h + ",qosTier=" + this.i + ",appMobilespecId=" + this.j + "]";
    }

    public PlayLoggerContext(String str, int i2, int i3, String str2, String str3, boolean z, String str4, boolean z2, int i4, Integer num) {
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = z2;
        this.i = i4;
        this.j = num;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, false);
        ivx.a(parcel, 7, this.f);
        ivx.a(parcel, 8, this.g, false);
        ivx.a(parcel, 9, this.h);
        ivx.b(parcel, 10, this.i);
        ivx.a(parcel, 11, this.j);
        ivx.b(parcel, a2);
    }
}
