package com.google.android.gms.appinvite.ui.context.section;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ListSectionInfo extends LoaderSectionInfo {
    public static final Parcelable.Creator CREATOR = new dzm();
    private boolean q;

    public ListSectionInfo(Parcel parcel) {
        super(parcel);
        this.q = parcel.readInt() != 0;
    }

    public final dyj a(dxx dxx, int i) {
        int i2 = this.i;
        int i3 = Build.VERSION.SDK_INT;
        dyq dyq = new dyq(dxx, R.layout.appinvite_contextual_selection_list_item, i, true, i2, true);
        dyq.a(this.g, this.h);
        return dyq;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.q ? 1 : 0);
    }

    public ListSectionInfo(String str) {
        super(str);
    }
}
