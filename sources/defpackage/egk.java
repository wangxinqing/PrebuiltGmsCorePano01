package defpackage;

import android.content.Context;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import java.util.Arrays;
import java.util.List;

/* renamed from: egk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class egk {
    private final hol a;
    private final boolean b = awik.a.a().e();
    private final boolean c = awik.a.a().a();
    private final boolean d = awik.a.a().f();
    private final boolean e = awik.a.a().d();

    public egk(Context context) {
        this.a = hol.a(context, "AUDIT");
    }

    public final void a(int i) {
        if (this.e) {
            aucd o = ehc.f.o();
            aucd o2 = ehe.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ehe ehe = (ehe) o2.b;
            ehe.b = i - 1;
            ehe.a |= 1;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ehc ehc = (ehc) o.b;
            ehe ehe2 = (ehe) o2.i();
            ehe2.getClass();
            ehc.e = ehe2;
            ehc.a |= 8;
            this.a.a((audx) (ehc) o.i()).b();
        }
    }

    public final void a(LogAuditRecordsRequest logAuditRecordsRequest, aqof aqof, long j, int i) {
        if (this.c) {
            aucd o = ehh.h.o();
            int length = logAuditRecordsRequest.d.length;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ehh ehh = (ehh) o.b;
            int i2 = ehh.a | 1;
            ehh.a = i2;
            ehh.b = length;
            int i3 = logAuditRecordsRequest.b;
            int i4 = i2 | 2;
            ehh.a = i4;
            ehh.c = i3;
            String str = aqof.f;
            str.getClass();
            int i5 = i4 | 4;
            ehh.a = i5;
            ehh.d = str;
            int i6 = aqof.e;
            int i7 = i5 | 8;
            ehh.a = i7;
            ehh.e = i6;
            int i8 = i7 | 16;
            ehh.a = i8;
            ehh.f = j;
            ehh.a = i8 | 32;
            ehh.g = i;
            ehh ehh2 = (ehh) o.i();
            aucd o2 = ehc.f.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ehc ehc = (ehc) o2.b;
            ehh2.getClass();
            ehc.c = ehh2;
            ehc.a |= 2;
            this.a.a((audx) (ehc) o2.i()).b();
        }
    }

    public final void a(egt egt) {
        if (this.b) {
            aucd o = ehc.f.o();
            aucd o2 = ehg.b.o();
            List asList = Arrays.asList(egt.c());
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ehg ehg = (ehg) o2.b;
            if (!ehg.a.a()) {
                ehg.a = aucj.a(ehg.a);
            }
            auab.a((Iterable) asList, (List) ehg.a);
            if (o.c) {
                o.c();
                o.c = false;
            }
            ehc ehc = (ehc) o.b;
            ehg ehg2 = (ehg) o2.i();
            ehg2.getClass();
            ehc.b = ehg2;
            ehc.a |= 1;
            this.a.a((audx) (ehc) o.i()).b();
        }
    }

    public final void a(boolean z, boolean z2, boolean z3, aqoc aqoc) {
        aqof aqof;
        int i;
        int i2;
        if (this.d) {
            aqoj aqoj = aqoc.d;
            if (aqoj == null) {
                aqoj = aqoj.c;
            }
            if (aqoj.a == 1) {
                aqof = (aqof) aqoj.b;
            } else {
                aqof = aqof.l;
            }
            aucd o = ehc.f.o();
            aucd o2 = ehl.h.o();
            int i3 = aqoc.c;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ehl ehl = (ehl) o2.b;
            int i4 = ehl.a | 32;
            ehl.a = i4;
            ehl.g = i3;
            String str = aqof.f;
            str.getClass();
            int i5 = i4 | 8;
            ehl.a = i5;
            ehl.e = str;
            int i6 = aqof.e;
            int i7 = i5 | 16;
            ehl.a = i7;
            ehl.f = i6;
            int i8 = 3;
            if (!z) {
                i = 3;
            } else {
                i = 2;
            }
            ehl.b = i - 1;
            int i9 = i7 | 1;
            ehl.a = i9;
            if (!z2) {
                i2 = 2;
            } else {
                i2 = 3;
            }
            ehl.c = i2 - 1;
            int i10 = i9 | 2;
            ehl.a = i10;
            if (!z3) {
                i8 = 2;
            }
            ehl.d = i8 - 1;
            ehl.a = i10 | 4;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ehc ehc = (ehc) o.b;
            ehl ehl2 = (ehl) o2.i();
            ehl2.getClass();
            ehc.d = ehl2;
            ehc.a |= 4;
            this.a.a((audx) (ehc) o.i()).b();
        }
    }
}
