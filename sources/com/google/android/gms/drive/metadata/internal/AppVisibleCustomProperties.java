package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppVisibleCustomProperties extends AbstractSafeParcelable implements Iterable, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new lbi();
    public static final AppVisibleCustomProperties a = new lbh().a();
    public final List b;

    public AppVisibleCustomProperties(Collection collection) {
        iva.a((Object) collection);
        this.b = new ArrayList(collection);
    }

    public final Map a() {
        HashMap hashMap = new HashMap(this.b.size());
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            CustomProperty customProperty = (CustomProperty) list.get(i);
            hashMap.put(customProperty.a, customProperty.b);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return a().equals(((AppVisibleCustomProperties) obj).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final Iterator iterator() {
        return this.b.iterator();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
