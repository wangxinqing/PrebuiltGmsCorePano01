package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: iwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iwy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AudienceMember[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        i2 = ivw.g(parcel, readInt);
                        break;
                    case 2:
                        i3 = ivw.g(parcel, readInt);
                        break;
                    case 3:
                        str = ivw.q(parcel, readInt);
                        break;
                    case 4:
                        str2 = ivw.q(parcel, readInt);
                        break;
                    case 5:
                        str3 = ivw.q(parcel, readInt);
                        break;
                    case 6:
                        str4 = ivw.q(parcel, readInt);
                        break;
                    case 7:
                        bundle = ivw.s(parcel, readInt);
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
        return new AudienceMember(i, i2, i3, str, str2, str3, str4, bundle);
    }
}
