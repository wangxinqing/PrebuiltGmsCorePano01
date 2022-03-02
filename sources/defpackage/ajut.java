package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.DateValidatorPointForward;

/* renamed from: ajut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajut implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DateValidatorPointForward(parcel.readLong());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DateValidatorPointForward[i];
    }
}
