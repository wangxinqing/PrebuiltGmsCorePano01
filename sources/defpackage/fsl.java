package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.ListSignInCredentialsResult;
import java.util.ArrayList;

/* renamed from: fsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fsl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ListSignInCredentialsResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 1) {
                ivw.b(parcel, readInt);
            } else {
                arrayList = ivw.c(parcel, readInt, InternalSignInCredentialWrapper.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ListSignInCredentialsResult(arrayList);
    }
}
