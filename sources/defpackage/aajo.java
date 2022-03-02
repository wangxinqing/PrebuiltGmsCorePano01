package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.global.SetExperimentIdsCall$Request;

/* renamed from: aajo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aajo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SetExperimentIdsCall$Request[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        byte[] bArr = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                bArr = ivw.t(parcel, readInt);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new SetExperimentIdsCall$Request(bArr, z);
    }
}
