package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ath();
    public final atq a;

    public ParcelImpl(Parcel parcel) {
        this.a = new atm(parcel).l();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        new atm(parcel).a(this.a);
    }

    public ParcelImpl(atq atq) {
        this.a = atq;
    }
}
