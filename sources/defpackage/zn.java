package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatSpinner;

/* renamed from: zn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AppCompatSpinner.SavedState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppCompatSpinner.SavedState[i];
    }
}
