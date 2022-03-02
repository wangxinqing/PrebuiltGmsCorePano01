package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PIMEUpdate;

/* renamed from: dtd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dtd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PIMEUpdate[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        Account account = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    bArr = ivw.t(parcel2, readInt);
                    break;
                case 2:
                    bArr2 = ivw.t(parcel2, readInt);
                    break;
                case 3:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 4:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 9:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 10:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 11:
                    account = (Account) ivw.a(parcel2, readInt, Account.CREATOR);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new PIMEUpdate(bArr, bArr2, i, str, str2, z, bundle, j, j2, account);
    }
}
