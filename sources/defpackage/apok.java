package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.api.aidlrequests.SignInWithEmailLinkAidlRequest;

/* renamed from: apok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apok implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SignInWithEmailLinkAidlRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        EmailAuthCredential emailAuthCredential = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 1) {
                ivw.b(parcel, readInt);
            } else {
                emailAuthCredential = (EmailAuthCredential) ivw.a(parcel, readInt, EmailAuthCredential.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new SignInWithEmailLinkAidlRequest(emailAuthCredential);
    }
}
