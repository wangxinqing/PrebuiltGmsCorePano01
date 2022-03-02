package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.BirthdayEntity;
import com.google.android.gms.people.protomodel.EmailEntity;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.PersonEntity;
import com.google.android.gms.people.protomodel.PhoneEntity;
import com.google.android.gms.people.protomodel.PhotoEntity;
import java.util.ArrayList;

/* renamed from: xpb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xpb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 9) {
                arrayList5 = ivw.c(parcel, readInt, BirthdayEntity.CREATOR);
            } else if (a == 11) {
                arrayList3 = ivw.c(parcel, readInt, EmailEntity.CREATOR);
            } else if (a == 13) {
                arrayList4 = ivw.c(parcel, readInt, PhoneEntity.CREATOR);
            } else if (a == 4) {
                arrayList = ivw.c(parcel, readInt, NameEntity.CREATOR);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                arrayList2 = ivw.c(parcel, readInt, PhotoEntity.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new PersonEntity(str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }
}
