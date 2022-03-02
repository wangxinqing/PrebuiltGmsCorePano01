package com.google.android.gms.appinvite.ui.context.section;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SelectionSectionInfo extends SectionInfo {
    public static final Parcelable.Creator CREATOR = new dzn();
    public CharSequence a;
    public boolean b;

    public SelectionSectionInfo() {
    }

    public final dyj a(dxx dxx, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return new dyx(dxx, i, dxx.a.getString(R.string.appinvite_recipients), this.a, this.b, false);
    }

    public final dyj b(dxx dxx, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return new dyx(dxx, i, dxx.a.getString(R.string.appinvite_recipients), this.a, this.b, true);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.a, parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public SelectionSectionInfo(Parcel parcel) {
        super(parcel);
        this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = parcel.readInt() != 0;
    }
}
