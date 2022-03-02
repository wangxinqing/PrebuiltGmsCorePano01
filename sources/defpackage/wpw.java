package defpackage;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.Build;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.provider.ContactsContract;
import android.util.Log;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: wpw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wpw {
    public static Set e;
    public int a = 20;
    public int b = 5;
    public final ydd c;
    public boolean d = true;
    public final Context f;
    public final wps g;
    public int h;
    public int i = 2;

    public wpw(Context context) {
        ydd ydd = new ydd(context);
        this.f = context;
        this.g = new wps();
        this.c = ydd;
        xip.a();
        this.h = 0;
    }

    public static boolean a(aqxx aqxx) {
        return !aqxx.g.isEmpty() && aqxx.g.matches(".*sim.*|.*SIM.*");
    }

    public final long a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Groups.CONTENT_URI).withValue("account_name", str2).withValue("account_type", "com.google").withValue("group_visible", 1).withValue("title", str).build());
        try {
            return Long.parseLong(this.f.getContentResolver().applyBatch("com.android.contacts", arrayList)[0].uri.getLastPathSegment());
        } catch (OperationApplicationException | RemoteException e2) {
            Log.e("WriteContactsHelper", "Failed to create new group for contacts to be restored.", e2);
            return -1;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.InterruptedException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: android.content.ContentResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v9, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v22, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v20, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v25, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v26, resolved type: java.util.HashMap} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x027b, code lost:
        r8 = java.lang.Long.valueOf(r4.getLong(r4.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x028d, code lost:
        if (r5.contains(r8) == false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x028f, code lost:
        r12 = r4.getString(r4.getColumnIndex("data1"));
        r13 = r4.getInt(r4.getColumnIndex("data2"));
        r14 = r4.getString(r4.getColumnIndex("data3"));
        r15 = r4.getInt(r4.getColumnIndex("is_primary"));
        r3 = r4.getInt(r4.getColumnIndex("is_super_primary"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02c5, code lost:
        if (r1.containsKey(r8) != false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02c7, code lost:
        r19 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02c9, code lost:
        r20 = r20;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r1.put(r8, new java.util.ArrayList());
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02d2, code lost:
        r19 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02d4, code lost:
        r8 = (java.util.List) r1.get(r8);
        r11 = defpackage.aqxv.f.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02e0, code lost:
        if (r12 == null) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02e2, code lost:
        r20 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02e4, code lost:
        r19 = r19;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02e6, code lost:
        if (r11.c != false) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02e9, code lost:
        r11.c();
        r11.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02f0, code lost:
        r12.getClass();
        ((defpackage.aqxv) r11.b).a = r12;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02fa, code lost:
        r20 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02fe, code lost:
        if (r11.c != false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0301, code lost:
        r11.c();
        r11.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0307, code lost:
        r1 = (defpackage.aqxv) r11.b;
        r1.c = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x030d, code lost:
        if (r14 == null) goto L_0x0314;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x030f, code lost:
        r14.getClass();
        r1.b = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0315, code lost:
        if (r15 != 1) goto L_0x0319;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0317, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0319, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x031a, code lost:
        r1.d = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x031c, code lost:
        if (r3 != 1) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x031e, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0320, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0321, code lost:
        r1.e = r3;
        r8.add((defpackage.aqxv) r11.i());
        r3 = r26;
        r11 = r19;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0334, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0335, code lost:
        r20 = r1;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0338, code lost:
        r20 = r1;
        r19 = r11;
        r3 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0341, code lost:
        r20 = r1;
        r19 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0346, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0347, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x034a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x034b, code lost:
        r20 = r1;
        r19 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x034f, code lost:
        r1 = r0;
        r20 = r20;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0351, code lost:
        r20 = r1;
        r19 = r11;
        android.util.Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch Postal info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x035c, code lost:
        if (r4 != null) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0363, code lost:
        r0 = e;
        r20 = r20;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0365, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0366, code lost:
        r1 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x036a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x036b, code lost:
        r20 = r1;
        r19 = r11;
        r1 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        android.util.Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching postal info", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0378, code lost:
        if (r4 != null) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        r1 = r2.c(r5);
        r3 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r4 = r2.a("vnd.android.cursor.item/relation", defpackage.ydl.g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x038c, code lost:
        if (r4 == null) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0392, code lost:
        if (r4.moveToNext() == false) goto L_0x0429;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0394, code lost:
        r8 = java.lang.Long.valueOf(r4.getLong(r4.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03a6, code lost:
        if (r5.contains(r8) == false) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03a8, code lost:
        r11 = r4.getString(r4.getColumnIndex("data1"));
        r12 = r4.getInt(r4.getColumnIndex("data2"));
        r13 = r4.getString(r4.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03ca, code lost:
        if (r3.containsKey(r8) != false) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03cc, code lost:
        r3.put(r8, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03d4, code lost:
        r8 = (java.util.ArrayList) r3.get(r8);
        r14 = defpackage.aqyc.d.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03e0, code lost:
        if (r11 == null) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03e4, code lost:
        if (r14.c != false) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03e7, code lost:
        r14.c();
        r14.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03ee, code lost:
        r11.getClass();
        ((defpackage.aqyc) r14.b).a = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03f9, code lost:
        if (r14.c != false) goto L_0x03fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03fc, code lost:
        r14.c();
        r14.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0402, code lost:
        r11 = (defpackage.aqyc) r14.b;
        r11.b = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0408, code lost:
        if (r13 != null) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x040b, code lost:
        r13.getClass();
        r11.c = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0410, code lost:
        r8.add((defpackage.aqyc) r14.i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x041b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x041c, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x041f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0420, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0422, code lost:
        android.util.Log.w("ReadContactsHelper", "Could not query CP2 to fetch relation info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0429, code lost:
        if (r4 != null) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0430, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0431, code lost:
        r1 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0435, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0436, code lost:
        r8 = r0;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        android.util.Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching relation info", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x043f, code lost:
        if (r4 != null) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        r4 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:?, code lost:
        r8 = r2.a("vnd.android.cursor.item/photo", defpackage.ydl.k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x044f, code lost:
        if (r8 == null) goto L_0x04ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0455, code lost:
        if (r8.moveToNext() == false) goto L_0x04c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0457, code lost:
        r11 = java.lang.Long.valueOf(r8.getLong(r8.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0469, code lost:
        if (r5.contains(r11) == false) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x046b, code lost:
        r12 = r8.getString(r8.getColumnIndex("photo_uri"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0479, code lost:
        if (android.text.TextUtils.isEmpty(r12) != false) goto L_0x0451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x047f, code lost:
        if (r4.containsKey(r11) != false) goto L_0x0489;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0481, code lost:
        r4.put(r11, new java.util.ArrayList());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0489, code lost:
        r11 = (java.util.List) r4.get(r11);
        r13 = defpackage.aqyb.b.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0497, code lost:
        if (r13.c != false) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x049a, code lost:
        r13.c();
        r13.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04a0, code lost:
        r12.getClass();
        ((defpackage.aqyb) r13.b).a = r12;
        r11.add((defpackage.aqyb) r13.i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04b4, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04b8, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04ba, code lost:
        android.util.Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch Photo info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04c1, code lost:
        if (r8 != null) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04c9, code lost:
        r1 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04ce, code lost:
        r11 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        android.util.Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching photo url info", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04d7, code lost:
        if (r8 != null) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        r8 = r2.a("vnd.android.cursor.item/note", defpackage.ydl.j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04e2, code lost:
        if (r8 == null) goto L_0x0518;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04e8, code lost:
        if (r8.moveToNext() == false) goto L_0x051f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04ea, code lost:
        r11 = java.lang.Long.valueOf(r8.getLong(r8.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04fc, code lost:
        if (r7.containsKey(r11) == false) goto L_0x04e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04fe, code lost:
        ((defpackage.ydk) r7.get(r11)).f = r8.getString(r8.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0511, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0512, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0515, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0516, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0518, code lost:
        android.util.Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch Note info; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x051f, code lost:
        if (r8 != null) goto L_0x0522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0526, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0527, code lost:
        r1 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x052b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x052c, code lost:
        r11 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:?, code lost:
        android.util.Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching note info", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0535, code lost:
        if (r8 != null) goto L_0x0522;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        r2.b((java.util.Map) r7);
        r2.a((java.util.Map) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0542, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0544, code lost:
        r8 = android.os.Build.VERSION.SDK_INT;
        r8 = defpackage.ydl.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0549, code lost:
        r8 = defpackage.ydl.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x054b, code lost:
        r8 = r2.a("vnd.android.cursor.item/name", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0551, code lost:
        if (r8 == null) goto L_0x06e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0557, code lost:
        if (r8.moveToNext() == false) goto L_0x06f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0559, code lost:
        r12 = java.lang.Long.valueOf(r8.getLong(r8.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x056b, code lost:
        if (r7.containsKey(r12) == false) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x056d, code lost:
        r13 = defpackage.aqyd.l.o();
        r14 = r8.getString(r8.getColumnIndex("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x057f, code lost:
        if (r13.c != false) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0582, code lost:
        r13.c();
        r13.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0588, code lost:
        r14.getClass();
        ((defpackage.aqyd) r13.b).a = r14;
        r14 = r8.getString(r8.getColumnIndex("data2"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x059d, code lost:
        if (r13.c != false) goto L_0x05a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05a0, code lost:
        r13.c();
        r13.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05a6, code lost:
        r14.getClass();
        ((defpackage.aqyd) r13.b).b = r14;
        r14 = r8.getString(r8.getColumnIndex("data5"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05bb, code lost:
        if (r13.c != false) goto L_0x05be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05be, code lost:
        r13.c();
        r13.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05c4, code lost:
        r14.getClass();
        ((defpackage.aqyd) r13.b).c = r14;
        r14 = r8.getString(r8.getColumnIndex("data3"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05d9, code lost:
        if (r13.c != false) goto L_0x05dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05dc, code lost:
        r13.c();
        r13.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x05e2, code lost:
        r14.getClass();
        ((defpackage.aqyd) r13.b).d = r14;
        r14 = android.os.Build.VERSION.SDK_INT;
        r14 = java.lang.Integer.valueOf(r8.getInt(r8.getColumnIndex("data10"))).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0601, code lost:
        if (r13.c != false) goto L_0x0604;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0604, code lost:
        r13.c();
        r13.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x060a, code lost:
        ((defpackage.aqyd) r13.b).e = r14;
        r14 = r8.getString(r8.getColumnIndex("data4"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x061c, code lost:
        if (r13.c != false) goto L_0x061f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x061f, code lost:
        r13.c();
        r13.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0625, code lost:
        r14.getClass();
        ((defpackage.aqyd) r13.b).f = r14;
        r14 = r8.getString(r8.getColumnIndex("data6"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x063a, code lost:
        if (r13.c != false) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x063d, code lost:
        r13.c();
        r13.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0643, code lost:
        r14.getClass();
        ((defpackage.aqyd) r13.b).g = r14;
        r14 = r8.getString(r8.getColumnIndex("data7"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0658, code lost:
        if (r13.c != false) goto L_0x065b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x065b, code lost:
        r13.c();
        r13.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0661, code lost:
        r14.getClass();
        ((defpackage.aqyd) r13.b).h = r14;
        r14 = r8.getString(r8.getColumnIndex("data8"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0676, code lost:
        if (r13.c != false) goto L_0x0679;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0679, code lost:
        r13.c();
        r13.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x067f, code lost:
        r14.getClass();
        ((defpackage.aqyd) r13.b).i = r14;
        r14 = r8.getString(r8.getColumnIndex("data9"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0694, code lost:
        if (r13.c != false) goto L_0x0697;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0697, code lost:
        r13.c();
        r13.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x069d, code lost:
        r14.getClass();
        ((defpackage.aqyd) r13.b).j = r14;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x06ad, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x06bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x06af, code lost:
        r15 = java.lang.Integer.valueOf(r8.getInt(r8.getColumnIndex("data11")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06bd, code lost:
        r14 = r15.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06c3, code lost:
        if (r13.c != false) goto L_0x06c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x06c6, code lost:
        r13.c();
        r13.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x06cc, code lost:
        ((defpackage.aqyd) r13.b).k = r14;
        ((defpackage.ydk) r7.get(r12)).k = (defpackage.aqyd) r13.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x06e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x06e3, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06e7, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x06e9, code lost:
        android.util.Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch structured name; disabled? Give up.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x06f0, code lost:
        if (r8 == null) goto L_0x0707;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x06f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x06f4, code lost:
        r1 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x06f8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x06f9, code lost:
        r11 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:?, code lost:
        android.util.Log.e("ReadContactsHelper", "ContentResolver.query threw an exception when fetching note info", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0702, code lost:
        if (r8 != null) goto L_0x0704;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0707, code lost:
        defpackage.xip.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0716, code lost:
        if (((java.lang.Boolean) defpackage.xfz.a.a()).booleanValue() != false) goto L_0x0719;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:?, code lost:
        r8 = r2.a("vnd.android.cursor.item/group_membership", defpackage.ydl.n);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0721, code lost:
        if (r8 == null) goto L_0x075e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0727, code lost:
        if (r8.moveToNext() == false) goto L_0x0765;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0729, code lost:
        r11 = java.lang.Long.valueOf(r8.getLong(r8.getColumnIndex("raw_contact_id")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x073b, code lost:
        if (r7.containsKey(r11) == false) goto L_0x0723;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x073d, code lost:
        ((defpackage.ydk) r7.get(r11)).n.add(java.lang.Long.valueOf(r8.getLong(r8.getColumnIndex("data1"))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0757, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0758, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x075b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x075c, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x075e, code lost:
        android.util.Log.w("ReadContactsHelper", "Could not query ContactsProvider to fetch group membership info.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0765, code lost:
        if (r8 == null) goto L_0x077d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x076b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x076c, code lost:
        r1 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0770, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0771, code lost:
        r11 = r0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:?, code lost:
        android.util.Log.e("ReadContactsHelper", "CP2 threw an exception when fetching group membership info", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x077a, code lost:
        if (r8 != null) goto L_0x0767;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:?, code lost:
        r8 = new defpackage.aqxx[r7.size()];
        r11 = defpackage.ydl.a();
        r5 = r5.iterator();
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0790, code lost:
        if (r5.hasNext() == false) goto L_0x0a88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0792, code lost:
        r13 = (java.lang.Long) r5.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x079c, code lost:
        if (java.lang.Thread.interrupted() != false) goto L_0x0a82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x079e, code lost:
        r14 = (defpackage.ydk) r7.get(r13);
        r15 = (defpackage.aqxw) defpackage.aqxx.E.o();
        r17 = r7;
        r21 = r8;
        r7 = r13.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x07b6, code lost:
        if (r15.c != false) goto L_0x07b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x07b9, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x07bf, code lost:
        r13 = (defpackage.aqxx) r15.b;
        r13.m = r7;
        r7 = r14.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x07c7, code lost:
        if (r7 == null) goto L_0x07ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x07c9, code lost:
        r7.getClass();
        r13.l = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x07ce, code lost:
        r7 = r14.b.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x07d6, code lost:
        if (r15.c != false) goto L_0x07d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x07d9, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x07df, code lost:
        ((defpackage.aqxx) r15.b).n = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x07eb, code lost:
        if (android.text.TextUtils.isEmpty(r14.d) == false) goto L_0x07ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x07ee, code lost:
        r7 = r14.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x07f2, code lost:
        if (r15.c != false) goto L_0x07f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x07f5, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x07fb, code lost:
        r7.getClass();
        ((defpackage.aqxx) r15.b).g = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x080a, code lost:
        if (android.text.TextUtils.isEmpty(r14.g) == false) goto L_0x080d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x080d, code lost:
        r7 = r14.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0811, code lost:
        if (r15.c != false) goto L_0x0814;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0814, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x081a, code lost:
        r7.getClass();
        ((defpackage.aqxx) r15.b).a = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0829, code lost:
        if (android.text.TextUtils.isEmpty(r14.h) == false) goto L_0x082c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x082c, code lost:
        r7 = r14.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0830, code lost:
        if (r15.c != false) goto L_0x0833;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0833, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0839, code lost:
        r7.getClass();
        ((defpackage.aqxx) r15.b).b = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0848, code lost:
        if (android.text.TextUtils.isEmpty(r14.f) != false) goto L_0x0860;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x084a, code lost:
        r7 = r14.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x084e, code lost:
        if (r15.c != false) goto L_0x0851;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0851, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0857, code lost:
        r7.getClass();
        ((defpackage.aqxx) r15.b).o = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0860, code lost:
        r7 = r14.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0862, code lost:
        if (r7 == null) goto L_0x0882;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x086a, code lost:
        if (android.text.TextUtils.isEmpty(r7.a) != false) goto L_0x0882;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x086c, code lost:
        r7 = r14.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0870, code lost:
        if (r15.c != false) goto L_0x0873;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0873, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0879, code lost:
        r7.getClass();
        ((defpackage.aqxx) r15.b).r = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0882, code lost:
        r7 = r14.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0884, code lost:
        if (r7 == null) goto L_0x089a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0888, code lost:
        if (r15.c != false) goto L_0x088b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x088b, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0891, code lost:
        r7.getClass();
        ((defpackage.aqxx) r15.b).c = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x089a, code lost:
        r7 = r14.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x089c, code lost:
        if (r7 == null) goto L_0x08b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x08a0, code lost:
        if (r15.c != false) goto L_0x08a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x08a3, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x08aa, code lost:
        r7.getClass();
        ((defpackage.aqxx) r15.b).u = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x08b7, code lost:
        if (r14.a() != false) goto L_0x08ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x08ba, code lost:
        r7 = r14.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x08be, code lost:
        if (r15.c != false) goto L_0x08c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x08c1, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x08c7, code lost:
        r7.getClass();
        ((defpackage.aqxx) r15.b).x = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x08d6, code lost:
        if (r14.n.isEmpty() != false) goto L_0x08ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x08d8, code lost:
        r15.b(defpackage.aook.a(defpackage.jhx.a((java.lang.Long[]) r14.n.toArray(new java.lang.Long[0]))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x08ee, code lost:
        r7 = r14.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x08f5, code lost:
        if (r7 > 0) goto L_0x08f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x08fa, code lost:
        if (r15.c != false) goto L_0x08fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x08fd, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0903, code lost:
        ((defpackage.aqxx) r15.b).h = r7;
        r7 = r14.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x090d, code lost:
        if (r7 <= 1240790401000L) goto L_0x092a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0915, code lost:
        if (r7 >= java.lang.System.currentTimeMillis()) goto L_0x092a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0917, code lost:
        r7 = r14.l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x091b, code lost:
        if (r15.c != false) goto L_0x091e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x091e, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0924, code lost:
        ((defpackage.aqxx) r15.b).i = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x092a, code lost:
        r7 = (defpackage.ydj) r6.get(r14.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0932, code lost:
        if (r7 != null) goto L_0x0939;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0934, code lost:
        r22 = r5;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x093d, code lost:
        if (r7.b() <= 0) goto L_0x098a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x093f, code lost:
        r8 = r7.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0945, code lost:
        if (r15.c != false) goto L_0x0948;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0948, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x094e, code lost:
        ((defpackage.aqxx) r15.b).j = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x095a, code lost:
        if (r7.c() <= 1240790401000L) goto L_0x0986;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0966, code lost:
        if (r7.c() >= java.lang.System.currentTimeMillis()) goto L_0x0982;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0968, code lost:
        r8 = r5;
        r13 = r6;
        r5 = r7.c();
        r22 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0972, code lost:
        if (r15.c != false) goto L_0x0975;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0975, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x097b, code lost:
        ((defpackage.aqxx) r15.b).k = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0982, code lost:
        r22 = r5;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0986, code lost:
        r22 = r5;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x098a, code lost:
        r22 = r5;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x098d, code lost:
        if (r11 == false) goto L_0x09a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x098f, code lost:
        r5 = r7.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0995, code lost:
        if (r15.c != false) goto L_0x0998;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0998, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x099e, code lost:
        ((defpackage.aqxx) r15.b).D = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x09a4, code lost:
        r5 = r7.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x09aa, code lost:
        if (r15.c != false) goto L_0x09ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x09ad, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x09b3, code lost:
        ((defpackage.aqxx) r15.b).s = r5;
        r5 = r7.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x09bf, code lost:
        if (r15.c != false) goto L_0x09c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x09c2, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x09c8, code lost:
        ((defpackage.aqxx) r15.b).z = r5;
        r5 = r7.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x09d4, code lost:
        if (r15.c != false) goto L_0x09d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x09d7, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x09dd, code lost:
        ((defpackage.aqxx) r15.b).A = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x09e3, code lost:
        r5 = (java.util.List) r9.get(r14.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x09eb, code lost:
        if (r5 != null) goto L_0x09ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x09ee, code lost:
        r15.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x09f1, code lost:
        r5 = (java.util.List) r10.get(r14.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x09f9, code lost:
        if (r5 != null) goto L_0x09fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x09fc, code lost:
        r15.d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x09ff, code lost:
        r6 = r19;
        r5 = (java.util.List) r6.get(r14.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0a09, code lost:
        if (r5 != null) goto L_0x0a0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0a0c, code lost:
        r15.g(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0a0f, code lost:
        r5 = (java.util.List) r1.get(r14.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0a17, code lost:
        if (r5 != null) goto L_0x0a1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0a1a, code lost:
        r15.c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0a1d, code lost:
        r5 = (java.util.List) r3.get(r14.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0a25, code lost:
        if (r5 != null) goto L_0x0a28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0a28, code lost:
        r15.f(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0a2b, code lost:
        r7 = r20;
        r5 = (java.util.List) r7.get(r14.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0a35, code lost:
        if (r5 != null) goto L_0x0a38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0a38, code lost:
        r15.e(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0a3b, code lost:
        r5 = (java.util.List) r4.get(r14.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0a43, code lost:
        if (r5 == null) goto L_0x0a6a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0a47, code lost:
        if (r15.c != false) goto L_0x0a4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0a4b, code lost:
        r15.c();
        r15.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0a51, code lost:
        r14 = (defpackage.aqxx) r15.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0a5b, code lost:
        if (r14.y.a() != false) goto L_0x0a65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0a5d, code lost:
        r14.y = defpackage.aucj.a(r14.y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0a65, code lost:
        defpackage.auab.a((java.lang.Iterable) r5, (java.util.List) r14.y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0a6a, code lost:
        r21[r12] = (defpackage.aqxx) r15.i();
        r19 = r6;
        r20 = r7;
        r12 = r12 + 1;
        r6 = r13;
        r7 = r17;
        r8 = r21;
        r5 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0a87, code lost:
        throw new java.lang.InterruptedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0a88, code lost:
        r21 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:?, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:?, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:?, code lost:
        r1 = (defpackage.aqxa) defpackage.aqxb.c.o();
        r1.a(java.util.Arrays.asList(r21));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0aa1, code lost:
        return (defpackage.aqxb) r1.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0aa2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0aa3, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0aa6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0aa7, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0aa8, code lost:
        if (r8 != null) goto L_0x0aaa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0aad, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0aae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0aaf, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0ab0, code lost:
        if (r8 != null) goto L_0x0ab2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0ab2, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0ab5, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0ab6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0ab7, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0ab8, code lost:
        if (r8 != null) goto L_0x0aba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0aba, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0abd, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0abe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0abf, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0ac0, code lost:
        if (r8 != null) goto L_0x0ac2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0ac2, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0ac5, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0ac6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0ac7, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0ac8, code lost:
        if (r4 != null) goto L_0x0aca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0aca, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0acd, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0ace, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0acf, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0ad0, code lost:
        if (r4 != null) goto L_0x0ad2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0ad2, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x0ad5, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x0b7e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x0b7f, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:?, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:647:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x0b83, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x0b84, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x0275, code lost:
        r20 = r20;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:676:0x0275, code lost:
        r19 = r19;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0241, code lost:
        if (r12 == null) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0257, code lost:
        if (r12 != null) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r1 = new java.util.HashMap();
        r19 = r2.a.getContentResolver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r20 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI;
        r4 = r19.query(r20, defpackage.ydl.i, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null);
        r19 = r19;
        r20 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0273, code lost:
        if (r4 == null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0275, code lost:
        r20 = r20;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0279, code lost:
        if (r4.moveToNext() == false) goto L_0x0341;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0346 A[Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }, ExcHandler: all (r0v47 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }]), Splitter:B:97:0x0275] */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x0aaa A[SYNTHETIC, Splitter:B:563:0x0aaa] */
    /* JADX WARNING: Removed duplicated region for block: B:569:0x0ab2 A[Catch:{ all -> 0x0aae, all -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x0aba A[Catch:{ all -> 0x0aae, all -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:579:0x0ac2 A[Catch:{ all -> 0x0aae, all -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:584:0x0aca A[Catch:{ all -> 0x0aae, all -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:589:0x0ad2 A[Catch:{ all -> 0x0aae, all -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:594:0x0ada A[Catch:{ all -> 0x0aae, all -> 0x0b7e }] */
    /* JADX WARNING: Removed duplicated region for block: B:615:0x0b2a A[SYNTHETIC, Splitter:B:615:0x0b2a] */
    /* JADX WARNING: Removed duplicated region for block: B:637:0x0b7a A[SYNTHETIC, Splitter:B:637:0x0b7a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aqxb a() {
        /*
            r26 = this;
            ydl r2 = new ydl     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
            r3 = r26
            android.content.Context r4 = r3.f     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
            r2.<init>(r4)     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
            monitor-enter(r2)     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
            r4 = 1
            defpackage.iva.a((boolean) r4)     // Catch:{ all -> 0x0b88 }
            monitor-exit(r2)     // Catch:{ all -> 0x0b88 }
            ydg r5 = new ydg     // Catch:{ all -> 0x0b7e }
            android.content.Context r6 = r2.a     // Catch:{ all -> 0x0b7e }
            r5.<init>(r6)     // Catch:{ all -> 0x0b7e }
            r5.a()     // Catch:{ all -> 0x0b7e }
            java.lang.String r5 = "0"
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0b7e }
            r6.<init>()     // Catch:{ all -> 0x0b7e }
            android.net.Uri r7 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ all -> 0x0b7e }
            android.net.Uri$Builder r7 = r7.buildUpon()     // Catch:{ all -> 0x0b7e }
            java.lang.String r8 = "directory"
            android.net.Uri$Builder r5 = r7.appendQueryParameter(r8, r5)     // Catch:{ all -> 0x0b7e }
            android.net.Uri r8 = r5.build()     // Catch:{ all -> 0x0b7e }
            boolean r5 = defpackage.ydl.a()     // Catch:{ SQLiteException -> 0x0b47, all -> 0x0b43 }
            if (r5 != 0) goto L_0x003a
            java.lang.String[] r5 = defpackage.ydl.b     // Catch:{ SQLiteException -> 0x0b47, all -> 0x0b43 }
            r9 = r5
            goto L_0x003d
        L_0x003a:
            java.lang.String[] r5 = defpackage.ydl.c     // Catch:{ SQLiteException -> 0x0b47, all -> 0x0b43 }
            r9 = r5
        L_0x003d:
            android.content.Context r5 = r2.a     // Catch:{ SQLiteException -> 0x0b47, all -> 0x0b43 }
            android.content.ContentResolver r7 = r5.getContentResolver()     // Catch:{ SQLiteException -> 0x0b47, all -> 0x0b43 }
            r10 = 0
            r11 = 0
            r12 = 0
            android.database.Cursor r5 = r7.query(r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0b47, all -> 0x0b43 }
            if (r5 == 0) goto L_0x0b34
        L_0x004c:
            boolean r7 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            if (r7 == 0) goto L_0x00c9
            java.lang.String r7 = "_id"
            int r7 = r5.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            long r19 = r5.getLong(r7)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            java.lang.String r7 = "times_contacted"
            int r7 = r5.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            int r11 = r5.getInt(r7)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            java.lang.String r7 = "last_time_contacted"
            int r7 = r5.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            long r12 = r5.getLong(r7)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            java.lang.String r7 = "starred"
            int r7 = r5.getColumnIndex(r7)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            int r7 = r5.getInt(r7)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            java.lang.String r9 = "custom_ringtone"
            int r9 = r5.getColumnIndex(r9)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            java.lang.String r9 = r5.getString(r9)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            java.lang.String r10 = "send_to_voicemail"
            int r10 = r5.getColumnIndex(r10)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            int r10 = r5.getInt(r10)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            int r14 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            java.lang.String r14 = "contact_last_updated_timestamp"
            int r14 = r5.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            if (r14 < 0) goto L_0x00a5
            java.lang.String r14 = "contact_last_updated_timestamp"
            int r14 = r5.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            long r14 = r5.getLong(r14)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            r17 = r14
            goto L_0x00a9
        L_0x00a5:
            r14 = 0
            r17 = r14
        L_0x00a9:
            if (r7 != r4) goto L_0x00ad
            r14 = 1
            goto L_0x00ae
        L_0x00ad:
            r14 = 0
        L_0x00ae:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            r15 = r7 ^ 1
            if (r10 != r4) goto L_0x00b9
            r16 = 1
            goto L_0x00bb
        L_0x00b9:
            r16 = 0
        L_0x00bb:
            r9 = r19
            ydj r7 = defpackage.ydj.a(r9, r11, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            java.lang.Long r8 = java.lang.Long.valueOf(r19)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            r6.put(r8, r7)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            goto L_0x004c
        L_0x00c9:
            r5.close()     // Catch:{ all -> 0x0b7e }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0b7e }
            java.util.Set r7 = r6.keySet()     // Catch:{ all -> 0x0b7e }
            r5.<init>(r7)     // Catch:{ all -> 0x0b7e }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0b7e }
            r7.<init>()     // Catch:{ all -> 0x0b7e }
            android.content.Context r9 = r2.a     // Catch:{ all -> 0x0b7e }
            android.content.ContentResolver r10 = r9.getContentResolver()     // Catch:{ all -> 0x0b7e }
            android.net.Uri r11 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ SQLiteException -> 0x0af7, all -> 0x0af3 }
            java.lang.String[] r12 = defpackage.ydl.d     // Catch:{ SQLiteException -> 0x0af7, all -> 0x0af3 }
            r13 = 0
            r14 = 0
            r15 = 0
            android.database.Cursor r9 = r10.query(r11, r12, r13, r14, r15)     // Catch:{ SQLiteException -> 0x0af7, all -> 0x0af3 }
            if (r9 == 0) goto L_0x0ae4
        L_0x00ed:
            boolean r10 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            if (r10 == 0) goto L_0x017f
            java.lang.String r10 = "_id"
            int r10 = r9.getColumnIndex(r10)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            long r10 = r9.getLong(r10)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.String r11 = "contact_id"
            int r11 = r9.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            long r11 = r9.getLong(r11)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.Long r14 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            boolean r11 = r5.contains(r14)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            if (r11 == 0) goto L_0x00ed
            ydk r11 = new ydk     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.String r12 = "sourceid"
            int r12 = r9.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.String r15 = r9.getString(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.String r12 = "account_type"
            int r12 = r9.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.String r16 = r9.getString(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.String r12 = "account_name"
            int r12 = r9.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.String r17 = r9.getString(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.String r12 = "data_set"
            int r12 = r9.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            r9.getString(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.String r12 = "times_contacted"
            int r12 = r9.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            int r18 = r9.getInt(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.String r12 = "last_time_contacted"
            int r12 = r9.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            long r19 = r9.getLong(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.String r12 = "display_name"
            int r12 = r9.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.String r21 = r9.getString(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.String r12 = "display_name_alt"
            int r12 = r9.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.String r22 = r9.getString(r12)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            r12 = r11
            r13 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21, r22)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            boolean r12 = r7.containsKey(r10)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            if (r12 == 0) goto L_0x017a
            java.lang.String r10 = "ReadContactsHelper"
            java.lang.String r11 = "Raw contact id already exists, this should not happen."
            android.util.Log.e(r10, r11)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            goto L_0x00ed
        L_0x017a:
            r7.put(r10, r11)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            goto L_0x00ed
        L_0x017f:
            r9.close()     // Catch:{ all -> 0x0b7e }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0b7e }
            java.util.Set r9 = r7.keySet()     // Catch:{ all -> 0x0b7e }
            r5.<init>(r9)     // Catch:{ all -> 0x0b7e }
            java.util.Map r9 = r2.a((java.util.HashSet) r5)     // Catch:{ all -> 0x0b7e }
            java.util.Map r10 = r2.b((java.util.HashSet) r5)     // Catch:{ all -> 0x0b7e }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x0b7e }
            r11.<init>()     // Catch:{ all -> 0x0b7e }
            java.lang.String r12 = "vnd.android.cursor.item/website"
            java.lang.String[] r13 = defpackage.ydl.e     // Catch:{ SQLiteException -> 0x024d, all -> 0x0248 }
            android.database.Cursor r12 = r2.a(r12, r13)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0248 }
            if (r12 == 0) goto L_0x023a
        L_0x01a2:
            boolean r13 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            if (r13 == 0) goto L_0x0241
            java.lang.String r13 = "raw_contact_id"
            int r13 = r12.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            long r13 = r12.getLong(r13)     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            boolean r14 = r5.contains(r13)     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            if (r14 == 0) goto L_0x0230
            java.lang.String r14 = "data1"
            int r14 = r12.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            java.lang.String r14 = r12.getString(r14)     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            java.lang.String r15 = "data2"
            int r15 = r12.getColumnIndex(r15)     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            int r15 = r12.getInt(r15)     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            java.lang.String r1 = "data3"
            int r1 = r12.getColumnIndex(r1)     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            java.lang.String r1 = r12.getString(r1)     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            boolean r17 = r11.containsKey(r13)     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            if (r17 != 0) goto L_0x01e8
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            r11.put(r13, r4)     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
        L_0x01e8:
            java.lang.Object r4 = r11.get(r13)     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            aqye r13 = defpackage.aqye.d     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            aucd r13 = r13.o()     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            if (r14 == 0) goto L_0x020b
            boolean r8 = r13.c     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            if (r8 != 0) goto L_0x01fb
        L_0x01fa:
            goto L_0x0202
        L_0x01fb:
            r13.c()     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            r8 = 0
            r13.c = r8     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            goto L_0x01fa
        L_0x0202:
            aucj r8 = r13.b     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            aqye r8 = (defpackage.aqye) r8     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            r14.getClass()     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            r8.a = r14     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
        L_0x020b:
            boolean r8 = r13.c     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            if (r8 != 0) goto L_0x0210
            goto L_0x0216
        L_0x0210:
            r13.c()     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            r8 = 0
            r13.c = r8     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
        L_0x0216:
            aucj r8 = r13.b     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            aqye r8 = (defpackage.aqye) r8     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            r8.b = r15     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            if (r1 != 0) goto L_0x021f
            goto L_0x0224
        L_0x021f:
            r1.getClass()     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            r8.c = r1     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
        L_0x0224:
            aucj r1 = r13.i()     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            aqye r1 = (defpackage.aqye) r1     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            r4.add(r1)     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
            r4 = 1
            goto L_0x01a2
        L_0x0230:
            r4 = 1
            goto L_0x01a2
        L_0x0233:
            r0 = move-exception
            r1 = r0
            goto L_0x0ad8
        L_0x0237:
            r0 = move-exception
            r1 = r0
            goto L_0x0250
        L_0x023a:
            java.lang.String r1 = "ReadContactsHelper"
            java.lang.String r4 = "Could not query ContactsProvider to fetch Website info; disabled? Give up."
            android.util.Log.w(r1, r4)     // Catch:{ SQLiteException -> 0x0237, all -> 0x0233 }
        L_0x0241:
            if (r12 != 0) goto L_0x0244
            goto L_0x025a
        L_0x0244:
            r12.close()     // Catch:{ all -> 0x0b7e }
            goto L_0x025a
        L_0x0248:
            r0 = move-exception
            r1 = r0
            r12 = 0
            goto L_0x0ad8
        L_0x024d:
            r0 = move-exception
            r1 = r0
            r12 = 0
        L_0x0250:
            java.lang.String r4 = "ReadContactsHelper"
            java.lang.String r8 = "ContentResolver.query threw an exception when fetching website info"
            android.util.Log.e(r4, r8, r1)     // Catch:{ all -> 0x0ad6 }
            if (r12 == 0) goto L_0x025a
            goto L_0x0244
        L_0x025a:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0b7e }
            r1.<init>()     // Catch:{ all -> 0x0b7e }
            android.content.Context r4 = r2.a     // Catch:{ all -> 0x0b7e }
            android.content.ContentResolver r19 = r4.getContentResolver()     // Catch:{ all -> 0x0b7e }
            android.net.Uri r20 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI     // Catch:{ SQLiteException -> 0x036a, all -> 0x0365 }
            java.lang.String[] r21 = defpackage.ydl.i     // Catch:{ SQLiteException -> 0x036a, all -> 0x0365 }
            r22 = 0
            r23 = 0
            r24 = 0
            android.database.Cursor r4 = r19.query(r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x036a, all -> 0x0365 }
            if (r4 == 0) goto L_0x0351
        L_0x0275:
            boolean r8 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            if (r8 == 0) goto L_0x0341
            java.lang.String r8 = "raw_contact_id"
            int r8 = r4.getColumnIndex(r8)     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            long r12 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            java.lang.Long r8 = java.lang.Long.valueOf(r12)     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            boolean r12 = r5.contains(r8)     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            if (r12 == 0) goto L_0x0338
            java.lang.String r12 = "data1"
            int r12 = r4.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            java.lang.String r12 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            java.lang.String r13 = "data2"
            int r13 = r4.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            int r13 = r4.getInt(r13)     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            java.lang.String r14 = "data3"
            int r14 = r4.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            java.lang.String r14 = r4.getString(r14)     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            java.lang.String r15 = "is_primary"
            int r15 = r4.getColumnIndex(r15)     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            int r15 = r4.getInt(r15)     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            java.lang.String r3 = "is_super_primary"
            int r3 = r4.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            int r3 = r4.getInt(r3)     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            boolean r19 = r1.containsKey(r8)     // Catch:{ SQLiteException -> 0x034a, all -> 0x0346 }
            if (r19 != 0) goto L_0x02d2
            r19 = r11
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0334, all -> 0x0346 }
            r11.<init>()     // Catch:{ SQLiteException -> 0x0334, all -> 0x0346 }
            r1.put(r8, r11)     // Catch:{ SQLiteException -> 0x0334, all -> 0x0346 }
            goto L_0x02d4
        L_0x02d2:
            r19 = r11
        L_0x02d4:
            java.lang.Object r8 = r1.get(r8)     // Catch:{ SQLiteException -> 0x0334, all -> 0x0346 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ SQLiteException -> 0x0334, all -> 0x0346 }
            aqxv r11 = defpackage.aqxv.f     // Catch:{ SQLiteException -> 0x0334, all -> 0x0346 }
            aucd r11 = r11.o()     // Catch:{ SQLiteException -> 0x0334, all -> 0x0346 }
            if (r12 == 0) goto L_0x02fa
            r20 = r1
            boolean r1 = r11.c     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            if (r1 != 0) goto L_0x02e9
        L_0x02e8:
            goto L_0x02f0
        L_0x02e9:
            r11.c()     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            r1 = 0
            r11.c = r1     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            goto L_0x02e8
        L_0x02f0:
            aucj r1 = r11.b     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            aqxv r1 = (defpackage.aqxv) r1     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            r12.getClass()     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            r1.a = r12     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            goto L_0x02fc
        L_0x02fa:
            r20 = r1
        L_0x02fc:
            boolean r1 = r11.c     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            if (r1 != 0) goto L_0x0301
            goto L_0x0307
        L_0x0301:
            r11.c()     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            r1 = 0
            r11.c = r1     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
        L_0x0307:
            aucj r1 = r11.b     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            aqxv r1 = (defpackage.aqxv) r1     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            r1.c = r13     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            if (r14 == 0) goto L_0x0314
            r14.getClass()     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            r1.b = r14     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
        L_0x0314:
            r12 = 1
            if (r15 != r12) goto L_0x0319
            r13 = 1
            goto L_0x031a
        L_0x0319:
            r13 = 0
        L_0x031a:
            r1.d = r13     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            if (r3 != r12) goto L_0x0320
            r3 = 1
            goto L_0x0321
        L_0x0320:
            r3 = 0
        L_0x0321:
            r1.e = r3     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            aucj r1 = r11.i()     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            aqxv r1 = (defpackage.aqxv) r1     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            r8.add(r1)     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
            r3 = r26
            r11 = r19
            r1 = r20
            goto L_0x0275
        L_0x0334:
            r0 = move-exception
            r20 = r1
            goto L_0x034f
        L_0x0338:
            r20 = r1
            r19 = r11
            r12 = 1
            r3 = r26
            goto L_0x0275
        L_0x0341:
            r20 = r1
            r19 = r11
            goto L_0x035c
        L_0x0346:
            r0 = move-exception
            r1 = r0
            goto L_0x0ad0
        L_0x034a:
            r0 = move-exception
            r20 = r1
            r19 = r11
        L_0x034f:
            r1 = r0
            goto L_0x0371
        L_0x0351:
            r20 = r1
            r19 = r11
            java.lang.String r1 = "ReadContactsHelper"
            java.lang.String r3 = "Could not query ContactsProvider to fetch Postal info; disabled? Give up."
            android.util.Log.w(r1, r3)     // Catch:{ SQLiteException -> 0x0363, all -> 0x0346 }
        L_0x035c:
            if (r4 != 0) goto L_0x035f
            goto L_0x037b
        L_0x035f:
            r4.close()     // Catch:{ all -> 0x0b7e }
            goto L_0x037b
        L_0x0363:
            r0 = move-exception
            goto L_0x034f
        L_0x0365:
            r0 = move-exception
            r1 = r0
            r4 = 0
            goto L_0x0ad0
        L_0x036a:
            r0 = move-exception
            r20 = r1
            r19 = r11
            r1 = r0
            r4 = 0
        L_0x0371:
            java.lang.String r3 = "ReadContactsHelper"
            java.lang.String r8 = "ContentResolver.query threw an exception when fetching postal info"
            android.util.Log.e(r3, r8, r1)     // Catch:{ all -> 0x0ace }
            if (r4 == 0) goto L_0x037b
            goto L_0x035f
        L_0x037b:
            java.util.Map r1 = r2.c(r5)     // Catch:{ all -> 0x0b7e }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0b7e }
            r3.<init>()     // Catch:{ all -> 0x0b7e }
            java.lang.String r4 = "vnd.android.cursor.item/relation"
            java.lang.String[] r8 = defpackage.ydl.g     // Catch:{ SQLiteException -> 0x0435, all -> 0x0430 }
            android.database.Cursor r4 = r2.a(r4, r8)     // Catch:{ SQLiteException -> 0x0435, all -> 0x0430 }
            if (r4 == 0) goto L_0x0422
        L_0x038e:
            boolean r8 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            if (r8 == 0) goto L_0x0429
            java.lang.String r8 = "raw_contact_id"
            int r8 = r4.getColumnIndex(r8)     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            long r11 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            boolean r11 = r5.contains(r8)     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            if (r11 == 0) goto L_0x038e
            java.lang.String r11 = "data1"
            int r11 = r4.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            java.lang.String r11 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            java.lang.String r12 = "data2"
            int r12 = r4.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            int r12 = r4.getInt(r12)     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            java.lang.String r13 = "data3"
            int r13 = r4.getColumnIndex(r13)     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            java.lang.String r13 = r4.getString(r13)     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            boolean r14 = r3.containsKey(r8)     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            if (r14 != 0) goto L_0x03d4
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            r14.<init>()     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            r3.put(r8, r14)     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
        L_0x03d4:
            java.lang.Object r8 = r3.get(r8)     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            aqyc r14 = defpackage.aqyc.d     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            aucd r14 = r14.o()     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            if (r11 == 0) goto L_0x03f7
            boolean r15 = r14.c     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            if (r15 != 0) goto L_0x03e7
        L_0x03e6:
            goto L_0x03ee
        L_0x03e7:
            r14.c()     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            r15 = 0
            r14.c = r15     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            goto L_0x03e6
        L_0x03ee:
            aucj r15 = r14.b     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            aqyc r15 = (defpackage.aqyc) r15     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            r11.getClass()     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            r15.a = r11     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
        L_0x03f7:
            boolean r11 = r14.c     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            if (r11 != 0) goto L_0x03fc
            goto L_0x0402
        L_0x03fc:
            r14.c()     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            r11 = 0
            r14.c = r11     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
        L_0x0402:
            aucj r11 = r14.b     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            aqyc r11 = (defpackage.aqyc) r11     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            r11.b = r12     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            if (r13 != 0) goto L_0x040b
            goto L_0x0410
        L_0x040b:
            r13.getClass()     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            r11.c = r13     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
        L_0x0410:
            aucj r11 = r14.i()     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            aqyc r11 = (defpackage.aqyc) r11     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            r8.add(r11)     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
            goto L_0x038e
        L_0x041b:
            r0 = move-exception
            r1 = r0
            goto L_0x0ac8
        L_0x041f:
            r0 = move-exception
            r8 = r0
            goto L_0x0438
        L_0x0422:
            java.lang.String r8 = "ReadContactsHelper"
            java.lang.String r11 = "Could not query CP2 to fetch relation info; disabled? Give up."
            android.util.Log.w(r8, r11)     // Catch:{ SQLiteException -> 0x041f, all -> 0x041b }
        L_0x0429:
            if (r4 != 0) goto L_0x042c
            goto L_0x0442
        L_0x042c:
            r4.close()     // Catch:{ all -> 0x0b7e }
            goto L_0x0442
        L_0x0430:
            r0 = move-exception
            r1 = r0
            r4 = 0
            goto L_0x0ac8
        L_0x0435:
            r0 = move-exception
            r8 = r0
            r4 = 0
        L_0x0438:
            java.lang.String r11 = "ReadContactsHelper"
            java.lang.String r12 = "ContentResolver.query threw an exception when fetching relation info"
            android.util.Log.e(r11, r12, r8)     // Catch:{ all -> 0x0ac6 }
            if (r4 == 0) goto L_0x0442
            goto L_0x042c
        L_0x0442:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0b7e }
            r4.<init>()     // Catch:{ all -> 0x0b7e }
            java.lang.String r8 = "vnd.android.cursor.item/photo"
            java.lang.String[] r11 = defpackage.ydl.k     // Catch:{ SQLiteException -> 0x04cd, all -> 0x04c8 }
            android.database.Cursor r8 = r2.a(r8, r11)     // Catch:{ SQLiteException -> 0x04cd, all -> 0x04c8 }
            if (r8 == 0) goto L_0x04ba
        L_0x0451:
            boolean r11 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            if (r11 == 0) goto L_0x04c1
            java.lang.String r11 = "raw_contact_id"
            int r11 = r8.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            long r11 = r8.getLong(r11)     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            boolean r12 = r5.contains(r11)     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            if (r12 == 0) goto L_0x0451
            java.lang.String r12 = "photo_uri"
            int r12 = r8.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            java.lang.String r12 = r8.getString(r12)     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            if (r13 != 0) goto L_0x0451
            boolean r13 = r4.containsKey(r11)     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            if (r13 != 0) goto L_0x0489
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            r13.<init>()     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            r4.put(r11, r13)     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
        L_0x0489:
            java.lang.Object r11 = r4.get(r11)     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            aqyb r13 = defpackage.aqyb.b     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            aucd r13 = r13.o()     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            boolean r14 = r13.c     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            if (r14 != 0) goto L_0x049a
            goto L_0x04a0
        L_0x049a:
            r13.c()     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            r14 = 0
            r13.c = r14     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
        L_0x04a0:
            aucj r14 = r13.b     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            aqyb r14 = (defpackage.aqyb) r14     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            r12.getClass()     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            r14.a = r12     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            aucj r12 = r13.i()     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            aqyb r12 = (defpackage.aqyb) r12     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            r11.add(r12)     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
            goto L_0x0451
        L_0x04b3:
            r0 = move-exception
            r1 = r0
            goto L_0x0ac0
        L_0x04b7:
            r0 = move-exception
            r11 = r0
            goto L_0x04d0
        L_0x04ba:
            java.lang.String r11 = "ReadContactsHelper"
            java.lang.String r12 = "Could not query ContactsProvider to fetch Photo info; disabled? Give up."
            android.util.Log.w(r11, r12)     // Catch:{ SQLiteException -> 0x04b7, all -> 0x04b3 }
        L_0x04c1:
            if (r8 != 0) goto L_0x04c4
            goto L_0x04da
        L_0x04c4:
            r8.close()     // Catch:{ all -> 0x0b7e }
            goto L_0x04da
        L_0x04c8:
            r0 = move-exception
            r1 = r0
            r8 = 0
            goto L_0x0ac0
        L_0x04cd:
            r0 = move-exception
            r11 = r0
            r8 = 0
        L_0x04d0:
            java.lang.String r12 = "ReadContactsHelper"
            java.lang.String r13 = "ContentResolver.query threw an exception when fetching photo url info"
            android.util.Log.e(r12, r13, r11)     // Catch:{ all -> 0x0abe }
            if (r8 == 0) goto L_0x04da
            goto L_0x04c4
        L_0x04da:
            java.lang.String r8 = "vnd.android.cursor.item/note"
            java.lang.String[] r11 = defpackage.ydl.j     // Catch:{ SQLiteException -> 0x052b, all -> 0x0526 }
            android.database.Cursor r8 = r2.a(r8, r11)     // Catch:{ SQLiteException -> 0x052b, all -> 0x0526 }
            if (r8 == 0) goto L_0x0518
        L_0x04e4:
            boolean r11 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0515, all -> 0x0511 }
            if (r11 == 0) goto L_0x051f
            java.lang.String r11 = "raw_contact_id"
            int r11 = r8.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x0515, all -> 0x0511 }
            long r11 = r8.getLong(r11)     // Catch:{ SQLiteException -> 0x0515, all -> 0x0511 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteException -> 0x0515, all -> 0x0511 }
            boolean r12 = r7.containsKey(r11)     // Catch:{ SQLiteException -> 0x0515, all -> 0x0511 }
            if (r12 == 0) goto L_0x04e4
            java.lang.String r12 = "data1"
            int r12 = r8.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x0515, all -> 0x0511 }
            java.lang.String r12 = r8.getString(r12)     // Catch:{ SQLiteException -> 0x0515, all -> 0x0511 }
            java.lang.Object r11 = r7.get(r11)     // Catch:{ SQLiteException -> 0x0515, all -> 0x0511 }
            ydk r11 = (defpackage.ydk) r11     // Catch:{ SQLiteException -> 0x0515, all -> 0x0511 }
            r11.f = r12     // Catch:{ SQLiteException -> 0x0515, all -> 0x0511 }
            goto L_0x04e4
        L_0x0511:
            r0 = move-exception
            r1 = r0
            goto L_0x0ab8
        L_0x0515:
            r0 = move-exception
            r11 = r0
            goto L_0x052e
        L_0x0518:
            java.lang.String r11 = "ReadContactsHelper"
            java.lang.String r12 = "Could not query ContactsProvider to fetch Note info; disabled? Give up."
            android.util.Log.w(r11, r12)     // Catch:{ SQLiteException -> 0x0515, all -> 0x0511 }
        L_0x051f:
            if (r8 != 0) goto L_0x0522
            goto L_0x0538
        L_0x0522:
            r8.close()     // Catch:{ all -> 0x0b7e }
            goto L_0x0538
        L_0x0526:
            r0 = move-exception
            r1 = r0
            r8 = 0
            goto L_0x0ab8
        L_0x052b:
            r0 = move-exception
            r11 = r0
            r8 = 0
        L_0x052e:
            java.lang.String r12 = "ReadContactsHelper"
            java.lang.String r13 = "ContentResolver.query threw an exception when fetching note info"
            android.util.Log.e(r12, r13, r11)     // Catch:{ all -> 0x0ab6 }
            if (r8 == 0) goto L_0x0538
            goto L_0x0522
        L_0x0538:
            r2.b((java.util.Map) r7)     // Catch:{ all -> 0x0b7e }
            r2.a((java.util.Map) r7)     // Catch:{ all -> 0x0b7e }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x06f8, all -> 0x06f3 }
            r11 = 24
            if (r8 >= r11) goto L_0x0549
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x06f8, all -> 0x06f3 }
            java.lang.String[] r8 = defpackage.ydl.l     // Catch:{ SQLiteException -> 0x06f8, all -> 0x06f3 }
            goto L_0x054b
        L_0x0549:
            java.lang.String[] r8 = defpackage.ydl.m     // Catch:{ SQLiteException -> 0x06f8, all -> 0x06f3 }
        L_0x054b:
            java.lang.String r12 = "vnd.android.cursor.item/name"
            android.database.Cursor r8 = r2.a(r12, r8)     // Catch:{ SQLiteException -> 0x06f8, all -> 0x06f3 }
            if (r8 == 0) goto L_0x06e9
        L_0x0553:
            boolean r12 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            if (r12 == 0) goto L_0x06f0
            java.lang.String r12 = "raw_contact_id"
            int r12 = r8.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            long r12 = r8.getLong(r12)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            boolean r13 = r7.containsKey(r12)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            if (r13 == 0) goto L_0x0553
            aqyd r13 = defpackage.aqyd.l     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            aucd r13 = r13.o()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = "data1"
            int r14 = r8.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = r8.getString(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            boolean r15 = r13.c     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            if (r15 != 0) goto L_0x0582
            goto L_0x0588
        L_0x0582:
            r13.c()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15 = 0
            r13.c = r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
        L_0x0588:
            aucj r15 = r13.b     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            aqyd r15 = (defpackage.aqyd) r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r14.getClass()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15.a = r14     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = "data2"
            int r14 = r8.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = r8.getString(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            boolean r15 = r13.c     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            if (r15 != 0) goto L_0x05a0
            goto L_0x05a6
        L_0x05a0:
            r13.c()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15 = 0
            r13.c = r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
        L_0x05a6:
            aucj r15 = r13.b     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            aqyd r15 = (defpackage.aqyd) r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r14.getClass()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15.b = r14     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = "data5"
            int r14 = r8.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = r8.getString(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            boolean r15 = r13.c     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            if (r15 != 0) goto L_0x05be
            goto L_0x05c4
        L_0x05be:
            r13.c()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15 = 0
            r13.c = r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
        L_0x05c4:
            aucj r15 = r13.b     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            aqyd r15 = (defpackage.aqyd) r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r14.getClass()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15.c = r14     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = "data3"
            int r14 = r8.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = r8.getString(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            boolean r15 = r13.c     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            if (r15 != 0) goto L_0x05dc
            goto L_0x05e2
        L_0x05dc:
            r13.c()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15 = 0
            r13.c = r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
        L_0x05e2:
            aucj r15 = r13.b     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            aqyd r15 = (defpackage.aqyd) r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r14.getClass()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15.d = r14     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            int r14 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = "data10"
            int r14 = r8.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            int r14 = r8.getInt(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            int r14 = r14.intValue()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            boolean r15 = r13.c     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            if (r15 != 0) goto L_0x0604
            goto L_0x060a
        L_0x0604:
            r13.c()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15 = 0
            r13.c = r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
        L_0x060a:
            aucj r15 = r13.b     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            aqyd r15 = (defpackage.aqyd) r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15.e = r14     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = "data4"
            int r14 = r8.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = r8.getString(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            boolean r15 = r13.c     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            if (r15 != 0) goto L_0x061f
            goto L_0x0625
        L_0x061f:
            r13.c()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15 = 0
            r13.c = r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
        L_0x0625:
            aucj r15 = r13.b     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            aqyd r15 = (defpackage.aqyd) r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r14.getClass()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15.f = r14     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = "data6"
            int r14 = r8.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = r8.getString(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            boolean r15 = r13.c     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            if (r15 != 0) goto L_0x063d
            goto L_0x0643
        L_0x063d:
            r13.c()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15 = 0
            r13.c = r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
        L_0x0643:
            aucj r15 = r13.b     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            aqyd r15 = (defpackage.aqyd) r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r14.getClass()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15.g = r14     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = "data7"
            int r14 = r8.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = r8.getString(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            boolean r15 = r13.c     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            if (r15 != 0) goto L_0x065b
            goto L_0x0661
        L_0x065b:
            r13.c()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15 = 0
            r13.c = r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
        L_0x0661:
            aucj r15 = r13.b     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            aqyd r15 = (defpackage.aqyd) r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r14.getClass()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15.h = r14     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = "data8"
            int r14 = r8.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = r8.getString(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            boolean r15 = r13.c     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            if (r15 != 0) goto L_0x0679
            goto L_0x067f
        L_0x0679:
            r13.c()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15 = 0
            r13.c = r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
        L_0x067f:
            aucj r15 = r13.b     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            aqyd r15 = (defpackage.aqyd) r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r14.getClass()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15.i = r14     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = "data9"
            int r14 = r8.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.String r14 = r8.getString(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            boolean r15 = r13.c     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            if (r15 != 0) goto L_0x0697
            goto L_0x069d
        L_0x0697:
            r13.c()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15 = 0
            r13.c = r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
        L_0x069d:
            aucj r15 = r13.b     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            aqyd r15 = (defpackage.aqyd) r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r14.getClass()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15.j = r14     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r14 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            int r14 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            if (r14 < r11) goto L_0x06bd
            java.lang.String r14 = "data11"
            int r14 = r8.getColumnIndex(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            int r14 = r8.getInt(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
        L_0x06bd:
            int r14 = r15.intValue()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            boolean r15 = r13.c     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            if (r15 != 0) goto L_0x06c6
            goto L_0x06cc
        L_0x06c6:
            r13.c()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15 = 0
            r13.c = r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
        L_0x06cc:
            aucj r15 = r13.b     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            aqyd r15 = (defpackage.aqyd) r15     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r15.k = r14     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            java.lang.Object r12 = r7.get(r12)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            ydk r12 = (defpackage.ydk) r12     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            aucj r13 = r13.i()     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            aqyd r13 = (defpackage.aqyd) r13     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            r12.k = r13     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
            goto L_0x0553
        L_0x06e2:
            r0 = move-exception
            r1 = r0
            goto L_0x0ab0
        L_0x06e6:
            r0 = move-exception
            r11 = r0
            goto L_0x06fb
        L_0x06e9:
            java.lang.String r11 = "ReadContactsHelper"
            java.lang.String r12 = "Could not query ContactsProvider to fetch structured name; disabled? Give up."
            android.util.Log.w(r11, r12)     // Catch:{ SQLiteException -> 0x06e6, all -> 0x06e2 }
        L_0x06f0:
            if (r8 == 0) goto L_0x0707
            goto L_0x0704
        L_0x06f3:
            r0 = move-exception
            r1 = r0
            r8 = 0
            goto L_0x0ab0
        L_0x06f8:
            r0 = move-exception
            r11 = r0
            r8 = 0
        L_0x06fb:
            java.lang.String r12 = "ReadContactsHelper"
            java.lang.String r13 = "ContentResolver.query threw an exception when fetching note info"
            android.util.Log.e(r12, r13, r11)     // Catch:{ all -> 0x0aae }
            if (r8 == 0) goto L_0x0707
        L_0x0704:
            r8.close()     // Catch:{ all -> 0x0b7e }
        L_0x0707:
            defpackage.xip.a()     // Catch:{ all -> 0x0b7e }
            xfs r8 = defpackage.xfz.a     // Catch:{ all -> 0x0b7e }
            java.lang.Object r8 = r8.a()     // Catch:{ all -> 0x0b7e }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0b7e }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0b7e }
            if (r8 != 0) goto L_0x0719
            goto L_0x077d
        L_0x0719:
            java.lang.String r8 = "vnd.android.cursor.item/group_membership"
            java.lang.String[] r11 = defpackage.ydl.n     // Catch:{ SQLiteException -> 0x0770, all -> 0x076b }
            android.database.Cursor r8 = r2.a(r8, r11)     // Catch:{ SQLiteException -> 0x0770, all -> 0x076b }
            if (r8 == 0) goto L_0x075e
        L_0x0723:
            boolean r11 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x075b, all -> 0x0757 }
            if (r11 == 0) goto L_0x0765
            java.lang.String r11 = "raw_contact_id"
            int r11 = r8.getColumnIndex(r11)     // Catch:{ SQLiteException -> 0x075b, all -> 0x0757 }
            long r11 = r8.getLong(r11)     // Catch:{ SQLiteException -> 0x075b, all -> 0x0757 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteException -> 0x075b, all -> 0x0757 }
            boolean r12 = r7.containsKey(r11)     // Catch:{ SQLiteException -> 0x075b, all -> 0x0757 }
            if (r12 == 0) goto L_0x0723
            java.lang.String r12 = "data1"
            int r12 = r8.getColumnIndex(r12)     // Catch:{ SQLiteException -> 0x075b, all -> 0x0757 }
            long r12 = r8.getLong(r12)     // Catch:{ SQLiteException -> 0x075b, all -> 0x0757 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ SQLiteException -> 0x075b, all -> 0x0757 }
            java.lang.Object r11 = r7.get(r11)     // Catch:{ SQLiteException -> 0x075b, all -> 0x0757 }
            ydk r11 = (defpackage.ydk) r11     // Catch:{ SQLiteException -> 0x075b, all -> 0x0757 }
            java.util.List r11 = r11.n     // Catch:{ SQLiteException -> 0x075b, all -> 0x0757 }
            r11.add(r12)     // Catch:{ SQLiteException -> 0x075b, all -> 0x0757 }
            goto L_0x0723
        L_0x0757:
            r0 = move-exception
            r1 = r0
            goto L_0x0aa8
        L_0x075b:
            r0 = move-exception
            r11 = r0
            goto L_0x0773
        L_0x075e:
            java.lang.String r11 = "ReadContactsHelper"
            java.lang.String r12 = "Could not query ContactsProvider to fetch group membership info."
            android.util.Log.w(r11, r12)     // Catch:{ SQLiteException -> 0x075b, all -> 0x0757 }
        L_0x0765:
            if (r8 == 0) goto L_0x077d
        L_0x0767:
            r8.close()     // Catch:{ all -> 0x0b7e }
            goto L_0x077d
        L_0x076b:
            r0 = move-exception
            r1 = r0
            r8 = 0
            goto L_0x0aa8
        L_0x0770:
            r0 = move-exception
            r11 = r0
            r8 = 0
        L_0x0773:
            java.lang.String r12 = "ReadContactsHelper"
            java.lang.String r13 = "CP2 threw an exception when fetching group membership info"
            android.util.Log.e(r12, r13, r11)     // Catch:{ all -> 0x0aa6 }
            if (r8 == 0) goto L_0x077d
            goto L_0x0767
        L_0x077d:
            int r8 = r7.size()     // Catch:{ all -> 0x0b7e }
            aqxx[] r8 = new defpackage.aqxx[r8]     // Catch:{ all -> 0x0b7e }
            boolean r11 = defpackage.ydl.a()     // Catch:{ all -> 0x0b7e }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0b7e }
            r12 = 0
        L_0x078c:
            boolean r13 = r5.hasNext()     // Catch:{ all -> 0x0b7e }
            if (r13 == 0) goto L_0x0a88
            java.lang.Object r13 = r5.next()     // Catch:{ all -> 0x0b7e }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x0b7e }
            boolean r14 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0b7e }
            if (r14 != 0) goto L_0x0a82
            java.lang.Object r14 = r7.get(r13)     // Catch:{ all -> 0x0b7e }
            ydk r14 = (defpackage.ydk) r14     // Catch:{ all -> 0x0b7e }
            aqxx r15 = defpackage.aqxx.E     // Catch:{ all -> 0x0b7e }
            aucd r15 = r15.o()     // Catch:{ all -> 0x0b7e }
            aqxw r15 = (defpackage.aqxw) r15     // Catch:{ all -> 0x0b7e }
            r17 = r7
            r21 = r8
            long r7 = r13.longValue()     // Catch:{ all -> 0x0b7e }
            boolean r13 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r13 != 0) goto L_0x07b9
            goto L_0x07bf
        L_0x07b9:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r13 = 0
            r15.c = r13     // Catch:{ all -> 0x0b7e }
        L_0x07bf:
            aucj r13 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r13 = (defpackage.aqxx) r13     // Catch:{ all -> 0x0b7e }
            r13.m = r7     // Catch:{ all -> 0x0b7e }
            java.lang.String r7 = r14.c     // Catch:{ all -> 0x0b7e }
            if (r7 == 0) goto L_0x07ce
            r7.getClass()     // Catch:{ all -> 0x0b7e }
            r13.l = r7     // Catch:{ all -> 0x0b7e }
        L_0x07ce:
            java.lang.Long r7 = r14.b     // Catch:{ all -> 0x0b7e }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0b7e }
            boolean r13 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r13 != 0) goto L_0x07d9
            goto L_0x07df
        L_0x07d9:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r13 = 0
            r15.c = r13     // Catch:{ all -> 0x0b7e }
        L_0x07df:
            aucj r13 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r13 = (defpackage.aqxx) r13     // Catch:{ all -> 0x0b7e }
            r13.n = r7     // Catch:{ all -> 0x0b7e }
            java.lang.String r7 = r14.d     // Catch:{ all -> 0x0b7e }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b7e }
            if (r7 == 0) goto L_0x07ee
            goto L_0x0804
        L_0x07ee:
            java.lang.String r7 = r14.d     // Catch:{ all -> 0x0b7e }
            boolean r8 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r8 != 0) goto L_0x07f5
            goto L_0x07fb
        L_0x07f5:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r8 = 0
            r15.c = r8     // Catch:{ all -> 0x0b7e }
        L_0x07fb:
            aucj r8 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r8 = (defpackage.aqxx) r8     // Catch:{ all -> 0x0b7e }
            r7.getClass()     // Catch:{ all -> 0x0b7e }
            r8.g = r7     // Catch:{ all -> 0x0b7e }
        L_0x0804:
            java.lang.String r7 = r14.g     // Catch:{ all -> 0x0b7e }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b7e }
            if (r7 == 0) goto L_0x080d
            goto L_0x0823
        L_0x080d:
            java.lang.String r7 = r14.g     // Catch:{ all -> 0x0b7e }
            boolean r8 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r8 != 0) goto L_0x0814
            goto L_0x081a
        L_0x0814:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r8 = 0
            r15.c = r8     // Catch:{ all -> 0x0b7e }
        L_0x081a:
            aucj r8 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r8 = (defpackage.aqxx) r8     // Catch:{ all -> 0x0b7e }
            r7.getClass()     // Catch:{ all -> 0x0b7e }
            r8.a = r7     // Catch:{ all -> 0x0b7e }
        L_0x0823:
            java.lang.String r7 = r14.h     // Catch:{ all -> 0x0b7e }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b7e }
            if (r7 == 0) goto L_0x082c
            goto L_0x0842
        L_0x082c:
            java.lang.String r7 = r14.h     // Catch:{ all -> 0x0b7e }
            boolean r8 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r8 != 0) goto L_0x0833
            goto L_0x0839
        L_0x0833:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r8 = 0
            r15.c = r8     // Catch:{ all -> 0x0b7e }
        L_0x0839:
            aucj r8 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r8 = (defpackage.aqxx) r8     // Catch:{ all -> 0x0b7e }
            r7.getClass()     // Catch:{ all -> 0x0b7e }
            r8.b = r7     // Catch:{ all -> 0x0b7e }
        L_0x0842:
            java.lang.String r7 = r14.f     // Catch:{ all -> 0x0b7e }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b7e }
            if (r7 != 0) goto L_0x0860
            java.lang.String r7 = r14.f     // Catch:{ all -> 0x0b7e }
            boolean r8 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r8 != 0) goto L_0x0851
            goto L_0x0857
        L_0x0851:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r8 = 0
            r15.c = r8     // Catch:{ all -> 0x0b7e }
        L_0x0857:
            aucj r8 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r8 = (defpackage.aqxx) r8     // Catch:{ all -> 0x0b7e }
            r7.getClass()     // Catch:{ all -> 0x0b7e }
            r8.o = r7     // Catch:{ all -> 0x0b7e }
        L_0x0860:
            aqxz r7 = r14.i     // Catch:{ all -> 0x0b7e }
            if (r7 == 0) goto L_0x0882
            java.lang.String r7 = r7.a     // Catch:{ all -> 0x0b7e }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0b7e }
            if (r7 != 0) goto L_0x0882
            aqxz r7 = r14.i     // Catch:{ all -> 0x0b7e }
            boolean r8 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r8 != 0) goto L_0x0873
            goto L_0x0879
        L_0x0873:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r8 = 0
            r15.c = r8     // Catch:{ all -> 0x0b7e }
        L_0x0879:
            aucj r8 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r8 = (defpackage.aqxx) r8     // Catch:{ all -> 0x0b7e }
            r7.getClass()     // Catch:{ all -> 0x0b7e }
            r8.r = r7     // Catch:{ all -> 0x0b7e }
        L_0x0882:
            aqyd r7 = r14.k     // Catch:{ all -> 0x0b7e }
            if (r7 == 0) goto L_0x089a
            boolean r8 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r8 != 0) goto L_0x088b
            goto L_0x0891
        L_0x088b:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r8 = 0
            r15.c = r8     // Catch:{ all -> 0x0b7e }
        L_0x0891:
            aucj r8 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r8 = (defpackage.aqxx) r8     // Catch:{ all -> 0x0b7e }
            r7.getClass()     // Catch:{ all -> 0x0b7e }
            r8.c = r7     // Catch:{ all -> 0x0b7e }
        L_0x089a:
            aqya r7 = r14.j     // Catch:{ all -> 0x0b7e }
            if (r7 == 0) goto L_0x08b3
            boolean r8 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r8 != 0) goto L_0x08a3
        L_0x08a2:
            goto L_0x08aa
        L_0x08a3:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r8 = 0
            r15.c = r8     // Catch:{ all -> 0x0b7e }
            goto L_0x08a2
        L_0x08aa:
            aucj r8 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r8 = (defpackage.aqxx) r8     // Catch:{ all -> 0x0b7e }
            r7.getClass()     // Catch:{ all -> 0x0b7e }
            r8.u = r7     // Catch:{ all -> 0x0b7e }
        L_0x08b3:
            boolean r7 = r14.a()     // Catch:{ all -> 0x0b7e }
            if (r7 != 0) goto L_0x08ba
            goto L_0x08d0
        L_0x08ba:
            java.lang.String r7 = r14.e     // Catch:{ all -> 0x0b7e }
            boolean r8 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r8 != 0) goto L_0x08c1
            goto L_0x08c7
        L_0x08c1:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r8 = 0
            r15.c = r8     // Catch:{ all -> 0x0b7e }
        L_0x08c7:
            aucj r8 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r8 = (defpackage.aqxx) r8     // Catch:{ all -> 0x0b7e }
            r7.getClass()     // Catch:{ all -> 0x0b7e }
            r8.x = r7     // Catch:{ all -> 0x0b7e }
        L_0x08d0:
            java.util.List r7 = r14.n     // Catch:{ all -> 0x0b7e }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0b7e }
            if (r7 != 0) goto L_0x08ee
            java.util.List r7 = r14.n     // Catch:{ all -> 0x0b7e }
            r8 = 0
            java.lang.Long[] r13 = new java.lang.Long[r8]     // Catch:{ all -> 0x0b7e }
            java.lang.Object[] r7 = r7.toArray(r13)     // Catch:{ all -> 0x0b7e }
            java.lang.Long[] r7 = (java.lang.Long[]) r7     // Catch:{ all -> 0x0b7e }
            long[] r7 = defpackage.jhx.a((java.lang.Long[]) r7)     // Catch:{ all -> 0x0b7e }
            java.util.List r7 = defpackage.aook.a((long[]) r7)     // Catch:{ all -> 0x0b7e }
            r15.b(r7)     // Catch:{ all -> 0x0b7e }
        L_0x08ee:
            int r7 = r14.m     // Catch:{ all -> 0x0b7e }
            r22 = 1240790401000(0x120e4deffe8, double:6.130319108237E-312)
            if (r7 > 0) goto L_0x08f8
            goto L_0x092a
        L_0x08f8:
            boolean r8 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r8 != 0) goto L_0x08fd
            goto L_0x0903
        L_0x08fd:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r8 = 0
            r15.c = r8     // Catch:{ all -> 0x0b7e }
        L_0x0903:
            aucj r8 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r8 = (defpackage.aqxx) r8     // Catch:{ all -> 0x0b7e }
            r8.h = r7     // Catch:{ all -> 0x0b7e }
            long r7 = r14.l     // Catch:{ all -> 0x0b7e }
            int r13 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            if (r13 <= 0) goto L_0x092a
            long r24 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0b7e }
            int r13 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r13 >= 0) goto L_0x092a
            long r7 = r14.l     // Catch:{ all -> 0x0b7e }
            boolean r13 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r13 != 0) goto L_0x091e
            goto L_0x0924
        L_0x091e:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r13 = 0
            r15.c = r13     // Catch:{ all -> 0x0b7e }
        L_0x0924:
            aucj r13 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r13 = (defpackage.aqxx) r13     // Catch:{ all -> 0x0b7e }
            r13.i = r7     // Catch:{ all -> 0x0b7e }
        L_0x092a:
            java.lang.Long r7 = r14.b     // Catch:{ all -> 0x0b7e }
            java.lang.Object r7 = r6.get(r7)     // Catch:{ all -> 0x0b7e }
            ydj r7 = (defpackage.ydj) r7     // Catch:{ all -> 0x0b7e }
            if (r7 != 0) goto L_0x0939
            r22 = r5
            r13 = r6
            goto L_0x09e3
        L_0x0939:
            int r8 = r7.b()     // Catch:{ all -> 0x0b7e }
            if (r8 <= 0) goto L_0x098a
            int r8 = r7.b()     // Catch:{ all -> 0x0b7e }
            boolean r13 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r13 != 0) goto L_0x0948
            goto L_0x094e
        L_0x0948:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r13 = 0
            r15.c = r13     // Catch:{ all -> 0x0b7e }
        L_0x094e:
            aucj r13 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r13 = (defpackage.aqxx) r13     // Catch:{ all -> 0x0b7e }
            r13.j = r8     // Catch:{ all -> 0x0b7e }
            long r24 = r7.c()     // Catch:{ all -> 0x0b7e }
            int r8 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r8 <= 0) goto L_0x0986
            long r22 = r7.c()     // Catch:{ all -> 0x0b7e }
            long r24 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0b7e }
            int r8 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r8 >= 0) goto L_0x0982
            r8 = r5
            r13 = r6
            long r5 = r7.c()     // Catch:{ all -> 0x0b7e }
            r22 = r8
            boolean r8 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r8 != 0) goto L_0x0975
            goto L_0x097b
        L_0x0975:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r8 = 0
            r15.c = r8     // Catch:{ all -> 0x0b7e }
        L_0x097b:
            aucj r8 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r8 = (defpackage.aqxx) r8     // Catch:{ all -> 0x0b7e }
            r8.k = r5     // Catch:{ all -> 0x0b7e }
            goto L_0x098d
        L_0x0982:
            r22 = r5
            r13 = r6
            goto L_0x098d
        L_0x0986:
            r22 = r5
            r13 = r6
            goto L_0x098d
        L_0x098a:
            r22 = r5
            r13 = r6
        L_0x098d:
            if (r11 == 0) goto L_0x09a4
            long r5 = r7.g()     // Catch:{ all -> 0x0b7e }
            boolean r8 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r8 != 0) goto L_0x0998
            goto L_0x099e
        L_0x0998:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r8 = 0
            r15.c = r8     // Catch:{ all -> 0x0b7e }
        L_0x099e:
            aucj r8 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r8 = (defpackage.aqxx) r8     // Catch:{ all -> 0x0b7e }
            r8.D = r5     // Catch:{ all -> 0x0b7e }
        L_0x09a4:
            boolean r5 = r7.d()     // Catch:{ all -> 0x0b7e }
            boolean r6 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r6 != 0) goto L_0x09ad
            goto L_0x09b3
        L_0x09ad:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r6 = 0
            r15.c = r6     // Catch:{ all -> 0x0b7e }
        L_0x09b3:
            aucj r6 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r6 = (defpackage.aqxx) r6     // Catch:{ all -> 0x0b7e }
            r6.s = r5     // Catch:{ all -> 0x0b7e }
            boolean r5 = r7.e()     // Catch:{ all -> 0x0b7e }
            boolean r6 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r6 != 0) goto L_0x09c2
            goto L_0x09c8
        L_0x09c2:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r6 = 0
            r15.c = r6     // Catch:{ all -> 0x0b7e }
        L_0x09c8:
            aucj r6 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r6 = (defpackage.aqxx) r6     // Catch:{ all -> 0x0b7e }
            r6.z = r5     // Catch:{ all -> 0x0b7e }
            boolean r5 = r7.f()     // Catch:{ all -> 0x0b7e }
            boolean r6 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r6 != 0) goto L_0x09d7
            goto L_0x09dd
        L_0x09d7:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r6 = 0
            r15.c = r6     // Catch:{ all -> 0x0b7e }
        L_0x09dd:
            aucj r6 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r6 = (defpackage.aqxx) r6     // Catch:{ all -> 0x0b7e }
            r6.A = r5     // Catch:{ all -> 0x0b7e }
        L_0x09e3:
            java.lang.Long r5 = r14.a     // Catch:{ all -> 0x0b7e }
            java.lang.Object r5 = r9.get(r5)     // Catch:{ all -> 0x0b7e }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0b7e }
            if (r5 != 0) goto L_0x09ee
            goto L_0x09f1
        L_0x09ee:
            r15.a(r5)     // Catch:{ all -> 0x0b7e }
        L_0x09f1:
            java.lang.Long r5 = r14.a     // Catch:{ all -> 0x0b7e }
            java.lang.Object r5 = r10.get(r5)     // Catch:{ all -> 0x0b7e }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0b7e }
            if (r5 != 0) goto L_0x09fc
            goto L_0x09ff
        L_0x09fc:
            r15.d(r5)     // Catch:{ all -> 0x0b7e }
        L_0x09ff:
            java.lang.Long r5 = r14.a     // Catch:{ all -> 0x0b7e }
            r6 = r19
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x0b7e }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0b7e }
            if (r5 != 0) goto L_0x0a0c
            goto L_0x0a0f
        L_0x0a0c:
            r15.g(r5)     // Catch:{ all -> 0x0b7e }
        L_0x0a0f:
            java.lang.Long r5 = r14.a     // Catch:{ all -> 0x0b7e }
            java.lang.Object r5 = r1.get(r5)     // Catch:{ all -> 0x0b7e }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0b7e }
            if (r5 != 0) goto L_0x0a1a
            goto L_0x0a1d
        L_0x0a1a:
            r15.c(r5)     // Catch:{ all -> 0x0b7e }
        L_0x0a1d:
            java.lang.Long r5 = r14.a     // Catch:{ all -> 0x0b7e }
            java.lang.Object r5 = r3.get(r5)     // Catch:{ all -> 0x0b7e }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0b7e }
            if (r5 != 0) goto L_0x0a28
            goto L_0x0a2b
        L_0x0a28:
            r15.f(r5)     // Catch:{ all -> 0x0b7e }
        L_0x0a2b:
            java.lang.Long r5 = r14.a     // Catch:{ all -> 0x0b7e }
            r7 = r20
            java.lang.Object r5 = r7.get(r5)     // Catch:{ all -> 0x0b7e }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0b7e }
            if (r5 != 0) goto L_0x0a38
            goto L_0x0a3b
        L_0x0a38:
            r15.e(r5)     // Catch:{ all -> 0x0b7e }
        L_0x0a3b:
            java.lang.Long r5 = r14.a     // Catch:{ all -> 0x0b7e }
            java.lang.Object r5 = r4.get(r5)     // Catch:{ all -> 0x0b7e }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0b7e }
            if (r5 == 0) goto L_0x0a6a
            boolean r8 = r15.c     // Catch:{ all -> 0x0b7e }
            if (r8 != 0) goto L_0x0a4b
            r8 = 0
            goto L_0x0a51
        L_0x0a4b:
            r15.c()     // Catch:{ all -> 0x0b7e }
            r8 = 0
            r15.c = r8     // Catch:{ all -> 0x0b7e }
        L_0x0a51:
            aucj r14 = r15.b     // Catch:{ all -> 0x0b7e }
            aqxx r14 = (defpackage.aqxx) r14     // Catch:{ all -> 0x0b7e }
            aucx r8 = r14.y     // Catch:{ all -> 0x0b7e }
            boolean r8 = r8.a()     // Catch:{ all -> 0x0b7e }
            if (r8 != 0) goto L_0x0a65
            aucx r8 = r14.y     // Catch:{ all -> 0x0b7e }
            aucx r8 = defpackage.aucj.a((defpackage.aucx) r8)     // Catch:{ all -> 0x0b7e }
            r14.y = r8     // Catch:{ all -> 0x0b7e }
        L_0x0a65:
            aucx r8 = r14.y     // Catch:{ all -> 0x0b7e }
            defpackage.auab.a((java.lang.Iterable) r5, (java.util.List) r8)     // Catch:{ all -> 0x0b7e }
        L_0x0a6a:
            int r8 = r12 + 1
            aucj r5 = r15.i()     // Catch:{ all -> 0x0b7e }
            aqxx r5 = (defpackage.aqxx) r5     // Catch:{ all -> 0x0b7e }
            r21[r12] = r5     // Catch:{ all -> 0x0b7e }
            r19 = r6
            r20 = r7
            r12 = r8
            r6 = r13
            r7 = r17
            r8 = r21
            r5 = r22
            goto L_0x078c
        L_0x0a82:
            java.lang.InterruptedException r1 = new java.lang.InterruptedException     // Catch:{ all -> 0x0b7e }
            r1.<init>()     // Catch:{ all -> 0x0b7e }
            throw r1     // Catch:{ all -> 0x0b7e }
        L_0x0a88:
            r21 = r8
            monitor-enter(r2)     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
            monitor-exit(r2)     // Catch:{ all -> 0x0aa2 }
            aqxb r1 = defpackage.aqxb.c     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
            aucd r1 = r1.o()     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
            aqxa r1 = (defpackage.aqxa) r1     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
            java.util.List r2 = java.util.Arrays.asList(r21)     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
            r1.a(r2)     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
            aucj r1 = r1.i()     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
            aqxb r1 = (defpackage.aqxb) r1     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
            return r1
        L_0x0aa2:
            r0 = move-exception
            r1 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x0aa2 }
        L_0x0aa5:
            throw r1     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
        L_0x0aa6:
            r0 = move-exception
            r1 = r0
        L_0x0aa8:
            if (r8 == 0) goto L_0x0aad
            r8.close()     // Catch:{ all -> 0x0b7e }
        L_0x0aad:
            throw r1     // Catch:{ all -> 0x0b7e }
        L_0x0aae:
            r0 = move-exception
            r1 = r0
        L_0x0ab0:
            if (r8 == 0) goto L_0x0ab5
            r8.close()     // Catch:{ all -> 0x0b7e }
        L_0x0ab5:
            throw r1     // Catch:{ all -> 0x0b7e }
        L_0x0ab6:
            r0 = move-exception
            r1 = r0
        L_0x0ab8:
            if (r8 == 0) goto L_0x0abd
            r8.close()     // Catch:{ all -> 0x0b7e }
        L_0x0abd:
            throw r1     // Catch:{ all -> 0x0b7e }
        L_0x0abe:
            r0 = move-exception
            r1 = r0
        L_0x0ac0:
            if (r8 == 0) goto L_0x0ac5
            r8.close()     // Catch:{ all -> 0x0b7e }
        L_0x0ac5:
            throw r1     // Catch:{ all -> 0x0b7e }
        L_0x0ac6:
            r0 = move-exception
            r1 = r0
        L_0x0ac8:
            if (r4 == 0) goto L_0x0acd
            r4.close()     // Catch:{ all -> 0x0b7e }
        L_0x0acd:
            throw r1     // Catch:{ all -> 0x0b7e }
        L_0x0ace:
            r0 = move-exception
            r1 = r0
        L_0x0ad0:
            if (r4 == 0) goto L_0x0ad5
            r4.close()     // Catch:{ all -> 0x0b7e }
        L_0x0ad5:
            throw r1     // Catch:{ all -> 0x0b7e }
        L_0x0ad6:
            r0 = move-exception
            r1 = r0
        L_0x0ad8:
            if (r12 == 0) goto L_0x0add
            r12.close()     // Catch:{ all -> 0x0b7e }
        L_0x0add:
            throw r1     // Catch:{ all -> 0x0b7e }
        L_0x0ade:
            r0 = move-exception
            r1 = r0
            goto L_0x0b28
        L_0x0ae1:
            r0 = move-exception
            r1 = r0
            goto L_0x0afa
        L_0x0ae4:
            java.lang.String r1 = "ReadContactsHelper"
            java.lang.String r3 = "Could not query ContactsProvider to fetch RawContacts; disabled? Give up."
            android.util.Log.w(r1, r3)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            ydh r1 = new ydh     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            java.lang.String r3 = "Raw contacts query cursor is null"
            r1.<init>(r3)     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
            throw r1     // Catch:{ SQLiteException -> 0x0ae1, all -> 0x0ade }
        L_0x0af3:
            r0 = move-exception
            r1 = r0
            r9 = 0
            goto L_0x0b28
        L_0x0af7:
            r0 = move-exception
            r1 = r0
            r9 = 0
        L_0x0afa:
            java.lang.String r3 = "ReadContactsHelper"
            java.lang.String r4 = "ContentResolver.query threw an exception when fetching raw-contacts."
            android.util.Log.e(r3, r4, r1)     // Catch:{ all -> 0x0b26 }
            ydi r3 = new ydi     // Catch:{ all -> 0x0b26 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0b26 }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0b26 }
            int r4 = r4.length()     // Catch:{ all -> 0x0b26 }
            int r4 = r4 + 35
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b26 }
            r5.<init>(r4)     // Catch:{ all -> 0x0b26 }
            java.lang.String r4 = "Fetching raw contacts query failed."
            r5.append(r4)     // Catch:{ all -> 0x0b26 }
            r5.append(r1)     // Catch:{ all -> 0x0b26 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0b26 }
            r3.<init>(r1)     // Catch:{ all -> 0x0b26 }
            throw r3     // Catch:{ all -> 0x0b26 }
        L_0x0b26:
            r0 = move-exception
            r1 = r0
        L_0x0b28:
            if (r9 == 0) goto L_0x0b2d
            r9.close()     // Catch:{ all -> 0x0b7e }
        L_0x0b2d:
            throw r1     // Catch:{ all -> 0x0b7e }
        L_0x0b2e:
            r0 = move-exception
            r1 = r0
            goto L_0x0b78
        L_0x0b31:
            r0 = move-exception
            r1 = r0
            goto L_0x0b4a
        L_0x0b34:
            java.lang.String r1 = "ReadContactsHelper"
            java.lang.String r3 = "Could not query ContactsProvider to fetch Contact Ids; disabled? Give up."
            android.util.Log.w(r1, r3)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            ydh r1 = new ydh     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            java.lang.String r3 = "Contacts query cursor is null"
            r1.<init>(r3)     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
            throw r1     // Catch:{ SQLiteException -> 0x0b31, all -> 0x0b2e }
        L_0x0b43:
            r0 = move-exception
            r1 = r0
            r5 = 0
            goto L_0x0b78
        L_0x0b47:
            r0 = move-exception
            r1 = r0
            r5 = 0
        L_0x0b4a:
            java.lang.String r3 = "ReadContactsHelper"
            java.lang.String r4 = "ContentResolver.query threw an exception when fetching Contact Ids."
            android.util.Log.e(r3, r4, r1)     // Catch:{ all -> 0x0b76 }
            ydi r3 = new ydi     // Catch:{ all -> 0x0b76 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0b76 }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0b76 }
            int r4 = r4.length()     // Catch:{ all -> 0x0b76 }
            int r4 = r4 + 34
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b76 }
            r6.<init>(r4)     // Catch:{ all -> 0x0b76 }
            java.lang.String r4 = "Fetching Contact Ids query failed."
            r6.append(r4)     // Catch:{ all -> 0x0b76 }
            r6.append(r1)     // Catch:{ all -> 0x0b76 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0b76 }
            r3.<init>(r1)     // Catch:{ all -> 0x0b76 }
            throw r3     // Catch:{ all -> 0x0b76 }
        L_0x0b76:
            r0 = move-exception
            r1 = r0
        L_0x0b78:
            if (r5 == 0) goto L_0x0b7d
            r5.close()     // Catch:{ all -> 0x0b7e }
        L_0x0b7d:
            throw r1     // Catch:{ all -> 0x0b7e }
        L_0x0b7e:
            r0 = move-exception
            r1 = r0
            monitor-enter(r2)     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
            monitor-exit(r2)     // Catch:{ all -> 0x0b83 }
            throw r1     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
        L_0x0b83:
            r0 = move-exception
            r1 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x0b83 }
            goto L_0x0aa5
        L_0x0b88:
            r0 = move-exception
            r1 = r0
            monitor-exit(r2)     // Catch:{ all -> 0x0b88 }
            throw r1     // Catch:{ ydi -> 0x0b95, ydh -> 0x0b93, InterruptedException -> 0x0b8c }
        L_0x0b8c:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "WriteContactsHelper"
            java.lang.String r3 = "Interrupted while reading contacts from device."
            goto L_0x0b9b
        L_0x0b93:
            r0 = move-exception
            goto L_0x0b96
        L_0x0b95:
            r0 = move-exception
        L_0x0b96:
            r1 = r0
            java.lang.String r2 = "WriteContactsHelper"
            java.lang.String r3 = "Failed to read contacts from device."
        L_0x0b9b:
            android.util.Log.e(r2, r3, r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpw.a():aqxb");
    }

    public final void a(ArrayList arrayList, double d2) {
        int i2;
        try {
            this.f.getContentResolver().applyBatch("com.android.contacts", arrayList);
        } catch (OperationApplicationException e2) {
            Log.e("WriteContactsHelper", "Contact Insertion failed at operation level.", e2);
            this.c.a(e2, d2);
            throw e2;
        } catch (RemoteException e3) {
            Log.e("WriteContactsHelper", "Contact Insertion failed at remote level.", e3);
            int i3 = Build.VERSION.SDK_INT;
            if ((e3 instanceof TransactionTooLargeException) && (i2 = this.i) > 0) {
                if (i2 == 2) {
                    this.a >>= 1;
                    this.b >>= 1;
                } else if (i2 == 1) {
                    this.d = false;
                }
            }
            this.c.a(e3, d2);
            throw e3;
        }
    }
}
