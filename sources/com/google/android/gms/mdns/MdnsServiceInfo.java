package com.google.android.gms.mdns;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MdnsServiceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new snz();
    public final String a;
    public final String[] b;
    public final String[] c;
    public final int d;
    public final String e;
    public final String f;
    List g;
    public final Map h = new HashMap();
    private final List i;

    public MdnsServiceInfo(String str, String[] strArr, List list, String[] strArr2, int i2, String str2, String str3, List list2) {
        this.a = str;
        this.b = strArr;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.c = strArr2;
        this.d = i2;
        this.e = str2;
        this.f = str3;
        if (list2 != null) {
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str4 = (String) list2.get(i3);
                int indexOf = str4.indexOf(61);
                if (indexOf > 0) {
                    this.h.put(str4.substring(0, indexOf).toLowerCase(Locale.ENGLISH), str4.substring(indexOf + 1));
                }
            }
        }
    }

    public final String toString() {
        return String.format(Locale.ROOT, "Name: %s, subtypes: %s, ip: %s, port: %d", new Object[]{this.a, TextUtils.join(",", this.i), this.e, Integer.valueOf(this.d)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        if (this.g == null) {
            this.g = new ArrayList(this.h.size());
            for (Map.Entry entry : this.h.entrySet()) {
                this.g.add(String.format(Locale.ROOT, "%s=%s", new Object[]{entry.getKey(), entry.getValue()}));
            }
        }
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, 4, new ArrayList(this.i), false);
        ivx.a(parcel, 5, this.c, false);
        ivx.b(parcel, 6, this.d);
        ivx.a(parcel, 7, this.e, false);
        ivx.a(parcel, 8, this.f, false);
        ivx.b(parcel, 9, this.g, false);
        ivx.b(parcel, a2);
    }
}
