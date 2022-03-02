package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: gzh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gzh {
    private final Context a;
    private final amsn b;
    private final amsn c;
    private final amsn d;
    private final amsn e;
    private final boolean f;
    private final aucd g = gzn.e.o();
    private final aucd h = gzm.d.o();
    private final aucd i = gzg.k.o();

    public gzh(Context context, amtd amtd) {
        this.a = context;
        this.b = amsn.a(amtd);
        this.d = amsn.a(amtd);
        this.e = amsn.a(amtd);
        this.c = amsn.a(amtd);
        this.f = !gwk.c(context);
    }

    public final void a() {
        this.c.d();
    }

    public final void b() {
        this.c.e();
        aucd aucd = this.g;
        long a2 = this.c.a(TimeUnit.MILLISECONDS);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzn gzn = (gzn) aucd.b;
        gzn gzn2 = gzn.e;
        gzn.a |= 2;
        gzn.c = a2;
    }

    public final void c() {
        this.d.d();
    }

    public final void d() {
        if (this.c.a) {
            b();
        }
        this.d.e();
        aucd aucd = this.g;
        long a2 = ((gzn) aucd.b).b + this.d.a(TimeUnit.MILLISECONDS);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzn gzn = (gzn) aucd.b;
        gzn gzn2 = gzn.e;
        gzn.a |= 1;
        gzn.b = a2;
    }

    public final void e() {
        this.e.d();
    }

    public final void f() {
        this.e.e();
        aucd aucd = this.h;
        long a2 = this.e.a(TimeUnit.MILLISECONDS);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzm gzm = (gzm) aucd.b;
        gzm gzm2 = gzm.d;
        gzm.a |= 1;
        gzm.b = a2;
    }

    public final void g() {
        this.b.d();
    }

    public final gzg h() {
        if (this.d.a) {
            d();
        }
        if (this.e.a) {
            f();
        }
        this.b.e();
        aucd aucd = this.i;
        long a2 = this.b.a(TimeUnit.MILLISECONDS);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzg gzg = (gzg) aucd.b;
        gzg gzg2 = gzg.k;
        gzg.a |= 4;
        gzg.d = a2;
        aucd aucd2 = this.i;
        boolean z = this.f;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        gzg gzg3 = (gzg) aucd2.b;
        gzg3.a |= 128;
        gzg3.j = z;
        gzn gzn = (gzn) this.g.i();
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        gzg gzg4 = (gzg) aucd2.b;
        gzn.getClass();
        gzg4.g = gzn;
        gzg4.a |= 32;
        aucd aucd3 = this.h;
        gzl i2 = gwk.i(this.a);
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        gzm gzm = (gzm) aucd3.b;
        gzm gzm2 = gzm.d;
        i2.getClass();
        gzm.c = i2;
        gzm.a |= 2;
        gzm gzm3 = (gzm) aucd3.i();
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        gzg gzg5 = (gzg) aucd2.b;
        gzm3.getClass();
        gzg5.i = gzm3;
        gzg5.a |= 64;
        return (gzg) aucd2.i();
    }

    public final void a(int i2) {
        aucd aucd = this.i;
        int i3 = 2;
        if (i2 != 0) {
            i3 = (i2 == 1 || i2 == 2) ? 3 : 4;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzg gzg = (gzg) aucd.b;
        gzg gzg2 = gzg.k;
        gzg.b = i3 - 1;
        gzg.a |= 1;
    }

    public final void b(int i2) {
        aucd aucd = this.i;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzg gzg = (gzg) aucd.b;
        gzg gzg2 = gzg.k;
        gzg.f = i2 - 1;
        gzg.a |= 16;
    }

    public final void a(long j) {
        aucd aucd = this.i;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzg gzg = (gzg) aucd.b;
        gzg gzg2 = gzg.k;
        gzg.a |= 2;
        gzg.c = j;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (r12.equals("com.google.android.c2dm.intent.RECEIVE") != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Bundle r12) {
        /*
            r11 = this;
            aucd r0 = r11.i
            java.lang.String r1 = "checkin_task_tag"
            java.lang.String r2 = ""
            java.lang.String r1 = r12.getString(r1, r2)
            java.lang.String r3 = "PeriodicTaskTag"
            boolean r1 = r1.equals(r3)
            r3 = 2
            r4 = 5
            r5 = 4
            r6 = 6
            r7 = 0
            r8 = 8
            r9 = -1
            r10 = 3
            if (r1 != 0) goto L_0x0084
            java.lang.String r1 = "checkin_source_intent_action"
            java.lang.String r12 = r12.getString(r1, r2)
            int r1 = r12.hashCode()
            switch(r1) {
                case -1172645946: goto L_0x0064;
                case -229777127: goto L_0x005a;
                case -177095062: goto L_0x0050;
                case 211362435: goto L_0x0046;
                case 366519424: goto L_0x003d;
                case 370775467: goto L_0x0033;
                case 586577647: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x006e
        L_0x0029:
            java.lang.String r1 = "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x006e
            r10 = 2
            goto L_0x006f
        L_0x0033:
            java.lang.String r1 = "android.app.action.DEVICE_OWNER_CHANGED"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x006e
            r10 = 5
            goto L_0x006f
        L_0x003d:
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x006e
            goto L_0x006f
        L_0x0046:
            java.lang.String r1 = "com.google.gservices.intent.action.GSERVICES_CHANGED"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x006e
            r10 = 0
            goto L_0x006f
        L_0x0050:
            java.lang.String r1 = "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x006e
            r10 = 4
            goto L_0x006f
        L_0x005a:
            java.lang.String r1 = "android.intent.action.SIM_STATE_CHANGED"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x006e
            r10 = 6
            goto L_0x006f
        L_0x0064:
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x006e
            r10 = 1
            goto L_0x006f
        L_0x006e:
            r10 = -1
        L_0x006f:
            switch(r10) {
                case 0: goto L_0x0082;
                case 1: goto L_0x0080;
                case 2: goto L_0x007e;
                case 3: goto L_0x007c;
                case 4: goto L_0x0079;
                case 5: goto L_0x0076;
                case 6: goto L_0x0073;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x0085
        L_0x0073:
            r3 = 10
            goto L_0x0085
        L_0x0076:
            r3 = 9
            goto L_0x0085
        L_0x0079:
            r3 = 8
            goto L_0x0085
        L_0x007c:
            r3 = 7
            goto L_0x0085
        L_0x007e:
            r3 = 6
            goto L_0x0085
        L_0x0080:
            r3 = 5
            goto L_0x0085
        L_0x0082:
            r3 = 4
            goto L_0x0085
        L_0x0084:
            r3 = 3
        L_0x0085:
            boolean r12 = r0.c
            if (r12 != 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            r0.c()
            r0.c = r7
        L_0x008f:
            aucj r12 = r0.b
            gzg r12 = (defpackage.gzg) r12
            gzg r0 = defpackage.gzg.k
            int r3 = r3 + r9
            r12.e = r3
            int r0 = r12.a
            r0 = r0 | r8
            r12.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gzh.a(android.os.Bundle):void");
    }

    public final void a(gzo gzo) {
        aucd aucd = this.g;
        long j = ((gzn) aucd.b).b + gzo.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzn gzn = (gzn) aucd.b;
        gzn gzn2 = gzn.e;
        gzn.a |= 1;
        gzn.b = j;
        aucd aucd2 = this.g;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        gzn gzn3 = (gzn) aucd2.b;
        gzo.getClass();
        gzn3.d = gzo;
        gzn3.a |= 4;
    }

    public final void a(List list) {
        aucd aucd = this.i;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzg gzg = gzg.k;
        ((gzg) aucd.b).h = aucj.s();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        gzg gzg2 = (gzg) aucd.b;
        if (!gzg2.h.a()) {
            gzg2.h = aucj.a(gzg2.h);
        }
        auab.a((Iterable) list, (List) gzg2.h);
    }
}
