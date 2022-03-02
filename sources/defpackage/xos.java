package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.BirthdayEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;

/* renamed from: xos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xos implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BirthdayEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        Long l = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                personFieldMetadataEntity = (PersonFieldMetadataEntity) ivw.a(parcel, readInt, PersonFieldMetadataEntity.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                l = ivw.j(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new BirthdayEntity(personFieldMetadataEntity, l);
    }
}
