package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: adev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adev {
    private final Context a;
    private final amsv b;
    private final amsv c;
    private final adef d;
    private final adew e;
    private final afyy f;
    private final amqy g;
    private final amqy h;
    private final afyw i;
    private final adde j;
    private final aekn k;
    private final ades l;

    static {
        addh.b();
    }

    public adev(Context context, ades ades, amsv amsv, adef adef, adew adew, afyy afyy, amqy amqy, amqy amqy2, afyw afyw, adde adde, aekn aekn) {
        this.a = context;
        this.l = ades;
        this.b = null;
        this.c = amsv;
        this.d = adef;
        this.e = adew;
        this.f = afyy;
        this.g = amqy;
        this.h = amqy2;
        this.i = afyw;
        this.j = adde;
        this.k = aekn;
    }

    private final acyb a(atwh atwh, Account account) {
        addp addp = new addp(this.e.a(account, aosd.a()), new adhv(this.a, account.name));
        if ((atwh.a & 1) != 0) {
            addq addq = (addq) this.g.a(account);
            atvp atvp = atwh.c;
            if (atvp == null) {
                atvp = atvp.d;
            }
            if (!azrk.m()) {
                addq.a(atvp);
            } else {
                iha b2 = ihb.b();
                b2.a = new mea(atvp);
                acws.a(((meh) this.h.a(account)).a(b2.a()));
            }
        }
        aucd o = acyb.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        acyb acyb = (acyb) o.b;
        atwh.getClass();
        acyb.b = atwh;
        acyb.a |= 1;
        long a2 = this.k.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        acyb acyb2 = (acyb) o.b;
        acyb2.a |= 2;
        acyb2.c = a2;
        return addp.a((acyb) o.i());
    }

    public static aonv b() {
        return aonv.a(azrk.a.a().z(), (int) azrk.a.a().A());
    }

    public static baor c() {
        return (baor) atwb.a(rbx.a((int) FragmentTransaction.TRANSIT_FRAGMENT_OPEN).a(atxu.h)).a(apyj.a, (Object) b().toString());
    }

    private final List d() {
        return jgu.d(this.a, "com.google.android.gms");
    }

    private static baor e() {
        return (baor) atwb.a(rbx.a((int) FragmentTransaction.TRANSIT_FRAGMENT_OPEN, rca.a).a(atxu.h)).a(apyj.a, (Object) b().toString());
    }

    public adev(Context context, amsv amsv, amsv amsv2, adef adef, adew adew, afyy afyy, amqy amqy, amqy amqy2, afyw afyw, adde adde, aekn aekn) {
        this.a = context;
        this.l = null;
        if (!azrk.a.a().i()) {
            amsv = amta.a(amsv);
            amsv.a();
        }
        this.b = amsv;
        this.c = amsv2;
        this.d = adef;
        this.e = adew;
        this.f = afyy;
        this.g = amqy;
        this.h = amqy2;
        this.i = afyw;
        this.j = adde;
        this.k = aekn;
    }

    public final adet b(adeu adeu) {
        return new adet(this, adeu);
    }

    public static adev a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (!azrk.a.a().T()) {
            return new adev(applicationContext, new ades(new adep(applicationContext)), (amsv) new adem(applicationContext), new adef(applicationContext), (adew) adee.a(applicationContext), addx.e(applicationContext), (amqy) new aden(applicationContext), (amqy) new adeo(context), addx.c(applicationContext), addx.d(applicationContext), (aekn) new aekp());
        }
        return new adev(applicationContext, adeg.a, (amsv) new adej(applicationContext), new adef(applicationContext), (adew) adee.a(applicationContext), addx.e(applicationContext), (amqy) new adek(applicationContext), (amqy) new adel(context), addx.c(applicationContext), addx.d(applicationContext), (aekn) new aekp());
    }

    private final atvp a(addq addq, Account account) {
        if (!azrk.m()) {
            return addq.b();
        }
        try {
            iha b2 = ihb.b();
            b2.a = new mdz();
            return (atvp) acws.a(((meh) this.h.a(account)).a(b2.a()));
        } catch (InterruptedException | ExecutionException e2) {
            return atvp.d;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0248 A[SYNTHETIC, Splitter:B:103:0x0248] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e0 A[SYNTHETIC, Splitter:B:76:0x01e0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.atwh a(com.google.android.gms.common.internal.ClientContext r21, defpackage.adeu r22, defpackage.afxq r23, java.util.concurrent.atomic.AtomicBoolean r24) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.String r5 = "afxq"
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            android.accounts.Account r7 = r0.c
            com.google.android.gms.common.internal.ClientContext r10 = new com.google.android.gms.common.internal.ClientContext
            r10.<init>(r0)
            android.content.Context r8 = r1.a
            java.lang.String r8 = r8.getPackageName()
            r10.f = r8
            java.lang.String r8 = "https://www.googleapis.com/auth/webhistory"
            r10.d(r8)
            atwf r8 = defpackage.atwf.g
            aucd r8 = r8.o()
            boolean r9 = r8.c
            r15 = 0
            if (r9 != 0) goto L_0x002e
            goto L_0x0033
        L_0x002e:
            r8.c()
            r8.c = r15
        L_0x0033:
            aucj r9 = r8.b
            atwf r9 = (defpackage.atwf) r9
            java.lang.String r11 = "com.google.android.gms#udc-facs"
            r11.getClass()
            int r12 = r9.a
            r14 = 1
            r12 = r12 | r14
            r9.a = r12
            r9.b = r11
            amsv r9 = r1.c
            java.lang.Object r9 = r9.a()
            java.lang.String r9 = (java.lang.String) r9
            r12 = 2
            if (r9 == 0) goto L_0x0088
            atwe r11 = defpackage.atwe.c
            aucd r11 = r11.o()
            boolean r13 = r11.c
            if (r13 != 0) goto L_0x005a
            goto L_0x005f
        L_0x005a:
            r11.c()
            r11.c = r15
        L_0x005f:
            aucj r13 = r11.b
            atwe r13 = (defpackage.atwe) r13
            r9.getClass()
            r13.a = r12
            r13.b = r9
            boolean r9 = r8.c
            if (r9 != 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            r8.c()
            r8.c = r15
        L_0x0074:
            aucj r9 = r8.b
            atwf r9 = (defpackage.atwf) r9
            aucj r11 = r11.i()
            atwe r11 = (defpackage.atwe) r11
            r11.getClass()
            r9.c = r11
            int r11 = r9.a
            r11 = r11 | r12
            r9.a = r11
        L_0x0088:
            amqy r9 = r1.g
            java.lang.Object r9 = r9.a(r7)
            addq r9 = (defpackage.addq) r9
            boolean r11 = r9.a()
            r16 = 8
            if (r11 == 0) goto L_0x00d1
            atvp r9 = r1.a((defpackage.addq) r9, (android.accounts.Account) r7)
            boolean r11 = r8.c
            if (r11 != 0) goto L_0x00a1
            goto L_0x00a6
        L_0x00a1:
            r8.c()
            r8.c = r15
        L_0x00a6:
            aucj r11 = r8.b
            atwf r11 = (defpackage.atwf) r11
            r9.getClass()
            r11.e = r9
            int r9 = r11.a
            r9 = r9 | 4
            r11.a = r9
            boolean r9 = defpackage.azrk.m()
            if (r9 == 0) goto L_0x00d1
            boolean r9 = r8.c
            if (r9 != 0) goto L_0x00c0
            goto L_0x00c5
        L_0x00c0:
            r8.c()
            r8.c = r15
        L_0x00c5:
            aucj r9 = r8.b
            atwf r9 = (defpackage.atwf) r9
            int r11 = r9.a
            r11 = r11 | 8
            r9.a = r11
            r9.f = r14
        L_0x00d1:
            boolean r9 = defpackage.azrk.r()
            if (r9 != 0) goto L_0x00da
            r13 = 3
            goto L_0x014f
        L_0x00da:
            if (r3 != 0) goto L_0x00dd
            goto L_0x0113
        L_0x00dd:
            anax r9 = r23.a()
            amqy r11 = defpackage.adei.a
            java.lang.Iterable r9 = defpackage.anbs.a((java.lang.Iterable) r9, (defpackage.amqy) r11)
            boolean r11 = r8.c
            if (r11 != 0) goto L_0x00ec
            goto L_0x00f1
        L_0x00ec:
            r8.c()
            r8.c = r15
        L_0x00f1:
            aucj r11 = r8.b
            atwf r11 = (defpackage.atwf) r11
            r11.a()
            java.util.Iterator r9 = r9.iterator()
        L_0x00fc:
            boolean r17 = r9.hasNext()
            if (r17 == 0) goto L_0x0113
            java.lang.Object r17 = r9.next()
            r15 = r17
            atxf r15 = (defpackage.atxf) r15
            aucs r13 = r11.d
            int r15 = r15.l
            r13.d(r15)
            r15 = 0
            goto L_0x00fc
        L_0x0113:
            adeu r9 = defpackage.adeu.TRIGGERED_BY_EVENT
            acyn r9 = defpackage.acyn.UNKNOWN_SYNC_REASON
            int r9 = r22.ordinal()
            if (r9 == r14) goto L_0x012c
            if (r9 == r12) goto L_0x0128
            r13 = 3
            if (r9 == r13) goto L_0x0125
            atxf r9 = defpackage.atxf.UNKNOWN_REQUEST_REASON
            goto L_0x012f
        L_0x0125:
            atxf r9 = defpackage.atxf.EMPTY_CACHE
            goto L_0x012f
        L_0x0128:
            r13 = 3
            atxf r9 = defpackage.atxf.FORCED_SYNC
            goto L_0x012f
        L_0x012c:
            r13 = 3
            atxf r9 = defpackage.atxf.PERIODIC_SYNC
        L_0x012f:
            atxf r11 = defpackage.atxf.UNKNOWN_REQUEST_REASON
            if (r9 == r11) goto L_0x014f
            boolean r11 = r8.c
            if (r11 != 0) goto L_0x0138
            goto L_0x013e
        L_0x0138:
            r8.c()
            r11 = 0
            r8.c = r11
        L_0x013e:
            aucj r11 = r8.b
            atwf r11 = (defpackage.atwf) r11
            r9.getClass()
            r11.a()
            aucs r11 = r11.d
            int r9 = r9.l
            r11.d(r9)
        L_0x014f:
            aucj r8 = r8.i()
            r11 = r8
            atwf r11 = (defpackage.atwf) r11
            amsv r8 = r1.b     // Catch:{ eif -> 0x0243, babk -> 0x0241, babl -> 0x023f }
            if (r8 != 0) goto L_0x0194
            ades r0 = r1.l     // Catch:{ eif -> 0x0243, babk -> 0x0241, babl -> 0x023f }
            java.lang.Object r0 = r0.a()     // Catch:{ eif -> 0x0243, babk -> 0x0241, babl -> 0x023f }
            baaj r8 = defpackage.quk.d     // Catch:{ eif -> 0x0243, babk -> 0x0241, babl -> 0x023f }
            if (r8 == 0) goto L_0x0165
            goto L_0x017b
        L_0x0165:
            baai r8 = defpackage.baai.UNARY     // Catch:{ eif -> 0x0243, babk -> 0x0241, babl -> 0x023f }
            java.lang.String r9 = "footprints.oneplatform.FootprintsService/GetActivityControlsSettings"
            atwf r15 = defpackage.atwf.g     // Catch:{ eif -> 0x0243, babk -> 0x0241, babl -> 0x023f }
            baah r15 = defpackage.baoq.a(r15)     // Catch:{ eif -> 0x0243, babk -> 0x0241, babl -> 0x023f }
            atwh r17 = defpackage.atwh.d     // Catch:{ eif -> 0x0243, babk -> 0x0241, babl -> 0x023f }
            baah r12 = defpackage.baoq.a(r17)     // Catch:{ eif -> 0x0243, babk -> 0x0241, babl -> 0x023f }
            baaj r8 = defpackage.baaj.a(r8, r9, r15, r12)     // Catch:{ eif -> 0x0243, babk -> 0x0241, babl -> 0x023f }
            defpackage.quk.d = r8     // Catch:{ eif -> 0x0243, babk -> 0x0241, babl -> 0x023f }
        L_0x017b:
            quk r0 = (defpackage.quk) r0     // Catch:{ eif -> 0x0243, babk -> 0x0241, babl -> 0x023f }
            izd r8 = r0.a     // Catch:{ eif -> 0x0243, babk -> 0x0241, babl -> 0x023f }
            baaj r9 = defpackage.quk.d     // Catch:{ eif -> 0x0243, babk -> 0x0241, babl -> 0x023f }
            r18 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ eif -> 0x0243, babk -> 0x0241, babl -> 0x023f }
            r15 = 3
            r17 = 2
            r12 = r18
            r15 = 1
            r14 = r0
            java.lang.Object r0 = r8.a(r9, r10, r11, r12, r14)     // Catch:{ eif -> 0x023d, babk -> 0x023b, babl -> 0x0239 }
            atwh r0 = (defpackage.atwh) r0     // Catch:{ eif -> 0x023d, babk -> 0x023b, babl -> 0x0239 }
            r8 = r0
            goto L_0x01c4
        L_0x0194:
            r15 = 1
            r17 = 2
            boolean r8 = defpackage.azrk.d()     // Catch:{ eif -> 0x023d, babk -> 0x023b, babl -> 0x0239 }
            if (r8 != 0) goto L_0x01bb
            amsv r8 = r1.b     // Catch:{ eif -> 0x023d, babk -> 0x023b, babl -> 0x0239 }
            java.lang.Object r8 = r8.a()     // Catch:{ eif -> 0x023d, babk -> 0x023b, babl -> 0x0239 }
            baor r8 = (defpackage.baor) r8     // Catch:{ eif -> 0x023d, babk -> 0x023b, babl -> 0x0239 }
            azxg r9 = defpackage.apyq.a     // Catch:{ eif -> 0x023d, babk -> 0x023b, babl -> 0x0239 }
            android.accounts.Account r0 = r0.c     // Catch:{ eif -> 0x023d, babk -> 0x023b, babl -> 0x0239 }
            java.lang.String r0 = r0.name     // Catch:{ eif -> 0x023d, babk -> 0x023b, babl -> 0x0239 }
            apyq r0 = defpackage.apyq.a(r0)     // Catch:{ eif -> 0x023d, babk -> 0x023b, babl -> 0x0239 }
            baou r0 = r8.a((defpackage.azxg) r9, (java.lang.Object) r0)     // Catch:{ eif -> 0x023d, babk -> 0x023b, babl -> 0x0239 }
            baor r0 = (defpackage.baor) r0     // Catch:{ eif -> 0x023d, babk -> 0x023b, babl -> 0x0239 }
            atwh r0 = r0.a((defpackage.atwf) r11)     // Catch:{ eif -> 0x023d, babk -> 0x023b, babl -> 0x0239 }
            r8 = r0
            goto L_0x01c4
        L_0x01bb:
            baor r0 = e()     // Catch:{ eif -> 0x023d, babk -> 0x023b, babl -> 0x0239 }
            atwh r0 = r0.a((defpackage.atwf) r11)     // Catch:{ eif -> 0x023d, babk -> 0x023b, babl -> 0x0239 }
            r8 = r0
        L_0x01c4:
            acyb r0 = r1.a((defpackage.atwh) r8, (android.accounts.Account) r7)
            adef r9 = r1.d
            r9.a(r7, r8, r0)
            if (r0 == 0) goto L_0x01dd
            atwh r0 = r0.b
            if (r0 != 0) goto L_0x01d5
            atwh r0 = defpackage.atwh.d
        L_0x01d5:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x01dd
            r14 = 0
            goto L_0x01de
        L_0x01dd:
            r14 = 1
        L_0x01de:
            if (r3 == 0) goto L_0x0234
            afxt r0 = r3.a     // Catch:{ IOException -> 0x01ef }
            if (r0 != 0) goto L_0x01e5
            goto L_0x0206
        L_0x01e5:
            afyl r0 = r0.a     // Catch:{ IOException -> 0x01ef }
            aorr r0 = r0.b()     // Catch:{ IOException -> 0x01ef }
            defpackage.afxu.a(r0)     // Catch:{ IOException -> 0x01ef }
            goto L_0x0206
        L_0x01ef:
            r0 = move-exception
            anij r7 = r3.b
            anie r7 = r7.c()
            r7.a((java.lang.Throwable) r0)
            r0 = 90
            java.lang.String r9 = "b"
            anie r0 = r7.a((java.lang.String) r5, (java.lang.String) r9, (int) r0, (java.lang.String) r6)
            java.lang.String r5 = "Failed to update metadata after sync completed successfully!"
            r0.a((java.lang.String) r5)
        L_0x0206:
            adde r0 = r1.j
            agtf r5 = defpackage.agtf.a((int) r17)
            afyp r6 = r23.d()
            amqy r7 = defpackage.ader.a
            r5.a(r6, r7)
            r5.a((boolean) r14)
            atwy r5 = r5.a()
            adeu r6 = defpackage.adeu.FORCED
            if (r2 != r6) goto L_0x0222
            r6 = 1
            goto L_0x0223
        L_0x0222:
            r6 = 0
        L_0x0223:
            adeu r7 = defpackage.adeu.PERIODIC
            if (r2 != r7) goto L_0x0229
            r7 = 1
            goto L_0x022a
        L_0x0229:
            r7 = 0
        L_0x022a:
            adeu r9 = defpackage.adeu.EMPTY_CACHE
            if (r2 != r9) goto L_0x0230
            r9 = 1
            goto L_0x0231
        L_0x0230:
            r9 = 0
        L_0x0231:
            r0.a(r5, r6, r7, r9)
        L_0x0234:
            a(r15, r2, r3, r14, r4)
            return r8
        L_0x0239:
            r0 = move-exception
            goto L_0x0245
        L_0x023b:
            r0 = move-exception
            goto L_0x0245
        L_0x023d:
            r0 = move-exception
            goto L_0x0245
        L_0x023f:
            r0 = move-exception
            goto L_0x0244
        L_0x0241:
            r0 = move-exception
            goto L_0x0244
        L_0x0243:
            r0 = move-exception
        L_0x0244:
            r15 = 1
        L_0x0245:
            r7 = r0
            if (r3 == 0) goto L_0x02d8
            afxt r0 = r3.a     // Catch:{ IOException -> 0x0256 }
            if (r0 == 0) goto L_0x026d
            afyl r0 = r0.a     // Catch:{ IOException -> 0x0256 }
            aorr r0 = r0.c()     // Catch:{ IOException -> 0x0256 }
            defpackage.afxu.a(r0)     // Catch:{ IOException -> 0x0256 }
            goto L_0x026d
        L_0x0256:
            r0 = move-exception
            anij r8 = r3.b
            anie r8 = r8.c()
            r8.a((java.lang.Throwable) r0)
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r9 = "c"
            anie r0 = r8.a((java.lang.String) r5, (java.lang.String) r9, (int) r0, (java.lang.String) r6)
            java.lang.String r5 = "Failed to update metadata after sync failed!"
            r0.a((java.lang.String) r5)
        L_0x026d:
            adde r0 = r1.j
            boolean r5 = r7 instanceof defpackage.babk
            if (r5 == 0) goto L_0x027b
            r5 = r7
            babk r5 = (defpackage.babk) r5
            agtf r5 = defpackage.agtf.a((defpackage.babk) r5)
            goto L_0x02b4
        L_0x027b:
            boolean r5 = r7 instanceof defpackage.babl
            if (r5 == 0) goto L_0x0287
            r5 = r7
            babl r5 = (defpackage.babl) r5
            agtf r5 = defpackage.agtf.a((defpackage.babl) r5)
            goto L_0x02b4
        L_0x0287:
            boolean r5 = r7 instanceof defpackage.ein
            if (r5 == 0) goto L_0x0290
            agtf r5 = defpackage.agtf.a((int) r16)
            goto L_0x02b4
        L_0x0290:
            boolean r5 = r7 instanceof defpackage.eiu
            if (r5 == 0) goto L_0x029a
            r5 = 7
            agtf r5 = defpackage.agtf.a((int) r5)
            goto L_0x02b4
        L_0x029a:
            boolean r5 = r7 instanceof com.google.android.gms.auth.UserRecoverableAuthException
            if (r5 == 0) goto L_0x02a4
            r5 = 6
            agtf r5 = defpackage.agtf.a((int) r5)
            goto L_0x02b4
        L_0x02a4:
            boolean r5 = r7 instanceof defpackage.eif
            if (r5 == 0) goto L_0x02ae
            r5 = 5
            agtf r5 = defpackage.agtf.a((int) r5)
            goto L_0x02b4
        L_0x02ae:
            r5 = 3
            agtf r5 = defpackage.agtf.a((int) r5)
        L_0x02b4:
            afyp r8 = r23.d()
            amqy r9 = defpackage.adeq.a
            r5.a(r8, r9)
            atwy r5 = r5.a()
            adeu r8 = defpackage.adeu.FORCED
            if (r2 != r8) goto L_0x02c7
            r14 = 1
            goto L_0x02c8
        L_0x02c7:
            r14 = 0
        L_0x02c8:
            adeu r8 = defpackage.adeu.PERIODIC
            if (r2 != r8) goto L_0x02ce
            r8 = 1
            goto L_0x02cf
        L_0x02ce:
            r8 = 0
        L_0x02cf:
            adeu r9 = defpackage.adeu.EMPTY_CACHE
            if (r2 != r9) goto L_0x02d4
            goto L_0x02d5
        L_0x02d4:
            r15 = 0
        L_0x02d5:
            r0.a(r5, r14, r8, r15)
        L_0x02d8:
            r5 = 0
            a(r5, r2, r3, r5, r4)
            anij r0 = defpackage.addh.a()
            anie r0 = r0.c()
            long r2 = defpackage.azrk.k()
            int r3 = (int) r2
            r0.a((int) r3)
            r0.a((java.lang.Throwable) r7)
            r2 = 375(0x177, float:5.25E-43)
            java.lang.String r3 = "adev"
            java.lang.String r4 = "a"
            anie r0 = r0.a((java.lang.String) r3, (java.lang.String) r4, (int) r2, (java.lang.String) r6)
            java.lang.String r2 = "Account sync failed!"
            r0.a((java.lang.String) r2)
            goto L_0x0301
        L_0x0300:
            throw r7
        L_0x0301:
            goto L_0x0300
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adev.a(com.google.android.gms.common.internal.ClientContext, adeu, afxq, java.util.concurrent.atomic.AtomicBoolean):atwh");
    }

    public static atxf a(acyn acyn) {
        adeu adeu = adeu.TRIGGERED_BY_EVENT;
        acyn acyn2 = acyn.UNKNOWN_SYNC_REASON;
        switch (acyn.ordinal()) {
            case 1:
                return atxf.PUSH_MESSAGE;
            case 2:
                return atxf.FLAG_CHANGE;
            case 3:
                return atxf.ACCOUNT_CHANGE;
            case 4:
                return atxf.PUSH_REGISTRATION;
            case 5:
                return atxf.DEVICE_BOOT;
            case 6:
                return atxf.APP_UPDATE;
            default:
                return atxf.UNKNOWN_REQUEST_REASON;
        }
    }

    private final void a(List list) {
        try {
            afyw afyw = this.i;
            HashSet<Account> hashSet = new HashSet<>(list);
            HashSet hashSet2 = new HashSet();
            for (Account a2 : hashSet) {
                hashSet2.add(afyw.a(a2));
            }
            hashSet2.add(afyw.a());
            Uri a3 = afyw.a();
            ArrayList arrayList = new ArrayList(a3.getPathSegments());
            amrl.a(!arrayList.isEmpty(), (Object) "Can't retrieve Uri parent!");
            arrayList.remove(arrayList.size() - 1);
            Uri build = a3.buildUpon().path(amre.a('/').a((Iterable) arrayList)).build();
            for (Uri uri : afyw.a.c(build) ? afyw.a.f(build) : amzy.h()) {
                if (!hashSet2.contains(uri)) {
                    afyw.a.h(uri);
                }
            }
        } catch (Exception e2) {
            anie c2 = addh.a().c();
            c2.a((int) azrk.k());
            c2.a((Throwable) e2);
            c2.a("adev", "a", 628, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Sync metadata wipeout failed!");
        }
    }

    public static void a(AtomicBoolean atomicBoolean) {
        if (atomicBoolean.compareAndSet(true, false)) {
            long S = azrk.a.a().S();
            if (S > 0) {
                addd.a(S, TimeUnit.MILLISECONDS);
            }
        }
    }

    private static void a(boolean z, adeu adeu, afxq afxq, boolean z2, AtomicBoolean atomicBoolean) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (addd.a(azrk.a.a().R())) {
            addc a2 = addd.a();
            if (afxq != null) {
                z3 = afxq.a().contains(acyn.PUSH_MESSAGE);
            } else {
                z3 = false;
            }
            if (adeu == adeu.PERIODIC) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (adeu == adeu.FORCED) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (adeu == adeu.EMPTY_CACHE) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (afxq != null) {
                anhj a3 = afxq.a().iterator();
                while (true) {
                    if (a3.hasNext()) {
                        if (((acyn) a3.next()) != acyn.PUSH_MESSAGE) {
                            z7 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z7 = false;
            ((ahgz) a2.b.a()).b(Boolean.valueOf(z), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6), Boolean.valueOf(z7), Boolean.valueOf(z2));
            atomicBoolean.set(true);
        }
    }

    public final atwh a(ClientContext clientContext, adeu adeu) {
        afxq afxq;
        Account account = clientContext.c;
        a();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            Account account2 = clientContext.c;
            if (azrk.r()) {
                afxq = this.f.a(account2).a();
            } else {
                afxq = null;
            }
            return a(clientContext, adeu, afxq, atomicBoolean);
        } finally {
            a(atomicBoolean);
        }
    }

    public final atxj a(ClientContext clientContext, atxi atxi, boolean z) {
        atxj atxj;
        Account account = clientContext.c;
        ClientContext clientContext2 = new ClientContext(clientContext);
        clientContext2.f = this.a.getPackageName();
        clientContext2.d("https://www.googleapis.com/auth/webhistory");
        if (z) {
            Account account2 = clientContext.c;
            addq addq = (addq) this.g.a(account2);
            if (addq.a()) {
                aucd aucd = (aucd) atxi.c(5);
                aucd.a((aucj) atxi);
                atvp a2 = a(addq, account2);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                atxi atxi2 = (atxi) aucd.b;
                atxi atxi3 = atxi.f;
                a2.getClass();
                atxi2.c = a2;
                atxi2.a |= 4;
                if (azrk.m()) {
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    atxi atxi4 = (atxi) aucd.b;
                    atxi4.a |= 16;
                    atxi4.e = true;
                }
                atxi = (atxi) aucd.i();
            }
        }
        atxi atxi5 = atxi;
        if (this.b == null) {
            Object a3 = this.l.a();
            if (quk.e == null) {
                quk.e = baaj.a(baai.UNARY, "footprints.oneplatform.FootprintsService/UpdateActivityControlsSettings", baoq.a(atxi.f), baoq.a(atxj.b));
            }
            atxj = (atxj) ((quk) a3).a.a(quk.e, clientContext2, atxi5, 10000, TimeUnit.MILLISECONDS);
        } else if (azrk.d()) {
            atxj = e().a(atxi5);
        } else {
            atxj = ((baor) ((baor) this.b.a()).a(apyq.a, (Object) apyq.a(clientContext.c.name))).a(atxi5);
        }
        atwh atwh = atxj.a;
        if (atwh == null) {
            atwh = atwh.d;
        }
        acyb a4 = a(atwh, clientContext2.c);
        adef adef = this.d;
        Account account3 = clientContext.c;
        atwh atwh2 = atxj.a;
        if (atwh2 == null) {
            atwh2 = atwh.d;
        }
        adef.a(account3, atwh2, a4);
        return atxj;
    }

    public final ClientContext a(Account account) {
        ClientContext clientContext = new ClientContext();
        clientContext.b = this.a.getApplicationInfo().uid;
        clientContext.c = account;
        clientContext.e = this.a.getPackageName();
        clientContext.f = this.a.getPackageName();
        clientContext.d("https://www.googleapis.com/auth/webhistory");
        return clientContext;
    }

    public final List a() {
        List d2 = d();
        this.e.a(d2);
        if (azrk.r()) {
            afxr c2 = this.f.c();
            afyy afyy = this.f;
            afyy.getClass();
            try {
                afxu.a(c2.a.a.a(anbs.a(anbs.a(anbs.a((Iterable) d2, (amqy) new adeh(afyy)), afxp.a), afxs.a)));
            } catch (IOException e2) {
                anie c3 = c2.b.c();
                c3.a((Throwable) e2);
                c3.a("afxr", "a", 60, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to flush sync metadata!");
            }
            try {
                afyw afyw = this.i;
                HashSet<Account> hashSet = new HashSet<>(d2);
                HashSet hashSet2 = new HashSet();
                for (Account a2 : hashSet) {
                    hashSet2.add(afyw.a(a2));
                }
                hashSet2.add(afyw.a());
                Uri a3 = afyw.a();
                ArrayList arrayList = new ArrayList(a3.getPathSegments());
                amrl.a(!arrayList.isEmpty(), (Object) "Can't retrieve Uri parent!");
                arrayList.remove(arrayList.size() - 1);
                Uri build = a3.buildUpon().path(amre.a('/').a((Iterable) arrayList)).build();
                for (Uri uri : afyw.a.c(build) ? afyw.a.f(build) : amzy.h()) {
                    if (!hashSet2.contains(uri)) {
                        afyw.a.h(uri);
                    }
                }
            } catch (Exception e3) {
                anie c4 = addh.a().c();
                c4.a((int) azrk.k());
                c4.a((Throwable) e3);
                c4.a("adev", "a", 628, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Sync metadata wipeout failed!");
            }
        }
        return d2;
    }

    public final void a(ClientContext clientContext, adeu adeu, AtomicBoolean atomicBoolean) {
        afxq afxq;
        Account account = clientContext.c;
        if (azrk.r()) {
            afxq = this.f.a(account).a();
            if (azrk.a.a().G() && adeu == adeu.TRIGGERED_BY_EVENT && afxq.a().isEmpty()) {
                return;
            }
        } else {
            afxq = null;
        }
        a(clientContext, adeu, afxq, atomicBoolean);
    }

    public final boolean a(adeu adeu) {
        a();
        List<Account> d2 = d();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        boolean z = true;
        for (Account a2 : d2) {
            try {
                a(a(a2), adeu, atomicBoolean);
            } catch (babk | babl | eif | InterruptedException | ExecutionException e2) {
                z = false;
            }
        }
        a(atomicBoolean);
        return z;
    }
}
