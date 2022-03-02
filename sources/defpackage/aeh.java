package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.SearchView;

/* renamed from: aeh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeh implements Parcelable.ClassLoaderCreator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SearchView.SavedState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SearchView.SavedState(parcel, (ClassLoader) null);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchView.SavedState(parcel, classLoader);
    }
}
