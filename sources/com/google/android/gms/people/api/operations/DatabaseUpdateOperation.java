package com.google.android.gms.people.api.operations;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DatabaseUpdateOperation extends IntentOperation {
    private final wmj a = new wmj();
    private amsn b;

    /* JADX INFO: finally extract failed */
    private final void a() {
        anax anax;
        wmj wmj;
        Cursor a2;
        int i;
        int i2;
        int i3;
        wmj wmj2;
        wmj wmj3;
        wmj wmj4;
        wmj wmj5;
        wmj wmj6;
        String str;
        wtz a3 = wtz.a((Context) this);
        a3.g();
        wtx c = a3.c();
        ArrayList a4 = jhx.a();
        xip.a();
        boolean booleanValue = ((Boolean) xhr.a.a()).booleanValue();
        xip.a();
        if (Boolean.valueOf(aywy.a.a().bE()).booleanValue()) {
            anax = ycx.a(a3.b);
        } else {
            anax = wtz.h.c(a3.b);
        }
        HashSet<String> hashSet = new HashSet<>();
        wmy a5 = wmy.a(a3.b);
        c.a();
        int i4 = 0;
        String str2 = null;
        try {
            a2 = c.a("SELECT _id,account_name,page_gaia_id FROM owners", (String[]) null);
            a2.moveToPosition(-1);
            while (true) {
                i = 1;
                if (!a2.moveToNext()) {
                    break;
                }
                long j = a2.getLong(0);
                String string = a2.getString(1);
                if (ayuw.c()) {
                    str = a2.getString(2);
                } else {
                    str = "";
                }
                if (!anax.contains(string)) {
                    a4.add(Long.valueOf(j));
                    hashSet.add(string);
                } else if (ayuw.c() && !TextUtils.isEmpty(str)) {
                    a4.add(Long.valueOf(j));
                    hashSet.add(string);
                }
            }
            a2.close();
            if (booleanValue && (wmj6 = a3.i) != null) {
                wmj6.b = a4.size();
            }
            if (!a4.isEmpty()) {
                for (String str3 : hashSet) {
                    wus.a(a3.b, "PeopleDatabaseHelper", str3, (String) null, "Account removed");
                    wss.a(a3.b).h(str3);
                    a5.a(str3, (String) null, 1);
                }
                Iterator it = a4.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    try {
                        long longValue = ((Long) it.next()).longValue();
                        StringBuilder sb = new StringBuilder(36);
                        sb.append("Removing owner: ");
                        sb.append(longValue);
                        wus.a(a3.b, "PeopleDatabaseHelper", sb.toString());
                        c.a("DELETE FROM owners WHERE _id=?", (Object[]) new String[]{Long.toString(longValue)});
                        c.i();
                        if (booleanValue) {
                            i2++;
                        }
                    } catch (Throwable th) {
                        th = th;
                        i4 = i2;
                        wmj.a = i4;
                        c.d();
                        throw th;
                    }
                }
                a3.d("contactsCleanupPending");
            } else {
                i2 = 0;
            }
            try {
                c.b();
                if (booleanValue && (wmj5 = a3.i) != null) {
                    wmj5.a = i2;
                }
                c.d();
                a5.b();
                boolean z = !a4.isEmpty();
                wtx c2 = a3.c();
                c2.a();
                try {
                    int a6 = c2.a("people", "in_circle=0", (String[]) null);
                    c2.b();
                    if (a6 > 0) {
                        a3.d("contactsCleanupPending");
                    }
                    xip.a();
                    if (((Boolean) xhs.a.a()).booleanValue() && (wmj4 = a3.i) != null) {
                        wmj4.d = a6;
                    }
                    boolean z2 = z | (a6 > 0);
                    wtx c3 = a3.c();
                    ArrayList<String> a7 = jhx.a();
                    Cursor a8 = a3.b().a("SELECT DISTINCT account_name FROM owners WHERE page_gaia_id IS NULL", (String[]) null);
                    try {
                        a8.moveToPosition(-1);
                        while (a8.moveToNext()) {
                            String string2 = a8.getString(0);
                            if (!a3.b(string2)) {
                                str2 = null;
                                i = 1;
                            } else if (!wtz.a.a(a3.b, string2)) {
                                a7.add(string2);
                                str2 = null;
                                i = 1;
                            } else {
                                str2 = null;
                                i = 1;
                            }
                        }
                        a8.close();
                        xip.a();
                        boolean booleanValue2 = ((Boolean) xhs.a.a()).booleanValue();
                        if (booleanValue2 && (wmj3 = a3.i) != null) {
                            wmj3.e = a7.size();
                        }
                        c3.a();
                        try {
                            if (!a7.isEmpty()) {
                                Log.i("PeopleDatabaseHelper", "Detected G+ -> non-G+ owner(s).  Cleanining up...");
                                String[] strArr = new String[i];
                                ContentValues contentValues = new ContentValues();
                                i3 = 0;
                                for (String str4 : a7) {
                                    String valueOf = String.valueOf(str4);
                                    wus.a(a3.b, "PeopleDatabaseHelper", str4, str2, valueOf.length() == 0 ? new String("Scrubbing account: ") : "Scrubbing account: ".concat(valueOf));
                                    strArr[0] = str4;
                                    c3.i();
                                    String str5 = wtz.j;
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 62);
                                    sb2.append("DELETE FROM sync_tokens WHERE owner_id IN");
                                    sb2.append(str5);
                                    sb2.append(" AND ");
                                    sb2.append("name");
                                    sb2.append(" !='");
                                    sb2.append("gaiamap");
                                    sb2.append("'");
                                    c3.a(sb2.toString(), (Object[]) strArr);
                                    c3.i();
                                    String valueOf2 = String.valueOf(wtz.j);
                                    c3.a(valueOf2.length() == 0 ? new String("DELETE FROM people WHERE owner_id IN") : "DELETE FROM people WHERE owner_id IN".concat(valueOf2), (Object[]) strArr);
                                    c3.i();
                                    String valueOf3 = String.valueOf(wtz.j);
                                    c3.a(valueOf3.length() == 0 ? new String("DELETE FROM ac_people WHERE owner_id IN") : "DELETE FROM ac_people WHERE owner_id IN".concat(valueOf3), (Object[]) strArr);
                                    c3.i();
                                    String valueOf4 = String.valueOf(wtz.j);
                                    c3.a(valueOf4.length() == 0 ? new String("DELETE FROM circles WHERE owner_id IN") : "DELETE FROM circles WHERE owner_id IN".concat(valueOf4), (Object[]) strArr);
                                    c3.i();
                                    contentValues.clear();
                                    contentValues.putNull("page_gaia_id");
                                    contentValues.put("sync_circles_to_contacts", 0);
                                    contentValues.put("sync_evergreen_to_contacts", 0);
                                    contentValues.put("sync_me_to_contacts", 0);
                                    c3.a("owners", contentValues, "account_name=? AND page_gaia_id IS NULL", strArr);
                                    xej.a(a3.b).e(str4, "CleanupNonG+");
                                    c3.i();
                                    if (booleanValue2) {
                                        i3++;
                                    }
                                    str2 = null;
                                }
                                a3.d("contactsCleanupPending");
                            } else {
                                i3 = 0;
                            }
                            c3.b();
                            c3.d();
                            Log.i("PeopleDatabaseHelper", "cleanUpNonGplusAccounts done.");
                            if (booleanValue2 && (wmj2 = a3.i) != null) {
                                wmj2.f = i3;
                            }
                            if (z2 || (!a7.isEmpty())) {
                                xdv a9 = xdv.a(this);
                                for (ybs ybs : a9.b.a()) {
                                    String str6 = ybs.a;
                                    wss a10 = wss.a(a9.a);
                                    boolean equals = str6.equals(xdv.a(a10.b(true), true));
                                    boolean equals2 = str6.equals(xdv.a(a10.b(false), false));
                                    if (!equals && !equals2 && wtw.a(a9.a).a(ybs.a, ybs.b) == -1) {
                                        a9.b.a(ybs.a, ybs.b);
                                    }
                                }
                                xdw a11 = xdw.a((Context) this);
                                a11.a();
                                for (ycj ycj : a11.b.a()) {
                                    if (wtw.a(a11.a).a(ycj.a, ycj.b) == -1) {
                                        a11.b.a(ycj.a, ycj.b);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            c3.d();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        a8.close();
                        throw th3;
                    }
                } finally {
                    c2.d();
                }
            } catch (Throwable th4) {
                th = th4;
                i4 = i2;
                wmj.a = i4;
                c.d();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            if (booleanValue && (wmj = a3.i) != null) {
                wmj.a = i4;
            }
            c.d();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    private final void b() {
        wtz a2 = wtz.a((Context) this);
        Locale locale = Locale.getDefault();
        String a3 = a2.a("dbLocale", "");
        if (!locale.toString().equals(a3)) {
            String format = String.format(Locale.US, "Updating DB locale: %s -> %s", new Object[]{a3, locale});
            Log.i("PeopleDatabaseHelper", format);
            wus.a(a2.b, "PeopleDatabaseHelper", format);
            a2.e.a(locale);
            wtx c = a2.c();
            c.a.a();
            try {
                c.b.setLocale(locale);
                c.a.b();
                c.a();
                try {
                    wue wue = a2.e;
                    Log.i("PeopleSearchIndexManage", "Marking for index update.");
                    wtx c2 = wue.b.c();
                    if (c2 != null) {
                        iva.a(c2.g());
                        wue.a(0);
                    }
                    Intent startIntent = IntentOperation.getStartIntent(a2.b, DatabaseUpdateOperation.class, "com.google.android.gms.people.api.operations.UPDATE_SEARCH_INDEX");
                    if (startIntent != null) {
                        a2.b.startService(startIntent);
                    }
                    wtz.a(c.b, locale);
                    c.b();
                } finally {
                    c.d();
                }
            } catch (Throwable th) {
                c.a.b();
                throw th;
            }
        }
    }

    private final void c() {
        boolean z;
        wtz a2 = wtz.a((Context) this);
        wtx c = a2.c();
        if (c != null) {
            c.a();
            try {
                wue wue = a2.e;
                wtx c2 = wue.b.c();
                iva.a(c2.g());
                String a3 = wue.b.a("indexIcuVersion", "unknown");
                String b2 = ycm.b(System.getProperty("android.icu.library.version"));
                if (!a3.equals(b2)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 29 + b2.length());
                    sb.append("ICU version changed from ");
                    sb.append(a3);
                    sb.append(" to ");
                    sb.append(b2);
                    String sb2 = sb.toString();
                    Log.i("PeopleSearchIndexManage", sb2);
                    wus.a(wue.a, "PeopleSearchIndexManage", sb2);
                    z = true;
                } else {
                    z = false;
                }
                xip.a();
                int intValue = Integer.valueOf((int) aywy.a.a().bG()).intValue();
                if (!z) {
                    int parseInt = Integer.parseInt(wue.b.a("searchIndexVersion", "0"));
                    if (parseInt != intValue) {
                        StringBuilder sb3 = new StringBuilder(38);
                        sb3.append("Index version changed from ");
                        sb3.append(parseInt);
                        String sb4 = sb3.toString();
                        Log.i("PeopleSearchIndexManage", sb4);
                        wus.a(wue.a, "PeopleSearchIndexManage", sb4);
                    }
                    c.b();
                }
                wue.a(c2);
                wue.a(intValue);
                wue.b.b("indexIcuVersion", b2);
                c.b();
            } finally {
                c.d();
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHandleIntent(android.content.Intent r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            defpackage.xip.a()
            xfs r2 = defpackage.xha.a
            java.lang.Object r2 = r2.a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x001b
            amsn r3 = defpackage.amsn.b()
            r0.b = r3
        L_0x001b:
            java.lang.String r3 = r25.getAction()
            xfs r4 = defpackage.xhr.a
            java.lang.Object r4 = r4.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0035
            wtz r5 = defpackage.wtz.a((android.content.Context) r24)
            wmj r6 = r0.a
            r5.i = r6
        L_0x0035:
            java.lang.String r5 = "com.google.android.gms.people.api.operations.UPDATE_ACCOUNTS"
            boolean r6 = r5.equals(r3)
            java.lang.String r7 = "com.google.android.gms.people.api.operations.PREPARE_FOR_SYNC"
            java.lang.String r8 = "android.intent.action.LOCALE_CHANGED"
            java.lang.String r9 = "com.google.android.gms.people.api.operations.UPDATE_LOCALE"
            java.lang.String r10 = "com.google.android.gms.people.api.operations.UPDATE_SEARCH_INDEX"
            java.lang.String r11 = "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE"
            r12 = 1
            r13 = 0
            if (r6 != 0) goto L_0x00b2
            boolean r6 = r11.equals(r3)
            if (r6 == 0) goto L_0x0060
            java.lang.String r6 = "com.google.android.gms.auth.category.ACCOUNT_ADDED"
            boolean r6 = r1.hasCategory(r6)
            if (r6 != 0) goto L_0x00b2
            java.lang.String r6 = "com.google.android.gms.auth.category.ACCOUNT_REMOVED"
            boolean r6 = r1.hasCategory(r6)
            if (r6 != 0) goto L_0x00b2
        L_0x0060:
            boolean r6 = r10.equals(r3)
            if (r6 == 0) goto L_0x006b
            r24.c()
            goto L_0x00b5
        L_0x006b:
            boolean r6 = r9.equals(r3)
            if (r6 != 0) goto L_0x00ae
            boolean r6 = r8.equals(r3)
            if (r6 == 0) goto L_0x0079
            goto L_0x00ae
        L_0x0079:
            boolean r6 = r7.equals(r3)
            if (r6 == 0) goto L_0x009e
            boolean r6 = defpackage.wtz.a()
            if (r6 != 0) goto L_0x008f
            r24.a()
            r24.b()
            r24.c()
        L_0x008f:
            wtz r6 = defpackage.wtz.a((android.content.Context) r24)
            java.util.concurrent.CountDownLatch r14 = r6.g
            if (r14 == 0) goto L_0x009a
            r14.countDown()
        L_0x009a:
            r14 = 0
            r6.g = r14
            goto L_0x00b5
        L_0x009e:
            java.lang.Object[] r6 = new java.lang.Object[r12]
            java.lang.String r14 = r25.getAction()
            r6[r13] = r14
            java.lang.String r14 = "DatabaseUpdateOperation"
            java.lang.String r15 = "Unknown action: %s!"
            defpackage.xdt.a((java.lang.String) r14, (java.lang.String) r15, (java.lang.Object[]) r6)
            goto L_0x00b5
        L_0x00ae:
            r24.b()
            goto L_0x00b5
        L_0x00b2:
            r24.a()
        L_0x00b5:
            if (r4 == 0) goto L_0x02ae
            if (r2 != 0) goto L_0x00ba
            goto L_0x00cd
        L_0x00ba:
            amsn r2 = r0.b
            if (r2 == 0) goto L_0x00cd
            wmj r4 = r0.a
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r14 = r2.a((java.util.concurrent.TimeUnit) r6)
            r4.h = r14
            amsn r2 = r0.b
            r2.e()
        L_0x00cd:
            wmj r2 = r0.a
            java.lang.String r4 = "account_name"
            java.lang.String r1 = r1.getStringExtra(r4)
            int r4 = r2.a
            int r6 = r2.b
            int r14 = r2.c
            int r15 = r2.d
            int r13 = r2.e
            int r12 = r2.f
            xmp r0 = r2.g
            if (r0 == 0) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            xmp r0 = defpackage.xmp.f
        L_0x00e8:
            r16 = r0
            r25 = r1
            long r0 = r2.h
            r17 = r0
            long r0 = r2.i
            defpackage.xip.a()
            java.util.Random r2 = defpackage.wml.a
            double r19 = r2.nextDouble()
            aywy r2 = defpackage.aywy.a
            ayxk r2 = r2.a()
            double r21 = r2.aK()
            java.lang.Double r2 = java.lang.Double.valueOf(r21)
            double r21 = r2.doubleValue()
            int r2 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r2 >= 0) goto L_0x02ad
            xmj r2 = defpackage.xmj.l
            aucd r2 = r2.o()
            defpackage.xip.a()
            xfs r19 = defpackage.xhr.a
            java.lang.Object r19 = r19.a()
            java.lang.Boolean r19 = (java.lang.Boolean) r19
            boolean r19 = r19.booleanValue()
            r20 = 8
            r21 = -1
            r22 = r0
            r1 = 3
            r0 = 2
            if (r19 == 0) goto L_0x01aa
            int r19 = r3.hashCode()
            switch(r19) {
                case -1855651815: goto L_0x0160;
                case -612944411: goto L_0x0158;
                case -177095062: goto L_0x0150;
                case -19011148: goto L_0x0148;
                case 15834784: goto L_0x0140;
                case 1326678490: goto L_0x0138;
                default: goto L_0x0137;
            }
        L_0x0137:
            goto L_0x0168
        L_0x0138:
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0168
            r3 = 2
            goto L_0x0169
        L_0x0140:
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0168
            r3 = 3
            goto L_0x0169
        L_0x0148:
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x0168
            r3 = 5
            goto L_0x0169
        L_0x0150:
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x0168
            r3 = 4
            goto L_0x0169
        L_0x0158:
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0168
            r3 = 0
            goto L_0x0169
        L_0x0160:
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x0168
            r3 = 1
            goto L_0x0169
        L_0x0168:
            r3 = -1
        L_0x0169:
            if (r3 == 0) goto L_0x01a9
            r5 = 1
            if (r3 == r5) goto L_0x01a7
            if (r3 == r0) goto L_0x01a5
            if (r3 == r1) goto L_0x01a3
            r1 = 4
            if (r3 == r1) goto L_0x017a
            r1 = 5
            if (r3 == r1) goto L_0x018b
            r1 = 1
            goto L_0x01ab
        L_0x017a:
            defpackage.xip.a()
            xfs r1 = defpackage.xhf.a
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x01a1
        L_0x018b:
            defpackage.xip.a()
            xfs r1 = defpackage.xhf.a
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x019e
            r1 = 1
            goto L_0x01ab
        L_0x019e:
            r1 = 8
            goto L_0x01ab
        L_0x01a1:
            r1 = 7
            goto L_0x01ab
        L_0x01a3:
            r1 = 6
            goto L_0x01ab
        L_0x01a5:
            r1 = 5
            goto L_0x01a9
        L_0x01a7:
            r1 = 4
            goto L_0x01ab
        L_0x01a9:
            goto L_0x01ab
        L_0x01aa:
            r1 = 2
        L_0x01ab:
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x01b0
            goto L_0x01b6
        L_0x01b0:
            r2.c()
            r3 = 0
            r2.c = r3
        L_0x01b6:
            aucj r3 = r2.b
            xmj r3 = (defpackage.xmj) r3
            int r1 = r1 + -1
            r3.b = r1
            int r1 = r3.a
            r5 = 1
            r1 = r1 | r5
            r3.a = r1
            r0 = r0 | r1
            r3.a = r0
            r3.c = r4
            r1 = 4
            r0 = r0 | r1
            r3.a = r0
            r3.d = r6
            defpackage.xip.a()
            xfs r0 = defpackage.xhs.a
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0209
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x01e5
            goto L_0x01eb
        L_0x01e5:
            r2.c()
            r0 = 0
            r2.c = r0
        L_0x01eb:
            aucj r0 = r2.b
            xmj r0 = (defpackage.xmj) r0
            int r1 = r0.a
            r1 = r1 | 16
            r0.a = r1
            r0.f = r15
            r1 = r1 | 8
            r0.a = r1
            r0.e = r14
            r1 = r1 | 32
            r0.a = r1
            r0.g = r13
            r1 = r1 | 64
            r0.a = r1
            r0.h = r12
        L_0x0209:
            xfs r0 = defpackage.xht.a
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0233
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x021c
            goto L_0x0222
        L_0x021c:
            r2.c()
            r0 = 0
            r2.c = r0
        L_0x0222:
            aucj r0 = r2.b
            xmj r0 = (defpackage.xmj) r0
            r16.getClass()
            r1 = r16
            r0.i = r1
            int r1 = r0.a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r0.a = r1
        L_0x0233:
            xfs r0 = defpackage.xha.a
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x025a
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x0246
            goto L_0x024c
        L_0x0246:
            r2.c()
            r0 = 0
            r2.c = r0
        L_0x024c:
            aucj r0 = r2.b
            xmj r0 = (defpackage.xmj) r0
            int r1 = r0.a
            r1 = r1 | 256(0x100, float:3.59E-43)
            r0.a = r1
            r3 = r17
            r0.j = r3
        L_0x025a:
            xfs r0 = defpackage.xhc.a
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0281
            boolean r0 = r2.c
            if (r0 != 0) goto L_0x026d
            goto L_0x0273
        L_0x026d:
            r2.c()
            r0 = 0
            r2.c = r0
        L_0x0273:
            aucj r0 = r2.b
            xmj r0 = (defpackage.xmj) r0
            int r1 = r0.a
            r1 = r1 | 512(0x200, float:7.175E-43)
            r0.a = r1
            r3 = r22
            r0.k = r3
        L_0x0281:
            xol r0 = defpackage.xol.w
            aucd r0 = r0.o()
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x028c
            goto L_0x0292
        L_0x028c:
            r0.c()
            r1 = 0
            r0.c = r1
        L_0x0292:
            aucj r1 = r0.b
            xol r1 = (defpackage.xol) r1
            aucj r2 = r2.i()
            xmj r2 = (defpackage.xmj) r2
            r2.getClass()
            r1.n = r2
            int r2 = r1.a
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.a = r2
            r1 = r25
            defpackage.wmm.a(r1, r0)
            return
        L_0x02ad:
            return
        L_0x02ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.api.operations.DatabaseUpdateOperation.onHandleIntent(android.content.Intent):void");
    }
}
