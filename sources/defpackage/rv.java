package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.widget.NestedScrollView;

/* renamed from: rv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new NestedScrollView.SavedState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NestedScrollView.SavedState[i];
    }
}
