package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import com.google.android.gms.auth.api.credentials.Credential;
import java.util.Locale;

/* renamed from: fqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fqg {
    public final int a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public fqg(fqf fqf) {
        this.a = fqf.a;
        this.c = fqf.b;
        this.d = fqf.d;
        this.e = fqf.e;
        this.b = fqf.c;
    }

    public static fqg a(Credential credential) {
        int i;
        fqf fqf = new fqf();
        if (!Patterns.EMAIL_ADDRESS.matcher(credential.a).matches()) {
            i = !Patterns.PHONE.matcher(credential.a).matches() ? 3 : 1;
        } else {
            i = 2;
        }
        if (!TextUtils.isEmpty(credential.b)) {
            fqf.d = credential.b;
            fqf.e = a(credential.a, i);
        } else {
            fqf.d = a(credential.a, i);
        }
        fqf.a(i);
        Uri uri = credential.c;
        if (uri != null) {
            fqf.b = uri.toString();
        }
        return fqf.a();
    }

    private static String a(String str, int i) {
        if (i != 1) {
            return str;
        }
        agxn a2 = agxn.a();
        try {
            str = a2.a(a2.a((CharSequence) str, Locale.getDefault().getCountry()), 3);
        } catch (agxm e2) {
        }
        return nn.a(Locale.getDefault()).a(str);
    }
}
