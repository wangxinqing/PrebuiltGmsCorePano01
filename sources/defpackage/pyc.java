package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import javax.crypto.SecretKey;

/* renamed from: pyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pyc {
    public SecretKey a;
    public SecretKey b;
    private final SharedPreferences c;
    private final String d;
    private final pyh e;

    public pyc(SharedPreferences sharedPreferences, pyh pyh, String str) {
        iva.a((Object) sharedPreferences, (Object) "Preferences must not be null.");
        this.c = sharedPreferences;
        iva.a((Object) pyh, (Object) "Secret key wrapper must not be null.");
        this.e = pyh;
        iva.a(str, (Object) "Secret key wrapper must not be null.");
        this.d = str;
    }

    public final SecretKey a(String str) {
        String string = this.c.getString(str, (String) null);
        if (!TextUtils.isEmpty(string)) {
            return this.e.a(Base64.decode(string, 10), this.d);
        }
        return null;
    }

    public final void a(String str, SecretKey secretKey) {
        this.c.edit().putString(str, Base64.encodeToString(this.e.a(secretKey), 10)).commit();
    }
}
