package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: qah  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qah {
    public static final anax a = anax.a(new Scope("email"), new Scope("profile"), new Scope("openid"));
    public static final anax b;
    public final aucd c = aqll.k.o();
    private final TokenRequest d;
    private final Bundle e = new Bundle();

    static {
        anav j = anax.j();
        j.b((Iterable) a);
        j.b(new Scope("https://www.googleapis.com/auth/userinfo.email"));
        j.b(new Scope("https://www.googleapis.com/auth/userinfo.profile"));
        b = j.a();
    }

    private qah(Account account, String str) {
        this.d = new TokenRequest(account, str);
    }

    public static qah a(Account account, Iterable iterable) {
        String valueOf = String.valueOf(TextUtils.join(" ", amym.a(iterable).a(qaf.a).a((Comparator) anfh.a)));
        return new qah(account, valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf));
    }

    public final void b(String str) {
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aqll aqll = (aqll) aucd.b;
        aqll aqll2 = aqll.k;
        str.getClass();
        aqll.a |= 1024;
        aqll.j = str;
    }

    public static qah a(Account account, String str) {
        String valueOf = String.valueOf(str);
        return new qah(account, valueOf.length() == 0 ? new String("audience:server:client_id:") : "audience:server:client_id:".concat(valueOf));
    }

    public static qah a(Account account, String str, Iterable iterable) {
        return new qah(account, "oauth2:server:client_id:" + str + ":api_scope:" + TextUtils.join(" ", amym.a(iterable).a(qag.a).a((Comparator) anfh.a)));
    }

    public final void b(boolean z) {
        if (!z) {
            this.e.putString("oauth2_include_profile", "0");
        } else {
            this.e.putString("oauth2_include_profile", "1");
        }
    }

    public final TokenRequest a() {
        iva.a((Object) this.d.j, (Object) "consumer should be set");
        int a2 = aqlh.a(((aqll) this.c.b).i);
        boolean z = false;
        if (!(a2 == 0 || a2 == 1)) {
            z = true;
        }
        iva.b(z, "apiSurface should be set");
        this.e.putBoolean("suppressProgressScreen", true);
        this.e.putString("clientPackageName", "com.google.android.gms");
        Bundle bundle = this.e;
        Bundle bundle2 = new Bundle();
        bundle2.putByteArray("keyTokenRequestOptionsWrapperBundle", ((aqll) this.c.i()).k());
        bundle.putBundle("keyTokenRequestOptionsAuthExtrasBundle", bundle2);
        TokenRequest tokenRequest = this.d;
        tokenRequest.a(this.e);
        tokenRequest.f = new PACLConfig("", (String) null);
        return tokenRequest;
    }

    public final void a(int i) {
        aucd aucd = this.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aqll aqll = (aqll) aucd.b;
        aqll aqll2 = aqll.k;
        aqll.i = i - 1;
        aqll.a |= 512;
    }

    public final void a(int i, int i2) {
        aucd aucd = this.c;
        int a2 = aqln.a(i);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aqll aqll = (aqll) aucd.b;
        int i3 = a2 - 1;
        aqll aqll2 = aqll.k;
        if (a2 != 0) {
            aqll.e = i3;
            aqll.a |= 8;
            aucd aucd2 = this.c;
            int a3 = aqlp.a(i2);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aqll aqll3 = (aqll) aucd2.b;
            int i4 = a3 - 1;
            if (a3 != 0) {
                aqll3.f = i4;
                aqll3.a |= 16;
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void a(gda gda) {
        this.d.a(gda);
    }

    public final void a(String str) {
        this.e.putString("oauth2_prompt", str);
    }

    public final void a(String str, int i) {
        this.e.putString(eig.b, str);
        this.e.putInt(eig.a, i);
        String uuid = UUID.randomUUID().toString();
        this.d.j = new AppDescription(str, i, uuid, uuid);
    }

    public final void a(boolean z) {
        if (!z) {
            this.e.putString("oauth2_include_email", "0");
        } else {
            this.e.putString("oauth2_include_email", "1");
        }
    }
}
