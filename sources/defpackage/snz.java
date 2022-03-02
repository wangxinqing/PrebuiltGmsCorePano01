package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdns.MdnsServiceInfo;
import java.util.ArrayList;

/* renamed from: snz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class snz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MdnsServiceInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String[] strArr = null;
        ArrayList arrayList = null;
        String[] strArr2 = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel, readInt);
                    break;
                case 3:
                    strArr = ivw.A(parcel, readInt);
                    break;
                case 4:
                    arrayList = ivw.C(parcel, readInt);
                    break;
                case 5:
                    strArr2 = ivw.A(parcel, readInt);
                    break;
                case 6:
                    i = ivw.g(parcel, readInt);
                    break;
                case 7:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 8:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 9:
                    arrayList2 = ivw.C(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new MdnsServiceInfo(str, strArr, arrayList, strArr2, i, str2, str3, arrayList2);
    }
}
