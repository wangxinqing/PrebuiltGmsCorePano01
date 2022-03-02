package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.ui.select.Selection;

/* renamed from: lps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lps implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Selection(((FilterHolder) parcel.readParcelable(FilterHolder.class.getClassLoader())).j, (DriveId) parcel.readParcelable(DriveId.class.getClassLoader()));
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Selection[0];
    }
}
