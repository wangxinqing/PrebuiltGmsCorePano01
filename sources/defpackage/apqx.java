package defpackage;

import android.content.Context;
import com.google.firebase.auth.ActionCodeSettings;

/* renamed from: apqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apqx extends apqg {
    final String g;
    private final String h;
    private final ActionCodeSettings i;

    public apqx(String str, String str2, aptp aptp, String str3, ActionCodeSettings actionCodeSettings, String str4, aptm aptm) {
        super(str, str2, aptp, aptm, "SendGetOobConfirmationCodeEmail");
        this.h = str3;
        this.i = actionCodeSettings;
        this.g = str4;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        apul apul;
        String str = this.h;
        ActionCodeSettings actionCodeSettings = this.i;
        String str2 = this.g;
        aptg aptg = this.a;
        iva.c(str);
        iva.a((Object) aptg);
        aqkx a = aqkx.a(actionCodeSettings.i);
        if (a != null) {
            apul = new apul(a);
        } else {
            apul = new apul(aqkx.OOB_REQ_TYPE_UNSPECIFIED);
        }
        iva.c(str);
        apul.a = str;
        apul.a(actionCodeSettings);
        apul.d = str2;
        apte.b.a(apul, (apts) new aprv(aptg));
    }
}
