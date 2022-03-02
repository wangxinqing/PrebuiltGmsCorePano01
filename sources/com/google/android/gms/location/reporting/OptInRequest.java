package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OptInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rly();
    public final Account a;
    public final String b;
    public final String c;

    public OptInRequest(Account account, String str, String str2) {
        this.a = account;
        this.b = str;
        this.c = str2;
    }

    public static rlx a(Account account) {
        return new rlx(account);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OptInRequest) {
            OptInRequest optInRequest = (OptInRequest) obj;
            return this.a.equals(optInRequest.a) && ius.a(this.b, optInRequest.b) && ius.a(this.c, optInRequest.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String a2 = rmp.a(this.a);
        String str = this.b;
        String str2 = this.c;
        int length = String.valueOf(a2).length();
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("UploadRequest{, mAccount=");
        sb.append(a2);
        sb.append(", mTag='");
        sb.append(str);
        sb.append(", mAuditToken=");
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }

    public OptInRequest(rlx rlx) {
        this.a = rlx.a;
        this.b = rlx.b;
        this.c = rlx.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }
}
