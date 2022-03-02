package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import java.util.Arrays;

@Deprecated
/* renamed from: esn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class esn implements ibj, ibl {
    public static final esn a = new esm().a();
    public final String b;
    public final boolean c;
    public final String d;

    public esn(esm esm) {
        this.b = esm.a;
        this.c = esm.b.booleanValue();
        this.d = esm.c;
    }

    public static esn a(Bundle bundle) {
        esm esm = new esm();
        ClassLoader classLoader = PasswordSpecification.class.getClassLoader();
        iva.a((Object) classLoader);
        bundle.setClassLoader(classLoader);
        String string = bundle.getString("consumer_package");
        if (!TextUtils.isEmpty(string)) {
            iva.a((Object) string);
            esm.a = string;
        }
        if (bundle.containsKey("force_save_dialog") && bundle.getBoolean("force_save_dialog", false)) {
            esm.b = true;
        }
        String string2 = bundle.getString("log_session_id");
        if (!TextUtils.isEmpty(string2)) {
            esm.c = string2;
        }
        return esm.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof esn) {
            esn esn = (esn) obj;
            return ius.a(this.b, esn.b) && this.c == esn.c && ius.a(this.d, esn.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), this.d});
    }
}
