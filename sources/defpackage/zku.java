package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.sharebox.AddToCircleData;
import com.google.android.gms.plus.sharebox.Circle;
import java.util.ArrayList;

/* renamed from: zku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zku implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AddToCircleData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        Audience audience = null;
        Audience audience2 = null;
        ArrayList arrayList = null;
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        str = ivw.q(parcel, readInt);
                        break;
                    case 2:
                        str2 = ivw.q(parcel, readInt);
                        break;
                    case 3:
                        audience = (Audience) ivw.a(parcel, readInt, Audience.CREATOR);
                        break;
                    case 4:
                        audience2 = (Audience) ivw.a(parcel, readInt, Audience.CREATOR);
                        break;
                    case 5:
                        arrayList = ivw.c(parcel, readInt, Circle.CREATOR);
                        break;
                    case 6:
                        num = ivw.h(parcel, readInt);
                        break;
                    case 7:
                        bool = ivw.d(parcel, readInt);
                        break;
                    case 8:
                        bool2 = ivw.d(parcel, readInt);
                        break;
                    default:
                        ivw.b(parcel, readInt);
                        break;
                }
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new AddToCircleData(i, str, str2, audience, audience2, arrayList, num, bool, bool2);
    }
}
