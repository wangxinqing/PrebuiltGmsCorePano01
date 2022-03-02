package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.Service;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContextFenceStub extends AwarenessFence implements jvh {
    public static final Parcelable.Creator CREATOR = new jvd();
    private atjt a;
    private byte[] b;
    private ArrayList c;
    private jvz d;
    private jvz e;
    private jvo f;
    private jvs g;
    private juv h;
    private jvw i;
    private jvt j;
    private jvr k;
    private juw l;
    private juy m;
    private jvp n;
    private jwa o;
    private jvq p;
    private jvu q;
    private jvn r;
    private jvy s;
    private jwc t;
    private jvx u;
    private jwd v;

    public ContextFenceStub(atjt atjt) {
        iva.a((Object) atjt);
        this.a = atjt;
        this.b = null;
        j();
    }

    public static ContextFenceStub a(jvz jvz) {
        atjq atjq;
        iva.a((Object) jvz);
        if (jvz.b.f) {
            atjq = (atjq) atjt.z.o();
            atjs atjs = atjs.LOCAL_TIME_FENCE;
            if (atjq.c) {
                atjq.c();
                atjq.c = false;
            }
            atjt atjt = (atjt) atjq.b;
            atjt.b = atjs.z;
            int i2 = atjt.a | 1;
            atjt.a = i2;
            atme atme = jvz.b;
            atme.getClass();
            atjt.s = atme;
            atjt.a = 262144 | i2;
        } else {
            atjq = (atjq) atjt.z.o();
            atjs atjs2 = atjs.TIME_FENCE;
            if (atjq.c) {
                atjq.c();
                atjq.c = false;
            }
            atjt atjt2 = (atjt) atjq.b;
            atjt2.b = atjs2.z;
            int i3 = atjt2.a | 1;
            atjt2.a = i3;
            atme atme2 = jvz.b;
            atme2.getClass();
            atjt2.d = atme2;
            atjt2.a = i3 | 2;
        }
        return new ContextFenceStub((atjt) atjq.i());
    }

    private final void i() {
        if (this.a == null) {
            try {
                this.a = (atjt) aucj.a((aucj) atjt.z, this.b, aubs.c());
                this.b = null;
            } catch (auda e2) {
                bxl.a("ContextFenceStub", "Could not deserialize context fence bytes.", (Object) e2);
                throw new IllegalStateException(e2);
            }
        }
        j();
    }

    private final void j() {
        atjt atjt = this.a;
        if (atjt == null && this.b != null) {
            return;
        }
        if (atjt != null && this.b == null) {
            return;
        }
        if (atjt != null && this.b != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (atjt == null && this.b == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final void b(Set set) {
        set.add(Integer.valueOf(d()));
        int d2 = d();
        if (d2 == 1 || d2 == 2 || d2 == 3 || d2 == 22) {
            set.add(Integer.valueOf(d()));
            ArrayList e2 = e();
            int size = e2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ContextFenceStub) e2.get(i2)).b(set);
            }
        }
    }

    public final atjt c() {
        i();
        return this.a;
    }

    public final int d() {
        i();
        atjt atjt = this.a;
        if ((atjt.a & 1) == 0) {
            return 0;
        }
        atjs a2 = atjs.a(atjt.b);
        if (a2 == null) {
            a2 = atjs.UNKNOWN_CONTEXT_FENCE_TYPE;
        }
        return a2.z;
    }

    public final ArrayList e() {
        i();
        if (this.c == null) {
            this.c = new ArrayList(this.a.c.size());
            aucx aucx = this.a.c;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.c.add(new ContextFenceStub((atjt) aucx.get(i2)));
            }
        }
        return this.c;
    }

    public final jvs f() {
        i();
        atjt atjt = this.a;
        if ((atjt.a & 8) == 0) {
            return null;
        }
        if (this.g == null) {
            atlj atlj = atjt.f;
            if (atlj == null) {
                atlj = atlj.h;
            }
            this.g = new jvs(atlj);
        }
        return this.g;
    }

    public final boolean g() {
        int d2 = d();
        if (d2 == 1 || d2 == 2 || d2 == 3 || d2 == 22) {
            ArrayList e2 = e();
            int size = e2.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                ContextFenceStub contextFenceStub = (ContextFenceStub) e2.get(i2);
                atjt atjt = this.a;
                if ((atjt.a & 1048576) != 0) {
                    atlo atlo = atjt.w;
                    if (atlo == null) {
                        atlo = atlo.c;
                    }
                    if (atlo != null) {
                        atjt atjt2 = contextFenceStub.a;
                        aucd aucd = (aucd) atjt2.c(5);
                        aucd.a((aucj) atjt2);
                        atjq atjq = (atjq) aucd;
                        if (atjq.c) {
                            atjq.c();
                            atjq.c = false;
                        }
                        atjt atjt3 = (atjt) atjq.b;
                        auct auct = atjt.v;
                        atlo.getClass();
                        atjt3.w = atlo;
                        atjt3.a |= 1048576;
                        contextFenceStub.a = (atjt) atjq.i();
                        z = true;
                    } else {
                        atjt atjt4 = contextFenceStub.a;
                        aucd aucd2 = (aucd) atjt4.c(5);
                        aucd2.a((aucj) atjt4);
                        atjq atjq2 = (atjq) aucd2;
                        if (atjq2.c) {
                            atjq2.c();
                            atjq2.c = false;
                        }
                        atjt atjt5 = (atjt) atjq2.b;
                        auct auct2 = atjt.v;
                        atjt5.w = null;
                        atjt5.a &= -1048577;
                        contextFenceStub.a = (atjt) atjq2.i();
                        z = true;
                    }
                }
                z |= contextFenceStub.g();
            }
            if (z) {
                ArrayList arrayList = new ArrayList(this.a.c.size());
                ArrayList e3 = e();
                int size2 = e3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList.add(((ContextFenceStub) e3.get(i3)).c());
                }
                atjt atjt6 = this.a;
                aucd aucd3 = (aucd) atjt6.c(5);
                aucd3.a((aucj) atjt6);
                atjq atjq3 = (atjq) aucd3;
                if (atjq3.c) {
                    atjq3.c();
                    atjq3.c = false;
                }
                auct auct3 = atjt.v;
                ((atjt) atjq3.b).c = aucj.s();
                atjq3.a((Iterable) arrayList);
                this.a = (atjt) atjq3.i();
                this.c = null;
                return true;
            }
        }
        return false;
    }

    public final jvh h() {
        switch (d()) {
            case 1:
            case 2:
            case 3:
            case 22:
                return null;
            case 4:
                i();
                atjt atjt = this.a;
                if ((atjt.a & 2) == 0) {
                    return null;
                }
                if (this.d == null) {
                    atme atme = atjt.d;
                    if (atme == null) {
                        atme = atme.g;
                    }
                    this.d = new jvz(atme);
                }
                return this.d;
            case 5:
                i();
                atjt atjt2 = this.a;
                if ((atjt2.a & 4) == 0) {
                    return null;
                }
                if (this.f == null) {
                    atku atku = atjt2.e;
                    if (atku == null) {
                        atku = atku.j;
                    }
                    this.f = new jvo(atku);
                }
                return this.f;
            case 6:
                return f();
            case 7:
                i();
                atjt atjt3 = this.a;
                if ((atjt3.a & 16) == 0) {
                    return null;
                }
                if (this.h == null) {
                    atjb atjb = atjt3.g;
                    if (atjb == null) {
                        atjb = atjb.e;
                    }
                    this.h = new juv(atjb);
                }
                return this.h;
            case 8:
                i();
                atjt atjt4 = this.a;
                if ((atjt4.a & 32) == 0) {
                    return null;
                }
                if (this.i == null) {
                    atlu atlu = atjt4.h;
                    if (atlu == null) {
                        atlu = atlu.e;
                    }
                    this.i = new jvw(atlu);
                }
                return this.i;
            case 9:
                i();
                atjt atjt5 = this.a;
                if ((atjt5.a & 64) == 0) {
                    return null;
                }
                if (this.j == null) {
                    atln atln = atjt5.i;
                    if (atln == null) {
                        atln = atln.g;
                    }
                    this.j = new jvt(atln);
                }
                return this.j;
            case 10:
                i();
                atjt atjt6 = this.a;
                if ((atjt6.a & 128) == 0) {
                    return null;
                }
                if (this.k == null) {
                    atlf atlf = atjt6.j;
                    if (atlf == null) {
                        atlf = atlf.d;
                    }
                    this.k = new jvr(atlf);
                }
                return this.k;
            case 11:
                i();
                atjt atjt7 = this.a;
                if ((atjt7.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    return null;
                }
                if (this.l == null) {
                    atje atje = atjt7.k;
                    if (atje == null) {
                        atje = atje.i;
                    }
                    this.l = new juw(atje);
                }
                return this.l;
            case 12:
                i();
                atjt atjt8 = this.a;
                if ((atjt8.a & 512) == 0) {
                    return null;
                }
                if (this.m == null) {
                    atji atji = atjt8.l;
                    if (atji == null) {
                        atji = atji.d;
                    }
                    this.m = new juy(atji);
                }
                return this.m;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                i();
                atjt atjt9 = this.a;
                if ((atjt9.a & 1024) == 0) {
                    return null;
                }
                if (this.n == null) {
                    atkz atkz = atjt9.m;
                    if (atkz == null) {
                        atkz = atkz.h;
                    }
                    this.n = new jvp(atkz);
                }
                return this.n;
            case Service.START_CONTINUATION_MASK:
                i();
                atjt atjt10 = this.a;
                if ((atjt10.a & FragmentTransaction.TRANSIT_EXIT_MASK) == 0) {
                    return null;
                }
                if (this.o == null) {
                    atmh atmh = atjt10.n;
                    if (atmh == null) {
                        atmh = atmh.c;
                    }
                    this.o = new jwa(atmh);
                }
                return this.o;
            case 16:
                i();
                atjt atjt11 = this.a;
                if ((atjt11.a & 16384) == 0) {
                    return null;
                }
                if (this.r == null) {
                    atjz atjz = atjt11.o;
                    if (atjz == null) {
                        atjz = atjz.c;
                    }
                    this.r = new jvn(atjz);
                }
                return this.r;
            case 17:
                i();
                atjt atjt12 = this.a;
                if ((atjt12.a & 32768) == 0) {
                    return null;
                }
                if (this.p == null) {
                    atlc atlc = atjt12.p;
                    if (atlc == null) {
                        atlc = atlc.b;
                    }
                    this.p = new jvq(atlc);
                }
                return this.p;
            case 18:
                i();
                atjt atjt13 = this.a;
                if ((atjt13.a & 65536) == 0) {
                    return null;
                }
                if (this.q == null) {
                    atlr atlr = atjt13.q;
                    if (atlr == null) {
                        atlr = atlr.b;
                    }
                    this.q = new jvu(atlr);
                }
                return this.q;
            case 19:
                i();
                atjt atjt14 = this.a;
                if ((atjt14.a & 131072) == 0) {
                    return null;
                }
                if (this.s == null) {
                    atly atly = atjt14.r;
                    if (atly == null) {
                        atly = atly.d;
                    }
                    this.s = new jvy(atly);
                }
                return this.s;
            case 20:
                i();
                atjt atjt15 = this.a;
                if ((atjt15.a & 262144) == 0) {
                    return null;
                }
                if (this.e == null) {
                    atme atme2 = atjt15.s;
                    if (atme2 == null) {
                        atme2 = atme.g;
                    }
                    this.e = new jvz(atme2);
                }
                return this.e;
            case 21:
                i();
                atjt atjt16 = this.a;
                if ((atjt16.a & 524288) == 0) {
                    return null;
                }
                if (this.t == null) {
                    atmk atmk = atjt16.t;
                    if (atmk == null) {
                        atmk = atmk.g;
                    }
                    this.t = new jwc(atmk);
                }
                return this.t;
            case 23:
                i();
                atjt atjt17 = this.a;
                if ((atjt17.a & 2097152) == 0) {
                    return null;
                }
                if (this.u == null) {
                    atlv atlv = atjt17.x;
                    if (atlv == null) {
                        atlv = atlv.a;
                    }
                    this.u = new jvx(atlv);
                }
                return this.u;
            case 24:
                i();
                atjt atjt18 = this.a;
                if ((atjt18.a & 4194304) == 0) {
                    return null;
                }
                if (this.v == null) {
                    atmn atmn = atjt18.y;
                    if (atmn == null) {
                        atmn = atmn.e;
                    }
                    this.v = new jwd(atmn);
                }
                return this.v;
            default:
                bxl.b("ContextFenceStub", "Unknown fence stub type=%s", Integer.valueOf(d()));
                return null;
        }
    }

    public final String toString() {
        i();
        return this.a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, b(), false);
        ivx.b(parcel, a2);
    }

    public ContextFenceStub(byte[] bArr) {
        this.a = null;
        this.b = bArr;
        j();
    }

    public final byte[] b() {
        byte[] bArr = this.b;
        return bArr == null ? this.a.k() : bArr;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(java.util.Collection r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            int r1 = r4.size()
            r2 = 0
        L_0x000e:
            if (r2 >= r1) goto L_0x0020
            java.lang.Object r3 = r4.get(r2)
            com.google.android.gms.contextmanager.fence.internal.ContextFenceStub r3 = (com.google.android.gms.contextmanager.fence.internal.ContextFenceStub) r3
            atjt r3 = r3.c()
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.contextmanager.fence.internal.ContextFenceStub.a(java.util.Collection):java.util.List");
    }

    public final int a() {
        jvh h2 = h();
        if (h2 != null) {
            return h2.a();
        }
        return -2;
    }

    public final void a(Set set) {
        int d2 = d();
        if (!(d2 == 1 || d2 == 2 || d2 == 3)) {
            if (d2 != 22) {
                jvh h2 = h();
                if (h2 == null) {
                    bxl.b("ContextFenceStub", "Expected a primitive fence for type=%s", Integer.valueOf(d()));
                } else {
                    set.add(Integer.valueOf(h2.a()));
                }
                if ((this.a.a & 1048576) == 0) {
                    return;
                }
                if (!(h2 instanceof jvo)) {
                    bxl.b("ContextFenceStub", "Predictive fences are not supported for context: %s", Integer.valueOf(h2.a()));
                    set.add(-3);
                    return;
                }
                jvo jvo = (jvo) h2;
                set.addAll(Collections.singletonList(46));
                return;
            } else if ((this.a.a & 1048576) == 0) {
                bxl.b("ContextFenceStub", "Predictive fence without predictive parameters.");
                set.add(-3);
                return;
            }
        }
        ArrayList e2 = e();
        int size = e2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ContextFenceStub) e2.get(i2)).a(set);
        }
    }
}
