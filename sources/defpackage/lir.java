package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.SortOrder;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.ArrayList;

/* renamed from: lir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lir implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Query[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        LogicalFilter logicalFilter = null;
        String str = null;
        SortOrder sortOrder = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    logicalFilter = (LogicalFilter) ivw.a(parcel, readInt, LogicalFilter.CREATOR);
                    break;
                case 3:
                    str = ivw.q(parcel, readInt);
                    break;
                case 4:
                    sortOrder = (SortOrder) ivw.a(parcel, readInt, SortOrder.CREATOR);
                    break;
                case 5:
                    arrayList = ivw.C(parcel, readInt);
                    break;
                case 6:
                    z = ivw.c(parcel, readInt);
                    break;
                case 7:
                    arrayList2 = ivw.c(parcel, readInt, DriveSpace.CREATOR);
                    break;
                case 8:
                    z2 = ivw.c(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new Query(logicalFilter, str, sortOrder, arrayList, z, arrayList2, z2);
    }
}
