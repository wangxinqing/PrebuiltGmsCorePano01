package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import com.google.android.gms.signin.internal.SignInRequest;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: abev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abev extends abdt implements niz {
    static final anaf a;
    private static final iwd p = abeb.b("SignInService");
    public final nio b;
    public final String c;
    public final int d;
    public final Account e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final abej i;
    public final String j;
    public final boolean k;
    public final String l;
    public icc m;
    public abai n;
    public iby o;
    private final nix q;
    private final Set r;
    private final aber s;
    private final boolean t;
    private final AtomicReference u = new AtomicReference((Object) null);
    private final AtomicReference v = new AtomicReference((Object) null);

    static {
        anab h2 = anaf.h();
        h2.a(abed.class, qbk.SIGNIN_AUTH_ACCOUNT);
        h2.a(abet.class, qbk.SIGNIN_SIGNIN);
        h2.a(aben.class, qbk.SIGNIN_RESOLVE_ACCOUNT);
        h2.a(abem.class, qbk.SIGNIN_RECORD_CONSENT);
        h2.a(abel.class, qbk.SIGNIN_RECORD_CONSENT_BY_CONSENT_RESULT);
        h2.a(abei.class, qbk.SIGNIN_GET_CURRENT_ACCOUNT);
        h2.a(abeo.class, qbk.SIGNIN_SAVE_DEFAULT_ACCOUNT);
        a = h2.a();
    }

    public abev(nio nio, String str, Set set, int i2, Account account, abai abai, nix nix) {
        nio nio2 = nio;
        String str2 = str;
        abai abai2 = abai;
        nix nix2 = nix;
        boolean z = abai2.b;
        boolean z2 = abai2.c;
        String str3 = abai2.d;
        aber aber = aber.a;
        abej abej = abej.a;
        boolean z3 = abai2.e;
        String str4 = abai2.f;
        boolean z4 = abai2.h;
        String str5 = abai2.g;
        hol hol = new hol(nio2, "IDENTITY_GMSCORE", (String) null);
        this.b = nio2;
        this.c = str2;
        this.r = set;
        this.d = i2;
        this.e = account;
        this.f = z;
        this.g = z2;
        this.h = str3;
        this.q = nix2;
        this.s = aber;
        this.i = abej;
        this.t = z3;
        this.j = str4;
        this.k = z4;
        if (azgz.b()) {
            wlr wlr = new wlr();
            wlr.a = 80;
            this.o = wlt.d(nio2, wlr.a());
        } else {
            ibz ibz = new ibz(nio2);
            ibq ibq = wlt.a;
            wlr wlr2 = new wlr();
            wlr2.a = 80;
            ibz.a(ibq, (ibj) wlr2.a());
            this.m = ibz.b();
        }
        this.n = abai2;
        if (str5 == null) {
            String a2 = qbw.a();
            this.l = a2;
            abah a3 = abah.a(abai.a());
            a3.f = a2;
            this.n = a3.a();
            if (azgq.b()) {
                hol.a((audx) qcy.a(str2, (Scope[]) this.r.toArray(new Scope[0]), this.n)).b();
            }
        } else {
            this.l = str5;
        }
        if (azgq.b()) {
            qbq.a(nix2, (amry) new abeu(this, hol));
        }
        iwd iwd = p;
        String valueOf = String.valueOf(this.l);
        iwd.b(valueOf.length() == 0 ? new String("Log Session ID: ") : "Log Session ID: ".concat(valueOf), new Object[0]);
    }

    public final Set a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.r);
        return hashSet;
    }

    @Deprecated
    public final void b() {
        throw new UnsupportedOperationException("onCheckServerAuthorization() is not supported.");
    }

    @Deprecated
    public final void c() {
        throw new UnsupportedOperationException("onUploadServerAuthCode() is not supported.");
    }

    public final Set d() {
        return (Set) this.v.get();
    }

    public final Set e() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(d());
        return hashSet;
    }

    public final boolean f() {
        return e().contains(GoogleSignInOptions.a);
    }

    public final boolean g() {
        return e().contains(GoogleSignInOptions.b);
    }

    public final Account h() {
        return (Account) this.u.get();
    }

    public final boolean i() {
        return !this.t;
    }

    public final void a(int i2) {
        aber aber = aber.a;
        aber.c.a(this.c, i2);
    }

    public final void a(int i2, Account account, abdr abdr) {
        aber aber = aber.a;
        String str = this.c;
        abec abec = aber.c;
        abec.a.a("putAccount(package_name=%s, session_id=%d)", str, Integer.valueOf(i2));
        abec.c.put(str, account);
        abdr.a(Status.a);
    }

    public final void a(abdr abdr) {
        this.q.a(new abei(this, abdr));
    }

    public final void a(Account account, Set set) {
        this.u.set(account);
        this.v.set(set);
    }

    public final void a(AuthAccountRequest authAccountRequest, abdr abdr) {
        if (authAccountRequest.a() == null) {
            Log.wtf("SignInService", "Account from the AuthAccountRequest is null", new Exception());
        }
        a(authAccountRequest.a(), (Set) new HashSet(Arrays.asList(authAccountRequest.c)));
        Integer num = authAccountRequest.d;
        Integer num2 = authAccountRequest.e;
        if ((num == null && num2 == null) || hxz.a((Context) this.b, Binder.getCallingUid())) {
            this.q.a(new abed(this, authAccountRequest, abdr));
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play Services.");
        throw new SecurityException(sb.toString());
    }

    public final void a(ResolveAccountRequest resolveAccountRequest, iue iue) {
        this.q.a(new aben(this, resolveAccountRequest, iue, this.s));
    }

    public final void a(RecordConsentByConsentResultRequest recordConsentByConsentResultRequest, abdr abdr) {
        int callingUid = Binder.getCallingUid();
        if (jll.a(this.b, callingUid)) {
            this.q.a(new abel(this, this.c, recordConsentByConsentResultRequest, abdr));
        } else {
            throw new SecurityException(String.format("Caller with uid: %s is not eligible to invoke recordConsentByConsentResult method!", new Object[]{Integer.valueOf(callingUid)}));
        }
    }

    public final void a(RecordConsentRequest recordConsentRequest, abdr abdr) {
        int callingUid = Binder.getCallingUid();
        if (hxz.a((Context) this.b, callingUid)) {
            this.q.a(new abem(this.c, this.d, this.l, recordConsentRequest, abdr));
        } else {
            throw new SecurityException(String.format("Caller with uid: %s is not eligible to invoke recordConsent method!", new Object[]{Integer.valueOf(callingUid)}));
        }
    }

    public final void a(SignInRequest signInRequest, abdr abdr) {
        this.q.a(new abet(this, abdr, signInRequest, this.s));
    }

    public final void a(itm itm, int i2, boolean z) {
        this.q.a(new abeo(this, irh.a(itm), i2, z, this.s));
    }

    public final void a(boolean z) {
        Account account = (Account) this.u.get();
        if (account == null || account.name == null) {
            Log.wtf("SignInService", "setGamesHasBeenGreeted(): account or account name was null", new Exception());
        } else {
            abab.a(this.b, account.name, this.c, z);
        }
    }
}
