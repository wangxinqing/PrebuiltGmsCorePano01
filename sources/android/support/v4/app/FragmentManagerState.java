package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new hm();
    public ArrayList a;
    public ArrayList b;
    public BackStackState[] c;
    public int d;
    public String e = null;

    public FragmentManagerState() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
    }

    public FragmentManagerState(Parcel parcel) {
        this.a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.b = parcel.createStringArrayList();
        this.c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readString();
    }
}
