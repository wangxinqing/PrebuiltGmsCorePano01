package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplefieldacl;
import java.util.HashSet;

/* renamed from: zis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zis implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Mergedpeoplefieldacl.Entries.Scope.Membership[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        Mergedpeoplefieldacl.Entries.Scope.Membership.Circle circle = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 2) {
                ivw.b(parcel, readInt);
            } else {
                circle = (Mergedpeoplefieldacl.Entries.Scope.Membership.Circle) ivw.a(parcel, readInt, Mergedpeoplefieldacl.Entries.Scope.Membership.Circle.CREATOR);
                hashSet.add(2);
            }
        }
        if (parcel.dataPosition() == b) {
            return new Mergedpeoplefieldacl.Entries.Scope.Membership(hashSet, circle);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
