package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class StringList extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apvf();
    public final int a;
    public List b;

    public StringList() {
        this((List) null);
    }

    public static StringList a() {
        return new StringList((List) null);
    }

    public StringList(int i, List list) {
        this.a = i;
        if (list == null || list.isEmpty()) {
            this.b = Collections.emptyList();
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.set(i2, jlh.b((String) list.get(i2)));
        }
        this.b = Collections.unmodifiableList(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }

    public StringList(List list) {
        this.a = 1;
        this.b = new ArrayList();
        if (list != null && !list.isEmpty()) {
            this.b.addAll(list);
        }
    }
}
