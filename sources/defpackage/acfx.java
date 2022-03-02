package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.util.Base64;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: acfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acfx implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Account b;
    final /* synthetic */ boolean c;
    final /* synthetic */ acga d;

    public acfx(acga acga, String str, Account account, boolean z) {
        this.d = acga;
        this.a = str;
        this.b = account;
        this.c = z;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        byte[] decode = Base64.decode(this.a, 11);
        Challenge challenge = new Challenge();
        challenge.e(this.b.name);
        challenge.a(0);
        challenge.c(decode);
        challenge.d(new byte[0]);
        Assertion a2 = this.d.e.a(challenge, this.c, true);
        acga acga = this.d;
        aqdi a3 = acga.e.a(a2);
        Account account = this.b;
        String uri = new Uri.Builder().scheme("https").encodedAuthority(azkv.a.a().b()).appendPath("v1").appendPath("challenges").appendPath(Base64.encodeToString(a3.f.k(), 11)).appendEncodedPath("assertion:record").build().toString();
        acga.a.b(uri.toString(), new Object[0]);
        aucd o = auro.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auro auro = (auro) o.b;
        a3.getClass();
        auro.b = a3;
        auro.a |= 2;
        String a4 = eig.a(acga.g, account, "oauth2:https://www.googleapis.com/auth/cryptauth");
        RequestFuture newFuture = RequestFuture.newFuture();
        acga.c.add(new izs(1, uri, ((auro) o.i()).k(), auro.c, newFuture, newFuture, a4, (String) null, false, new HashMap(), 153, -1));
        newFuture.get();
        return a2;
    }
}
