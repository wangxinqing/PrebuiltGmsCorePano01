package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: ajxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajxg implements Parcelable.ClassLoaderCreator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CheckableImageButton.SavedState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CheckableImageButton.SavedState(parcel, (ClassLoader) null);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new CheckableImageButton.SavedState(parcel, classLoader);
    }
}
