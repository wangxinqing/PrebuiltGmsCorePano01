package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;

/* renamed from: ljc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ljc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FieldWithSortOrder[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new FieldWithSortOrder(str, z);
    }
}
