package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class VisitedApplication extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qgv();
    BitmapTeleporter a;
    public String b;
    public String c;
    public String d;
    public String e;
    public ContentRating f;
    private ArrayList g;

    public VisitedApplication(BitmapTeleporter bitmapTeleporter, String str, String str2, String str3, String str4, Collection collection, ContentRating contentRating) {
        int i;
        this.a = bitmapTeleporter;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        if (collection != null) {
            i = collection.size();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(i);
        this.g = arrayList;
        if (collection != null) {
            arrayList.addAll(collection);
        }
        this.f = contentRating;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, false);
        ivx.b(parcel, 7, Collections.unmodifiableList(this.g), false);
        ivx.a(parcel, 8, this.f, i, false);
        ivx.b(parcel, a2);
    }
}
