package com.google.android.gms.people.account.categories;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ClassifyAccountTypeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wme();
    public final String a;
    public final String b;

    public ClassifyAccountTypeRequest(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClassifyAccountTypeRequest classifyAccountTypeRequest = (ClassifyAccountTypeRequest) obj;
            return amqx.a(this.a, classifyAccountTypeRequest.a) && amqx.a(this.b, classifyAccountTypeRequest.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
