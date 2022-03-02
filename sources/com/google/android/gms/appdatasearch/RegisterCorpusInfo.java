package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RegisterCorpusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dtm();
    public final String a;
    public final String b;
    public final Uri c;
    public final RegisterSectionInfo[] d;
    public final GlobalSearchCorpusConfig e;
    public final boolean f;
    public final Account g;
    public final RegisterCorpusIMEInfo h;
    public final String i;
    @Deprecated
    public final boolean j;
    public final int k;

    public RegisterCorpusInfo(String str, String str2, Uri uri, RegisterSectionInfo[] registerSectionInfoArr, GlobalSearchCorpusConfig globalSearchCorpusConfig, boolean z, Account account, RegisterCorpusIMEInfo registerCorpusIMEInfo, String str3, boolean z2, int i2) {
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = registerSectionInfoArr;
        this.e = globalSearchCorpusConfig;
        this.f = z;
        this.g = account;
        this.h = registerCorpusIMEInfo;
        this.i = str3;
        this.j = z2;
        this.k = i2;
    }

    public static dtl a(String str) {
        return new dtl(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterCorpusInfo) {
            RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) obj;
            return this.j == registerCorpusInfo.j && this.k == registerCorpusInfo.k && this.f == registerCorpusInfo.f && ius.a(this.a, registerCorpusInfo.a) && ius.a(this.b, registerCorpusInfo.b) && ius.a(this.c, registerCorpusInfo.c) && ius.a(this.e, registerCorpusInfo.e) && ius.a(this.h, registerCorpusInfo.h) && ius.a(this.g, registerCorpusInfo.g) && ius.a(this.i, registerCorpusInfo.i) && Arrays.equals(this.d, registerCorpusInfo.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), this.e, Boolean.valueOf(this.f), this.g, this.h, this.i, Boolean.valueOf(this.j), Integer.valueOf(this.k)});
    }

    public final RegisterCorpusInfo a(Account account) {
        String encode = Uri.encode(account.type);
        String encode2 = Uri.encode(account.name);
        StringBuilder sb = new StringBuilder(String.valueOf(encode).length() + 1 + String.valueOf(encode2).length());
        sb.append(encode);
        sb.append("/");
        sb.append(encode2);
        String sb2 = sb.toString();
        String str = this.a;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(sb2).length());
        sb3.append(str);
        sb3.append("/");
        sb3.append(sb2);
        String sb4 = sb3.toString();
        Uri build = this.c.buildUpon().appendEncodedPath(sb2).build();
        dtl dtl = new dtl(sb4);
        dtl.a = this.b;
        dtl.b = build;
        Collections.addAll(dtl.c, this.d);
        dtl.d = this.e;
        dtl.e = this.f;
        dtl.f = account;
        dtl.g = this.h;
        dtl.h = this.i;
        dtl.i = this.j;
        dtl.j = this.k;
        return dtl.a();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i2, false);
        ivx.a(parcel, 4, (Parcelable[]) this.d, i2);
        ivx.a(parcel, 7, this.e, i2, false);
        ivx.a(parcel, 8, this.f);
        ivx.a(parcel, 9, this.g, i2, false);
        ivx.a(parcel, 10, this.h, i2, false);
        ivx.a(parcel, 11, this.i, false);
        ivx.a(parcel, 12, this.j);
        ivx.b(parcel, 13, this.k);
        ivx.b(parcel, a2);
    }
}
