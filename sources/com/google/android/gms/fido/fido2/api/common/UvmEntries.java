package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new naf();
    public final List a;

    public UvmEntries(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        List list2 = this.a;
        if (list2 == null && uvmEntries.a == null) {
            return true;
        }
        if (list2 == null || (list = uvmEntries.a) == null || !list2.containsAll(list) || !uvmEntries.a.containsAll(this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.a, false);
        ivx.b(parcel, a2);
    }
}
