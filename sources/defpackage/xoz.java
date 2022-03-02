package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;

/* renamed from: xoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xoz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NameEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a != 17) {
                switch (a) {
                    case 2:
                        personFieldMetadataEntity = (PersonFieldMetadataEntity) ivw.a(parcel, readInt, PersonFieldMetadataEntity.CREATOR);
                        break;
                    case 3:
                        str = ivw.q(parcel, readInt);
                        break;
                    case 4:
                        str6 = ivw.q(parcel, readInt);
                        break;
                    case 5:
                        str3 = ivw.q(parcel, readInt);
                        break;
                    case 6:
                        str4 = ivw.q(parcel, readInt);
                        break;
                    case 7:
                        str5 = ivw.q(parcel, readInt);
                        break;
                    default:
                        ivw.b(parcel, readInt);
                        break;
                }
            } else {
                str2 = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new NameEntity(personFieldMetadataEntity, str, str2, str3, str4, str5, str6);
    }
}
