package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import java.util.ArrayList;

/* renamed from: gbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gbe implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountNameCheckResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        CaptchaChallenge captchaChallenge = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                arrayList = ivw.C(parcel, readInt);
            } else if (a == 4) {
                str2 = ivw.q(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                captchaChallenge = (CaptchaChallenge) ivw.a(parcel, readInt, CaptchaChallenge.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new AccountNameCheckResponse(i, str, arrayList, str2, captchaChallenge);
    }
}
