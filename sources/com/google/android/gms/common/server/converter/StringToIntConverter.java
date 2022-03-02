package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class StringToIntConverter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new izz();
    final int a;
    public final HashMap b;
    public final SparseArray c;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public final class Entry extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new jaa();
        final int a;
        final String b;
        final int c;

        public Entry(int i, String str, int i2) {
            this.a = i;
            this.b = str;
            this.c = i2;
        }

        public Entry(String str, int i) {
            this.a = 1;
            this.b = str;
            this.c = i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a2 = ivx.a(parcel);
            ivx.b(parcel, 1, this.a);
            ivx.a(parcel, 2, this.b, false);
            ivx.b(parcel, 3, this.c);
            ivx.b(parcel, a2);
        }
    }

    public StringToIntConverter() {
        this.a = 1;
        this.b = new HashMap();
        this.c = new SparseArray();
    }

    public final void a(String str, int i) {
        this.b.put(str, Integer.valueOf(i));
        this.c.put(i, str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            arrayList.add(new Entry(str, ((Integer) this.b.get(str)).intValue()));
        }
        ivx.c(parcel, 2, arrayList, false);
        ivx.b(parcel, a2);
    }

    public StringToIntConverter(int i, ArrayList arrayList) {
        this.a = i;
        this.b = new HashMap();
        this.c = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Entry entry = (Entry) arrayList.get(i2);
            a(entry.b, entry.c);
        }
    }
}
