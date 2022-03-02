package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.photos.autobackup.model.MediaState;

/* renamed from: yjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yjz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MediaState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String[] strArr = null;
        int[] iArr = null;
        long[] jArr = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                strArr = ivw.A(parcel, readInt);
            } else if (a == 3) {
                iArr = ivw.w(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                jArr = ivw.x(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new MediaState(i, strArr, iArr, jArr);
    }
}
