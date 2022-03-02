package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.places.ui.placepicker.views.expandingscrollview.ExpandingScrollView;

/* renamed from: alfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alfb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ExpandingScrollView.SavedState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ExpandingScrollView.SavedState[i];
    }
}
