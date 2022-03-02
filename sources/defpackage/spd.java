package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* renamed from: spd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class spd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConditionalUserPropertyParcel[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        UserAttributeParcel userAttributeParcel = null;
        String str3 = null;
        EventParcel eventParcel = null;
        EventParcel eventParcel2 = null;
        EventParcel eventParcel3 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    userAttributeParcel = (UserAttributeParcel) ivw.a(parcel2, readInt, UserAttributeParcel.CREATOR);
                    break;
                case 5:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 6:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 7:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    eventParcel = (EventParcel) ivw.a(parcel2, readInt, EventParcel.CREATOR);
                    break;
                case 9:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 10:
                    eventParcel2 = (EventParcel) ivw.a(parcel2, readInt, EventParcel.CREATOR);
                    break;
                case 11:
                    j3 = ivw.i(parcel2, readInt);
                    break;
                case 12:
                    eventParcel3 = (EventParcel) ivw.a(parcel2, readInt, EventParcel.CREATOR);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new ConditionalUserPropertyParcel(str, str2, userAttributeParcel, j, z, str3, eventParcel, j2, eventParcel2, j3, eventParcel3);
    }
}
