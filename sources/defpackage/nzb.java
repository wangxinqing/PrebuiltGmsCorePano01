package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.SupportRequestHelp;

/* renamed from: nzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nzb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SupportRequestHelp[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        GoogleHelp googleHelp = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                googleHelp = (GoogleHelp) ivw.a(parcel, readInt, GoogleHelp.CREATOR);
            } else if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                str2 = ivw.q(parcel, readInt);
            } else if (a == 4) {
                str3 = ivw.q(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                str4 = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new SupportRequestHelp(googleHelp, str, str2, str3, str4);
    }
}
