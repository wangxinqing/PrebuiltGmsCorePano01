package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import java.util.HashSet;

/* renamed from: wzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wzc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PersonImpl.RelationshipInterestsImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        PersonImpl.MetadataImpl metadataImpl = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                metadataImpl = (PersonImpl.MetadataImpl) ivw.a(parcel, readInt, PersonImpl.MetadataImpl.CREATOR);
                hashSet.add(2);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                str = ivw.q(parcel, readInt);
                hashSet.add(3);
            }
        }
        if (parcel.dataPosition() == b) {
            return new PersonImpl.RelationshipInterestsImpl(hashSet, metadataImpl, str);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
