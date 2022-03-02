package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: fvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fvt {
    public Set a = new HashSet();
    public String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private String f;
    private Account g;
    private String h;
    private Map i = new HashMap();

    public fvt() {
    }

    public final GoogleSignInOptions a() {
        if (this.a.contains(GoogleSignInOptions.e) && this.a.contains(GoogleSignInOptions.d)) {
            this.a.remove(GoogleSignInOptions.d);
        }
        if (this.e && (this.g == null || !this.a.isEmpty())) {
            b();
        }
        return new GoogleSignInOptions(3, new ArrayList(this.a), this.g, this.e, this.c, this.d, this.f, this.h, this.i, this.b);
    }

    public final void b() {
        this.a.add(GoogleSignInOptions.c);
    }

    public fvt(GoogleSignInOptions googleSignInOptions) {
        iva.a((Object) googleSignInOptions);
        Scope scope = GoogleSignInOptions.a;
        this.a = new HashSet(googleSignInOptions.h);
        this.c = googleSignInOptions.k;
        this.d = googleSignInOptions.l;
        this.e = googleSignInOptions.j;
        this.f = googleSignInOptions.m;
        this.g = googleSignInOptions.i;
        this.h = googleSignInOptions.n;
        this.i = GoogleSignInOptions.a((List) googleSignInOptions.o);
        this.b = googleSignInOptions.p;
    }

    public final void a(Scope scope, Scope... scopeArr) {
        this.a.add(scope);
        this.a.addAll(Arrays.asList(scopeArr));
    }
}
