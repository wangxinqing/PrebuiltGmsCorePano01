package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;

/* renamed from: ezd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ezd extends bp {
    private final Application a;
    private final String b;
    private final GetSignInIntentRequest c;
    private final CharSequence d;
    private final Bitmap e;

    public ezd(Application application, String str, GetSignInIntentRequest getSignInIntentRequest, CharSequence charSequence, Bitmap bitmap) {
        this.a = application;
        this.b = str;
        this.c = getSignInIntentRequest;
        this.d = charSequence;
        this.e = bitmap;
    }

    public final bl a(Class cls) {
        boolean z;
        if (cls == eze.class) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "GoogleSignInViewModel.Factory can only be used to for GoogleSignInViewModel.");
        return new eze(this.a, this.b, this.c, this.d, this.e);
    }
}
