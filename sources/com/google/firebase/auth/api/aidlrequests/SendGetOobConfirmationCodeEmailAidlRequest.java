package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SendGetOobConfirmationCodeEmailAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apod();
    public final String a;
    public final ActionCodeSettings b;
    public final String c;

    public SendGetOobConfirmationCodeEmailAidlRequest(String str, ActionCodeSettings actionCodeSettings, String str2) {
        this.a = str;
        this.b = actionCodeSettings;
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
