package defpackage;

import android.content.SyncResult;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ybh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ybh implements yaz {
    public static final /* synthetic */ int B = 0;
    public int A;
    private final List C;
    public final SyncResult a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final List e;
    public final List f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public final long l;
    public int m;
    public int n;
    public int o;
    public long p;
    public String q;
    public ybg r;
    public boolean s;
    public boolean t;
    public xnh u;
    public boolean v;
    public amri w;
    public amri x;
    public amri y;
    public final Map z;

    public ybh() {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.C = new ArrayList();
        this.g = false;
        this.h = false;
        this.i = false;
        int i2 = xkw.a;
        this.A = 1;
        this.j = 0;
        this.k = 0;
        this.l = SystemClock.elapsedRealtime();
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = null;
        this.s = false;
        this.t = false;
        this.u = null;
        this.v = false;
        this.w = ampu.a;
        this.x = ampu.a;
        this.y = ampu.a;
        this.z = new HashMap();
        this.a = new SyncResult();
    }

    public final long a() {
        return this.a.stats.numIoExceptions + this.a.stats.numParseExceptions + this.a.stats.numAuthExceptions;
    }

    public final void b() {
        this.n++;
    }

    public final void c() {
        this.t = true;
    }

    public final xli[] d() {
        List list = this.C;
        return (xli[]) list.toArray(new xli[list.size()]);
    }

    public final amri a(xjo xjo, xkj xkj, xjm xjm) {
        xnp xnp = (xnp) this.c.get(new ybe(xjo, xkj, xjm));
        return xnp != null ? amri.b(Integer.valueOf(xnp.c)) : ampu.a;
    }

    public final void a(xjo xjo, xkj xkj, xjm xjm, int i2) {
        if (i2 >= 0) {
            aucd o2 = xnp.f.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            xnp xnp = (xnp) o2.b;
            xnp.b = xjo.h;
            int i3 = xnp.a | 1;
            xnp.a = i3;
            xnp.d = xkj.f;
            int i4 = i3 | 4;
            xnp.a = i4;
            xnp.e = xjm.d;
            int i5 = i4 | 8;
            xnp.a = i5;
            xnp.a = i5 | 2;
            xnp.c = i2;
            this.c.put(new ybe(xjo, xkj, xjm), (xnp) o2.i());
        }
    }

    public final void a(xjo xjo, xnd xnd, String str, Exception exc) {
        String str2;
        String str3 = "UNKNOWN_";
        if (xjo == xjo.CONTACT) {
            str2 = "CONTACT_";
        } else {
            str2 = xjo != xjo.GROUP ? xjo == xjo.PHOTO ? "PHOTO_" : str3 : "GROUP_";
        }
        if (xnd == xnd.INSERT) {
            str3 = "INSERT_";
        } else if (xnd == xnd.UPDATE) {
            str3 = "UPDATE_";
        } else if (xnd == xnd.REMOVE) {
            str3 = "DELETE_";
        }
        this.r = new ybg(TextUtils.concat(new CharSequence[]{str2, str3, str}).toString(), exc);
    }

    public final void a(xli xli) {
        this.C.add(xli);
    }

    public final void a(xnb xnb) {
        this.w = amri.b(xnb);
    }

    public final void a(xnd xnd, xjo xjo, yay yay, int i2) {
        ybd ybd = new ybd(xnd, xjo, true);
        if (!this.d.containsKey(ybd)) {
            this.d.put(ybd, new HashMap());
        }
        Map map = (Map) this.d.get(ybd);
        if (!map.containsKey(yay)) {
            aucd o2 = xnf.f.o();
            int b2 = yay.b();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            xnf xnf = (xnf) o2.b;
            int i3 = b2 - 1;
            if (b2 != 0) {
                xnf.b = i3;
                xnf.a |= 1;
                xkf a2 = yay.a();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                xnf xnf2 = (xnf) o2.b;
                xnf2.e = a2.x;
                xnf2.a |= 8;
                map.put(yay, o2);
            } else {
                throw null;
            }
        }
        aucd aucd = (aucd) map.get(yay);
        if (i2 == 1) {
            int i4 = ((xnf) aucd.b).c + 1;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            xnf xnf3 = (xnf) aucd.b;
            xnf xnf4 = xnf.f;
            xnf3.a |= 2;
            xnf3.c = i4;
            return;
        }
        int i5 = ((xnf) aucd.b).d + 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        xnf xnf5 = (xnf) aucd.b;
        xnf xnf6 = xnf.f;
        xnf5.a |= 4;
        xnf5.d = i5;
    }

    public ybh(SyncResult syncResult) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.C = new ArrayList();
        this.g = false;
        this.h = false;
        this.i = false;
        this.A = 1;
        this.j = 0;
        this.k = 0;
        this.l = SystemClock.elapsedRealtime();
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = null;
        this.s = false;
        this.t = false;
        this.u = null;
        this.v = false;
        this.w = ampu.a;
        this.x = ampu.a;
        this.y = ampu.a;
        this.z = new HashMap();
        this.a = syncResult;
    }

    public final void a(xnd xnd, xjo xjo, boolean z2, int i2, int i3) {
        aucd aucd;
        if (i3 > 0) {
            ybd ybd = new ybd(xnd, xjo, z2);
            if (this.b.containsKey(ybd)) {
                xng xng = (xng) this.b.get(ybd);
                aucd = (aucd) xng.c(5);
                aucd.a((aucj) xng);
            } else {
                aucd o2 = xng.l.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                xng xng2 = (xng) o2.b;
                xng2.b = xnd.e;
                int i4 = xng2.a | 1;
                xng2.a = i4;
                xng2.c = xjo.h;
                int i5 = i4 | 2;
                xng2.a = i5;
                xng2.a = i5 | 4;
                xng2.d = z2;
                aucd = o2;
            }
            if (i2 == 1) {
                int i6 = ((xng) aucd.b).e + i3;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                xng xng3 = (xng) aucd.b;
                xng xng4 = xng.l;
                xng3.a = 8 | xng3.a;
                xng3.e = i6;
            } else if (i2 == 2) {
                int i7 = ((xng) aucd.b).f + i3;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                xng xng5 = (xng) aucd.b;
                xng xng6 = xng.l;
                xng5.a |= 16;
                xng5.f = i7;
            } else if (i2 == 3) {
                int i8 = ((xng) aucd.b).g + i3;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                xng xng7 = (xng) aucd.b;
                xng xng8 = xng.l;
                xng7.a |= 32;
                xng7.g = i8;
            } else if (i2 == 4) {
                int i9 = ((xng) aucd.b).h + i3;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                xng xng9 = (xng) aucd.b;
                xng xng10 = xng.l;
                xng9.a |= 64;
                xng9.h = i9;
            } else if (i2 == 7) {
                int i10 = ((xng) aucd.b).j + i3;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                xng xng11 = (xng) aucd.b;
                xng xng12 = xng.l;
                xng11.a |= 512;
                xng11.j = i10;
            } else if (i2 == 8) {
                int i11 = ((xng) aucd.b).k + i3;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                xng xng13 = (xng) aucd.b;
                xng xng14 = xng.l;
                xng13.a |= 1024;
                xng13.k = i11;
            }
            this.b.put(ybd, (xng) aucd.i());
        }
    }

    public final void a(xnm xnm) {
        this.e.add(xnm);
    }

    public final void a(xnn xnn) {
        this.f.add(xnn);
    }
}
