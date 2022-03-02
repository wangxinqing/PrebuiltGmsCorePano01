package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.model.SourcedContactPerson;

/* renamed from: dwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SourcedContactPerson[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ContactPerson contactPerson = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                contactPerson = (ContactPerson) ivw.a(parcel, readInt, ContactPerson.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new SourcedContactPerson(contactPerson, i);
    }
}
