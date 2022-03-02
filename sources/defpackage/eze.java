package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;

/* renamed from: eze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eze extends p {
    public final String c;
    public final GetSignInIntentRequest d;
    public final CharSequence e;
    public final Bitmap f;
    public final aw g = new aw();
    public final aw h = new aw();
    public final aw i;
    public final aw j;
    public final qci k;
    public Bitmap l;
    public ezg m;

    public eze(Application application, String str, GetSignInIntentRequest getSignInIntentRequest, CharSequence charSequence, Bitmap bitmap) {
        super(application);
        this.c = str;
        this.d = getSignInIntentRequest;
        this.e = charSequence;
        this.f = bitmap;
        aw awVar = new aw();
        this.i = awVar;
        awVar.b(false);
        this.j = new aw();
        this.k = new qci();
    }

    public final void a(int i2) {
        this.g.c(Integer.valueOf(i2));
    }

    public final void a(ezc ezc) {
        this.j.c(ezc);
    }

    public final void a(ezf ezf) {
        this.k.c(ezf);
    }

    public final void a(boolean z) {
        this.i.c(Boolean.valueOf(z));
    }
}
