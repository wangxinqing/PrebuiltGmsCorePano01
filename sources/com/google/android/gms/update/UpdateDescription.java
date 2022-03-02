package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpdateDescription extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adjo();
    public final String a;
    public final String b;
    public final String c;

    public UpdateDescription(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UpdateDescription) {
            UpdateDescription updateDescription = (UpdateDescription) obj;
            if (!updateDescription.a.equals(this.a) || !updateDescription.b.equals(this.b) || !updateDescription.c.equals(this.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("title", this.a);
        a2.a("description", this.b);
        a2.a("size", this.c);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
