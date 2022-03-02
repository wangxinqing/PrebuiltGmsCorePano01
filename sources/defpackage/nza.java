package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.OfflineSuggestion;

/* renamed from: nza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nza implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OfflineSuggestion[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                str2 = ivw.q(parcel, readInt);
            } else if (a == 4) {
                str4 = ivw.q(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                str3 = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new OfflineSuggestion(str, str2, str3, str4);
    }
}
