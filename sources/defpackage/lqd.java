package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ui.select.path.PathElement;
import com.google.android.gms.drive.ui.select.path.PathStack;
import java.util.ArrayList;

/* renamed from: lqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lqd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PathStack[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (parcel.readByte() == 0) {
            return new PathStack((DriveId) parcel.readParcelable(DriveId.class.getClassLoader()));
        }
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, PathElement.class.getClassLoader());
        return new PathStack(arrayList);
    }
}
