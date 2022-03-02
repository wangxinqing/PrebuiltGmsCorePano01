package defpackage;

import android.content.Context;
import com.google.firebase.auth.EmailAuthCredential;

/* renamed from: aprd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aprd extends apqg {
    private final EmailAuthCredential g;

    public aprd(String str, String str2, aptp aptp, EmailAuthCredential emailAuthCredential, aptm aptm) {
        super(str, str2, aptp, aptm, "SignInWithCredential");
        this.g = emailAuthCredential;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        EmailAuthCredential emailAuthCredential = this.g;
        aptg aptg = this.a;
        iva.a((Object) emailAuthCredential);
        iva.a((Object) aptg);
        if (emailAuthCredential.e) {
            apte.a(emailAuthCredential.d, (apts) new aprp(apte, emailAuthCredential, aptg));
        } else {
            apte.a(new aptz(emailAuthCredential, (String) null), aptg);
        }
    }
}
