package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.UserManager;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: ejq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ejq {
    public final UserManager a;
    public final String b;
    private SharedPreferences c;
    private final Context d;

    public ejq(Context context) {
        String packageName = context.getPackageName();
        this.d = context;
        this.a = (UserManager) context.getSystemService("user");
        amrl.a((Object) packageName);
        this.b = packageName;
    }

    private final synchronized SharedPreferences b() {
        if (this.c == null) {
            SharedPreferences sharedPreferences = this.d.getSharedPreferences("auth.google.account.authenticator.prefs", 0);
            amrl.a((Object) sharedPreferences);
            this.c = sharedPreferences;
        }
        return this.c;
    }

    public final Collection a() {
        List list;
        int i = Build.VERSION.SDK_INT;
        String[] stringArray = this.a.getApplicationRestrictions(this.b).getStringArray("auth_account:allowed_domains");
        if (stringArray != null) {
            list = Collections.unmodifiableList(Arrays.asList(stringArray));
        } else {
            list = null;
        }
        if (list != null) {
            return list;
        }
        String string = b().getString("domain", (String) null);
        if (string != null) {
            return Collections.unmodifiableList(Arrays.asList(TextUtils.split(string, ",")));
        }
        return null;
    }

    public final void a(Collection collection) {
        amrl.a((Object) collection);
        SharedPreferences.Editor edit = b().edit();
        edit.putString("domain", TextUtils.join(",", collection));
        edit.commit();
    }
}
