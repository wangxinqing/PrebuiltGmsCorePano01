package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;

/* renamed from: igs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class igs extends abdq implements ica, icb {
    private static final ibn h = abaf.g;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final ise d;
    public abag e;
    public ifm f;
    public final ibn g;

    public igs(Context context, Handler handler, ise ise) {
        ibn ibn = h;
        this.a = context;
        this.b = handler;
        iva.a((Object) ise, (Object) "ClientSettings must not be null");
        this.d = ise;
        this.c = ise.b;
        this.g = ibn;
    }

    public final void a(int i) {
        this.e.j();
    }

    public final void g(Bundle bundle) {
        this.e.a(this);
    }

    public final void a(ConnectionResult connectionResult) {
        this.f.b(connectionResult);
    }

    public final void a(SignInResponse signInResponse) {
        this.b.post(new igr(this, signInResponse));
    }
}
