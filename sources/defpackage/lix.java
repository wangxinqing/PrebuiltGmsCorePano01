package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.SortOrder;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;

/* renamed from: lix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lix implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SortOrder[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                arrayList = ivw.c(parcel, readInt, FieldWithSortOrder.CREATOR);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new SortOrder(arrayList, z);
    }
}
