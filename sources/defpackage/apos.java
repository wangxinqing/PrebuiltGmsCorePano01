package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.api.aidlrequests.VerifyBeforeUpdateEmailAidlRequest;

/* renamed from: apos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apos implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new VerifyBeforeUpdateEmailAidlRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        ActionCodeSettings actionCodeSettings = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                str2 = ivw.q(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                actionCodeSettings = (ActionCodeSettings) ivw.a(parcel, readInt, ActionCodeSettings.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new VerifyBeforeUpdateEmailAidlRequest(str, str2, actionCodeSettings);
    }
}
