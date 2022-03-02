package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: apre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apre extends apqg {
    private final PhoneAuthCredential g;
    private final String h;

    public apre(String str, String str2, aptp aptp, PhoneAuthCredential phoneAuthCredential, String str3, aptm aptm) {
        super(str, str2, aptp, aptm, "SignInWithPhoneNumber");
        this.g = phoneAuthCredential;
        this.h = str3;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        apvm a = apov.a(context, this.g, "SignInWithPhoneNumber");
        if (a == null) {
            this.a.a(new Status(17499, "Phone Number instant validation failed!"));
            return;
        }
        a.i = this.h;
        aptg aptg = this.a;
        iva.a((Object) a);
        iva.a((Object) aptg);
        apte.b.a(context, a, (apts) new apsa(apte, aptg));
    }
}
