package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CustomProperty extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lbk();
    public final CustomPropertyKey a;
    public final String b;

    public CustomProperty(CustomPropertyKey customPropertyKey, String str) {
        iva.a((Object) customPropertyKey, (Object) "key");
        this.a = customPropertyKey;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            CustomProperty customProperty = (CustomProperty) obj;
            return ius.a(this.a, customProperty.a) && ius.a(this.b, customProperty.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }
}
