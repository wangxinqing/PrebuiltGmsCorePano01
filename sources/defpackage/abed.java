package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.signin.activity.SignInChimeraActivity;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: abed  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abed extends nis {
    private static final iwd a = abeb.b("AuthAccountOperation");
    private static final anax b = anax.a((Object) 8, (Object) 7);
    private final abfa c;
    private final abev d;
    private final AuthAccountRequest e;
    private final abdr f;
    private final abez g;

    public abed(abev abev, AuthAccountRequest authAccountRequest, abdr abdr) {
        super(44, "AuthAccount");
        this.c = abfa.a((Context) abev.b);
        this.d = abev;
        this.e = authAccountRequest;
        this.f = abdr;
        this.g = azgw.b() ? abez.a : null;
    }

    private final abfb a() {
        Set d2 = this.d.d();
        abez abez = this.g;
        if (abez != null) {
            abev abev = this.d;
            if (abez.b(abev.c, abev.h())) {
                abez abez2 = this.g;
                abev abev2 = this.d;
                Set a2 = abez2.a(abev2.c, abev2.h());
                amrl.a((Object) a2);
                d2 = new HashSet(a2);
                d2.retainAll(this.d.d());
            }
        }
        qah a3 = qah.a(this.d.h(), (Iterable) d2);
        a3.a(4);
        abev abev3 = this.d;
        a3.a(abev3.c, abev3.d);
        a3.b(this.d.l);
        AuthAccountRequest authAccountRequest = this.e;
        if (authAccountRequest != null) {
            Integer num = authAccountRequest.d;
            Integer num2 = authAccountRequest.e;
            if (!(num == null || num2 == null)) {
                a3.a(num.intValue(), num2.intValue());
            }
        }
        abfb a4 = this.c.a(a3.a());
        a.a("Access token request result: %d.", Integer.valueOf(a4.a));
        if (a4.a()) {
            if (((TokenData) a4.c.b()).e) {
                ClientContext b2 = b();
                if (a4.c.a()) {
                    List list = ((TokenData) a4.c.b()).f;
                    amrl.a((Object) list);
                    b2.a((String[]) list.toArray(new String[0]));
                }
                b2.a((Context) this.d.b);
            }
        } else if (!b.contains(Integer.valueOf(a4.a))) {
            b().b((Context) this.d.b);
        }
        return a4;
    }

    private final ClientContext b() {
        abev abev = this.d;
        int i = abev.d;
        Account h = abev.h();
        Account h2 = this.d.h();
        String str = this.d.c;
        return new ClientContext(i, h, h2, str, str);
    }

    private final void a(int i, amri amri) {
        abev abev = this.d;
        nio nio = abev.b;
        PendingIntent activity = PendingIntent.getActivity(nio, 0, SignInChimeraActivity.a(nio, abev.c, (Scope[]) abev.d().toArray(new Scope[0]), (Intent) amri.c(), this.d.n.a()), 0);
        if (!amri.a()) {
            activity = null;
        }
        this.f.a(new ConnectionResult(i, activity), new AuthAccountResult(i, (Intent) amri.c()));
    }

    public final void a(Context context) {
        boolean z;
        String str;
        abev abev = this.d;
        if (abev.f) {
            Set e2 = abev.e();
            abez abez = this.g;
            if (abez != null) {
                abev abev2 = this.d;
                if (abez.b(abev2.c, abev2.h())) {
                    abez abez2 = this.g;
                    abev abev3 = this.d;
                    Set a2 = abez2.a(abev3.c, abev3.h());
                    amrl.a((Object) a2);
                    e2 = new HashSet(a2);
                    e2.retainAll(this.d.e());
                }
            }
            if (!this.d.i()) {
                str = "consent";
            } else {
                str = "auto";
            }
            qah a3 = qah.a(this.d.h(), this.d.h, e2);
            a3.a(4);
            abev abev4 = this.d;
            a3.a(abev4.c, abev4.d);
            a3.a(this.d.g());
            a3.b(this.d.f());
            a3.a(str);
            a3.b(this.d.l);
            AuthAccountRequest authAccountRequest = this.e;
            if (authAccountRequest != null) {
                Integer num = authAccountRequest.d;
                Integer num2 = authAccountRequest.e;
                if (!(num == null || num2 == null)) {
                    a3.a(num.intValue(), num2.intValue());
                }
            }
            abfb a4 = this.c.a(a3.a());
            a.a("Server auth code request (prompt=%s) result: %d.", str, Integer.valueOf(a4.a));
            if (!a4.a()) {
                a(a4.a, a4.b);
                return;
            }
        }
        if (this.d.d().isEmpty()) {
            a.d("No scopes specified, skipping fetching access token.", new Object[0]);
            z = true;
        } else {
            abev abev5 = this.d;
            ClientContext a5 = ClientContext.a(abev5.b, abev5.d, abev5.h(), this.d.c);
            if (a5 == null || !jkx.a(a5.e()).containsAll(this.d.e()) || this.d.k) {
                abfb a6 = a();
                if (a6.a()) {
                    z = true;
                } else {
                    a(a6.a, a6.b);
                    return;
                }
            } else {
                z = false;
            }
        }
        abev abev6 = this.d;
        if (abev6.g) {
            qah a7 = qah.a(abev6.h(), this.d.h);
            a7.a(4);
            abev abev7 = this.d;
            a7.a(abev7.c, abev7.d);
            a7.b(this.d.l);
            abev abev8 = this.d;
            Account account = abev8.e;
            if (account == null || !abev8.h().equals(account)) {
                a7.a(this.d.g());
                a7.b(this.d.f());
            }
            abfb a8 = this.c.a(a7.a());
            a.a("ID token request result: %d.", Integer.valueOf(a8.a));
            if (!a8.a()) {
                a(a8.a, a8.b);
                return;
            }
        }
        a(0, ampu.a);
        if (!z) {
            a();
        }
    }

    public final void a(Status status) {
        a(8, ampu.a);
    }
}
