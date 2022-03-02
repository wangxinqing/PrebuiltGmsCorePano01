package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;
import org.chromium.net.UrlRequest;

/* renamed from: ajmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajmt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountConfig[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        Account account = null;
        String str = null;
        String str2 = null;
        Conditions conditions = null;
        String str3 = null;
        Long l = null;
        Long l2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i2 = 0;
        boolean z7 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    account = (Account) ivw.a(parcel2, readInt, Account.CREATOR);
                    break;
                case 3:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 4:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 5:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 6:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 7:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case 9:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 10:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 11:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 12:
                    z5 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    z6 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    conditions = (Conditions) ivw.a(parcel2, readInt, Conditions.CREATOR);
                    break;
                case Service.START_CONTINUATION_MASK:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 16:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 17:
                    l = ivw.j(parcel2, readInt);
                    break;
                case 18:
                    l2 = ivw.j(parcel2, readInt);
                    break;
                case 19:
                    z7 = ivw.c(parcel2, readInt);
                    break;
                case 20:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new AccountConfig(account, z, j, z2, z3, str, z4, str2, j2, i, z5, z6, conditions, i2, str3, l, l2, z7, i3);
    }
}
