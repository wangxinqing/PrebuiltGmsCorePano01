package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ljk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ljk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LogicalFilter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Operator operator = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                operator = (Operator) ivw.a(parcel, readInt, Operator.CREATOR);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                arrayList = ivw.c(parcel, readInt, FilterHolder.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new LogicalFilter(operator, (List) arrayList);
    }
}
