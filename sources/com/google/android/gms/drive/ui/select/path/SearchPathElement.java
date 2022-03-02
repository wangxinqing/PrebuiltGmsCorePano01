package com.google.android.gms.drive.ui.select.path;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.R;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.internal.FullTextSearchFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SearchPathElement implements PathElement {
    public static final Parcelable.Creator CREATOR = new lqh();
    public final String a;
    private final Filter b;

    public SearchPathElement(String str) {
        iva.a((Object) str);
        this.a = str;
        if (!str.isEmpty()) {
            iva.a((Object) str);
            this.b = new FullTextSearchFilter(str);
            return;
        }
        this.b = lim.a(new MatchAllFilter());
    }

    public final String a(Context context) {
        return context.getString(R.string.drive_menu_search_with_query, new Object[]{this.a});
    }

    public final Filter b() {
        return this.b;
    }

    public final lqu c() {
        return lqu.e;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
