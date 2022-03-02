package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LinearLayoutManager$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new abj();
    public int a;
    public int b;
    public boolean c;

    public LinearLayoutManager$SavedState() {
    }

    public final boolean a() {
        return this.a >= 0;
    }

    public final void b() {
        this.a = -1;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public LinearLayoutManager$SavedState(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt() != 1 ? false : true;
    }

    public LinearLayoutManager$SavedState(LinearLayoutManager$SavedState linearLayoutManager$SavedState) {
        this.a = linearLayoutManager$SavedState.a;
        this.b = linearLayoutManager$SavedState.b;
        this.c = linearLayoutManager$SavedState.c;
    }
}
