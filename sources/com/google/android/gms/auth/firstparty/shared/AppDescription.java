package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppDescription extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new gdw();
    private static final String g;
    final int a;
    public int b;
    String c;
    String d;
    public String e;
    boolean f;

    static {
        String simpleName = AppDescription.class.getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2);
        sb.append("[");
        sb.append(simpleName);
        sb.append("]");
        g = sb.toString();
    }

    public AppDescription(int i, int i2, String str, String str2, String str3, boolean z) {
        boolean z2;
        String simpleName = getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 14);
        sb.append("[");
        sb.append(simpleName);
        sb.append("] %s - %s: %s");
        sb.toString();
        this.a = i;
        this.c = str;
        this.d = str2;
        iva.a(str3, (Object) String.valueOf(g).concat(" callingPkg cannot be null or empty!"));
        this.e = str3;
        if (i2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2, "Invalid callingUid! Cannot be 0!");
        this.b = i2;
        this.f = z;
    }

    public final String toString() {
        return getClass().getSimpleName() + "<" + this.e + ", " + this.b + ">";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f);
        ivx.b(parcel, a2);
    }

    public AppDescription(String str, int i, String str2, String str3) {
        this(1, i, str2, str3, str, false);
    }
}
