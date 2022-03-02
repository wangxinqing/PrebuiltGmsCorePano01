package com.google.android.gms.contextmanager.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContextManagerClientInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jwv();
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    private bsz k;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContextManagerClientInfo(String str, String str2, int i2, String str3, int i3, int i4, int i5) {
        this(str, str2, i2, str3, i3, i4, (String) null, (String) null, -1, i5);
        iva.c(str);
        iva.c(str2);
        iva.c(str3);
    }

    public static ContextManagerClientInfo a(Context context, String str, grb grb) {
        Account account = grb.f;
        return new ContextManagerClientInfo(account == null ? str : account.name, context.getPackageName(), Process.myUid(), grb.a, jim.a(context, context.getPackageName()), grb.b, grb.c, grb.d, grb.e, Process.myPid());
    }

    public final boolean b() {
        return a() != null;
    }

    public final boolean c() {
        return this.f == 0;
    }

    public final boolean d() {
        return this.f == 1;
    }

    public final boolean e() {
        return this.f == 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContextManagerClientInfo) {
            ContextManagerClientInfo contextManagerClientInfo = (ContextManagerClientInfo) obj;
            return this.c == contextManagerClientInfo.c && this.e == contextManagerClientInfo.e && this.f == contextManagerClientInfo.f && this.i == contextManagerClientInfo.i && TextUtils.equals(this.a, contextManagerClientInfo.a) && TextUtils.equals(this.b, contextManagerClientInfo.b) && TextUtils.equals(this.d, contextManagerClientInfo.d) && TextUtils.equals(this.g, contextManagerClientInfo.g) && TextUtils.equals(this.h, contextManagerClientInfo.h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), this.g, this.h, Integer.valueOf(this.i)});
    }

    public final String toString() {
        String valueOf = String.valueOf(a());
        String str = this.b;
        int i2 = this.c;
        String str2 = this.d;
        int i3 = this.e;
        String num = Integer.toString(this.f);
        String str3 = this.g;
        String str4 = this.h;
        int i4 = this.j;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(num).length();
        StringBuilder sb = new StringBuilder(length + 89 + length2 + length3 + length4 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("(accnt=");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(str);
        sb.append("(");
        sb.append(i2);
        sb.append("):");
        sb.append(str2);
        sb.append(", vrsn=");
        sb.append(i3);
        sb.append(", ");
        sb.append(num);
        sb.append(", 3pPkg = ");
        sb.append(str3);
        sb.append(" ,  3pMdlId = ");
        sb.append(str4);
        sb.append(" ,  pid = ");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d, false);
        ivx.b(parcel, 6, this.e);
        ivx.b(parcel, 7, this.f);
        ivx.a(parcel, 8, this.g, false);
        ivx.a(parcel, 9, this.h, false);
        ivx.b(parcel, 10, this.i);
        ivx.b(parcel, 11, this.j);
        ivx.b(parcel, a2);
    }

    public ContextManagerClientInfo(String str, String str2, int i2, String str3, int i3, int i4, String str4, String str5, int i5, int i6) {
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = str3;
        this.e = i3;
        this.f = i4;
        this.g = str4;
        this.h = str5;
        this.i = i5;
        this.j = i6;
    }

    public final bsz a() {
        String str = this.a;
        if (str == null) {
            return null;
        }
        if (this.k == null) {
            this.k = new bsz(str);
        }
        return this.k;
    }
}
