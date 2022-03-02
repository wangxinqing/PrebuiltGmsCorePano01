package defpackage;

import android.content.Context;
import android.os.ParcelUuid;
import android.util.SparseArray;
import com.google.android.gms.nearby.messages.ble.BleFilter;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: uxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uxu {
    public static final anax a = anax.a(avch.AUDIO_AUDIBLE_DTMF, avch.AUDIO_ULTRASOUND_PASSBAND, avch.BLUETOOTH_CLASSIC_NAME, avch.BLE_ADVERTISING_PACKET);
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();
    public final Context d;
    public final arwg e;
    public final uzb f;
    public final vak g;
    public String h;
    private final vav i;

    public uxu(Context context) {
        this.d = context;
        this.i = (vav) thl.a(context, vav.class);
        this.e = (arwg) thl.a(context, arwg.class);
        this.f = (uzb) thl.a(context, uzb.class);
        this.g = (vak) thl.a(context, vak.class);
    }

    public static asep a(avch avch, vgo vgo) {
        asgb asgb = asgb.OPERATION_STATUS_UNKNOWN;
        avch avch2 = avch.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = avch.ordinal();
        if (ordinal == 2) {
            aucf aucf = (aucf) asep.f.o();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            asep asep = (asep) aucf.b;
            asep.b = 2;
            asep.a |= 1;
            aucd o = asfg.c.o();
            aucd o2 = asfh.d.o();
            String str = vgo.b.c;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            asfh asfh = (asfh) o2.b;
            str.getClass();
            asfh.a |= 1;
            asfh.b = str;
            asfh asfh2 = (asfh) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asfg asfg = (asfg) o.b;
            asfh2.getClass();
            asfg.b = asfh2;
            asfg.a |= 1;
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            asep asep2 = (asep) aucf.b;
            asfg asfg2 = (asfg) o.i();
            asfg2.getClass();
            asep2.d = asfg2;
            asep2.a |= 4;
            aucd o3 = asfp.c.o();
            auay a2 = auay.a(vgo.a.a);
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            asfp asfp = (asfp) o3.b;
            a2.getClass();
            asfp.a |= 1;
            asfp.b = a2;
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            asep asep3 = (asep) aucf.b;
            asfp asfp2 = (asfp) o3.i();
            asfp2.getClass();
            asep3.c = asfp2;
            asep3.a |= 2;
            return (asep) aucf.i();
        } else if (ordinal == 3) {
            aucf aucf2 = (aucf) asep.f.o();
            if (aucf2.c) {
                aucf2.c();
                aucf2.c = false;
            }
            asep asep4 = (asep) aucf2.b;
            asep4.b = 3;
            asep4.a |= 1;
            asew asew = asew.d;
            if (aucf2.c) {
                aucf2.c();
                aucf2.c = false;
            }
            asep asep5 = (asep) aucf2.b;
            asew.getClass();
            asep5.e = asew;
            asep5.a |= 8;
            aucd o4 = asfp.c.o();
            auay a3 = auay.a(vgo.a.a);
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            asfp asfp3 = (asfp) o4.b;
            a3.getClass();
            asfp3.a |= 1;
            asfp3.b = a3;
            if (aucf2.c) {
                aucf2.c();
                aucf2.c = false;
            }
            asep asep6 = (asep) aucf2.b;
            asfp asfp4 = (asfp) o4.i();
            asfp4.getClass();
            asep6.c = asfp4;
            asep6.a |= 2;
            return (asep) aucf2.i();
        } else {
            String valueOf = String.valueOf(avch);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Unsupported medium to advertise: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void b() {
        this.e.b();
        ased a2 = a();
        if (a2 == null) {
            ((anih) ((anih) tgc.a.b()).a("uxu", "b", 438, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to stop background listening without NearbyDirect");
            return;
        }
        String str = this.h;
        if (str != null) {
            a2.a(str);
            this.h = null;
        }
        this.g.b();
    }

    public static asgc a(avch avch, auzb auzb) {
        asgb asgb = asgb.OPERATION_STATUS_UNKNOWN;
        avch avch2 = avch.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = avch.ordinal();
        if (ordinal == 2) {
            aucf aucf = (aucf) asgc.e.o();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            asgc asgc = (asgc) aucf.b;
            asgc.b = 3;
            asgc.a |= 1;
            aucd o = asfi.c.o();
            aucd o2 = asfh.d.o();
            String str = auzb.c;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            asfh asfh = (asfh) o2.b;
            str.getClass();
            int i2 = asfh.a | 1;
            asfh.a = i2;
            asfh.b = str;
            int i3 = auzb.b;
            asfh.a = i2 | 2;
            asfh.c = i3;
            asfh asfh2 = (asfh) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            asfi asfi = (asfi) o.b;
            asfh2.getClass();
            asfi.b = asfh2;
            asfi.a |= 1;
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            asgc asgc2 = (asgc) aucf.b;
            asfi asfi2 = (asfi) o.i();
            asfi2.getClass();
            asgc2.c = asfi2;
            asgc2.a |= 2;
            return (asgc) aucf.i();
        } else if (ordinal != 3) {
            return null;
        } else {
            return a((asey[]) null);
        }
    }

    public static asgc a(asey[] aseyArr) {
        int i2;
        aucf aucf = (aucf) asgc.e.o();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        asgc asgc = (asgc) aucf.b;
        asgc.b = 4;
        asgc.a |= 1;
        aucd o = asfa.f.o();
        if (aseyArr == null) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfa asfa = (asfa) o.b;
        asfa.b = i2 - 1;
        asfa.a |= 1;
        aseu aseu = aseu.BLE_ADVERTISE_SCAN_RECORD;
        if (o.c) {
            o.c();
            o.c = false;
        }
        asfa asfa2 = (asfa) o.b;
        asfa2.c = aseu.e;
        asfa2.a = 2 | asfa2.a;
        if (aseyArr != null) {
            List<asey> asList = Arrays.asList(aseyArr);
            if (o.c) {
                o.c();
                o.c = false;
            }
            asfa asfa3 = (asfa) o.b;
            if (!asfa3.d.a()) {
                asfa3.d = aucj.a(asfa3.d);
            }
            for (asey asey : asList) {
                asfa3.d.d(asey.d);
            }
        }
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        asgc asgc2 = (asgc) aucf.b;
        asfa asfa4 = (asfa) o.i();
        asfa4.getClass();
        asgc2.d = asfa4;
        asgc2.a |= 4;
        return (asgc) aucf.i();
    }

    private static auzb a(Context context, avch avch) {
        vav vav = (vav) thl.a(context, vav.class);
        asgb asgb = asgb.OPERATION_STATUS_UNKNOWN;
        avch avch2 = avch.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = avch.ordinal();
        if (ordinal == 2) {
            auyq auyq = vav.f.k;
            if (auyq == null) {
                auyq = auyq.g;
            }
            auzb auzb = auyq.c;
            return auzb == null ? auzb.d : auzb;
        } else if (ordinal != 3) {
            ((anih) ((anih) tgc.a.c()).a("uxu", "a", 685, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unsupported medium in Nearby.Direct: %s", (Object) avch);
            return null;
        } else {
            auyq auyq2 = vav.f.k;
            if (auyq2 == null) {
                auyq2 = auyq.g;
            }
            auzb auzb2 = auyq2.d;
            return auzb2 == null ? auzb.d : auzb2;
        }
    }

    public static aval a(avch avch, tgh tgh) {
        avak avak = (avak) aval.d.o();
        String a2 = tgh.a();
        if (avak.c) {
            avak.c();
            avak.c = false;
        }
        aval aval = (aval) avak.b;
        a2.getClass();
        aval.a |= 1;
        aval.b = a2;
        aucd o = avam.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avam avam = (avam) o.b;
        avam.b = avch.k;
        avam.a |= 1;
        avak.a((avam) o.i());
        return (aval) avak.i();
    }

    public static Set a(SparseArray sparseArray) {
        EnumSet<E> noneOf = EnumSet.noneOf(avch.class);
        anhj a2 = a.iterator();
        while (a2.hasNext()) {
            avch avch = (avch) a2.next();
            if (sparseArray.get(avch.k) != null) {
                noneOf.add(avch);
            }
        }
        return noneOf;
    }

    private final void a(vgq vgq, avch avch, vgo vgo) {
        this.e.b();
        if (vgq == null || !vgq.a()) {
            ((anih) ((anih) tgc.a.b()).a("uxu", "a", 201, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s is not supported to advertise", (Object) vgu.a(avch));
            return;
        }
        this.b.put(avch.k, vgq);
        try {
            jjg jjg = tgc.a;
            vgo.a.a();
            vgu.a(avch);
            vgq.b(vgo);
        } catch (vgp e2) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uxu", "a", 213, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Fail to start advertising: %s", (Object) vgu.a(avch));
        }
    }

    private final void a(vgt vgt, avch avch, uyy uyy, auzb auzb) {
        this.e.b();
        if (vgt == null || !vgt.a()) {
            ((anih) ((anih) tgc.a.b()).a("uxu", "a", 288, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s is not supported to scan", (Object) vgu.a(avch));
            return;
        }
        this.c.put(avch.k, vgt);
        try {
            jjg jjg = tgc.a;
            vgu.a(avch);
            vgt.a(uyy, auzb);
        } catch (vgs e2) {
            anih anih = (anih) tgc.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uxu", "a", 299, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Fail to start listening: %s", (Object) vgu.a(avch));
        }
    }

    public static boolean a(Context context, ased ased, avch avch) {
        auzb a2;
        boolean z;
        if (!(ased == null || (a2 = a(context, avch)) == null)) {
            vav vav = (vav) thl.a(context, vav.class);
            asgb asgb = asgb.OPERATION_STATUS_UNKNOWN;
            avch avch2 = avch.TOKEN_MEDIUM_UNKNOWN;
            int ordinal = avch.ordinal();
            if (ordinal == 1) {
                z = vav.g();
            } else if (ordinal == 2) {
                z = vav.j();
            } else if (ordinal == 3) {
                z = vav.k();
            } else if (ordinal == 8) {
                z = vav.i();
            }
            if (!z || !ased.a(a(avch, new vgo(new tgh(new byte[]{1, 2, 3}), a2)))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006d, code lost:
        if (r5.d != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r5, defpackage.ased r6, defpackage.avch r7, int r8) {
        /*
            auzb r0 = a((android.content.Context) r5, (defpackage.avch) r7)
            r1 = 0
            if (r0 == 0) goto L_0x00a1
            java.lang.Class<vav> r2 = defpackage.vav.class
            java.lang.Object r5 = defpackage.thl.a((android.content.Context) r5, (java.lang.Class) r2)
            vav r5 = (defpackage.vav) r5
            asgb r2 = defpackage.asgb.OPERATION_STATUS_UNKNOWN
            avch r2 = defpackage.avch.TOKEN_MEDIUM_UNKNOWN
            int r2 = r7.ordinal()
            r3 = 1
            if (r2 == r3) goto L_0x0090
            r4 = 2
            if (r2 == r4) goto L_0x0084
            r4 = 3
            if (r2 == r4) goto L_0x002b
            r8 = 8
            if (r2 == r8) goto L_0x0026
        L_0x0024:
            goto L_0x00a1
        L_0x0026:
            boolean r5 = r5.h()
            goto L_0x0094
        L_0x002b:
            auyt r7 = r5.f
            auyy r7 = r7.d
            if (r7 != 0) goto L_0x0033
            auyy r7 = defpackage.auyy.v
        L_0x0033:
            boolean r7 = r7.g
            if (r7 != 0) goto L_0x006f
            auyn r7 = r5.m()
            auyl r7 = r7.f
            if (r7 != 0) goto L_0x0041
            auyl r7 = defpackage.auyl.f
        L_0x0041:
            boolean r7 = r7.b
            if (r7 != 0) goto L_0x006f
            auyn r7 = r5.m()
            auyl r7 = r7.f
            if (r7 != 0) goto L_0x004f
            auyl r7 = defpackage.auyl.f
        L_0x004f:
            boolean r7 = r7.c
            if (r7 != 0) goto L_0x006f
            auyn r7 = r5.m()
            auyl r7 = r7.f
            if (r7 != 0) goto L_0x005d
            auyl r7 = defpackage.auyl.f
        L_0x005d:
            boolean r7 = r7.e
            if (r7 != 0) goto L_0x006f
            auyn r5 = r5.m()
            auyl r5 = r5.f
            if (r5 != 0) goto L_0x006b
            auyl r5 = defpackage.auyl.f
        L_0x006b:
            boolean r5 = r5.d
            if (r5 == 0) goto L_0x0083
        L_0x006f:
            int[] r5 = new int[r3]
            r5[r1] = r8
            asey[] r5 = a((int[]) r5)
            asgc r5 = a((defpackage.asey[]) r5)
            boolean r5 = r6.a((defpackage.asgc) r5)
            if (r5 == 0) goto L_0x0083
            return r3
        L_0x0083:
            return r1
        L_0x0084:
            auyt r5 = r5.f
            auyy r5 = r5.d
            if (r5 == 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            auyy r5 = defpackage.auyy.v
        L_0x008d:
            boolean r5 = r5.e
            goto L_0x0094
        L_0x0090:
            boolean r5 = r5.f()
        L_0x0094:
            if (r5 == 0) goto L_0x0024
            asgc r5 = a((defpackage.avch) r7, (defpackage.auzb) r0)
            boolean r5 = r6.a((defpackage.asgc) r5)
            if (r5 == 0) goto L_0x00a1
            return r3
        L_0x00a1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uxu.a(android.content.Context, ased, avch, int):boolean");
    }

    public static boolean a(Context context, vav vav, int i2) {
        asgb asgb = asgb.OPERATION_STATUS_UNKNOWN;
        avch avch = avch.TOKEN_MEDIUM_UNKNOWN;
        int i3 = i2 - 1;
        if (i3 == 1) {
            auyl auyl = vav.m().f;
            if (auyl == null) {
                auyl = auyl.f;
            }
            return auyl.b;
        } else if (i3 == 2) {
            auyl auyl2 = vav.m().f;
            if (auyl2 == null) {
                auyl2 = auyl.f;
            }
            return auyl2.c;
        } else if (i3 == 4) {
            auyl auyl3 = vav.m().f;
            if (auyl3 == null) {
                auyl3 = auyl.f;
            }
            return auyl3.e;
        } else if (i3 == 103) {
            auyl auyl4 = vav.m().f;
            if (auyl4 == null) {
                auyl4 = auyl.f;
            }
            return auyl4.d;
        } else if (i3 != 106) {
            return false;
        } else {
            return tga.a(context);
        }
    }

    public static asey[] a(int... iArr) {
        asey asey;
        int length = iArr.length;
        asey[] aseyArr = new asey[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            if (iArr[i2] != 1) {
                asey = asey.BLE_BACKGROUND_SCAN_STRATEGY_SCREEN_ON_EVENTS;
            } else {
                asey = asey.BLE_BACKGROUND_SCAN_STRATEGY_ALWAYS_ON;
            }
            aseyArr[i3] = asey;
            i2++;
            i3 = i4;
        }
        return aseyArr;
    }

    public final ased a() {
        return (ased) thl.b(this.d, ased.class);
    }

    public final asgs a(avch avch, vgr vgr, uxl uxl) {
        return new uxm(this, uxl, vgr, avch);
    }

    public final Set a(Set set) {
        HashSet hashSet;
        if (set != null) {
            hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                BleFilter bleFilter = (BleFilter) it.next();
                gtf gtf = new gtf();
                ParcelUuid parcelUuid = bleFilter.b;
                ParcelUuid parcelUuid2 = bleFilter.c;
                if (parcelUuid2 != null && parcelUuid == null) {
                    throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
                }
                gtf.a = parcelUuid;
                gtf.b = parcelUuid2;
                ParcelUuid parcelUuid3 = bleFilter.d;
                if (parcelUuid3 != null) {
                    gtf.a(parcelUuid3, bleFilter.e, bleFilter.f);
                }
                byte[] bArr = bleFilter.h;
                if (bArr != null || bleFilter.g > 0) {
                    int i2 = bleFilter.g;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    gtf.a(i2, bArr, bleFilter.i);
                }
                hashSet.add(gtf.a());
            }
        } else {
            hashSet = new HashSet();
        }
        HashSet hashSet2 = new HashSet();
        hashSet2.add(uyw.a);
        gtv gtv = new gtv();
        if (a(this.d, this.i, 2)) {
            gtv.c();
        }
        if (aync.e()) {
            if (a(this.d, this.i, 5)) {
                gtv.c = true;
            }
            if (a(this.d, this.i, 104)) {
                gtv.b = true;
            }
            if (a(this.d, this.i, 3)) {
                gtv.a = true;
            }
        } else if (a(this.d, this.i, 5) || a(this.d, this.i, 104) || a(this.d, this.i, 3)) {
            gtv.b();
        }
        hashSet2.addAll(gtv.a());
        if (a(this.d, this.i, 107)) {
            hashSet2.add(tga.b);
        }
        return iko.a(hashSet, hashSet2);
    }

    public final void a(avch avch) {
        this.e.b();
        vgq vgq = (vgq) this.b.get(avch.k);
        if (vgq != null) {
            vgq.b();
            this.b.remove(avch.k);
            jjg jjg = tgc.a;
            vgu.a(avch);
            vgu.a((Iterable) a(this.b));
            return;
        }
        jjg jjg2 = tgc.a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: uzo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: uzo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: uxq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: uzo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: uzo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.avch r11, defpackage.uyy r12, defpackage.auzb r13, java.util.Set r14) {
        /*
            r10 = this;
            arwg r0 = r10.e
            r0.b()
            android.util.SparseArray r0 = r10.c
            int r1 = r11.k
            java.lang.Object r0 = r0.get(r1)
            vgt r0 = (defpackage.vgt) r0
            if (r0 == 0) goto L_0x0014
            jjg r11 = defpackage.tgc.a
            return
        L_0x0014:
            ased r3 = r10.a()
            java.lang.String r6 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r7 = "a"
            java.lang.String r8 = "uxu"
            if (r3 != 0) goto L_0x0036
            jjg r11 = defpackage.tgc.a
            anie r11 = r11.b()
            anih r11 = (defpackage.anih) r11
            r12 = 249(0xf9, float:3.49E-43)
            anie r11 = r11.a((java.lang.String) r8, (java.lang.String) r7, (int) r12, (java.lang.String) r6)
            anih r11 = (defpackage.anih) r11
            java.lang.String r12 = "Unable to start listening without live NearbyDirect"
            r11.a((java.lang.String) r12)
            return
        L_0x0036:
            asgb r0 = defpackage.asgb.OPERATION_STATUS_UNKNOWN
            avch r0 = defpackage.avch.TOKEN_MEDIUM_UNKNOWN
            int r0 = r11.ordinal()
            r1 = 1
            if (r0 == r1) goto L_0x0079
            r1 = 2
            if (r0 == r1) goto L_0x006c
            r1 = 3
            if (r0 == r1) goto L_0x006c
            r14 = 8
            if (r0 == r14) goto L_0x0067
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r11 = defpackage.vgu.a((defpackage.avch) r11)
            java.lang.String r13 = "Unknown Medium requested: "
            int r14 = r11.length()
            if (r14 != 0) goto L_0x005f
            java.lang.String r11 = new java.lang.String
            r11.<init>(r13)
            goto L_0x0063
        L_0x005f:
            java.lang.String r11 = r13.concat(r11)
        L_0x0063:
            r12.<init>(r11)
            throw r12
        L_0x0067:
            uzb r14 = r10.f
            uzo r14 = r14.b
            goto L_0x007d
        L_0x006c:
            android.content.Context r2 = r10.d
            uxq r9 = new uxq
            r0 = r9
            r1 = r10
            r4 = r11
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r14 = r9
            goto L_0x007d
        L_0x0079:
            uzb r14 = r10.f
            uzo r14 = r14.d
        L_0x007d:
            boolean r0 = r14.a()
            if (r0 == 0) goto L_0x00d6
            arwg r0 = r10.e
            r0.b()
            boolean r0 = r14.a()
            if (r0 != 0) goto L_0x00a8
            jjg r12 = defpackage.tgc.a
            anie r12 = r12.b()
            anih r12 = (defpackage.anih) r12
            r13 = 288(0x120, float:4.04E-43)
            anie r12 = r12.a((java.lang.String) r8, (java.lang.String) r7, (int) r13, (java.lang.String) r6)
            anih r12 = (defpackage.anih) r12
            java.lang.String r11 = defpackage.vgu.a((defpackage.avch) r11)
            java.lang.String r13 = "%s is not supported to scan"
            r12.a((java.lang.String) r13, (java.lang.Object) r11)
            return
        L_0x00a8:
            android.util.SparseArray r0 = r10.c
            int r1 = r11.k
            r0.put(r1, r14)
            jjg r0 = defpackage.tgc.a     // Catch:{ vgs -> 0x00b8 }
            defpackage.vgu.a((defpackage.avch) r11)     // Catch:{ vgs -> 0x00b8 }
            r14.a(r12, r13)     // Catch:{ vgs -> 0x00b8 }
            return
        L_0x00b8:
            r12 = move-exception
            jjg r13 = defpackage.tgc.a
            anie r13 = r13.b()
            anih r13 = (defpackage.anih) r13
            r13.a((java.lang.Throwable) r12)
            r12 = 299(0x12b, float:4.19E-43)
            anie r12 = r13.a((java.lang.String) r8, (java.lang.String) r7, (int) r12, (java.lang.String) r6)
            anih r12 = (defpackage.anih) r12
            java.lang.String r11 = defpackage.vgu.a((defpackage.avch) r11)
            java.lang.String r13 = "Fail to start listening: %s"
            r12.a((java.lang.String) r13, (java.lang.Object) r11)
            return
        L_0x00d6:
            jjg r12 = defpackage.tgc.a
            defpackage.vgu.a((defpackage.avch) r11)
            r14.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uxu.a(avch, uyy, auzb, java.util.Set):void");
    }

    public final void a(avch avch, vgo vgo, Runnable runnable) {
        vgq vgq;
        this.e.b();
        vgq vgq2 = (vgq) this.b.get(avch.k);
        if (vgq2 != null) {
            if (vgq2.a(vgo)) {
                jjg jjg = tgc.a;
                vgo.a();
                vgu.a(avch);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            a(avch);
        }
        ased a2 = a();
        if (a2 == null) {
            ((anih) ((anih) tgc.a.b()).a("uxu", "a", 155, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to start advertising without live NearbyDirect");
            return;
        }
        asgb asgb = asgb.OPERATION_STATUS_UNKNOWN;
        avch avch2 = avch.TOKEN_MEDIUM_UNKNOWN;
        int ordinal = avch.ordinal();
        if (ordinal == 1) {
            vgq = this.f.c;
        } else if (ordinal == 2 || ordinal == 3) {
            vgq = new uxp(this, this.d, a2, avch, runnable);
        } else if (ordinal != 8) {
            String a3 = vgu.a(avch);
            throw new IllegalStateException(a3.length() == 0 ? new String("Unknown Medium requested: ") : "Unknown Medium requested: ".concat(a3));
        } else {
            vgq = this.f.a;
        }
        if (vgq.a()) {
            this.e.b();
            if (!vgq.a()) {
                ((anih) ((anih) tgc.a.b()).a("uxu", "a", 201, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s is not supported to advertise", (Object) vgu.a(avch));
            } else {
                this.b.put(avch.k, vgq);
                try {
                    jjg jjg2 = tgc.a;
                    vgo.a.a();
                    vgu.a(avch);
                    vgq.b(vgo);
                } catch (vgp e2) {
                    anih anih = (anih) tgc.a.b();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("uxu", "a", 213, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Fail to start advertising: %s", (Object) vgu.a(avch));
                }
            }
            if ((avch == avch.AUDIO_ULTRASOUND_PASSBAND || avch == avch.AUDIO_AUDIBLE_DTMF) && runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        jjg jjg3 = tgc.a;
        String a4 = vgu.a(avch);
        String valueOf = String.valueOf(vgq);
        String valueOf2 = String.valueOf(Boolean.valueOf(vgq.a()));
        StringBuilder sb = new StringBuilder(a4.length() + 29 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(a4);
        sb.append(" advertiser: ");
        sb.append(valueOf);
        sb.append(" can advertise: ");
        sb.append(valueOf2);
        sb.toString();
    }

    public final void a(vgr vgr, int[] iArr, Set set) {
        this.e.b();
        ased a2 = a();
        if (a2 == null) {
            ((anih) ((anih) tgc.a.b()).a("uxu", "a", 385, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to start background listening without NearbyDirect");
            return;
        }
        Set a3 = a(set);
        String str = this.h;
        if (str != null) {
            jjg jjg = tgc.a;
        } else {
            str = null;
        }
        asey[] a4 = a(iArr);
        jjg jjg2 = tgc.a;
        this.h = a2.a(a(a4), a(avch.BLE_ADVERTISING_PACKET, vgr, new uxl(this)), vgy.a(this.d), a3).b;
        if (str != null) {
            a2.a(str);
        }
    }
}
