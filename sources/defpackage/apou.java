package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.aidlresponses.OnFailedMfaSignInAidlResponse;
import com.google.firebase.auth.api.model.MfaInfo;
import java.util.ArrayList;

/* renamed from: apou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apou implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnFailedMfaSignInAidlResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        ArrayList arrayList = null;
        DefaultOAuthCredential defaultOAuthCredential = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                arrayList = ivw.c(parcel, readInt, MfaInfo.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                defaultOAuthCredential = (DefaultOAuthCredential) ivw.a(parcel, readInt, DefaultOAuthCredential.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new OnFailedMfaSignInAidlResponse(str, arrayList, defaultOAuthCredential);
    }
}
