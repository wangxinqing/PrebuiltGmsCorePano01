package defpackage;

import android.content.Context;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.RegistrationInfo;

/* renamed from: yey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class yey extends iby {
    protected yey(Context context) {
        super(context, yef.a, (ibm) null, ibx.a);
    }

    private static acwa p() {
        return acws.a((Exception) new ibr(new Status(16)));
    }

    private final boolean q() {
        return hxk.d.b(this.c) == 0;
    }

    public final acwa a() {
        iha b = ihb.b();
        b.a = yeq.a;
        b.b = new Feature[]{ydy.b};
        return a(b.a());
    }

    public acwa b(String str, String str2, String str3) {
        if (!q()) {
            return p();
        }
        iha b = ihb.b();
        b.a = new yeo(str, str2, str3);
        return a(b.a());
    }

    public final acwa c(String str, String str2, String str3) {
        iha b = ihb.b();
        b.a = new yek(str, str2, str3);
        b.b = new Feature[]{ydy.c};
        return a(b.a());
    }

    @Deprecated
    public acwa g(String str) {
        iha b = ihb.b();
        b.a = new yeh(str);
        return a(b.a());
    }

    @Deprecated
    public final acwa h(String str) {
        iha b = ihb.b();
        b.a = new yej(str);
        return a(b.a());
    }

    public final acwa i(String str) {
        iha b = ihb.b();
        b.a = new yel(str);
        return a(b.a());
    }

    public yey(Activity activity) {
        super(activity, yef.a, ibx.a);
    }

    public acwa a(String str) {
        iha b = ihb.b();
        b.a = new yew(str);
        return a(b.a());
    }

    public acwa a(String str, int i, String[] strArr, byte[] bArr) {
        iha b = ihb.b();
        b.a = new yeg(str, i, strArr, bArr);
        return a(b.a());
    }

    public final acwa a(String str, int i, String[] strArr, byte[] bArr, String str2) {
        iha b = ihb.b();
        b.a = new yem(str, i, strArr, bArr, str2);
        return a(b.a());
    }

    public acwa a(String str, int i, String[] strArr, int[] iArr) {
        iha b = ihb.b();
        b.a = new yer(str, i, strArr, iArr);
        return a(b.a());
    }

    public final acwa a(String str, String str2) {
        if (!q()) {
            return p();
        }
        iha b = ihb.b();
        b.a = new yex(str, str2);
        return a(b.a());
    }

    public acwa a(String str, String str2, String str3) {
        iha b = ihb.b();
        b.a = new yev(str, str2, str3);
        return a(b.a());
    }

    public final acwa a(String str, String str2, String str3, String str4) {
        if (!q()) {
            return p();
        }
        iha b = ihb.b();
        b.a = new yep(str, str2, str3, str4);
        return a(b.a());
    }

    public acwa a(String str, String str2, Flag[] flagArr) {
        if (!q()) {
            return p();
        }
        iha b = ihb.b();
        b.a = new yen(str, str2, flagArr);
        return a(b.a());
    }

    public final acwa a(String str, byte[] bArr) {
        if (!q()) {
            return p();
        }
        iha b = ihb.b();
        b.a = new yet(str, bArr);
        return a(b.a());
    }

    public final acwa a(RegistrationInfo[] registrationInfoArr) {
        if (!q()) {
            return p();
        }
        iha b = ihb.b();
        b.a = new yes(registrationInfoArr);
        return a(b.a());
    }
}
