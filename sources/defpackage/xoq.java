package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.DeviceVersionEntity;
import com.google.android.gms.people.protomodel.SourceStatsEntity;
import java.util.ArrayList;

/* renamed from: xoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xoq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BackedUpContactsPerDeviceEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        Long l = null;
        ArrayList arrayList = null;
        String str2 = null;
        Long l2 = null;
        Long l3 = null;
        DeviceVersionEntity deviceVersionEntity = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel, readInt);
                    break;
                case 3:
                    arrayList = ivw.c(parcel, readInt, SourceStatsEntity.CREATOR);
                    break;
                case 4:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 5:
                    l2 = ivw.j(parcel, readInt);
                    break;
                case 6:
                    l3 = ivw.j(parcel, readInt);
                    break;
                case 7:
                    l = ivw.j(parcel, readInt);
                    break;
                case 8:
                    deviceVersionEntity = (DeviceVersionEntity) ivw.a(parcel, readInt, DeviceVersionEntity.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new BackedUpContactsPerDeviceEntity(str, l, arrayList, str2, l2, l3, deviceVersionEntity);
    }
}
