package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.signin.activity.SignInChimeraActivity;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: abce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abce implements Callable {
    private final SignInChimeraActivity a;

    public abce(SignInChimeraActivity signInChimeraActivity) {
        this.a = signInChimeraActivity;
    }

    public final Object call() {
        SignInChimeraActivity signInChimeraActivity = this.a;
        try {
            Context baseContext = signInChimeraActivity.getBaseContext();
            izd izd = new izd(baseContext, (String) abdl.d.c(), ((Integer) abdl.e.c()).intValue());
            izd.a("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
            izd.a("X-Android-Package", baseContext.getPackageName());
            izd.a("X-Android-Cert", jhg.h(baseContext, baseContext.getPackageName()));
            abdm abdm = new abdm(izd);
            String str = signInChimeraActivity.d;
            amrl.a((Object) str);
            byte[] bArr = (byte[]) amrl.a((Object) jhg.f(signInChimeraActivity.getBaseContext(), str));
            aucd o = auid.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            str.getClass();
            ((auid) o.b).b = str;
            String encodeToString = Base64.encodeToString(bArr, 2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            encodeToString.getClass();
            ((auid) o.b).a = encodeToString;
            auid auid = (auid) o.i();
            aucd o2 = auif.b.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            auid.getClass();
            ((auif) o2.b).a = auid;
            auif auif = (auif) o2.i();
            if (abdm.b == null) {
                abdm.b = baaj.a(baai.UNARY, "google.identity.clientauthconfig.v1.ClientAuthConfig/GetClientBrand", baoq.a(auif.b), baoq.a(auie.c));
            }
            auie auie = (auie) abdm.a.a(abdm.b, auif, 10000, TimeUnit.MILLISECONDS);
            if (auie != null) {
                aucx aucx = auie.a;
                if (!aucx.isEmpty()) {
                    signInChimeraActivity.h = (String) aucx.get(0);
                }
                aucx aucx2 = auie.b;
                if (!aucx2.isEmpty()) {
                    signInChimeraActivity.i = (String) aucx2.get(0);
                }
                return amri.b(2);
            }
            throw new IOException("No Brand found for the calling package.");
        } catch (babk e) {
            throw new IOException(e);
        }
    }
}
