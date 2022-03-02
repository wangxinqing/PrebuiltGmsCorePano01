package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RegisterCorpusInfoCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aahz();
    public String a;
    public String b;
    public RegisterCorpusInfo c;

    public RegisterCorpusInfoCall$Request() {
    }

    public RegisterCorpusInfoCall$Request(String str, String str2, RegisterCorpusInfo registerCorpusInfo) {
        this.a = str;
        this.b = str2;
        this.c = registerCorpusInfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
