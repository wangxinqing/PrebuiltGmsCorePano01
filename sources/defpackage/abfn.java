package defpackage;

import android.view.LayoutInflater;
import com.google.android.gms.R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: abfn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abfn implements ablg {
    public List a;
    public boolean b;
    private final abfl c;
    private boolean d;
    private avjk e;

    public abfn(abfl abfl) {
        this.c = abfl;
    }

    public final void a() {
        boolean z;
        amri amri;
        int a2;
        if (this.b && this.d) {
            abfl abfl = this.c;
            List list = this.a;
            avjk avjk = this.e;
            boolean z2 = list != null && !list.isEmpty();
            boolean z3 = (avjk == null || avjk.a.size() == 0) ? false : true;
            if (azjb.b()) {
                z = !abfl.g.contains(3);
            } else {
                z = true;
            }
            if (azim.b()) {
                jra jra = abfl.A;
                if (z) {
                    amri c2 = amri.c(list);
                    amri c3 = amri.c(avjk);
                    List arrayList = new ArrayList();
                    if (c2.a()) {
                        arrayList.addAll((Collection) c2.b());
                    }
                    if (c3.a()) {
                        aucx aucx = ((avjk) c3.b()).a;
                        int size = aucx.size();
                        for (int i = 0; i < size; i++) {
                            avjj avjj = (avjj) aucx.get(i);
                            if (!((avjj.a & 1) == 0 || (a2 = avji.a(avjj.b)) == 0 || a2 != 3)) {
                                arrayList.add(avjj);
                            }
                        }
                    }
                    Collections.sort(arrayList, abfi.a);
                    if (arrayList.size() > 10) {
                        arrayList = arrayList.subList(0, 10);
                    }
                    amri = amri.b(arrayList);
                } else {
                    amri = ampu.a;
                }
                jra.a(amri);
            } else if (!abfl.q && ((z2 || z3) && z)) {
                BaseCardView baseCardView = (BaseCardView) LayoutInflater.from(abfl.a).inflate(R.layout.card, abfl.c, false);
                abfl.e.add(new abjm(abfl.a, baseCardView, list, avjk, abfl.i, abfl.k, abfl.m, abfl.o));
                abfl.v.a(baseCardView, 0, jtg.a(jth.SMART_PROFILE_RECENT_INTERACTIONS_CARD));
            }
            abfl.q = true;
            abfl.c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0271  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.abgl r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            avjk r2 = r1.f
            r0.e = r2
            r2 = 1
            r0.d = r2
            r23.a()
            abfl r3 = r0.c
            boolean r4 = defpackage.azim.b()
            r7 = 0
            if (r4 == 0) goto L_0x0500
            boolean r4 = r24.c()
            if (r4 != 0) goto L_0x001e
            goto L_0x0027
        L_0x001e:
            aviq r4 = r1.d
            boolean r4 = r4.e
            if (r4 == 0) goto L_0x0027
            r3.b()
        L_0x0027:
            jpz r4 = r3.x
            boolean r8 = r24.a()
            java.lang.String r9 = "Missing required properties:"
            java.lang.String r10 = ""
            if (r8 == 0) goto L_0x0361
            avhl r8 = r1.a
            jsc r22 = new jsc
            aucx r11 = r8.d
            int r11 = r11.size()
            if (r11 <= 0) goto L_0x005f
            aucx r11 = r8.d
            java.lang.Object r11 = r11.get(r7)
            avhf r11 = (defpackage.avhf) r11
            java.lang.String r11 = r11.a
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x005f
            aucx r11 = r8.d
            java.lang.Object r11 = r11.get(r7)
            avhf r11 = (defpackage.avhf) r11
            java.lang.String r11 = r11.a
            amri r11 = defpackage.amri.b(r11)
            r12 = r11
            goto L_0x0062
        L_0x005f:
            ampu r11 = defpackage.ampu.a
            r12 = r11
        L_0x0062:
            aucx r11 = r8.e
            int r11 = r11.size()
            if (r11 <= 0) goto L_0x0093
            aucx r11 = r8.e
            java.lang.Object r11 = r11.get(r7)
            avhb r11 = (defpackage.avhb) r11
            avop r11 = r11.b
            if (r11 != 0) goto L_0x0078
            avop r11 = defpackage.avop.d
        L_0x0078:
            boolean r11 = defpackage.jsb.a(r11)
            if (r11 == 0) goto L_0x0093
            aucx r11 = r8.e
            java.lang.Object r11 = r11.get(r7)
            avhb r11 = (defpackage.avhb) r11
            avop r11 = r11.b
            if (r11 == 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            avop r11 = defpackage.avop.d
        L_0x008d:
            amri r11 = defpackage.amri.b(r11)
            r13 = r11
            goto L_0x0096
        L_0x0093:
            ampu r11 = defpackage.ampu.a
            r13 = r11
        L_0x0096:
            aucx r11 = r8.f
            int r11 = r11.size()
            if (r11 <= 0) goto L_0x00c5
            aucx r11 = r8.f
            java.lang.Object r11 = r11.get(r7)
            avhd r11 = (defpackage.avhd) r11
            java.lang.String r14 = r11.b
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x00b6
            java.lang.String r11 = r11.b
            amri r11 = defpackage.amri.b(r11)
            r14 = r11
            goto L_0x00c8
        L_0x00b6:
            java.lang.String r14 = r11.a
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x00c5
            java.lang.String r11 = r11.a
            amri r11 = defpackage.amri.b(r11)
            goto L_0x00c7
        L_0x00c5:
            ampu r11 = defpackage.ampu.a
        L_0x00c7:
            r14 = r11
        L_0x00c8:
            amzt r11 = defpackage.amzy.j()
            aucx r15 = r8.a
            int r15 = r15.size()
            if (r15 <= 0) goto L_0x0100
            aucx r15 = r8.a
            int r2 = r15.size()
            r6 = 0
        L_0x00db:
            if (r6 < r2) goto L_0x00de
            goto L_0x0100
        L_0x00de:
            java.lang.Object r16 = r15.get(r6)
            r5 = r16
            avhc r5 = (defpackage.avhc) r5
            int r7 = r5.a
            r7 = r7 & 4
            if (r7 != 0) goto L_0x00ed
            goto L_0x00fc
        L_0x00ed:
            avop r7 = r5.c
            if (r7 != 0) goto L_0x00f3
            avop r7 = defpackage.avop.d
        L_0x00f3:
            boolean r7 = defpackage.jsb.a(r7)
            if (r7 == 0) goto L_0x00fc
            r11.c(r5)
        L_0x00fc:
            int r6 = r6 + 1
            r7 = 0
            goto L_0x00db
        L_0x0100:
            amzy r15 = r11.a()
            amzt r2 = defpackage.amzy.j()
            aucx r5 = r8.h
            int r6 = r5.size()
            r7 = 0
        L_0x010f:
            if (r7 < r6) goto L_0x0271
            amzy r16 = r2.a()
            amzt r11 = defpackage.amzy.j()
            aucx r2 = r8.b
            int r5 = r2.size()
            r6 = 0
        L_0x0120:
            if (r6 < r5) goto L_0x0239
            amzy r17 = r11.a()
            amzt r7 = defpackage.amzy.j()
            aucx r2 = r8.c
            int r5 = r2.size()
            r6 = 0
        L_0x0131:
            if (r6 < r5) goto L_0x0201
            amzy r18 = r7.a()
            amzt r11 = defpackage.amzy.j()
            aucx r2 = r8.j
            int r5 = r2.size()
            r6 = 0
        L_0x0142:
            if (r6 < r5) goto L_0x01c9
            amzy r19 = r11.a()
            amzt r2 = defpackage.amzy.j()
            aucx r5 = r8.i
            int r6 = r5.size()
            r7 = 0
        L_0x0153:
            if (r7 >= r6) goto L_0x018c
            java.lang.Object r11 = r5.get(r7)
            avhk r11 = (defpackage.avhk) r11
            java.lang.String r0 = r11.b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0183
            jsq r0 = defpackage.jsr.c()
            r20 = r5
            java.lang.String r5 = r11.b
            r0.b(r5)
            java.lang.String r5 = r11.a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x017b
            java.lang.String r5 = r11.a
            r0.a(r5)
        L_0x017b:
            jsr r0 = r0.a()
            r2.c(r0)
            goto L_0x0185
        L_0x0183:
            r20 = r5
        L_0x0185:
            int r7 = r7 + 1
            r0 = r23
            r5 = r20
            goto L_0x0153
        L_0x018c:
            amzy r20 = r2.a()
            aucx r0 = r8.g
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01ba
            aucx r0 = r8.g
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            avhh r0 = (defpackage.avhh) r0
            java.lang.String r0 = r0.a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01ba
            aucx r0 = r8.g
            java.lang.Object r0 = r0.get(r2)
            avhh r0 = (defpackage.avhh) r0
            java.lang.String r0 = r0.a
            amri r0 = defpackage.amri.b(r0)
            r21 = r0
            goto L_0x01be
        L_0x01ba:
            ampu r0 = defpackage.ampu.a
            r21 = r0
        L_0x01be:
            r11 = r22
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            amri r0 = defpackage.amri.b(r22)
            goto L_0x0363
        L_0x01c9:
            java.lang.Object r0 = r2.get(r6)
            avhj r0 = (defpackage.avhj) r0
            java.lang.String r7 = r0.a
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x01f7
            jsq r7 = defpackage.jsr.c()
            r19 = r2
            java.lang.String r2 = r0.a
            r7.b(r2)
            java.lang.String r2 = r0.b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01ef
            java.lang.String r0 = r0.b
            r7.a(r0)
        L_0x01ef:
            jsr r0 = r7.a()
            r11.c(r0)
            goto L_0x01f9
        L_0x01f7:
            r19 = r2
        L_0x01f9:
            int r6 = r6 + 1
            r0 = r23
            r2 = r19
            goto L_0x0142
        L_0x0201:
            java.lang.Object r0 = r2.get(r6)
            avhe r0 = (defpackage.avhe) r0
            java.lang.String r11 = r0.b
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x022f
            jsq r11 = defpackage.jsr.c()
            r18 = r2
            java.lang.String r2 = r0.b
            r11.b(r2)
            java.lang.String r2 = r0.a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0227
            java.lang.String r0 = r0.a
            r11.a(r0)
        L_0x0227:
            jsr r0 = r11.a()
            r7.c(r0)
            goto L_0x0231
        L_0x022f:
            r18 = r2
        L_0x0231:
            int r6 = r6 + 1
            r0 = r23
            r2 = r18
            goto L_0x0131
        L_0x0239:
            java.lang.Object r0 = r2.get(r6)
            avhi r0 = (defpackage.avhi) r0
            java.lang.String r7 = r0.b
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0267
            jsq r7 = defpackage.jsr.c()
            r17 = r2
            java.lang.String r2 = r0.b
            r7.b(r2)
            java.lang.String r2 = r0.a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x025f
            java.lang.String r0 = r0.a
            r7.a(r0)
        L_0x025f:
            jsr r0 = r7.a()
            r11.c(r0)
            goto L_0x0269
        L_0x0267:
            r17 = r2
        L_0x0269:
            int r6 = r6 + 1
            r0 = r23
            r2 = r17
            goto L_0x0120
        L_0x0271:
            java.lang.Object r0 = r5.get(r7)
            avhg r0 = (defpackage.avhg) r0
            java.lang.String r11 = r0.b
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x034f
            jsk r11 = new jsk
            r11.<init>()
            r16 = r5
            java.lang.String r5 = r0.a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x02ab
            java.lang.String r5 = r0.b
            boolean r17 = android.webkit.URLUtil.isValidUrl(r5)
            if (r17 == 0) goto L_0x02a8
            java.lang.String r5 = r0.b
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r5 = r5.getSchemeSpecificPart()
            r17 = r6
            r6 = 2
            java.lang.String r5 = r5.substring(r6)
            goto L_0x02af
        L_0x02a8:
            r17 = r6
            goto L_0x02af
        L_0x02ab:
            r17 = r6
            java.lang.String r5 = r0.a
        L_0x02af:
            int r6 = r5.length()
            r18 = r8
            r8 = 18
            if (r6 <= r8) goto L_0x02c8
            r6 = 0
            java.lang.String r5 = r5.substring(r6, r8)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "..."
            java.lang.String r5 = r5.concat(r6)
        L_0x02c8:
            if (r5 == 0) goto L_0x0347
            r11.a = r5
            java.lang.String r0 = r0.b
            if (r0 == 0) goto L_0x033f
            r11.b = r0
            java.lang.String r5 = "https://s2.googleusercontent.com/s2/favicons?sz=32&domain_url="
            int r6 = r0.length()
            if (r6 != 0) goto L_0x02e0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            goto L_0x02e4
        L_0x02e0:
            java.lang.String r0 = r5.concat(r0)
        L_0x02e4:
            if (r0 == 0) goto L_0x0337
            r11.c = r0
            java.lang.String r0 = r11.a
            if (r0 != 0) goto L_0x02ef
            java.lang.String r0 = " linkTitle"
            goto L_0x02f0
        L_0x02ef:
            r0 = r10
        L_0x02f0:
            java.lang.String r5 = r11.b
            if (r5 != 0) goto L_0x02fa
            java.lang.String r5 = " url"
            java.lang.String r0 = r0.concat(r5)
        L_0x02fa:
            java.lang.String r5 = r11.c
            if (r5 != 0) goto L_0x0308
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = " iconUrl"
            java.lang.String r0 = r0.concat(r5)
        L_0x0308:
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x031d
            jse r0 = new jse
            java.lang.String r5 = r11.a
            java.lang.String r6 = r11.b
            java.lang.String r8 = r11.c
            r0.<init>(r5, r6, r8)
            r2.c(r0)
            goto L_0x0355
        L_0x031d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 != 0) goto L_0x032f
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9)
            goto L_0x0333
        L_0x032f:
            java.lang.String r0 = r9.concat(r0)
        L_0x0333:
            r1.<init>(r0)
            throw r1
        L_0x0337:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null iconUrl"
            r0.<init>(r1)
            throw r0
        L_0x033f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null url"
            r0.<init>(r1)
            throw r0
        L_0x0347:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null linkTitle"
            r0.<init>(r1)
            throw r0
        L_0x034f:
            r16 = r5
            r17 = r6
            r18 = r8
        L_0x0355:
            int r7 = r7 + 1
            r0 = r23
            r5 = r16
            r6 = r17
            r8 = r18
            goto L_0x010f
        L_0x0361:
            ampu r0 = defpackage.ampu.a
        L_0x0363:
            r4.a((defpackage.amri) r0)
            jqo r0 = r3.D
            avka r2 = r1.k
            amri r2 = defpackage.amri.c(r2)
            r0.a((defpackage.amri) r2)
            jrq r0 = r3.C
            avjx r2 = r1.j
            amri r2 = defpackage.amri.c(r2)
            r0.a((defpackage.amri) r2)
            jso r0 = new jso
            r2 = 0
            r0.<init>(r2)
            java.lang.String r2 = r3.i
            amri r2 = defpackage.amri.c(r2)
            java.lang.String r4 = "Null viewerAccountName"
            if (r2 == 0) goto L_0x04fa
            r0.c = r2
            java.lang.String r2 = r3.j
            amri r2 = defpackage.amri.c(r2)
            java.lang.String r5 = "Null viewerPageId"
            if (r2 == 0) goto L_0x04f4
            r0.d = r2
            jsm r2 = new jsm
            r6 = 0
            r2.<init>(r6)
            java.lang.String r6 = r3.i
            amri r6 = defpackage.amri.c(r6)
            if (r6 == 0) goto L_0x04ee
            r2.c = r6
            java.lang.String r4 = r3.j
            amri r4 = defpackage.amri.c(r4)
            if (r4 == 0) goto L_0x04e8
            r2.d = r4
            boolean r4 = r24.c()
            if (r4 != 0) goto L_0x03bb
            goto L_0x03cf
        L_0x03bb:
            aviq r4 = r1.d
            java.lang.String r4 = r4.j
            amri r4 = defpackage.amri.b(r4)
            r0.b = r4
            aviq r4 = r1.d
            java.lang.String r4 = r4.j
            amri r4 = defpackage.amri.b(r4)
            r2.b = r4
        L_0x03cf:
            jqw r4 = r3.z
            boolean r5 = r24.b()
            if (r5 == 0) goto L_0x0450
            avio r5 = r1.c
            amzt r6 = defpackage.amzy.j()
            aucx r5 = r5.a
            int r7 = r5.size()
            r8 = 0
        L_0x03e4:
            if (r8 >= r7) goto L_0x040a
            java.lang.Object r11 = r5.get(r8)
            avim r11 = (defpackage.avim) r11
            java.lang.String r12 = r11.b
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0404
            avin r12 = r11.c
            if (r12 == 0) goto L_0x03f9
            goto L_0x03fb
        L_0x03f9:
            avin r12 = defpackage.avin.b
        L_0x03fb:
            java.lang.String r12 = r12.a
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0404
            goto L_0x0407
        L_0x0404:
            r6.c(r11)
        L_0x0407:
            int r8 = r8 + 1
            goto L_0x03e4
        L_0x040a:
            amzy r5 = r6.a()
            if (r5 == 0) goto L_0x0448
            r0.a = r5
            amzy r5 = r0.a
            if (r5 != 0) goto L_0x0419
            java.lang.String r5 = " posts"
            goto L_0x041a
        L_0x0419:
            r5 = r10
        L_0x041a:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x0436
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r1 = r5.length()
            if (r1 != 0) goto L_0x042e
            java.lang.String r1 = new java.lang.String
            r1.<init>(r9)
            goto L_0x0432
        L_0x042e:
            java.lang.String r1 = r9.concat(r5)
        L_0x0432:
            r0.<init>(r1)
            throw r0
        L_0x0436:
            jsg r5 = new jsg
            amzy r6 = r0.a
            amri r7 = r0.b
            amri r8 = r0.c
            amri r0 = r0.d
            r5.<init>(r6, r7, r8, r0)
            amri r0 = defpackage.amri.b(r5)
            goto L_0x0452
        L_0x0448:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null posts"
            r0.<init>(r1)
            throw r0
        L_0x0450:
            ampu r0 = defpackage.ampu.a
        L_0x0452:
            r4.a((defpackage.amri) r0)
            boolean r0 = defpackage.aziv.b()
            if (r0 != 0) goto L_0x04ab
            jqr r0 = r3.y
            boolean r4 = r24.e()
            if (r4 != 0) goto L_0x0466
            ampu r2 = defpackage.ampu.a
            goto L_0x049f
        L_0x0466:
            avjs r4 = r1.h
            if (r4 == 0) goto L_0x04a3
            r2.a = r4
            avjs r4 = r2.a
            if (r4 != 0) goto L_0x0472
            java.lang.String r10 = " relatedPhotosCard"
        L_0x0472:
            boolean r4 = r10.isEmpty()
            if (r4 != 0) goto L_0x048e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r1 = r10.length()
            if (r1 != 0) goto L_0x0486
            java.lang.String r1 = new java.lang.String
            r1.<init>(r9)
            goto L_0x048a
        L_0x0486:
            java.lang.String r1 = r9.concat(r10)
        L_0x048a:
            r0.<init>(r1)
            throw r0
        L_0x048e:
            jsf r4 = new jsf
            avjs r5 = r2.a
            amri r6 = r2.b
            amri r7 = r2.c
            amri r2 = r2.d
            r4.<init>(r5, r6, r7, r2)
            amri r2 = defpackage.amri.b(r4)
        L_0x049f:
            r0.a((defpackage.amri) r2)
            goto L_0x04ab
        L_0x04a3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null relatedPhotosCard"
            r0.<init>(r1)
            throw r0
        L_0x04ab:
            boolean r0 = defpackage.azis.b()
            if (r0 != 0) goto L_0x04d3
            jre r0 = r3.B
            boolean r2 = r24.d()
            if (r2 == 0) goto L_0x04ce
            avjo r2 = r1.g
            int r2 = r2.b
            int r2 = defpackage.avjn.a(r2)
            if (r2 != 0) goto L_0x04c4
            goto L_0x04ce
        L_0x04c4:
            r4 = 2
            if (r2 != r4) goto L_0x04ce
            avjo r2 = r1.g
            amri r2 = defpackage.amri.b(r2)
            goto L_0x04d0
        L_0x04ce:
            ampu r2 = defpackage.ampu.a
        L_0x04d0:
            r0.a((defpackage.amri) r2)
        L_0x04d3:
            jrk r0 = r3.E
            boolean r2 = r24.f()
            if (r2 == 0) goto L_0x04e2
            avjv r2 = r1.i
            amri r2 = defpackage.amri.b(r2)
            goto L_0x04e4
        L_0x04e2:
            ampu r2 = defpackage.ampu.a
        L_0x04e4:
            r0.a((defpackage.amri) r2)
            goto L_0x0500
        L_0x04e8:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x04ee:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x04f4:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x04fa:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x0500:
            boolean r0 = r3.p
            if (r0 != 0) goto L_0x090b
            boolean r0 = defpackage.azim.b()
            if (r0 != 0) goto L_0x06b8
            boolean r0 = r24.c()
            if (r0 == 0) goto L_0x0519
            aviq r0 = r1.d
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x0519
            r3.b()
        L_0x0519:
            azjb r0 = defpackage.azjb.a
            azjc r0 = r0.a()
            boolean r0 = r0.d()
            r2 = 2131624142(0x7f0e00ce, float:1.8875455E38)
            if (r0 == 0) goto L_0x0562
            boolean r0 = r24.f()
            if (r0 == 0) goto L_0x0562
            android.content.Context r0 = r3.a
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.ViewGroup r4 = r3.c
            r5 = 0
            android.view.View r0 = r0.inflate(r2, r4, r5)
            com.google.android.gms.smart_profile.card.view.BaseCardView r0 = (com.google.android.gms.smart_profile.card.view.BaseCardView) r0
            java.util.List r4 = r3.e
            abjs r5 = new abjs
            com.google.android.chimera.Activity r7 = r3.l
            android.content.Context r8 = r3.a
            avjv r10 = r1.i
            jsx r11 = r3.h
            java.lang.String r12 = r3.k
            jtf r13 = r3.m
            android.os.Bundle r14 = r3.o
            r6 = r5
            r9 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r4.add(r5)
            abfo r4 = r3.u
            jth r5 = defpackage.jth.REPORTING_CHAIN_CARD
            jtg r5 = defpackage.jtg.a(r5)
            r4.a(r0, r5)
        L_0x0562:
            boolean r0 = r24.a()
            if (r0 == 0) goto L_0x0598
            android.content.Context r0 = r3.a
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.ViewGroup r4 = r3.c
            r5 = 0
            android.view.View r0 = r0.inflate(r2, r4, r5)
            com.google.android.gms.smart_profile.card.view.BaseCardView r0 = (com.google.android.gms.smart_profile.card.view.BaseCardView) r0
            java.util.List r4 = r3.e
            abiq r5 = new abiq
            android.content.Context r7 = r3.a
            avhl r9 = r1.a
            jsx r10 = r3.h
            jtf r11 = r3.m
            android.os.Bundle r12 = r3.o
            r6 = r5
            r8 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r4.add(r5)
            abfo r4 = r3.u
            jth r5 = defpackage.jth.SMART_PROFILE_ABOUT_CARD
            jtg r5 = defpackage.jtg.a(r5)
            r4.a(r0, r5)
        L_0x0598:
            avka r0 = r1.k
            if (r0 == 0) goto L_0x05ca
            android.content.Context r0 = r3.a
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.ViewGroup r4 = r3.c
            r5 = 0
            android.view.View r0 = r0.inflate(r2, r4, r5)
            com.google.android.gms.smart_profile.card.view.BaseCardView r0 = (com.google.android.gms.smart_profile.card.view.BaseCardView) r0
            java.util.List r4 = r3.e
            abja r5 = new abja
            android.content.Context r7 = r3.a
            avka r9 = r1.k
            jtf r10 = r3.m
            android.os.Bundle r11 = r3.o
            r6 = r5
            r8 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            r4.add(r5)
            abfo r4 = r3.u
            jth r5 = defpackage.jth.SMART_PROFILE_ORGANIZATIONS_CARD
            jtg r5 = defpackage.jtg.a(r5)
            r4.a(r0, r5)
        L_0x05ca:
            boolean r0 = r24.b()
            if (r0 == 0) goto L_0x0606
            boolean r0 = r24.c()
            if (r0 == 0) goto L_0x0606
            android.content.Context r0 = r3.a
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.ViewGroup r4 = r3.c
            r5 = 0
            android.view.View r0 = r0.inflate(r2, r4, r5)
            com.google.android.gms.smart_profile.card.view.BaseCardView r0 = (com.google.android.gms.smart_profile.card.view.BaseCardView) r0
            abjh r6 = new abjh
            android.content.Context r7 = r3.a
            avio r9 = r1.c
            java.lang.String r10 = r3.i
            java.lang.String r11 = r3.j
            aviq r4 = r1.d
            java.lang.String r12 = r4.j
            jsx r13 = r3.h
            jtf r14 = r3.m
            r8 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            abfo r4 = r3.u
            jth r5 = defpackage.jth.SMART_PROFILE_GOOGLE_PLUS_POSTS_CARD
            jtg r5 = defpackage.jtg.a(r5)
            r4.a(r0, r5)
        L_0x0606:
            avjx r0 = r1.j
            if (r0 == 0) goto L_0x0632
            android.content.Context r0 = r3.a
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.ViewGroup r4 = r3.c
            r5 = 0
            android.view.View r0 = r0.inflate(r2, r4, r5)
            com.google.android.gms.smart_profile.card.view.BaseCardView r0 = (com.google.android.gms.smart_profile.card.view.BaseCardView) r0
            abjy r6 = new abjy
            android.content.Context r7 = r3.a
            avjx r9 = r1.j
            jsx r10 = r3.h
            jtf r11 = r3.m
            r8 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            abfo r4 = r3.v
            jth r5 = defpackage.jth.SMART_PROFILE_CURRENT_LOCATION_CARD
            jtg r5 = defpackage.jtg.a(r5)
            r4.a(r0, r5)
        L_0x0632:
            boolean r0 = defpackage.aziv.b()
            if (r0 != 0) goto L_0x0674
            boolean r0 = r24.e()
            if (r0 == 0) goto L_0x0674
            boolean r0 = r24.c()
            if (r0 == 0) goto L_0x0674
            android.content.Context r0 = r3.a
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.ViewGroup r4 = r3.c
            r5 = 0
            android.view.View r0 = r0.inflate(r2, r4, r5)
            com.google.android.gms.smart_profile.card.view.BaseCardView r0 = (com.google.android.gms.smart_profile.card.view.BaseCardView) r0
            abjd r6 = new abjd
            android.content.Context r7 = r3.a
            avjs r9 = r1.h
            java.lang.String r10 = r3.i
            java.lang.String r11 = r3.j
            aviq r4 = r1.d
            java.lang.String r12 = r4.j
            jsx r13 = r3.h
            jtf r14 = r3.m
            r8 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            abfo r4 = r3.v
            jth r5 = defpackage.jth.SMART_PROFILE_PHOTOS_CARD
            jtg r5 = defpackage.jtg.a(r5)
            r4.a(r0, r5)
        L_0x0674:
            boolean r0 = defpackage.azis.b()
            if (r0 != 0) goto L_0x06b8
            boolean r0 = r24.d()
            if (r0 == 0) goto L_0x06b8
            avjo r8 = r1.g
            int r0 = r8.b
            int r0 = defpackage.avjn.a(r0)
            if (r0 != 0) goto L_0x068b
            goto L_0x06b8
        L_0x068b:
            r4 = 2
            if (r0 != r4) goto L_0x06b8
            android.content.Context r0 = r3.a
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.ViewGroup r4 = r3.c
            r5 = 0
            android.view.View r0 = r0.inflate(r2, r4, r5)
            com.google.android.gms.smart_profile.card.view.BaseCardView r0 = (com.google.android.gms.smart_profile.card.view.BaseCardView) r0
            abjp r4 = new abjp
            com.google.android.chimera.Activity r5 = r3.l
            android.content.Context r6 = r3.a
            jsx r9 = r3.h
            java.lang.String r10 = r3.k
            jtf r11 = r3.m
            r7 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            abfo r2 = r3.v
            jth r4 = defpackage.jth.SMART_PROFILE_PEOPLE_IN_COMMON_CARD
            jtg r4 = defpackage.jtg.a(r4)
            r2.a(r0, r4)
        L_0x06b8:
            azjb r0 = defpackage.azjb.a
            azjc r0 = r0.a()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0904
            avis r0 = r1.e
            if (r0 == 0) goto L_0x0904
            avjc r0 = r0.b
            if (r0 == 0) goto L_0x06cd
            goto L_0x06cf
        L_0x06cd:
            avjc r0 = defpackage.avjc.b
        L_0x06cf:
            aucx r0 = r0.a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0904
            boolean r0 = defpackage.azim.b()
            if (r0 == 0) goto L_0x06ee
            android.content.Context r0 = r3.a
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r2 = 2131624466(0x7f0e0212, float:1.8876113E38)
            android.view.ViewGroup r4 = r3.c
            r5 = 0
            android.view.View r0 = r0.inflate(r2, r4, r5)
            goto L_0x06fe
        L_0x06ee:
            r5 = 0
            android.content.Context r0 = r3.a
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r2 = 2131624587(0x7f0e028b, float:1.8876358E38)
            android.view.ViewGroup r4 = r3.c
            android.view.View r0 = r0.inflate(r2, r4, r5)
        L_0x06fe:
            android.content.Context r7 = r3.a
            avis r1 = r1.e
            jsx r9 = r3.h
            abfj r11 = new abfj
            r11.<init>(r3)
            abhm r2 = new abhm
            abmk r4 = new abmk
            com.google.android.chimera.Activity r5 = r3.l
            com.google.android.chimera.LoaderManager r5 = r5.getLoaderManager()
            com.google.android.gms.common.internal.ClientContext r6 = r3.b
            android.content.Context r8 = r3.a
            r4.<init>(r5, r6, r8)
            r2.<init>(r4)
            abhq r4 = new abhq
            android.content.Context r5 = r3.a
            r4.<init>(r0, r5)
            android.os.Bundle r5 = r3.o
            avjc r6 = r1.b
            if (r6 == 0) goto L_0x072b
            goto L_0x072d
        L_0x072b:
            avjc r6 = defpackage.avjc.b
        L_0x072d:
            aucx r6 = r6.a
            int r6 = r6.size()
            if (r6 == 0) goto L_0x0746
            avjc r1 = r1.b
            if (r1 == 0) goto L_0x073a
            goto L_0x073c
        L_0x073a:
            avjc r1 = defpackage.avjc.b
        L_0x073c:
            aucx r1 = r1.a
            r6 = 0
            java.lang.Object r1 = r1.get(r6)
            avjd r1 = (defpackage.avjd) r1
            goto L_0x0747
        L_0x0746:
            r1 = 0
        L_0x0747:
            abib r12 = new abib
            abhw r13 = new abhw
            r6 = r13
            r8 = r0
            r10 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r12.<init>(r13, r1, r2, r4)
            abhw r1 = r12.c
            avjd r2 = r1.d
            if (r2 != 0) goto L_0x075f
            r1.c()
            goto L_0x07ec
        L_0x075f:
            android.view.View r2 = r1.b
            r4 = 2131429250(0x7f0b0782, float:1.8480167E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.g = r2
            android.view.View r2 = r1.b
            r4 = 2131429252(0x7f0b0784, float:1.8480171E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.Button r2 = (android.widget.Button) r2
            r1.h = r2
            android.widget.Button r2 = r1.g
            abhr r4 = new abhr
            r4.<init>(r1)
            r2.setOnClickListener(r4)
            android.widget.Button r2 = r1.h
            abhs r4 = new abhs
            r4.<init>(r1)
            r2.setOnClickListener(r4)
            android.view.View r2 = r1.b
            r4 = 2131429256(0x7f0b0788, float:1.848018E38)
            android.view.View r2 = r2.findViewById(r4)
            r1.i = r2
            android.view.View r2 = r1.b
            r4 = 2131429255(0x7f0b0787, float:1.8480178E38)
            android.view.View r2 = r2.findViewById(r4)
            r1.j = r2
            android.view.View r2 = r1.b
            r4 = 2131429251(0x7f0b0783, float:1.848017E38)
            android.view.View r2 = r2.findViewById(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            boolean r4 = defpackage.azim.b()
            r6 = 2131624468(0x7f0e0214, float:1.8876117E38)
            r7 = 2131624589(0x7f0e028d, float:1.8876362E38)
            if (r4 == 0) goto L_0x07c8
            android.content.Context r4 = r1.a
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r8 = 0
            android.view.View r4 = r4.inflate(r6, r8)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            goto L_0x07d5
        L_0x07c8:
            r8 = 0
            android.content.Context r4 = r1.a
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            android.view.View r4 = r4.inflate(r7, r8)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
        L_0x07d5:
            int r8 = r4.getChildCount()
            r9 = 100
            r9 = r4
            r4 = 0
            r10 = 100
        L_0x07df:
            avjd r11 = r1.d
            aucx r11 = r11.b
            int r11 = r11.size()
            if (r4 < r11) goto L_0x0826
            r2.addView(r9)
        L_0x07ec:
            if (r5 == 0) goto L_0x07f8
            java.lang.String r1 = "mergeCardHasDismissed"
            boolean r1 = r5.getBoolean(r1)
            if (r1 == 0) goto L_0x07f8
            r7 = 1
            goto L_0x07f9
        L_0x07f8:
            r7 = 0
        L_0x07f9:
            r12.b = r7
            if (r7 != 0) goto L_0x07fe
            goto L_0x0803
        L_0x07fe:
            abhw r1 = r12.c
            r1.c()
        L_0x0803:
            r3.r = r12
            abib r1 = r3.r
            java.util.List r1 = r1.e
            r1.add(r3)
            java.util.List r1 = r3.e
            abib r2 = r3.r
            r1.add(r2)
            abib r1 = r3.r
            boolean r1 = r1.b
            if (r1 != 0) goto L_0x0904
            abfo r1 = r3.w
            jth r2 = defpackage.jth.SMART_PROFILE_MERGE_CARD
            jtg r2 = defpackage.jtg.a(r2)
            r1.a(r0, r2)
            goto L_0x0904
        L_0x0826:
            if (r4 != 0) goto L_0x082a
            r11 = 0
            goto L_0x0854
        L_0x082a:
            int r11 = r4 % r8
            if (r11 != 0) goto L_0x0853
            r2.addView(r9)
            boolean r9 = defpackage.azim.b()
            if (r9 == 0) goto L_0x0845
            android.content.Context r9 = r1.a
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r11 = 0
            android.view.View r9 = r9.inflate(r6, r11)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            goto L_0x0854
        L_0x0845:
            r11 = 0
            android.content.Context r9 = r1.a
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            android.view.View r9 = r9.inflate(r7, r11)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            goto L_0x0854
        L_0x0853:
            r11 = 0
        L_0x0854:
            int r13 = r4 % r8
            android.view.View r13 = r9.getChildAt(r13)
            avjd r14 = r1.d
            aucx r14 = r14.b
            java.lang.Object r14 = r14.get(r4)
            avja r14 = (defpackage.avja) r14
            r15 = 2131429254(0x7f0b0786, float:1.8480176E38)
            android.view.View r15 = r13.findViewById(r15)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            abhu r6 = new abhu
            r6.<init>(r1, r15)
            int r15 = r14.a
            r15 = r15 & 16
            if (r15 != 0) goto L_0x087d
            java.lang.String r15 = defpackage.azid.b()
            goto L_0x0886
        L_0x087d:
            avjb r15 = r14.e
            if (r15 == 0) goto L_0x0882
            goto L_0x0884
        L_0x0882:
            avjb r15 = defpackage.avjb.b
        L_0x0884:
            java.lang.String r15 = r15.a
        L_0x0886:
            android.content.res.Resources r7 = r1.e
            r11 = 2131167069(0x7f07075d, float:1.7948401E38)
            int r7 = r7.getDimensionPixelSize(r11)
            java.lang.String r7 = defpackage.iqv.a(r15, r7)
            jsx r11 = r1.c
            abht r15 = new abht
            r15.<init>(r6)
            r11.a(r7, r10, r15)
            int r6 = r14.a
            r7 = 2
            r6 = r6 & r7
            if (r6 == 0) goto L_0x08bd
            r6 = 2131429253(0x7f0b0785, float:1.8480174E38)
            android.view.View r6 = r13.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            avjb r11 = r14.b
            if (r11 == 0) goto L_0x08b1
            goto L_0x08b3
        L_0x08b1:
            avjb r11 = defpackage.avjb.b
        L_0x08b3:
            java.lang.String r11 = r11.a
            r6.setText(r11)
            r11 = 0
            r6.setVisibility(r11)
            goto L_0x08be
        L_0x08bd:
            r11 = 0
        L_0x08be:
            r6 = 2131429257(0x7f0b0789, float:1.8480182E38)
            android.view.View r6 = r13.findViewById(r6)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            aucx r13 = r14.d
            int r15 = r13.size()
            r7 = 0
        L_0x08ce:
            if (r7 >= r15) goto L_0x08e1
            java.lang.Object r17 = r13.get(r7)
            r11 = r17
            avjb r11 = (defpackage.avjb) r11
            java.lang.String r11 = r11.a
            r1.a(r6, r11)
            int r7 = r7 + 1
            r11 = 0
            goto L_0x08ce
        L_0x08e1:
            aucx r7 = r14.c
            int r11 = r7.size()
            r13 = 0
        L_0x08e8:
            if (r13 < r11) goto L_0x08f6
            int r10 = r10 + 1
            int r4 = r4 + 1
            r6 = 2131624468(0x7f0e0214, float:1.8876117E38)
            r7 = 2131624589(0x7f0e028d, float:1.8876362E38)
            goto L_0x07df
        L_0x08f6:
            java.lang.Object r14 = r7.get(r13)
            avjb r14 = (defpackage.avjb) r14
            java.lang.String r14 = r14.a
            r1.a(r6, r14)
            int r13 = r13 + 1
            goto L_0x08e8
        L_0x0904:
            r0 = 1
            r3.p = r0
            r3.c()
            return
        L_0x090b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abfn.a(abgl):void");
    }
}
