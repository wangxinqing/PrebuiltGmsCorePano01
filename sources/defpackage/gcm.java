package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.GplusInfoRequest;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* renamed from: gcm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gcm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GplusInfoRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        CaptchaSolution captchaSolution = null;
        Account account = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                captchaSolution = (CaptchaSolution) ivw.a(parcel, readInt, CaptchaSolution.CREATOR);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                account = (Account) ivw.a(parcel, readInt, Account.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new GplusInfoRequest(i, str, captchaSolution, account);
    }
}
