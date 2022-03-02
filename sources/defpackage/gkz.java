package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.uiflows.addaccount.AccountDetail;

/* renamed from: gkz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gkz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountDetail[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Intent intent = null;
        String str4 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel, readInt);
                    break;
                case 2:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 3:
                    z = ivw.c(parcel, readInt);
                    break;
                case 4:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 5:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 6:
                    intent = (Intent) ivw.a(parcel, readInt, Intent.CREATOR);
                    break;
                case 7:
                    str4 = ivw.q(parcel, readInt);
                    break;
                case 8:
                    z3 = ivw.c(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new AccountDetail(str, str2, z, str3, z2, intent, str4, z3);
    }
}
