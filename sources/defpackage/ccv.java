package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ccv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ccv extends bwe {
    private ContextData CG;
    public final String c;
    public final Context d;
    public final bsz e;
    public final ccj f;
    public final grb g;
    public Set h;
    public WriteBatchImpl i;

    public ccv(Context context, bsz bsz, ccj ccj, String str, but but) {
        super(but, str);
        Account account;
        this.d = context;
        iva.a((Object) bsz);
        this.e = bsz;
        iva.a((Object) ccj);
        this.f = ccj;
        String str2 = ccj.b;
        if (!this.e.b()) {
            account = this.e.a();
        } else {
            account = null;
        }
        this.g = grb.b(str2, account);
        this.c = str;
        if (this.f.e) {
            this.h = new HashSet();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        if (!ibt.c(cbi.p().a(i2, cbi.i().a(), cbi.a(this.e, "BaseProducer")))) {
            ((anih) ((anih) bxk.a.b()).a("ccv", "a", 330, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[%s] Failed to close ongoing contexts for contextName: %s", (Object) aqcr.a(this.c), i2);
        }
    }

    public void a(cas cas) {
    }

    public void a(cas cas, cas cas2) {
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    public void b(ContextData contextData) {
        ((anih) ((anih) bxk.a.c()).a("ccv", "b", 183, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[%s] Context %s received by producer %s and not handled.", (Object) aqcr.a(this.c), (Object) Integer.toString(contextData.g()), (Object) this.c);
    }

    public final void c(ContextData contextData) {
        if (contextData == null) {
            ((anih) ((anih) bxk.a.b()).a("ccv", "c", 232, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[%s] write request with null contextData", (Object) aqcr.a(this.c));
            return;
        }
        WriteBatchImpl b = juc.b();
        b.a(contextData);
        a(b);
    }

    /* access modifiers changed from: protected */
    public final void d(ContextData contextData) {
        this.CG = contextData;
        c(contextData);
    }

    public final boolean d() {
        return this.f.e;
    }

    public boolean e() {
        Object[] objArr = {this.f.b, this.e};
        a();
        h();
        return true;
    }

    public void f() {
        Object[] objArr = {this.f.b, this.e};
        i();
        b();
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        return this.CG != null;
    }

    /* access modifiers changed from: protected */
    public void h() {
        if (this.f.d != null) {
            jtm jtm = new jtm();
            for (int a : this.f.d) {
                jtm.a(a);
            }
            gra.c(this.d, this.g).a(jtm.a(), (jtv) this).a((acvp) new bva("[%s] registerContextListener, account=%s", this.c, this.e));
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        if (this.f.d != null) {
            gra.c(this.d, this.g).a((jtv) this).a((acvp) new bva("[%s] unregisterContextListener, account=%s", this.c, this.e));
        }
    }

    /* access modifiers changed from: protected */
    public void a(long j) {
        ContextData contextData = this.CG;
        if (contextData == null) {
            ((anih) ((anih) bxk.a.b()).a("ccv", "a", 304, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[%s] Ongoing data shouldn't be null.", (Object) aqcr.a(this.c));
        } else if (contextData.j().b()) {
            jti jti = new jti(this.CG);
            jti.a(j);
            c(jti.a());
        } else {
            ((anih) ((anih) bxk.a.b()).a("ccv", "a", 296, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[%s] ongoing data is not ongoing. type=%s", (Object) aqcr.a(this.c), (Object) Integer.toString(this.CG.j().a()));
        }
        this.CG = null;
    }

    /* access modifiers changed from: protected */
    public final void a(WriteBatchImpl writeBatchImpl) {
        if (writeBatchImpl == null || !writeBatchImpl.a()) {
            ((anih) ((anih) bxk.a.b()).a("ccv", "a", 246, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[%s] write request with empty data", (Object) aqcr.a(this.c));
        } else if (d()) {
            Set<bsz> set = this.h;
            if (set != null) {
                for (bsz a : set) {
                    a(writeBatchImpl, grb.b(this.f.b, a.a()));
                }
            }
            this.i = writeBatchImpl;
        } else {
            a(writeBatchImpl, this.g);
        }
    }

    public final void a(WriteBatchImpl writeBatchImpl, grb grb) {
        Object[] objArr = {this.c, grb.f};
        ContextManagerClientInfo a = ContextManagerClientInfo.a(this.d, this.e.b, grb);
        chn v = cbi.v();
        ArrayList arrayList = writeBatchImpl.a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ContextData) arrayList.get(i2)).a(a.d, v.a(this.e, true).a.b);
            }
        }
        cbi.k().a(new ccu(writeBatchImpl, a), bvq.a("BaseProducer_write_to_store"));
    }
}
