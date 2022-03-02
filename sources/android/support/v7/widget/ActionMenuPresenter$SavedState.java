package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActionMenuPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new yg();
    public int a;

    public ActionMenuPresenter$SavedState() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public ActionMenuPresenter$SavedState(Parcel parcel) {
        this.a = parcel.readInt();
    }
}
