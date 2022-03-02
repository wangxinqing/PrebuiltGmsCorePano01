package defpackage;

import android.os.Bundle;
import android.util.Patterns;

/* renamed from: fvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fvf {
    public final String a;
    public int b = 0;
    public byte[] c = null;
    public final Bundle d = new Bundle();

    public fvf(String str) {
        iva.c(str);
        if (Patterns.WEB_URL.matcher(str).matches()) {
            this.a = str;
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("The supplied url [ ");
        sb.append(str);
        sb.append("] is not match Patterns.WEB_URL!");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(String str, String str2) {
        iva.a(str, (Object) "Header name cannot be null or empty!");
        Bundle bundle = this.d;
        if (str2 == null) {
            str2 = "";
        }
        bundle.putString(str, str2);
    }
}
