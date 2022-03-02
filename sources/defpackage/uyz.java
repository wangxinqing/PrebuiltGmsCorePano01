package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: uyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyz extends arwa {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public final vav d;
    public final arwg e;
    private final Set g = new HashSet();

    public uyz(Context context) {
        super(context);
        this.d = (vav) thl.a(context, vav.class);
        this.e = (arwg) thl.a(context, arwg.class);
    }

    private final auxg a(ClientAppIdentifier clientAppIdentifier) {
        aucd o = auxg.e.o();
        String str = clientAppIdentifier.c.b;
        if (str != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            auxg auxg = (auxg) o.b;
            str.getClass();
            auxg.a |= 1;
            auxg.b = str;
        }
        if (clientAppIdentifier.b()) {
            return (auxg) o.i();
        }
        try {
            PackageInfo packageInfo = this.f.getPackageManager().getPackageInfo(clientAppIdentifier.c.b, 64);
            long j = (long) packageInfo.versionCode;
            if (o.c) {
                o.c();
                o.c = false;
            }
            auxg auxg2 = (auxg) o.b;
            auxg2.a |= 4;
            auxg2.d = j;
            if (packageInfo.versionName != null) {
                String str2 = packageInfo.versionName;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                auxg auxg3 = (auxg) o.b;
                str2.getClass();
                auxg3.a |= 2;
                auxg3.c = str2;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            ((anih) ((anih) tgc.a.b()).a("uyz", "a", 583, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s Failed to find package for %s", (Object) "CopresenceLogger: ", (Object) clientAppIdentifier.c.b);
        }
        return (auxg) o.i();
    }

    private final int c(audx audx) {
        for (int i = 0; i < this.a.size(); i++) {
            if (((audx) this.a.get(i)).equals(audx)) {
                return i;
            }
        }
        return -1;
    }

    public final auvz b(ClientAppIdentifier clientAppIdentifier, audx audx, int i) {
        return a(clientAppIdentifier, audx, (audx) null, i, (Set) null);
    }

    public final void b(audx audx) {
        int c2 = c(audx);
        if (c2 >= 0) {
            a(c2);
        }
    }

    private static auxm a(auzr auzr) {
        if (auzr == null) {
            return null;
        }
        aucd o = auxm.d.o();
        auzu auzu = auzr.b;
        if (auzu == null) {
            auzu = auzu.d;
        }
        auxo a2 = a(auzu);
        if (o.c) {
            o.c();
            o.c = false;
        }
        auxm auxm = (auxm) o.b;
        a2.getClass();
        auxm.b = a2;
        auxm.a |= 1;
        return (auxm) o.i();
    }

    private static auxo a(auzu auzu) {
        if (auzu == null) {
            return null;
        }
        aucd o = auxo.d.o();
        String str = auzu.c;
        if (o.c) {
            o.c();
            o.c = false;
        }
        auxo auxo = (auxo) o.b;
        str.getClass();
        auxo.a |= 2;
        auxo.c = str;
        return (auxo) o.i();
    }

    private static final auxq a(avcw avcw) {
        Long l;
        aucd o = auxq.e.o();
        if ((avcw.a & 2) != 0) {
            avcq avcq = avcw.c;
            if (avcq == null) {
                avcq = avcq.c;
            }
            aucd o2 = auxi.c.o();
            aucx aucx = avcq.b;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            auxi auxi = (auxi) o2.b;
            if (!auxi.b.a()) {
                auxi.b = aucj.a(auxi.b);
            }
            auab.a((Iterable) aucx, (List) auxi.b);
            int size = avcq.a.size();
            for (int i = 0; i < size; i++) {
                aucd o3 = auxp.f.o();
                auzx auzx = (auzx) avcq.a.get(i);
                String str = auzx.b;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                auxp auxp = (auxp) o3.b;
                str.getClass();
                auxp.a |= 1;
                auxp.b = str;
                if ((auzx.a & 8) != 0) {
                    aucd o4 = auyb.e.o();
                    avaj avaj = auzx.e;
                    if (avaj == null) {
                        avaj = avaj.e;
                    }
                    int a2 = avas.a(avaj.b);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    auyb auyb = (auyb) o4.b;
                    auyb.b = a2 - 1;
                    auyb.a |= 1;
                    avaj avaj2 = auzx.e;
                    if (avaj2 == null) {
                        avaj2 = avaj.e;
                    }
                    int a3 = avba.a(avaj2.c);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    auyb auyb2 = (auyb) o4.b;
                    auyb2.c = a3 - 1;
                    int i2 = auyb2.a | 2;
                    auyb2.a = i2;
                    avaj avaj3 = auzx.e;
                    auyb2.d = 0;
                    auyb2.a = i2 | 4;
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    auxp auxp2 = (auxp) o3.b;
                    auyb auyb3 = (auyb) o4.i();
                    auyb3.getClass();
                    auxp2.e = auyb3;
                    auxp2.a |= 8;
                }
                if ((auzx.a & 2) != 0) {
                    aucd o5 = auxe.d.o();
                    auzc auzc = auzx.c;
                    if (auzc == null) {
                        auzc = auzc.e;
                    }
                    long j = auzc.b;
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    auxe auxe = (auxe) o5.b;
                    auxe.a |= 1;
                    auxe.b = j;
                    auzc auzc2 = auzx.c;
                    if (auzc2 == null) {
                        auzc2 = auzc.e;
                    }
                    if ((auzc2.a & 2) != 0) {
                        aucd o6 = auxf.c.o();
                        auzc auzc3 = auzx.c;
                        if (auzc3 == null) {
                            auzc3 = auzc.e;
                        }
                        auzd auzd = auzc3.c;
                        if (auzd == null) {
                            auzd = auzd.c;
                        }
                        int a4 = avaq.a(auzd.b);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        if (o6.c) {
                            o6.c();
                            o6.c = false;
                        }
                        auxf auxf = (auxf) o6.b;
                        auxf.b = a4 - 1;
                        auxf.a |= 1;
                        auxf auxf2 = (auxf) o6.i();
                        if (o5.c) {
                            o5.c();
                            o5.c = false;
                        }
                        auxe auxe2 = (auxe) o5.b;
                        auxf2.getClass();
                        auxe2.c = auxf2;
                        auxe2.a |= 2;
                    }
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    auxp auxp3 = (auxp) o3.b;
                    auxe auxe3 = (auxe) o5.i();
                    auxe3.getClass();
                    auxp3.c = auxe3;
                    auxp3.a |= 2;
                }
                auzr auzr = auzx.d;
                if (auzr == null) {
                    auzr = auzr.e;
                }
                auxm a5 = a(auzr);
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                auxp auxp4 = (auxp) o3.b;
                a5.getClass();
                auxp4.d = a5;
                auxp4.a |= 4;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                auxi auxi2 = (auxi) o2.b;
                auxp auxp5 = (auxp) o3.i();
                auxp5.getClass();
                if (!auxi2.a.a()) {
                    auxi2.a = aucj.a(auxi2.a);
                }
                auxi2.a.add(auxp5);
            }
            auxi auxi3 = (auxi) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auxq auxq = (auxq) o.b;
            auxi3.getClass();
            auxq.b = auxi3;
            auxq.a |= 1;
        }
        if ((avcw.a & 4) != 0) {
            avcs avcs = avcw.d;
            if (avcs == null) {
                avcs = avcs.c;
            }
            aucd o7 = auxk.c.o();
            aucx aucx2 = avcs.b;
            if (o7.c) {
                o7.c();
                o7.c = false;
            }
            auxk auxk = (auxk) o7.b;
            if (!auxk.b.a()) {
                auxk.b = aucj.a(auxk.b);
            }
            auab.a((Iterable) aucx2, (List) auxk.b);
            int size2 = avcs.a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                aucd o8 = auxy.f.o();
                avaf avaf = (avaf) avcs.a.get(i3);
                String str2 = avaf.b;
                if (o8.c) {
                    o8.c();
                    o8.c = false;
                }
                auxy auxy = (auxy) o8.b;
                str2.getClass();
                auxy.a |= 1;
                auxy.b = str2;
                if ((avaf.a & 16) != 0) {
                    aucd o9 = auyb.e.o();
                    avaj avaj4 = avaf.e;
                    if (avaj4 == null) {
                        avaj4 = avaj.e;
                    }
                    int a6 = avas.a(avaj4.b);
                    if (a6 == 0) {
                        a6 = 1;
                    }
                    if (o9.c) {
                        o9.c();
                        o9.c = false;
                    }
                    auyb auyb4 = (auyb) o9.b;
                    auyb4.b = a6 - 1;
                    auyb4.a |= 1;
                    avaj avaj5 = avaf.e;
                    if (avaj5 == null) {
                        avaj5 = avaj.e;
                    }
                    int a7 = avba.a(avaj5.c);
                    if (a7 == 0) {
                        a7 = 1;
                    }
                    if (o9.c) {
                        o9.c();
                        o9.c = false;
                    }
                    auyb auyb5 = (auyb) o9.b;
                    auyb5.c = a7 - 1;
                    auyb5.a |= 2;
                    if (o8.c) {
                        o8.c();
                        o8.c = false;
                    }
                    auxy auxy2 = (auxy) o8.b;
                    auyb auyb6 = (auyb) o9.i();
                    auyb6.getClass();
                    auxy2.e = auyb6;
                    auxy2.a |= 8;
                }
                if ((avaf.a & 2) != 0) {
                    l = Long.valueOf(avaf.c);
                } else {
                    l = null;
                }
                if (l != null) {
                    long longValue = l.longValue();
                    if (o8.c) {
                        o8.c();
                        o8.c = false;
                    }
                    auxy auxy3 = (auxy) o8.b;
                    auxy3.a |= 2;
                    auxy3.c = longValue;
                }
                auzu auzu = avaf.d;
                if (auzu == null) {
                    auzu = auzu.d;
                }
                auxo a8 = a(auzu);
                if (o8.c) {
                    o8.c();
                    o8.c = false;
                }
                auxy auxy4 = (auxy) o8.b;
                a8.getClass();
                auxy4.d = a8;
                auxy4.a |= 4;
                if (o7.c) {
                    o7.c();
                    o7.c = false;
                }
                auxk auxk2 = (auxk) o7.b;
                auxy auxy5 = (auxy) o8.i();
                auxy5.getClass();
                if (!auxk2.a.a()) {
                    auxk2.a = aucj.a(auxk2.a);
                }
                auxk2.a.add(auxy5);
            }
            auxk auxk3 = (auxk) o7.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auxq auxq2 = (auxq) o.b;
            auxk3.getClass();
            auxq2.c = auxk3;
            auxq2.a |= 2;
        }
        if ((avcw.a & 8) != 0) {
            avda avda = avcw.e;
            if (avda == null) {
                avda = avda.h;
            }
            aucd o10 = auye.b.o();
            for (int i4 = 0; i4 < avda.b.size(); i4++) {
                aucd o11 = auyc.b.o();
                aval aval = (aval) avda.b.get(i4);
                int size3 = aval.c.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    avam avam = (avam) aval.c.get(i5);
                    aucd o12 = auyd.d.o();
                    avch a9 = avch.a(avam.b);
                    if (a9 == null) {
                        a9 = avch.TOKEN_MEDIUM_UNKNOWN;
                    }
                    if (o12.c) {
                        o12.c();
                        o12.c = false;
                    }
                    auyd auyd = (auyd) o12.b;
                    auyd.b = a9.k;
                    int i6 = auyd.a | 1;
                    auyd.a = i6;
                    if ((avam.a & 2) != 0) {
                        int i7 = avam.c;
                        auyd.a = i6 | 2;
                        auyd.c = i7;
                    }
                    if (o11.c) {
                        o11.c();
                        o11.c = false;
                    }
                    auyc auyc = (auyc) o11.b;
                    auyd auyd2 = (auyd) o12.i();
                    auyd2.getClass();
                    if (!auyc.a.a()) {
                        auyc.a = aucj.a(auyc.a);
                    }
                    auyc.a.add(auyd2);
                }
                if (o10.c) {
                    o10.c();
                    o10.c = false;
                }
                auye auye = (auye) o10.b;
                auyc auyc2 = (auyc) o11.i();
                auyc2.getClass();
                if (!auye.a.a()) {
                    auye.a = aucj.a(auye.a);
                }
                auye.a.add(auyc2);
            }
            auye auye2 = (auye) o10.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auxq auxq3 = (auxq) o.b;
            auye2.getClass();
            auxq3.d = auye2;
            auxq3.a |= 4;
        }
        return (auxq) o.i();
    }

    public final long a(audx audx) {
        int c2 = c(audx);
        if (c2 >= 0) {
            return SystemClock.elapsedRealtime() - ((Long) this.c.get(c2)).longValue();
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r3v27, types: [aucj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.auvz a(com.google.android.gms.nearby.messages.ClientAppIdentifier r17, defpackage.audx r18, defpackage.audx r19, int r20, java.util.Set r21) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r21
            arwg r0 = r1.e
            r0.b()
            boolean r0 = r3 instanceof defpackage.avcw
            r5 = 0
            if (r0 == 0) goto L_0x0734
            auxc r0 = defpackage.auxc.h
            aucd r6 = r0.o()
            boolean r0 = r6.c
            r7 = 0
            if (r0 == 0) goto L_0x0022
            r6.c()
            r6.c = r7
        L_0x0022:
            aucj r0 = r6.b
            auxc r0 = (defpackage.auxc) r0
            r8 = 1
            r0.b = r8
            int r9 = r0.a
            r9 = r9 | r8
            r0.a = r9
            auxs r0 = defpackage.auxs.d
            aucd r9 = r0.o()
            arwg r0 = r1.e
            r0.b()
            arwg r0 = r1.e
            r0.b()
            auxt r0 = defpackage.auxt.g
            aucd r10 = r0.o()
            arwg r0 = r1.e
            r0.b()
            android.content.Context r0 = r1.f
            java.lang.Class<uwu> r11 = defpackage.uwu.class
            java.lang.Object r0 = defpackage.thl.a((android.content.Context) r0, (java.lang.Class) r11)
            uwu r0 = (defpackage.uwu) r0
            uwv r0 = r0.b
            java.lang.String r0 = r0.a()
            if (r0 == 0) goto L_0x0074
            boolean r11 = r10.c
            if (r11 != 0) goto L_0x0060
            goto L_0x0065
        L_0x0060:
            r10.c()
            r10.c = r7
        L_0x0065:
            aucj r11 = r10.b
            auxt r11 = (defpackage.auxt) r11
            r0.getClass()
            int r12 = r11.a
            r12 = r12 | 8
            r11.a = r12
            r11.d = r0
        L_0x0074:
            if (r0 == 0) goto L_0x009c
            int r11 = r0.length()
            r12 = 3
            int r11 = java.lang.Math.min(r11, r12)
            java.lang.String r0 = r0.substring(r7, r11)
            boolean r11 = r10.c
            if (r11 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            r10.c()
            r10.c = r7
        L_0x008d:
            aucj r11 = r10.b
            auxt r11 = (defpackage.auxt) r11
            r0.getClass()
            int r12 = r11.a
            r12 = r12 | 16
            r11.a = r12
            r11.e = r0
        L_0x009c:
            auxg r0 = defpackage.auxg.e
            aucd r0 = r0.o()
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x00a7
            goto L_0x00ac
        L_0x00a7:
            r0.c()
            r0.c = r7
        L_0x00ac:
            aucj r11 = r0.b
            auxg r11 = (defpackage.auxg) r11
            java.lang.String r12 = "com.google.android.gms"
            r12.getClass()
            int r13 = r11.a
            r13 = r13 | r8
            r11.a = r13
            r11.b = r12
            int r11 = defpackage.jlo.b()
            long r11 = (long) r11
            boolean r13 = r0.c
            if (r13 != 0) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            r0.c()
            r0.c = r7
        L_0x00cb:
            aucj r13 = r0.b
            auxg r13 = (defpackage.auxg) r13
            int r14 = r13.a
            r14 = r14 | 4
            r13.a = r14
            r13.d = r11
            java.lang.String r11 = defpackage.jlo.a()
            boolean r12 = r0.c
            if (r12 != 0) goto L_0x00e0
            goto L_0x00e5
        L_0x00e0:
            r0.c()
            r0.c = r7
        L_0x00e5:
            aucj r12 = r0.b
            auxg r12 = (defpackage.auxg) r12
            r11.getClass()
            int r13 = r12.a
            r13 = r13 | 2
            r12.a = r13
            r12.c = r11
            boolean r11 = r10.c
            if (r11 != 0) goto L_0x00f9
            goto L_0x00fe
        L_0x00f9:
            r10.c()
            r10.c = r7
        L_0x00fe:
            aucj r11 = r10.b
            auxt r11 = (defpackage.auxt) r11
            aucj r0 = r0.i()
            auxg r0 = (defpackage.auxg) r0
            r0.getClass()
            r11.c = r0
            int r0 = r11.a
            r0 = r0 | 2
            r11.a = r0
            auxg r0 = defpackage.auxg.e
            aucd r11 = r0.o()
            com.google.android.gms.nearby.messages.internal.ClientAppContext r0 = r2.c
            java.lang.String r0 = r0.b
            if (r0 == 0) goto L_0x0137
            boolean r12 = r11.c
            if (r12 != 0) goto L_0x0124
            goto L_0x0129
        L_0x0124:
            r11.c()
            r11.c = r7
        L_0x0129:
            aucj r12 = r11.b
            auxg r12 = (defpackage.auxg) r12
            r0.getClass()
            int r13 = r12.a
            r13 = r13 | r8
            r12.a = r13
            r12.b = r0
        L_0x0137:
            boolean r0 = r17.b()
            if (r0 == 0) goto L_0x0145
            aucj r0 = r11.i()
            auxg r0 = (defpackage.auxg) r0
            goto L_0x01b7
        L_0x0145:
            android.content.Context r0 = r1.f     // Catch:{ NameNotFoundException -> 0x018f }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x018f }
            com.google.android.gms.nearby.messages.internal.ClientAppContext r12 = r2.c     // Catch:{ NameNotFoundException -> 0x018f }
            java.lang.String r12 = r12.b     // Catch:{ NameNotFoundException -> 0x018f }
            r13 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r12, r13)     // Catch:{ NameNotFoundException -> 0x018f }
            int r12 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x018f }
            long r12 = (long) r12     // Catch:{ NameNotFoundException -> 0x018f }
            boolean r14 = r11.c     // Catch:{ NameNotFoundException -> 0x018f }
            if (r14 != 0) goto L_0x015d
            goto L_0x0162
        L_0x015d:
            r11.c()     // Catch:{ NameNotFoundException -> 0x018f }
            r11.c = r7     // Catch:{ NameNotFoundException -> 0x018f }
        L_0x0162:
            aucj r14 = r11.b     // Catch:{ NameNotFoundException -> 0x018f }
            auxg r14 = (defpackage.auxg) r14     // Catch:{ NameNotFoundException -> 0x018f }
            int r15 = r14.a     // Catch:{ NameNotFoundException -> 0x018f }
            r15 = r15 | 4
            r14.a = r15     // Catch:{ NameNotFoundException -> 0x018f }
            r14.d = r12     // Catch:{ NameNotFoundException -> 0x018f }
            java.lang.String r12 = r0.versionName     // Catch:{ NameNotFoundException -> 0x018f }
            if (r12 != 0) goto L_0x0173
            goto L_0x01b1
        L_0x0173:
            java.lang.String r0 = r0.versionName     // Catch:{ NameNotFoundException -> 0x018f }
            boolean r12 = r11.c     // Catch:{ NameNotFoundException -> 0x018f }
            if (r12 != 0) goto L_0x017a
            goto L_0x017f
        L_0x017a:
            r11.c()     // Catch:{ NameNotFoundException -> 0x018f }
            r11.c = r7     // Catch:{ NameNotFoundException -> 0x018f }
        L_0x017f:
            aucj r12 = r11.b     // Catch:{ NameNotFoundException -> 0x018f }
            auxg r12 = (defpackage.auxg) r12     // Catch:{ NameNotFoundException -> 0x018f }
            r0.getClass()     // Catch:{ NameNotFoundException -> 0x018f }
            int r13 = r12.a     // Catch:{ NameNotFoundException -> 0x018f }
            r13 = r13 | 2
            r12.a = r13     // Catch:{ NameNotFoundException -> 0x018f }
            r12.c = r0     // Catch:{ NameNotFoundException -> 0x018f }
            goto L_0x01b1
        L_0x018f:
            r0 = move-exception
            jjg r0 = defpackage.tgc.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r12 = 583(0x247, float:8.17E-43)
            java.lang.String r13 = "uyz"
            java.lang.String r14 = "a"
            java.lang.String r15 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r0 = r0.a((java.lang.String) r13, (java.lang.String) r14, (int) r12, (java.lang.String) r15)
            anih r0 = (defpackage.anih) r0
            com.google.android.gms.nearby.messages.internal.ClientAppContext r2 = r2.c
            java.lang.String r2 = r2.b
            java.lang.String r12 = "%s Failed to find package for %s"
            java.lang.String r13 = "CopresenceLogger: "
            r0.a((java.lang.String) r12, (java.lang.Object) r13, (java.lang.Object) r2)
        L_0x01b1:
            aucj r0 = r11.i()
            auxg r0 = (defpackage.auxg) r0
        L_0x01b7:
            boolean r2 = r10.c
            if (r2 != 0) goto L_0x01bc
            goto L_0x01c1
        L_0x01bc:
            r10.c()
            r10.c = r7
        L_0x01c1:
            aucj r2 = r10.b
            auxt r2 = (defpackage.auxt) r2
            r0.getClass()
            r2.b = r0
            int r0 = r2.a
            r0 = r0 | r8
            r2.a = r0
            auxh r0 = defpackage.auxh.f
            aucd r0 = r0.o()
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x01da
            goto L_0x01df
        L_0x01da:
            r0.c()
            r0.c = r7
        L_0x01df:
            aucj r2 = r0.b
            auxh r2 = (defpackage.auxh) r2
            r11 = 6
            r2.d = r11
            int r11 = r2.a
            r11 = r11 | 4
            r2.a = r11
            java.lang.String r2 = android.os.Build.MANUFACTURER
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x01f3
            goto L_0x01f8
        L_0x01f3:
            r0.c()
            r0.c = r7
        L_0x01f8:
            aucj r11 = r0.b
            auxh r11 = (defpackage.auxh) r11
            r2.getClass()
            int r12 = r11.a
            r12 = r12 | r8
            r11.a = r12
            r11.b = r2
            java.lang.String r2 = android.os.Build.MODEL
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x020d
            goto L_0x0212
        L_0x020d:
            r0.c()
            r0.c = r7
        L_0x0212:
            aucj r11 = r0.b
            auxh r11 = (defpackage.auxh) r11
            r2.getClass()
            int r12 = r11.a
            r12 = r12 | 2
            r11.a = r12
            r11.c = r2
            java.lang.String r2 = android.os.Build.VERSION.RELEASE
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x0228
            goto L_0x022d
        L_0x0228:
            r0.c()
            r0.c = r7
        L_0x022d:
            aucj r11 = r0.b
            auxh r11 = (defpackage.auxh) r11
            r2.getClass()
            int r12 = r11.a
            r12 = r12 | 8
            r11.a = r12
            r11.e = r2
            boolean r2 = r10.c
            if (r2 != 0) goto L_0x0241
            goto L_0x0246
        L_0x0241:
            r10.c()
            r10.c = r7
        L_0x0246:
            aucj r2 = r10.b
            auxt r2 = (defpackage.auxt) r2
            aucj r0 = r0.i()
            auxh r0 = (defpackage.auxh) r0
            r0.getClass()
            r2.f = r0
            int r0 = r2.a
            r0 = r0 | 32
            r2.a = r0
            aucj r0 = r10.i()
            auxt r0 = (defpackage.auxt) r0
            boolean r2 = r9.c
            if (r2 != 0) goto L_0x0266
            goto L_0x026b
        L_0x0266:
            r9.c()
            r9.c = r7
        L_0x026b:
            aucj r2 = r9.b
            auxs r2 = (defpackage.auxs) r2
            r0.getClass()
            r2.b = r0
            int r0 = r2.a
            r0 = r0 | r8
            r2.a = r0
            r0 = r3
            avcw r0 = (defpackage.avcw) r0
            auxq r0 = a((defpackage.avcw) r0)
            boolean r2 = r9.c
            if (r2 != 0) goto L_0x0285
            goto L_0x028a
        L_0x0285:
            r9.c()
            r9.c = r7
        L_0x028a:
            aucj r2 = r9.b
            auxs r2 = (defpackage.auxs) r2
            r0.getClass()
            r2.c = r0
            int r0 = r2.a
            r0 = r0 | 8
            r2.a = r0
            boolean r0 = r6.c
            if (r0 != 0) goto L_0x029e
            goto L_0x02a3
        L_0x029e:
            r6.c()
            r6.c = r7
        L_0x02a3:
            aucj r0 = r6.b
            auxc r0 = (defpackage.auxc) r0
            aucj r2 = r9.i()
            auxs r2 = (defpackage.auxs) r2
            r2.getClass()
            r0.e = r2
            int r2 = r0.a
            r2 = r2 | 8
            r0.a = r2
            long r2 = r1.a((defpackage.audx) r3)
            boolean r0 = r6.c
            if (r0 != 0) goto L_0x02c1
            goto L_0x02c6
        L_0x02c1:
            r6.c()
            r6.c = r7
        L_0x02c6:
            aucj r0 = r6.b
            auxc r0 = (defpackage.auxc) r0
            int r9 = r0.a
            r9 = r9 | 4
            r0.a = r9
            r0.d = r2
            r2 = r9 | 2
            r0.a = r2
            r2 = r20
            r0.c = r2
            if (r19 == 0) goto L_0x0693
            auxu r0 = defpackage.auxu.d
            aucd r0 = r0.o()
            r2 = r19
            avcx r2 = (defpackage.avcx) r2
            avcz r3 = r2.b
            if (r3 != 0) goto L_0x02ec
            avcz r3 = defpackage.avcz.d
        L_0x02ec:
            if (r3 == 0) goto L_0x034e
            auxv r5 = defpackage.auxv.c
            aucd r5 = r5.o()
            int r9 = r3.a
            r9 = r9 & 2
            if (r9 == 0) goto L_0x0346
            auxw r9 = defpackage.auxw.c
            aucd r9 = r9.o()
            avad r3 = r3.b
            if (r3 == 0) goto L_0x0305
            goto L_0x0307
        L_0x0305:
            avad r3 = defpackage.avad.b
        L_0x0307:
            int r3 = r3.a
            int r3 = defpackage.avcd.a(r3)
            if (r3 == 0) goto L_0x0310
            goto L_0x0311
        L_0x0310:
            r3 = 1
        L_0x0311:
            boolean r10 = r9.c
            if (r10 != 0) goto L_0x0316
            goto L_0x031b
        L_0x0316:
            r9.c()
            r9.c = r7
        L_0x031b:
            aucj r10 = r9.b
            auxw r10 = (defpackage.auxw) r10
            int r3 = r3 + -2
            r10.b = r3
            int r3 = r10.a
            r3 = r3 | r8
            r10.a = r3
            boolean r3 = r5.c
            if (r3 != 0) goto L_0x032d
            goto L_0x0332
        L_0x032d:
            r5.c()
            r5.c = r7
        L_0x0332:
            aucj r3 = r5.b
            auxv r3 = (defpackage.auxv) r3
            aucj r9 = r9.i()
            auxw r9 = (defpackage.auxw) r9
            r9.getClass()
            r3.b = r9
            int r9 = r3.a
            r9 = r9 | r8
            r3.a = r9
        L_0x0346:
            aucj r3 = r5.i()
            r5 = r3
            auxv r5 = (defpackage.auxv) r5
            goto L_0x034f
        L_0x034e:
        L_0x034f:
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0354
            goto L_0x0359
        L_0x0354:
            r0.c()
            r0.c = r7
        L_0x0359:
            aucj r3 = r0.b
            auxu r3 = (defpackage.auxu) r3
            r5.getClass()
            r3.b = r5
            int r5 = r3.a
            r5 = r5 | r8
            r3.a = r5
            auxr r3 = defpackage.auxr.e
            aucd r3 = r3.o()
            int r5 = r2.a
            r5 = r5 & 2
            if (r5 == 0) goto L_0x0420
            auxj r5 = defpackage.auxj.d
            aucd r5 = r5.o()
            avcr r9 = r2.c
            if (r9 == 0) goto L_0x037e
            goto L_0x0380
        L_0x037e:
            avcr r9 = defpackage.avcr.c
        L_0x0380:
            int r10 = r9.a
            atio r10 = defpackage.atio.a(r10)
            if (r10 == 0) goto L_0x0389
            goto L_0x038b
        L_0x0389:
            atio r10 = defpackage.atio.OK
        L_0x038b:
            int r10 = r10.s
            boolean r11 = r5.c
            if (r11 != 0) goto L_0x0392
            goto L_0x0397
        L_0x0392:
            r5.c()
            r5.c = r7
        L_0x0397:
            aucj r11 = r5.b
            auxj r11 = (defpackage.auxj) r11
            int r12 = r11.a
            r12 = r12 | r8
            r11.a = r12
            r11.b = r10
            aucx r10 = r9.b
            int r10 = r10.size()
            r11 = 0
        L_0x03a9:
            if (r11 >= r10) goto L_0x0402
            auxn r12 = defpackage.auxn.c
            aucd r12 = r12.o()
            aucx r13 = r9.b
            java.lang.Object r13 = r13.get(r11)
            auzt r13 = (defpackage.auzt) r13
            java.lang.String r13 = r13.a
            boolean r14 = r12.c
            if (r14 != 0) goto L_0x03c0
            goto L_0x03c5
        L_0x03c0:
            r12.c()
            r12.c = r7
        L_0x03c5:
            aucj r14 = r12.b
            auxn r14 = (defpackage.auxn) r14
            r13.getClass()
            int r15 = r14.a
            r15 = r15 | r8
            r14.a = r15
            r14.b = r13
            boolean r13 = r5.c
            if (r13 != 0) goto L_0x03d8
            goto L_0x03dd
        L_0x03d8:
            r5.c()
            r5.c = r7
        L_0x03dd:
            aucj r13 = r5.b
            auxj r13 = (defpackage.auxj) r13
            aucj r12 = r12.i()
            auxn r12 = (defpackage.auxn) r12
            r12.getClass()
            aucx r14 = r13.c
            boolean r14 = r14.a()
            if (r14 != 0) goto L_0x03fa
            aucx r14 = r13.c
            aucx r14 = defpackage.aucj.a((defpackage.aucx) r14)
            r13.c = r14
        L_0x03fa:
            aucx r13 = r13.c
            r13.add(r11, r12)
            int r11 = r11 + 1
            goto L_0x03a9
        L_0x0402:
            boolean r9 = r3.c
            if (r9 != 0) goto L_0x0407
            goto L_0x040c
        L_0x0407:
            r3.c()
            r3.c = r7
        L_0x040c:
            aucj r9 = r3.b
            auxr r9 = (defpackage.auxr) r9
            aucj r5 = r5.i()
            auxj r5 = (defpackage.auxj) r5
            r5.getClass()
            r9.b = r5
            int r5 = r9.a
            r5 = r5 | r8
            r9.a = r5
        L_0x0420:
            int r5 = r2.a
            r5 = r5 & 4
            if (r5 == 0) goto L_0x04d4
            avct r5 = r2.d
            if (r5 == 0) goto L_0x042b
            goto L_0x042d
        L_0x042b:
            avct r5 = defpackage.avct.c
        L_0x042d:
            auxl r9 = defpackage.auxl.d
            aucd r9 = r9.o()
            int r10 = r5.a
            atio r10 = defpackage.atio.a(r10)
            if (r10 == 0) goto L_0x043c
            goto L_0x043e
        L_0x043c:
            atio r10 = defpackage.atio.OK
        L_0x043e:
            int r10 = r10.s
            boolean r11 = r9.c
            if (r11 != 0) goto L_0x0445
            goto L_0x044a
        L_0x0445:
            r9.c()
            r9.c = r7
        L_0x044a:
            aucj r11 = r9.b
            auxl r11 = (defpackage.auxl) r11
            int r12 = r11.a
            r12 = r12 | r8
            r11.a = r12
            r11.b = r10
            aucx r10 = r5.b
            int r10 = r10.size()
            r11 = 0
        L_0x045c:
            if (r11 >= r10) goto L_0x04b5
            auxz r12 = defpackage.auxz.c
            aucd r12 = r12.o()
            aucx r13 = r5.b
            java.lang.Object r13 = r13.get(r11)
            avag r13 = (defpackage.avag) r13
            java.lang.String r13 = r13.a
            boolean r14 = r12.c
            if (r14 != 0) goto L_0x0473
            goto L_0x0478
        L_0x0473:
            r12.c()
            r12.c = r7
        L_0x0478:
            aucj r14 = r12.b
            auxz r14 = (defpackage.auxz) r14
            r13.getClass()
            int r15 = r14.a
            r15 = r15 | r8
            r14.a = r15
            r14.b = r13
            boolean r13 = r9.c
            if (r13 != 0) goto L_0x048b
            goto L_0x0490
        L_0x048b:
            r9.c()
            r9.c = r7
        L_0x0490:
            aucj r13 = r9.b
            auxl r13 = (defpackage.auxl) r13
            aucj r12 = r12.i()
            auxz r12 = (defpackage.auxz) r12
            r12.getClass()
            aucx r14 = r13.c
            boolean r14 = r14.a()
            if (r14 != 0) goto L_0x04ad
            aucx r14 = r13.c
            aucx r14 = defpackage.aucj.a((defpackage.aucx) r14)
            r13.c = r14
        L_0x04ad:
            aucx r13 = r13.c
            r13.add(r12)
            int r11 = r11 + 1
            goto L_0x045c
        L_0x04b5:
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x04ba
            goto L_0x04bf
        L_0x04ba:
            r3.c()
            r3.c = r7
        L_0x04bf:
            aucj r5 = r3.b
            auxr r5 = (defpackage.auxr) r5
            aucj r9 = r9.i()
            auxl r9 = (defpackage.auxl) r9
            r9.getClass()
            r5.c = r9
            int r9 = r5.a
            r9 = r9 | 2
            r5.a = r9
        L_0x04d4:
            int r5 = r2.a
            r5 = r5 & 8
            if (r5 != 0) goto L_0x04dc
            goto L_0x0654
        L_0x04dc:
            avdb r2 = r2.e
            if (r2 == 0) goto L_0x04e1
            goto L_0x04e3
        L_0x04e1:
            avdb r2 = defpackage.avdb.f
        L_0x04e3:
            auyf r5 = defpackage.auyf.e
            aucd r5 = r5.o()
            int r9 = r2.a
            atio r9 = defpackage.atio.a(r9)
            if (r9 == 0) goto L_0x04f2
            goto L_0x04f4
        L_0x04f2:
            atio r9 = defpackage.atio.OK
        L_0x04f4:
            int r9 = r9.s
            boolean r10 = r5.c
            if (r10 != 0) goto L_0x04fb
            goto L_0x0500
        L_0x04fb:
            r5.c()
            r5.c = r7
        L_0x0500:
            aucj r10 = r5.b
            auyf r10 = (defpackage.auyf) r10
            int r11 = r10.a
            r11 = r11 | r8
            r10.a = r11
            r10.b = r9
            aucx r9 = r2.b
            int r9 = r9.size()
            r10 = 0
        L_0x0512:
            if (r10 >= r9) goto L_0x058d
            aucx r11 = r2.b
            java.lang.Object r11 = r11.get(r10)
            avai r11 = (defpackage.avai) r11
            auya r12 = defpackage.auya.d
            aucd r12 = r12.o()
            java.lang.String r13 = r11.a
            boolean r14 = r12.c
            if (r14 != 0) goto L_0x0529
            goto L_0x052e
        L_0x0529:
            r12.c()
            r12.c = r7
        L_0x052e:
            aucj r14 = r12.b
            auya r14 = (defpackage.auya) r14
            r13.getClass()
            int r15 = r14.a
            r15 = r15 | r8
            r14.a = r15
            r14.b = r13
            int r11 = r11.b
            int r11 = defpackage.avcj.a(r11)
            if (r11 == 0) goto L_0x0545
            goto L_0x0546
        L_0x0545:
            r11 = 1
        L_0x0546:
            boolean r13 = r12.c
            if (r13 != 0) goto L_0x054b
            goto L_0x0550
        L_0x054b:
            r12.c()
            r12.c = r7
        L_0x0550:
            aucj r13 = r12.b
            auya r13 = (defpackage.auya) r13
            int r11 = r11 + -1
            r13.c = r11
            int r11 = r13.a
            r11 = r11 | 2
            r13.a = r11
            boolean r11 = r5.c
            if (r11 != 0) goto L_0x0563
            goto L_0x0568
        L_0x0563:
            r5.c()
            r5.c = r7
        L_0x0568:
            aucj r11 = r5.b
            auyf r11 = (defpackage.auyf) r11
            aucj r12 = r12.i()
            auya r12 = (defpackage.auya) r12
            r12.getClass()
            aucx r13 = r11.c
            boolean r13 = r13.a()
            if (r13 != 0) goto L_0x0585
            aucx r13 = r11.c
            aucx r13 = defpackage.aucj.a((defpackage.aucx) r13)
            r11.c = r13
        L_0x0585:
            aucx r11 = r11.c
            r11.add(r12)
            int r10 = r10 + 1
            goto L_0x0512
        L_0x058d:
            aucx r9 = r2.c
            int r9 = r9.size()
            r10 = 0
        L_0x0594:
            if (r10 >= r9) goto L_0x0634
            auxx r11 = defpackage.auxx.d
            aucd r11 = r11.o()
            aucx r12 = r2.c
            java.lang.Object r12 = r12.get(r10)
            avae r12 = (defpackage.avae) r12
            auzr r13 = r12.c
            if (r13 != 0) goto L_0x05aa
            auzr r13 = defpackage.auzr.e
        L_0x05aa:
            auxm r13 = a((defpackage.auzr) r13)
            boolean r14 = r11.c
            if (r14 == 0) goto L_0x05b7
            r11.c()
            r11.c = r7
        L_0x05b7:
            aucj r14 = r11.b
            auxx r14 = (defpackage.auxx) r14
            r13.getClass()
            r14.c = r13
            int r13 = r14.a
            r13 = r13 | r8
            r14.a = r13
            aucx r13 = r12.b
            int r13 = r13.size()
            r14 = 0
        L_0x05cc:
            if (r14 >= r13) goto L_0x0601
            aucx r15 = r12.b
            java.lang.Object r15 = r15.get(r14)
            java.lang.String r15 = (java.lang.String) r15
            boolean r8 = r11.c
            if (r8 != 0) goto L_0x05db
            goto L_0x05e0
        L_0x05db:
            r11.c()
            r11.c = r7
        L_0x05e0:
            aucj r8 = r11.b
            auxx r8 = (defpackage.auxx) r8
            r15.getClass()
            aucx r7 = r8.b
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x05f7
            aucx r7 = r8.b
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)
            r8.b = r7
        L_0x05f7:
            aucx r7 = r8.b
            r7.add(r15)
            int r14 = r14 + 1
            r7 = 0
            r8 = 1
            goto L_0x05cc
        L_0x0601:
            boolean r7 = r5.c
            if (r7 != 0) goto L_0x0606
            goto L_0x060c
        L_0x0606:
            r5.c()
            r7 = 0
            r5.c = r7
        L_0x060c:
            aucj r7 = r5.b
            auyf r7 = (defpackage.auyf) r7
            aucj r8 = r11.i()
            auxx r8 = (defpackage.auxx) r8
            r8.getClass()
            aucx r11 = r7.d
            boolean r11 = r11.a()
            if (r11 != 0) goto L_0x0629
            aucx r11 = r7.d
            aucx r11 = defpackage.aucj.a((defpackage.aucx) r11)
            r7.d = r11
        L_0x0629:
            aucx r7 = r7.d
            r7.add(r8)
            int r10 = r10 + 1
            r7 = 0
            r8 = 1
            goto L_0x0594
        L_0x0634:
            boolean r2 = r3.c
            if (r2 != 0) goto L_0x0639
            goto L_0x063f
        L_0x0639:
            r3.c()
            r2 = 0
            r3.c = r2
        L_0x063f:
            aucj r2 = r3.b
            auxr r2 = (defpackage.auxr) r2
            aucj r5 = r5.i()
            auyf r5 = (defpackage.auyf) r5
            r5.getClass()
            r2.d = r5
            int r5 = r2.a
            r5 = r5 | 4
            r2.a = r5
        L_0x0654:
            aucj r2 = r3.i()
            auxr r2 = (defpackage.auxr) r2
            boolean r3 = r0.c
            if (r3 == 0) goto L_0x0664
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x0664:
            aucj r3 = r0.b
            auxu r3 = (defpackage.auxu) r3
            r2.getClass()
            r3.c = r2
            int r2 = r3.a
            r2 = r2 | 2
            r3.a = r2
            boolean r2 = r6.c
            if (r2 != 0) goto L_0x0678
            goto L_0x067e
        L_0x0678:
            r6.c()
            r2 = 0
            r6.c = r2
        L_0x067e:
            aucj r2 = r6.b
            auxc r2 = (defpackage.auxc) r2
            aucj r0 = r0.i()
            auxu r0 = (defpackage.auxu) r0
            r0.getClass()
            r2.f = r0
            int r0 = r2.a
            r0 = r0 | 16
            r2.a = r0
        L_0x0693:
            if (r4 == 0) goto L_0x06e1
            r2 = 0
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r0 = r4.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            arwg r2 = r1.e
            r2.b()
            int r2 = r0.length
            long[] r2 = new long[r2]
            r3 = 0
        L_0x06a7:
            int r4 = r0.length
            if (r3 >= r4) goto L_0x06b9
            r4 = r0[r3]
            java.lang.Long r4 = r1.b(r4)
            long r4 = r4.longValue()
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x06a7
        L_0x06b9:
            java.util.List r0 = defpackage.aook.a((long[]) r2)
            boolean r2 = r6.c
            if (r2 != 0) goto L_0x06c2
            goto L_0x06c8
        L_0x06c2:
            r6.c()
            r2 = 0
            r6.c = r2
        L_0x06c8:
            aucj r2 = r6.b
            auxc r2 = (defpackage.auxc) r2
            aucv r3 = r2.g
            boolean r3 = r3.a()
            if (r3 != 0) goto L_0x06dc
            aucv r3 = r2.g
            aucv r3 = defpackage.aucj.a((defpackage.aucv) r3)
            r2.g = r3
        L_0x06dc:
            aucv r2 = r2.g
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r2)
        L_0x06e1:
            auvz r0 = defpackage.auvz.k
            aucd r0 = r0.o()
            auwe r2 = defpackage.auwe.f
            aucd r2 = r2.o()
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x06f2
            goto L_0x06f8
        L_0x06f2:
            r2.c()
            r3 = 0
            r2.c = r3
        L_0x06f8:
            aucj r3 = r2.b
            auwe r3 = (defpackage.auwe) r3
            aucj r4 = r6.i()
            auxc r4 = (defpackage.auxc) r4
            r4.getClass()
            r3.c = r4
            int r4 = r3.a
            r4 = r4 | 2
            r3.a = r4
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0712
            goto L_0x0718
        L_0x0712:
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x0718:
            aucj r3 = r0.b
            auvz r3 = (defpackage.auvz) r3
            aucj r2 = r2.i()
            auwe r2 = (defpackage.auwe) r2
            r2.getClass()
            r3.b = r2
            int r2 = r3.a
            r4 = 1
            r2 = r2 | r4
            r3.a = r2
            aucj r0 = r0.i()
            auvz r0 = (defpackage.auvz) r0
            return r0
        L_0x0734:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uyz.a(com.google.android.gms.nearby.messages.ClientAppIdentifier, audx, audx, int, java.util.Set):auvz");
    }

    public final void a(int i) {
        this.a.remove(i);
        this.b.remove(i);
        this.c.remove(i);
    }

    public final void a(Context context, String str, int i) {
        this.e.b();
        a(context, str, i, (Set) null);
    }

    public final void a(Context context, String str, int i, Set set) {
        this.e.b();
        HashSet hashSet = new HashSet();
        hashSet.addAll(((uyj) thl.a(context, uyj.class)).a((ClientAppIdentifier) null));
        uyt uyt = (uyt) thl.a(context, uyt.class);
        uyt.g.b();
        hashSet.addAll(new HashSet(uyt.f.keySet()));
        a(str, i, (Set) hashSet, set);
    }

    public final void a(auvz auvz) {
        if (auvz != null) {
            a(auvz, false);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            auyx auyx = this.d.f.j;
            if (auyx == null) {
                auyx = auyx.e;
            }
            long j = elapsedRealtime - auyx.b;
            for (int i = 0; i < this.a.size(); i++) {
                audx audx = (audx) this.a.get(i);
                if (((Long) this.c.get(i)).longValue() < j) {
                    auvz b2 = b((ClientAppIdentifier) this.b.get(i), audx, 400);
                    if (b2 != null) {
                        a(b2, false);
                    }
                    b(audx);
                }
            }
        }
    }

    public final void a(ClientAppIdentifier clientAppIdentifier, audx audx, int i) {
        this.e.b();
        ((anih) ((anih) tgc.a.d()).a("uyz", "a", 160, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s response failed for %s with status=%d", (Object) "CopresenceLogger: ", (Object) clientAppIdentifier, (Object) Integer.valueOf(i));
        if (c(audx) >= 0) {
            a(b(clientAppIdentifier, audx, i));
            b(audx);
        }
    }

    public final void a(ClientAppIdentifier clientAppIdentifier, avcw avcw, avcx avcx, Set set) {
        avcw avcw2 = avcw;
        this.e.b();
        ((anih) ((anih) tgc.a.d()).a("uyz", "a", 145, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s response succeeded for %s [%dms], addresses %s", "CopresenceLogger: ", clientAppIdentifier, Long.valueOf(a((audx) avcw2)), set);
        a(a(clientAppIdentifier, avcw, avcx, 200, set));
        b(avcw2);
    }

    public final void a(String str, int i, Set set, Set set2) {
        String[] strArr;
        this.e.b();
        jjg jjg = tgc.a;
        aucd o = auvz.k.o();
        aucd o2 = auwe.f.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        auwe auwe = (auwe) o2.b;
        auwe.b = i - 1;
        auwe.a |= 1;
        this.e.b();
        if (!this.g.equals(set)) {
            this.g.clear();
            this.g.addAll(set);
            strArr = (String[]) this.g.toArray(new String[0]);
        } else {
            strArr = new String[]{"-"};
        }
        List asList = Arrays.asList(strArr);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        auwe auwe2 = (auwe) o2.b;
        if (!auwe2.e.a()) {
            auwe2.e = aucj.a(auwe2.e);
        }
        auab.a((Iterable) asList, (List) auwe2.e);
        if (set2 != null) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                avch avch = (avch) it.next();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                auwe auwe3 = (auwe) o2.b;
                avch.getClass();
                if (!auwe3.d.a()) {
                    auwe3.d = aucj.a(auwe3.d);
                }
                auwe3.d.d(avch.k);
            }
        }
        auwe auwe4 = (auwe) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auvz auvz = (auvz) o.b;
        auwe4.getClass();
        auvz.b = auwe4;
        int i2 = auvz.a | 1;
        auvz.a = i2;
        if (str != null) {
            str.getClass();
            auvz.a = i2 | 4;
            auvz.c = str;
        }
        a((auvz) o.i(), false);
    }
}
