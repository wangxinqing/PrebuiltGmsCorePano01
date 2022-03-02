package com.google.android.gms.fonts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FontMatchSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nfu();
    public final int a;
    public String b;
    public float c;
    public int d;
    public float e;
    public boolean f;

    public FontMatchSpec(int i, String str, float f2, int i2, float f3, boolean z) {
        boolean z2;
        this.a = i;
        iva.a((Object) str, (Object) "family");
        this.b = str;
        this.c = f2;
        this.d = i2;
        this.e = f3;
        this.f = z;
        if (f2 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.a(z2, "invalid width %.01f", Float.valueOf(f2));
        iva.a(i2 > 0 && i2 <= 1000, "invalid weight %d", Integer.valueOf(i2));
        iva.a(f3 >= 0.0f && f3 <= 1.0f, "invalid italic: %.01f", Float.valueOf(f3));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FontMatchSpec) {
            FontMatchSpec fontMatchSpec = (FontMatchSpec) obj;
            if (ius.a(this.b, fontMatchSpec.b) && Float.compare(this.c, fontMatchSpec.c) == 0 && this.d == fontMatchSpec.d && Float.compare(this.e, fontMatchSpec.e) == 0 && this.f == fontMatchSpec.f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Float.valueOf(this.c), Integer.valueOf(this.d), Float.valueOf(this.e), Boolean.valueOf(this.f)});
    }

    public final String toString() {
        String str = this.b;
        float f2 = this.c;
        int i = this.d;
        float f3 = this.e;
        boolean z = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 82);
        sb.append("{");
        sb.append(str);
        sb.append(", wdth ");
        sb.append(f2);
        sb.append(", wght ");
        sb.append(i);
        sb.append(", ital ");
        sb.append(f3);
        sb.append(", bestEffort ");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f);
        ivx.b(parcel, a2);
    }

    public FontMatchSpec(String str) {
        this(1, str, 100.0f, 400, 0.0f, false);
    }

    public FontMatchSpec(String str, float f2, int i, float f3, boolean z) {
        this(1, str, f2, i, f3, z);
    }
}
