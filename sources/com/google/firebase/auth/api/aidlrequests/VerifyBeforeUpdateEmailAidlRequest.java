package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class VerifyBeforeUpdateEmailAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apos();
    public final String a;
    public final String b;
    public final ActionCodeSettings c;

    public VerifyBeforeUpdateEmailAidlRequest(String str, String str2, ActionCodeSettings actionCodeSettings) {
        this.a = str;
        this.b = str2;
        this.c = actionCodeSettings;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
