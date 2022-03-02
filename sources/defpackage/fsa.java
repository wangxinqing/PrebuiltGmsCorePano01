package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.auth.api.identity.SignInCredential;

/* renamed from: fsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fsa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CompleteSignInResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        SignInCredential signInCredential = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 1) {
                ivw.b(parcel, readInt);
            } else {
                signInCredential = (SignInCredential) ivw.a(parcel, readInt, SignInCredential.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new CompleteSignInResult(signInCredential);
    }
}
