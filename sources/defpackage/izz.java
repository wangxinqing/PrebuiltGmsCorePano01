package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import java.util.ArrayList;

/* renamed from: izz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class izz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StringToIntConverter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                arrayList = ivw.c(parcel, readInt, StringToIntConverter.Entry.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new StringToIntConverter(i, arrayList);
    }
}
