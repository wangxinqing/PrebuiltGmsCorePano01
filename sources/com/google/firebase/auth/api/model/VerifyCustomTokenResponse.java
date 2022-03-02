package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class VerifyCustomTokenResponse extends AbstractSafeParcelable implements apth {
    public static final Parcelable.Creator CREATOR = new apvj();
    public String a;
    public String b;
    public long c;
    public boolean d;

    public VerifyCustomTokenResponse() {
    }

    public final auef a() {
        return (auef) alna.e.c(7);
    }

    public VerifyCustomTokenResponse(String str, String str2, long j, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d);
        ivx.b(parcel, a2);
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        if (audx instanceof alna) {
            alna alna = (alna) audx;
            this.a = jlh.b(alna.a);
            this.b = jlh.b(alna.b);
            this.c = alna.c;
            this.d = alna.d;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of VerifyCustomTokenResponse.");
    }
}
