package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.Set;
import org.json.JSONException;

/* renamed from: kdw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kdw {
    private static final ith d = new ith("QueuedAction", "");
    public final kof a;
    public final kkf b;
    public lht c;
    private final ksw e;
    private final lhv f;
    private kao g;
    private int h = 0;
    private long i = 0;
    private long j = 0;
    private boolean k = false;

    public kdw(kof kof, kao kao, ksw ksw, kkf kkf, lhv lhv) {
        iva.a((Object) kof);
        this.a = kof;
        iva.a((Object) kao);
        this.g = kao;
        iva.a((Object) ksw);
        this.e = ksw;
        iva.a((Object) kkf);
        this.b = kkf;
        iva.a((Object) lhv);
        this.f = lhv;
        k();
    }

    private final void k() {
        kah kah = this.g.a;
        kdp kdp = null;
        this.c = null;
        if (!i() && kah.j()) {
            try {
                lhi a2 = this.f.a(false, kah.c(this.b));
                this.c = a2;
                if (a2 != null) {
                    String str = this.a.g;
                    if (str != null) {
                        try {
                            kdp = new kdp(str);
                        } catch (JSONException e2) {
                            d.c("QueuedAction", String.format("Unable to deserialize transfer preferences %s", new Object[]{str}), e2);
                            kof kof = this.a;
                            kof.g = null;
                            kof.t();
                        }
                    }
                    a2.c(kdp);
                }
            } catch (kcm e3) {
            }
        }
    }

    private final synchronized void l() {
        iva.a(!this.b.b());
        if (e()) {
            try {
                khq c2 = b().c(this.b);
                knc s = b().s();
                if (s != null) {
                    kmp a2 = this.b.a(c2, s);
                    TransferProgressData a3 = a(a2.g());
                    if (a3 != null) {
                        this.e.a(a3, a2);
                    }
                }
            } catch (kcm e2) {
            } catch (kcs e3) {
                d.c("QueuedAction", "Cannot retrieve entry", e3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized TransferProgressData a(DriveId driveId) {
        int i2;
        switch (this.h) {
            case 0:
                return null;
            case 1:
            case 3:
            case 4:
                i2 = 1;
                break;
            case 2:
                i2 = 4;
                break;
            case 5:
                i2 = 3;
                break;
            case 6:
                i2 = 2;
                break;
            case 7:
                i2 = 5;
                break;
            case 8:
                i2 = -3;
                break;
            case 9:
                i2 = -4;
                break;
            default:
                i2 = -1;
                break;
        }
        return new TransferProgressData(0, driveId, i2, this.i, this.j);
    }

    /* access modifiers changed from: package-private */
    public final synchronized kah b() {
        return this.g.a;
    }

    /* access modifiers changed from: package-private */
    public final synchronized int c() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final synchronized long d() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return b().k() == kaj.CREATE_FILE || b().k() == kaj.CONTENT_AND_METADATA;
    }

    public final synchronized void f() {
        this.k = true;
        lht lht = this.c;
        if (lht != null) {
            lht.d();
        }
    }

    public final synchronized void g() {
        iva.a(!this.b.b());
        if (!i()) {
            this.a.a(true);
            lht lht = this.c;
            if (lht != null) {
                lht.d();
            }
            a();
        }
    }

    public final synchronized void h() {
        iva.a(!this.b.b());
        if (i()) {
            this.a.a(false);
            k();
        }
    }

    public final synchronized boolean i() {
        return this.a.f;
    }

    public final synchronized boolean j() {
        return this.k;
    }

    public final String toString() {
        return String.format("QueuedAction[%s, %s]", new Object[]{this.a, this.g});
    }

    public final void a() {
        lht lht = this.c;
        if (lht != null) {
            lht.f();
            this.c = null;
        }
    }

    public final synchronized boolean b(kdw kdw) {
        boolean z;
        iva.a(!this.b.b());
        this.b.d();
        try {
            if (kdw.c() == 0) {
                z = true;
            } else {
                z = false;
            }
            iva.a(z);
            long j2 = this.a.m;
            long j3 = kdw.a.m;
            this.g.a.a(kdw.b(), this.b, j2);
            this.a.a(this.g.a().toString());
            this.a.t();
            lrt.a(this.b, b().a(), j3, j2);
            kdw.a.u();
            kdw.a();
            this.b.f();
            this.b.e();
        } catch (JSONException e2) {
            d.c("QueuedAction", "Failed to serialize combination of two serializable actions!", e2);
            try {
                this.g = kdl.a(this.b, this.a);
            } catch (JSONException e3) {
                d.c("QueuedAction", "Failed to deserialize an action we had deserialized before!", e3);
            }
            this.b.e();
            return false;
        } catch (Throwable th) {
            this.b.e();
            throw th;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i2, boolean z) {
        iva.a(!this.b.b());
        int i3 = this.h;
        this.h = i2;
        if (z && i3 != i2) {
            l();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(long j2, long j3) {
        boolean z = true;
        iva.a(!this.b.b());
        if (this.i == j2 && this.j == j3) {
            z = false;
        }
        this.i = j2;
        this.j = j3;
        if (z) {
            l();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(kam kam) {
        kah kah = this.g.b;
        kkf kkf = kam.a;
        kkf.d();
        try {
            kah.a(kam);
            kkf.f();
        } catch (kco e2) {
            d.c("QueuedAction", "Failed to undo action.", e2);
        } catch (kcp e3) {
            try {
                d.c("QueuedAction", "Failed to undo action. Unexpected conflict on undo", e3);
            } catch (Throwable th) {
                kkf.e();
                throw th;
            }
        }
        kkf.e();
    }

    public final boolean a(Set set) {
        return b().a(set);
    }

    public final synchronized boolean a(kdw kdw) {
        boolean z;
        if (kdw.c() == 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        int i2 = this.h;
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            return false;
        }
        return b().b(kdw.b());
    }
}
