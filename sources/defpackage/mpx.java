package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.family.v2.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;

/* renamed from: mpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mpx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ContactPerson[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        Long l = null;
        AvatarReference avatarReference = null;
        ArrayList arrayList = null;
        Uri uri = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                l = ivw.j(parcel, readInt);
            } else if (a == 3) {
                avatarReference = (AvatarReference) ivw.a(parcel, readInt, AvatarReference.CREATOR);
            } else if (a == 4) {
                arrayList = ivw.c(parcel, readInt, ContactPerson.ContactMethod.CREATOR);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                uri = (Uri) ivw.a(parcel, readInt, Uri.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ContactPerson(str, l, avatarReference, arrayList, uri);
    }
}
