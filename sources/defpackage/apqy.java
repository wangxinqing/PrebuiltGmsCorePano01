package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: apqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apqy extends apqg {
    private final String g;

    public apqy(String str, String str2, aptp aptp, String str3, aptm aptm) {
        super(str, str2, aptp, aptm, "SendPasswordResetEmail");
        this.g = str3;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        String str = this.g;
        aptg aptg = this.a;
        iva.a((Object) aptg);
        aptt aptt = apte.b;
        apsv apsv = new apsv(aptg);
        SharedPreferences.Editor putBoolean = aptt.c.getSharedPreferences(String.format("com.google.firebase.auth.internal.proxyApiHelper.%s", new Object[]{aptt.b.a}), 0).edit().putBoolean("com.google.firebase.auth.internal.FIREBASE_UI_BIT", true ^ TextUtils.isEmpty(str));
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        putBoolean.putString("com.google.firebase.auth.internal.FIREBASE_UI_VERSION", str).apply();
        apsv.a((Object) null);
    }
}
