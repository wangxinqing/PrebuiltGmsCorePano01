package defpackage;

import android.content.Context;
import android.os.Handler;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: oeu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oeu implements Response.Listener, Response.ErrorListener, nzc {
    public final Context a;
    public final okc b;
    public final HelpConfig c;
    public final oet d;
    public Handler e;
    public Runnable f;
    Handler g;
    public final aoru h = jfm.a(9);
    private final boolean i;
    private nze j;

    public oeu(Context context, HelpConfig helpConfig, okc okc, oet oet, nze nze, boolean z) {
        this.a = context;
        this.c = helpConfig;
        this.b = okc;
        this.j = nze;
        this.d = oet;
        this.i = z;
    }

    private final int c() {
        nze nze = this.j;
        if (nze != null) {
            return nze.a(nzy.d(this.c), -1);
        }
        return -1;
    }

    private final void d() {
        this.d.h();
    }

    private final void e() {
        long j2;
        long max = (long) Math.max(1, a());
        if (max > axmj.a.a().o()) {
            d();
            return;
        }
        this.e = new qvr();
        long b2 = b();
        if (c() != 0) {
            j2 = axmj.C();
        } else {
            j2 = axmj.a.a().aQ();
        }
        oes oes = new oes(this, b2);
        this.f = oes;
        this.e.postDelayed(oes, max * j2);
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        int i2;
        nze nze = this.j;
        if (nze != null) {
            i2 = nze.a(nzy.e(this.c), 0);
        } else {
            i2 = 0;
        }
        return Math.max(0, i2);
    }

    public final void a(nze nze) {
        this.j = nze;
    }

    public final long b() {
        nze nze = this.j;
        if (nze != null) {
            return nze.a(nzy.b(this.c), -1);
        }
        return -1;
    }

    public final void onErrorResponse(VolleyError volleyError) {
        int i2;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse != null) {
            i2 = networkResponse.statusCode;
        } else {
            i2 = -1;
        }
        if (i2 != -1) {
            if (i2 == 205) {
                this.d.i();
            } else if (!(i2 == 500 || i2 == 503)) {
                d();
            }
            this.d.g();
            return;
        }
        a(a() + 1);
        e();
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        avnf avnf = (avnf) obj;
        int c2 = c();
        if (avnf != null) {
            odu.a(this.c, this.j, avnf);
            if (a() > 0) {
                a(0);
            }
            if (!odu.e(this.a, this.c)) {
                e();
            }
            if (avnf.a == 0) {
                this.d.j();
            }
            if (ofq.b(axqh.a.a().a()) || avnf.a < c2 || c2 == -1) {
                if (ofq.b(axqn.a.a().c()) && this.i) {
                    long j2 = avnf.c;
                    qvr qvr = new qvr();
                    this.g = qvr;
                    qvr.postDelayed(new oer(this, j2), axqn.a.a().d());
                    return;
                }
                this.d.g();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Expected a non-null ChatRequestStatus object.");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        nze nze = this.j;
        if (nze != null) {
            nzp a2 = nze.a();
            a2.a(nzy.e(this.c), i2);
            a2.a();
        }
    }
}
