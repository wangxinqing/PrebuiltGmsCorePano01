package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.cryptauth.AppClaim;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* renamed from: gan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gan implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new KeyRegistrationResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Status status = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                status = (Status) ivw.a(parcel, readInt, Status.CREATOR);
            } else if (a == 3) {
                bArr = ivw.t(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                arrayList = ivw.c(parcel, readInt, AppClaim.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new KeyRegistrationResult(i, status, bArr, arrayList);
    }
}
