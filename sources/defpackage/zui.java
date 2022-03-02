package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: zui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zui extends zty {
    public static final zsg e = zsg.a("ContactsLogger");
    public static final String[] f = {"contact_id", "times_contacted", "last_time_contacted"};
    private static final String[] k = {"contact_id", "lookup"};
    private static final String[] l = {"raw_contact_id", "contact_id", "display_name", "data1", "data3", "last_time_used", "times_used"};
    private static final String[] m = {"raw_contact_id", "contact_id", "display_name", "data1", "data3", "last_time_used", "times_used", "is_super_primary"};
    public final ztj g;
    public final boolean h;
    public final amri i;
    public zsp j;
    private final amsv n;
    private final ztj o;

    static {
        anaf.a("vnd.android.cursor.item/vnd.com.whatsapp.profile", avdc.WHATSAPP_PROFILE, "vnd.android.cursor.item/vnd.com.whatsapp.voip.call", avdc.WHATSAPP_VOIP_CALL, "vnd.android.cursor.item/vnd.com.whatsapp.video.call", avdc.WHATSAPP_VIDEO_CALL, "vnd.android.cursor.item/vnd.jp.naver.line.android.profile", avdc.LINE_PROFILE);
        anab anab = new anab();
        anab.a("data1", avdj.DATA1);
        anab.a("data2", avdj.DATA2);
        anab.a("data3", avdj.DATA3);
        anab.a("data4", avdj.DATA4);
        anab.a("data5", avdj.DATA5);
        anab.a("data6", avdj.DATA6);
        anab.a("data7", avdj.DATA7);
        anab.a("data8", avdj.DATA8);
        anab.a("data9", avdj.DATA9);
        anab.a("data10", avdj.DATA10);
        anab.a("data11", avdj.DATA11);
        anab.a("data12", avdj.DATA12);
        anab.a("data13", avdj.DATA13);
        anab.a("data14", avdj.DATA14);
        anab.a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zui(Context context, zuk zuk) {
        super(context, new zve(context), new zsc(context), azdq.f() ? ztk.a(context, "CL_C") : new ztj(context, "CL_C"));
        this.n = new zug(context, zuk);
        if (azdq.f()) {
            this.o = ztk.a(context, "CL_DM");
            this.g = ztk.a(context, "LB_C");
        } else {
            this.o = new ztj(context, "CL_DM");
            this.g = new ztj(context, "LB_C");
        }
        boolean g2 = azdq.g();
        this.h = g2;
        if (g2) {
            this.j = new zsp(5);
        }
        this.i = azdw.b() ? amri.b(new zth(context)) : ampu.a;
    }

    static final String a(Cursor cursor, String str) {
        if (azdw.c()) {
            return cursor.getString(cursor.getColumnIndex(str));
        }
        return null;
    }

    private static int b(String str, String str2) {
        if (azdq.a.a().o()) {
            return ContentResolver.getSyncAutomatically(new Account(str, "com.google"), str2) ? 2 : 3;
        }
        return 1;
    }

    private static final String c(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndex(str));
    }

    private static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
        sb.append(str);
        sb.append(" = '");
        sb.append(str2);
        sb.append('\'');
        return sb.toString();
    }

    private static final String a(String str, Collection collection) {
        return String.format(str.concat(" IN (%s)"), new Object[]{TextUtils.join(",", collection)});
    }

    private static String a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(strArr[0]);
        for (int i2 = 1; i2 < strArr.length; i2++) {
            sb.append(" AND ");
            sb.append(strArr[i2]);
        }
        return sb.toString();
    }

    private static final Integer b(Cursor cursor, String str) {
        return Integer.valueOf(cursor.getInt(cursor.getColumnIndex(str)));
    }

    private static final Set b(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        return linkedHashSet;
    }

    public static void b(String str, avdg avdg) {
        avdq avdq = ((avdi) avdg.b).f;
        if (avdq == null) {
            avdq = avdq.A;
        }
        aucd aucd = (aucd) avdq.c(5);
        aucd.a((aucj) avdq);
        avdk avdk = (avdk) aucd;
        int b = b(str, "com.google.android.gms.people");
        if (avdk.c) {
            avdk.c();
            avdk.c = false;
        }
        avdq avdq2 = (avdq) avdk.b;
        avdq2.t = b - 1;
        avdq2.a |= 4194304;
        if (avdg.c) {
            avdg.c();
            avdg.c = false;
        }
        avdi avdi = (avdi) avdg.b;
        avdq avdq3 = (avdq) avdk.i();
        avdi avdi2 = avdi.h;
        avdq3.getClass();
        avdi.f = avdq3;
        avdi.a |= 16;
    }

    /* JADX WARNING: type inference failed for: r21v16 */
    /* JADX WARNING: type inference failed for: r21v17 */
    /* JADX WARNING: type inference failed for: r21v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02e5, code lost:
        if (r4 == null) goto L_0x0333;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02eb, code lost:
        if (r4.moveToNext() == false) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02ed, code lost:
        r5 = r4.getLong(r4.getColumnIndex(r1));
        r7 = r4.getLong(r4.getColumnIndex("data14"));
        r9 = r4.getBlob(r4.getColumnIndex("data15"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x030d, code lost:
        if (r7 == 0) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x030f, code lost:
        ((defpackage.zuh) r3.get(java.lang.Long.valueOf(r5))).p = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x031d, code lost:
        if (r9 == null) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x031f, code lost:
        ((defpackage.zuh) r3.get(java.lang.Long.valueOf(r5))).p = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x032d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x032e, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0330, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0331, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0333, code lost:
        e.c("CP2 failed to fetch photo info.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x033b, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x033e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x033f, code lost:
        r1 = r0;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0343, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0344, code lost:
        r5 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x034a, code lost:
        if (defpackage.azfa.g() != false) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x034c, code lost:
        e.e("CP2 Query Exception when fetching photo info", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x035a, code lost:
        e.a((java.lang.Throwable) r5, "CP2 Query Exception when fetching photo info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0361, code lost:
        if (r4 == null) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0363, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x036a, code lost:
        if (defpackage.azdq.l() == false) goto L_0x064e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x036c, code lost:
        r4 = new java.lang.String[]{r1, r10, "data2", "data5", "data3", "data10", "data4", "data6", "data7", "data8", "data9"};
        r5 = new java.lang.String[]{r1, r10, "data2", "data5", "data3", "data10", "data4", "data6", "data7", "data8", "data9", "data11"};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03e0, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03e2, code lost:
        r5 = android.os.Build.VERSION.SDK_INT;
        r14 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03e6, code lost:
        r14 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03e7, code lost:
        r17 = null;
        r6 = r11.a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, r14, a(a(r1, (java.util.Collection) r3.keySet()), a("mimetype", "vnd.android.cursor.item/name")), (java.lang.String[]) null, (java.lang.String) null);
        r21 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0415, code lost:
        if (r6 == null) goto L_0x0601;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0417, code lost:
        r21 = r21;
        r21 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x041b, code lost:
        if (r6.moveToNext() == false) goto L_0x05f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x041d, code lost:
        r4 = java.lang.Long.valueOf(r6.getLong(r6.getColumnIndex(r1)));
        r5 = c(r6, r10);
        r7 = c(r6, "data2");
        r8 = c(r6, "data3");
        r9 = c(r6, "data4");
        r12 = c(r6, "data5");
        r13 = c(r6, "data6");
        r14 = c(r6, "data7");
        r15 = c(r6, "data8");
        r39 = r1;
        r1 = c(r6, "data9");
        r16 = android.os.Build.VERSION.SDK_INT;
        r16 = r10;
        r10 = b(r6, "data10");
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0471, code lost:
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0475, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x0484;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0479, code lost:
        r21 = r21;
        r21 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        r18 = b(r6, "data11");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x047e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x047f, code lost:
        r1 = r0;
        r21 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        r2 = defpackage.avea.m.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x048a, code lost:
        if (r5 == null) goto L_0x04ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x048e, code lost:
        if (r2.c != false) goto L_0x0491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0491, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0497, code lost:
        r11 = (defpackage.avea) r2.b;
        r5.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x049e, code lost:
        r21 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        r11.a |= 1;
        r11.b = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04ab, code lost:
        r21 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04ad, code lost:
        if (r7 == null) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04b1, code lost:
        if (r2.c != false) goto L_0x04b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04b4, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04ba, code lost:
        r5 = (defpackage.avea) r2.b;
        r7.getClass();
        r5.a |= 2;
        r5.c = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04cb, code lost:
        if (r8 == null) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04cf, code lost:
        if (r2.c != false) goto L_0x04d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04d2, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04d8, code lost:
        r5 = (defpackage.avea) r2.b;
        r8.getClass();
        r5.a |= 4;
        r5.d = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04e9, code lost:
        if (r9 == null) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04ed, code lost:
        if (r2.c != false) goto L_0x04f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f0, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f6, code lost:
        r5 = (defpackage.avea) r2.b;
        r9.getClass();
        r5.a |= 8;
        r5.e = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0505, code lost:
        if (r12 == null) goto L_0x0521;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0509, code lost:
        if (r2.c != false) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x050c, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0512, code lost:
        r5 = (defpackage.avea) r2.b;
        r12.getClass();
        r5.a |= 16;
        r5.f = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0521, code lost:
        if (r13 == null) goto L_0x053d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0525, code lost:
        if (r2.c != false) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0528, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x052e, code lost:
        r5 = (defpackage.avea) r2.b;
        r13.getClass();
        r5.a |= 32;
        r5.g = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x053d, code lost:
        if (r14 == null) goto L_0x0559;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0541, code lost:
        if (r2.c != false) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0544, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x054a, code lost:
        r5 = (defpackage.avea) r2.b;
        r14.getClass();
        r5.a |= 64;
        r5.h = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0559, code lost:
        if (r15 == null) goto L_0x0575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x055d, code lost:
        if (r2.c != false) goto L_0x0560;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0560, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0566, code lost:
        r5 = (defpackage.avea) r2.b;
        r15.getClass();
        r5.a |= 128;
        r5.i = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0575, code lost:
        if (r1 == null) goto L_0x0592;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0579, code lost:
        if (r2.c != false) goto L_0x057c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x057c, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0583, code lost:
        r5 = (defpackage.avea) r2.b;
        r1.getClass();
        r5.a |= com.google.android.gms.org.conscrypt.PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        r5.j = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0596, code lost:
        if (r10.intValue() == 0) goto L_0x05b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0598, code lost:
        r1 = r10.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x059e, code lost:
        if (r2.c != false) goto L_0x05a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05a1, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05a7, code lost:
        r5 = (defpackage.avea) r2.b;
        r5.a |= 512;
        r5.k = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05b7, code lost:
        if (r18.intValue() != 0) goto L_0x05ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05ba, code lost:
        r1 = r18.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05c0, code lost:
        if (r2.c != false) goto L_0x05c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05c3, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05c9, code lost:
        r5 = (defpackage.avea) r2.b;
        r5.a |= 1024;
        r5.l = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05d5, code lost:
        ((defpackage.zuh) r3.get(r4)).o = (defpackage.avea) r2.i();
        r11 = r38;
        r1 = r39;
        r10 = r16;
        r2 = r17;
        r6 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05f1, code lost:
        r17 = r2;
        r21 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05f6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05f7, code lost:
        r21 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05f9, code lost:
        r1 = r0;
        r21 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05fc, code lost:
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05fe, code lost:
        r21 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0601, code lost:
        r17 = r2;
        r21 = r6;
        e.c("CP2 failed to fetch Note info.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x060c, code lost:
        if (r21 == null) goto L_0x0650;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x060e, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0612, code lost:
        r0 = th;
        r21 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0614, code lost:
        r6 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0617, code lost:
        r21 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0618, code lost:
        r6 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x061b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x061c, code lost:
        r1 = r0;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0620, code lost:
        r17 = r2;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0627, code lost:
        if (defpackage.azfa.g() != false) goto L_0x0639;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0629, code lost:
        e.e("ReadContacts", "ContentResolver.query threw an exception when fetching structured name info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0639, code lost:
        e.d("ContentResolver.query threw an exception when fetching structured name info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0640, code lost:
        if (r6 != null) goto L_0x0642;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0642, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0646, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0647, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0648, code lost:
        if (r6 != null) goto L_0x064a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x064a, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x064d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x064e, code lost:
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0650, code lost:
        defpackage.azeh.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0654, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0655, code lost:
        r1 = r0;
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0657, code lost:
        if (r6 != null) goto L_0x0659;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0659, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x065c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x065d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x065e, code lost:
        r1 = r0;
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0660, code lost:
        if (r6 != null) goto L_0x0662;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0662, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0665, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:?, code lost:
        return r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01b3, code lost:
        if (r7 == null) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01e1, code lost:
        if (r7 == null) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01e3, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ea, code lost:
        if (r3.isEmpty() != false) goto L_0x0666;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ec, code lost:
        r1 = "raw_contact_id";
        r10 = "data1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0209, code lost:
        r11 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r4 = r11.a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, new java.lang.String[]{r1, r10}, a(a(r1, (java.util.Collection) r3.keySet()), a("mimetype", "vnd.android.cursor.item/note")), (java.lang.String[]) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x022b, code lost:
        if (r4 == null) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0231, code lost:
        if (r4.moveToNext() == false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0233, code lost:
        r5 = r4.getLong(r4.getColumnIndex(r1));
        r7 = r4.getColumnIndex(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0243, code lost:
        if (r4.isNull(r7) != false) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0245, code lost:
        r7 = r4.getString(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0254, code lost:
        if (((long) r7.length()) > defpackage.azdq.d()) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0256, code lost:
        ((defpackage.zuh) r3.get(java.lang.Long.valueOf(r5))).n = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0263, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0264, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0266, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0267, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0269, code lost:
        e.c("CP2 failed to fetch Note info.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0270, code lost:
        if (r4 != null) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0273, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0276, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0278, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x027a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x027b, code lost:
        r11 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x027d, code lost:
        r1 = r0;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0281, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0282, code lost:
        r11 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0284, code lost:
        r5 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x028a, code lost:
        if (defpackage.azfa.g() == false) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x028c, code lost:
        e.e("CP2 Query Exception when fetching note info", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x029a, code lost:
        e.a((java.lang.Throwable) r5, "CP2 Query Exception when fetching note info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a1, code lost:
        if (r4 != null) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a3, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r4 = r11.a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, new java.lang.String[]{r1, "data14", "data15"}, a(a(r1, (java.util.Collection) r3.keySet()), a("mimetype", "vnd.android.cursor.item/photo")), (java.lang.String[]) null, (java.lang.String) null);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x034c A[Catch:{ all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x035a A[Catch:{ all -> 0x0654 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0629 A[Catch:{ all -> 0x0646 }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0639 A[Catch:{ all -> 0x0646 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0642  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x064a  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0659  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0662  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x066e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01cc A[Catch:{ all -> 0x0669 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01da A[Catch:{ all -> 0x0669 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x028c A[Catch:{ all -> 0x065d }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x029a A[Catch:{ all -> 0x065d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map a(java.util.List r39) {
        /*
            r38 = this;
            r1 = r38
            int r2 = defpackage.zud.b
            java.util.HashMap r2 = defpackage.anet.a()
            java.util.HashMap r3 = defpackage.anet.a()
            boolean r4 = defpackage.azdw.c()
            if (r4 == 0) goto L_0x001a
            boolean r4 = defpackage.azdz.b()
            if (r4 == 0) goto L_0x001a
            r4 = 1
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            boolean r7 = defpackage.azdw.c()
            java.lang.String r8 = "starred"
            java.lang.String r9 = "last_time_contacted"
            java.lang.String r10 = "times_contacted"
            java.lang.String r11 = "data_set"
            java.lang.String r12 = "sourceid"
            java.lang.String r13 = "account_name"
            java.lang.String r14 = "account_type"
            java.lang.String r15 = "_id"
            r16 = 7
            r17 = 6
            r18 = 5
            java.lang.String r5 = "contact_id"
            r20 = 8
            if (r7 != 0) goto L_0x0059
            r7 = 9
            java.lang.String[] r6 = new java.lang.String[r7]
            r7 = 0
            r6[r7] = r15
            r7 = 1
            r6[r7] = r5
            r7 = 2
            r6[r7] = r14
            r7 = 3
            r6[r7] = r13
            r7 = 4
            r6[r7] = r12
            r6[r18] = r11
            r6[r17] = r10
            r6[r16] = r9
            r6[r20] = r8
            r25 = r6
            goto L_0x00ca
        L_0x0059:
            if (r4 == 0) goto L_0x0095
            r6 = 14
            java.lang.String[] r6 = new java.lang.String[r6]
            r7 = 0
            r6[r7] = r15
            r7 = 1
            r6[r7] = r5
            r7 = 2
            r6[r7] = r14
            r7 = 3
            r6[r7] = r13
            r7 = 4
            r6[r7] = r12
            r6[r18] = r11
            r6[r17] = r10
            r6[r16] = r9
            r6[r20] = r8
            java.lang.String r7 = "sync1"
            r21 = 9
            r6[r21] = r7
            r7 = 10
            java.lang.String r22 = "sync2"
            r6[r7] = r22
            r7 = 11
            java.lang.String r22 = "sync3"
            r6[r7] = r22
            r7 = 12
            java.lang.String r22 = "sync4"
            r6[r7] = r22
            r7 = 13
            java.lang.String r22 = "dirty"
            r6[r7] = r22
            goto L_0x00c8
        L_0x0095:
            r6 = 13
            java.lang.String[] r6 = new java.lang.String[r6]
            r7 = 0
            r6[r7] = r15
            r7 = 1
            r6[r7] = r5
            r7 = 2
            r6[r7] = r14
            r7 = 3
            r6[r7] = r13
            r7 = 4
            r6[r7] = r12
            r6[r18] = r11
            r6[r17] = r10
            r6[r16] = r9
            r6[r20] = r8
            java.lang.String r7 = "sync1"
            r21 = 9
            r6[r21] = r7
            r7 = 10
            java.lang.String r22 = "sync2"
            r6[r7] = r22
            r7 = 11
            java.lang.String r22 = "sync3"
            r6[r7] = r22
            r7 = 12
            java.lang.String r22 = "sync4"
            r6[r7] = r22
        L_0x00c8:
            r25 = r6
        L_0x00ca:
            android.content.Context r7 = r1.a     // Catch:{ SQLiteException -> 0x01c3, all -> 0x01be }
            android.content.ContentResolver r23 = r7.getContentResolver()     // Catch:{ SQLiteException -> 0x01c3, all -> 0x01be }
            android.net.Uri r24 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ SQLiteException -> 0x01c3, all -> 0x01be }
            r7 = r39
            java.lang.String r26 = a((java.lang.String) r5, (java.util.Collection) r7)     // Catch:{ SQLiteException -> 0x01c3, all -> 0x01be }
            r27 = 0
            r28 = 0
            android.database.Cursor r7 = r23.query(r24, r25, r26, r27, r28)     // Catch:{ SQLiteException -> 0x01c3, all -> 0x01be }
            if (r7 != 0) goto L_0x00eb
            zsg r4 = e     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            java.lang.String r5 = "CP2 failed to fetch RawContacts."
            r4.c(r5)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            goto L_0x01b3
        L_0x00eb:
            boolean r22 = defpackage.azdq.e()     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
        L_0x00ef:
            boolean r23 = r7.moveToNext()     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            if (r23 == 0) goto L_0x01b3
            zuh r6 = new zuh     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            int r1 = r7.getColumnIndex(r15)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            long r24 = r7.getLong(r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            java.lang.Long r25 = java.lang.Long.valueOf(r24)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            int r1 = r7.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            java.lang.String r26 = r7.getString(r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            int r1 = r7.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            java.lang.String r27 = r7.getString(r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            int r1 = r7.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            java.lang.String r28 = r7.getString(r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            int r1 = r7.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            java.lang.String r29 = r7.getString(r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            if (r22 != 0) goto L_0x012e
            int r1 = r7.getColumnIndex(r10)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            long r30 = r7.getLong(r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            goto L_0x0130
        L_0x012e:
            r30 = 0
        L_0x0130:
            java.lang.Long r30 = java.lang.Long.valueOf(r30)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            if (r22 != 0) goto L_0x013f
            int r1 = r7.getColumnIndex(r9)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            long r31 = r7.getLong(r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            goto L_0x0141
        L_0x013f:
            r31 = 0
        L_0x0141:
            java.lang.Long r31 = java.lang.Long.valueOf(r31)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            int r1 = r7.getColumnIndex(r8)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            int r32 = r7.getInt(r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            java.lang.String r1 = "sync1"
            java.lang.String r33 = a((android.database.Cursor) r7, (java.lang.String) r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            java.lang.String r1 = "sync2"
            java.lang.String r34 = a((android.database.Cursor) r7, (java.lang.String) r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            java.lang.String r1 = "sync3"
            java.lang.String r35 = a((android.database.Cursor) r7, (java.lang.String) r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            java.lang.String r1 = "sync4"
            java.lang.String r36 = a((android.database.Cursor) r7, (java.lang.String) r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            if (r4 == 0) goto L_0x0179
            java.lang.String r1 = "dirty"
            int r1 = r7.getColumnIndex(r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            int r1 = r7.getInt(r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            if (r1 != 0) goto L_0x0176
            r37 = 0
            goto L_0x017b
        L_0x0176:
            r37 = 1
            goto L_0x017b
        L_0x0179:
            r37 = 0
        L_0x017b:
            r24 = r6
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            java.lang.Long r1 = r6.a     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            r3.put(r1, r6)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            int r1 = r7.getColumnIndex(r5)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            long r24 = r7.getLong(r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r24)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            boolean r24 = r2.containsKey(r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            if (r24 != 0) goto L_0x01a2
            r24 = r4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            r2.put(r1, r4)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            goto L_0x01a4
        L_0x01a2:
            r24 = r4
        L_0x01a4:
            java.lang.Object r1 = r2.get(r1)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            r1.add(r6)     // Catch:{ SQLiteException -> 0x01bb, all -> 0x01b6 }
            r1 = r38
            r4 = r24
            goto L_0x00ef
        L_0x01b3:
            if (r7 != 0) goto L_0x01e3
            goto L_0x01e6
        L_0x01b6:
            r0 = move-exception
            r1 = r0
            r6 = r7
            goto L_0x066c
        L_0x01bb:
            r0 = move-exception
            r1 = r0
            goto L_0x01c6
        L_0x01be:
            r0 = move-exception
            r1 = r0
            r6 = 0
            goto L_0x066c
        L_0x01c3:
            r0 = move-exception
            r1 = r0
            r7 = 0
        L_0x01c6:
            boolean r4 = defpackage.azfa.g()     // Catch:{ all -> 0x0669 }
            if (r4 != 0) goto L_0x01da
            zsg r4 = e     // Catch:{ all -> 0x0669 }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0669 }
            r5 = 0
            r6[r5] = r1     // Catch:{ all -> 0x0669 }
            java.lang.String r1 = "CP2 Query Exception when fetching raw-contacts."
            r4.e(r1, r6)     // Catch:{ all -> 0x0669 }
            goto L_0x01e1
        L_0x01da:
            zsg r4 = e     // Catch:{ all -> 0x0669 }
            java.lang.String r5 = "CP2 Query Exception when fetching raw-contacts."
            r4.a((java.lang.Throwable) r1, (java.lang.String) r5)     // Catch:{ all -> 0x0669 }
        L_0x01e1:
            if (r7 == 0) goto L_0x01e6
        L_0x01e3:
            r7.close()
        L_0x01e6:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0666
            r1 = 2
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.String r1 = "raw_contact_id"
            r4 = 0
            r6[r4] = r1
            java.lang.String r10 = "data1"
            r4 = 1
            r6[r4] = r10
            java.util.Set r4 = r3.keySet()     // Catch:{ SQLiteException -> 0x0281, all -> 0x027a }
            java.lang.String r4 = a((java.lang.String) r1, (java.util.Collection) r4)     // Catch:{ SQLiteException -> 0x0281, all -> 0x027a }
            java.lang.String r5 = "mimetype"
            java.lang.String r7 = "vnd.android.cursor.item/note"
            java.lang.String r5 = a((java.lang.String) r5, (java.lang.String) r7)     // Catch:{ SQLiteException -> 0x0281, all -> 0x027a }
            r11 = r38
            android.content.Context r7 = r11.a     // Catch:{ SQLiteException -> 0x0278, all -> 0x0276 }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ SQLiteException -> 0x0278, all -> 0x0276 }
            android.net.Uri r8 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ SQLiteException -> 0x0278, all -> 0x0276 }
            r9 = 2
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0278, all -> 0x0276 }
            r9 = 0
            r12[r9] = r4     // Catch:{ SQLiteException -> 0x0278, all -> 0x0276 }
            r4 = 1
            r12[r4] = r5     // Catch:{ SQLiteException -> 0x0278, all -> 0x0276 }
            java.lang.String r9 = a((java.lang.String[]) r12)     // Catch:{ SQLiteException -> 0x0278, all -> 0x0276 }
            r12 = 0
            r13 = 0
            r4 = r7
            r5 = r8
            r7 = r9
            r8 = r12
            r9 = r13
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0278, all -> 0x0276 }
            if (r4 == 0) goto L_0x0269
        L_0x022d:
            boolean r5 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0266, all -> 0x0263 }
            if (r5 == 0) goto L_0x0270
            int r5 = r4.getColumnIndex(r1)     // Catch:{ SQLiteException -> 0x0266, all -> 0x0263 }
            long r5 = r4.getLong(r5)     // Catch:{ SQLiteException -> 0x0266, all -> 0x0263 }
            int r7 = r4.getColumnIndex(r10)     // Catch:{ SQLiteException -> 0x0266, all -> 0x0263 }
            boolean r8 = r4.isNull(r7)     // Catch:{ SQLiteException -> 0x0266, all -> 0x0263 }
            if (r8 != 0) goto L_0x022d
            java.lang.String r7 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x0266, all -> 0x0263 }
            int r8 = r7.length()     // Catch:{ SQLiteException -> 0x0266, all -> 0x0263 }
            long r8 = (long) r8     // Catch:{ SQLiteException -> 0x0266, all -> 0x0263 }
            long r12 = defpackage.azdq.d()     // Catch:{ SQLiteException -> 0x0266, all -> 0x0263 }
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x022d
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x0266, all -> 0x0263 }
            java.lang.Object r5 = r3.get(r5)     // Catch:{ SQLiteException -> 0x0266, all -> 0x0263 }
            zuh r5 = (defpackage.zuh) r5     // Catch:{ SQLiteException -> 0x0266, all -> 0x0263 }
            r5.n = r7     // Catch:{ SQLiteException -> 0x0266, all -> 0x0263 }
            goto L_0x022d
        L_0x0263:
            r0 = move-exception
            r1 = r0
            goto L_0x0273
        L_0x0266:
            r0 = move-exception
            r5 = r0
            goto L_0x0286
        L_0x0269:
            zsg r5 = e     // Catch:{ SQLiteException -> 0x0266, all -> 0x0263 }
            java.lang.String r6 = "CP2 failed to fetch Note info."
            r5.c(r6)     // Catch:{ SQLiteException -> 0x0266, all -> 0x0263 }
        L_0x0270:
            if (r4 != 0) goto L_0x02a3
            goto L_0x02a6
        L_0x0273:
            r6 = r4
            goto L_0x0660
        L_0x0276:
            r0 = move-exception
            goto L_0x027d
        L_0x0278:
            r0 = move-exception
            goto L_0x0284
        L_0x027a:
            r0 = move-exception
            r11 = r38
        L_0x027d:
            r1 = r0
            r6 = 0
            goto L_0x0660
        L_0x0281:
            r0 = move-exception
            r11 = r38
        L_0x0284:
            r5 = r0
            r4 = 0
        L_0x0286:
            boolean r6 = defpackage.azfa.g()     // Catch:{ all -> 0x065d }
            if (r6 != 0) goto L_0x029a
            zsg r6 = e     // Catch:{ all -> 0x065d }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x065d }
            r7 = 0
            r8[r7] = r5     // Catch:{ all -> 0x065d }
            java.lang.String r5 = "CP2 Query Exception when fetching note info"
            r6.e(r5, r8)     // Catch:{ all -> 0x065d }
            goto L_0x02a1
        L_0x029a:
            zsg r6 = e     // Catch:{ all -> 0x065d }
            java.lang.String r7 = "CP2 Query Exception when fetching note info"
            r6.a((java.lang.Throwable) r5, (java.lang.String) r7)     // Catch:{ all -> 0x065d }
        L_0x02a1:
            if (r4 == 0) goto L_0x02a6
        L_0x02a3:
            r4.close()
        L_0x02a6:
            r4 = 3
            java.lang.String[] r5 = new java.lang.String[r4]
            r4 = 0
            r5[r4] = r1
            java.lang.String r4 = "data14"
            r6 = 1
            r5[r6] = r4
            java.lang.String r4 = "data15"
            r6 = 2
            r5[r6] = r4
            java.util.Set r4 = r3.keySet()     // Catch:{ SQLiteException -> 0x0343, all -> 0x033e }
            java.lang.String r4 = a((java.lang.String) r1, (java.util.Collection) r4)     // Catch:{ SQLiteException -> 0x0343, all -> 0x033e }
            java.lang.String r6 = "mimetype"
            java.lang.String r7 = "vnd.android.cursor.item/photo"
            java.lang.String r6 = a((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ SQLiteException -> 0x0343, all -> 0x033e }
            android.content.Context r7 = r11.a     // Catch:{ SQLiteException -> 0x0343, all -> 0x033e }
            android.content.ContentResolver r24 = r7.getContentResolver()     // Catch:{ SQLiteException -> 0x0343, all -> 0x033e }
            android.net.Uri r25 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ SQLiteException -> 0x0343, all -> 0x033e }
            r7 = 2
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x0343, all -> 0x033e }
            r7 = 0
            r8[r7] = r4     // Catch:{ SQLiteException -> 0x0343, all -> 0x033e }
            r4 = 1
            r8[r4] = r6     // Catch:{ SQLiteException -> 0x0343, all -> 0x033e }
            java.lang.String r27 = a((java.lang.String[]) r8)     // Catch:{ SQLiteException -> 0x0343, all -> 0x033e }
            r28 = 0
            r29 = 0
            r26 = r5
            android.database.Cursor r4 = r24.query(r25, r26, r27, r28, r29)     // Catch:{ SQLiteException -> 0x0343, all -> 0x033e }
            if (r4 == 0) goto L_0x0333
        L_0x02e7:
            boolean r5 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            if (r5 == 0) goto L_0x0363
            int r5 = r4.getColumnIndex(r1)     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            long r5 = r4.getLong(r5)     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            java.lang.String r7 = "data14"
            int r7 = r4.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            long r7 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            java.lang.String r9 = "data15"
            int r9 = r4.getColumnIndex(r9)     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            byte[] r9 = r4.getBlob(r9)     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            r12 = 0
            int r14 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x031d
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            java.lang.Object r5 = r3.get(r5)     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            zuh r5 = (defpackage.zuh) r5     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            r6 = 4
            r5.p = r6     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            goto L_0x02e7
        L_0x031d:
            if (r9 == 0) goto L_0x02e7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            java.lang.Object r5 = r3.get(r5)     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            zuh r5 = (defpackage.zuh) r5     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            r6 = 3
            r5.p = r6     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            goto L_0x02e7
        L_0x032d:
            r0 = move-exception
            r1 = r0
            goto L_0x033b
        L_0x0330:
            r0 = move-exception
            r5 = r0
            goto L_0x0346
        L_0x0333:
            zsg r5 = e     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            java.lang.String r6 = "CP2 failed to fetch photo info."
            r5.c(r6)     // Catch:{ SQLiteException -> 0x0330, all -> 0x032d }
            goto L_0x0366
        L_0x033b:
            r6 = r4
            goto L_0x0657
        L_0x033e:
            r0 = move-exception
            r1 = r0
            r6 = 0
            goto L_0x0657
        L_0x0343:
            r0 = move-exception
            r5 = r0
            r4 = 0
        L_0x0346:
            boolean r6 = defpackage.azfa.g()     // Catch:{ all -> 0x0654 }
            if (r6 != 0) goto L_0x035a
            zsg r6 = e     // Catch:{ all -> 0x0654 }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0654 }
            r7 = 0
            r8[r7] = r5     // Catch:{ all -> 0x0654 }
            java.lang.String r5 = "CP2 Query Exception when fetching photo info"
            r6.e(r5, r8)     // Catch:{ all -> 0x0654 }
            goto L_0x0361
        L_0x035a:
            zsg r6 = e     // Catch:{ all -> 0x0654 }
            java.lang.String r7 = "CP2 Query Exception when fetching photo info"
            r6.a((java.lang.Throwable) r5, (java.lang.String) r7)     // Catch:{ all -> 0x0654 }
        L_0x0361:
            if (r4 == 0) goto L_0x0366
        L_0x0363:
            r4.close()
        L_0x0366:
            boolean r4 = defpackage.azdq.l()
            if (r4 == 0) goto L_0x064e
            r4 = 11
            java.lang.String[] r4 = new java.lang.String[r4]
            r5 = 0
            r4[r5] = r1
            r5 = 1
            r4[r5] = r10
            java.lang.String r5 = "data2"
            r6 = 2
            r4[r6] = r5
            java.lang.String r5 = "data5"
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "data3"
            r6 = 4
            r4[r6] = r5
            java.lang.String r5 = "data10"
            r4[r18] = r5
            java.lang.String r5 = "data4"
            r4[r17] = r5
            java.lang.String r5 = "data6"
            r4[r16] = r5
            java.lang.String r5 = "data7"
            r4[r20] = r5
            java.lang.String r5 = "data8"
            r6 = 9
            r4[r6] = r5
            r5 = 10
            java.lang.String r6 = "data9"
            r4[r5] = r6
            r5 = 12
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = 0
            r5[r6] = r1
            r6 = 1
            r5[r6] = r10
            java.lang.String r6 = "data2"
            r7 = 2
            r5[r7] = r6
            java.lang.String r6 = "data5"
            r7 = 3
            r5[r7] = r6
            java.lang.String r6 = "data3"
            r7 = 4
            r5[r7] = r6
            java.lang.String r6 = "data10"
            r5[r18] = r6
            java.lang.String r6 = "data4"
            r5[r17] = r6
            java.lang.String r6 = "data6"
            r5[r16] = r6
            java.lang.String r6 = "data7"
            r5[r20] = r6
            java.lang.String r6 = "data8"
            r7 = 9
            r5[r7] = r6
            r6 = 10
            java.lang.String r7 = "data9"
            r5[r6] = r7
            r6 = 11
            java.lang.String r7 = "data11"
            r5[r6] = r7
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x061f, all -> 0x061b }
            r7 = 24
            if (r6 >= r7) goto L_0x03e6
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x061f, all -> 0x061b }
            r14 = r4
            goto L_0x03e7
        L_0x03e6:
            r14 = r5
        L_0x03e7:
            java.util.Set r4 = r3.keySet()     // Catch:{ SQLiteException -> 0x061f, all -> 0x061b }
            java.lang.String r4 = a((java.lang.String) r1, (java.util.Collection) r4)     // Catch:{ SQLiteException -> 0x061f, all -> 0x061b }
            java.lang.String r5 = "mimetype"
            java.lang.String r6 = "vnd.android.cursor.item/name"
            java.lang.String r5 = a((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ SQLiteException -> 0x061f, all -> 0x061b }
            android.content.Context r6 = r11.a     // Catch:{ SQLiteException -> 0x061f, all -> 0x061b }
            android.content.ContentResolver r12 = r6.getContentResolver()     // Catch:{ SQLiteException -> 0x061f, all -> 0x061b }
            android.net.Uri r13 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ SQLiteException -> 0x061f, all -> 0x061b }
            r6 = 2
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x061f, all -> 0x061b }
            r6 = 0
            r7[r6] = r4     // Catch:{ SQLiteException -> 0x061f, all -> 0x061b }
            r4 = 1
            r7[r4] = r5     // Catch:{ SQLiteException -> 0x061f, all -> 0x061b }
            java.lang.String r15 = a((java.lang.String[]) r7)     // Catch:{ SQLiteException -> 0x061f, all -> 0x061b }
            r16 = 0
            r17 = 0
            android.database.Cursor r6 = r12.query(r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x061f, all -> 0x061b }
            if (r6 == 0) goto L_0x0601
        L_0x0417:
            boolean r4 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            if (r4 == 0) goto L_0x05f1
            int r4 = r6.getColumnIndex(r1)     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            long r4 = r6.getLong(r4)     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            java.lang.String r5 = c(r6, r10)     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            java.lang.String r7 = "data2"
            java.lang.String r7 = c(r6, r7)     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            java.lang.String r8 = "data3"
            java.lang.String r8 = c(r6, r8)     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            java.lang.String r9 = "data4"
            java.lang.String r9 = c(r6, r9)     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            java.lang.String r12 = "data5"
            java.lang.String r12 = c(r6, r12)     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            java.lang.String r13 = "data6"
            java.lang.String r13 = c(r6, r13)     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            java.lang.String r14 = "data7"
            java.lang.String r14 = c(r6, r14)     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            java.lang.String r15 = "data8"
            java.lang.String r15 = c(r6, r15)     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            r39 = r1
            java.lang.String r1 = "data9"
            java.lang.String r1 = c(r6, r1)     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            int r16 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            r16 = r10
            java.lang.String r10 = "data10"
            java.lang.Integer r10 = b((android.database.Cursor) r6, (java.lang.String) r10)     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            r17 = 0
            java.lang.Integer r18 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x05fb, all -> 0x05f6 }
            r17 = r2
            r2 = 24
            if (r11 < r2) goto L_0x0484
            java.lang.String r2 = "data11"
            java.lang.Integer r18 = b((android.database.Cursor) r6, (java.lang.String) r2)     // Catch:{ SQLiteException -> 0x05ef, all -> 0x047e }
            goto L_0x0484
        L_0x047e:
            r0 = move-exception
            r1 = r0
            r21 = r6
            goto L_0x0614
        L_0x0484:
            avea r2 = defpackage.avea.m     // Catch:{ SQLiteException -> 0x05ef, all -> 0x05f6 }
            aucd r2 = r2.o()     // Catch:{ SQLiteException -> 0x05ef, all -> 0x05f6 }
            if (r5 == 0) goto L_0x04ab
            boolean r11 = r2.c     // Catch:{ SQLiteException -> 0x05ef, all -> 0x05f6 }
            if (r11 != 0) goto L_0x0491
            goto L_0x0497
        L_0x0491:
            r2.c()     // Catch:{ SQLiteException -> 0x05ef, all -> 0x05f6 }
            r11 = 0
            r2.c = r11     // Catch:{ SQLiteException -> 0x05ef, all -> 0x05f6 }
        L_0x0497:
            aucj r11 = r2.b     // Catch:{ SQLiteException -> 0x05ef, all -> 0x05f6 }
            avea r11 = (defpackage.avea) r11     // Catch:{ SQLiteException -> 0x05ef, all -> 0x05f6 }
            r5.getClass()     // Catch:{ SQLiteException -> 0x05ef, all -> 0x05f6 }
            r21 = r6
            int r6 = r11.a     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r19 = 1
            r6 = r6 | 1
            r11.a = r6     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r11.b = r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            goto L_0x04ad
        L_0x04ab:
            r21 = r6
        L_0x04ad:
            if (r7 == 0) goto L_0x04ca
            boolean r5 = r2.c     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            if (r5 != 0) goto L_0x04b4
            goto L_0x04ba
        L_0x04b4:
            r2.c()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5 = 0
            r2.c = r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x04ba:
            aucj r5 = r2.b     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            avea r5 = (defpackage.avea) r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r7.getClass()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            int r6 = r5.a     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r11 = 2
            r6 = r6 | r11
            r5.a = r6     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5.c = r7     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            goto L_0x04cb
        L_0x04ca:
            r11 = 2
        L_0x04cb:
            if (r8 == 0) goto L_0x04e8
            boolean r5 = r2.c     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            if (r5 != 0) goto L_0x04d2
            goto L_0x04d8
        L_0x04d2:
            r2.c()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5 = 0
            r2.c = r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x04d8:
            aucj r5 = r2.b     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            avea r5 = (defpackage.avea) r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r8.getClass()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            int r6 = r5.a     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r7 = 4
            r6 = r6 | r7
            r5.a = r6     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5.d = r8     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            goto L_0x04e9
        L_0x04e8:
            r7 = 4
        L_0x04e9:
            if (r9 == 0) goto L_0x0505
            boolean r5 = r2.c     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            if (r5 != 0) goto L_0x04f0
            goto L_0x04f6
        L_0x04f0:
            r2.c()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5 = 0
            r2.c = r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x04f6:
            aucj r5 = r2.b     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            avea r5 = (defpackage.avea) r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r9.getClass()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            int r6 = r5.a     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r6 = r6 | 8
            r5.a = r6     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5.e = r9     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x0505:
            if (r12 == 0) goto L_0x0521
            boolean r5 = r2.c     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            if (r5 != 0) goto L_0x050c
            goto L_0x0512
        L_0x050c:
            r2.c()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5 = 0
            r2.c = r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x0512:
            aucj r5 = r2.b     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            avea r5 = (defpackage.avea) r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r12.getClass()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            int r6 = r5.a     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r6 = r6 | 16
            r5.a = r6     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5.f = r12     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x0521:
            if (r13 == 0) goto L_0x053d
            boolean r5 = r2.c     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            if (r5 != 0) goto L_0x0528
            goto L_0x052e
        L_0x0528:
            r2.c()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5 = 0
            r2.c = r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x052e:
            aucj r5 = r2.b     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            avea r5 = (defpackage.avea) r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r13.getClass()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            int r6 = r5.a     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r6 = r6 | 32
            r5.a = r6     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5.g = r13     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x053d:
            if (r14 == 0) goto L_0x0559
            boolean r5 = r2.c     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            if (r5 != 0) goto L_0x0544
            goto L_0x054a
        L_0x0544:
            r2.c()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5 = 0
            r2.c = r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x054a:
            aucj r5 = r2.b     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            avea r5 = (defpackage.avea) r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r14.getClass()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            int r6 = r5.a     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r6 = r6 | 64
            r5.a = r6     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5.h = r14     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x0559:
            if (r15 == 0) goto L_0x0575
            boolean r5 = r2.c     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            if (r5 != 0) goto L_0x0560
            goto L_0x0566
        L_0x0560:
            r2.c()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5 = 0
            r2.c = r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x0566:
            aucj r5 = r2.b     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            avea r5 = (defpackage.avea) r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r15.getClass()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            int r6 = r5.a     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r6 = r6 | 128(0x80, float:1.794E-43)
            r5.a = r6     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5.i = r15     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x0575:
            if (r1 == 0) goto L_0x0592
            boolean r5 = r2.c     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            if (r5 != 0) goto L_0x057c
        L_0x057b:
            goto L_0x0583
        L_0x057c:
            r2.c()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5 = 0
            r2.c = r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            goto L_0x057b
        L_0x0583:
            aucj r5 = r2.b     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            avea r5 = (defpackage.avea) r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r1.getClass()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            int r6 = r5.a     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r6 = r6 | 256(0x100, float:3.59E-43)
            r5.a = r6     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5.j = r1     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x0592:
            int r1 = r10.intValue()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            if (r1 == 0) goto L_0x05b3
            int r1 = r10.intValue()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            boolean r5 = r2.c     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            if (r5 != 0) goto L_0x05a1
            goto L_0x05a7
        L_0x05a1:
            r2.c()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5 = 0
            r2.c = r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x05a7:
            aucj r5 = r2.b     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            avea r5 = (defpackage.avea) r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            int r6 = r5.a     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r6 = r6 | 512(0x200, float:7.175E-43)
            r5.a = r6     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5.k = r1     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x05b3:
            int r1 = r18.intValue()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            if (r1 != 0) goto L_0x05ba
            goto L_0x05d5
        L_0x05ba:
            int r1 = r18.intValue()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            boolean r5 = r2.c     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            if (r5 != 0) goto L_0x05c3
            goto L_0x05c9
        L_0x05c3:
            r2.c()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5 = 0
            r2.c = r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x05c9:
            aucj r5 = r2.b     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            avea r5 = (defpackage.avea) r5     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            int r6 = r5.a     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r6 = r6 | 1024(0x400, float:1.435E-42)
            r5.a = r6     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r5.l = r1     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x05d5:
            java.lang.Object r1 = r3.get(r4)     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            zuh r1 = (defpackage.zuh) r1     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            aucj r2 = r2.i()     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            avea r2 = (defpackage.avea) r2     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r1.o = r2     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            r11 = r38
            r1 = r39
            r10 = r16
            r2 = r17
            r6 = r21
            goto L_0x0417
        L_0x05ef:
            r0 = move-exception
            goto L_0x05fe
        L_0x05f1:
            r17 = r2
            r21 = r6
            goto L_0x060c
        L_0x05f6:
            r0 = move-exception
            r21 = r6
        L_0x05f9:
            r1 = r0
            goto L_0x0614
        L_0x05fb:
            r0 = move-exception
            r17 = r2
        L_0x05fe:
            r21 = r6
            goto L_0x0618
        L_0x0601:
            r17 = r2
            r21 = r6
            zsg r1 = e     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
            java.lang.String r2 = "CP2 failed to fetch Note info."
            r1.c(r2)     // Catch:{ SQLiteException -> 0x0617, all -> 0x0612 }
        L_0x060c:
            if (r21 == 0) goto L_0x0650
            r21.close()
            goto L_0x0650
        L_0x0612:
            r0 = move-exception
            goto L_0x05f9
        L_0x0614:
            r6 = r21
            goto L_0x0648
        L_0x0617:
            r0 = move-exception
        L_0x0618:
            r6 = r21
            goto L_0x0623
        L_0x061b:
            r0 = move-exception
            r1 = r0
            r6 = 0
            goto L_0x0648
        L_0x061f:
            r0 = move-exception
            r17 = r2
            r6 = 0
        L_0x0623:
            boolean r1 = defpackage.azfa.g()     // Catch:{ all -> 0x0646 }
            if (r1 != 0) goto L_0x0639
            zsg r1 = e     // Catch:{ all -> 0x0646 }
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0646 }
            java.lang.String r3 = "ContentResolver.query threw an exception when fetching structured name info"
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x0646 }
            java.lang.String r3 = "ReadContacts"
            r1.e(r3, r2)     // Catch:{ all -> 0x0646 }
            goto L_0x0640
        L_0x0639:
            zsg r1 = e     // Catch:{ all -> 0x0646 }
            java.lang.String r2 = "ContentResolver.query threw an exception when fetching structured name info"
            r1.d(r2)     // Catch:{ all -> 0x0646 }
        L_0x0640:
            if (r6 == 0) goto L_0x0650
            r6.close()
            goto L_0x0650
        L_0x0646:
            r0 = move-exception
            r1 = r0
        L_0x0648:
            if (r6 == 0) goto L_0x064d
            r6.close()
        L_0x064d:
            throw r1
        L_0x064e:
            r17 = r2
        L_0x0650:
            defpackage.azeh.c()
            goto L_0x0668
        L_0x0654:
            r0 = move-exception
            r1 = r0
            r6 = r4
        L_0x0657:
            if (r6 == 0) goto L_0x065c
            r6.close()
        L_0x065c:
            throw r1
        L_0x065d:
            r0 = move-exception
            r1 = r0
            r6 = r4
        L_0x0660:
            if (r6 == 0) goto L_0x0665
            r6.close()
        L_0x0665:
            throw r1
        L_0x0666:
            r17 = r2
        L_0x0668:
            return r17
        L_0x0669:
            r0 = move-exception
            r1 = r0
            r6 = r7
        L_0x066c:
            if (r6 == 0) goto L_0x0671
            r6.close()
        L_0x0671:
            goto L_0x0673
        L_0x0672:
            throw r1
        L_0x0673:
            goto L_0x0672
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zui.a(java.util.List):java.util.Map");
    }

    public static void b(Set set, avdg avdg) {
        if (!set.isEmpty()) {
            if (avdg.c) {
                avdg.c();
                avdg.c = false;
            }
            avdi avdi = avdi.h;
            ((avdi) avdg.b).d = aucj.r();
        }
    }

    public static void a(String str, avdg avdg) {
        avdq avdq = ((avdi) avdg.b).f;
        if (avdq == null) {
            avdq = avdq.A;
        }
        aucd aucd = (aucd) avdq.c(5);
        aucd.a((aucj) avdq);
        avdk avdk = (avdk) aucd;
        if (azdq.a.a().p()) {
            boolean a = azfe.a.a().a();
            if (avdk.c) {
                avdk.c();
                avdk.c = false;
            }
            avdq avdq2 = (avdq) avdk.b;
            avdq2.a |= 8388608;
            avdq2.u = a;
        }
        int b = b(str, "com.android.contacts");
        if (avdk.c) {
            avdk.c();
            avdk.c = false;
        }
        avdq avdq3 = (avdq) avdk.b;
        avdq3.s = b - 1;
        avdq3.a |= 2097152;
        if (avdg.c) {
            avdg.c();
            avdg.c = false;
        }
        avdi avdi = (avdi) avdg.b;
        avdq avdq4 = (avdq) avdk.i();
        avdi avdi2 = avdi.h;
        avdq4.getClass();
        avdi.f = avdq4;
        avdi.a |= 16;
    }

    public static void a(Set set, avdg avdg) {
        if (!set.isEmpty()) {
            aucx aucx = ((avdi) avdg.i()).b;
            int size = aucx.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                avdf avdf = (avdf) aucx.get(i2);
                aucd aucd = (aucd) avdf.c(5);
                aucd.a((aucj) avdf);
                avdd avdd = (avdd) aucd;
                aucx aucx2 = avdf.k;
                int size2 = aucx2.size();
                int i4 = 0;
                int i5 = 0;
                while (i4 < size2) {
                    int i6 = i5 + 1;
                    avdz avdz = (avdz) aucx2.get(i4);
                    aucd aucd2 = (aucd) avdz.c(5);
                    aucd2.a((aucj) avdz);
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    avdz avdz2 = (avdz) aucd2.b;
                    avdz avdz3 = avdz.r;
                    "".getClass();
                    avdz2.a |= 128;
                    avdz2.f = "";
                    if (avdd.c) {
                        avdd.c();
                        avdd.c = false;
                    }
                    avdf avdf2 = (avdf) avdd.b;
                    avdz avdz4 = (avdz) aucd2.i();
                    avdf avdf3 = avdf.q;
                    avdz4.getClass();
                    avdf2.g();
                    avdf2.k.set(i5, avdz4);
                    i4++;
                    i5 = i6;
                }
                avdg.a(i3, avdd);
                i2++;
                i3++;
            }
        }
    }

    public static void a(boolean z, boolean z2, avdg avdg) {
        avdq avdq = ((avdi) avdg.b).f;
        if (avdq == null) {
            avdq = avdq.A;
        }
        aucd aucd = (aucd) avdq.c(5);
        aucd.a((aucj) avdq);
        avdk avdk = (avdk) aucd;
        if (avdk.c) {
            avdk.c();
            avdk.c = false;
        }
        avdq avdq2 = (avdq) avdk.b;
        int i2 = avdq2.a | 128;
        avdq2.a = i2;
        avdq2.h = z;
        avdq2.a = i2 | 64;
        avdq2.g = z2;
        if (avdg.c) {
            avdg.c();
            avdg.c = false;
        }
        avdi avdi = (avdi) avdg.b;
        avdq avdq3 = (avdq) avdk.i();
        avdi avdi2 = avdi.h;
        avdq3.getClass();
        avdi.f = avdq3;
        avdi.a |= 16;
    }

    private static avdt[] a(aqxt[] aqxtArr) {
        avdt[] avdtArr = new avdt[aqxtArr.length];
        for (int i2 = 0; i2 < aqxtArr.length; i2++) {
            aqxt aqxt = aqxtArr[i2];
            aucd o2 = avdt.n.o();
            long j2 = aqxt.a;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avdt avdt = (avdt) o2.b;
            int i3 = avdt.a | 1;
            avdt.a = i3;
            avdt.b = j2;
            String str = aqxt.b;
            str.getClass();
            int i4 = i3 | 2;
            avdt.a = i4;
            avdt.c = str;
            String str2 = aqxt.c;
            str2.getClass();
            int i5 = i4 | 4;
            avdt.a = i5;
            avdt.d = str2;
            String str3 = aqxt.d;
            str3.getClass();
            int i6 = i5 | 8;
            avdt.a = i6;
            avdt.e = str3;
            String str4 = aqxt.e;
            str4.getClass();
            int i7 = i6 | 16;
            avdt.a = i7;
            avdt.f = str4;
            boolean z = aqxt.f;
            int i8 = i7 | 32;
            avdt.a = i8;
            avdt.g = z;
            boolean z2 = aqxt.g;
            int i9 = i8 | 64;
            avdt.a = i9;
            avdt.h = z2;
            boolean z3 = aqxt.h;
            int i10 = i9 | 128;
            avdt.a = i10;
            avdt.i = z3;
            String str5 = aqxt.i;
            str5.getClass();
            int i11 = i10 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            avdt.a = i11;
            avdt.j = str5;
            String str6 = aqxt.j;
            str6.getClass();
            avdt.a = i11 | 512;
            avdt.k = str6;
            if (azec.b()) {
                boolean z4 = aqxt.k;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                avdt avdt2 = (avdt) o2.b;
                avdt2.a |= 1024;
                avdt2.l = z4;
            }
            if (azec.c()) {
                String str7 = aqxt.l;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                avdt avdt3 = (avdt) o2.b;
                str7.getClass();
                avdt3.a |= 2048;
                avdt3.m = str7;
            }
            avdtArr[i2] = (avdt) o2.i();
        }
        return avdtArr;
    }

    public final avdg a(zuk zuk) {
        aqyd aqyd;
        aucx aucx;
        int i2;
        Iterator it;
        zuk zuk2 = zuk;
        ztm b = ((zug) this.n).a();
        if (b == null) {
            return null;
        }
        int i3 = 1;
        if (azdq.m()) {
            List list = b.c;
            if ((list == null || list.size() == 0) && b.b.isEmpty()) {
                return null;
            }
            new Object[1][0] = Integer.valueOf(b.c.size());
            new Object[1][0] = Integer.valueOf(b.b.size());
            List list2 = b.c;
            Set set = b.b;
            Map map = b.d;
            aqxt[] aqxtArr = b.e;
            HashMap hashMap = new HashMap();
            int size = list2.size();
            for (int i4 = 0; i4 < size; i4++) {
                aqxx aqxx = (aqxx) list2.get(i4);
                Long valueOf = Long.valueOf(aqxx.n);
                List list3 = (List) hashMap.get(valueOf);
                if (list3 == null) {
                    list3 = new ArrayList();
                    hashMap.put(valueOf, list3);
                }
                list3.add(aqxx);
            }
            HashMap hashMap2 = new HashMap();
            String str = "com.google";
            if (this.c.a(this.a)) {
                for (Long l2 : hashMap.keySet()) {
                    List list4 = (List) hashMap.get(l2);
                    if (list4 != null) {
                        zsc zsc = new zsc(this.a);
                        Iterator it2 = list4.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                hashMap2.put(l2, list4);
                                break;
                            }
                            aqxx aqxx2 = (aqxx) it2.next();
                            if (str.equals(aqxx2.g)) {
                                if (zsc.a(aqxx2.x)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        new Object[1][0] = l2;
                    }
                }
                hashMap = hashMap2;
            }
            avdg avdg = (avdg) avdi.h.o();
            Iterator it3 = hashMap.keySet().iterator();
            while (it3.hasNext()) {
                Long l3 = (Long) it3.next();
                avdd avdd = (avdd) avdf.q.o();
                long longValue = l3.longValue();
                if (avdd.c) {
                    avdd.c();
                    avdd.c = false;
                }
                avdf avdf = (avdf) avdd.b;
                avdf.a |= i3;
                avdf.b = longValue;
                aqxp aqxp = (aqxp) map.get(l3);
                if (aqxp != null) {
                    if (azdq.k()) {
                        String str2 = ((aqxp) map.get(l3)).a;
                        if (avdd.c) {
                            avdd.c();
                            avdd.c = false;
                        }
                        avdf avdf2 = (avdf) avdd.b;
                        str2.getClass();
                        avdf2.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                        avdf2.l = str2;
                    }
                    String str3 = aqxp.b;
                    if (avdd.c) {
                        avdd.c();
                        avdd.c = false;
                    }
                    avdf avdf3 = (avdf) avdd.b;
                    str3.getClass();
                    avdf3.a |= 4;
                    avdf3.c = str3;
                }
                List<aqxx> list5 = (List) hashMap.get(l3);
                ArrayList arrayList = new ArrayList();
                for (aqxx aqxx3 : list5) {
                    aqxz aqxz = aqxx3.r;
                    if (aqxz != null) {
                        arrayList.add(aqxz.a);
                    }
                }
                if (avdd.c) {
                    avdd.c();
                    avdd.c = false;
                }
                ((avdf) avdd.b).d = aucj.s();
                avdd.a((Iterable) arrayList);
                HashMap hashMap3 = new HashMap();
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    aqxx aqxx4 = (aqxx) it4.next();
                    Iterator it5 = it3;
                    aucx aucx2 = aqxx4.e;
                    Map map2 = map;
                    int size2 = aucx2.size();
                    HashMap hashMap4 = hashMap;
                    int i5 = 0;
                    while (i5 < size2) {
                        aucx aucx3 = aucx2;
                        aqxu aqxu = (aqxu) aucx2.get(i5);
                        int i6 = size2;
                        Set set2 = (Set) hashMap3.get(aqxu.a);
                        if (set2 == null) {
                            set2 = new HashSet();
                            it = it4;
                            hashMap3.put(aqxu.a, set2);
                        } else {
                            it = it4;
                        }
                        aqxt[] aqxtArr2 = aqxtArr;
                        set2.add(Long.valueOf(aqxx4.m));
                        if (!hashSet.contains(aqxu.a)) {
                            arrayList2.add(aqxu);
                            hashSet.add(aqxu.a);
                        }
                        i5++;
                        zuk zuk3 = zuk;
                        aqxtArr = aqxtArr2;
                        size2 = i6;
                        aucx2 = aucx3;
                        it4 = it;
                    }
                    Iterator it6 = it4;
                    aqxt[] aqxtArr3 = aqxtArr;
                    zuk zuk4 = zuk;
                    it3 = it5;
                    map = map2;
                    hashMap = hashMap4;
                    it4 = it6;
                }
                aqxt[] aqxtArr4 = aqxtArr;
                Iterator it7 = it3;
                Map map3 = map;
                HashMap hashMap5 = hashMap;
                if (avdd.c) {
                    avdd.c();
                    avdd.c = false;
                }
                ((avdf) avdd.b).f = aucj.s();
                int size3 = arrayList2.size();
                int i7 = 0;
                while (i7 < size3) {
                    String str4 = str;
                    aqxt[] aqxtArr5 = aqxtArr4;
                    aqxu aqxu2 = (aqxu) arrayList2.get(i7);
                    avdu avdu = (avdu) avdv.h.o();
                    String str5 = aqxu2.a;
                    if (avdu.c) {
                        avdu.c();
                        avdu.c = false;
                    }
                    avdv avdv = (avdv) avdu.b;
                    str5.getClass();
                    int i8 = avdv.a | 1;
                    avdv.a = i8;
                    avdv.b = str5;
                    String str6 = aqxu2.b;
                    str6.getClass();
                    int i9 = i8 | 2;
                    avdv.a = i9;
                    avdv.c = str6;
                    int i10 = aqxu2.c;
                    int i11 = i9 | 4;
                    avdv.a = i11;
                    ArrayList arrayList3 = arrayList2;
                    avdv.e = (long) i10;
                    long j2 = aqxu2.d;
                    avdv.a = i11 | 8;
                    avdv.f = (j2 / 86400000) * 86400000;
                    avdu.a((Iterable) hashMap3.get(avdv.b));
                    if (azdq.i()) {
                        boolean z = aqxu2.g;
                        if (avdu.c) {
                            avdu.c();
                            avdu.c = false;
                        }
                        avdv avdv2 = (avdv) avdu.b;
                        avdv2.a |= 32;
                        avdv2.g = z;
                    }
                    avdv avdv3 = (avdv) avdu.i();
                    if (avdd.c) {
                        avdd.c();
                        avdd.c = false;
                    }
                    avdf avdf4 = (avdf) avdd.b;
                    avdv3.getClass();
                    avdf4.c();
                    avdf4.f.add(avdv3);
                    i7++;
                    aqxtArr4 = aqxtArr5;
                    str = str4;
                    arrayList2 = arrayList3;
                }
                HashMap hashMap6 = new HashMap();
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                Iterator it8 = list5.iterator();
                while (it8.hasNext()) {
                    aqxx aqxx5 = (aqxx) it8.next();
                    aucx aucx4 = aqxx5.d;
                    int size4 = aucx4.size();
                    int i12 = 0;
                    while (i12 < size4) {
                        aqxs aqxs = (aqxs) aucx4.get(i12);
                        Iterator it9 = it8;
                        Set set3 = (Set) hashMap6.get(aqxs.a);
                        if (set3 == null) {
                            set3 = new LinkedHashSet();
                            i2 = size4;
                            hashMap6.put(aqxs.a, set3);
                        } else {
                            i2 = size4;
                        }
                        aucx aucx5 = aucx4;
                        aqxt[] aqxtArr6 = aqxtArr4;
                        set3.add(Long.valueOf(aqxx5.m));
                        if (!hashSet2.contains(aqxs.a)) {
                            arrayList4.add(aqxs);
                            hashSet2.add(aqxs.a);
                        }
                        i12++;
                        aqxtArr4 = aqxtArr6;
                        it8 = it9;
                        size4 = i2;
                        aucx4 = aucx5;
                    }
                    Iterator it10 = it8;
                    aqxt[] aqxtArr7 = aqxtArr4;
                }
                aqxt[] aqxtArr8 = aqxtArr4;
                if (avdd.c) {
                    avdd.c();
                    avdd.c = false;
                }
                ((avdf) avdd.b).g = aucj.s();
                int size5 = arrayList4.size();
                int i13 = 0;
                while (i13 < size5) {
                    aqxs aqxs2 = (aqxs) arrayList4.get(i13);
                    avdr avdr = (avdr) avds.h.o();
                    String str7 = aqxs2.a;
                    if (avdr.c) {
                        avdr.c();
                        avdr.c = false;
                    }
                    avds avds = (avds) avdr.b;
                    str7.getClass();
                    int i14 = avds.a | 1;
                    avds.a = i14;
                    avds.b = str7;
                    String str8 = aqxs2.b;
                    str8.getClass();
                    int i15 = i14 | 2;
                    avds.a = i15;
                    avds.c = str8;
                    String str9 = str;
                    long j3 = aqxs2.c;
                    int i16 = i15 | 4;
                    avds.a = i16;
                    avds.e = j3;
                    long j4 = aqxs2.d;
                    avds.a = i16 | 8;
                    avds.f = (j4 / 86400000) * 86400000;
                    avdr.a((Iterable) hashMap6.get(avds.b));
                    if (azdq.i()) {
                        boolean z2 = aqxs2.g;
                        if (avdr.c) {
                            avdr.c();
                            avdr.c = false;
                        }
                        avds avds2 = (avds) avdr.b;
                        avds2.a |= 32;
                        avds2.g = z2;
                    }
                    avds avds3 = (avds) avdr.i();
                    if (avdd.c) {
                        avdd.c();
                        avdd.c = false;
                    }
                    avdf avdf5 = (avdf) avdd.b;
                    avds3.getClass();
                    avdf5.e();
                    avdf5.g.add(avds3);
                    i13++;
                    str = str9;
                }
                HashMap hashMap7 = new HashMap();
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                Iterator it11 = list5.iterator();
                while (it11.hasNext()) {
                    aqxx aqxx6 = (aqxx) it11.next();
                    aucx aucx6 = aqxx6.f;
                    int size6 = aucx6.size();
                    int i17 = 0;
                    while (i17 < size6) {
                        aqxv aqxv = (aqxv) aucx6.get(i17);
                        Iterator it12 = it11;
                        Set set4 = (Set) hashMap7.get(aqxv.a);
                        if (set4 == null) {
                            set4 = new LinkedHashSet();
                            aucx = aucx6;
                            hashMap7.put(aqxv.a, set4);
                        } else {
                            aucx = aucx6;
                        }
                        int i18 = size6;
                        set4.add(Long.valueOf(aqxx6.m));
                        if (!hashSet3.contains(aqxv.a)) {
                            arrayList5.add(aqxv);
                            hashSet3.add(aqxv.a);
                        }
                        i17++;
                        it11 = it12;
                        aucx6 = aucx;
                        size6 = i18;
                    }
                    Iterator it13 = it11;
                }
                if (avdd.c) {
                    avdd.c();
                    avdd.c = false;
                }
                ((avdf) avdd.b).h = aucj.s();
                int size7 = arrayList5.size();
                for (int i19 = 0; i19 < size7; i19++) {
                    aqxv aqxv2 = (aqxv) arrayList5.get(i19);
                    avdw avdw = (avdw) avdx.f.o();
                    String str10 = aqxv2.a;
                    if (avdw.c) {
                        avdw.c();
                        avdw.c = false;
                    }
                    avdx avdx = (avdx) avdw.b;
                    str10.getClass();
                    int i20 = avdx.a | 1;
                    avdx.a = i20;
                    avdx.b = str10;
                    String str11 = aqxv2.b;
                    str11.getClass();
                    avdx.a = i20 | 2;
                    avdx.c = str11;
                    avdw.a((Iterable) hashMap7.get(avdx.b));
                    avdx avdx2 = (avdx) avdw.i();
                    if (avdd.c) {
                        avdd.c();
                        avdd.c = false;
                    }
                    avdf avdf6 = (avdf) avdd.b;
                    avdx2.getClass();
                    avdf6.f();
                    avdf6.h.add(avdx2);
                }
                azdr.a.a();
                HashMap hashMap8 = new HashMap();
                if (avdd.c) {
                    avdd.c();
                    avdd.c = false;
                }
                ((avdf) avdd.b).k = aucj.s();
                for (int i21 = 0; i21 < list5.size(); i21++) {
                    aqxx aqxx7 = (aqxx) list5.get(i21);
                    aucd o2 = avdz.r.o();
                    long j5 = aqxx7.m;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    avdz avdz = (avdz) o2.b;
                    avdz.a |= 1;
                    avdz.b = j5;
                    if (!aqxx7.g.isEmpty()) {
                        String str12 = aqxx7.g;
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        avdz avdz2 = (avdz) o2.b;
                        str12.getClass();
                        avdz2.a |= 8;
                        avdz2.c = str12;
                        if (azdq.h()) {
                            Boolean bool = (Boolean) hashMap8.get(((avdz) o2.b).c);
                            if (bool != null) {
                                boolean booleanValue = bool.booleanValue();
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                avdz avdz3 = (avdz) o2.b;
                                avdz3.a = 32768 | avdz3.a;
                                avdz3.m = booleanValue;
                            } else {
                                boolean a = aeku.a(this.a, ((avdz) o2.b).c);
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                avdz avdz4 = (avdz) o2.b;
                                avdz4.a = 32768 | avdz4.a;
                                avdz4.m = a;
                                hashMap8.put(avdz4.c, Boolean.valueOf(a));
                            }
                        }
                    }
                    if (!aqxx7.x.isEmpty()) {
                        String str13 = aqxx7.x;
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        avdz avdz5 = (avdz) o2.b;
                        str13.getClass();
                        avdz5.a |= 16;
                        avdz5.d = str13;
                    }
                    if (!aqxx7.o.isEmpty() && ((long) aqxx7.o.length()) <= azdq.d()) {
                        String str14 = aqxx7.o;
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        avdz avdz6 = (avdz) o2.b;
                        str14.getClass();
                        avdz6.a |= 128;
                        avdz6.f = str14;
                    }
                    if (azdq.l() && (aqyd = aqxx7.c) != null) {
                        aucd o3 = avea.m.o();
                        String str15 = aqyd.a;
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        avea avea = (avea) o3.b;
                        str15.getClass();
                        int i22 = avea.a | 1;
                        avea.a = i22;
                        avea.b = str15;
                        String str16 = aqyd.b;
                        str16.getClass();
                        int i23 = i22 | 2;
                        avea.a = i23;
                        avea.c = str16;
                        String str17 = aqyd.d;
                        str17.getClass();
                        int i24 = i23 | 4;
                        avea.a = i24;
                        avea.d = str17;
                        String str18 = aqyd.f;
                        str18.getClass();
                        int i25 = i24 | 8;
                        avea.a = i25;
                        avea.e = str18;
                        String str19 = aqyd.c;
                        str19.getClass();
                        int i26 = i25 | 16;
                        avea.a = i26;
                        avea.f = str19;
                        String str20 = aqyd.g;
                        str20.getClass();
                        int i27 = i26 | 32;
                        avea.a = i27;
                        avea.g = str20;
                        String str21 = aqyd.h;
                        str21.getClass();
                        int i28 = i27 | 64;
                        avea.a = i28;
                        avea.h = str21;
                        String str22 = aqyd.i;
                        str22.getClass();
                        int i29 = i28 | 128;
                        avea.a = i29;
                        avea.i = str22;
                        String str23 = aqyd.j;
                        str23.getClass();
                        int i30 = i29 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        avea.a = i30;
                        avea.j = str23;
                        int i31 = aqyd.e;
                        int i32 = i30 | 512;
                        avea.a = i32;
                        avea.k = i31;
                        int i33 = aqyd.k;
                        avea.a = i32 | 1024;
                        avea.l = i33;
                        avea avea2 = (avea) o3.i();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        avdz avdz7 = (avdz) o2.b;
                        avea2.getClass();
                        avdz7.j = avea2;
                        avdz7.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                    }
                    if (aqxx7.s) {
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        avdz avdz8 = (avdz) o2.b;
                        avdz8.a |= 16384;
                        avdz8.l = true;
                    }
                    long j6 = (long) aqxx7.h;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    avdz avdz9 = (avdz) o2.b;
                    int i34 = avdz9.a | 1024;
                    avdz9.a = i34;
                    avdz9.h = j6;
                    long j7 = aqxx7.i;
                    avdz9.a = i34 | 2048;
                    avdz9.i = (j7 / 86400000) * 86400000;
                    if (!aqxx7.q.j()) {
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        avdz avdz10 = (avdz) o2.b;
                        avdz10.g = 3;
                        avdz10.a |= 512;
                    } else if (!aqxx7.p.j()) {
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        avdz avdz11 = (avdz) o2.b;
                        avdz11.g = 2;
                        avdz11.a |= 512;
                    } else {
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        avdz avdz12 = (avdz) o2.b;
                        avdz12.g = 1;
                        avdz12.a |= 512;
                    }
                    if (str.equals(aqxx7.g) && aqxx7.B.isEmpty() && !aqxx7.l.isEmpty()) {
                        String str24 = aqxx7.l;
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        avdz avdz13 = (avdz) o2.b;
                        str24.getClass();
                        avdz13.a |= 32;
                        avdz13.e = str24;
                    }
                    if (azdq.j()) {
                        aucv aucv = aqxx7.C;
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        avdz avdz14 = (avdz) o2.b;
                        if (!avdz14.k.a()) {
                            avdz14.k = aucj.a(avdz14.k);
                        }
                        auab.a((Iterable) aucv, (List) avdz14.k);
                    }
                    avdd.a(o2);
                }
                long j8 = (long) ((aqxx) list5.get(0)).h;
                if (avdd.c) {
                    avdd.c();
                    avdd.c = false;
                }
                avdf avdf7 = (avdf) avdd.b;
                avdf7.a |= 32;
                avdf7.i = j8;
                long j9 = ((aqxx) list5.get(0)).i;
                if (avdd.c) {
                    avdd.c();
                    avdd.c = false;
                }
                avdf avdf8 = (avdf) avdd.b;
                avdf8.a |= 64;
                avdf8.j = j9;
                avdg.a(avdd);
                zuk zuk5 = zuk;
                aqxtArr = aqxtArr8;
                it3 = it7;
                map = map3;
                hashMap = hashMap5;
                i3 = 1;
            }
            aqxt[] aqxtArr9 = aqxtArr;
            avdq a2 = zuj.a(this.a);
            aucd aucd = (aucd) a2.c(5);
            aucd.a((aucj) a2);
            avdk avdk = (avdk) aucd;
            if (azdq.j() && aqxtArr9 != null) {
                if (avdk.c) {
                    avdk.c();
                    avdk.c = false;
                }
                avdq avdq = avdq.A;
                ((avdq) avdk.b).q = aucj.s();
                avdk.a(Arrays.asList(a(aqxtArr9)));
            }
            long j10 = ((avdq) avdk.b).i;
            if (avdg.c) {
                avdg.c();
                avdg.c = false;
            }
            avdi avdi = (avdi) avdg.b;
            int i35 = avdi.a | 8;
            avdi.a = i35;
            avdi.e = j10;
            long j11 = ((avdq) avdk.b).j;
            avdi.a = i35 | 32;
            avdi.g = j11;
            avdq avdq2 = (avdq) avdk.i();
            avdq2.getClass();
            avdi.f = avdq2;
            avdi.a |= 16;
            avdg.a((Iterable) set);
            if (zuk.e) {
                if (avdg.c) {
                    avdg.c();
                    avdg.c = false;
                }
                avdi.a((avdi) avdg.b);
                aucx aucx7 = ((avdi) avdg.i()).b;
                int size8 = aucx7.size();
                int i36 = 0;
                int i37 = 0;
                while (i37 < size8) {
                    int i38 = i36 + 1;
                    avdf avdf9 = (avdf) aucx7.get(i37);
                    aucd aucd2 = (aucd) avdf9.c(5);
                    aucd2.a((aucj) avdf9);
                    avdd avdd2 = (avdd) aucd2;
                    if (avdd2.c) {
                        avdd2.c();
                        avdd2.c = false;
                    }
                    avdf.a((avdf) avdd2.b);
                    avdg.a(i36, avdd2);
                    i37++;
                    i36 = i38;
                }
            }
            avdi avdi2 = (avdi) avdg.i();
            aucd aucd3 = (aucd) avdi2.c(5);
            aucd3.a((aucj) avdi2);
            return (avdg) aucd3;
        } else if (b.a.isEmpty() && b.b.isEmpty()) {
            return null;
        } else {
            new Object[1][0] = Integer.valueOf(b.a.size());
            new Object[1][0] = Integer.valueOf(b.b.size());
            avdi a3 = a(b.a, b.b, zuk2, b.e);
            aucd aucd4 = (aucd) a3.c(5);
            aucd4.a((aucj) a3);
            return (avdg) aucd4;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0241, code lost:
        if (r3 == null) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0247, code lost:
        if (r3.moveToNext() == false) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0249, code lost:
        r0 = java.lang.Long.valueOf(r3.getLong(r3.getColumnIndex("contact_id")));
        r6 = java.lang.Long.valueOf(r3.getLong(r3.getColumnIndex("raw_contact_id")));
        r7 = r3.getString(r3.getColumnIndex(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x026d, code lost:
        if (r4.containsKey(r0) != false) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x026f, code lost:
        r4.put(r0, new java.util.HashMap());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0277, code lost:
        r0 = (java.util.Map) r4.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x027d, code lost:
        if (r0 != null) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0284, code lost:
        if (r0.containsKey(r7) != false) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0286, code lost:
        r0.put(r7, new java.util.LinkedHashSet());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x028e, code lost:
        ((java.util.Set) r0.get(r7)).add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0298, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x029a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x029c, code lost:
        e.c("CP2 failed to fetch Postal info.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02a3, code lost:
        if (r3 != null) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02a6, code lost:
        r20 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02ad, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02ae, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02b6, code lost:
        if (defpackage.azfa.g() != false) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        e.e("CP2 Query Exception when fetching postal info", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02c4, code lost:
        e.a((java.lang.Throwable) r0, "CP2 Query Exception when fetching postal info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c9, code lost:
        if (r3 == null) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02cb, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02d2, code lost:
        if (defpackage.azdq.k() == false) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d4, code lost:
        r2 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r0 = r1.a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, k, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02ea, code lost:
        if (r0 == null) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02f0, code lost:
        if (r0.moveToNext() == false) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02f2, code lost:
        r3 = java.lang.Long.valueOf(r0.getLong(r0.getColumnIndex("contact_id")));
        r6 = r0.getString(r0.getColumnIndex("lookup"));
        r2.put(r3, r6);
        new java.lang.Object[1][0] = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0312, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0316, code lost:
        e.c("CP2 query failed when fetching lookup key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x031e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0325, code lost:
        if (defpackage.azfa.g() != false) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0327, code lost:
        e.a((java.lang.Throwable) r0, "CP2 query exception when fetching lookup key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x032d, code lost:
        e.e("CP2 query exception when fetching lookup key.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0339, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x033d, code lost:
        if (r21 != null) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x033f, code lost:
        r8 = r27;
        r11 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x034d, code lost:
        if (r1.c.a(r1.a) == false) goto L_0x03b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x034f, code lost:
        r3 = defpackage.anda.a();
        r6 = r27.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0358, code lost:
        if (r7 >= r6) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x035a, code lost:
        r9 = (defpackage.zvb) r27.get(r7);
        r11 = r21;
        r10 = (java.util.List) r11.get(java.lang.Long.valueOf(r9.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0370, code lost:
        if (r10 != null) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0372, code lost:
        new java.lang.Object[1][0] = java.lang.Long.valueOf(r9.a);
        r3.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0382, code lost:
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x038a, code lost:
        if (r10.hasNext() == false) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x038c, code lost:
        r12 = (defpackage.zuh) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0398, code lost:
        if ("com.google".equals(r12.g) == false) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03a2, code lost:
        if (r1.c.a(r12.h) == false) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03a5, code lost:
        r3.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03a8, code lost:
        r7 = r7 + 1;
        r21 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03ad, code lost:
        r11 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03b0, code lost:
        r8 = r27;
        r11 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03b4, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03b5, code lost:
        r6 = (defpackage.avdg) defpackage.avdi.h.o();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03c2, code lost:
        if (r7 >= r3.size()) goto L_0x0a89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03c4, code lost:
        r8 = (defpackage.zvb) r3.get(r7);
        r9 = java.lang.Long.valueOf(r8.a);
        r10 = (defpackage.avdd) defpackage.avdf.q.o();
        r12 = r9.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03de, code lost:
        if (r10.c == false) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03e0, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03e6, code lost:
        r14 = (defpackage.avdf) r10.b;
        r27 = r3;
        r3 = r14.a | 1;
        r14.a = r3;
        r14.b = r12;
        r12 = r8.f;
        r3 = r3 | 16;
        r14.a = r3;
        r14.e = r12;
        r12 = r8.g;
        r14.a = r3 | 32;
        r14.i = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x040a, code lost:
        if (defpackage.azdq.k() != false) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0411, code lost:
        if (r2.containsKey(r9) == false) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0413, code lost:
        r3 = (java.lang.String) r2.get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x041b, code lost:
        if (r10.c != false) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x041e, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0424, code lost:
        r12 = (defpackage.avdf) r10.b;
        r3.getClass();
        r12.a |= com.google.android.chimera.FragmentTransaction.TRANSIT_ENTER_MASK;
        r12.l = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0433, code lost:
        r12 = (r8.h / 86400000) * 86400000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x043b, code lost:
        if (r10.c != false) goto L_0x043e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x043e, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0444, code lost:
        r3 = (defpackage.avdf) r10.b;
        r3.a |= 64;
        r3.j = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0456, code lost:
        if (android.text.TextUtils.isEmpty(r8.b) == false) goto L_0x0459;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0459, code lost:
        r3 = r8.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x045b, code lost:
        if (r3 == null) goto L_0x0477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x045f, code lost:
        if (r10.c != false) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0462, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0468, code lost:
        r12 = (defpackage.avdf) r10.b;
        r3.getClass();
        r12.a |= 4;
        r12.c = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0477, code lost:
        r3 = defpackage.anda.a((java.lang.Iterable) java.util.Collections.unmodifiableSet(r8.i));
        defpackage.anbs.f(r3, new defpackage.zue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x048b, code lost:
        if (r10.c == false) goto L_0x0493;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x048d, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0493, code lost:
        ((defpackage.avdf) r10.b).d = defpackage.aucj.s();
        r10.a((java.lang.Iterable) r3);
        r3 = (java.util.Map) r5.get(r9);
        r12 = b(defpackage.amzy.a((java.util.Collection) r8.c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04b2, code lost:
        if (r10.c != false) goto L_0x04b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04b5, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04bb, code lost:
        ((defpackage.avdf) r10.b).f = defpackage.aucj.s();
        r12 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04cd, code lost:
        if (r12.hasNext() == false) goto L_0x05b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04cf, code lost:
        r13 = (defpackage.ztl) r12.next();
        r14 = (defpackage.avdu) defpackage.avdv.h.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04e1, code lost:
        if (r13.b() == false) goto L_0x050a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04e3, code lost:
        r21 = r2;
        r2 = r13.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04e7, code lost:
        if (r2 == null) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04e9, code lost:
        r22 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04ed, code lost:
        if (r14.c != false) goto L_0x04f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04f0, code lost:
        r14.c();
        r14.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04f6, code lost:
        r5 = (defpackage.avdv) r14.b;
        r2.getClass();
        r23 = r12;
        r5.a |= 1;
        r5.b = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x050a, code lost:
        r21 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x050c, code lost:
        r22 = r5;
        r23 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0514, code lost:
        if (r13.a() == false) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0516, code lost:
        r2 = r13.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0518, code lost:
        if (r2 == null) goto L_0x0536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x051c, code lost:
        if (r14.c != false) goto L_0x051f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x051f, code lost:
        r14.c();
        r14.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0525, code lost:
        r5 = (defpackage.avdv) r14.b;
        r2.getClass();
        r5.a |= 2;
        r5.c = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0536, code lost:
        if (r3 == null) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0538, code lost:
        r2 = (defpackage.zuf) r3.get(r13.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0540, code lost:
        if (r2 == null) goto L_0x05a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0542, code lost:
        r12 = r2.b.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x054a, code lost:
        if (r14.c != false) goto L_0x054d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x054d, code lost:
        r14.c();
        r14.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0553, code lost:
        r5 = (defpackage.avdv) r14.b;
        r24 = r3;
        r5.a |= 4;
        r5.e = r12;
        r12 = r2.c.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0569, code lost:
        if (r14.c != false) goto L_0x056c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x056c, code lost:
        r14.c();
        r14.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0572, code lost:
        r3 = (defpackage.avdv) r14.b;
        r3.a |= 8;
        r3.f = r12;
        r14.a(r2.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0587, code lost:
        if (defpackage.azdq.i() == false) goto L_0x05a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0589, code lost:
        r2 = r2.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x058d, code lost:
        if (r14.c != false) goto L_0x0590;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0590, code lost:
        r14.c();
        r14.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0596, code lost:
        r3 = (defpackage.avdv) r14.b;
        r3.a |= 32;
        r3.g = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x05a3, code lost:
        r24 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x05a6, code lost:
        r24 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05a8, code lost:
        r10.a(r14);
        r2 = r21;
        r5 = r22;
        r12 = r23;
        r3 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05b5, code lost:
        r21 = r2;
        r22 = r5;
        r2 = (java.util.Map) r15.get(r9);
        r3 = b(defpackage.amzy.a((java.util.Collection) r8.d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05cb, code lost:
        if (r10.c != false) goto L_0x05ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05ce, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05d4, code lost:
        ((defpackage.avdf) r10.b).g = defpackage.aucj.s();
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05e6, code lost:
        if (r3.hasNext() == false) goto L_0x06a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x05e8, code lost:
        r5 = (defpackage.ztl) r3.next();
        r12 = (defpackage.avdr) defpackage.avds.h.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05fa, code lost:
        if (r5.b() == false) goto L_0x061f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05fc, code lost:
        r13 = r5.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05fe, code lost:
        if (r13 == null) goto L_0x061f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0602, code lost:
        if (r12.c != false) goto L_0x0605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0605, code lost:
        r12.c();
        r12.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x060b, code lost:
        r14 = (defpackage.avds) r12.b;
        r13.getClass();
        r23 = r3;
        r14.a |= 1;
        r14.b = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x061f, code lost:
        r23 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0625, code lost:
        if (r5.a() == false) goto L_0x0647;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0627, code lost:
        r3 = r5.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0629, code lost:
        if (r3 == null) goto L_0x0647;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x062d, code lost:
        if (r12.c != false) goto L_0x0630;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0630, code lost:
        r12.c();
        r12.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0636, code lost:
        r13 = (defpackage.avds) r12.b;
        r3.getClass();
        r13.a |= 2;
        r13.c = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0647, code lost:
        if (r2 == null) goto L_0x0698;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0649, code lost:
        r3 = (defpackage.zuf) r2.get(r5.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0651, code lost:
        if (r3 == null) goto L_0x0695;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0653, code lost:
        r13 = r3.b.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x065b, code lost:
        if (r12.c != false) goto L_0x065e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x065e, code lost:
        r12.c();
        r12.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0664, code lost:
        r5 = (defpackage.avds) r12.b;
        r24 = r2;
        r5.a |= 4;
        r5.e = r13;
        r13 = r3.c.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x067a, code lost:
        if (r12.c != false) goto L_0x067d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x067d, code lost:
        r12.c();
        r12.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0683, code lost:
        r2 = (defpackage.avds) r12.b;
        r2.a |= 8;
        r2.f = r13;
        r12.a(r3.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0695, code lost:
        r24 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0698, code lost:
        r24 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x069a, code lost:
        r10.a(r12);
        r3 = r23;
        r2 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x06a3, code lost:
        r2 = (java.util.Map) r4.get(r9);
        r3 = b(defpackage.amzy.a((java.util.Collection) r8.e));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x06b5, code lost:
        if (r10.c != false) goto L_0x06b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e6, code lost:
        if (r6 == null) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06b8, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06be, code lost:
        ((defpackage.avdf) r10.b).h = defpackage.aucj.s();
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06d0, code lost:
        if (r3.hasNext() == false) goto L_0x073d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06d2, code lost:
        r5 = (defpackage.ztl) r3.next();
        r8 = (defpackage.avdw) defpackage.avdx.f.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06e4, code lost:
        if (r5.b() == false) goto L_0x0706;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x06e6, code lost:
        r12 = r5.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x06e8, code lost:
        if (r12 == null) goto L_0x0706;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06ec, code lost:
        if (r8.c != false) goto L_0x06ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06ef, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06f5, code lost:
        r13 = (defpackage.avdx) r8.b;
        r12.getClass();
        r13.a |= 1;
        r13.b = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x070a, code lost:
        if (r5.a() == false) goto L_0x072c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x070c, code lost:
        r12 = r5.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x070e, code lost:
        if (r12 == null) goto L_0x072c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0712, code lost:
        if (r8.c != false) goto L_0x0715;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0715, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x071b, code lost:
        r13 = (defpackage.avdx) r8.b;
        r12.getClass();
        r13.a |= 2;
        r13.c = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x072c, code lost:
        if (r2 == null) goto L_0x0739;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x072e, code lost:
        r8.a((java.util.Set) r2.get(r5.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0739, code lost:
        r10.a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x073d, code lost:
        if (r11 == null) goto L_0x0746;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x073f, code lost:
        r2 = (java.util.List) r11.get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0746, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0748, code lost:
        if (r2 == null) goto L_0x0a7c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x074a, code lost:
        r3 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0751, code lost:
        if (r10.c == false) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0753, code lost:
        r10.c();
        r10.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ef, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0759, code lost:
        ((defpackage.avdf) r10.b).k = defpackage.aucj.s();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0768, code lost:
        if (r5 >= r2.size()) goto L_0x0a7c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x076a, code lost:
        r8 = (defpackage.zuh) r2.get(r5);
        r9 = defpackage.avdz.r.o();
        r12 = r8.a.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x077e, code lost:
        if (r9.c != false) goto L_0x0781;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0781, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0787, code lost:
        r14 = (defpackage.avdz) r9.b;
        r23 = r2;
        r2 = r14.a | 1;
        r14.a = r2;
        r14.b = r12;
        r12 = r8.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0799, code lost:
        if (r12 == null) goto L_0x0804;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x079b, code lost:
        r12.getClass();
        r14.a = r2 | 8;
        r14.c = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x07a8, code lost:
        if (defpackage.azdq.h() == false) goto L_0x0804;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x07aa, code lost:
        r2 = (java.lang.Boolean) r3.get(((defpackage.avdz) r9.b).c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x07b6, code lost:
        if (r2 == null) goto L_0x07d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x07b8, code lost:
        r2 = r2.booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x07be, code lost:
        if (r9.c != false) goto L_0x07c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x07c1, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x07c7, code lost:
        r12 = (defpackage.avdz) r9.b;
        r12.a |= 32768;
        r12.m = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x07d6, code lost:
        r2 = defpackage.aeku.a(r1.a, ((defpackage.avdz) r9.b).c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07e4, code lost:
        if (r9.c != false) goto L_0x07e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x07e7, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07ed, code lost:
        r12 = (defpackage.avdz) r9.b;
        r12.a |= 32768;
        r12.m = r2;
        r3.put(r12.c, java.lang.Boolean.valueOf(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f3, code lost:
        r21 = r5;
        r4 = "times_used";
        r13 = "last_time_used";
        r2 = "data1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0804, code lost:
        r2 = r8.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0806, code lost:
        if (r2 == null) goto L_0x0822;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x080a, code lost:
        if (r9.c != false) goto L_0x080d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x080d, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0813, code lost:
        r12 = (defpackage.avdz) r9.b;
        r2.getClass();
        r12.a |= 16;
        r12.d = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0828, code lost:
        if (android.text.TextUtils.isEmpty(r8.n) != false) goto L_0x0848;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x082a, code lost:
        r2 = r8.n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x082c, code lost:
        if (r2 == null) goto L_0x0848;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0830, code lost:
        if (r9.c != false) goto L_0x0833;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0833, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0839, code lost:
        r12 = (defpackage.avdz) r9.b;
        r2.getClass();
        r12.a |= 128;
        r12.f = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x084a, code lost:
        if (r8.l == false) goto L_0x0864;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x084e, code lost:
        if (r9.c != false) goto L_0x0851;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0851, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0857, code lost:
        r2 = (defpackage.avdz) r9.b;
        r2.a |= 16384;
        r2.l = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0868, code lost:
        if (defpackage.azdq.l() == false) goto L_0x0888;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x086a, code lost:
        r2 = r8.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x086c, code lost:
        if (r2 == null) goto L_0x0888;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0870, code lost:
        if (r9.c != false) goto L_0x0873;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0873, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0879, code lost:
        r12 = (defpackage.avdz) r9.b;
        r2.getClass();
        r12.j = r2;
        r12.a |= com.google.android.chimera.FragmentTransaction.TRANSIT_EXIT_MASK;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0888, code lost:
        r12 = r8.j.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0890, code lost:
        if (r9.c != false) goto L_0x0893;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0893, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0899, code lost:
        r2 = (defpackage.avdz) r9.b;
        r2.a |= 1024;
        r2.h = r12;
        r12 = (r8.k.longValue() / 86400000) * 86400000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x08b1, code lost:
        if (r9.c != false) goto L_0x08b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x08b4, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x08ba, code lost:
        r2 = (defpackage.avdz) r9.b;
        r14 = r2.a | 2048;
        r2.a = r14;
        r2.i = r12;
        r12 = r8.p;
        r13 = r12 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x08ca, code lost:
        if (r12 == 0) goto L_0x0a72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x08cc, code lost:
        r2.g = r13;
        r2.a = r14 | 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x08d8, code lost:
        if ("com.google".equals(r8.g) == false) goto L_0x08fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x08dc, code lost:
        if (r8.i != null) goto L_0x08fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x08de, code lost:
        r2 = r8.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x08e0, code lost:
        if (r2 == null) goto L_0x08fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x08e4, code lost:
        if (r9.c != false) goto L_0x08e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x08e7, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x08ed, code lost:
        r12 = (defpackage.avdz) r9.b;
        r2.getClass();
        r12.a |= 32;
        r12.e = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0906, code lost:
        if (defpackage.azdt.a.b().a() == false) goto L_0x092d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x090e, code lost:
        if ("com.google".equals(r8.g) != false) goto L_0x092d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0912, code lost:
        if (r8.b == null) goto L_0x092d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0916, code lost:
        if (r9.c != false) goto L_0x0919;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0919, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x091f, code lost:
        r2 = (defpackage.avdz) r9.b;
        r2.a |= 65536;
        r2.n = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0931, code lost:
        if (defpackage.azdw.c() == false) goto L_0x0a36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x093d, code lost:
        if (defpackage.azdz.a.c().c() != false) goto L_0x094e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0945, code lost:
        if ("com.google".equals(r8.g) != false) goto L_0x0948;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x094e, code lost:
        r2 = defpackage.aveb.g.o();
        r12 = r8.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0956, code lost:
        if (r12 == null) goto L_0x0975;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x095a, code lost:
        if (r2.c != false) goto L_0x095d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x095d, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0963, code lost:
        r13 = (defpackage.aveb) r2.b;
        r12.getClass();
        r13.a |= 1;
        r13.b = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0977, code lost:
        r12 = r8.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0979, code lost:
        if (r12 == null) goto L_0x0998;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x097d, code lost:
        if (r2.c != false) goto L_0x0980;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0980, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0986, code lost:
        r13 = (defpackage.aveb) r2.b;
        r12.getClass();
        r13.a |= 2;
        r13.c = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x099a, code lost:
        r12 = r8.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x099c, code lost:
        if (r12 == null) goto L_0x09b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x09a0, code lost:
        if (r2.c != false) goto L_0x09a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x09a3, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x09a9, code lost:
        r13 = (defpackage.aveb) r2.b;
        r12.getClass();
        r13.a |= 4;
        r13.d = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x09b8, code lost:
        r12 = r8.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x09ba, code lost:
        if (r12 == null) goto L_0x09d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x09be, code lost:
        if (r2.c != false) goto L_0x09c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x09c1, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x09c7, code lost:
        r13 = (defpackage.aveb) r2.b;
        r12.getClass();
        r13.a |= 8;
        r13.e = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x09d6, code lost:
        r12 = r8.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0114, code lost:
        if (r6 != null) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x09d8, code lost:
        if (r12 == null) goto L_0x09f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x09dc, code lost:
        if (r2.c != false) goto L_0x09df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x09df, code lost:
        r2.c();
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x09e5, code lost:
        r13 = (defpackage.aveb) r2.b;
        r12.getClass();
        r13.a |= 16;
        r13.f = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x09f6, code lost:
        if (r9.c != false) goto L_0x09f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x09f9, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x09ff, code lost:
        r12 = (defpackage.avdz) r9.b;
        r2 = (defpackage.aveb) r2.i();
        r2.getClass();
        r12.o = r2;
        r12.a |= 131072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0116, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0a19, code lost:
        if (defpackage.azdz.b() == false) goto L_0x0a3a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0a1b, code lost:
        r2 = r8.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0a1f, code lost:
        if (r9.c != false) goto L_0x0a22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0a22, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0a28, code lost:
        r12 = (defpackage.avdz) r9.b;
        r12.a |= 524288;
        r12.q = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0a44, code lost:
        if (defpackage.azdz.a.c().a() == false) goto L_0x0a65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0a46, code lost:
        r2 = r8.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0a48, code lost:
        if (r2 == null) goto L_0x0a65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0a4c, code lost:
        if (r9.c != false) goto L_0x0a4f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0a4f, code lost:
        r9.c();
        r9.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0a55, code lost:
        r8 = (defpackage.avdz) r9.b;
        r2.getClass();
        r8.a |= 262144;
        r8.p = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0a65, code lost:
        defpackage.azeh.c();
        r10.a(r9);
        r5 = r5 + 1;
        r2 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0a72, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0a7c, code lost:
        r6.a(r10);
        r7 = r7 + 1;
        r3 = r27;
        r2 = r21;
        r5 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0a89, code lost:
        r0 = defpackage.zuj.a(r1.a);
        r3 = (defpackage.aucd) r0.c(5);
        r3.a((defpackage.aucj) r0);
        r3 = (defpackage.avdk) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0a9f, code lost:
        if (defpackage.azdq.j() != false) goto L_0x0aa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0aa2, code lost:
        if (r30 == null) goto L_0x0ac6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011d, code lost:
        if (defpackage.azdq.i() == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0aa6, code lost:
        if (r3.c != false) goto L_0x0aa9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0aa9, code lost:
        r3.c();
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0aaf, code lost:
        r4 = defpackage.avdq.A;
        ((defpackage.avdq) r3.b).q = defpackage.aucj.s();
        r3.a(java.util.Arrays.asList(a(r30)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0ac6, code lost:
        r4 = ((defpackage.avdq) r3.b).i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0ace, code lost:
        if (r6.c != false) goto L_0x0ad1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0ad1, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0ad7, code lost:
        r0 = (defpackage.avdi) r6.b;
        r7 = r0.a | 8;
        r0.a = r7;
        r0.e = r4;
        r4 = ((defpackage.avdq) r3.b).j;
        r0.a = r7 | 32;
        r0.g = r4;
        r3 = (defpackage.avdq) r3.i();
        r3.getClass();
        r0.f = r3;
        r0.a |= 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0b02, code lost:
        if (r6.c != false) goto L_0x0b05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0b05, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011f, code lost:
        r8 = m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0b0b, code lost:
        ((defpackage.avdi) r6.b).d = defpackage.aucj.r();
        r6.a((java.lang.Iterable) r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0b1e, code lost:
        if (r29.e == false) goto L_0x0b6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0b22, code lost:
        if (r6.c != false) goto L_0x0b25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0b25, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0b2b, code lost:
        defpackage.avdi.a((defpackage.avdi) r6.b);
        r0 = ((defpackage.avdi) r6.i()).b;
        r3 = r0.size();
        r4 = 0;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0b40, code lost:
        if (r9 >= r3) goto L_0x0b6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0b42, code lost:
        r5 = r4 + 1;
        r7 = (defpackage.avdf) r0.get(r9);
        r8 = (defpackage.aucd) r7.c(5);
        r8.a((defpackage.aucj) r7);
        r8 = (defpackage.avdd) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0b57, code lost:
        if (r8.c != false) goto L_0x0b5b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0123, code lost:
        r8 = l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0b5b, code lost:
        r8.c();
        r8.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0b61, code lost:
        defpackage.avdf.a((defpackage.avdf) r8.b);
        r6.a(r4, r8);
        r9 = r9 + 1;
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0b75, code lost:
        return (defpackage.avdi) r6.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0b76, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0b77, code lost:
        r20 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0b79, code lost:
        if (r20 != null) goto L_0x0b7b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0b7b, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0b7e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0b7f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0126, code lost:
        r11 = defpackage.anet.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0b80, code lost:
        r20 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0b82, code lost:
        if (r20 != null) goto L_0x0b84;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0b84, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0b87, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0136, code lost:
        r5 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r6 = r1.a.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, r8, a("contact_id", (java.util.Collection) r3), (java.lang.String[]) null, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013e, code lost:
        if (r6 == null) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0144, code lost:
        if (r6.moveToNext() == false) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0146, code lost:
        r0 = java.lang.Long.valueOf(r6.getLong(r6.getColumnIndex("contact_id")));
        r7 = java.lang.Long.valueOf(r6.getLong(r6.getColumnIndex("raw_contact_id")));
        r8 = r6.getString(r6.getColumnIndex(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016a, code lost:
        if (r5.containsKey(r0) != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016c, code lost:
        r5.put(r0, new java.util.HashMap());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0174, code lost:
        r0 = (java.util.Map) r5.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017a, code lost:
        if (r0 != null) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017c, code lost:
        r25 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0183, code lost:
        if (r0.containsKey(r8) != false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0185, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018b, code lost:
        if (defpackage.azdq.e() != false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018d, code lost:
        r10 = r6.getLong(r6.getColumnIndex(r4));
        r23 = (r6.getLong(r6.getColumnIndex(r13)) / 86400000) * 86400000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a2, code lost:
        r23 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a8, code lost:
        if (defpackage.azdq.i() == false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01aa, code lost:
        r25 = r4;
        r4 = new defpackage.zuf(java.lang.Long.valueOf(r10), java.lang.Long.valueOf(r23), r6.getInt(r6.getColumnIndex("is_super_primary")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c4, code lost:
        r25 = r4;
        r4 = new defpackage.zuf(java.lang.Long.valueOf(r10), java.lang.Long.valueOf(r23));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d3, code lost:
        r0.put(r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d7, code lost:
        r25 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d9, code lost:
        ((defpackage.zuf) r0.get(r8)).a(r7);
        r4 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ea, code lost:
        e.c("CP2 failed to fetch Phone info.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f1, code lost:
        if (r6 != null) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f4, code lost:
        r20 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01fa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01fe, code lost:
        r5 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ff, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0207, code lost:
        if (defpackage.azfa.g() == false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        e.e("CP2 Query Exception when fetching phone info", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0215, code lost:
        e.a((java.lang.Throwable) r0, "CP2 Query Exception when fetching phone info");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021a, code lost:
        if (r6 != null) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x021c, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x021f, code lost:
        r8 = new java.lang.String[]{"raw_contact_id", "contact_id", r2};
        r4 = defpackage.anet.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r3 = r1.a.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI, r8, a("contact_id", (java.util.Collection) r3), (java.lang.String[]) null, (java.lang.String) null);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02b8 A[SYNTHETIC, Splitter:B:128:0x02b8] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02c4 A[Catch:{ all -> 0x0b76 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ef A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0103 A[SYNTHETIC, Splitter:B:38:0x0103] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010f A[Catch:{ all -> 0x0b88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0b7b  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0b84  */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0b8d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01fa A[ExcHandler: all (th java.lang.Throwable), Splitter:B:48:0x012a] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0209 A[SYNTHETIC, Splitter:B:92:0x0209] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0215 A[Catch:{ all -> 0x0b7f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.avdi a(java.util.List r27, java.util.Set r28, defpackage.zuk r29, defpackage.aqxt[] r30) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            java.util.ArrayList r3 = defpackage.anda.a()
            int r0 = r27.size()
            r4 = 0
            r5 = 0
        L_0x000e:
            if (r5 < r0) goto L_0x0b91
            java.util.Map r5 = r1.a((java.util.List) r3)
            int r0 = defpackage.ztz.a
            r0 = 7
            java.lang.String[] r8 = new java.lang.String[r0]
            java.lang.String r12 = "raw_contact_id"
            r8[r4] = r12
            r13 = 1
            java.lang.String r14 = "contact_id"
            r8[r13] = r14
            java.lang.String r0 = "display_name"
            r15 = 2
            r8[r15] = r0
            r11 = 3
            java.lang.String r10 = "data1"
            r8[r11] = r10
            java.lang.String r0 = "data3"
            r16 = 4
            r8[r16] = r0
            r9 = 5
            java.lang.String r7 = "last_time_used"
            r8[r9] = r7
            r0 = 6
            java.lang.String r6 = "times_used"
            r8[r0] = r6
            java.util.HashMap r15 = defpackage.anet.a()
            r18 = 86400000(0x5265c00, double:4.2687272E-316)
            r20 = 0
            android.content.Context r0 = r1.a     // Catch:{ SQLiteException -> 0x00f2, all -> 0x00ef }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ SQLiteException -> 0x00f2, all -> 0x00ef }
            android.net.Uri r21 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI     // Catch:{ SQLiteException -> 0x00f2, all -> 0x00ef }
            java.lang.String r22 = a((java.lang.String) r14, (java.util.Collection) r3)     // Catch:{ SQLiteException -> 0x00f2, all -> 0x00ef }
            r23 = 0
            r24 = 0
            r4 = r6
            r6 = r0
            r13 = r7
            r7 = r21
            r9 = r22
            r2 = r10
            r10 = r23
            r21 = r5
            r5 = 3
            r11 = r24
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00ed, all -> 0x00ef }
            if (r6 == 0) goto L_0x00df
        L_0x006a:
            boolean r0 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            if (r0 == 0) goto L_0x00e6
            int r0 = r6.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            long r7 = r6.getLong(r0)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            int r7 = r6.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            long r7 = r6.getLong(r7)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            int r8 = r6.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            java.lang.String r8 = r6.getString(r8)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            boolean r9 = r15.containsKey(r0)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            if (r9 != 0) goto L_0x009e
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            r9.<init>()     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            r15.put(r0, r9)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
        L_0x009e:
            java.lang.Object r0 = r15.get(r0)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            if (r0 != 0) goto L_0x00a7
            goto L_0x00d1
        L_0x00a7:
            boolean r9 = r0.containsKey(r8)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            if (r9 != 0) goto L_0x00d1
            int r9 = r6.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            long r9 = r6.getLong(r9)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            int r11 = r6.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            long r22 = r6.getLong(r11)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            long r22 = r22 / r18
            long r22 = r22 * r18
            zuf r11 = new zuf     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            java.lang.Long r10 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            r11.<init>(r9, r10)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            r0.put(r8, r11)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
        L_0x00d1:
            java.lang.Object r0 = r0.get(r8)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            zuf r0 = (defpackage.zuf) r0     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            r0.a(r7)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            goto L_0x006a
        L_0x00db:
            r0 = move-exception
            goto L_0x00e9
        L_0x00dd:
            r0 = move-exception
            goto L_0x00fb
        L_0x00df:
            zsg r0 = e     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
            java.lang.String r7 = "CP2 failed to fetch Email info."
            r0.c(r7)     // Catch:{ SQLiteException -> 0x00dd, all -> 0x00db }
        L_0x00e6:
            if (r6 != 0) goto L_0x0116
            goto L_0x0119
        L_0x00e9:
            r20 = r6
            goto L_0x0b8b
        L_0x00ed:
            r0 = move-exception
            goto L_0x00f9
        L_0x00ef:
            r0 = move-exception
            goto L_0x0b8b
        L_0x00f2:
            r0 = move-exception
            r21 = r5
            r4 = r6
            r13 = r7
            r2 = r10
            r5 = 3
        L_0x00f9:
            r6 = r20
        L_0x00fb:
            boolean r7 = defpackage.azfa.g()     // Catch:{ all -> 0x0b88 }
            java.lang.String r8 = "CP2 Query Exception when fetching email info"
            if (r7 != 0) goto L_0x010f
            zsg r7 = e     // Catch:{ all -> 0x0b88 }
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x0b88 }
            r9 = 0
            r10[r9] = r0     // Catch:{ all -> 0x0b88 }
            r7.e(r8, r10)     // Catch:{ all -> 0x0b88 }
            goto L_0x0114
        L_0x010f:
            zsg r7 = e     // Catch:{ all -> 0x0b88 }
            r7.a((java.lang.Throwable) r0, (java.lang.String) r8)     // Catch:{ all -> 0x0b88 }
        L_0x0114:
            if (r6 == 0) goto L_0x0119
        L_0x0116:
            r6.close()
        L_0x0119:
            boolean r0 = defpackage.azdq.i()
            if (r0 == 0) goto L_0x0123
            java.lang.String[] r0 = m
            r8 = r0
            goto L_0x0126
        L_0x0123:
            java.lang.String[] r0 = l
            r8 = r0
        L_0x0126:
            java.util.HashMap r11 = defpackage.anet.a()
            android.content.Context r0 = r1.a     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01fa }
            android.content.ContentResolver r6 = r0.getContentResolver()     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01fa }
            android.net.Uri r7 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01fa }
            java.lang.String r9 = a((java.lang.String) r14, (java.util.Collection) r3)     // Catch:{ SQLiteException -> 0x01fd, all -> 0x01fa }
            r10 = 0
            r0 = 0
            r5 = r11
            r11 = r0
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x01f8, all -> 0x01fa }
            if (r6 == 0) goto L_0x01ea
        L_0x0140:
            boolean r0 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            if (r0 == 0) goto L_0x01f1
            int r0 = r6.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            long r7 = r6.getLong(r0)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            int r7 = r6.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            long r7 = r6.getLong(r7)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            int r8 = r6.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            java.lang.String r8 = r6.getString(r8)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            boolean r9 = r5.containsKey(r0)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            if (r9 != 0) goto L_0x0174
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            r9.<init>()     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            r5.put(r0, r9)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
        L_0x0174:
            java.lang.Object r0 = r5.get(r0)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            if (r0 != 0) goto L_0x017f
            r25 = r4
            goto L_0x01d9
        L_0x017f:
            boolean r9 = r0.containsKey(r8)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            if (r9 != 0) goto L_0x01d7
            boolean r9 = defpackage.azdq.e()     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            r10 = 0
            if (r9 != 0) goto L_0x01a2
            int r9 = r6.getColumnIndex(r4)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            long r10 = r6.getLong(r9)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            int r9 = r6.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            long r23 = r6.getLong(r9)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            long r23 = r23 / r18
            long r23 = r23 * r18
            goto L_0x01a4
        L_0x01a2:
            r23 = r10
        L_0x01a4:
            boolean r9 = defpackage.azdq.i()     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            if (r9 == 0) goto L_0x01c4
            java.lang.String r9 = "is_super_primary"
            int r9 = r6.getColumnIndex(r9)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            int r9 = r6.getInt(r9)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            r25 = r4
            zuf r4 = new zuf     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            java.lang.Long r11 = java.lang.Long.valueOf(r23)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            r4.<init>(r10, r11, r9)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            goto L_0x01d3
        L_0x01c4:
            r25 = r4
            zuf r4 = new zuf     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            java.lang.Long r9 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            java.lang.Long r10 = java.lang.Long.valueOf(r23)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            r4.<init>(r9, r10)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
        L_0x01d3:
            r0.put(r8, r4)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            goto L_0x01d9
        L_0x01d7:
            r25 = r4
        L_0x01d9:
            java.lang.Object r0 = r0.get(r8)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            zuf r0 = (defpackage.zuf) r0     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            r0.a(r7)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            r4 = r25
            goto L_0x0140
        L_0x01e6:
            r0 = move-exception
            goto L_0x01f4
        L_0x01e8:
            r0 = move-exception
            goto L_0x0201
        L_0x01ea:
            zsg r0 = e     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
            java.lang.String r4 = "CP2 failed to fetch Phone info."
            r0.c(r4)     // Catch:{ SQLiteException -> 0x01e8, all -> 0x01e6 }
        L_0x01f1:
            if (r6 != 0) goto L_0x021c
            goto L_0x021f
        L_0x01f4:
            r20 = r6
            goto L_0x0b82
        L_0x01f8:
            r0 = move-exception
            goto L_0x01ff
        L_0x01fa:
            r0 = move-exception
            goto L_0x0b82
        L_0x01fd:
            r0 = move-exception
            r5 = r11
        L_0x01ff:
            r6 = r20
        L_0x0201:
            boolean r4 = defpackage.azfa.g()     // Catch:{ all -> 0x0b7f }
            java.lang.String r7 = "CP2 Query Exception when fetching phone info"
            if (r4 != 0) goto L_0x0215
            zsg r4 = e     // Catch:{ all -> 0x0b7f }
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0b7f }
            r8 = 0
            r9[r8] = r0     // Catch:{ all -> 0x0b7f }
            r4.e(r7, r9)     // Catch:{ all -> 0x0b7f }
            goto L_0x021a
        L_0x0215:
            zsg r4 = e     // Catch:{ all -> 0x0b7f }
            r4.a((java.lang.Throwable) r0, (java.lang.String) r7)     // Catch:{ all -> 0x0b7f }
        L_0x021a:
            if (r6 == 0) goto L_0x021f
        L_0x021c:
            r6.close()
        L_0x021f:
            r4 = 3
            java.lang.String[] r8 = new java.lang.String[r4]
            r4 = 0
            r8[r4] = r12
            r4 = 1
            r8[r4] = r14
            r4 = 2
            r8[r4] = r2
            java.util.HashMap r4 = defpackage.anet.a()
            android.content.Context r0 = r1.a     // Catch:{ SQLiteException -> 0x02ad, all -> 0x02aa }
            android.content.ContentResolver r6 = r0.getContentResolver()     // Catch:{ SQLiteException -> 0x02ad, all -> 0x02aa }
            android.net.Uri r7 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI     // Catch:{ SQLiteException -> 0x02ad, all -> 0x02aa }
            java.lang.String r9 = a((java.lang.String) r14, (java.util.Collection) r3)     // Catch:{ SQLiteException -> 0x02ad, all -> 0x02aa }
            r10 = 0
            r11 = 0
            android.database.Cursor r3 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x02ad, all -> 0x02aa }
            if (r3 == 0) goto L_0x029c
        L_0x0243:
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            if (r0 == 0) goto L_0x02a3
            int r0 = r3.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            long r6 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            int r6 = r3.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            int r7 = r3.getColumnIndex(r2)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            java.lang.String r7 = r3.getString(r7)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            boolean r8 = r4.containsKey(r0)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            if (r8 != 0) goto L_0x0277
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            r8.<init>()     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            r4.put(r0, r8)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
        L_0x0277:
            java.lang.Object r0 = r4.get(r0)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            if (r0 != 0) goto L_0x0280
            goto L_0x028e
        L_0x0280:
            boolean r8 = r0.containsKey(r7)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            if (r8 != 0) goto L_0x028e
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            r8.<init>()     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            r0.put(r7, r8)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
        L_0x028e:
            java.lang.Object r0 = r0.get(r7)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            r0.add(r6)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            goto L_0x0243
        L_0x0298:
            r0 = move-exception
            goto L_0x02a6
        L_0x029a:
            r0 = move-exception
            goto L_0x02b0
        L_0x029c:
            zsg r0 = e     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
            java.lang.String r2 = "CP2 failed to fetch Postal info."
            r0.c(r2)     // Catch:{ SQLiteException -> 0x029a, all -> 0x0298 }
        L_0x02a3:
            if (r3 != 0) goto L_0x02cb
            goto L_0x02ce
        L_0x02a6:
            r20 = r3
            goto L_0x0b79
        L_0x02aa:
            r0 = move-exception
            goto L_0x0b79
        L_0x02ad:
            r0 = move-exception
            r3 = r20
        L_0x02b0:
            boolean r2 = defpackage.azfa.g()     // Catch:{ all -> 0x0b76 }
            java.lang.String r6 = "CP2 Query Exception when fetching postal info"
            if (r2 != 0) goto L_0x02c4
            zsg r2 = e     // Catch:{ all -> 0x0b76 }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0b76 }
            r7 = 0
            r8[r7] = r0     // Catch:{ all -> 0x0b76 }
            r2.e(r6, r8)     // Catch:{ all -> 0x0b76 }
            goto L_0x02c9
        L_0x02c4:
            zsg r2 = e     // Catch:{ all -> 0x0b76 }
            r2.a((java.lang.Throwable) r0, (java.lang.String) r6)     // Catch:{ all -> 0x0b76 }
        L_0x02c9:
            if (r3 == 0) goto L_0x02ce
        L_0x02cb:
            r3.close()
        L_0x02ce:
            boolean r0 = defpackage.azdq.k()
            if (r0 == 0) goto L_0x0339
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            android.content.Context r0 = r1.a     // Catch:{ SQLiteException -> 0x031e }
            android.content.ContentResolver r6 = r0.getContentResolver()     // Catch:{ SQLiteException -> 0x031e }
            android.net.Uri r7 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ SQLiteException -> 0x031e }
            java.lang.String[] r8 = k     // Catch:{ SQLiteException -> 0x031e }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r0 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x031e }
            if (r0 == 0) goto L_0x0316
        L_0x02ec:
            boolean r3 = r0.moveToNext()
            if (r3 == 0) goto L_0x0312
            int r3 = r0.getColumnIndex(r14)
            long r6 = r0.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "lookup"
            int r6 = r0.getColumnIndex(r6)
            java.lang.String r6 = r0.getString(r6)
            r2.put(r3, r6)
            r3 = 1
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r3 = 0
            r7[r3] = r6
            goto L_0x02ec
        L_0x0312:
            r0.close()
            goto L_0x033b
        L_0x0316:
            zsg r0 = e
            java.lang.String r3 = "CP2 query failed when fetching lookup key."
            r0.c(r3)
            goto L_0x033b
        L_0x031e:
            r0 = move-exception
            boolean r3 = defpackage.azfa.g()
            java.lang.String r6 = "CP2 query exception when fetching lookup key."
            if (r3 == 0) goto L_0x032d
            zsg r3 = e
            r3.a((java.lang.Throwable) r0, (java.lang.String) r6)
            goto L_0x033b
        L_0x032d:
            zsg r3 = e
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r0
            r3.e(r6, r8)
            goto L_0x033b
        L_0x0339:
            r2 = r20
        L_0x033b:
            java.lang.String r0 = "com.google"
            if (r21 != 0) goto L_0x0345
            r8 = r27
            r11 = r21
            goto L_0x03b4
        L_0x0345:
            zsc r3 = r1.c
            android.content.Context r6 = r1.a
            boolean r3 = r3.a((android.content.Context) r6)
            if (r3 == 0) goto L_0x03b0
            java.util.ArrayList r3 = defpackage.anda.a()
            int r6 = r27.size()
            r7 = 0
        L_0x0358:
            if (r7 >= r6) goto L_0x03ad
            r8 = r27
            java.lang.Object r9 = r8.get(r7)
            zvb r9 = (defpackage.zvb) r9
            long r10 = r9.a
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r11 = r21
            java.lang.Object r10 = r11.get(r10)
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L_0x0382
            r10 = 1
            java.lang.Object[] r12 = new java.lang.Object[r10]
            long r13 = r9.a
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r13 = 0
            r12[r13] = r10
            r3.add(r9)
            goto L_0x03a8
        L_0x0382:
            java.util.Iterator r10 = r10.iterator()
        L_0x0386:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x03a5
            java.lang.Object r12 = r10.next()
            zuh r12 = (defpackage.zuh) r12
            java.lang.String r13 = r12.g
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x0386
            zsc r13 = r1.c
            java.lang.String r12 = r12.h
            boolean r12 = r13.a((java.lang.String) r12)
            if (r12 == 0) goto L_0x0386
            goto L_0x03a8
        L_0x03a5:
            r3.add(r9)
        L_0x03a8:
            int r7 = r7 + 1
            r21 = r11
            goto L_0x0358
        L_0x03ad:
            r11 = r21
            goto L_0x03b5
        L_0x03b0:
            r8 = r27
            r11 = r21
        L_0x03b4:
            r3 = r8
        L_0x03b5:
            avdi r6 = defpackage.avdi.h
            aucd r6 = r6.o()
            avdg r6 = (defpackage.avdg) r6
            r7 = 0
        L_0x03be:
            int r8 = r3.size()
            if (r7 >= r8) goto L_0x0a89
            java.lang.Object r8 = r3.get(r7)
            zvb r8 = (defpackage.zvb) r8
            long r9 = r8.a
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            avdf r10 = defpackage.avdf.q
            aucd r10 = r10.o()
            avdd r10 = (defpackage.avdd) r10
            long r12 = r9.longValue()
            boolean r14 = r10.c
            if (r14 == 0) goto L_0x03e6
            r10.c()
            r14 = 0
            r10.c = r14
        L_0x03e6:
            aucj r14 = r10.b
            avdf r14 = (defpackage.avdf) r14
            r27 = r3
            int r3 = r14.a
            r21 = 1
            r3 = r3 | 1
            r14.a = r3
            r14.b = r12
            double r12 = r8.f
            r3 = r3 | 16
            r14.a = r3
            r14.e = r12
            long r12 = r8.g
            r3 = r3 | 32
            r14.a = r3
            r14.i = r12
            boolean r3 = defpackage.azdq.k()
            if (r3 != 0) goto L_0x040d
            goto L_0x0433
        L_0x040d:
            boolean r3 = r2.containsKey(r9)
            if (r3 == 0) goto L_0x0433
            java.lang.Object r3 = r2.get(r9)
            java.lang.String r3 = (java.lang.String) r3
            boolean r12 = r10.c
            if (r12 != 0) goto L_0x041e
            goto L_0x0424
        L_0x041e:
            r10.c()
            r12 = 0
            r10.c = r12
        L_0x0424:
            aucj r12 = r10.b
            avdf r12 = (defpackage.avdf) r12
            r3.getClass()
            int r13 = r12.a
            r13 = r13 | 4096(0x1000, float:5.74E-42)
            r12.a = r13
            r12.l = r3
        L_0x0433:
            long r12 = r8.h
            long r12 = r12 / r18
            long r12 = r12 * r18
            boolean r3 = r10.c
            if (r3 != 0) goto L_0x043e
            goto L_0x0444
        L_0x043e:
            r10.c()
            r3 = 0
            r10.c = r3
        L_0x0444:
            aucj r3 = r10.b
            avdf r3 = (defpackage.avdf) r3
            int r14 = r3.a
            r14 = r14 | 64
            r3.a = r14
            r3.j = r12
            java.lang.String r3 = r8.b
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0459
            goto L_0x0477
        L_0x0459:
            java.lang.String r3 = r8.b
            if (r3 == 0) goto L_0x0477
            boolean r12 = r10.c
            if (r12 != 0) goto L_0x0462
            goto L_0x0468
        L_0x0462:
            r10.c()
            r12 = 0
            r10.c = r12
        L_0x0468:
            aucj r12 = r10.b
            avdf r12 = (defpackage.avdf) r12
            r3.getClass()
            int r13 = r12.a
            r13 = r13 | 4
            r12.a = r13
            r12.c = r3
        L_0x0477:
            java.util.Set r3 = r8.i
            java.util.Set r3 = java.util.Collections.unmodifiableSet(r3)
            java.util.ArrayList r3 = defpackage.anda.a((java.lang.Iterable) r3)
            zue r12 = new zue
            r12.<init>()
            defpackage.anbs.f(r3, r12)
            boolean r12 = r10.c
            if (r12 == 0) goto L_0x0493
            r10.c()
            r12 = 0
            r10.c = r12
        L_0x0493:
            aucj r12 = r10.b
            avdf r12 = (defpackage.avdf) r12
            aucx r13 = defpackage.aucj.s()
            r12.d = r13
            r10.a((java.lang.Iterable) r3)
            java.lang.Object r3 = r5.get(r9)
            java.util.Map r3 = (java.util.Map) r3
            java.util.List r12 = r8.c
            amzy r12 = defpackage.amzy.a((java.util.Collection) r12)
            java.util.Set r12 = b(r12)
            boolean r13 = r10.c
            if (r13 != 0) goto L_0x04b5
            goto L_0x04bb
        L_0x04b5:
            r10.c()
            r13 = 0
            r10.c = r13
        L_0x04bb:
            aucj r13 = r10.b
            avdf r13 = (defpackage.avdf) r13
            aucx r14 = defpackage.aucj.s()
            r13.f = r14
            java.util.Iterator r12 = r12.iterator()
        L_0x04c9:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x05b5
            java.lang.Object r13 = r12.next()
            ztl r13 = (defpackage.ztl) r13
            avdv r14 = defpackage.avdv.h
            aucd r14 = r14.o()
            avdu r14 = (defpackage.avdu) r14
            boolean r21 = r13.b()
            if (r21 == 0) goto L_0x050a
            r21 = r2
            java.lang.String r2 = r13.a
            if (r2 == 0) goto L_0x050c
            r22 = r5
            boolean r5 = r14.c
            if (r5 != 0) goto L_0x04f0
            goto L_0x04f6
        L_0x04f0:
            r14.c()
            r5 = 0
            r14.c = r5
        L_0x04f6:
            aucj r5 = r14.b
            avdv r5 = (defpackage.avdv) r5
            r2.getClass()
            r23 = r12
            int r12 = r5.a
            r24 = 1
            r12 = r12 | 1
            r5.a = r12
            r5.b = r2
            goto L_0x0510
        L_0x050a:
            r21 = r2
        L_0x050c:
            r22 = r5
            r23 = r12
        L_0x0510:
            boolean r2 = r13.a()
            if (r2 == 0) goto L_0x0536
            java.lang.String r2 = r13.b
            if (r2 == 0) goto L_0x0536
            boolean r5 = r14.c
            if (r5 != 0) goto L_0x051f
            goto L_0x0525
        L_0x051f:
            r14.c()
            r5 = 0
            r14.c = r5
        L_0x0525:
            aucj r5 = r14.b
            avdv r5 = (defpackage.avdv) r5
            r2.getClass()
            int r12 = r5.a
            r17 = 2
            r12 = r12 | 2
            r5.a = r12
            r5.c = r2
        L_0x0536:
            if (r3 == 0) goto L_0x05a6
            java.lang.String r2 = r13.a
            java.lang.Object r2 = r3.get(r2)
            zuf r2 = (defpackage.zuf) r2
            if (r2 == 0) goto L_0x05a3
            java.lang.Long r5 = r2.b
            long r12 = r5.longValue()
            boolean r5 = r14.c
            if (r5 != 0) goto L_0x054d
            goto L_0x0553
        L_0x054d:
            r14.c()
            r5 = 0
            r14.c = r5
        L_0x0553:
            aucj r5 = r14.b
            avdv r5 = (defpackage.avdv) r5
            r24 = r3
            int r3 = r5.a
            r3 = r3 | 4
            r5.a = r3
            r5.e = r12
            java.lang.Long r3 = r2.c
            long r12 = r3.longValue()
            boolean r3 = r14.c
            if (r3 != 0) goto L_0x056c
            goto L_0x0572
        L_0x056c:
            r14.c()
            r3 = 0
            r14.c = r3
        L_0x0572:
            aucj r3 = r14.b
            avdv r3 = (defpackage.avdv) r3
            int r5 = r3.a
            r5 = r5 | 8
            r3.a = r5
            r3.f = r12
            java.util.Set r3 = r2.a
            r14.a(r3)
            boolean r3 = defpackage.azdq.i()
            if (r3 == 0) goto L_0x05a8
            boolean r2 = r2.d
            boolean r3 = r14.c
            if (r3 != 0) goto L_0x0590
            goto L_0x0596
        L_0x0590:
            r14.c()
            r3 = 0
            r14.c = r3
        L_0x0596:
            aucj r3 = r14.b
            avdv r3 = (defpackage.avdv) r3
            int r5 = r3.a
            r5 = r5 | 32
            r3.a = r5
            r3.g = r2
            goto L_0x05a8
        L_0x05a3:
            r24 = r3
            goto L_0x05a8
        L_0x05a6:
            r24 = r3
        L_0x05a8:
            r10.a((defpackage.avdu) r14)
            r2 = r21
            r5 = r22
            r12 = r23
            r3 = r24
            goto L_0x04c9
        L_0x05b5:
            r21 = r2
            r22 = r5
            java.lang.Object r2 = r15.get(r9)
            java.util.Map r2 = (java.util.Map) r2
            java.util.List r3 = r8.d
            amzy r3 = defpackage.amzy.a((java.util.Collection) r3)
            java.util.Set r3 = b(r3)
            boolean r5 = r10.c
            if (r5 != 0) goto L_0x05ce
            goto L_0x05d4
        L_0x05ce:
            r10.c()
            r5 = 0
            r10.c = r5
        L_0x05d4:
            aucj r5 = r10.b
            avdf r5 = (defpackage.avdf) r5
            aucx r12 = defpackage.aucj.s()
            r5.g = r12
            java.util.Iterator r3 = r3.iterator()
        L_0x05e2:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x06a3
            java.lang.Object r5 = r3.next()
            ztl r5 = (defpackage.ztl) r5
            avds r12 = defpackage.avds.h
            aucd r12 = r12.o()
            avdr r12 = (defpackage.avdr) r12
            boolean r13 = r5.b()
            if (r13 == 0) goto L_0x061f
            java.lang.String r13 = r5.a
            if (r13 == 0) goto L_0x061f
            boolean r14 = r12.c
            if (r14 != 0) goto L_0x0605
            goto L_0x060b
        L_0x0605:
            r12.c()
            r14 = 0
            r12.c = r14
        L_0x060b:
            aucj r14 = r12.b
            avds r14 = (defpackage.avds) r14
            r13.getClass()
            r23 = r3
            int r3 = r14.a
            r24 = 1
            r3 = r3 | 1
            r14.a = r3
            r14.b = r13
            goto L_0x0621
        L_0x061f:
            r23 = r3
        L_0x0621:
            boolean r3 = r5.a()
            if (r3 == 0) goto L_0x0647
            java.lang.String r3 = r5.b
            if (r3 == 0) goto L_0x0647
            boolean r13 = r12.c
            if (r13 != 0) goto L_0x0630
            goto L_0x0636
        L_0x0630:
            r12.c()
            r13 = 0
            r12.c = r13
        L_0x0636:
            aucj r13 = r12.b
            avds r13 = (defpackage.avds) r13
            r3.getClass()
            int r14 = r13.a
            r17 = 2
            r14 = r14 | 2
            r13.a = r14
            r13.c = r3
        L_0x0647:
            if (r2 == 0) goto L_0x0698
            java.lang.String r3 = r5.a
            java.lang.Object r3 = r2.get(r3)
            zuf r3 = (defpackage.zuf) r3
            if (r3 == 0) goto L_0x0695
            java.lang.Long r5 = r3.b
            long r13 = r5.longValue()
            boolean r5 = r12.c
            if (r5 != 0) goto L_0x065e
            goto L_0x0664
        L_0x065e:
            r12.c()
            r5 = 0
            r12.c = r5
        L_0x0664:
            aucj r5 = r12.b
            avds r5 = (defpackage.avds) r5
            r24 = r2
            int r2 = r5.a
            r2 = r2 | 4
            r5.a = r2
            r5.e = r13
            java.lang.Long r2 = r3.c
            long r13 = r2.longValue()
            boolean r2 = r12.c
            if (r2 != 0) goto L_0x067d
            goto L_0x0683
        L_0x067d:
            r12.c()
            r2 = 0
            r12.c = r2
        L_0x0683:
            aucj r2 = r12.b
            avds r2 = (defpackage.avds) r2
            int r5 = r2.a
            r5 = r5 | 8
            r2.a = r5
            r2.f = r13
            java.util.Set r2 = r3.a
            r12.a(r2)
            goto L_0x069a
        L_0x0695:
            r24 = r2
            goto L_0x069a
        L_0x0698:
            r24 = r2
        L_0x069a:
            r10.a((defpackage.avdr) r12)
            r3 = r23
            r2 = r24
            goto L_0x05e2
        L_0x06a3:
            java.lang.Object r2 = r4.get(r9)
            java.util.Map r2 = (java.util.Map) r2
            java.util.List r3 = r8.e
            amzy r3 = defpackage.amzy.a((java.util.Collection) r3)
            java.util.Set r3 = b(r3)
            boolean r5 = r10.c
            if (r5 != 0) goto L_0x06b8
            goto L_0x06be
        L_0x06b8:
            r10.c()
            r5 = 0
            r10.c = r5
        L_0x06be:
            aucj r5 = r10.b
            avdf r5 = (defpackage.avdf) r5
            aucx r8 = defpackage.aucj.s()
            r5.h = r8
            java.util.Iterator r3 = r3.iterator()
        L_0x06cc:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x073d
            java.lang.Object r5 = r3.next()
            ztl r5 = (defpackage.ztl) r5
            avdx r8 = defpackage.avdx.f
            aucd r8 = r8.o()
            avdw r8 = (defpackage.avdw) r8
            boolean r12 = r5.b()
            if (r12 == 0) goto L_0x0706
            java.lang.String r12 = r5.a
            if (r12 == 0) goto L_0x0706
            boolean r13 = r8.c
            if (r13 != 0) goto L_0x06ef
            goto L_0x06f5
        L_0x06ef:
            r8.c()
            r13 = 0
            r8.c = r13
        L_0x06f5:
            aucj r13 = r8.b
            avdx r13 = (defpackage.avdx) r13
            r12.getClass()
            int r14 = r13.a
            r23 = 1
            r14 = r14 | 1
            r13.a = r14
            r13.b = r12
        L_0x0706:
            boolean r12 = r5.a()
            if (r12 == 0) goto L_0x072c
            java.lang.String r12 = r5.b
            if (r12 == 0) goto L_0x072c
            boolean r13 = r8.c
            if (r13 != 0) goto L_0x0715
            goto L_0x071b
        L_0x0715:
            r8.c()
            r13 = 0
            r8.c = r13
        L_0x071b:
            aucj r13 = r8.b
            avdx r13 = (defpackage.avdx) r13
            r12.getClass()
            int r14 = r13.a
            r17 = 2
            r14 = r14 | 2
            r13.a = r14
            r13.c = r12
        L_0x072c:
            if (r2 == 0) goto L_0x0739
            java.lang.String r5 = r5.a
            java.lang.Object r5 = r2.get(r5)
            java.util.Set r5 = (java.util.Set) r5
            r8.a(r5)
        L_0x0739:
            r10.a((defpackage.avdw) r8)
            goto L_0x06cc
        L_0x073d:
            if (r11 == 0) goto L_0x0746
            java.lang.Object r2 = r11.get(r9)
            java.util.List r2 = (java.util.List) r2
            goto L_0x0748
        L_0x0746:
            r2 = r20
        L_0x0748:
            if (r2 == 0) goto L_0x0a78
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            boolean r5 = r10.c
            if (r5 == 0) goto L_0x0759
            r10.c()
            r5 = 0
            r10.c = r5
        L_0x0759:
            aucj r5 = r10.b
            avdf r5 = (defpackage.avdf) r5
            aucx r8 = defpackage.aucj.s()
            r5.k = r8
            r5 = 0
        L_0x0764:
            int r8 = r2.size()
            if (r5 >= r8) goto L_0x0a73
            java.lang.Object r8 = r2.get(r5)
            zuh r8 = (defpackage.zuh) r8
            avdz r9 = defpackage.avdz.r
            aucd r9 = r9.o()
            java.lang.Long r12 = r8.a
            long r12 = r12.longValue()
            boolean r14 = r9.c
            if (r14 != 0) goto L_0x0781
            goto L_0x0787
        L_0x0781:
            r9.c()
            r14 = 0
            r9.c = r14
        L_0x0787:
            aucj r14 = r9.b
            avdz r14 = (defpackage.avdz) r14
            r23 = r2
            int r2 = r14.a
            r24 = 1
            r2 = r2 | 1
            r14.a = r2
            r14.b = r12
            java.lang.String r12 = r8.g
            if (r12 == 0) goto L_0x0804
            r12.getClass()
            r2 = r2 | 8
            r14.a = r2
            r14.c = r12
            boolean r2 = defpackage.azdq.h()
            if (r2 == 0) goto L_0x0804
            aucj r2 = r9.b
            avdz r2 = (defpackage.avdz) r2
            java.lang.String r2 = r2.c
            java.lang.Object r2 = r3.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x07d6
            boolean r2 = r2.booleanValue()
            boolean r12 = r9.c
            if (r12 != 0) goto L_0x07c1
            goto L_0x07c7
        L_0x07c1:
            r9.c()
            r12 = 0
            r9.c = r12
        L_0x07c7:
            aucj r12 = r9.b
            avdz r12 = (defpackage.avdz) r12
            int r13 = r12.a
            r14 = 32768(0x8000, float:4.5918E-41)
            r13 = r13 | r14
            r12.a = r13
            r12.m = r2
            goto L_0x0804
        L_0x07d6:
            android.content.Context r2 = r1.a
            aucj r12 = r9.b
            avdz r12 = (defpackage.avdz) r12
            java.lang.String r12 = r12.c
            boolean r2 = defpackage.aeku.a(r2, r12)
            boolean r12 = r9.c
            if (r12 != 0) goto L_0x07e7
            goto L_0x07ed
        L_0x07e7:
            r9.c()
            r12 = 0
            r9.c = r12
        L_0x07ed:
            aucj r12 = r9.b
            avdz r12 = (defpackage.avdz) r12
            int r13 = r12.a
            r14 = 32768(0x8000, float:4.5918E-41)
            r13 = r13 | r14
            r12.a = r13
            r12.m = r2
            java.lang.String r12 = r12.c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3.put(r12, r2)
        L_0x0804:
            java.lang.String r2 = r8.h
            if (r2 == 0) goto L_0x0822
            boolean r12 = r9.c
            if (r12 != 0) goto L_0x080d
            goto L_0x0813
        L_0x080d:
            r9.c()
            r12 = 0
            r9.c = r12
        L_0x0813:
            aucj r12 = r9.b
            avdz r12 = (defpackage.avdz) r12
            r2.getClass()
            int r13 = r12.a
            r13 = r13 | 16
            r12.a = r13
            r12.d = r2
        L_0x0822:
            java.lang.String r2 = r8.n
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0848
            java.lang.String r2 = r8.n
            if (r2 == 0) goto L_0x0848
            boolean r12 = r9.c
            if (r12 != 0) goto L_0x0833
            goto L_0x0839
        L_0x0833:
            r9.c()
            r12 = 0
            r9.c = r12
        L_0x0839:
            aucj r12 = r9.b
            avdz r12 = (defpackage.avdz) r12
            r2.getClass()
            int r13 = r12.a
            r13 = r13 | 128(0x80, float:1.794E-43)
            r12.a = r13
            r12.f = r2
        L_0x0848:
            boolean r2 = r8.l
            if (r2 == 0) goto L_0x0864
            boolean r2 = r9.c
            if (r2 != 0) goto L_0x0851
            goto L_0x0857
        L_0x0851:
            r9.c()
            r2 = 0
            r9.c = r2
        L_0x0857:
            aucj r2 = r9.b
            avdz r2 = (defpackage.avdz) r2
            int r12 = r2.a
            r12 = r12 | 16384(0x4000, float:2.2959E-41)
            r2.a = r12
            r12 = 1
            r2.l = r12
        L_0x0864:
            boolean r2 = defpackage.azdq.l()
            if (r2 == 0) goto L_0x0888
            avea r2 = r8.o
            if (r2 == 0) goto L_0x0888
            boolean r12 = r9.c
            if (r12 != 0) goto L_0x0873
            goto L_0x0879
        L_0x0873:
            r9.c()
            r12 = 0
            r9.c = r12
        L_0x0879:
            aucj r12 = r9.b
            avdz r12 = (defpackage.avdz) r12
            r2.getClass()
            r12.j = r2
            int r2 = r12.a
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            r12.a = r2
        L_0x0888:
            java.lang.Long r2 = r8.j
            long r12 = r2.longValue()
            boolean r2 = r9.c
            if (r2 != 0) goto L_0x0893
            goto L_0x0899
        L_0x0893:
            r9.c()
            r2 = 0
            r9.c = r2
        L_0x0899:
            aucj r2 = r9.b
            avdz r2 = (defpackage.avdz) r2
            int r14 = r2.a
            r14 = r14 | 1024(0x400, float:1.435E-42)
            r2.a = r14
            r2.h = r12
            java.lang.Long r2 = r8.k
            long r12 = r2.longValue()
            long r12 = r12 / r18
            long r12 = r12 * r18
            boolean r2 = r9.c
            if (r2 != 0) goto L_0x08b4
            goto L_0x08ba
        L_0x08b4:
            r9.c()
            r2 = 0
            r9.c = r2
        L_0x08ba:
            aucj r2 = r9.b
            avdz r2 = (defpackage.avdz) r2
            int r14 = r2.a
            r14 = r14 | 2048(0x800, float:2.87E-42)
            r2.a = r14
            r2.i = r12
            int r12 = r8.p
            int r13 = r12 + -1
            if (r12 == 0) goto L_0x0a71
            r2.g = r13
            r12 = r14 | 512(0x200, float:7.175E-43)
            r2.a = r12
            java.lang.String r2 = r8.g
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x08fc
            java.lang.String r2 = r8.i
            if (r2 != 0) goto L_0x08fc
            java.lang.String r2 = r8.b
            if (r2 == 0) goto L_0x08fc
            boolean r12 = r9.c
            if (r12 != 0) goto L_0x08e7
            goto L_0x08ed
        L_0x08e7:
            r9.c()
            r12 = 0
            r9.c = r12
        L_0x08ed:
            aucj r12 = r9.b
            avdz r12 = (defpackage.avdz) r12
            r2.getClass()
            int r13 = r12.a
            r13 = r13 | 32
            r12.a = r13
            r12.e = r2
        L_0x08fc:
            azdt r2 = defpackage.azdt.a
            azdu r2 = r2.a()
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x092d
            java.lang.String r2 = r8.g
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x092d
            java.lang.String r2 = r8.b
            if (r2 == 0) goto L_0x092d
            boolean r2 = r9.c
            if (r2 != 0) goto L_0x0919
            goto L_0x091f
        L_0x0919:
            r9.c()
            r2 = 0
            r9.c = r2
        L_0x091f:
            aucj r2 = r9.b
            avdz r2 = (defpackage.avdz) r2
            int r12 = r2.a
            r13 = 65536(0x10000, float:9.18355E-41)
            r12 = r12 | r13
            r2.a = r12
            r12 = 1
            r2.n = r12
        L_0x092d:
            boolean r2 = defpackage.azdw.c()
            if (r2 == 0) goto L_0x0a36
            azdz r2 = defpackage.azdz.a
            azea r2 = r2.a()
            boolean r2 = r2.c()
            if (r2 != 0) goto L_0x094e
            java.lang.String r2 = r8.g
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x0948
            goto L_0x094e
        L_0x0948:
            r17 = 2
            r24 = 1
            goto L_0x0a15
        L_0x094e:
            aveb r2 = defpackage.aveb.g
            aucd r2 = r2.o()
            java.lang.String r12 = r8.b
            if (r12 == 0) goto L_0x0975
            boolean r13 = r2.c
            if (r13 != 0) goto L_0x095d
            goto L_0x0963
        L_0x095d:
            r2.c()
            r13 = 0
            r2.c = r13
        L_0x0963:
            aucj r13 = r2.b
            aveb r13 = (defpackage.aveb) r13
            r12.getClass()
            int r14 = r13.a
            r24 = 1
            r14 = r14 | 1
            r13.a = r14
            r13.b = r12
            goto L_0x0977
        L_0x0975:
            r24 = 1
        L_0x0977:
            java.lang.String r12 = r8.c
            if (r12 == 0) goto L_0x0998
            boolean r13 = r2.c
            if (r13 != 0) goto L_0x0980
            goto L_0x0986
        L_0x0980:
            r2.c()
            r13 = 0
            r2.c = r13
        L_0x0986:
            aucj r13 = r2.b
            aveb r13 = (defpackage.aveb) r13
            r12.getClass()
            int r14 = r13.a
            r17 = 2
            r14 = r14 | 2
            r13.a = r14
            r13.c = r12
            goto L_0x099a
        L_0x0998:
            r17 = 2
        L_0x099a:
            java.lang.String r12 = r8.d
            if (r12 == 0) goto L_0x09b8
            boolean r13 = r2.c
            if (r13 != 0) goto L_0x09a3
            goto L_0x09a9
        L_0x09a3:
            r2.c()
            r13 = 0
            r2.c = r13
        L_0x09a9:
            aucj r13 = r2.b
            aveb r13 = (defpackage.aveb) r13
            r12.getClass()
            int r14 = r13.a
            r14 = r14 | 4
            r13.a = r14
            r13.d = r12
        L_0x09b8:
            java.lang.String r12 = r8.e
            if (r12 == 0) goto L_0x09d6
            boolean r13 = r2.c
            if (r13 != 0) goto L_0x09c1
            goto L_0x09c7
        L_0x09c1:
            r2.c()
            r13 = 0
            r2.c = r13
        L_0x09c7:
            aucj r13 = r2.b
            aveb r13 = (defpackage.aveb) r13
            r12.getClass()
            int r14 = r13.a
            r14 = r14 | 8
            r13.a = r14
            r13.e = r12
        L_0x09d6:
            java.lang.String r12 = r8.f
            if (r12 == 0) goto L_0x09f4
            boolean r13 = r2.c
            if (r13 != 0) goto L_0x09df
            goto L_0x09e5
        L_0x09df:
            r2.c()
            r13 = 0
            r2.c = r13
        L_0x09e5:
            aucj r13 = r2.b
            aveb r13 = (defpackage.aveb) r13
            r12.getClass()
            int r14 = r13.a
            r14 = r14 | 16
            r13.a = r14
            r13.f = r12
        L_0x09f4:
            boolean r12 = r9.c
            if (r12 != 0) goto L_0x09f9
            goto L_0x09ff
        L_0x09f9:
            r9.c()
            r12 = 0
            r9.c = r12
        L_0x09ff:
            aucj r12 = r9.b
            avdz r12 = (defpackage.avdz) r12
            aucj r2 = r2.i()
            aveb r2 = (defpackage.aveb) r2
            r2.getClass()
            r12.o = r2
            int r2 = r12.a
            r13 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r13
            r12.a = r2
        L_0x0a15:
            boolean r2 = defpackage.azdz.b()
            if (r2 == 0) goto L_0x0a3a
            boolean r2 = r8.m
            boolean r12 = r9.c
            if (r12 != 0) goto L_0x0a22
            goto L_0x0a28
        L_0x0a22:
            r9.c()
            r12 = 0
            r9.c = r12
        L_0x0a28:
            aucj r12 = r9.b
            avdz r12 = (defpackage.avdz) r12
            int r13 = r12.a
            r14 = 524288(0x80000, float:7.34684E-40)
            r13 = r13 | r14
            r12.a = r13
            r12.q = r2
            goto L_0x0a3a
        L_0x0a36:
            r17 = 2
            r24 = 1
        L_0x0a3a:
            azdz r2 = defpackage.azdz.a
            azea r2 = r2.a()
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x0a65
            java.lang.String r2 = r8.i
            if (r2 == 0) goto L_0x0a65
            boolean r8 = r9.c
            if (r8 != 0) goto L_0x0a4f
            goto L_0x0a55
        L_0x0a4f:
            r9.c()
            r8 = 0
            r9.c = r8
        L_0x0a55:
            aucj r8 = r9.b
            avdz r8 = (defpackage.avdz) r8
            r2.getClass()
            int r12 = r8.a
            r13 = 262144(0x40000, float:3.67342E-40)
            r12 = r12 | r13
            r8.a = r12
            r8.p = r2
        L_0x0a65:
            defpackage.azeh.c()
            r10.a((defpackage.aucd) r9)
            int r5 = r5 + 1
            r2 = r23
            goto L_0x0764
        L_0x0a71:
            throw r20
        L_0x0a73:
            r17 = 2
            r24 = 1
            goto L_0x0a7c
        L_0x0a78:
            r17 = 2
            r24 = 1
        L_0x0a7c:
            r6.a((defpackage.avdd) r10)
            int r7 = r7 + 1
            r3 = r27
            r2 = r21
            r5 = r22
            goto L_0x03be
        L_0x0a89:
            android.content.Context r0 = r1.a
            avdq r0 = defpackage.zuj.a(r0)
            r2 = 5
            java.lang.Object r3 = r0.c(r2)
            aucd r3 = (defpackage.aucd) r3
            r3.a((defpackage.aucj) r0)
            avdk r3 = (defpackage.avdk) r3
            boolean r0 = defpackage.azdq.j()
            if (r0 != 0) goto L_0x0aa2
            goto L_0x0ac6
        L_0x0aa2:
            if (r30 == 0) goto L_0x0ac6
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0aa9
            goto L_0x0aaf
        L_0x0aa9:
            r3.c()
            r4 = 0
            r3.c = r4
        L_0x0aaf:
            aucj r0 = r3.b
            avdq r0 = (defpackage.avdq) r0
            avdq r4 = defpackage.avdq.A
            aucx r4 = defpackage.aucj.s()
            r0.q = r4
            avdt[] r0 = a((defpackage.aqxt[]) r30)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r3.a(r0)
        L_0x0ac6:
            aucj r0 = r3.b
            avdq r0 = (defpackage.avdq) r0
            long r4 = r0.i
            boolean r0 = r6.c
            if (r0 != 0) goto L_0x0ad1
            goto L_0x0ad7
        L_0x0ad1:
            r6.c()
            r7 = 0
            r6.c = r7
        L_0x0ad7:
            aucj r0 = r6.b
            avdi r0 = (defpackage.avdi) r0
            int r7 = r0.a
            r7 = r7 | 8
            r0.a = r7
            r0.e = r4
            aucj r4 = r3.b
            avdq r4 = (defpackage.avdq) r4
            long r4 = r4.j
            r7 = r7 | 32
            r0.a = r7
            r0.g = r4
            aucj r3 = r3.i()
            avdq r3 = (defpackage.avdq) r3
            r3.getClass()
            r0.f = r3
            int r3 = r0.a
            r3 = r3 | 16
            r0.a = r3
            boolean r0 = r6.c
            if (r0 != 0) goto L_0x0b05
            goto L_0x0b0b
        L_0x0b05:
            r6.c()
            r3 = 0
            r6.c = r3
        L_0x0b0b:
            aucj r0 = r6.b
            avdi r0 = (defpackage.avdi) r0
            aucv r3 = defpackage.aucj.r()
            r0.d = r3
            r4 = r28
            r6.a((java.lang.Iterable) r4)
            r7 = r29
            boolean r0 = r7.e
            if (r0 == 0) goto L_0x0b6f
            boolean r0 = r6.c
            if (r0 != 0) goto L_0x0b25
            goto L_0x0b2b
        L_0x0b25:
            r6.c()
            r3 = 0
            r6.c = r3
        L_0x0b2b:
            aucj r0 = r6.b
            avdi r0 = (defpackage.avdi) r0
            defpackage.avdi.a(r0)
            aucj r0 = r6.i()
            avdi r0 = (defpackage.avdi) r0
            aucx r0 = r0.b
            int r3 = r0.size()
            r4 = 0
            r9 = 0
        L_0x0b40:
            if (r9 >= r3) goto L_0x0b6f
            int r5 = r4 + 1
            java.lang.Object r7 = r0.get(r9)
            avdf r7 = (defpackage.avdf) r7
            java.lang.Object r8 = r7.c(r2)
            aucd r8 = (defpackage.aucd) r8
            r8.a((defpackage.aucj) r7)
            avdd r8 = (defpackage.avdd) r8
            boolean r7 = r8.c
            if (r7 != 0) goto L_0x0b5b
            r10 = 0
            goto L_0x0b61
        L_0x0b5b:
            r8.c()
            r10 = 0
            r8.c = r10
        L_0x0b61:
            aucj r7 = r8.b
            avdf r7 = (defpackage.avdf) r7
            defpackage.avdf.a(r7)
            r6.a(r4, r8)
            int r9 = r9 + 1
            r4 = r5
            goto L_0x0b40
        L_0x0b6f:
            aucj r0 = r6.i()
            avdi r0 = (defpackage.avdi) r0
            return r0
        L_0x0b76:
            r0 = move-exception
            r20 = r3
        L_0x0b79:
            if (r20 == 0) goto L_0x0b7e
            r20.close()
        L_0x0b7e:
            throw r0
        L_0x0b7f:
            r0 = move-exception
            r20 = r6
        L_0x0b82:
            if (r20 == 0) goto L_0x0b87
            r20.close()
        L_0x0b87:
            throw r0
        L_0x0b88:
            r0 = move-exception
            r20 = r6
        L_0x0b8b:
            if (r20 == 0) goto L_0x0b90
            r20.close()
        L_0x0b90:
            throw r0
        L_0x0b91:
            r4 = r28
            r7 = r29
            r8 = r2
            r10 = 0
            java.lang.Object r2 = r8.get(r5)
            zvb r2 = (defpackage.zvb) r2
            long r11 = r2.a
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r3.add(r2)
            int r5 = r5 + 1
            r2 = r8
            r4 = 0
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zui.a(java.util.List, java.util.Set, zuk, aqxt[]):avdi");
    }

    /* access modifiers changed from: package-private */
    public final boolean a(zuk zuk, avdi avdi, String str) {
        zuk zuk2 = zuk;
        avdi avdi2 = avdi;
        String str2 = str;
        aucx aucx = avdi2.b;
        int size = aucx.size();
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            byte[] k2 = ((avdf) aucx.get(i4)).k();
            if (this.h) {
                this.j.a();
            }
            boolean a = a(zuk2, k2, str2);
            if (!a) {
                i3++;
            } else {
                i2++;
            }
            z &= a;
            if (this.h) {
                this.j.a(this.a, "contacts_logger:log_contact");
            }
        }
        aucv aucv = avdi2.d;
        int size2 = aucv.size();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < size2) {
            long longValue = ((Long) aucv.get(i5)).longValue();
            avdd avdd = (avdd) avdf.q.o();
            if (avdd.c) {
                avdd.c();
                avdd.c = false;
            }
            avdf avdf = (avdf) avdd.b;
            aucv aucv2 = aucv;
            avdf.a |= 1;
            avdf.b = longValue;
            avdf.b(avdf);
            byte[] k3 = ((avdf) avdd.i()).k();
            if (this.h) {
                this.j.a();
            }
            boolean a2 = a(zuk2, k3, str2);
            if (!a2) {
                i7++;
            } else {
                i6++;
            }
            z &= a2;
            if (this.h) {
                this.j.a(this.a, "contacts_logger:log_delete");
            }
            i5++;
            aucv = aucv2;
        }
        zsi a3 = zsi.a();
        aucd o2 = aveg.q.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aveg aveg = (aveg) o2.b;
        aveg.e = i2;
        aveg.f = i3;
        aveg.g = i6;
        aveg.h = i7;
        aveg aveg2 = (aveg) o2.i();
        aucd o3 = aveu.p.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aveg2.getClass();
        ((aveu) o3.b).g = aveg2;
        a3.a(o3);
        avdq avdq = avdi2.f;
        if (avdq == null) {
            avdq = avdq.A;
        }
        byte[] k4 = avdq.k();
        if (azdq.g()) {
            this.j.a();
        }
        boolean a4 = zty.a(k4, str2, this.o) & z;
        if (this.h) {
            this.j.a(this.a, "contacts_logger:log_device_info");
        }
        return a4;
    }
}
