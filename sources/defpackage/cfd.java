package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: cfd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class cfd extends ccv implements grc {
    private final String b;
    public ContextData j;
    public boolean k;
    public boolean l;
    private final cfc m = new cfc(this);
    private final Runnable n;
    private SparseArray o;
    /* access modifiers changed from: private */
    public boolean p;
    private String q;

    public cfd(Context context, bsz bsz, ccj ccj, String str, but but) {
        super(context, bsz, ccj, str, but);
        boolean z;
        iva.a((Object) ccj.c);
        if (ccj.c.length > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        int[] iArr = ccj.d;
        if (iArr != null) {
            for (int a : iArr) {
                iva.b(jtj.a(a));
            }
        }
        String str2 = bsz.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        this.b = sb.toString();
        this.k = false;
        this.p = false;
        this.l = false;
        if (ccj.d != null) {
            this.o = new SparseArray(this.f.d.length);
        }
        this.n = new cfa(this);
    }

    public static AwarenessFence a(String str, String str2, bsz bsz) {
        new Object[1][0] = str;
        if (str == null || str.isEmpty() || bsz == null) {
            return null;
        }
        juk juk = new juk(bsz);
        juu juu = new juu();
        juu.b();
        TimeFilterImpl a = juu.a();
        juo juo = new juo();
        juo.a(str);
        juk.a(13, a, juo.a());
        juk.b();
        ArrayList a2 = cbi.q().a(juk.a());
        if (a2 == null || a2.isEmpty() || a2.size() > 1) {
            new Object[1][0] = a2 != null ? Integer.valueOf(a2.size()) : "null";
            return null;
        } else if (((juj) a2.get(0)).d().equals(jun.a(str, (String) null, (String) null))) {
            return new ContextFenceStub(((juj) a2.get(0)).c());
        } else {
            bxk.a(str2, "Feature with wrong key", new Object[0]);
            return null;
        }
    }

    public final void b(ContextData contextData) {
        int length;
        int i = 1;
        new Object[1][0] = contextData;
        int[] iArr = this.f.d;
        if (iArr == null || (length = iArr.length) == 0) {
            bxk.a(this.c, "onReceive called when no dependent context.", new Object[0]);
        } else if (this.k) {
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                int i3 = iArr[i2];
                if (contextData.g() == i3) {
                    new Object[1][0] = Integer.toString(i3);
                    this.o.put(i3, contextData);
                    break;
                }
                i2++;
            }
            if (this.o.size() == this.f.d.length) {
                int size = this.o.size();
                if (this.j == null) {
                    i = 0;
                }
                ContextData[] contextDataArr = new ContextData[(size + i)];
                for (int i4 = 0; i4 < this.o.size(); i4++) {
                    contextDataArr[i4] = (ContextData) this.o.valueAt(i4);
                }
                if (this.j != null) {
                    contextDataArr[this.o.size()] = this.j;
                }
                this.o.clear();
                a(contextDataArr);
            }
        } else {
            new Object[1][0] = contextData;
        }
    }

    public final void c() {
        grd grd = new grd();
        grd.a((grc) this);
        gra.a(this.d, this.g).a(grd.a()).a((acvp) new bva("[%s] remove fence", this.c));
    }

    public final boolean e() {
        Object[] objArr = {this.c, this.e};
        this.l = true;
        jtm jtm = new jtm();
        jtm.a(this.f.c[0]);
        jtm.b(1);
        jtn a = jtm.a();
        cfb cfb = new cfb(this, "[ServerContextSyncProducer] get current context", new Object[0]);
        acwa a2 = gra.d(this.d, this.g).a(a);
        but but = this.a;
        String str = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("ServerContextSyncProducer_");
        sb.append(str);
        sb.append("_currentContextOnStart");
        a2.a(but.a(bvq.a(sb.toString())), (acvp) cfb);
        return true;
    }

    public final void f() {
        Object[] objArr = {this.c, this.e};
        this.l = false;
        this.a.a(this.n);
        c();
        super.f();
    }

    /* access modifiers changed from: protected */
    public final void h() {
        int[] iArr = this.f.d;
        if (iArr != null && iArr.length != 0) {
            this.o.clear();
            this.q = UUID.randomUUID().toString();
            jua jua = null;
            for (int i : this.f.d) {
                if (i == 1) {
                    if (jua == null) {
                        jua = juc.a();
                    }
                    jua.a(this.q, 1, cbb.a(), juq.b(awvj.a.a().a()));
                } else if (i == 6) {
                    if (jua == null) {
                        jua = juc.a();
                    }
                    jua.a(this.q, 6, cbb.a(), cbc.a(awuz.b()));
                }
            }
            if (jua != null) {
                iux.a(jua.a(gra.e(this.d, this.g).j)).a((acvp) new bva("[ServerContextSyncProducer] register interests", new Object[0]));
            }
            super.h();
        }
    }

    /* access modifiers changed from: protected */
    public final void i() {
        if (this.q != null) {
            gra.e(this.d, this.g).e(this.q).a((acvp) new bva("[%s] remove interest, key=%s", this.c, this.q));
        }
        super.i();
        if (this.f.d != null) {
            this.o.clear();
        }
    }

    public final void j() {
        this.k = true;
        int[] iArr = this.f.d;
        if (iArr == null || iArr.length == 0) {
            ContextData contextData = this.j;
            a(contextData != null ? new ContextData[]{contextData} : null);
            return;
        }
        h();
    }

    public static void a(AwarenessFence awarenessFence, String str, bsz bsz) {
        if (awarenessFence == null || str == null || str.isEmpty() || bsz == null) {
            Object[] objArr = {str, bsz};
            return;
        }
        Object[] objArr2 = {str, bsz, awarenessFence};
        juh juh = new juh(bsz, 13);
        juh.a(((ContextFenceStub) awarenessFence).b());
        juh.a(jun.a(str, (String) null, (String) null));
        new Object[1][0] = Long.valueOf(cbi.q().a(juh.a()));
    }

    private final void a(ContextData[] contextDataArr) {
        if (!this.p) {
            this.p = true;
            cbl w = cbi.w();
            bsz bsz = this.e;
            atjv b2 = jtj.b(this.f.c[0]);
            long a = awwk.a.a().a();
            cfc cfc = this.m;
            bwn k2 = cbi.k();
            bvp a2 = bvq.a("NetworkManager#produceContext");
            a2.f();
            new cbx(w.a, bsz, b2, contextDataArr, a, cfc, k2).a(a2);
        }
    }

    public final void a(AwarenessFence awarenessFence) {
        if (awarenessFence != null) {
            grd grd = new grd();
            grd.a(this.b, awarenessFence, this);
            gra.a(this.d, this.g).a(grd.a()).a((acvp) new bva("[%s] add fence", this.c));
        }
    }

    public final void a(FenceState fenceState) {
        if (!TextUtils.equals(fenceState.b(), this.b)) {
            bxk.a(this.c, "Fence trigger callback for unexpected key %s, expected %s", fenceState.b(), this.b);
        } else if (fenceState.a() == 2) {
            this.a.a(this.n, bvq.a(String.valueOf(this.c).concat("_fenceStateChanged")));
        }
    }
}
