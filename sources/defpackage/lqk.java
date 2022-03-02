package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.ui.select.path.ViewPathElement;

/* renamed from: lqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lqk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ViewPathElement[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return lqj.d[parcel.readInt()];
    }
}
