package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusIMEInfo;

/* renamed from: dtk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dtk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RegisterCorpusIMEInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String[] strArr = null;
        String str = null;
        String str2 = null;
        String[] strArr2 = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                strArr = ivw.A(parcel, readInt);
            } else if (a == 3) {
                str = ivw.q(parcel, readInt);
            } else if (a == 4) {
                str2 = ivw.q(parcel, readInt);
            } else if (a == 6) {
                str3 = ivw.q(parcel, readInt);
            } else if (a != 7) {
                ivw.b(parcel, readInt);
            } else {
                strArr2 = ivw.A(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new RegisterCorpusIMEInfo(i, strArr, str, str2, strArr2, str3);
    }
}
