package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: apqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apqu extends apqg {
    private final String g;
    private final PhoneAuthCredential h;

    public apqu(String str, String str2, aptp aptp, String str3, PhoneAuthCredential phoneAuthCredential, aptm aptm) {
        super(str, str2, aptp, aptm, "LinkFederatedCredential");
        this.g = str3;
        this.h = phoneAuthCredential;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        apvm a = apov.a(context, this.h, "LinkFederatedCredential");
        if (a == null) {
            this.a.a(new Status(17499, "Phone Number linking failed"));
            return;
        }
        String str = this.g;
        aptg aptg = this.a;
        iva.c(str);
        iva.a((Object) a);
        iva.a((Object) aptg);
        apte.a(str, (apts) new apsd(apte, a, context, aptg));
    }
}
