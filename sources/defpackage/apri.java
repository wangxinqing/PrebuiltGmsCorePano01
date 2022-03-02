package defpackage;

import android.content.Context;
import com.google.firebase.auth.UserProfileChangeRequest;

/* renamed from: apri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apri extends apqg {
    private final String g;
    private final UserProfileChangeRequest h;

    public apri(String str, String str2, aptp aptp, String str3, UserProfileChangeRequest userProfileChangeRequest, aptm aptm) {
        super(str, str2, aptp, aptm, "UpdateProfile");
        this.g = str3;
        this.h = userProfileChangeRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, apte apte) {
        String str = this.g;
        UserProfileChangeRequest userProfileChangeRequest = this.h;
        aptg aptg = this.a;
        iva.c(str);
        iva.a((Object) userProfileChangeRequest);
        iva.a((Object) aptg);
        apte.a(str, (apts) new apsz(apte, userProfileChangeRequest, aptg));
    }
}
