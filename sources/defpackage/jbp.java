package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.stats.AlarmEvent;
import java.util.ArrayList;

/* renamed from: jbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jbp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AlarmEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 3:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 4:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 6:
                    j3 = ivw.i(parcel2, readInt);
                    break;
                case 7:
                    j4 = ivw.i(parcel2, readInt);
                    break;
                case 8:
                    arrayList = ivw.C(parcel2, readInt);
                    break;
                case 9:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 10:
                    i4 = ivw.g(parcel2, readInt);
                    break;
                case 11:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 12:
                    f = ivw.l(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new AlarmEvent(i, j, i2, str, j2, j3, j4, arrayList, i3, i4, str2, f);
    }
}
