package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.family.v2.model.PageData;

/* renamed from: mqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mqa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PageData(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PageData[i];
    }
}
