package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;

/* renamed from: aent  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aent implements Parcelable.ClassLoaderCreator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OpenSearchView.SavedState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new OpenSearchView.SavedState(parcel, (ClassLoader) null);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new OpenSearchView.SavedState(parcel, classLoader);
    }
}
