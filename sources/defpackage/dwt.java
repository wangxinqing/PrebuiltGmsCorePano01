package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;

/* renamed from: dwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ContactPerson[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        Long l = null;
        AvatarReference avatarReference = null;
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 4:
                    l = ivw.j(parcel, readInt);
                    break;
                case 5:
                    avatarReference = (AvatarReference) ivw.a(parcel, readInt, AvatarReference.CREATOR);
                    break;
                case 6:
                    arrayList = ivw.c(parcel, readInt, ContactPerson.ContactMethod.CREATOR);
                    break;
                case 7:
                    i = ivw.g(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new ContactPerson(str, str2, l, avatarReference, arrayList, i);
    }
}
