package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dsq();
    public final int a;
    final Bundle b;

    public Feature(int i) {
        this(i, new Bundle());
    }

    public static Feature a(int i, Feature[] featureArr) {
        if (featureArr != null) {
            for (Feature feature : featureArr) {
                if (feature.a == i) {
                    return feature;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 == r7) goto L_0x005d
            boolean r1 = r7 instanceof com.google.android.gms.appdatasearch.Feature
            r2 = 0
            if (r1 == 0) goto L_0x005c
            com.google.android.gms.appdatasearch.Feature r7 = (com.google.android.gms.appdatasearch.Feature) r7
            int r1 = r6.a
            int r3 = r7.a
            if (r1 != r3) goto L_0x005c
            android.os.Bundle r1 = r6.b
            if (r1 != 0) goto L_0x001a
            android.os.Bundle r7 = r7.b
            if (r7 != 0) goto L_0x0019
            return r0
        L_0x0019:
            return r2
        L_0x001a:
            android.os.Bundle r3 = r7.b
            if (r3 == 0) goto L_0x005c
            int r1 = r1.size()
            android.os.Bundle r3 = r7.b
            int r3 = r3.size()
            if (r1 != r3) goto L_0x005c
            android.os.Bundle r1 = r6.b
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0034:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x005b
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = r7.b
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L_0x005a
            android.os.Bundle r4 = r6.b
            java.lang.String r4 = r4.getString(r3)
            android.os.Bundle r5 = r7.b
            java.lang.String r3 = r5.getString(r3)
            boolean r3 = defpackage.ius.a(r4, r3)
            if (r3 != 0) goto L_0x0034
        L_0x005a:
            return r2
        L_0x005b:
            return r0
        L_0x005c:
            return r2
        L_0x005d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.appdatasearch.Feature.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.a));
        Bundle bundle = this.b;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                arrayList.add(str);
                arrayList.add(this.b.getString(str));
            }
        }
        return Arrays.hashCode(arrayList.toArray(new Object[0]));
    }

    public Feature(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public static void a(List list, Feature feature) {
        if (feature != null) {
            int i = 0;
            while (i < list.size()) {
                int i2 = ((Feature) list.get(i)).a;
                int i3 = feature.a;
                if (i2 != i3) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Feature ");
                    sb.append(i3);
                    sb.append(" already exists");
                    throw new IllegalStateException(sb.toString());
                }
            }
            list.add(feature);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }

    public final String a(String str) {
        return this.b.getString(str);
    }

    public final void a(String str, String str2) {
        this.b.putString(str, str2);
    }
}
