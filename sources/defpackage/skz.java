package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.SyncResult;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: skz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class skz extends nis {
    private static final anij b = sjk.b();
    public final SyncRequest a;
    private final sli c;
    private final raw d;
    private final Executor e;
    private final sjl f;
    private final String g;
    private final CallerInfo h;
    private final sjn i;
    private final sjb j;

    public skz(sli sli, raw raw, Executor executor, sjn sjn, sjl sjl, String str, sjb sjb, SyncRequest syncRequest, CallerInfo callerInfo) {
        super(215, "HandleSyncOperation");
        this.c = sli;
        this.d = raw;
        this.e = executor;
        this.i = sjn;
        this.f = sjl;
        this.g = str;
        this.j = sjb;
        this.a = syncRequest;
        this.h = callerInfo;
    }

    private final void a(int i2) {
        sjl sjl = this.f;
        set set = this.a.a;
        CallerInfo callerInfo = this.h;
        String str = this.g;
        long d2 = aygr.d();
        if (sjl.b.a(d2)) {
            aftn aftn = (aftn) sjl.a.a();
            aucd o = aftc.f.o();
            int i3 = (int) d2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aftc aftc = (aftc) o.b;
            aftc.a |= 16;
            aftc.d = i3;
            aucd o2 = ser.e.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ser ser = (ser) o2.b;
            ser.d = i2 - 1;
            ser.a |= 1;
            aucd o3 = sep.d.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            sep sep = (sep) o3.b;
            sep.b = set.e;
            sep.a |= 1;
            aucd o4 = seo.e.o();
            long j2 = callerInfo.b;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            seo seo = (seo) o4.b;
            int i4 = seo.a | 2;
            seo.a = i4;
            seo.b = j2;
            str.getClass();
            int i5 = i4 | 4;
            seo.a = i5;
            seo.c = str;
            String str2 = callerInfo.a;
            str2.getClass();
            seo.a = i5 | 8;
            seo.d = str2;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            sep sep2 = (sep) o3.b;
            seo seo2 = (seo) o4.i();
            seo2.getClass();
            sep2.c = seo2;
            sep2.a |= 2;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ser ser2 = (ser) o2.b;
            sep sep3 = (sep) o3.i();
            sep3.getClass();
            ser2.c = sep3;
            ser2.b = 2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aftc aftc2 = (aftc) o.b;
            ser ser3 = (ser) o2.i();
            ser3.getClass();
            aftc2.c = ser3;
            aftc2.b = 5;
            aucd o5 = aftb.f.o();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            aftb aftb = (aftb) o5.b;
            int i6 = aftb.a | 2;
            aftb.a = i6;
            aftb.b = 1;
            "com.google.android.gms".getClass();
            int i7 = i6 | 4;
            aftb.a = i7;
            aftb.c = "com.google.android.gms";
            "mdisync".getClass();
            aftb.a = i7 | 16;
            aftb.e = "mdisync";
            if (o.c) {
                o.c();
                o.c = false;
            }
            aftc aftc3 = (aftc) o.b;
            aftb aftb2 = (aftb) o5.i();
            aftb2.getClass();
            aftc3.e = aftb2;
            aftc3.a |= 32;
            aftn.a(2001, (aftc) o.i());
        }
    }

    private final byte[] a(slh slh) {
        aorr aorr;
        try {
            if ((this.d instanceof afue) && aygr.g()) {
                aorr = ((qyp) this.d).a(slh.a()).a(new skx(this, slh), 1, this.e);
            } else {
                aorr = this.d.g(slh.a()).a(new sky(this, slh), 1, this.e);
            }
            return (byte[]) aorr.get();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            amrl.a((Object) cause, (Object) "Failed sync must have a cause!");
            amtb.a(cause, slc.class);
            amtb.a(cause, slg.class);
            amtb.a(cause, InterruptedException.class);
            amtb.a(cause, sld.class);
            amtb.a(cause, afug.class);
            amtb.a(cause, afuj.class);
            amtb.a(cause);
            throw new IllegalStateException("Sync failed with an unknown checked exception!", cause);
        } catch (slf e3) {
            a(7);
            throw new nja(38002, "Given request is malformed!", (PendingIntent) null, e3);
        } catch (slc e4) {
            a(3);
            throw new nja(38003, "Sync failed with an authentication error!", (PendingIntent) null, e4);
        } catch (afug e5) {
            a(10);
            throw new nja(38004, "Sync failed, because constraints are not met!", (PendingIntent) null, e5);
        } catch (afuj e6) {
            a(11);
            throw new nja(38005, "Sync is disabled by flag!", (PendingIntent) null, e6);
        } catch (slg e7) {
            a(8);
            throw new nja(7, "Sync failed with a network error!", (PendingIntent) null, e7);
        } catch (InterruptedException e8) {
            a(6);
            Thread.currentThread().interrupt();
            throw new nja(14, "Sync was interrupted!", (PendingIntent) null, e8);
        } catch (sld e9) {
            a(5);
            anie c2 = sjk.a().c();
            c2.a((int) aygr.c());
            c2.a((Throwable) e9);
            c2.a("skz", "a", 169, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Sync '%d' failed with an internal error!", this.a.a.e);
            throw new nja(8, "Sync failed with an internal error!", (PendingIntent) null, e9);
        } catch (RuntimeException e10) {
            a(12);
            anie c3 = sjk.a().c();
            c3.a((int) aygr.c());
            c3.a((Throwable) e10);
            c3.a("skz", "a", 178, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Sync '%d' failed with an unexpected error!", this.a.a.e);
            throw new nja(8, "Sync failed with an unexpected error!", (PendingIntent) null, e10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: sek} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00ac A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r21) {
        /*
            r20 = this;
            r1 = r20
            anij r0 = b
            anie r0 = r0.d()
            java.lang.String r2 = "skz"
            java.lang.String r3 = "a"
            r4 = 226(0xe2, float:3.17E-43)
            java.lang.String r5 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r2, (java.lang.String) r3, (int) r4, (java.lang.String) r5)
            com.google.android.gms.mdisync.internal.SyncRequest r4 = r1.a
            set r4 = r4.a
            int r4 = r4.e
            java.lang.String r6 = "Executing operation '%d'..."
            r0.a((java.lang.String) r6, (int) r4)
            r4 = 0
            sli r0 = r1.c     // Catch:{ sle -> 0x027e }
            com.google.android.gms.mdisync.internal.SyncRequest r6 = r1.a     // Catch:{ sle -> 0x027e }
            set r6 = r6.a     // Catch:{ sle -> 0x027e }
            set r7 = defpackage.set.UNKNOWN     // Catch:{ sle -> 0x027e }
            if (r6 == r7) goto L_0x002c
            r7 = 1
            goto L_0x002d
        L_0x002c:
            r7 = 0
        L_0x002d:
            java.lang.String r10 = "No handler registered for the UNKNOWN operation!"
            defpackage.sli.a(r7, r10)     // Catch:{ sle -> 0x027e }
            anaf r0 = r0.a     // Catch:{ sle -> 0x027e }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ sle -> 0x027e }
            slh r0 = (defpackage.slh) r0     // Catch:{ sle -> 0x027e }
            if (r0 == 0) goto L_0x0266
            aygr r6 = defpackage.aygr.a
            aygs r6 = r6.a()
            sej r6 = r6.a()
            java.lang.String r7 = r1.g
            sek r10 = defpackage.sek.b
            r7.getClass()
            audr r6 = r6.a
            boolean r11 = r6.containsKey(r7)
            if (r11 == 0) goto L_0x005d
            java.lang.Object r6 = r6.get(r7)
            r10 = r6
            sek r10 = (defpackage.sek) r10
            goto L_0x005e
        L_0x005d:
        L_0x005e:
            aucx r6 = r10.a
            int r7 = r6.size()
            r10 = 0
        L_0x0065:
            if (r10 >= r7) goto L_0x00b7
            java.lang.Object r11 = r6.get(r10)
            sem r11 = (defpackage.sem) r11
            int r12 = r11.a
            r13 = r12 & 1
            if (r13 == 0) goto L_0x0076
            long r13 = r11.b
            goto L_0x0078
        L_0x0076:
            r13 = -9223372036854775808
        L_0x0078:
            r12 = r12 & 2
            if (r12 == 0) goto L_0x007f
            long r8 = r11.c
            goto L_0x0084
        L_0x007f:
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0084:
            aucu r15 = new aucu
            aucs r11 = r11.d
            auct r12 = defpackage.sem.e
            r15.<init>(r11, r12)
            com.google.android.gms.mdisync.internal.SyncRequest r11 = r1.a
            set r11 = r11.a
            boolean r11 = r15.contains(r11)
            if (r11 == 0) goto L_0x00a6
            com.google.android.gms.mdisync.CallerInfo r11 = r1.h
            long r11 = r11.b
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 > 0) goto L_0x00a6
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r12 = 1
            goto L_0x00a7
        L_0x00a6:
            r12 = 0
        L_0x00a7:
            int r10 = r10 + 1
            if (r12 != 0) goto L_0x00ac
            goto L_0x0065
        L_0x00ac:
            nja r0 = new nja
            r2 = 38000(0x9470, float:5.325E-41)
            java.lang.String r3 = "API invocation rejected because the caller is blacklisted!"
            r0.<init>(r2, r3, r4)
            throw r0
        L_0x00b7:
            aygr r6 = defpackage.aygr.a
            aygs r6 = r6.a()
            boolean r6 = r6.g()
            r7 = 3
            r8 = 2
            if (r6 == 0) goto L_0x0102
            sjn r6 = r1.i
            com.google.android.gms.mdisync.CallerInfo r9 = r1.h
            java.lang.String r9 = r9.a
            com.google.android.gms.mdisync.internal.SyncRequest r10 = r1.a
            set r10 = r10.a
            int r10 = r10.ordinal()
            r11 = 1
            if (r10 == r11) goto L_0x00dd
            if (r10 == r8) goto L_0x00dd
            if (r10 == r7) goto L_0x00dd
            r16 = 1
            goto L_0x00e1
        L_0x00dd:
            r10 = 2005(0x7d5, float:2.81E-42)
            r16 = 2005(0x7d5, float:2.81E-42)
        L_0x00e1:
            java.lang.String r10 = r6.a
            afjl r15 = r6.b
            afto r11 = r6.d
            android.accounts.Account r6 = r6.c
            aftm r19 = new aftm
            aftj r14 = defpackage.aftj.a(r10, r4, r9)
            sjo r9 = new sjo
            r9.<init>(r11, r6)
            boolean r18 = defpackage.aygo.c()
            r13 = r19
            r17 = r9
            r13.<init>(r14, r15, r16, r17, r18)
            r19.a()
        L_0x0102:
            r6 = 7
            r9 = 8
            raw r10 = r1.d     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            boolean r10 = r10 instanceof defpackage.afue     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            if (r10 != 0) goto L_0x010c
        L_0x010b:
            goto L_0x012b
        L_0x010c:
            boolean r10 = defpackage.aygr.g()     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            if (r10 == 0) goto L_0x010b
            raw r10 = r1.d     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            qyp r10 = (defpackage.qyp) r10     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            slq r11 = r0.a()     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            qyq r10 = r10.a(r11)     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            skx r11 = new skx     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            r11.<init>(r1, r0)     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            java.util.concurrent.Executor r0 = r1.e     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            r12 = 1
            aorr r0 = r10.a(r11, r12, r0)     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            goto L_0x0141
        L_0x012b:
            raw r10 = r1.d     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            slq r11 = r0.a()     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            rbj r10 = r10.g(r11)     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            sky r11 = new sky     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            r11.<init>(r1, r0)     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            java.util.concurrent.Executor r0 = r1.e     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            r12 = 1
            aorr r0 = r10.a(r11, r12, r0)     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
        L_0x0141:
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x016e }
            byte[] r0 = (byte[]) r0     // Catch:{ ExecutionException -> 0x016e }
            com.google.android.gms.mdisync.internal.SyncResult r4 = new com.google.android.gms.mdisync.internal.SyncResult
            r4.<init>(r0)
            sjb r0 = r1.j
            com.google.android.gms.common.api.Status r6 = com.google.android.gms.common.api.Status.a
            r0.a(r6, r4)
            anij r0 = b
            anie r0 = r0.d()
            r4 = 237(0xed, float:3.32E-43)
            anie r0 = r0.a((java.lang.String) r2, (java.lang.String) r3, (int) r4, (java.lang.String) r5)
            com.google.android.gms.mdisync.internal.SyncRequest r2 = r1.a
            set r2 = r2.a
            int r2 = r2.e
            java.lang.String r3 = "Operation '%d' completed successfully!"
            r0.a((java.lang.String) r3, (int) r2)
            r1.a((int) r8)
            return
        L_0x016e:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            java.lang.String r8 = "Failed sync must have a cause!"
            defpackage.amrl.a((java.lang.Object) r0, (java.lang.Object) r8)     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            java.lang.Class<slc> r8 = defpackage.slc.class
            defpackage.amtb.a((java.lang.Throwable) r0, (java.lang.Class) r8)     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            java.lang.Class<slg> r8 = defpackage.slg.class
            defpackage.amtb.a((java.lang.Throwable) r0, (java.lang.Class) r8)     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            java.lang.Class<java.lang.InterruptedException> r8 = java.lang.InterruptedException.class
            defpackage.amtb.a((java.lang.Throwable) r0, (java.lang.Class) r8)     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            java.lang.Class<sld> r8 = defpackage.sld.class
            defpackage.amtb.a((java.lang.Throwable) r0, (java.lang.Class) r8)     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            java.lang.Class<afug> r8 = defpackage.afug.class
            defpackage.amtb.a((java.lang.Throwable) r0, (java.lang.Class) r8)     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            java.lang.Class<afuj> r8 = defpackage.afuj.class
            defpackage.amtb.a((java.lang.Throwable) r0, (java.lang.Class) r8)     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            defpackage.amtb.a(r0)     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            java.lang.String r10 = "Sync failed with an unknown checked exception!"
            r8.<init>(r10, r0)     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
            throw r8     // Catch:{ slf -> 0x0257, slc -> 0x0248, afug -> 0x0237, afuj -> 0x0226, slg -> 0x021a, InterruptedException -> 0x0204, sld -> 0x01d3, RuntimeException -> 0x01a1 }
        L_0x01a1:
            r0 = move-exception
            r6 = 12
            r1.a((int) r6)
            anij r6 = defpackage.sjk.a()
            anie r6 = r6.c()
            long r7 = defpackage.aygr.c()
            int r8 = (int) r7
            r6.a((int) r8)
            r6.a((java.lang.Throwable) r0)
            r7 = 178(0xb2, float:2.5E-43)
            anie r2 = r6.a((java.lang.String) r2, (java.lang.String) r3, (int) r7, (java.lang.String) r5)
            com.google.android.gms.mdisync.internal.SyncRequest r3 = r1.a
            set r3 = r3.a
            int r3 = r3.e
            java.lang.String r5 = "Sync '%d' failed with an unexpected error!"
            r2.a((java.lang.String) r5, (int) r3)
            nja r2 = new nja
            java.lang.String r3 = "Sync failed with an unexpected error!"
            r2.<init>(r9, r3, r4, r0)
            throw r2
        L_0x01d3:
            r0 = move-exception
            r6 = 5
            r1.a((int) r6)
            anij r6 = defpackage.sjk.a()
            anie r6 = r6.c()
            long r7 = defpackage.aygr.c()
            int r8 = (int) r7
            r6.a((int) r8)
            r6.a((java.lang.Throwable) r0)
            r7 = 169(0xa9, float:2.37E-43)
            anie r2 = r6.a((java.lang.String) r2, (java.lang.String) r3, (int) r7, (java.lang.String) r5)
            com.google.android.gms.mdisync.internal.SyncRequest r3 = r1.a
            set r3 = r3.a
            int r3 = r3.e
            java.lang.String r5 = "Sync '%d' failed with an internal error!"
            r2.a((java.lang.String) r5, (int) r3)
            nja r2 = new nja
            java.lang.String r3 = "Sync failed with an internal error!"
            r2.<init>(r9, r3, r4, r0)
            throw r2
        L_0x0204:
            r0 = move-exception
            r2 = 6
            r1.a((int) r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            nja r2 = new nja
            r3 = 14
            java.lang.String r5 = "Sync was interrupted!"
            r2.<init>(r3, r5, r4, r0)
            throw r2
        L_0x021a:
            r0 = move-exception
            r1.a((int) r9)
            nja r2 = new nja
            java.lang.String r3 = "Sync failed with a network error!"
            r2.<init>(r6, r3, r4, r0)
            throw r2
        L_0x0226:
            r0 = move-exception
            r2 = 11
            r1.a((int) r2)
            nja r2 = new nja
            r3 = 38005(0x9475, float:5.3256E-41)
            java.lang.String r5 = "Sync is disabled by flag!"
            r2.<init>(r3, r5, r4, r0)
            throw r2
        L_0x0237:
            r0 = move-exception
            r2 = 10
            r1.a((int) r2)
            nja r2 = new nja
            r3 = 38004(0x9474, float:5.3255E-41)
            java.lang.String r5 = "Sync failed, because constraints are not met!"
            r2.<init>(r3, r5, r4, r0)
            throw r2
        L_0x0248:
            r0 = move-exception
            r1.a((int) r7)
            nja r2 = new nja
            r3 = 38003(0x9473, float:5.3254E-41)
            java.lang.String r5 = "Sync failed with an authentication error!"
            r2.<init>(r3, r5, r4, r0)
            throw r2
        L_0x0257:
            r0 = move-exception
            r1.a((int) r6)
            nja r2 = new nja
            r3 = 38002(0x9472, float:5.3252E-41)
            java.lang.String r5 = "Given request is malformed!"
            r2.<init>(r3, r5, r4, r0)
            throw r2
        L_0x0266:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ sle -> 0x027e }
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ sle -> 0x027e }
            int r3 = r6.e     // Catch:{ sle -> 0x027e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ sle -> 0x027e }
            r5 = 0
            r2[r5] = r3     // Catch:{ sle -> 0x027e }
            java.lang.String r3 = "No handler registered for operation '%d'!"
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ sle -> 0x027e }
            r0.<init>(r2)     // Catch:{ sle -> 0x027e }
            throw r0     // Catch:{ sle -> 0x027e }
        L_0x027e:
            r0 = move-exception
            r2 = 13
            r1.a((int) r2)
            nja r2 = new nja
            r3 = 38001(0x9471, float:5.3251E-41)
            java.lang.String r5 = "Unknown or unsupported sync operation requested!"
            r2.<init>(r3, r5, r4, r0)
            goto L_0x0290
        L_0x028f:
            throw r2
        L_0x0290:
            goto L_0x028f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.skz.a(android.content.Context):void");
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.j.a(status, (SyncResult) null);
        b.d().a("skz", "a", 247, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%d' failed with status '%d'!", this.a.a.e, status.i);
    }
}
