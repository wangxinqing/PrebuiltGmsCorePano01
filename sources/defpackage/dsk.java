package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CorpusStatus;

/* renamed from: dsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dsk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CorpusStatus[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        Bundle bundle = null;
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 2:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 3:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 4:
                    j3 = ivw.i(parcel2, readInt);
                    break;
                case 5:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 6:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new CorpusStatus(z, j, j2, j3, bundle, str, str2);
    }
}
