package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.appdatasearch.SectionPayload;

/* renamed from: due  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class due implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SectionPayload[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        SparseArray sparseArray = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 1) {
                ivw.b(parcel, readInt);
            } else {
                int a = ivw.a(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (a != 0) {
                    int readInt2 = parcel.readInt();
                    SparseArray sparseArray2 = new SparseArray(readInt2);
                    for (int i = 0; i < readInt2; i++) {
                        sparseArray2.append(parcel.readInt(), parcel.createByteArray());
                    }
                    parcel.setDataPosition(dataPosition + a);
                    sparseArray = sparseArray2;
                } else {
                    sparseArray = null;
                }
            }
        }
        ivw.E(parcel, b);
        return new SectionPayload(sparseArray);
    }
}
