package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CustomPropertyKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kyn();
    private static final Pattern c = Pattern.compile("[\\w.!@$%^&*()/-]+");
    public final String a;
    public final int b;

    public CustomPropertyKey(String str, int i) {
        iva.a((Object) str, (Object) "key");
        iva.b(c.matcher(str).matches(), "key name characters must be alphanumeric or one of .!@$%^&*()-_/");
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        iva.b(z, "visibility must be either PUBLIC or PRIVATE");
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            CustomPropertyKey customPropertyKey = (CustomPropertyKey) obj;
            return customPropertyKey.a.equals(this.a) && customPropertyKey.b == this.b;
        }
    }

    public final int hashCode() {
        String str = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(i);
        return sb.toString().hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("CustomPropertyKey(");
        sb.append(str);
        sb.append(",");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
