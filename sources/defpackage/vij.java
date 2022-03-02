package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.ContactInfo;

/* renamed from: vij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vij implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Contact[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ContactInfo contactInfo = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    uri = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 5:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 6:
                    contactInfo = (ContactInfo) ivw.a(parcel2, readInt, ContactInfo.CREATOR);
                    break;
                case 7:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new Contact(j, str, str2, uri, z, contactInfo, z2, z3);
    }
}
