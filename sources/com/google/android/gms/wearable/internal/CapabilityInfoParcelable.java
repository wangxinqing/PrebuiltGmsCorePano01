package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CapabilityInfoParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adzo();
    public final String a;
    public final List b;
    private final Object c = new Object();
    private Set d;

    public CapabilityInfoParcelable(String str, List list) {
        this.a = str;
        this.b = list;
        this.d = null;
        iva.a((Object) str);
        iva.a((Object) this.b);
    }

    public final Set a() {
        Set set;
        synchronized (this.c) {
            if (this.d == null) {
                this.d = new HashSet(this.b);
            }
            set = this.d;
        }
        return set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) obj;
        String str = this.a;
        if (str == null ? capabilityInfoParcelable.a != null : !str.equals(capabilityInfoParcelable.a)) {
            return false;
        }
        List list = this.b;
        return list == null ? capabilityInfoParcelable.b == null : list.equals(capabilityInfoParcelable.b);
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(valueOf).length());
        sb.append("CapabilityInfo{");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.c(parcel, 3, this.b, false);
        ivx.b(parcel, a2);
    }
}
