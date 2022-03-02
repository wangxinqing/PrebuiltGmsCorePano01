package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbsSavedState;

/* renamed from: ox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ox implements Parcelable.ClassLoaderCreator {
    public static final AbsSavedState a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return AbsSavedState.a;
        }
        throw new IllegalStateException("superState must be null");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AbsSavedState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel, (ClassLoader) null);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
