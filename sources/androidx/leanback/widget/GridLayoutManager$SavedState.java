package androidx.leanback.widget;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GridLayoutManager$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aka();
    public int a;
    public Bundle b = Bundle.EMPTY;

    public GridLayoutManager$SavedState() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeBundle(this.b);
    }

    public GridLayoutManager$SavedState(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readBundle(akb.class.getClassLoader());
    }
}
