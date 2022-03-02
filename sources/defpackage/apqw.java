package defpackage;

import android.content.Context;
import com.google.firebase.auth.ActionCodeSettings;

/* renamed from: apqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apqw extends apqg {
    private final String g;
    private final ActionCodeSettings h;

    public apqw(String str, String str2, aptp aptp, String str3, ActionCodeSettings actionCodeSettings, aptm aptm) {
        super(str, str2, aptp, aptm, "SendEmailVerification");
        this.g = str3;
        this.h = actionCodeSettings;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        String str = this.g;
        ActionCodeSettings actionCodeSettings = this.h;
        aptg aptg = this.a;
        iva.c(str);
        iva.a((Object) aptg);
        apul apul = new apul(aqkx.VERIFY_EMAIL);
        iva.c(str);
        apul.b = str;
        if (actionCodeSettings != null) {
            apul.a(actionCodeSettings);
        }
        apte.a(apul, aptg);
    }
}
