package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.handler.DirectiveHandler$2;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: vbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vbf implements uys, uyi {
    public final Context a;
    public final arwg b;
    public final uxu c;
    public final uyv d;
    public final uyy e;
    public final uyz f;
    public Long g = null;
    public final arwm h = new vbe(this, "DirectiveHandler.updateDirectiveState");
    private final ved i;
    private final vav j;
    private final uyt k;
    private final uyj l;
    private final BroadcastReceiver m = new DirectiveHandler$2(this, "nearby");
    private boolean n;

    public vbf(Context context) {
        uxu uxu = new uxu(context);
        this.a = context;
        this.c = uxu;
        this.b = (arwg) thl.a(context, arwg.class);
        this.i = (ved) thl.a(context, ved.class);
        this.d = new uyv(uxu);
        this.e = new uyy(context);
        this.f = (uyz) thl.a(context, uyz.class);
        this.j = (vav) thl.a(context, vav.class);
        uyt uyt = (uyt) thl.a(this.a, uyt.class);
        this.k = uyt;
        uyt.a((uys) this);
        uyj uyj = (uyj) thl.a(this.a, uyj.class);
        this.l = uyj;
        uyj.d.b();
        uyj.e.add(this);
    }

    private static Set a(Strategy strategy) {
        return !strategy.a() ? Collections.emptySet() : c(strategy);
    }

    private static Set b(Strategy strategy) {
        return !strategy.b() ? Collections.emptySet() : c(strategy);
    }

    private static Set c(Strategy strategy) {
        ob obVar = new ob();
        if (strategy.c()) {
            obVar.add(avch.BLE_ADVERTISING_PACKET);
        }
        if (strategy.d()) {
            obVar.add(avch.BLUETOOTH_CLASSIC_NAME);
        }
        if (strategy.e()) {
            obVar.add(avch.AUDIO_ULTRASOUND_PASSBAND);
        }
        return obVar;
    }

    public final void d() {
        if (this.n) {
            try {
                this.n = false;
                this.a.unregisterReceiver(this.m);
            } catch (Exception e2) {
                anih anih = (anih) tgc.a.c();
                anih.a((Throwable) e2);
                ((anih) anih.a("vbf", "d", 455, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DirectiveHandler: Exception unregistering mBluetoothStateReceiver.");
            }
        }
    }

    private static void b(Set set) {
        set.remove(avch.BLE_ADVERTISING_PACKET);
        set.remove(avch.BLE_GATT_SERVICE);
        set.remove(avch.BLUETOOTH_CLASSIC_NAME);
    }

    public final long a(Set set) {
        avaa avaa;
        vgo vgo;
        Set set2 = set;
        amzg q = amzg.q();
        Iterator it = set.iterator();
        long j2 = Long.MAX_VALUE;
        while (it.hasNext()) {
            avch avch = (avch) it.next();
            uyj uyj = this.l;
            if (avch == avch.AUDIO_ULTRASOUND_PASSBAND && uyj.b()) {
                uyg uyg = uyj.f;
                byte[] bArr = uyg.b.b;
                aucd o = avaa.e.o();
                int length = bArr.length;
                byte[] bArr2 = new byte[(length + 1)];
                bArr2[0] = uwi.a();
                System.arraycopy(bArr, 0, bArr2, 1, length);
                String d2 = jhy.d(bArr2);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avaa avaa2 = (avaa) o.b;
                d2.getClass();
                avaa2.a |= 1;
                avaa2.b = d2;
                jjg jjg = tgc.a;
                jjp.a(bArr2);
                String str = ((avaa) o.b).b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avaa avaa3 = (avaa) o.b;
                avaa3.a |= 2;
                avaa3.c = elapsedRealtime;
                long elapsedRealtime2 = SystemClock.elapsedRealtime() + vds.b(uyg.c.e);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avaa avaa4 = (avaa) o.b;
                avaa4.a |= 4;
                avaa4.d = elapsedRealtime2;
                avaa = (avaa) o.i();
            } else {
                ved ved = this.i;
                ved.b.b();
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                avaa[] b2 = ved.b(avch.k);
                if (b2 != null) {
                    int length2 = b2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        avaa = b2[i2];
                        if (avaa.c <= elapsedRealtime3 && avaa.d > elapsedRealtime3) {
                            break;
                        }
                        i2++;
                    }
                }
                avaa = null;
            }
            if (avaa != null) {
                tgh a2 = tgh.a(avaa.b);
                q.a((Object) a2, (Object) avch);
                if (avch != avch.AUDIO_ULTRASOUND_PASSBAND || !this.l.b()) {
                    vgo = new vgo(a2, this.j.a(avch));
                } else {
                    auza auza = (auza) auzb.d.o();
                    int length3 = a2.a.length;
                    if (auza.c) {
                        auza.c();
                        auza.c = false;
                    }
                    auzb auzb = (auzb) auza.b;
                    int i3 = auzb.a | 1;
                    auzb.a = i3;
                    auzb.b = length3;
                    "".getClass();
                    auzb.a = 2 | i3;
                    auzb.c = "";
                    jjg jjg2 = tgc.a;
                    jjp.a(a2.a);
                    vgo = new vgo(a2, (auzb) auza.i());
                }
                this.d.a(avch, vgo);
                j2 = Math.min(avaa.d, j2);
            } else {
                it.remove();
            }
        }
        uyv uyv = this.d;
        jjg jjg3 = tgc.a;
        vgu.a((Iterable) set);
        anhj a3 = uxu.a.iterator();
        while (a3.hasNext()) {
            avch avch2 = (avch) a3.next();
            if (!set2.contains(avch2)) {
                uyv.a(avch2);
            }
        }
        vgw vgw = (vgw) thl.a(this.a, vgw.class);
        for (tgh tgh : q.m()) {
            Set<avch> a4 = q.c((Object) tgh);
            vgw.c.b();
            if (vgw.b(tgh)) {
                if (vgw.a.get(tgh) == null) {
                    vgw.a(tgh);
                    avak avak = (avak) aval.d.o();
                    String a5 = tgh.a();
                    if (avak.c) {
                        avak.c();
                        avak.c = false;
                    }
                    aval aval = (aval) avak.b;
                    a5.getClass();
                    aval.a |= 1;
                    aval.b = a5;
                    for (avch avch3 : a4) {
                        aucd o2 = avam.e.o();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        avam avam = (avam) o2.b;
                        avam.b = avch3.k;
                        avam.a |= 1;
                        avak.a((avam) o2.i());
                    }
                    vgw.a(tgh, (aval) avak.i());
                }
            }
        }
        this.f.a(this.a, (String) null, 2, set2);
        return j2;
    }

    public final void b() {
        c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x023c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r20 = this;
            r0 = r20
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            ob r3 = new ob
            r3.<init>()
            ob r4 = new ob
            r4.<init>()
            ob r5 = new ob
            r5.<init>()
            long r6 = android.os.SystemClock.elapsedRealtime()
            uyj r8 = r0.l
            java.util.Set r8 = r8.c
            java.util.Iterator r8 = r8.iterator()
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x002c:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x006a
            java.lang.Object r13 = r8.next()
            uyg r13 = (defpackage.uyg) r13
            long r14 = r13.a()
            int r16 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x0068
            com.google.android.gms.nearby.messages.Strategy r9 = r13.c
            java.util.Set r10 = a((com.google.android.gms.nearby.messages.Strategy) r9)
            r3.addAll(r10)
            java.util.Set r10 = b((com.google.android.gms.nearby.messages.Strategy) r9)
            r4.addAll(r10)
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x0057
        L_0x0056:
            goto L_0x005e
        L_0x0057:
            boolean r9 = r9.d()
            if (r9 == 0) goto L_0x0063
            goto L_0x0056
        L_0x005e:
            com.google.android.gms.nearby.messages.ClientAppIdentifier r9 = r13.e
            r5.add(r9)
        L_0x0063:
            long r11 = java.lang.Math.min(r14, r11)
            goto L_0x0069
        L_0x0068:
        L_0x0069:
            goto L_0x002c
        L_0x006a:
            uyt r8 = r0.k
            java.util.Set r8 = r8.b()
            java.util.Iterator r8 = r8.iterator()
            r10 = 0
        L_0x0075:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x00da
            java.lang.Object r13 = r8.next()
            uyq r13 = (defpackage.uyq) r13
            long r14 = r13.e
            int r17 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r17 >= 0) goto L_0x00d5
            com.google.android.gms.nearby.messages.Strategy r9 = r13.d
            boolean r18 = r13.a()
            if (r18 == 0) goto L_0x00a1
            boolean r18 = r9.c()
            r10 = r10 | r18
            int r9 = r9.j
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2.add(r9)
            r18 = r6
            goto L_0x00c8
        L_0x00a1:
            r18 = r6
            java.util.Set r6 = a((com.google.android.gms.nearby.messages.Strategy) r9)
            r3.addAll(r6)
            java.util.Set r6 = b((com.google.android.gms.nearby.messages.Strategy) r9)
            r4.addAll(r6)
            boolean r6 = r9.c()
            if (r6 != 0) goto L_0x00bf
            boolean r6 = r9.d()
            if (r6 == 0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            goto L_0x00c8
        L_0x00bf:
            uyt r6 = r0.k
            com.google.android.gms.nearby.messages.ClientAppIdentifier r6 = r6.a((defpackage.uyq) r13)
            r5.add(r6)
        L_0x00c8:
            com.google.android.gms.nearby.messages.MessageFilter r6 = r13.c
            java.util.List r6 = r6.f
            r1.addAll(r6)
            long r6 = java.lang.Math.min(r14, r11)
            r11 = r6
            goto L_0x00d7
        L_0x00d5:
            r18 = r6
        L_0x00d7:
            r6 = r18
            goto L_0x0075
        L_0x00da:
            boolean r6 = r5.isEmpty()
            r7 = 1
            if (r6 != 0) goto L_0x0132
            vgm r6 = new vgm
            android.content.Context r8 = r0.a
            r6.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L_0x00ec:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x010b
            java.lang.Object r8 = r5.next()
            com.google.android.gms.nearby.messages.ClientAppIdentifier r8 = (com.google.android.gms.nearby.messages.ClientAppIdentifier) r8
            if (r8 == 0) goto L_0x00ec
            boolean r9 = r8.d()
            if (r9 != 0) goto L_0x0132
            java.lang.String r8 = r8.c()
            boolean r8 = r6.b(r8)
            if (r8 == 0) goto L_0x00ec
            goto L_0x0132
        L_0x010b:
            android.bluetooth.BluetoothAdapter r5 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r5 == 0) goto L_0x0117
            boolean r5 = r5.isEnabled()
            if (r5 != 0) goto L_0x011d
        L_0x0117:
            b((java.util.Set) r3)
            b((java.util.Set) r4)
        L_0x011d:
            boolean r5 = r0.n
            if (r5 != 0) goto L_0x0135
            r0.n = r7
            android.content.Context r5 = r0.a
            android.content.BroadcastReceiver r6 = r0.m
            android.content.IntentFilter r8 = new android.content.IntentFilter
            java.lang.String r9 = "android.bluetooth.adapter.action.STATE_CHANGED"
            r8.<init>(r9)
            r5.registerReceiver(r6, r8)
            goto L_0x0135
        L_0x0132:
            r20.d()
        L_0x0135:
            avch r5 = defpackage.avch.BLE_ADVERTISING_PACKET
            boolean r5 = r3.contains(r5)
            if (r5 != 0) goto L_0x014f
            vav r5 = r0.j
            auyt r5 = r5.f
            auyy r5 = r5.d
            if (r5 != 0) goto L_0x0148
            auyy r5 = defpackage.auyy.v
            goto L_0x0149
        L_0x0148:
        L_0x0149:
            boolean r5 = r5.t
            if (r5 == 0) goto L_0x014f
            r9 = 1
            goto L_0x0150
        L_0x014f:
            r9 = 0
        L_0x0150:
            r5 = r10 & r9
            if (r5 == 0) goto L_0x015b
            avch r6 = defpackage.avch.BLE_ADVERTISING_PACKET
            java.util.Set r6 = java.util.Collections.singleton(r6)
            goto L_0x015f
        L_0x015b:
            java.util.Set r6 = java.util.Collections.emptySet()
        L_0x015f:
            jjg r7 = defpackage.tgc.a
            defpackage.vgu.a((java.lang.Iterable) r3)
            defpackage.vgu.a((java.lang.Iterable) r6)
            defpackage.vgu.a((java.lang.Iterable) r4)
            r0.a(r3, r1)
            long r3 = r0.a((java.util.Set) r4)
            long r3 = java.lang.Math.min(r3, r11)
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r7 = "uxu"
            r8 = 0
            if (r5 == 0) goto L_0x01d8
            uxu r5 = r0.c
            uyy r9 = r0.e
            int[] r2 = defpackage.jhx.a((java.util.Collection) r2)
            arwg r10 = r5.e
            r10.b()
            ased r10 = r5.a()
            if (r10 != 0) goto L_0x01a7
            jjg r1 = defpackage.tgc.a
            anie r1 = r1.b()
            anih r1 = (defpackage.anih) r1
            r2 = 385(0x181, float:5.4E-43)
            java.lang.String r5 = "a"
            anie r1 = r1.a((java.lang.String) r7, (java.lang.String) r5, (int) r2, (java.lang.String) r6)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "Unable to start background listening without NearbyDirect"
            r1.a((java.lang.String) r2)
            goto L_0x020b
        L_0x01a7:
            java.util.Set r1 = r5.a((java.util.Set) r1)
            java.lang.String r6 = r5.h
            if (r6 == 0) goto L_0x01b0
            goto L_0x01b1
        L_0x01b0:
            r6 = r8
        L_0x01b1:
            asey[] r2 = defpackage.uxu.a((int[]) r2)
            asgc r2 = defpackage.uxu.a((defpackage.asey[]) r2)
            avch r7 = defpackage.avch.BLE_ADVERTISING_PACKET
            uxl r11 = new uxl
            r11.<init>(r5)
            asgs r7 = r5.a((defpackage.avch) r7, (defpackage.vgr) r9, (defpackage.uxl) r11)
            android.content.Context r9 = r5.d
            android.os.WorkSource r9 = defpackage.vgy.a(r9)
            asfz r1 = r10.a(r2, r7, r9, r1)
            java.lang.String r1 = r1.b
            r5.h = r1
            if (r6 == 0) goto L_0x020b
            r10.a((java.lang.String) r6)
            goto L_0x020b
        L_0x01d8:
            uxu r1 = r0.c
            arwg r2 = r1.e
            r2.b()
            ased r2 = r1.a()
            if (r2 != 0) goto L_0x01fd
            jjg r1 = defpackage.tgc.a
            anie r1 = r1.b()
            anih r1 = (defpackage.anih) r1
            r2 = 438(0x1b6, float:6.14E-43)
            java.lang.String r5 = "b"
            anie r1 = r1.a((java.lang.String) r7, (java.lang.String) r5, (int) r2, (java.lang.String) r6)
            anih r1 = (defpackage.anih) r1
            java.lang.String r2 = "Unable to stop background listening without NearbyDirect"
            r1.a((java.lang.String) r2)
            goto L_0x020b
        L_0x01fd:
            java.lang.String r5 = r1.h
            if (r5 == 0) goto L_0x0206
            r2.a((java.lang.String) r5)
            r1.h = r8
        L_0x0206:
            vak r1 = r1.g
            r1.b()
        L_0x020b:
            long r1 = android.os.SystemClock.elapsedRealtime()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x023c
            r5 = 3000(0xbb8, double:1.482E-320)
            long r3 = r3 + r5
            java.lang.Long r5 = r0.g
            if (r5 != 0) goto L_0x0220
            goto L_0x0229
        L_0x0220:
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0229
            return
        L_0x0229:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.g = r3
            arwg r4 = r0.b
            arwm r5 = r0.h
            long r6 = r3.longValue()
            long r6 = r6 - r1
            r4.a(r5, r6)
            return
        L_0x023c:
            arwg r1 = r0.b
            arwm r2 = r0.h
            r1.e(r2)
            r0.g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbf.c():void");
    }

    public final void a() {
        c();
    }

    public final void a(avch avch) {
        uxu uxu = this.c;
        uxu.e.b();
        vgt vgt = (vgt) uxu.c.get(avch.k);
        if (vgt != null) {
            vgt.b();
            uxu.c.remove(avch.k);
            jjg jjg = tgc.a;
            vgu.a((Iterable) uxu.a(uxu.c));
            return;
        }
        jjg jjg2 = tgc.a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: uzo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: uzo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: uxq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: uzo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: uzo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.avch r13, defpackage.auzb r14, java.util.Set r15) {
        /*
            r12 = this;
            uxu r6 = r12.c
            uyy r7 = r12.e
            arwg r0 = r6.e
            r0.b()
            android.util.SparseArray r0 = r6.c
            int r1 = r13.k
            java.lang.Object r0 = r0.get(r1)
            vgt r0 = (defpackage.vgt) r0
            if (r0 == 0) goto L_0x0018
            jjg r13 = defpackage.tgc.a
            return
        L_0x0018:
            ased r3 = r6.a()
            java.lang.String r8 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r9 = "a"
            java.lang.String r10 = "uxu"
            if (r3 != 0) goto L_0x003a
            jjg r13 = defpackage.tgc.a
            anie r13 = r13.b()
            anih r13 = (defpackage.anih) r13
            r14 = 249(0xf9, float:3.49E-43)
            anie r13 = r13.a((java.lang.String) r10, (java.lang.String) r9, (int) r14, (java.lang.String) r8)
            anih r13 = (defpackage.anih) r13
            java.lang.String r14 = "Unable to start listening without live NearbyDirect"
            r13.a((java.lang.String) r14)
            return
        L_0x003a:
            asgb r0 = defpackage.asgb.OPERATION_STATUS_UNKNOWN
            avch r0 = defpackage.avch.TOKEN_MEDIUM_UNKNOWN
            int r0 = r13.ordinal()
            r1 = 1
            if (r0 == r1) goto L_0x007d
            r1 = 2
            if (r0 == r1) goto L_0x0070
            r1 = 3
            if (r0 == r1) goto L_0x0070
            r15 = 8
            if (r0 == r15) goto L_0x006b
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = defpackage.vgu.a((defpackage.avch) r13)
            java.lang.String r15 = "Unknown Medium requested: "
            int r0 = r13.length()
            if (r0 != 0) goto L_0x0063
            java.lang.String r13 = new java.lang.String
            r13.<init>(r15)
            goto L_0x0067
        L_0x0063:
            java.lang.String r13 = r15.concat(r13)
        L_0x0067:
            r14.<init>(r13)
            throw r14
        L_0x006b:
            uzb r15 = r6.f
            uzo r15 = r15.b
            goto L_0x0081
        L_0x0070:
            android.content.Context r2 = r6.d
            uxq r11 = new uxq
            r0 = r11
            r1 = r6
            r4 = r13
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r15 = r11
            goto L_0x0081
        L_0x007d:
            uzb r15 = r6.f
            uzo r15 = r15.d
        L_0x0081:
            boolean r0 = r15.a()
            if (r0 == 0) goto L_0x00da
            arwg r0 = r6.e
            r0.b()
            boolean r0 = r15.a()
            if (r0 != 0) goto L_0x00ac
            jjg r14 = defpackage.tgc.a
            anie r14 = r14.b()
            anih r14 = (defpackage.anih) r14
            r15 = 288(0x120, float:4.04E-43)
            anie r14 = r14.a((java.lang.String) r10, (java.lang.String) r9, (int) r15, (java.lang.String) r8)
            anih r14 = (defpackage.anih) r14
            java.lang.String r13 = defpackage.vgu.a((defpackage.avch) r13)
            java.lang.String r15 = "%s is not supported to scan"
            r14.a((java.lang.String) r15, (java.lang.Object) r13)
            return
        L_0x00ac:
            android.util.SparseArray r0 = r6.c
            int r1 = r13.k
            r0.put(r1, r15)
            jjg r0 = defpackage.tgc.a     // Catch:{ vgs -> 0x00bc }
            defpackage.vgu.a((defpackage.avch) r13)     // Catch:{ vgs -> 0x00bc }
            r15.a(r7, r14)     // Catch:{ vgs -> 0x00bc }
            return
        L_0x00bc:
            r14 = move-exception
            jjg r15 = defpackage.tgc.a
            anie r15 = r15.b()
            anih r15 = (defpackage.anih) r15
            r15.a((java.lang.Throwable) r14)
            r14 = 299(0x12b, float:4.19E-43)
            anie r14 = r15.a((java.lang.String) r10, (java.lang.String) r9, (int) r14, (java.lang.String) r8)
            anih r14 = (defpackage.anih) r14
            java.lang.String r13 = defpackage.vgu.a((defpackage.avch) r13)
            java.lang.String r15 = "Fail to start listening: %s"
            r14.a((java.lang.String) r15, (java.lang.Object) r13)
            return
        L_0x00da:
            jjg r14 = defpackage.tgc.a
            defpackage.vgu.a((defpackage.avch) r13)
            r15.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbf.a(avch, auzb, java.util.Set):void");
    }

    public final void a(Set set, Set set2) {
        auzb auzb;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            avch avch = (avch) it.next();
            if (avch != avch.AUDIO_ULTRASOUND_PASSBAND || !this.k.e()) {
                auzb = this.j.a(avch);
            } else {
                uyq uyq = this.k.h;
                auza auza = (auza) auzb.d.o();
                int i2 = uyq.c.g + 1;
                if (auza.c) {
                    auza.c();
                    auza.c = false;
                }
                auzb auzb2 = (auzb) auza.b;
                int i3 = auzb2.a | 1;
                auzb2.a = i3;
                auzb2.b = i2;
                "".getClass();
                auzb2.a = i3 | 2;
                auzb2.c = "";
                auzb = (auzb) auza.i();
            }
            a(avch, auzb, set2);
        }
        anhj a2 = uxu.a.iterator();
        while (a2.hasNext()) {
            avch avch2 = (avch) a2.next();
            if (!set.contains(avch2)) {
                a(avch2);
            }
        }
        this.f.a(this.a, (String) null, 3, set);
    }

    public final void a(uyq uyq) {
        c();
    }
}
