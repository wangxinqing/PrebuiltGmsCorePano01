package com.google.android.gms.appinvite.ui.context.section;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GridSectionInfo extends LoaderSectionInfo {
    public static final Parcelable.Creator CREATOR = new dzl();

    public GridSectionInfo(Parcel parcel) {
        super(parcel);
    }

    public final dyj a(dxx dxx, int i) {
        int i2 = this.i;
        int i3 = Build.VERSION.SDK_INT;
        dyq dyq = new dyq(dxx, R.layout.appinvite_contextual_selection_grid_item, i, false, i2, false);
        dyq.a(this.g, this.h);
        return dyq;
    }

    public GridSectionInfo(String str) {
        super(str);
    }
}
