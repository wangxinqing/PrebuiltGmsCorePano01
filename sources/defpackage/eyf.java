package defpackage;

import android.app.Application;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: eyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eyf extends p {
    public static final iwd c = ehv.b("AssistedSignInViewModel");
    public final String d;
    public final String e;
    public final fsj f;
    public final String g;
    public final hol h;
    public final aw i = new aw();
    public final aw j = new aw();
    public final aw k = new aw();
    public final aw l = new aw(amri.b(false));
    public final Bitmap m;
    public InternalSignInCredentialWrapper n;
    public List o;
    public qcp p;
    public ezg q;
    public SignInCredential r;
    public long s;
    public boolean t;
    private final BeginSignInRequest u;
    private final aoru v;
    private final ezi w;
    private final eye x;
    private final jls y;
    private aosh z;

    public eyf(Application application, String str, oq oqVar, BeginSignInRequest beginSignInRequest, String str2, hol hol) {
        super(application);
        this.d = str;
        this.u = beginSignInRequest;
        this.g = str2;
        this.h = hol;
        CharSequence charSequence = (CharSequence) oqVar.a;
        iva.a((Object) charSequence);
        this.e = charSequence.toString();
        this.m = (Bitmap) oqVar.b;
        this.v = jfb.a(2, 9);
        this.y = new jls((Handler) new qvr(Looper.getMainLooper()));
        this.p = qcp.FETCH_CREDENTIALS;
        this.w = new ezi(application);
        this.q = new ezg();
        fsh a = fsi.a();
        a.a = str2;
        this.f = fsg.a(application, a.a());
        this.x = new eye(this);
    }

    public final aorr a(qcp qcp) {
        aosh f2 = aosh.f();
        this.z = f2;
        return qay.a((aorr) f2, (Object) amri.b(qcp));
    }

    public final void b() {
        fsj fsj = this.f;
        String str = this.d;
        String str2 = this.g;
        iva.c(str);
        iva.c(str2);
        iha b = ihb.b();
        b.a = new fuf(str2, str);
        ((iby) fsj).a(b.a());
        a(ezf.a());
    }

    public final void c() {
        aorr aorr;
        long j2;
        c.a("startNextStep() is called, flowStep=%s.", this.p.toString());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        qcp qcp = qcp.DEFAULT_ASSISTED_SIGN_IN_FLOW_STEP;
        switch (this.p.ordinal()) {
            case 1:
                this.x.a.start();
                fsj fsj = this.f;
                String str = this.d;
                BeginSignInRequest beginSignInRequest = this.u;
                iva.c(str);
                iva.a((Object) beginSignInRequest);
                iha b = ihb.b();
                b.a = new fua(str, beginSignInRequest);
                aorr = aopr.a(qbc.a(((iby) fsj).a(b.a())), (amqy) new exv(this), (Executor) this.v);
                break;
            case 2:
                if (this.o.size() <= 1) {
                    this.n = (InternalSignInCredentialWrapper) this.o.get(0);
                    aorr = aorl.a((Object) amri.b(qcp.FETCH_TOS_AND_PP));
                    break;
                } else {
                    this.k.c(3);
                    this.i.c(this.o);
                    aorr = aopr.a(this.x.a(), (aoqb) new exw(this), (Executor) this.v);
                    break;
                }
            case 3:
                if (!this.n.a()) {
                    aorr = aopr.a(this.w.a(this.v, this.d), (amqy) new exx(this), (Executor) this.v);
                    break;
                } else {
                    aorr = aorl.a((Object) amri.b(qcp.CHOOSE_SINGLE_CREDENTIAL));
                    break;
                }
            case 4:
                aorr = aopr.a(this.x.a(), (aoqb) new exy(this), (Executor) this.v);
                break;
            case 5:
                if (this.n.a()) {
                    j2 = awnj.a.a().b();
                } else {
                    j2 = awnj.a.a().a();
                }
                this.s = j2;
                this.k.c(4);
                this.i.c(amzy.a((Object) this.n));
                if (TextUtils.isEmpty(this.n.g.f)) {
                    fsj fsj2 = this.f;
                    String str2 = this.d;
                    BeginSignInRequest beginSignInRequest2 = this.u;
                    InternalSignInCredentialWrapper internalSignInCredentialWrapper = this.n;
                    iva.c(str2);
                    iva.a((Object) beginSignInRequest2);
                    iva.a((Object) internalSignInCredentialWrapper);
                    iha b2 = ihb.b();
                    b2.a = new fuc(str2, beginSignInRequest2, internalSignInCredentialWrapper);
                    aorr = aopr.a(qbc.a(((iby) fsj2).a(b2.a())), (amqy) new exz(this), (Executor) this.v);
                    break;
                } else {
                    this.r = this.n.g;
                    aorr = aorl.a((Object) amri.b(qcp.EXTEND_CONFIRMATION));
                    break;
                }
            case 6:
                this.l.c(amri.b(true));
                aorr = a(qcp.RECORD_GRANTS);
                break;
            case 7:
                if (!this.n.a()) {
                    this.f.a(this.d, this.n.f, this.g);
                }
                aorr = aorl.a((Object) amri.b(qcp.UPDATE_DEFAULT_ACCOUNT));
                break;
            case 8:
                if (TextUtils.isEmpty(this.n.g.f)) {
                    this.f.b(this.d, this.n.f, this.g);
                }
                aorr = aorl.a((Object) ampu.a);
                break;
            default:
                int i2 = this.p.j;
                StringBuilder sb = new StringBuilder(41);
                sb.append("Invalid flowStep was reached: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
        aorl.a(aorr, new eya(this, elapsedRealtime), this.y);
    }

    public final void a() {
        qcp qcp = qcp.DEFAULT_ASSISTED_SIGN_IN_FLOW_STEP;
        int ordinal = this.p.ordinal();
        if (ordinal == 2 || ordinal == 4 || ordinal == 6) {
            this.z.b((Object) null);
            return;
        }
        int i2 = this.p.j;
        StringBuilder sb = new StringBuilder(30);
        sb.append("Unrecognized case: ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public final void a(ezf ezf) {
        this.j.c(ezf);
    }

    public final void a(qcp qcp, long j2, boolean z2) {
        hol hol = this.h;
        aucd o2 = anty.n.o();
        String str = this.g;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anty anty = (anty) o2.b;
        str.getClass();
        int i2 = anty.a | 2;
        anty.a = i2;
        anty.c = str;
        anty.b = 5;
        anty.a = i2 | 1;
        aucd o3 = antk.i.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        antk antk = (antk) o3.b;
        antk.d = qcp.j;
        int i3 = antk.a | 4;
        antk.a = i3;
        int i4 = i3 | 128;
        antk.a = i4;
        antk.h = z2;
        antk.a = i4 | 64;
        antk.g = j2;
        antk antk2 = (antk) o3.i();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anty anty2 = (anty) o2.b;
        antk2.getClass();
        anty2.g = antk2;
        anty2.a |= 32;
        hol.a((audx) o2.i()).b();
    }
}
