package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.reporting.UploadRequest;

/* renamed from: rmk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rmk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UploadRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        Account account = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    account = (Account) ivw.a(parcel, readInt, Account.CREATOR);
                    break;
                case 3:
                    str = ivw.q(parcel, readInt);
                    break;
                case 4:
                    j = ivw.i(parcel, readInt);
                    break;
                case 5:
                    j2 = ivw.i(parcel, readInt);
                    break;
                case 6:
                    j3 = ivw.i(parcel, readInt);
                    break;
                case 7:
                    str2 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new UploadRequest(account, str, j, j2, j3, str2);
    }
}
