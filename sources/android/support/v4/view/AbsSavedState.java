package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ox();
    public static final AbsSavedState a = new AbsSavedState() {
    };
    public final Parcelable b;

    public AbsSavedState() {
        this.b = null;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.b = readParcelable == null ? a : readParcelable;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.b = parcelable == a ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
}
