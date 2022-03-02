package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: nlh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nlh {
    public boolean a = false;
    public boolean b = true;
    public int c = 17;
    public boolean d = false;
    public int e = 4368;
    public String f = null;
    public ArrayList g = new ArrayList();
    public boolean h = false;
    boolean i = false;
    public GoogleSignInAccount j = null;
    public String k = null;
    public int l = 7;

    static {
        new AtomicInteger(0);
    }

    public nlh() {
    }

    public final nli a() {
        return new nli(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    public nlh(nli nli) {
        if (nli != null) {
            this.a = nli.a;
            this.b = nli.b;
            this.c = nli.c;
            this.d = nli.d;
            this.e = nli.e;
            this.f = nli.f;
            this.g = nli.g;
            this.h = nli.h;
            this.i = nli.i;
            this.j = nli.j;
            this.k = nli.k;
            this.l = nli.m;
        }
    }

    public final void a(Boolean bool) {
        this.i = bool.booleanValue();
    }
}
