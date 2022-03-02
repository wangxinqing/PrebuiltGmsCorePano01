package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xwy {
    private static final anaf a = anaf.a("male", 1, "female", 2);
    private static final anaf b = anaf.a("user", 4, "keyword", 3, "home", 2, "work", 1, "other", 5);
    private static final anaf c = anaf.a(1, 1, 2, 2, 3, 3, -1, 4);
    private static final anaf d = anaf.a(1, 1, 2, 2, 3, 3, (byte) 4, 4, -1, 5);
    private static final anaf e = anaf.a("6", "Contacts", "d", "Friends", "e", "Family", "f", "Coworkers");
    private static final anaf f;
    private static final wsn g = wsn.a;

    static {
        anab h = anaf.h();
        h.a(1, babj.b);
        h.a(6, babj.m);
        h.a(5, babj.h);
        h.a(7, babj.n);
        h.a(3, babj.e);
        h.a(4, babj.g);
        h.a(0, babj.d);
        h.a(2, babj.d);
        f = h.a();
    }

    public static String a(amgi amgi) {
        String str = null;
        if (amgi == null || (amgi.a & 2) == 0) {
            return null;
        }
        amgn amgn = amgi.c;
        if (amgn == null) {
            amgn = amgn.f;
        }
        amfu amfu = amgn.d;
        if (amfu == null) {
            amfu = amfu.b;
        }
        aucx aucx = amfu.a;
        int size = aucx.size();
        long j = -1;
        for (int i = 0; i < size; i++) {
            amgu amgu = (amgu) aucx.get(i);
            int a2 = amff.a(amgu.b);
            if (a2 != 0 && a2 == 3) {
                long j2 = amgu.e;
                if (j < j2) {
                    str = amgu.c;
                    j = j2;
                }
            }
        }
        return str;
    }

    public static void b(avlc avlc) {
        if (avlc != null) {
            int a2 = avlb.a(avlc.f);
            int i = 2;
            if (a2 != 0 && a2 != 2) {
                anaf anaf = f;
                int a3 = avlb.a(avlc.f);
                if (a3 != 0) {
                    i = a3;
                }
                babj babj = (babj) anaf.get(Integer.valueOf(i - 1));
                if (babj == null) {
                    babj = babj.d;
                }
                throw new babk(babj);
            } else if ((avlc.a & 2) != 0) {
                avkx avkx = avlc.b;
                if (avkx == null) {
                    avkx = avkx.c;
                }
                if (!avkx.b.isEmpty()) {
                    xvt r = xvu.r();
                    avkx avkx2 = avlc.b;
                    if (avkx2 == null) {
                        avkx2 = avkx.c;
                    }
                    r.d = avkx2.b;
                    r.a();
                    return;
                }
                xdt.b("FSA2_ProtoToPeopleUtil", "Delete returned group with empty id.id - %s", avlc.c);
                throw new xxy(8);
            } else {
                xdt.b("FSA2_ProtoToPeopleUtil", "Delete returned group with null id - %s", avlc.c);
                throw new xxy(7);
            }
        } else {
            Log.i("FSA2_ProtoToPeopleUtil", "Server returned null API group");
            throw new xxy(1);
        }
    }

    private static void c(avlc avlc) {
        avkw avkw = avlc.d;
        if (avkw == null) {
            avkw = avkw.g;
        }
        if (avkw.b == null) {
            avkx avkx = avkx.c;
        }
        if ((avkw.a & 2) == 0 && avkw.c == null) {
            avky avky = avky.d;
        }
        if (avkw.f == null) {
            avlf avlf = avlf.c;
        }
    }

    private static List a(List list, String str) {
        wru a2;
        if (list.isEmpty() || (a2 = g.a((Class) list.get(0).getClass())) == null) {
            return null;
        }
        return wsn.a(list, str, a2, 3);
    }

    public static List a(amfc[] amfcArr) {
        ArrayList arrayList = null;
        if (!ycm.a((Object[]) amfcArr)) {
            for (amfc amfc : amfcArr) {
                if (amfc != null) {
                    String str = amfc.e;
                    String str2 = amfc.c;
                    if ("gdataExtendedProperty".equals(str) && "android".equals(str2)) {
                        String str3 = amfc.d;
                        if (!TextUtils.isEmpty(str3)) {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                Iterator<String> keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    try {
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("mimetype", "vnd.com.google.cursor.item/contact_extended_property");
                                        contentValues.put("data1", next);
                                        contentValues.put("data2", jSONObject.getString(next));
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(contentValues);
                                    } catch (JSONException e2) {
                                    }
                                }
                            } catch (JSONException e3) {
                            }
                        }
                        return arrayList;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x05d2  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x05e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.xvs a(defpackage.amgi r37, java.lang.String r38) {
        /*
            r0 = r37
            r1 = r38
            defpackage.iva.a((java.lang.Object) r37)
            defpackage.iva.a((java.lang.Object) r38)
            amgn r2 = r0.c
            if (r2 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            amgn r2 = defpackage.amgn.f
        L_0x0011:
            aucv r2 = r2.c
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x05f6
            java.util.List r2 = defpackage.yaw.a((defpackage.amgi) r37)
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L_0x05f6
            xvr r2 = defpackage.xvs.a()
            r2.a = r1
            amgn r4 = r0.c
            if (r4 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            amgn r4 = defpackage.amgn.f
        L_0x0030:
            amfu r4 = r4.d
            if (r4 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            amfu r4 = defpackage.amfu.b
        L_0x0037:
            aucx r4 = r4.a
            int r5 = r4.size()
            r7 = 0
        L_0x003e:
            if (r7 < r5) goto L_0x0041
            goto L_0x006e
        L_0x0041:
            java.lang.Object r8 = r4.get(r7)
            amgu r8 = (defpackage.amgu) r8
            if (r8 != 0) goto L_0x004d
            r25 = 0
            goto L_0x05f2
        L_0x004d:
            java.lang.String r9 = r8.c
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L_0x05f0
            java.lang.String r4 = r8.f
            r2.b = r4
            long r4 = r8.e
            r9 = 0
            int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0067
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.d = r4
        L_0x0067:
            boolean r4 = r8.d
            if (r4 == 0) goto L_0x006e
            r2.b()
        L_0x006e:
            aucx r4 = r0.h
            aucx r5 = r0.g
            aucx r7 = r0.j
            aucx r9 = r0.l
            aucx r8 = r0.k
            java.util.List r14 = a((java.util.List) r8, (java.lang.String) r1)
            aucx r8 = r0.x
            java.util.List r15 = a((java.util.List) r8, (java.lang.String) r1)
            aucx r8 = r0.s
            java.util.List r16 = a((java.util.List) r8, (java.lang.String) r1)
            java.util.List r17 = a((java.util.List) r5, (java.lang.String) r1)
            aucx r8 = r0.r
            java.util.List r18 = a((java.util.List) r8, (java.lang.String) r1)
            aucx r8 = r0.z
            java.util.List r19 = a((java.util.List) r8, (java.lang.String) r1)
            aucx r8 = r0.t
            java.util.List r20 = a((java.util.List) r8, (java.lang.String) r1)
            aucx r8 = r0.C
            java.util.List r21 = a((java.util.List) r8, (java.lang.String) r1)
            aucx r8 = r0.v
            java.util.List r22 = a((java.util.List) r8, (java.lang.String) r1)
            r8 = 3
            java.util.List[] r10 = new java.util.List[r8]
            wsn r11 = g
            if (r4 != 0) goto L_0x00b6
            amzy r11 = defpackage.amzy.h()
            goto L_0x00ef
        L_0x00b6:
            java.lang.Class<amgo> r12 = defpackage.amgo.class
            wru r11 = r11.a((java.lang.Class) r12)
            int r12 = r4.size()
            r3 = 0
            r13 = 0
        L_0x00c2:
            if (r3 >= r12) goto L_0x00ee
            java.lang.Object r24 = r4.get(r3)
            r8 = r24
            amgo r8 = (defpackage.amgo) r8
            if (r8 != 0) goto L_0x00d1
            r26 = r11
            goto L_0x00e8
        L_0x00d1:
            amgl r6 = r11.a(r8)
            boolean r26 = defpackage.wsn.a((defpackage.amgl) r6, (java.lang.String) r1)
            if (r26 == 0) goto L_0x00e6
            java.lang.String r8 = r8.c
            r26 = r11
            java.lang.String r11 = "vnd.android.cursor.item/phone_v2"
            java.util.List r13 = defpackage.wsn.a((defpackage.amgl) r6, (java.lang.String) r11, (java.lang.String) r8, (java.util.List) r13)
            goto L_0x00e8
        L_0x00e6:
            r26 = r11
        L_0x00e8:
            int r3 = r3 + 1
            r11 = r26
            r8 = 3
            goto L_0x00c2
        L_0x00ee:
            r11 = r13
        L_0x00ef:
            r3 = 0
            r10[r3] = r11
            wsn r3 = g
            if (r5 == 0) goto L_0x012c
            java.lang.Class<amfm> r6 = defpackage.amfm.class
            wru r3 = r3.a((java.lang.Class) r6)
            int r6 = r5.size()
            r8 = 0
            r11 = 0
        L_0x0102:
            if (r8 >= r6) goto L_0x012b
            java.lang.Object r12 = r5.get(r8)
            amfm r12 = (defpackage.amfm) r12
            if (r12 != 0) goto L_0x010f
            r26 = r3
            goto L_0x0126
        L_0x010f:
            amgl r13 = r3.a(r12)
            boolean r26 = defpackage.wsn.a((defpackage.amgl) r13, (java.lang.String) r1)
            if (r26 == 0) goto L_0x0124
            java.lang.String r12 = r12.c
            r26 = r3
            java.lang.String r3 = "vnd.android.cursor.item/email_v2"
            java.util.List r11 = defpackage.wsn.a((defpackage.amgl) r13, (java.lang.String) r3, (java.lang.String) r12, (java.util.List) r11)
            goto L_0x0126
        L_0x0124:
            r26 = r3
        L_0x0126:
            int r8 = r8 + 1
            r3 = r26
            goto L_0x0102
        L_0x012b:
            goto L_0x0130
        L_0x012c:
            amzy r11 = defpackage.amzy.h()
        L_0x0130:
            r3 = 1
            r10[r3] = r11
            wsn r5 = g
            if (r7 == 0) goto L_0x0165
            java.lang.Class<amgw> r6 = defpackage.amgw.class
            wru r5 = r5.a((java.lang.Class) r6)
            int r6 = r7.size()
            r8 = 0
            r11 = 0
        L_0x0143:
            if (r8 >= r6) goto L_0x0164
            java.lang.Object r12 = r7.get(r8)
            amgw r12 = (defpackage.amgw) r12
            if (r12 != 0) goto L_0x014e
            goto L_0x0160
        L_0x014e:
            amgl r13 = r5.a(r12)
            boolean r26 = defpackage.wsn.a((defpackage.amgl) r13, (java.lang.String) r1)
            if (r26 == 0) goto L_0x0160
            java.lang.String r12 = r12.c
            java.lang.String r3 = "vnd.android.cursor.item/website"
            java.util.List r11 = defpackage.wsn.a((defpackage.amgl) r13, (java.lang.String) r3, (java.lang.String) r12, (java.util.List) r11)
        L_0x0160:
            int r8 = r8 + 1
            r3 = 1
            goto L_0x0143
        L_0x0164:
            goto L_0x0169
        L_0x0165:
            amzy r11 = defpackage.amzy.h()
        L_0x0169:
            r3 = 2
            r10[r3] = r11
            java.util.List r5 = defpackage.ycm.a((java.util.List[]) r10)
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x0177
            goto L_0x0178
        L_0x0177:
            r5 = 0
        L_0x0178:
            aucx r6 = r0.q
            java.util.List r6 = a((java.util.List) r6, (java.lang.String) r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            aucx r8 = r0.y
            java.util.List r27 = a((java.util.List) r8, (java.lang.String) r1)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            aucx r8 = r0.d
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L_0x01c5
            amfz r8 = defpackage.amfz.o
            aucd r8 = r8.o()
            amgl r10 = defpackage.wsn.f(r38)
            boolean r11 = r8.c
            if (r11 == 0) goto L_0x01aa
            r8.c()
            r11 = 0
            r8.c = r11
        L_0x01aa:
            aucj r11 = r8.b
            amfz r11 = (defpackage.amfz) r11
            r10.getClass()
            r11.b = r10
            int r10 = r11.a
            r26 = 1
            r10 = r10 | 1
            r11.a = r10
            aucj r8 = r8.i()
            amfz r8 = (defpackage.amfz) r8
            amzy r8 = defpackage.amzy.a((java.lang.Object) r8)
        L_0x01c5:
            java.util.List r28 = a((java.util.List) r8, (java.lang.String) r1)
            boolean r8 = r9.isEmpty()
            if (r8 == 0) goto L_0x0218
            amgc r8 = defpackage.amgc.e
            aucd r8 = r8.o()
            boolean r10 = r8.c
            if (r10 != 0) goto L_0x01db
            r10 = 0
            goto L_0x01e1
        L_0x01db:
            r8.c()
            r10 = 0
            r8.c = r10
        L_0x01e1:
            aucj r11 = r8.b
            amgc r11 = (defpackage.amgc) r11
            r11.d = r10
            int r10 = r11.a
            r10 = r10 | 4
            r11.a = r10
            amgl r10 = defpackage.wsn.f(r38)
            boolean r11 = r8.c
            if (r11 != 0) goto L_0x01f6
            goto L_0x01fc
        L_0x01f6:
            r8.c()
            r11 = 0
            r8.c = r11
        L_0x01fc:
            aucj r11 = r8.b
            amgc r11 = (defpackage.amgc) r11
            r10.getClass()
            r11.b = r10
            int r10 = r11.a
            r26 = 1
            r10 = r10 | 1
            r11.a = r10
            aucj r8 = r8.i()
            amgc r8 = (defpackage.amgc) r8
            amzy r8 = defpackage.amzy.a((java.lang.Object) r8)
            goto L_0x0219
        L_0x0218:
            r8 = r9
        L_0x0219:
            java.util.List r29 = a((java.util.List) r8, (java.lang.String) r1)
            aucx r8 = r0.i
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L_0x0255
            amey r8 = defpackage.amey.d
            aucd r8 = r8.o()
            amgl r10 = defpackage.wsn.f(r38)
            boolean r11 = r8.c
            if (r11 != 0) goto L_0x0234
            goto L_0x023a
        L_0x0234:
            r8.c()
            r11 = 0
            r8.c = r11
        L_0x023a:
            aucj r11 = r8.b
            amey r11 = (defpackage.amey) r11
            r10.getClass()
            r11.b = r10
            int r10 = r11.a
            r26 = 1
            r10 = r10 | 1
            r11.a = r10
            aucj r8 = r8.i()
            amey r8 = (defpackage.amey) r8
            amzy r8 = defpackage.amzy.a((java.lang.Object) r8)
        L_0x0255:
            java.util.List r30 = a((java.util.List) r8, (java.lang.String) r1)
            aucx r8 = r0.m
            java.util.List r31 = a((java.util.List) r8, (java.lang.String) r1)
            java.util.List r4 = a((java.util.List) r4, (java.lang.String) r1)
            aucx r8 = r0.o
            java.util.List r32 = a((java.util.List) r8, (java.lang.String) r1)
            aucx r8 = r0.e
            r10 = 0
            amgp[] r11 = new defpackage.amgp[r10]
            java.lang.Object[] r8 = r8.toArray(r11)
            amgp[] r8 = (defpackage.amgp[]) r8
            boolean r10 = defpackage.ycm.a((java.lang.Object[]) r8)
            if (r10 != 0) goto L_0x02dc
            int r10 = r8.length
            r11 = 0
            r33 = -1
            r34 = -1
        L_0x0280:
            if (r11 >= r10) goto L_0x02cd
            r3 = r8[r11]
            r26 = 1
            int r33 = r33 + 1
            r35 = r10
            amgl r10 = r3.b
            if (r10 != 0) goto L_0x0290
            amgl r10 = defpackage.amgl.h
        L_0x0290:
            r36 = r12
            boolean r12 = r3.d
            if (r12 == 0) goto L_0x0298
            r12 = 3
            goto L_0x02c5
        L_0x0298:
            int r3 = r3.a
            r12 = 1
            r3 = r3 & r12
            if (r3 == 0) goto L_0x02c4
            int r3 = r10.c
            int r3 = defpackage.amff.a(r3)
            if (r3 != 0) goto L_0x02a8
            r12 = 3
            goto L_0x02b6
        L_0x02a8:
            r12 = 3
            if (r3 != r12) goto L_0x02b6
            java.lang.String r3 = r10.d
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x02b6
            r11 = r33
            goto L_0x02d0
        L_0x02b6:
            int r3 = r10.c
            int r3 = defpackage.amff.a(r3)
            if (r3 == 0) goto L_0x02c5
            r10 = 2
            if (r3 != r10) goto L_0x02c5
            r34 = r33
            goto L_0x02c5
        L_0x02c4:
            r12 = 3
        L_0x02c5:
            int r11 = r11 + 1
            r10 = r35
            r12 = r36
            r3 = 2
            goto L_0x0280
        L_0x02cd:
            r36 = r12
            r11 = -1
        L_0x02d0:
            if (r11 < 0) goto L_0x02d5
            r34 = r11
            goto L_0x02d9
        L_0x02d5:
            if (r34 >= 0) goto L_0x02d9
            int r3 = r8.length
            goto L_0x02de
        L_0x02d9:
            r3 = r8[r34]
            goto L_0x02df
        L_0x02dc:
            r36 = r12
        L_0x02de:
            r3 = 0
        L_0x02df:
            wsn r8 = g
            if (r3 == 0) goto L_0x0306
            int r10 = r3.a
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L_0x0306
            amgl r10 = r3.b
            if (r10 == 0) goto L_0x02ee
            goto L_0x02f0
        L_0x02ee:
            amgl r10 = defpackage.amgl.h
        L_0x02f0:
            boolean r10 = r10.g
            java.lang.Class<amgp> r11 = defpackage.amgp.class
            wru r8 = r8.a((java.lang.Class) r11)
            android.content.ContentValues r8 = r8.a((java.lang.Object) r3, (boolean) r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r10.add(r8)
            r12 = r10
            goto L_0x0307
        L_0x0306:
            r12 = 0
        L_0x0307:
            if (r3 == 0) goto L_0x0327
            int r8 = r3.a
            r10 = 1
            r8 = r8 & r10
            if (r8 == 0) goto L_0x0327
            amgl r3 = r3.b
            if (r3 == 0) goto L_0x0314
            goto L_0x0316
        L_0x0314:
            amgl r3 = defpackage.amgl.h
        L_0x0316:
            int r3 = r3.c
            int r3 = defpackage.amff.a(r3)
            if (r3 != 0) goto L_0x0320
            r3 = 0
            goto L_0x0328
        L_0x0320:
            r8 = 2
            if (r3 != r8) goto L_0x0325
            r3 = 1
            goto L_0x0328
        L_0x0325:
            r3 = 0
            goto L_0x0328
        L_0x0327:
            r3 = 0
        L_0x0328:
            aucx r8 = r0.A
            r11 = 0
            amfc[] r10 = new defpackage.amfc[r11]
            java.lang.Object[] r8 = r8.toArray(r10)
            amfc[] r8 = (defpackage.amfc[]) r8
            java.util.List r10 = a((defpackage.amfc[]) r8)
            aucx r8 = r0.p
            java.util.List r23 = a((java.util.List) r8, (java.lang.String) r1)
            aucx r8 = r0.u
            java.util.List r24 = a((java.util.List) r8, (java.lang.String) r1)
            java.util.List r1 = a((java.util.List) r7, (java.lang.String) r1)
            aucx r8 = r0.f
            aucx r7 = r0.n
            aucx r0 = r0.w
            r37 = r10
            r10 = r7
            r25 = 0
            r11 = r0
            r7 = r12
            r0 = r36
            r12 = r13
            r38 = r13
            r13 = r0
            a(r8, r9, r10, r11, r12, r13)
            boolean r8 = defpackage.ycm.a((java.util.Collection) r14)
            if (r8 != 0) goto L_0x0377
            java.util.Iterator r8 = r14.iterator()
        L_0x0367:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0377
            java.lang.Object r9 = r8.next()
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            r2.a(r9)
            goto L_0x0367
        L_0x0377:
            boolean r8 = defpackage.ycm.a((java.util.Collection) r15)
            if (r8 != 0) goto L_0x0391
            java.util.Iterator r8 = r15.iterator()
        L_0x0381:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0391
            java.lang.Object r9 = r8.next()
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            r2.b(r9)
            goto L_0x0381
        L_0x0391:
            boolean r8 = defpackage.ycm.a((java.util.Collection) r16)
            if (r8 != 0) goto L_0x03ab
            java.util.Iterator r8 = r16.iterator()
        L_0x039b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x03ab
            java.lang.Object r9 = r8.next()
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            r2.c(r9)
            goto L_0x039b
        L_0x03ab:
            boolean r8 = defpackage.ycm.a((java.util.Collection) r17)
            if (r8 != 0) goto L_0x03c5
            java.util.Iterator r8 = r17.iterator()
        L_0x03b5:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x03c5
            java.lang.Object r9 = r8.next()
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            r2.d(r9)
            goto L_0x03b5
        L_0x03c5:
            boolean r8 = defpackage.ycm.a((java.util.Collection) r18)
            if (r8 != 0) goto L_0x03df
            java.util.Iterator r8 = r18.iterator()
        L_0x03cf:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x03df
            java.lang.Object r9 = r8.next()
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            r2.e(r9)
            goto L_0x03cf
        L_0x03df:
            boolean r8 = defpackage.ycm.a((java.util.Collection) r19)
            if (r8 != 0) goto L_0x03f9
            java.util.Iterator r8 = r19.iterator()
        L_0x03e9:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x03f9
            java.lang.Object r9 = r8.next()
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            r2.g(r9)
            goto L_0x03e9
        L_0x03f9:
            boolean r8 = defpackage.ycm.a((java.util.Collection) r20)
            if (r8 != 0) goto L_0x0413
            java.util.Iterator r8 = r20.iterator()
        L_0x0403:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0413
            java.lang.Object r9 = r8.next()
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            r2.h(r9)
            goto L_0x0403
        L_0x0413:
            boolean r8 = defpackage.ycm.a((java.util.Collection) r21)
            if (r8 != 0) goto L_0x042d
            java.util.Iterator r8 = r21.iterator()
        L_0x041d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x042d
            java.lang.Object r9 = r8.next()
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            r2.i(r9)
            goto L_0x041d
        L_0x042d:
            boolean r8 = defpackage.ycm.a((java.util.Collection) r22)
            if (r8 != 0) goto L_0x0447
            java.util.Iterator r8 = r22.iterator()
        L_0x0437:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0447
            java.lang.Object r9 = r8.next()
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            r2.j(r9)
            goto L_0x0437
        L_0x0447:
            boolean r8 = defpackage.ycm.a((java.util.Collection) r5)
            if (r8 != 0) goto L_0x0460
            int r8 = r5.size()
            r9 = 0
        L_0x0452:
            if (r9 >= r8) goto L_0x0460
            java.lang.Object r10 = r5.get(r9)
            android.content.ContentValues r10 = (android.content.ContentValues) r10
            r2.k(r10)
            int r9 = r9 + 1
            goto L_0x0452
        L_0x0460:
            boolean r5 = defpackage.ycm.a((java.util.Collection) r6)
            if (r5 != 0) goto L_0x047a
            java.util.Iterator r5 = r6.iterator()
        L_0x046a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x047a
            java.lang.Object r6 = r5.next()
            android.content.ContentValues r6 = (android.content.ContentValues) r6
            r2.l(r6)
            goto L_0x046a
        L_0x047a:
            boolean r5 = defpackage.ycm.a((java.util.Collection) r38)
            if (r5 != 0) goto L_0x0495
            int r5 = r38.size()
            r6 = 0
        L_0x0485:
            if (r6 >= r5) goto L_0x0495
            r8 = r38
            java.lang.Object r9 = r8.get(r6)
            android.content.ContentValues r9 = (android.content.ContentValues) r9
            r2.m(r9)
            int r6 = r6 + 1
            goto L_0x0485
        L_0x0495:
            boolean r5 = defpackage.ycm.a((java.util.Collection) r27)
            if (r5 != 0) goto L_0x04af
            java.util.Iterator r5 = r27.iterator()
        L_0x049f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x04af
            java.lang.Object r6 = r5.next()
            android.content.ContentValues r6 = (android.content.ContentValues) r6
            r2.n(r6)
            goto L_0x049f
        L_0x04af:
            boolean r5 = defpackage.ycm.a((java.util.Collection) r0)
            if (r5 != 0) goto L_0x04c8
            int r5 = r0.size()
            r6 = 0
        L_0x04ba:
            if (r6 >= r5) goto L_0x04c8
            java.lang.Object r8 = r0.get(r6)
            android.content.ContentValues r8 = (android.content.ContentValues) r8
            r2.o(r8)
            int r6 = r6 + 1
            goto L_0x04ba
        L_0x04c8:
            boolean r0 = defpackage.ycm.a((java.util.Collection) r28)
            if (r0 != 0) goto L_0x04e2
            java.util.Iterator r0 = r28.iterator()
        L_0x04d2:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x04e2
            java.lang.Object r5 = r0.next()
            android.content.ContentValues r5 = (android.content.ContentValues) r5
            r2.p(r5)
            goto L_0x04d2
        L_0x04e2:
            boolean r0 = defpackage.ycm.a((java.util.Collection) r29)
            if (r0 != 0) goto L_0x04fc
            java.util.Iterator r0 = r29.iterator()
        L_0x04ec:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x04fc
            java.lang.Object r5 = r0.next()
            android.content.ContentValues r5 = (android.content.ContentValues) r5
            r2.q(r5)
            goto L_0x04ec
        L_0x04fc:
            boolean r0 = defpackage.ycm.a((java.util.Collection) r30)
            if (r0 != 0) goto L_0x0516
            java.util.Iterator r0 = r30.iterator()
        L_0x0506:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0516
            java.lang.Object r5 = r0.next()
            android.content.ContentValues r5 = (android.content.ContentValues) r5
            r2.r(r5)
            goto L_0x0506
        L_0x0516:
            boolean r0 = defpackage.ycm.a((java.util.Collection) r31)
            if (r0 != 0) goto L_0x0530
            java.util.Iterator r0 = r31.iterator()
        L_0x0520:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0530
            java.lang.Object r5 = r0.next()
            android.content.ContentValues r5 = (android.content.ContentValues) r5
            r2.s(r5)
            goto L_0x0520
        L_0x0530:
            boolean r0 = defpackage.ycm.a((java.util.Collection) r4)
            if (r0 != 0) goto L_0x054a
            java.util.Iterator r0 = r4.iterator()
        L_0x053a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x054a
            java.lang.Object r4 = r0.next()
            android.content.ContentValues r4 = (android.content.ContentValues) r4
            r2.t(r4)
            goto L_0x053a
        L_0x054a:
            boolean r0 = defpackage.ycm.a((java.util.Collection) r32)
            if (r0 != 0) goto L_0x0564
            java.util.Iterator r0 = r32.iterator()
        L_0x0554:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0564
            java.lang.Object r4 = r0.next()
            android.content.ContentValues r4 = (android.content.ContentValues) r4
            r2.v(r4)
            goto L_0x0554
        L_0x0564:
            boolean r0 = defpackage.ycm.a((java.util.Collection) r7)
            if (r0 != 0) goto L_0x057d
            int r0 = r7.size()
            r4 = 0
        L_0x056f:
            if (r4 >= r0) goto L_0x057d
            java.lang.Object r5 = r7.get(r4)
            android.content.ContentValues r5 = (android.content.ContentValues) r5
            r2.u(r5)
            int r4 = r4 + 1
            goto L_0x056f
        L_0x057d:
            boolean r0 = defpackage.ycm.a((java.util.Collection) r37)
            if (r0 != 0) goto L_0x0598
            int r0 = r37.size()
            r6 = 0
        L_0x0588:
            if (r6 >= r0) goto L_0x0598
            r4 = r37
            java.lang.Object r5 = r4.get(r6)
            android.content.ContentValues r5 = (android.content.ContentValues) r5
            r2.f(r5)
            int r6 = r6 + 1
            goto L_0x0588
        L_0x0598:
            boolean r0 = defpackage.ycm.a((java.util.Collection) r23)
            if (r0 != 0) goto L_0x05b2
            java.util.Iterator r0 = r23.iterator()
        L_0x05a2:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x05b2
            java.lang.Object r4 = r0.next()
            android.content.ContentValues r4 = (android.content.ContentValues) r4
            r2.w(r4)
            goto L_0x05a2
        L_0x05b2:
            boolean r0 = defpackage.ycm.a((java.util.Collection) r24)
            if (r0 != 0) goto L_0x05cc
            java.util.Iterator r0 = r24.iterator()
        L_0x05bc:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x05cc
            java.lang.Object r4 = r0.next()
            android.content.ContentValues r4 = (android.content.ContentValues) r4
            r2.x(r4)
            goto L_0x05bc
        L_0x05cc:
            boolean r0 = defpackage.ycm.a((java.util.Collection) r1)
            if (r0 != 0) goto L_0x05e6
            java.util.Iterator r0 = r1.iterator()
        L_0x05d6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05e6
            java.lang.Object r1 = r0.next()
            android.content.ContentValues r1 = (android.content.ContentValues) r1
            r2.y(r1)
            goto L_0x05d6
        L_0x05e6:
            if (r3 == 0) goto L_0x05eb
            r0 = 1
            r2.j = r0
        L_0x05eb:
            xvs r0 = r2.a()
            return r0
        L_0x05f0:
            r25 = 0
        L_0x05f2:
            int r7 = r7 + 1
            goto L_0x003e
        L_0x05f6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwy.a(amgi, java.lang.String):xvs");
    }

    public static xvu a(avlc avlc) {
        String str;
        long j;
        if (avlc != null) {
            int a2 = avlb.a(avlc.f);
            int i = 2;
            if (a2 != 0 && a2 != 2) {
                anaf anaf = f;
                int a3 = avlb.a(avlc.f);
                if (a3 != 0) {
                    i = a3;
                }
                babj babj = (babj) anaf.get(Integer.valueOf(i - 1));
                if (babj == null) {
                    babj = babj.d;
                }
                xdt.b("FSA2_ProtoToPeopleUtil", "Server error: %s", babj);
                throw new babk(babj);
            } else if ((avlc.a & 8) != 0) {
                avkw avkw = avlc.d;
                if (avkw == null) {
                    avkw = avkw.g;
                }
                if ((avkw.a & 1) != 0) {
                    avkx avkx = avkw.b;
                    if (avkx == null) {
                        avkx = avkx.c;
                    }
                    if (!avkx.b.isEmpty()) {
                        avkx avkx2 = avkw.b;
                        if (avkx2 == null) {
                            avkx2 = avkx.c;
                        }
                        String str2 = avkx2.b;
                        avlf avlf = avkw.f;
                        if (avlf == null) {
                            avlf = avlf.c;
                        }
                        int a4 = avle.a(avlf.b);
                        String str3 = null;
                        if (a4 == 0) {
                            str = null;
                        } else if (a4 == 3) {
                            str = (String) e.get(str2);
                            if (str == null) {
                                xdt.b("FSA2_ProtoToPeopleUtil", "Unexpected system group {id=%s}", str2);
                                throw new xxy(5);
                            }
                        } else {
                            str = null;
                        }
                        if (avkw.e.size() != 0) {
                            aucx aucx = avkw.e;
                            int size = aucx.size();
                            int i2 = 0;
                            while (i2 < size) {
                                int a5 = avku.a(((avkv) aucx.get(i2)).a);
                                if (a5 == 0) {
                                    a5 = 1;
                                }
                                i2++;
                                if (a5 == 2) {
                                    c(avlc);
                                    xvt r = xvu.r();
                                    r.d = str2;
                                    r.b(true);
                                    return r.a();
                                }
                            }
                        }
                        c(avlc);
                        if ((4 & avkw.a) != 0) {
                            avlg avlg = avkw.d;
                            if (avlg == null) {
                                avlg = avlg.b;
                            }
                            j = avlg.a;
                        } else {
                            j = 0;
                        }
                        String str4 = avlc.e;
                        if ((2 & avkw.a) != 0) {
                            avky avky = avkw.c;
                            if (avky == null) {
                                avky = avky.d;
                            }
                            if (avky.c.isEmpty()) {
                                avky avky2 = avkw.c;
                                if (avky2 == null) {
                                    avky2 = avky.d;
                                }
                                str3 = avky2.b;
                            } else {
                                avky avky3 = avkw.c;
                                if (avky3 == null) {
                                    avky3 = avky.d;
                                }
                                str3 = avky3.c;
                            }
                        }
                        boolean equals = "Starred in Android".equals(str3);
                        if (str != null || (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3))) {
                            xvt r2 = xvu.r();
                            r2.d = str2;
                            r2.g = str4;
                            r2.f = str3;
                            if (str != null) {
                                r2.e = str;
                                r2.e(true);
                                if ("6".equals(str2)) {
                                    r2.a(true);
                                }
                            }
                            if (equals) {
                                r2.d(true);
                                r2.e(true);
                            }
                            if (j != 0) {
                                r2.c = Long.valueOf(j);
                            }
                            return r2.a();
                        }
                        xdt.b("FSA2_ProtoToPeopleUtil", "Invalid group (contact group with no title or etag {id=%s}", str2);
                        throw new xxy(6);
                    }
                    xdt.b("FSA2_ProtoToPeopleUtil", "Group with empty result.id.id - %s", avlc.c);
                    throw new xxy(4);
                }
                xdt.b("FSA2_ProtoToPeopleUtil", "Group with no result.id - %s", avlc.c);
                throw new xxy(3);
            } else {
                xdt.b("FSA2_ProtoToPeopleUtil", "Group returned no result - %s", avlc.c);
                throw new xxy(2);
            }
        } else {
            Log.e("FSA2_ProtoToPeopleUtil", "Server returned null API group");
            throw new xxy(1);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.util.List r16, java.util.List r17, java.util.List r18, java.util.List r19, java.util.List r20, java.util.List r21) {
        /*
            boolean r0 = r16.isEmpty()
            if (r0 == 0) goto L_0x001a
            boolean r0 = r17.isEmpty()
            if (r0 == 0) goto L_0x001a
            boolean r0 = r18.isEmpty()
            if (r0 == 0) goto L_0x001a
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            return
        L_0x001a:
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            boolean r0 = r16.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x0041
            r0 = r16
            java.lang.Object r0 = r0.get(r2)
            amft r0 = (defpackage.amft) r0
            java.lang.String r0 = r0.c
            anaf r3 = a
            java.lang.Object r0 = r3.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x003b
            goto L_0x0041
        L_0x003b:
            java.lang.String r3 = "data3"
            r1.put(r3, r0)
        L_0x0041:
            int r0 = r17.size()
            r3 = 0
        L_0x0046:
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 >= r0) goto L_0x0082
            r8 = r17
            java.lang.Object r9 = r8.get(r3)
            amgc r9 = (defpackage.amgc) r9
            int r10 = r9.d
            int r10 = defpackage.amgb.a(r10)
            if (r10 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r10 = 1
        L_0x005e:
            java.lang.String r9 = r9.c
            if (r10 != r7) goto L_0x0063
        L_0x0062:
            goto L_0x007f
        L_0x0063:
            int r10 = r10 + -1
            if (r10 == r6) goto L_0x007a
            if (r10 == r5) goto L_0x0073
            if (r10 == r4) goto L_0x006c
            goto L_0x0062
        L_0x006c:
            java.lang.String r4 = "data4"
            r1.put(r4, r9)
            goto L_0x007f
        L_0x0073:
            java.lang.String r4 = "data10"
            r1.put(r4, r9)
            goto L_0x007f
        L_0x007a:
            java.lang.String r4 = "data5"
            r1.put(r4, r9)
        L_0x007f:
            int r3 = r3 + 1
            goto L_0x0046
        L_0x0082:
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x0097
            r0 = r18
            java.lang.Object r0 = r0.get(r2)
            amgd r0 = (defpackage.amgd) r0
            java.lang.String r0 = r0.c
            java.lang.String r3 = "data7"
            r1.put(r3, r0)
        L_0x0097:
            int r3 = r19.size()
            r8 = 0
        L_0x009c:
            java.lang.String r0 = "mimetype"
            if (r8 >= r3) goto L_0x019f
            r9 = r19
            java.lang.Object r10 = r9.get(r8)
            amgh r10 = (defpackage.amgh) r10
            java.lang.String r11 = r10.d
            java.lang.String r10 = r10.c
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x00b6
            r12 = r20
            goto L_0x019a
        L_0x00b6:
            int r12 = r11.hashCode()
            r13 = 5
            switch(r12) {
                case -1867885268: goto L_0x00f1;
                case -1717893136: goto L_0x00e7;
                case -1165461084: goto L_0x00dd;
                case 364087249: goto L_0x00d3;
                case 564403871: goto L_0x00c9;
                case 1062559946: goto L_0x00bf;
                default: goto L_0x00be;
            }
        L_0x00be:
            goto L_0x00fb
        L_0x00bf:
            java.lang.String r12 = "mileage"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00fb
            r12 = 2
            goto L_0x00fc
        L_0x00c9:
            java.lang.String r12 = "sensitivity"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00fb
            r12 = 4
            goto L_0x00fc
        L_0x00d3:
            java.lang.String r12 = "billinginformation"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00fb
            r12 = 0
            goto L_0x00fc
        L_0x00dd:
            java.lang.String r12 = "priority"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00fb
            r12 = 3
            goto L_0x00fc
        L_0x00e7:
            java.lang.String r12 = "directoryserver"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00fb
            r12 = 1
            goto L_0x00fc
        L_0x00f1:
            java.lang.String r12 = "subject"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00fb
            r12 = 5
            goto L_0x00fc
        L_0x00fb:
            r12 = -1
        L_0x00fc:
            java.lang.String r14 = "data1"
            if (r12 == 0) goto L_0x0195
            java.lang.String r15 = "data2"
            if (r12 == r7) goto L_0x018f
            if (r12 == r6) goto L_0x0187
            java.lang.String r6 = "FSA2_ProtoToPeopleUtil"
            if (r12 == r5) goto L_0x0164
            if (r12 == r4) goto L_0x0141
            if (r12 == r13) goto L_0x0139
            anaf r6 = b
            java.lang.Object r6 = r6.get(r11)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x0136
            int r6 = r6.intValue()
            android.content.ContentValues r11 = new android.content.ContentValues
            r11.<init>()
            java.lang.String r12 = "vnd.com.google.cursor.item/contact_jot"
            r11.put(r0, r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r11.put(r15, r0)
            defpackage.wso.a((android.content.ContentValues) r11, (java.lang.String) r14, (java.lang.String) r10)
            r12 = r20
            r12.add(r11)
            goto L_0x019a
        L_0x0136:
            r12 = r20
            goto L_0x019a
        L_0x0139:
            r12 = r20
            java.lang.String r0 = "data11"
            r1.put(r0, r10)
            goto L_0x019a
        L_0x0141:
            r12 = r20
            byte r0 = java.lang.Byte.parseByte(r10)     // Catch:{ NumberFormatException -> 0x0159 }
            java.lang.String r11 = "data9"
            anaf r13 = d     // Catch:{ NumberFormatException -> 0x0159 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0159 }
            java.lang.Object r0 = r13.get(r0)     // Catch:{ NumberFormatException -> 0x0159 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ NumberFormatException -> 0x0159 }
            r1.put(r11, r0)     // Catch:{ NumberFormatException -> 0x0159 }
            goto L_0x019a
        L_0x0159:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r2] = r10
            java.lang.String r10 = "Getting sensitivity value from %s failed"
            defpackage.xdt.b(r6, r10, r0)
            goto L_0x019a
        L_0x0164:
            r12 = r20
            byte r0 = java.lang.Byte.parseByte(r10)     // Catch:{ NumberFormatException -> 0x017c }
            java.lang.String r11 = "data8"
            anaf r13 = c     // Catch:{ NumberFormatException -> 0x017c }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ NumberFormatException -> 0x017c }
            java.lang.Object r0 = r13.get(r0)     // Catch:{ NumberFormatException -> 0x017c }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ NumberFormatException -> 0x017c }
            r1.put(r11, r0)     // Catch:{ NumberFormatException -> 0x017c }
            goto L_0x019a
        L_0x017c:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r2] = r10
            java.lang.String r10 = "Getting priority value from %s failed"
            defpackage.xdt.b(r6, r10, r0)
            goto L_0x019a
        L_0x0187:
            r12 = r20
            java.lang.String r0 = "data6"
            r1.put(r0, r10)
            goto L_0x019a
        L_0x018f:
            r12 = r20
            r1.put(r15, r10)
            goto L_0x019a
        L_0x0195:
            r12 = r20
            r1.put(r14, r10)
        L_0x019a:
            int r8 = r8 + 1
            r6 = 2
            goto L_0x009c
        L_0x019f:
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x01af
            java.lang.String r2 = "vnd.com.google.cursor.item/contact_misc"
            r1.put(r0, r2)
            r2 = r21
            r2.add(r1)
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwy.a(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void");
    }
}
