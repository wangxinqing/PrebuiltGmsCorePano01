package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;

/* renamed from: mpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mpy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ContactPickerOptionsData(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ContactPickerOptionsData[i];
    }
}
