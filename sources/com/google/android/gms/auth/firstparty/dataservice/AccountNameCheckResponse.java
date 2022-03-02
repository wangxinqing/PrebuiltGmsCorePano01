package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountNameCheckResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gbe();
    final int a;
    String b;
    List c;
    String d;
    CaptchaChallenge e;

    public AccountNameCheckResponse(int i, String str, List list, String str2, CaptchaChallenge captchaChallenge) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = captchaChallenge;
    }

    public AccountNameCheckResponse(gei gei) {
        this(gei, (String) null, (CaptchaChallenge) null, Collections.EMPTY_LIST);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.b(parcel, a2);
    }

    public AccountNameCheckResponse(gei gei, String str, CaptchaChallenge captchaChallenge, List list) {
        this.a = 1;
        iva.a((Object) gei);
        this.b = gei.ac;
        this.d = str;
        this.e = captchaChallenge;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }
}
