package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FieldMappingDictionary extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jav();
    final int a;
    public final HashMap b;
    public final String c;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class Entry extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new jaw();
        final int a;
        final String b;
        final ArrayList c;

        public Entry(int i, String str, ArrayList arrayList) {
            this.a = i;
            this.b = str;
            this.c = arrayList;
        }

        public Entry(String str, Map map) {
            ArrayList arrayList;
            this.a = 1;
            this.b = str;
            if (map != null) {
                arrayList = new ArrayList();
                for (String str2 : map.keySet()) {
                    arrayList.add(new FieldMapPair(str2, (FastJsonResponse$Field) map.get(str2)));
                }
            } else {
                arrayList = null;
            }
            this.c = arrayList;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.b(parcel, 1, this.a);
            ivx.a(parcel, 2, this.b, false);
            ivx.c(parcel, 3, this.c, false);
            ivx.b(parcel, a2);
        }
    }

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class FieldMapPair extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new jau();
        final int a;
        final String b;
        final FastJsonResponse$Field c;

        public FieldMapPair(int i, String str, FastJsonResponse$Field fastJsonResponse$Field) {
            this.a = i;
            this.b = str;
            this.c = fastJsonResponse$Field;
        }

        public FieldMapPair(String str, FastJsonResponse$Field fastJsonResponse$Field) {
            this.a = 1;
            this.b = str;
            this.c = fastJsonResponse$Field;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.b(parcel, 1, this.a);
            ivx.a(parcel, 2, this.b, false);
            ivx.a(parcel, 3, this.c, i, false);
            ivx.b(parcel, a2);
        }
    }

    public FieldMappingDictionary(int i, ArrayList arrayList, String str) {
        this.a = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Entry entry = (Entry) arrayList.get(i2);
            String str2 = entry.b;
            HashMap hashMap2 = new HashMap();
            int size2 = entry.c.size();
            for (int i3 = 0; i3 < size2; i3++) {
                FieldMapPair fieldMapPair = (FieldMapPair) entry.c.get(i3);
                hashMap2.put(fieldMapPair.b, fieldMapPair.c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.b = hashMap;
        iva.a((Object) str);
        this.c = str;
        a();
    }

    public final Map a(String str) {
        return (Map) this.b.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.b.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void a() {
        for (String str : this.b.keySet()) {
            Map map = (Map) this.b.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse$Field) map.get(str2)).j = this;
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            arrayList.add(new Entry(str, (Map) this.b.get(str)));
        }
        ivx.c(parcel, 2, arrayList, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }

    public FieldMappingDictionary(Class cls) {
        this.a = 1;
        this.b = new HashMap();
        this.c = cls.getCanonicalName();
    }
}
