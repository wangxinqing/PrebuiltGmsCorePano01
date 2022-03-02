package defpackage;

import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;

/* renamed from: nli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nli implements ibj, ibl, ibi {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final String f;
    public final ArrayList g;
    public final boolean h;
    public final boolean i;
    public final GoogleSignInAccount j;
    public final String k;
    public final int l = 0;
    public final int m;

    public nli(boolean z, boolean z2, int i2, boolean z3, int i3, String str, ArrayList arrayList, boolean z4, boolean z5, GoogleSignInAccount googleSignInAccount, String str2, int i4) {
        this.a = z;
        this.b = z2;
        this.c = i2;
        this.d = z3;
        this.e = i3;
        this.f = str;
        this.g = arrayList;
        this.h = z4;
        this.i = z5;
        this.j = googleSignInAccount;
        this.k = str2;
        this.m = i4;
    }

    public final GoogleSignInAccount a() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        String str;
        GoogleSignInAccount googleSignInAccount;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nli)) {
            return false;
        }
        nli nli = (nli) obj;
        if (this.a == nli.a && this.b == nli.b && this.c == nli.c && this.d == nli.d && this.e == nli.e && ((str = this.f) == null ? nli.f == null : str.equals(nli.f)) && this.g.equals(nli.g) && this.h == nli.h && this.i == nli.i && ((googleSignInAccount = this.j) == null ? nli.j == null : googleSignInAccount.equals(nli.j)) && TextUtils.equals(this.k, nli.k)) {
            int i2 = nli.l;
            if (this.m == nli.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3 = ((((((((((this.a ? 1 : 0) + true) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31) + (this.d ? 1 : 0)) * 31) + this.e) * 31;
        String str = this.f;
        int i4 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode = (((((((i3 + i2) * 31) + this.g.hashCode()) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31;
        GoogleSignInAccount googleSignInAccount = this.j;
        int hashCode2 = (hashCode + (googleSignInAccount != null ? googleSignInAccount.hashCode() : 0)) * 31;
        String str2 = this.k;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return ((hashCode2 + i4) * 961) + this.m;
    }
}
