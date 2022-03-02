package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: xei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xei extends jeu {
    private static final Random g = new Random();
    private final xsb a = new xsb();
    private final xej b;
    private final ycd c = new yce();
    private final ycw d = ybx.a;
    private final boolean e;
    private amsn f;

    private final List a(Account account) {
        ArrayList a2 = jhx.a();
        wtz a3 = wtz.a(getContext());
        wmn wmn = new wmn();
        wmn.O = a3.a(account.name);
        a2.add(wmn);
        return a2;
    }

    private final long b() {
        return this.e ? this.f.a(TimeUnit.MILLISECONDS) : SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 5377;
    }

    public final void onSyncCanceled() {
        this.a.a = true;
        super.onSyncCanceled();
    }

    public xei(Context context) {
        super(context.getApplicationContext(), "people");
        this.b = xej.a(context);
        xip.a();
        boolean booleanValue = ((Boolean) xhm.a.a()).booleanValue();
        this.e = booleanValue;
        if (booleanValue) {
            this.f = amsn.b(ampt.a);
        }
    }

    private final void a(Account account, boolean z) {
        List b2 = this.b.b(account.name);
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            wmy.a(getContext()).a(account.name, (String) b2.get(i), !z ? 64 : 128);
        }
        wmy.a(getContext()).b();
    }

    private final void a(String str) {
        wtz a2 = wtz.a(getContext());
        long a3 = ycm.a(getContext().getApplicationContext()).a();
        String b2 = a2.f.b(str, (String) null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_sync_finish_time", Long.valueOf(a3));
        a2.c().a("owners", contentValues, "_id = ?", new String[]{b2});
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v20, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v81, resolved type: android.content.SyncResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: wmn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v82, resolved type: android.content.SyncResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v23, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v84, resolved type: android.content.SyncResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v26, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v86, resolved type: android.content.SyncResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v27, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v28, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: wmn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v89, resolved type: xsb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v29, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v49, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v30, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v31, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v32, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v33, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v34, resolved type: android.accounts.Account} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v90, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: ampu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v154, resolved type: android.content.SyncResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v165, resolved type: android.content.SyncResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v166, resolved type: android.content.SyncResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v167, resolved type: android.content.SyncResult} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v168, resolved type: android.content.SyncResult} */
    /* JADX WARNING: type inference failed for: r15v9 */
    /* JADX WARNING: type inference failed for: r7v61 */
    /* JADX WARNING: type inference failed for: r7v62 */
    /* JADX WARNING: type inference failed for: r7v63 */
    /* JADX WARNING: type inference failed for: r7v64 */
    /* JADX WARNING: type inference failed for: r7v80 */
    /* JADX WARNING: type inference failed for: r7v91 */
    /* JADX WARNING: type inference failed for: r7v98 */
    /* JADX WARNING: type inference failed for: r7v99 */
    /* JADX WARNING: type inference failed for: r7v100 */
    /* JADX WARNING: type inference failed for: r7v101 */
    /* JADX WARNING: type inference failed for: r7v102 */
    /* JADX WARNING: type inference failed for: r7v103 */
    /* JADX WARNING: type inference failed for: r7v104 */
    /* JADX WARNING: type inference failed for: r7v105 */
    /* JADX WARNING: type inference failed for: r7v106 */
    /* JADX WARNING: type inference failed for: r7v110 */
    /* JADX WARNING: type inference failed for: r15v78 */
    /* JADX WARNING: type inference failed for: r7v112, types: [boolean] */
    /* JADX WARNING: type inference failed for: r7v121 */
    /* JADX WARNING: type inference failed for: r7v151 */
    /* JADX WARNING: type inference failed for: r7v152 */
    /* JADX WARNING: type inference failed for: r7v153 */
    /* JADX WARNING: type inference failed for: r7v169 */
    /* JADX WARNING: type inference failed for: r7v185 */
    /* JADX WARNING: type inference failed for: r7v189 */
    /* JADX WARNING: type inference failed for: r7v190 */
    /* JADX WARNING: type inference failed for: r7v191 */
    /* JADX WARNING: type inference failed for: r15v151 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0432, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0433, code lost:
        r2 = r0;
        r15 = r13;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0436, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0437, code lost:
        r2 = r0;
        r15 = r13;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x043a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x043b, code lost:
        r2 = r0;
        r15 = r13;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r1.a.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0447, code lost:
        if (r5 == false) goto L_0x04ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        r2 = r1.b;
        r3 = defpackage.wtw.a(r2.a).a(r14.name, (java.lang.String) null);
        r2 = defpackage.wtz.a(r2.a).b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0462, code lost:
        if (r2 == null) goto L_0x049e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0464, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r5 = new java.lang.String[1];
        r5[r15] = java.lang.String.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x046f, code lost:
        r28 = r13;
        r12 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0479, code lost:
        if (((int) r2.a("SELECT last_sync_status FROM owners WHERE _id=?", r5, -1)) != 2) goto L_0x04b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x047b, code lost:
        r20 = r8;
        r35 = r11;
        r36 = -1;
        r15 = r28;
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0486, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0487, code lost:
        r2 = r0;
        r36 = -1;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x048e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x048f, code lost:
        r2 = r0;
        r36 = -1;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0496, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0497, code lost:
        r2 = r0;
        r36 = -1;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x049e, code lost:
        r28 = r13;
        r7 = 1;
        r12 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04a5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04a6, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04a8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04a9, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04ab, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04ac, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04ae, code lost:
        r28 = r13;
        r7 = 1;
        r12 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04b4, code lost:
        if (r9 != false) goto L_0x0565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04b6, code lost:
        r15 = r15;
        r15 = r15;
        r15 = r15;
        r7 = r7;
        r7 = r7;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        r9 = new defpackage.wmn();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04bb, code lost:
        r15 = r15;
        r15 = r15;
        r15 = r15;
        r7 = r7;
        r7 = r7;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        r2 = getContext();
        r3 = r14.name;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04c3, code lost:
        r7 = r1.a;
        r34 = r9;
        r35 = r11;
        r36 = r12;
        r20 = r8;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04e2, code lost:
        r7 = r7;
        r7 = r7;
        r7 = r7;
        r15 = r15;
        r15 = r15;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        defpackage.xen.a(r2, r3, (java.lang.String) null, r8, r42, r7, r9, r41, r10, r11, r23, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04e5, code lost:
        r2 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04e7, code lost:
        r7 = r7;
        r7 = r7;
        r7 = r7;
        r15 = r15;
        r15 = r15;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        r15.add(r2);
        r3 = getContext();
        r5 = r14.name;
        r2 = java.lang.String.valueOf(r2);
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 6);
        r7.append("Stats=");
        r7.append(r2);
        r13 = null;
        defpackage.wus.a(r3, "PeopleSync", r5, (java.lang.String) null, r7.toString());
        r15 = r15;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0516, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0517, code lost:
        r2 = r34;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x051a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x051b, code lost:
        r2 = r9;
        r36 = r12;
        r15 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0520, code lost:
        r3 = r0;
        r15.add(r2);
        r4 = getContext();
        r6 = r14.name;
        r2 = java.lang.String.valueOf(r2);
        r8 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 6);
        r8.append("Stats=");
        r8.append(r2);
        defpackage.wus.a(r4, "PeopleSync", r6, (java.lang.String) null, r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x054f, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0550, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0551, code lost:
        r36 = r12;
        r15 = r28;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0557, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0558, code lost:
        r36 = r12;
        r15 = r28;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x055e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x055f, code lost:
        r36 = r12;
        r15 = r28;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0565, code lost:
        r20 = r8;
        r35 = r11;
        r36 = r12;
        r15 = r28;
        r13 = null;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x056e, code lost:
        r1.a.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0573, code lost:
        if (r35 == false) goto L_0x05b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0575, code lost:
        r2 = getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0583, code lost:
        if (defpackage.wtz.a(r2).b(r14.name) == false) goto L_0x05b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0585, code lost:
        defpackage.wus.a(getContext(), "PeopleSync", r14.name, r13, "Account opted out from G+.");
        r3 = com.google.android.chimera.IntentOperation.getStartIntent(r2, com.google.android.gms.people.api.operations.DatabaseUpdateOperation.class, "com.google.android.gms.people.api.operations.UPDATE_ACCOUNTS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x059a, code lost:
        if (r3 != null) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x059d, code lost:
        defpackage.xip.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x05ac, code lost:
        if (((java.lang.Boolean) defpackage.xhr.a.a()).booleanValue() == false) goto L_0x05b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x05ae, code lost:
        r3.putExtra("account_name", r14.name);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05b5, code lost:
        r2.startService(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05b8, code lost:
        r1.a.b();
        r12 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x05c0, code lost:
        if (r12 != 1) goto L_0x05d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x05ca, code lost:
        if (r1.b.a(r14.name) == false) goto L_0x05d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05cc, code lost:
        r2 = r1.b.a(r14.name, defpackage.aywy.m());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05d9, code lost:
        r2 = r1.b.b(r14.name);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05e1, code lost:
        r20 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05e5, code lost:
        r9 = 0;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05ea, code lost:
        if (r20.hasNext() == false) goto L_0x06c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05ec, code lost:
        r11 = (java.lang.String) r20.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05f7, code lost:
        if (android.text.TextUtils.isEmpty(r11) != false) goto L_0x06c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05f9, code lost:
        defpackage.wus.a(getContext(), "PeopleSync", r14.name, r11, "***Sync start***");
        r10 = new defpackage.wmn();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x060b, code lost:
        r28 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:?, code lost:
        r2 = getContext();
        r3 = r14.name;
        r7 = r1.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0615, code lost:
        r14 = r10;
        r38 = r11;
        r30 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:?, code lost:
        defpackage.xen.a(r2, r3, r11, r12, r42, r7, r10, r41, false, false, r23, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
        r15.add(r14);
        r2 = getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0639, code lost:
        r4 = r14;
        r14 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:?, code lost:
        r5 = r14.name;
        r4 = java.lang.String.valueOf(r4);
        r7 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 6);
        r7.append("Stats=");
        r7.append(r4);
        defpackage.wus.a(r2, "PeopleSync", r5, r38, r7.toString());
        r1.a.b();
        r9 = r28;
        r12 = r30;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x066e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x066f, code lost:
        r14 = r40;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0672, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0673, code lost:
        r14 = r40;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0676, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0677, code lost:
        r14 = r40;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x067a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x067b, code lost:
        r4 = r14;
        r6 = r38;
        r14 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0681, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0682, code lost:
        r4 = r10;
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0684, code lost:
        r2 = r0;
        r15.add(r4);
        r3 = getContext();
        r7 = r14.name;
        r4 = java.lang.String.valueOf(r4);
        r9 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 6);
        r9.append("Stats=");
        r9.append(r4);
        defpackage.wus.a(r3, "PeopleSync", r7, r6, r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x06b2, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06b3, code lost:
        r0 = th;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06b4, code lost:
        r2 = r0;
        r15 = r15;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06b7, code lost:
        r0 = e;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x06b8, code lost:
        r2 = r0;
        r9 = r28;
        r15 = r15;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x06bd, code lost:
        r0 = e;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06be, code lost:
        r2 = r0;
        r9 = r28;
        r15 = r15;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06c3, code lost:
        r20 = r9;
        r15 = r15;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06c8, code lost:
        r2 = r0;
        r28 = r9;
        r3 = true;
        r9 = false;
        r15 = r15;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x06cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x06d0, code lost:
        r2 = r0;
        r15 = r15;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x06d4, code lost:
        r2 = r0;
        r15 = r15;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0704, code lost:
        r0 = th;
        r15 = r15;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x070c, code lost:
        r0 = e;
        r15 = r15;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0711, code lost:
        r0 = e;
        r15 = r15;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x07e6, code lost:
        r7 = r7;
        r7 = r7;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:?, code lost:
        r3 = r1.b;
        r4 = r14.name;
        r5 = r3.b.f(r4) + 1;
        r3.b.b(r4, r5);
        r5 = (long) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0804, code lost:
        if (r5 < defpackage.aywy.a.a().cM()) goto L_0x0806;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0806, code lost:
        r7 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0809, code lost:
        r3.a(r4, "Too many failures.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x080e, code lost:
        r7 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:?, code lost:
        r7.tooManyRetries = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x081f, code lost:
        if (r5 >= defpackage.aywy.a.a().cL()) goto L_0x0821;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0821, code lost:
        r3.a(r4, "Too many failures.  Disabling sync.");
        r3 = r3.c.a(r3.a, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x082e, code lost:
        if (r3 != null) goto L_0x0830;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0830, code lost:
        defpackage.xej.a(r3, "com.google.android.gms.people", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0837, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0838, code lost:
        r7 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x083b, code lost:
        r7 = r42;
        r1.b.c(r14.name);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0871, code lost:
        r0 = e;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0874, code lost:
        r0 = e;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0877, code lost:
        r0 = e;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0878, code lost:
        r2 = r0;
        r12 = null;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x087d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x087e, code lost:
        r2 = r0;
        r7 = 51;
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0884, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0885, code lost:
        r18 = r0;
        r9 = r21;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x08d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x08da, code lost:
        r18 = r0;
        r9 = r21;
        r4 = r28;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x08f5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x08f6, code lost:
        r7 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x08f8, code lost:
        r11 = r0;
        r4 = r28;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x093d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x093e, code lost:
        r7 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0940, code lost:
        r6 = r0;
        r4 = r28;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0a4c, code lost:
        if (r11 != 1) goto L_0x0a4e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0b92, code lost:
        r7 = 51;
        r15 = 2;
        r36 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0ca0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0ca1, code lost:
        defpackage.wml.a().a(r14.name, defpackage.wtx.c, defpackage.wtx.d, r15);
        defpackage.wtx.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0cb1, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e7, code lost:
        r2 = r0;
        r15 = 2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a4 A[SYNTHETIC, Splitter:B:102:0x02a4] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x037c A[SYNTHETIC, Splitter:B:133:0x037c] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03b4 A[SYNTHETIC, Splitter:B:138:0x03b4] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03bf A[SYNTHETIC, Splitter:B:143:0x03bf] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0406 A[SYNTHETIC, Splitter:B:164:0x0406] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0716  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x07e6 A[SYNTHETIC, Splitter:B:374:0x07e6] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x083b A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0884 A[ExcHandler: RuntimeException (r0v22 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:371:0x07e1] */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x08a8 A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x08d0 A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x08d8 A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x08d9 A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }, ExcHandler: xsa (r0v21 'e' xsa A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:371:0x07e1] */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x08f5 A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }, ExcHandler: SQLiteException (e android.database.sqlite.SQLiteException), Splitter:B:371:0x07e1] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0923 A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x093a A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x093d A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }, ExcHandler: VolleyError (e com.android.volley.VolleyError), Splitter:B:371:0x07e1] */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x0956 A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x095d A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0989 A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0990 A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x09a4 A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x09ab A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x09cf A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x09ed A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x09fa A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0a07 A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x0a25 A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0a32 A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x0a4b A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x0a53 A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0a54 A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x0a8d A[Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884, all -> 0x087d }] */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x0b4b  */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x0b5a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:547:0x0b91 A[ExcHandler: xsa (e xsa), Splitter:B:47:0x0126] */
    /* JADX WARNING: Removed duplicated region for block: B:558:0x0bd7  */
    /* JADX WARNING: Removed duplicated region for block: B:560:0x0be9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x0bfe  */
    /* JADX WARNING: Removed duplicated region for block: B:580:0x0ca0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:581:0x0ca1  */
    /* JADX WARNING: Removed duplicated region for block: B:601:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0207 A[Catch:{ xsa -> 0x0b91, all -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x020a A[Catch:{ xsa -> 0x0b91, all -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0216 A[Catch:{ xsa -> 0x0b91, all -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0219 A[Catch:{ xsa -> 0x0b91, all -> 0x01e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0293 A[Catch:{ xsa -> 0x0b91, all -> 0x0b8c }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0294 A[Catch:{ xsa -> 0x0b91, all -> 0x0b8c }] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.accounts.Account r40, android.os.Bundle r41, android.content.SyncResult r42) {
        /*
            r39 = this;
            r1 = r39
            r14 = r40
            r15 = r41
            r13 = r42
            defpackage.xip.a()
            aywy r2 = defpackage.aywy.a
            ayxk r2 = r2.a()
            boolean r2 = r2.bS()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            r12 = 0
            r10 = 0
            if (r2 != 0) goto L_0x0024
            goto L_0x00d6
        L_0x0024:
            monitor-enter(r39)
            java.lang.String r2 = r14.name     // Catch:{ all -> 0x0cb3 }
            android.content.Context r3 = r39.getContext()     // Catch:{ all -> 0x0cb3 }
            wss r3 = defpackage.wss.a((android.content.Context) r3)     // Catch:{ all -> 0x0cb3 }
            android.content.SharedPreferences r3 = r3.a     // Catch:{ all -> 0x0cb3 }
            java.lang.String r4 = "menagerie_last_sync_trigerred_timestamp_"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0cb3 }
            int r5 = r2.length()     // Catch:{ all -> 0x0cb3 }
            if (r5 != 0) goto L_0x0043
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0cb3 }
            r2.<init>(r4)     // Catch:{ all -> 0x0cb3 }
            goto L_0x0047
        L_0x0043:
            java.lang.String r2 = r4.concat(r2)     // Catch:{ all -> 0x0cb3 }
        L_0x0047:
            long r2 = r3.getLong(r2, r10)     // Catch:{ all -> 0x0cb3 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cb3 }
            long r4 = r4 - r2
            defpackage.xip.a()     // Catch:{ all -> 0x0cb3 }
            aywy r2 = defpackage.aywy.a     // Catch:{ all -> 0x0cb3 }
            ayxk r2 = r2.a()     // Catch:{ all -> 0x0cb3 }
            long r2 = r2.bT()     // Catch:{ all -> 0x0cb3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0cb3 }
            long r2 = r2.longValue()     // Catch:{ all -> 0x0cb3 }
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x006a
            goto L_0x00a1
        L_0x006a:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x00a1
            boolean r2 = defpackage.ayws.g()     // Catch:{ all -> 0x0cb3 }
            if (r2 == 0) goto L_0x007a
            java.util.List r2 = r39.a((android.accounts.Account) r40)     // Catch:{ all -> 0x0cb3 }
            r8 = r2
            goto L_0x007b
        L_0x007a:
            r8 = r12
        L_0x007b:
            xej r2 = r1.b     // Catch:{ all -> 0x0cb3 }
            boolean r11 = defpackage.aywy.n()     // Catch:{ all -> 0x0cb3 }
            boolean r12 = defpackage.xej.a((android.os.Bundle) r41)     // Catch:{ all -> 0x0cb3 }
            ampu r13 = defpackage.ampu.a     // Catch:{ all -> 0x0cb3 }
            r4 = 0
            r6 = 10
            r7 = 0
            r9 = 0
            r3 = r40
            r5 = r41
            r2.a((android.accounts.Account) r3, (int) r4, (android.os.Bundle) r5, (int) r6, (java.lang.Exception) r7, (java.util.List) r8, (long) r9, (boolean) r11, (boolean) r12, (defpackage.amri) r13)     // Catch:{ all -> 0x0cb3 }
            boolean r2 = defpackage.aywp.e()     // Catch:{ all -> 0x0cb3 }
            if (r2 == 0) goto L_0x009f
            java.lang.String r2 = r14.name     // Catch:{ all -> 0x0cb3 }
            r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0cb3 }
        L_0x009f:
            monitor-exit(r39)     // Catch:{ all -> 0x0cb3 }
            return
        L_0x00a1:
            java.lang.String r2 = r14.name     // Catch:{ all -> 0x0cb3 }
            android.content.Context r3 = r39.getContext()     // Catch:{ all -> 0x0cb3 }
            wss r3 = defpackage.wss.a((android.content.Context) r3)     // Catch:{ all -> 0x0cb3 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cb3 }
            defpackage.iva.b((java.lang.String) r12)     // Catch:{ all -> 0x0cb3 }
            android.content.SharedPreferences r3 = r3.a     // Catch:{ all -> 0x0cb3 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0cb3 }
            java.lang.String r6 = "menagerie_last_sync_trigerred_timestamp_"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0cb3 }
            int r7 = r2.length()     // Catch:{ all -> 0x0cb3 }
            if (r7 != 0) goto L_0x00ca
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0cb3 }
            r2.<init>(r6)     // Catch:{ all -> 0x0cb3 }
            goto L_0x00ce
        L_0x00ca:
            java.lang.String r2 = r6.concat(r2)     // Catch:{ all -> 0x0cb3 }
        L_0x00ce:
            android.content.SharedPreferences$Editor r2 = r3.putLong(r2, r4)     // Catch:{ all -> 0x0cb3 }
            r2.commit()     // Catch:{ all -> 0x0cb3 }
            monitor-exit(r39)     // Catch:{ all -> 0x0cb3 }
        L_0x00d6:
            boolean r2 = defpackage.wtz.a()
            if (r2 != 0) goto L_0x0cb2
            android.content.Context r2 = r39.getContext()
            boolean r2 = defpackage.jgu.e(r2)
            r9 = 0
            if (r2 == 0) goto L_0x00f4
            xej r2 = r1.b
            java.lang.String r3 = "Disabling sync for restricted user."
            r2.a((android.accounts.Account) r14, (java.lang.String) r3)
            java.lang.String r2 = "com.google.android.gms.people"
            defpackage.xej.a((android.accounts.Account) r14, (java.lang.String) r2, (int) r9)
            return
        L_0x00f4:
            java.lang.String r2 = defpackage.ybj.a(r41)
            boolean r3 = defpackage.aywp.b()
            if (r3 != 0) goto L_0x0107
            int r3 = defpackage.xej.b((android.os.Bundle) r41)
            r4 = 4
            if (r3 == r4) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            return
        L_0x0107:
            int r8 = defpackage.ybj.b(r41)
            long r16 = android.os.SystemClock.elapsedRealtime()
            r4 = 2
            r3 = 1
            xsb r5 = r1.a     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            r5.a()     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            android.content.Context r5 = r39.getContext()     // Catch:{ InterruptedException -> 0x0b7e }
            wtz r5 = defpackage.wtz.a((android.content.Context) r5)     // Catch:{ InterruptedException -> 0x0b7e }
            java.util.concurrent.CountDownLatch r5 = r5.g     // Catch:{ InterruptedException -> 0x0b7e }
            if (r5 != 0) goto L_0x0123
            goto L_0x0126
        L_0x0123:
            r5.await()     // Catch:{ InterruptedException -> 0x0b7e }
        L_0x0126:
            xej r5 = r1.b     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            r5.a((boolean) r9)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            if (r15 != 0) goto L_0x012f
            goto L_0x01eb
        L_0x012f:
            java.lang.String r5 = "initialize"
            boolean r5 = r15.getBoolean(r5, r9)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            if (r5 == 0) goto L_0x01eb
            android.content.Context r5 = r39.getContext()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            wtz r5 = defpackage.wtz.a((android.content.Context) r5)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            r5.g()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            xej r5 = r1.b     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            android.content.Context r6 = r5.a     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.lang.String r7 = "PeopleSync"
            java.lang.String r10 = r14.name     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.lang.String r11 = "initializeSyncState"
            defpackage.wus.a((android.content.Context) r6, (java.lang.String) r7, (java.lang.String) r10, (java.lang.String) r12, (java.lang.String) r11)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.lang.String r6 = "com.google.android.gms.people"
            defpackage.xdu.a()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            int r6 = android.content.ContentResolver.getIsSyncable(r14, r6)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            r10 = 41
            r7.<init>(r10)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.lang.String r10 = "initializeSyncState: syncable="
            r7.append(r10)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            r7.append(r6)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.lang.String r7 = r7.toString()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            r5.a((android.accounts.Account) r14, (java.lang.String) r7)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            if (r6 < 0) goto L_0x0171
            goto L_0x01a7
        L_0x0171:
            java.lang.String r6 = "com.google.android.gms.people"
            defpackage.xej.a((android.accounts.Account) r14, (java.lang.String) r6, (int) r3)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.lang.String r6 = "com.google.android.gms.people"
            defpackage.xej.a((android.accounts.Account) r14, (java.lang.String) r6, (boolean) r3)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            r5.a((android.accounts.Account) r14)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            aywy r6 = defpackage.aywy.a     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            ayxk r6 = r6.a()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            boolean r6 = r6.U()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            if (r6 == 0) goto L_0x01a7
            android.content.Context r5 = r5.a     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.lang.String r6 = "PeopleSync"
            java.lang.String r7 = "requestSyncNow"
            defpackage.wus.a((android.content.Context) r5, (java.lang.String) r6, (android.accounts.Account) r14, (java.lang.String) r7)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            r5.<init>()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.lang.String r6 = "force"
            r5.putBoolean(r6, r3)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.lang.String r6 = "expedited"
            r5.putBoolean(r6, r3)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.lang.String r6 = "com.google.android.gms.people"
            defpackage.xej.a((android.accounts.Account) r14, (java.lang.String) r6, (android.os.Bundle) r5)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
        L_0x01a7:
            aywy r5 = defpackage.aywy.a     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            ayxk r5 = r5.a()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            boolean r5 = r5.cC()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            if (r5 != 0) goto L_0x01eb
            boolean r2 = defpackage.ayws.i()
            if (r2 == 0) goto L_0x01e5
            java.util.Random r2 = g
            double r2 = r2.nextDouble()
            double r5 = defpackage.ayws.j()
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x01e5
            android.content.Context r2 = r39.getContext()
            wtz r2 = defpackage.wtz.a((android.content.Context) r2)
            wtx r2 = r2.b()
            if (r2 == 0) goto L_0x01e5
            wml r2 = defpackage.wml.a()
            java.lang.String r3 = r14.name
            int r5 = defpackage.wtx.c
            int r6 = defpackage.wtx.d
            r2.a((java.lang.String) r3, (int) r5, (int) r6, (int) r4)
        L_0x01e2:
            defpackage.wtx.h()
        L_0x01e5:
            return
        L_0x01e6:
            r0 = move-exception
            r2 = r0
            r15 = 2
            goto L_0x0c7e
        L_0x01eb:
            ycd r5 = r1.c     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            android.content.Context r6 = r39.getContext()     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            java.lang.String r7 = r14.name     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            boolean r5 = r5.a((android.content.Context) r6, (java.lang.String) r7)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            r11 = r5 ^ 1
            if (r15 == 0) goto L_0x0207
            java.lang.String r5 = "gms.people.contacts_sync"
            boolean r5 = r15.getBoolean(r5, r9)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            if (r5 != 0) goto L_0x0205
            r5 = 0
            goto L_0x0208
        L_0x0205:
            r5 = 1
            goto L_0x0208
        L_0x0207:
            r5 = 0
        L_0x0208:
            if (r15 == 0) goto L_0x0216
            java.lang.String r6 = "page_only"
            boolean r6 = r15.getBoolean(r6, r9)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            if (r6 != 0) goto L_0x0214
            r10 = 0
            goto L_0x0217
        L_0x0214:
            r10 = 1
            goto L_0x0217
        L_0x0216:
            r10 = 0
        L_0x0217:
            if (r15 == 0) goto L_0x0225
            java.lang.String r6 = "gms.people.skip_main_sync"
            boolean r6 = r15.getBoolean(r6, r9)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            if (r6 != 0) goto L_0x0223
            r6 = 0
            goto L_0x0226
        L_0x0223:
            r6 = 1
            goto L_0x0226
        L_0x0225:
            r6 = 0
        L_0x0226:
            android.content.Context r7 = r39.getContext()     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            java.lang.String r3 = "PeopleSync"
            java.lang.String r4 = r14.name     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            int r25 = r8 + -1
            java.lang.String r25 = java.lang.Integer.toString(r25)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            java.lang.String r9 = java.lang.String.valueOf(r25)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            java.lang.String r25 = java.lang.String.valueOf(r2)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            int r25 = r25.length()     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            int r25 = r25 + 100
            java.lang.String r27 = java.lang.String.valueOf(r9)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            int r27 = r27.length()     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            int r12 = r25 + r27
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            r13.<init>(r12)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            java.lang.String r12 = "***Sync start***: feed="
            r13.append(r12)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            r13.append(r2)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            java.lang.String r2 = " cannotHavePeople="
            r13.append(r2)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            r13.append(r11)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            java.lang.String r2 = " mode="
            r13.append(r2)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            r13.append(r9)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            java.lang.String r2 = " contactOnly="
            r13.append(r2)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            r13.append(r5)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            java.lang.String r2 = " pageOnly="
            r13.append(r2)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            r13.append(r10)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            java.lang.String r2 = " skipMain="
            r13.append(r2)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            r13.append(r6)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            java.lang.String r2 = r13.toString()     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            r9 = 0
            defpackage.wus.a((android.content.Context) r7, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r9, (java.lang.String) r2)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            xej r2 = r1.b     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            java.lang.String r3 = r14.name     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            boolean r2 = r2.d(r3)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            if (r2 != 0) goto L_0x0294
            goto L_0x0299
        L_0x0294:
            xej r2 = r1.b     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            r2.a((android.accounts.Account) r14)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
        L_0x0299:
            xsb r2 = r1.a     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            r2.b()     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            boolean r2 = defpackage.xej.a((int) r8)     // Catch:{ xsa -> 0x0b91, all -> 0x0b8c }
            if (r2 == 0) goto L_0x0359
            xej r2 = r1.b     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.lang.String r3 = r14.name     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            long r12 = defpackage.aywy.m()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            r4 = 0
            boolean r7 = r2.a((java.lang.String) r3, (java.lang.String) r4, (long) r12)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            if (r7 != 0) goto L_0x02b9
            r12 = 51
            r13 = 2
            r15 = 0
            goto L_0x034b
        L_0x02b9:
            java.util.List r2 = r2.a((java.lang.String) r3, (long) r12)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            int r2 = r2.size()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            if (r2 != 0) goto L_0x0347
            android.content.Context r2 = r39.getContext()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.lang.String r3 = "PeopleSync"
            java.lang.String r4 = r14.name     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.lang.String r5 = "Data still fresh; skip periodic sync."
            r6 = 0
            defpackage.wus.a((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r6, (java.lang.String) r5)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            ayws r2 = defpackage.ayws.a     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            aywt r2 = r2.a()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            boolean r2 = r2.j()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            if (r2 == 0) goto L_0x0308
            boolean r2 = defpackage.ayws.g()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            if (r2 == 0) goto L_0x02e9
            java.util.List r2 = r39.a((android.accounts.Account) r40)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            r8 = r2
            goto L_0x02ea
        L_0x02e9:
            r8 = 0
        L_0x02ea:
            xej r2 = r1.b     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            amsn r3 = r1.f     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            long r9 = r3.a((java.util.concurrent.TimeUnit) r4)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            ampu r13 = defpackage.ampu.a     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            r4 = 0
            r6 = 12
            r7 = 0
            r11 = 0
            r12 = 0
            r5 = 1
            r3 = r40
            r5 = r41
            r15 = 51
            r15 = 0
            r2.a((android.accounts.Account) r3, (int) r4, (android.os.Bundle) r5, (int) r6, (java.lang.Exception) r7, (java.util.List) r8, (long) r9, (boolean) r11, (boolean) r12, (defpackage.amri) r13)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            goto L_0x0309
        L_0x0308:
            r15 = 0
        L_0x0309:
            boolean r2 = defpackage.aywp.e()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            if (r2 == 0) goto L_0x0314
            java.lang.String r2 = r14.name     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            r1.a((java.lang.String) r2)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
        L_0x0314:
            boolean r2 = defpackage.ayws.i()
            if (r2 == 0) goto L_0x0346
            java.util.Random r2 = g
            double r2 = r2.nextDouble()
            double r4 = defpackage.ayws.j()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0346
            android.content.Context r2 = r39.getContext()
            wtz r2 = defpackage.wtz.a((android.content.Context) r2)
            wtx r2 = r2.b()
            if (r2 == 0) goto L_0x0346
            wml r2 = defpackage.wml.a()
            java.lang.String r3 = r14.name
            int r4 = defpackage.wtx.c
            int r5 = defpackage.wtx.d
            r13 = 2
            r2.a((java.lang.String) r3, (int) r4, (int) r5, (int) r13)
            goto L_0x01e2
        L_0x0346:
            return
        L_0x0347:
            r12 = 51
            r13 = 2
            r15 = 0
        L_0x034b:
            xej r2 = r1.b     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            java.lang.String r3 = r14.name     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            long r12 = defpackage.aywy.m()     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            r4 = 0
            boolean r9 = r2.a((java.lang.String) r3, (java.lang.String) r4, (long) r12)     // Catch:{ xsa -> 0x0b91, all -> 0x01e6 }
            goto L_0x035b
        L_0x0359:
            r15 = 0
            r9 = 0
        L_0x035b:
            java.util.ArrayList r13 = defpackage.jhx.a()     // Catch:{ all -> 0x0b6e }
            long r18 = r39.b()     // Catch:{ all -> 0x0b6e }
            boolean r23 = defpackage.aywy.n()     // Catch:{ all -> 0x0b6e }
            boolean r24 = defpackage.xej.a((android.os.Bundle) r41)     // Catch:{ all -> 0x0b6e }
            defpackage.xip.a()     // Catch:{ all -> 0x0b6e }
            xfs r2 = defpackage.xhy.a     // Catch:{ all -> 0x0b6e }
            java.lang.Object r2 = r2.a()     // Catch:{ all -> 0x0b6e }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0b6e }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0b6e }
            if (r2 == 0) goto L_0x03b4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03ab }
            r2.<init>()     // Catch:{ all -> 0x03ab }
            java.lang.String r3 = "PeopleSyncAdapter"
            r2.append(r3)     // Catch:{ all -> 0x03ab }
            r3 = 58
            r2.append(r3)     // Catch:{ all -> 0x03ab }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03ab }
            r2.append(r3)     // Catch:{ all -> 0x03ab }
            r3 = 58
            r2.append(r3)     // Catch:{ all -> 0x03ab }
            java.security.SecureRandom r3 = defpackage.ycm.f     // Catch:{ all -> 0x03ab }
            int r3 = r3.nextInt()     // Catch:{ all -> 0x03ab }
            r2.append(r3)     // Catch:{ all -> 0x03ab }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x03ab }
            amri r2 = defpackage.amri.b(r2)     // Catch:{ all -> 0x03ab }
            r25 = r2
            goto L_0x03b8
        L_0x03ab:
            r0 = move-exception
            r2 = r0
            r7 = 51
            r15 = 2
            r36 = -1
            goto L_0x0b75
        L_0x03b4:
            ampu r2 = defpackage.ampu.a     // Catch:{ all -> 0x0b6e }
            r25 = r2
        L_0x03b8:
            r26 = 1000(0x3e8, double:4.94E-321)
            r32 = 1
            r2 = 2
            if (r8 != r2) goto L_0x0404
            aywy r2 = defpackage.aywy.a     // Catch:{ eif -> 0x03fb, xsa -> 0x03f2, all -> 0x03e9 }
            ayxk r2 = r2.a()     // Catch:{ eif -> 0x03fb, xsa -> 0x03f2, all -> 0x03e9 }
            long r2 = r2.cZ()     // Catch:{ eif -> 0x03fb, xsa -> 0x03f2, all -> 0x03e9 }
            int r4 = defpackage.xej.b((android.os.Bundle) r41)     // Catch:{ eif -> 0x03fb, xsa -> 0x03f2, all -> 0x03e9 }
            r7 = 2
            if (r4 == r7) goto L_0x03d1
            goto L_0x03db
        L_0x03d1:
            aywy r2 = defpackage.aywy.a     // Catch:{ eif -> 0x03fb, xsa -> 0x03f2, all -> 0x03e9 }
            ayxk r2 = r2.a()     // Catch:{ eif -> 0x03fb, xsa -> 0x03f2, all -> 0x03e9 }
            long r2 = r2.da()     // Catch:{ eif -> 0x03fb, xsa -> 0x03f2, all -> 0x03e9 }
        L_0x03db:
            r21 = 0
            int r4 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r4 <= 0) goto L_0x0404
            long r2 = r2 * r26
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x03e7 }
            goto L_0x0404
        L_0x03e7:
            r0 = move-exception
            goto L_0x0404
        L_0x03e9:
            r0 = move-exception
            r2 = r0
            r15 = r13
            r21 = 0
        L_0x03ee:
            r36 = -1
            goto L_0x0706
        L_0x03f2:
            r0 = move-exception
            r2 = r0
            r15 = r13
            r21 = 0
        L_0x03f7:
            r36 = -1
            goto L_0x070e
        L_0x03fb:
            r0 = move-exception
            r2 = r0
            r15 = r13
            r21 = 0
        L_0x0400:
            r36 = -1
            goto L_0x0713
        L_0x0404:
            if (r6 != 0) goto L_0x0716
            xej r2 = r1.b     // Catch:{ InterruptedException -> 0x06f8, eif -> 0x06f0, xsa -> 0x06e8, all -> 0x06e0 }
            defpackage.xip.a()     // Catch:{ InterruptedException -> 0x06f8, eif -> 0x06f0, xsa -> 0x06e8, all -> 0x06e0 }
            aywy r3 = defpackage.aywy.a     // Catch:{ InterruptedException -> 0x06f8, eif -> 0x06f0, xsa -> 0x06e8, all -> 0x06e0 }
            ayxk r3 = r3.a()     // Catch:{ InterruptedException -> 0x06f8, eif -> 0x06f0, xsa -> 0x06e8, all -> 0x06e0 }
            long r3 = r3.av()     // Catch:{ InterruptedException -> 0x06f8, eif -> 0x06f0, xsa -> 0x06e8, all -> 0x06e0 }
            int r4 = (int) r3     // Catch:{ InterruptedException -> 0x06f8, eif -> 0x06f0, xsa -> 0x06e8, all -> 0x06e0 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ InterruptedException -> 0x06f8, eif -> 0x06f0, xsa -> 0x06e8, all -> 0x06e0 }
            int r3 = r3.intValue()     // Catch:{ InterruptedException -> 0x06f8, eif -> 0x06f0, xsa -> 0x06e8, all -> 0x06e0 }
        L_0x041e:
            long r6 = r2.c()     // Catch:{ InterruptedException -> 0x06f8, eif -> 0x06f0, xsa -> 0x06e8, all -> 0x06e0 }
            r21 = 0
            int r4 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r4 <= 0) goto L_0x0442
            int r4 = r3 + -1
            if (r3 > 0) goto L_0x042d
            goto L_0x0442
        L_0x042d:
            java.lang.Thread.sleep(r6)     // Catch:{ InterruptedException -> 0x043e }
            r3 = r4
            goto L_0x041e
        L_0x0432:
            r0 = move-exception
        L_0x0433:
            r2 = r0
            r15 = r13
            goto L_0x03ee
        L_0x0436:
            r0 = move-exception
        L_0x0437:
            r2 = r0
            r15 = r13
            goto L_0x03f7
        L_0x043a:
            r0 = move-exception
        L_0x043b:
            r2 = r0
            r15 = r13
            goto L_0x0400
        L_0x043e:
            r0 = move-exception
            r15 = r13
            goto L_0x06fc
        L_0x0442:
            xsb r2 = r1.a     // Catch:{ eif -> 0x06dd, xsa -> 0x06da, all -> 0x06d7 }
            r2.b()     // Catch:{ eif -> 0x06dd, xsa -> 0x06da, all -> 0x06d7 }
            if (r5 == 0) goto L_0x04ae
            xej r2 = r1.b     // Catch:{ eif -> 0x04ab, xsa -> 0x04a8, all -> 0x04a5 }
            java.lang.String r3 = r14.name     // Catch:{ eif -> 0x04ab, xsa -> 0x04a8, all -> 0x04a5 }
            android.content.Context r4 = r2.a     // Catch:{ eif -> 0x04ab, xsa -> 0x04a8, all -> 0x04a5 }
            wtw r4 = defpackage.wtw.a(r4)     // Catch:{ eif -> 0x04ab, xsa -> 0x04a8, all -> 0x04a5 }
            r12 = 0
            long r3 = r4.a(r3, r12)     // Catch:{ eif -> 0x04ab, xsa -> 0x04a8, all -> 0x04a5 }
            android.content.Context r2 = r2.a     // Catch:{ eif -> 0x04ab, xsa -> 0x04a8, all -> 0x04a5 }
            wtz r2 = defpackage.wtz.a((android.content.Context) r2)     // Catch:{ eif -> 0x04ab, xsa -> 0x04a8, all -> 0x04a5 }
            wtx r2 = r2.b()     // Catch:{ eif -> 0x04ab, xsa -> 0x04a8, all -> 0x04a5 }
            if (r2 == 0) goto L_0x049e
            r7 = 1
            java.lang.String[] r5 = new java.lang.String[r7]     // Catch:{ eif -> 0x043a, xsa -> 0x0436, all -> 0x0432 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ eif -> 0x043a, xsa -> 0x0436, all -> 0x0432 }
            r5[r15] = r3     // Catch:{ eif -> 0x043a, xsa -> 0x0436, all -> 0x0432 }
            java.lang.String r3 = "SELECT last_sync_status FROM owners WHERE _id=?"
            r28 = r13
            r12 = -1
            long r2 = r2.a((java.lang.String) r3, (java.lang.String[]) r5, (long) r12)     // Catch:{ eif -> 0x0496, xsa -> 0x048e, all -> 0x0486 }
            int r3 = (int) r2
            r6 = 2
            if (r3 != r6) goto L_0x04b4
            r20 = r8
            r35 = r11
            r36 = r12
            r15 = r28
            r13 = 0
            goto L_0x056e
        L_0x0486:
            r0 = move-exception
            r2 = r0
            r36 = r12
            r15 = r28
            goto L_0x0706
        L_0x048e:
            r0 = move-exception
            r2 = r0
            r36 = r12
            r15 = r28
            goto L_0x070e
        L_0x0496:
            r0 = move-exception
            r2 = r0
            r36 = r12
            r15 = r28
            goto L_0x0713
        L_0x049e:
            r28 = r13
            r6 = 2
            r7 = 1
            r12 = -1
            goto L_0x04b4
        L_0x04a5:
            r0 = move-exception
            r7 = 1
            goto L_0x0433
        L_0x04a8:
            r0 = move-exception
            r7 = 1
            goto L_0x0437
        L_0x04ab:
            r0 = move-exception
            r7 = 1
            goto L_0x043b
        L_0x04ae:
            r28 = r13
            r6 = 2
            r7 = 1
            r12 = -1
        L_0x04b4:
            if (r9 != 0) goto L_0x0565
            wmn r9 = new wmn     // Catch:{ eif -> 0x055e, xsa -> 0x0557, all -> 0x0550 }
            r9.<init>()     // Catch:{ eif -> 0x055e, xsa -> 0x0557, all -> 0x0550 }
            android.content.Context r2 = r39.getContext()     // Catch:{ all -> 0x051a }
            java.lang.String r3 = r14.name     // Catch:{ all -> 0x051a }
            xsb r5 = r1.a     // Catch:{ all -> 0x051a }
            r4 = 0
            r29 = r5
            r5 = r8
            r30 = 2
            r6 = r42
            r15 = 1
            r7 = r29
            r15 = r8
            r8 = r9
            r34 = r9
            r9 = r41
            r35 = r11
            r36 = r12
            r13 = 51
            r12 = r23
            r20 = r15
            r15 = r28
            r13 = r25
            defpackage.xen.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0516 }
            r2 = r34
            r15.add(r2)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            android.content.Context r3 = r39.getContext()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r4 = "PeopleSync"
            java.lang.String r5 = r14.name     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            int r6 = r6.length()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            int r6 = r6 + 6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            r7.<init>(r6)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r6 = "Stats="
            r7.append(r6)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            r7.append(r2)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r2 = r7.toString()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            r13 = 0
            defpackage.wus.a((android.content.Context) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r13, (java.lang.String) r2)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            goto L_0x056e
        L_0x0516:
            r0 = move-exception
            r2 = r34
            goto L_0x0520
        L_0x051a:
            r0 = move-exception
            r2 = r9
            r36 = r12
            r15 = r28
        L_0x0520:
            r13 = 0
            r3 = r0
            r15.add(r2)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            android.content.Context r4 = r39.getContext()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r5 = "PeopleSync"
            java.lang.String r6 = r14.name     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            int r7 = r7.length()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            int r7 = r7 + 6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            r8.<init>(r7)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r7 = "Stats="
            r8.append(r7)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            r8.append(r2)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r2 = r8.toString()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            defpackage.wus.a((android.content.Context) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r13, (java.lang.String) r2)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            throw r3     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
        L_0x0550:
            r0 = move-exception
            r36 = r12
            r15 = r28
            goto L_0x06e6
        L_0x0557:
            r0 = move-exception
            r36 = r12
            r15 = r28
            goto L_0x06ee
        L_0x055e:
            r0 = move-exception
            r36 = r12
            r15 = r28
            goto L_0x06f6
        L_0x0565:
            r20 = r8
            r35 = r11
            r36 = r12
            r15 = r28
            r13 = 0
        L_0x056e:
            xsb r2 = r1.a     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            r2.b()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            if (r35 == 0) goto L_0x05b8
            android.content.Context r2 = r39.getContext()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            wtz r3 = defpackage.wtz.a((android.content.Context) r2)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r4 = r14.name     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            boolean r3 = r3.b((java.lang.String) r4)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            if (r3 == 0) goto L_0x05b8
            android.content.Context r3 = r39.getContext()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r4 = "PeopleSync"
            java.lang.String r5 = r14.name     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r6 = "Account opted out from G+."
            defpackage.wus.a((android.content.Context) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r13, (java.lang.String) r6)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.Class<com.google.android.gms.people.api.operations.DatabaseUpdateOperation> r3 = com.google.android.gms.people.api.operations.DatabaseUpdateOperation.class
            java.lang.String r4 = "com.google.android.gms.people.api.operations.UPDATE_ACCOUNTS"
            android.content.Intent r3 = com.google.android.chimera.IntentOperation.getStartIntent((android.content.Context) r2, (java.lang.Class) r3, (java.lang.String) r4)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            if (r3 != 0) goto L_0x059d
            goto L_0x05b8
        L_0x059d:
            defpackage.xip.a()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            xfs r4 = defpackage.xhr.a     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.Object r4 = r4.a()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            boolean r4 = r4.booleanValue()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            if (r4 == 0) goto L_0x05b5
            java.lang.String r4 = "account_name"
            java.lang.String r5 = r14.name     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            r3.putExtra(r4, r5)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
        L_0x05b5:
            r2.startService(r3)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
        L_0x05b8:
            xsb r2 = r1.a     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            r2.b()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            r12 = r20
            r2 = 1
            if (r12 != r2) goto L_0x05d9
            xej r2 = r1.b     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r3 = r14.name     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            boolean r2 = r2.a((java.lang.String) r3)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            if (r2 == 0) goto L_0x05d9
            xej r2 = r1.b     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r3 = r14.name     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            long r4 = defpackage.aywy.m()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.util.List r2 = r2.a((java.lang.String) r3, (long) r4)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            goto L_0x05e1
        L_0x05d9:
            xej r2 = r1.b     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.lang.String r3 = r14.name     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            java.util.List r2 = r2.b((java.lang.String) r3)     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
        L_0x05e1:
            java.util.Iterator r20 = r2.iterator()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            r9 = 0
        L_0x05e6:
            boolean r2 = r20.hasNext()     // Catch:{ eif -> 0x06d3, xsa -> 0x06cf, all -> 0x06c7 }
            if (r2 == 0) goto L_0x06c3
            java.lang.Object r2 = r20.next()     // Catch:{ eif -> 0x06d3, xsa -> 0x06cf, all -> 0x06c7 }
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ eif -> 0x06d3, xsa -> 0x06cf, all -> 0x06c7 }
            boolean r2 = android.text.TextUtils.isEmpty(r11)     // Catch:{ eif -> 0x06d3, xsa -> 0x06cf, all -> 0x06c7 }
            if (r2 != 0) goto L_0x06c3
            android.content.Context r2 = r39.getContext()     // Catch:{ eif -> 0x06d3, xsa -> 0x06cf, all -> 0x06c7 }
            java.lang.String r3 = "PeopleSync"
            java.lang.String r4 = r14.name     // Catch:{ eif -> 0x06d3, xsa -> 0x06cf, all -> 0x06c7 }
            java.lang.String r5 = "***Sync start***"
            defpackage.wus.a((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r11, (java.lang.String) r5)     // Catch:{ eif -> 0x06d3, xsa -> 0x06cf, all -> 0x06c7 }
            wmn r10 = new wmn     // Catch:{ eif -> 0x06d3, xsa -> 0x06cf, all -> 0x06c7 }
            r10.<init>()     // Catch:{ eif -> 0x06d3, xsa -> 0x06cf, all -> 0x06c7 }
            int r28 = r9 + 1
            android.content.Context r2 = r39.getContext()     // Catch:{ all -> 0x0681 }
            java.lang.String r3 = r14.name     // Catch:{ all -> 0x0681 }
            xsb r7 = r1.a     // Catch:{ all -> 0x0681 }
            r30 = 0
            r31 = 0
            r4 = r11
            r5 = r12
            r6 = r42
            r8 = r10
            r9 = r41
            r14 = r10
            r10 = r30
            r38 = r11
            r11 = r31
            r30 = r12
            r12 = r23
            r13 = r25
            defpackage.xen.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x067a }
            r15.add(r14)     // Catch:{ eif -> 0x0676, xsa -> 0x0672, all -> 0x066e }
            android.content.Context r2 = r39.getContext()     // Catch:{ eif -> 0x0676, xsa -> 0x0672, all -> 0x066e }
            java.lang.String r3 = "PeopleSync"
            r4 = r14
            r14 = r40
            java.lang.String r5 = r14.name     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            int r6 = r6.length()     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            int r6 = r6 + 6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            r7.<init>(r6)     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            java.lang.String r6 = "Stats="
            r7.append(r6)     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            r7.append(r4)     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            java.lang.String r4 = r7.toString()     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            r6 = r38
            defpackage.wus.a((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r4)     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            xsb r2 = r1.a     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            r2.b()     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            r9 = r28
            r12 = r30
            r13 = 0
            goto L_0x05e6
        L_0x066e:
            r0 = move-exception
            r14 = r40
            goto L_0x06b4
        L_0x0672:
            r0 = move-exception
            r14 = r40
            goto L_0x06b8
        L_0x0676:
            r0 = move-exception
            r14 = r40
            goto L_0x06be
        L_0x067a:
            r0 = move-exception
            r4 = r14
            r6 = r38
            r14 = r40
            goto L_0x0684
        L_0x0681:
            r0 = move-exception
            r4 = r10
            r6 = r11
        L_0x0684:
            r2 = r0
            r15.add(r4)     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            android.content.Context r3 = r39.getContext()     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            java.lang.String r5 = "PeopleSync"
            java.lang.String r7 = r14.name     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            int r8 = r8.length()     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            int r8 = r8 + 6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            r9.<init>(r8)     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            java.lang.String r8 = "Stats="
            r9.append(r8)     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            r9.append(r4)     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            java.lang.String r4 = r9.toString()     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            defpackage.wus.a((android.content.Context) r3, (java.lang.String) r5, (java.lang.String) r7, (java.lang.String) r6, (java.lang.String) r4)     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
            throw r2     // Catch:{ eif -> 0x06bd, xsa -> 0x06b7, all -> 0x06b3 }
        L_0x06b3:
            r0 = move-exception
        L_0x06b4:
            r2 = r0
            goto L_0x07c7
        L_0x06b7:
            r0 = move-exception
        L_0x06b8:
            r2 = r0
            r9 = r28
            goto L_0x07ce
        L_0x06bd:
            r0 = move-exception
        L_0x06be:
            r2 = r0
            r9 = r28
            goto L_0x07da
        L_0x06c3:
            r20 = r9
            goto L_0x071d
        L_0x06c7:
            r0 = move-exception
            r2 = r0
            r28 = r9
            r3 = 1
            r9 = 0
            goto L_0x07e1
        L_0x06cf:
            r0 = move-exception
            r2 = r0
            goto L_0x07ce
        L_0x06d3:
            r0 = move-exception
            r2 = r0
            goto L_0x07da
        L_0x06d7:
            r0 = move-exception
            r15 = r13
            goto L_0x06e4
        L_0x06da:
            r0 = move-exception
            r15 = r13
            goto L_0x06ec
        L_0x06dd:
            r0 = move-exception
            r15 = r13
            goto L_0x06f4
        L_0x06e0:
            r0 = move-exception
            r15 = r13
            r21 = 0
        L_0x06e4:
            r36 = -1
        L_0x06e6:
            r2 = r0
            goto L_0x0706
        L_0x06e8:
            r0 = move-exception
            r15 = r13
            r21 = 0
        L_0x06ec:
            r36 = -1
        L_0x06ee:
            r2 = r0
            goto L_0x070e
        L_0x06f0:
            r0 = move-exception
            r15 = r13
            r21 = 0
        L_0x06f4:
            r36 = -1
        L_0x06f6:
            r2 = r0
            goto L_0x0713
        L_0x06f8:
            r0 = move-exception
            r15 = r13
            r21 = 0
        L_0x06fc:
            r36 = -1
            xsa r2 = new xsa     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            r2.<init>()     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
            throw r2     // Catch:{ eif -> 0x0711, xsa -> 0x070c, all -> 0x0704 }
        L_0x0704:
            r0 = move-exception
            goto L_0x06e6
        L_0x0706:
            r3 = 1
            r9 = 0
            r28 = 0
            goto L_0x07e1
        L_0x070c:
            r0 = move-exception
            goto L_0x06ee
        L_0x070e:
            r9 = 0
            goto L_0x07ce
        L_0x0711:
            r0 = move-exception
            goto L_0x06f6
        L_0x0713:
            r9 = 0
            goto L_0x07da
        L_0x0716:
            r15 = r13
            r21 = 0
            r36 = -1
            r20 = 0
        L_0x071d:
            xsb r2 = r1.a     // Catch:{ eif -> 0x07d6, xsa -> 0x07ca, all -> 0x07c3 }
            r2.b()     // Catch:{ eif -> 0x07d6, xsa -> 0x07ca, all -> 0x07c3 }
            r2 = 0
            r1.a(r14, r2)     // Catch:{ eif -> 0x07b6, VolleyError -> 0x07ad, SQLiteException -> 0x07a4, xsa -> 0x079a, RuntimeException -> 0x0790 }
            xej r2 = r1.b     // Catch:{ eif -> 0x07b6, VolleyError -> 0x07ad, SQLiteException -> 0x07a4, xsa -> 0x079a, RuntimeException -> 0x0790 }
            java.lang.String r3 = r14.name     // Catch:{ eif -> 0x07b6, VolleyError -> 0x07ad, SQLiteException -> 0x07a4, xsa -> 0x079a, RuntimeException -> 0x0790 }
            r2.c(r3)     // Catch:{ eif -> 0x07b6, VolleyError -> 0x07ad, SQLiteException -> 0x07a4, xsa -> 0x079a, RuntimeException -> 0x0790 }
            long r2 = r39.b()     // Catch:{ eif -> 0x07b6, VolleyError -> 0x07ad, SQLiteException -> 0x07a4, xsa -> 0x079a, RuntimeException -> 0x0790 }
            long r18 = r2 - r18
            xej r2 = r1.b     // Catch:{ eif -> 0x0783, VolleyError -> 0x0778, SQLiteException -> 0x076d, xsa -> 0x0763, RuntimeException -> 0x0759 }
            java.lang.String r3 = r14.name     // Catch:{ eif -> 0x0783, VolleyError -> 0x0778, SQLiteException -> 0x076d, xsa -> 0x0763, RuntimeException -> 0x0759 }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ eif -> 0x0783, VolleyError -> 0x0778, SQLiteException -> 0x076d, xsa -> 0x0763, RuntimeException -> 0x0759 }
            wss r2 = r2.b     // Catch:{ eif -> 0x0783, VolleyError -> 0x0778, SQLiteException -> 0x076d, xsa -> 0x0763, RuntimeException -> 0x0759 }
            r4 = 0
            r2.a((java.lang.String) r3, (int) r4)     // Catch:{ eif -> 0x0783, VolleyError -> 0x0778, SQLiteException -> 0x076d, xsa -> 0x0763, RuntimeException -> 0x0759 }
            xej r2 = r1.b     // Catch:{ eif -> 0x0783, VolleyError -> 0x0778, SQLiteException -> 0x076d, xsa -> 0x0763, RuntimeException -> 0x0759 }
            r6 = 1
            r7 = 0
            r3 = r40
            r4 = r20
            r5 = r41
            r8 = r15
            r9 = r18
            r11 = r23
            r12 = r24
            r13 = r25
            r2.a((android.accounts.Account) r3, (int) r4, (android.os.Bundle) r5, (int) r6, (java.lang.Exception) r7, (java.util.List) r8, (long) r9, (boolean) r11, (boolean) r12, (defpackage.amri) r13)     // Catch:{ eif -> 0x0783, VolleyError -> 0x0778, SQLiteException -> 0x076d, xsa -> 0x0763, RuntimeException -> 0x0759 }
            r15 = 2
            goto L_0x0b05
        L_0x0759:
            r0 = move-exception
            r2 = r0
            r9 = r18
            r28 = r20
            r18 = r2
            goto L_0x088a
        L_0x0763:
            r0 = move-exception
            r2 = r0
            r9 = r18
            r4 = r20
            r18 = r2
            goto L_0x08e1
        L_0x076d:
            r0 = move-exception
            r2 = r0
            r7 = r42
            r11 = r2
            r21 = r18
            r4 = r20
            goto L_0x08fc
        L_0x0778:
            r0 = move-exception
            r2 = r0
            r7 = r42
            r6 = r2
            r21 = r18
            r4 = r20
            goto L_0x0944
        L_0x0783:
            r0 = move-exception
            r2 = r0
            r7 = r42
            r8 = r2
            r9 = r18
            r4 = r20
            r12 = 0
            r13 = 2
            goto L_0x0add
        L_0x0790:
            r0 = move-exception
            r2 = r0
            r18 = r2
            r28 = r20
            r9 = r21
            goto L_0x088a
        L_0x079a:
            r0 = move-exception
            r2 = r0
            r18 = r2
            r4 = r20
            r9 = r21
            goto L_0x08e1
        L_0x07a4:
            r0 = move-exception
            r2 = r0
            r7 = r42
            r11 = r2
            r4 = r20
            goto L_0x08fc
        L_0x07ad:
            r0 = move-exception
            r2 = r0
            r7 = r42
            r6 = r2
            r4 = r20
            goto L_0x0944
        L_0x07b6:
            r0 = move-exception
            r2 = r0
            r7 = r42
            r8 = r2
            r4 = r20
            r9 = r21
            r12 = 0
            r13 = 2
            goto L_0x0add
        L_0x07c3:
            r0 = move-exception
            r2 = r0
            r28 = r20
        L_0x07c7:
            r3 = 1
            r9 = 0
            goto L_0x07e1
        L_0x07ca:
            r0 = move-exception
            r2 = r0
            r9 = r20
        L_0x07ce:
            throw r2     // Catch:{ all -> 0x07cf }
        L_0x07cf:
            r0 = move-exception
            r2 = r0
            r28 = r9
            r3 = 0
            r9 = 1
            goto L_0x07e1
        L_0x07d6:
            r0 = move-exception
            r2 = r0
            r9 = r20
        L_0x07da:
            throw r2     // Catch:{ all -> 0x07db }
        L_0x07db:
            r0 = move-exception
            r2 = r0
            r28 = r9
            r3 = 0
            r9 = 0
        L_0x07e1:
            r1.a(r14, r9)     // Catch:{ eif -> 0x0ad2, VolleyError -> 0x093d, SQLiteException -> 0x08f5, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            if (r3 == 0) goto L_0x083b
            xej r3 = r1.b     // Catch:{ eif -> 0x0837, VolleyError -> 0x093d, SQLiteException -> 0x08f5, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            java.lang.String r4 = r14.name     // Catch:{ eif -> 0x0837, VolleyError -> 0x093d, SQLiteException -> 0x08f5, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            wss r5 = r3.b     // Catch:{ eif -> 0x0837, VolleyError -> 0x093d, SQLiteException -> 0x08f5, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            int r5 = r5.f(r4)     // Catch:{ eif -> 0x0837, VolleyError -> 0x093d, SQLiteException -> 0x08f5, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            r6 = 1
            int r5 = r5 + r6
            wss r6 = r3.b     // Catch:{ eif -> 0x0837, VolleyError -> 0x093d, SQLiteException -> 0x08f5, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            r6.b((java.lang.String) r4, (int) r5)     // Catch:{ eif -> 0x0837, VolleyError -> 0x093d, SQLiteException -> 0x08f5, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            long r5 = (long) r5     // Catch:{ eif -> 0x0837, VolleyError -> 0x093d, SQLiteException -> 0x08f5, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            aywy r7 = defpackage.aywy.a     // Catch:{ eif -> 0x0837, VolleyError -> 0x093d, SQLiteException -> 0x08f5, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            ayxk r7 = r7.a()     // Catch:{ eif -> 0x0837, VolleyError -> 0x093d, SQLiteException -> 0x08f5, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            long r7 = r7.cM()     // Catch:{ eif -> 0x0837, VolleyError -> 0x093d, SQLiteException -> 0x08f5, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0809
            r7 = r42
            goto L_0x0813
        L_0x0809:
            java.lang.String r7 = "Too many failures."
            r3.a((java.lang.String) r4, (java.lang.String) r7)     // Catch:{ eif -> 0x0837, VolleyError -> 0x093d, SQLiteException -> 0x08f5, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            r7 = r42
            r8 = 1
            r7.tooManyRetries = r8     // Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884 }
        L_0x0813:
            aywy r8 = defpackage.aywy.a     // Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            ayxk r8 = r8.a()     // Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            long r8 = r8.cL()     // Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0844
            java.lang.String r5 = "Too many failures.  Disabling sync."
            r3.a((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            ycw r5 = r3.c     // Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            android.content.Context r3 = r3.a     // Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            android.accounts.Account r3 = r5.a(r3, r4)     // Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            if (r3 == 0) goto L_0x0844
            java.lang.String r4 = "com.google.android.gms.people"
            r5 = 0
            defpackage.xej.a((android.accounts.Account) r3, (java.lang.String) r4, (boolean) r5)     // Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            goto L_0x0844
        L_0x0837:
            r0 = move-exception
            r7 = r42
            goto L_0x0878
        L_0x083b:
            r7 = r42
            xej r3 = r1.b     // Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            java.lang.String r4 = r14.name     // Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            r3.c(r4)     // Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884 }
        L_0x0844:
            long r3 = r39.b()     // Catch:{ eif -> 0x0877, VolleyError -> 0x0874, SQLiteException -> 0x0871, xsa -> 0x08d9, RuntimeException -> 0x0884 }
            long r3 = r3 - r18
            throw r2     // Catch:{ eif -> 0x0868, VolleyError -> 0x0860, SQLiteException -> 0x0858, xsa -> 0x0850, RuntimeException -> 0x084b }
        L_0x084b:
            r0 = move-exception
            r18 = r0
            r9 = r3
            goto L_0x088a
        L_0x0850:
            r0 = move-exception
            r18 = r0
            r9 = r3
            r4 = r28
            goto L_0x08e1
        L_0x0858:
            r0 = move-exception
            r11 = r0
            r21 = r3
            r4 = r28
            goto L_0x08fc
        L_0x0860:
            r0 = move-exception
            r6 = r0
            r21 = r3
            r4 = r28
            goto L_0x0944
        L_0x0868:
            r0 = move-exception
            r8 = r0
            r9 = r3
            r4 = r28
            r12 = 0
            r13 = 2
            goto L_0x0add
        L_0x0871:
            r0 = move-exception
            goto L_0x08f8
        L_0x0874:
            r0 = move-exception
            goto L_0x0940
        L_0x0877:
            r0 = move-exception
        L_0x0878:
            r2 = r0
            r12 = 0
            r13 = 2
            goto L_0x0ad8
        L_0x087d:
            r0 = move-exception
            r2 = r0
            r7 = 51
            r15 = 2
            goto L_0x0b75
        L_0x0884:
            r0 = move-exception
            r2 = r0
            r18 = r2
            r9 = r21
        L_0x088a:
            android.content.Context r3 = r39.getContext()     // Catch:{ all -> 0x087d }
            java.lang.String r4 = "PeopleSync"
            java.lang.String r5 = r14.name     // Catch:{ all -> 0x087d }
            r6 = 0
            java.lang.String r7 = "***Unknown error***"
            r8 = r18
            defpackage.wus.a(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x087d }
            ycw r2 = r1.d     // Catch:{ all -> 0x087d }
            android.content.Context r3 = r39.getContext()     // Catch:{ all -> 0x087d }
            java.lang.String r4 = r14.name     // Catch:{ all -> 0x087d }
            android.accounts.Account r2 = r2.a(r3, r4)     // Catch:{ all -> 0x087d }
            if (r2 == 0) goto L_0x08be
            xej r2 = r1.b     // Catch:{ all -> 0x087d }
            r6 = 100
            r3 = r40
            r4 = r28
            r5 = r41
            r7 = r18
            r8 = r15
            r11 = r23
            r12 = r24
            r13 = r25
            r2.a((android.accounts.Account) r3, (int) r4, (android.os.Bundle) r5, (int) r6, (java.lang.Exception) r7, (java.util.List) r8, (long) r9, (boolean) r11, (boolean) r12, (defpackage.amri) r13)     // Catch:{ all -> 0x087d }
        L_0x08be:
            java.lang.String r2 = r14.name     // Catch:{ all -> 0x087d }
            if (r2 == 0) goto L_0x08d8
            ycw r2 = r1.d     // Catch:{ all -> 0x087d }
            android.content.Context r3 = r39.getContext()     // Catch:{ all -> 0x087d }
            java.lang.String r4 = r14.name     // Catch:{ all -> 0x087d }
            android.accounts.Account r2 = r2.a(r3, r4)     // Catch:{ all -> 0x087d }
            if (r2 != 0) goto L_0x08d8
            java.lang.String r2 = r14.name     // Catch:{ all -> 0x087d }
            r18.getMessage()     // Catch:{ all -> 0x087d }
            r15 = 2
            goto L_0x0b05
        L_0x08d8:
            throw r18     // Catch:{ all -> 0x087d }
        L_0x08d9:
            r0 = move-exception
            r2 = r0
            r18 = r2
            r9 = r21
            r4 = r28
        L_0x08e1:
            xej r2 = r1.b     // Catch:{ all -> 0x087d }
            r6 = 2
            r3 = r40
            r5 = r41
            r7 = r18
            r8 = r15
            r11 = r23
            r12 = r24
            r13 = r25
            r2.a((android.accounts.Account) r3, (int) r4, (android.os.Bundle) r5, (int) r6, (java.lang.Exception) r7, (java.util.List) r8, (long) r9, (boolean) r11, (boolean) r12, (defpackage.amri) r13)     // Catch:{ all -> 0x087d }
            throw r18     // Catch:{ all -> 0x087d }
        L_0x08f5:
            r0 = move-exception
            r7 = r42
        L_0x08f8:
            r2 = r0
            r11 = r2
            r4 = r28
        L_0x08fc:
            java.lang.String r2 = "PeopleSync"
            java.lang.String r3 = "Database operation failed"
            android.util.Log.e(r2, r3, r11)     // Catch:{ all -> 0x087d }
            r2 = 1
            r7.databaseError = r2     // Catch:{ all -> 0x087d }
            android.content.Context r5 = r39.getContext()     // Catch:{ all -> 0x087d }
            java.lang.String r6 = "PeopleSync"
            java.lang.String r7 = r14.name     // Catch:{ all -> 0x087d }
            r8 = 0
            java.lang.String r9 = "***DB error***"
            r10 = r11
            defpackage.wus.a(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x087d }
            ycw r2 = r1.d     // Catch:{ all -> 0x087d }
            android.content.Context r3 = r39.getContext()     // Catch:{ all -> 0x087d }
            java.lang.String r5 = r14.name     // Catch:{ all -> 0x087d }
            android.accounts.Account r2 = r2.a(r3, r5)     // Catch:{ all -> 0x087d }
            if (r2 == 0) goto L_0x093a
            xej r2 = r1.b     // Catch:{ all -> 0x087d }
            r6 = 6
            r3 = r40
            r5 = r41
            r7 = r11
            r8 = r15
            r9 = r21
            r11 = r23
            r12 = r24
            r13 = r25
            r2.a((android.accounts.Account) r3, (int) r4, (android.os.Bundle) r5, (int) r6, (java.lang.Exception) r7, (java.util.List) r8, (long) r9, (boolean) r11, (boolean) r12, (defpackage.amri) r13)     // Catch:{ all -> 0x087d }
            r15 = 2
            goto L_0x0b05
        L_0x093a:
            r15 = 2
            goto L_0x0b05
        L_0x093d:
            r0 = move-exception
            r7 = r42
        L_0x0940:
            r2 = r0
            r6 = r2
            r4 = r28
        L_0x0944:
            java.lang.String r2 = "PeopleSync"
            java.lang.String r3 = "Network request failed: %s [%s]"
            r5 = 2
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x087d }
            java.lang.String r9 = r6.getMessage()     // Catch:{ all -> 0x087d }
            r10 = 0
            r8[r10] = r9     // Catch:{ all -> 0x087d }
            com.android.volley.NetworkResponse r9 = r6.networkResponse     // Catch:{ all -> 0x087d }
            if (r9 == 0) goto L_0x095d
            int r9 = r9.statusCode     // Catch:{ all -> 0x087d }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x087d }
            goto L_0x095f
        L_0x095d:
            java.lang.String r9 = "none"
        L_0x095f:
            r10 = 1
            r8[r10] = r9     // Catch:{ all -> 0x087d }
            defpackage.xdt.b(r2, r3, r8)     // Catch:{ all -> 0x087d }
            android.content.SyncStats r2 = r7.stats     // Catch:{ all -> 0x087d }
            long r8 = r2.numIoExceptions     // Catch:{ all -> 0x087d }
            long r8 = r8 + r32
            r2.numIoExceptions = r8     // Catch:{ all -> 0x087d }
            android.content.Context r8 = r39.getContext()     // Catch:{ all -> 0x087d }
            java.lang.String r9 = "PeopleSync"
            java.lang.String r10 = r14.name     // Catch:{ all -> 0x087d }
            java.lang.String r2 = "***VolleyError***: "
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x087d }
            java.lang.String r11 = "%s [%s]"
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x087d }
            java.lang.String r13 = r6.getMessage()     // Catch:{ all -> 0x087d }
            r18 = 0
            r12[r18] = r13     // Catch:{ all -> 0x087d }
            com.android.volley.NetworkResponse r13 = r6.networkResponse     // Catch:{ all -> 0x087d }
            if (r13 == 0) goto L_0x0990
            int r13 = r13.statusCode     // Catch:{ all -> 0x087d }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x087d }
            goto L_0x0992
        L_0x0990:
            java.lang.String r13 = "none"
        L_0x0992:
            r18 = 1
            r12[r18] = r13     // Catch:{ all -> 0x087d }
            java.lang.String r3 = java.lang.String.format(r3, r11, r12)     // Catch:{ all -> 0x087d }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x087d }
            int r11 = r3.length()     // Catch:{ all -> 0x087d }
            if (r11 != 0) goto L_0x09ab
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x087d }
            r3.<init>(r2)     // Catch:{ all -> 0x087d }
            r12 = r3
            goto L_0x09b0
        L_0x09ab:
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x087d }
            r12 = r2
        L_0x09b0:
            r11 = 0
            r13 = r6
            defpackage.wus.a(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x087d }
            xej r2 = r1.b     // Catch:{ all -> 0x087d }
            java.lang.String r3 = r14.name     // Catch:{ all -> 0x087d }
            defpackage.iva.a((java.lang.Object) r3)     // Catch:{ all -> 0x087d }
            defpackage.iva.a((java.lang.Object) r6)     // Catch:{ all -> 0x087d }
            wss r8 = r2.b     // Catch:{ all -> 0x087d }
            int r8 = r8.e(r3)     // Catch:{ all -> 0x087d }
            int r9 = defpackage.ybi.a(r6)     // Catch:{ all -> 0x087d }
            r10 = 500(0x1f4, float:7.0E-43)
            r11 = 404(0x194, float:5.66E-43)
            if (r9 == 0) goto L_0x09ed
            if (r9 == r11) goto L_0x09e1
            if (r9 == r10) goto L_0x09d5
            r13 = 0
            goto L_0x09f8
        L_0x09d5:
            ayxp r12 = defpackage.ayxp.a     // Catch:{ all -> 0x087d }
            ayxq r12 = r12.a()     // Catch:{ all -> 0x087d }
            long r12 = r12.h()     // Catch:{ all -> 0x087d }
            int r13 = (int) r12     // Catch:{ all -> 0x087d }
            goto L_0x09f8
        L_0x09e1:
            ayxp r12 = defpackage.ayxp.a     // Catch:{ all -> 0x087d }
            ayxq r12 = r12.a()     // Catch:{ all -> 0x087d }
            long r12 = r12.g()     // Catch:{ all -> 0x087d }
            int r13 = (int) r12     // Catch:{ all -> 0x087d }
            goto L_0x09f8
        L_0x09ed:
            ayxp r12 = defpackage.ayxp.a     // Catch:{ all -> 0x087d }
            ayxq r12 = r12.a()     // Catch:{ all -> 0x087d }
            long r12 = r12.f()     // Catch:{ all -> 0x087d }
            int r13 = (int) r12     // Catch:{ all -> 0x087d }
        L_0x09f8:
            if (r13 > 0) goto L_0x0a05
            ayxp r12 = defpackage.ayxp.a     // Catch:{ all -> 0x087d }
            ayxq r12 = r12.a()     // Catch:{ all -> 0x087d }
            long r12 = r12.e()     // Catch:{ all -> 0x087d }
            int r13 = (int) r12     // Catch:{ all -> 0x087d }
        L_0x0a05:
            if (r9 == 0) goto L_0x0a25
            if (r9 == r11) goto L_0x0a19
            if (r9 == r10) goto L_0x0a0d
            r11 = 0
            goto L_0x0a30
        L_0x0a0d:
            ayxp r10 = defpackage.ayxp.a     // Catch:{ all -> 0x087d }
            ayxq r10 = r10.a()     // Catch:{ all -> 0x087d }
            long r10 = r10.d()     // Catch:{ all -> 0x087d }
            int r11 = (int) r10     // Catch:{ all -> 0x087d }
            goto L_0x0a30
        L_0x0a19:
            ayxp r10 = defpackage.ayxp.a     // Catch:{ all -> 0x087d }
            ayxq r10 = r10.a()     // Catch:{ all -> 0x087d }
            long r10 = r10.c()     // Catch:{ all -> 0x087d }
            int r11 = (int) r10     // Catch:{ all -> 0x087d }
            goto L_0x0a30
        L_0x0a25:
            ayxp r10 = defpackage.ayxp.a     // Catch:{ all -> 0x087d }
            ayxq r10 = r10.a()     // Catch:{ all -> 0x087d }
            long r10 = r10.b()     // Catch:{ all -> 0x087d }
            int r11 = (int) r10     // Catch:{ all -> 0x087d }
        L_0x0a30:
            if (r11 != 0) goto L_0x0a4b
            ayxp r10 = defpackage.ayxp.a     // Catch:{ all -> 0x087d }
            ayxq r10 = r10.a()     // Catch:{ all -> 0x087d }
            long r10 = r10.a()     // Catch:{ all -> 0x087d }
            int r11 = (int) r10     // Catch:{ all -> 0x087d }
            r10 = 302(0x12e, float:4.23E-43)
            if (r9 != r10) goto L_0x0a48
            r9 = 1
            if (r11 == r9) goto L_0x0a46
            r9 = 0
            goto L_0x0a51
        L_0x0a46:
            r9 = 1
            goto L_0x0a51
        L_0x0a48:
            if (r11 != r5) goto L_0x0a50
            goto L_0x0a4e
        L_0x0a4b:
            r9 = 1
            if (r11 == r9) goto L_0x0a50
        L_0x0a4e:
            r9 = 0
            goto L_0x0a51
        L_0x0a50:
            r9 = 1
        L_0x0a51:
            if (r8 > 0) goto L_0x0a54
            goto L_0x0a5c
        L_0x0a54:
            int r13 = java.lang.Math.max(r13, r8)     // Catch:{ all -> 0x087d }
            if (r9 != 0) goto L_0x0a5b
            goto L_0x0a5c
        L_0x0a5b:
            int r13 = r13 + r13
        L_0x0a5c:
            aywy r8 = defpackage.aywy.a     // Catch:{ all -> 0x087d }
            ayxk r8 = r8.a()     // Catch:{ all -> 0x087d }
            long r8 = r8.cN()     // Catch:{ all -> 0x087d }
            int r9 = (int) r8     // Catch:{ all -> 0x087d }
            int r8 = java.lang.Math.min(r9, r13)     // Catch:{ all -> 0x087d }
            android.content.Context r9 = r2.a     // Catch:{ all -> 0x087d }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x087d }
            r11 = 19
            r10.<init>(r11)     // Catch:{ all -> 0x087d }
            java.lang.String r11 = "backoff="
            r10.append(r11)     // Catch:{ all -> 0x087d }
            r10.append(r8)     // Catch:{ all -> 0x087d }
            java.lang.String r11 = "PeopleSync"
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x087d }
            r12 = 0
            defpackage.wus.a((android.content.Context) r9, (java.lang.String) r11, (java.lang.String) r3, (java.lang.String) r12, (java.lang.String) r10)     // Catch:{ all -> 0x087d }
            wss r2 = r2.b     // Catch:{ all -> 0x087d }
            r2.a((java.lang.String) r3, (int) r8)     // Catch:{ all -> 0x087d }
            if (r8 <= 0) goto L_0x0ab3
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x087d }
            java.lang.String r9 = "PeopleSync"
            java.lang.String r10 = "Delaying %f hours"
            double r11 = (double) r8
            r18 = 4660134898793709568(0x40ac200000000000, double:3600.0)
            java.lang.Double.isNaN(r11)
            double r11 = r11 / r18
            java.lang.Double r11 = java.lang.Double.valueOf(r11)     // Catch:{ all -> 0x087d }
            defpackage.xdt.a((java.lang.String) r9, (java.lang.String) r10, (java.lang.Object) r11)     // Catch:{ all -> 0x087d }
            long r9 = r7.delayUntil     // Catch:{ all -> 0x087d }
            long r2 = r2 / r26
            long r11 = (long) r8     // Catch:{ all -> 0x087d }
            long r2 = r2 + r11
            long r2 = java.lang.Math.max(r9, r2)     // Catch:{ all -> 0x087d }
            r7.delayUntil = r2     // Catch:{ all -> 0x087d }
        L_0x0ab3:
            xej r2 = r1.b     // Catch:{ all -> 0x087d }
            r7 = 4
            r3 = r40
            r13 = 2
            r5 = r41
            r8 = r6
            r6 = r7
            r7 = r8
            r8 = r15
            r9 = r21
            r11 = r23
            r12 = r24
            r15 = 2
            r13 = r25
            r2.a((android.accounts.Account) r3, (int) r4, (android.os.Bundle) r5, (int) r6, (java.lang.Exception) r7, (java.util.List) r8, (long) r9, (boolean) r11, (boolean) r12, (defpackage.amri) r13)     // Catch:{ all -> 0x0acc }
            goto L_0x0b05
        L_0x0acc:
            r0 = move-exception
            r2 = r0
            r7 = 51
            goto L_0x0b75
        L_0x0ad2:
            r0 = move-exception
            r7 = r42
            r12 = 0
            r13 = 2
            r2 = r0
        L_0x0ad8:
            r8 = r2
            r9 = r21
            r4 = r28
        L_0x0add:
            android.content.SyncStats r2 = r7.stats     // Catch:{ all -> 0x0b69 }
            long r5 = r2.numAuthExceptions     // Catch:{ all -> 0x0b69 }
            long r5 = r5 + r32
            r2.numAuthExceptions = r5     // Catch:{ all -> 0x0b69 }
            android.content.Context r2 = r39.getContext()     // Catch:{ all -> 0x0b69 }
            java.lang.String r3 = "PeopleSync"
            java.lang.String r5 = r14.name     // Catch:{ all -> 0x0b69 }
            java.lang.String r6 = "***Auth error***"
            defpackage.wus.a((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r5, (java.lang.String) r12, (java.lang.String) r6)     // Catch:{ all -> 0x0b69 }
            xej r2 = r1.b     // Catch:{ all -> 0x0b69 }
            r6 = 3
            r3 = r40
            r5 = r41
            r7 = r8
            r8 = r15
            r11 = r23
            r12 = r24
            r15 = 2
            r13 = r25
            r2.a((android.accounts.Account) r3, (int) r4, (android.os.Bundle) r5, (int) r6, (java.lang.Exception) r7, (java.util.List) r8, (long) r9, (boolean) r11, (boolean) r12, (defpackage.amri) r13)     // Catch:{ all -> 0x0b65 }
        L_0x0b05:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ xsa -> 0x0b61 }
            long r5 = r2 - r16
            android.content.Context r2 = r39.getContext()     // Catch:{ xsa -> 0x0b5d }
            java.lang.String r3 = r14.name     // Catch:{ xsa -> 0x0b5d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ xsa -> 0x0b5d }
            r7 = 51
            r4.<init>(r7)     // Catch:{ xsa -> 0x0b5b }
            java.lang.String r8 = "***Sync finished***, duration: "
            r4.append(r8)     // Catch:{ xsa -> 0x0b5b }
            r4.append(r5)     // Catch:{ xsa -> 0x0b5b }
            java.lang.String r8 = "PeopleSync"
            java.lang.String r4 = r4.toString()     // Catch:{ xsa -> 0x0b5b }
            defpackage.wus.a((android.content.Context) r2, (java.lang.String) r8, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ xsa -> 0x0b5b }
            boolean r2 = defpackage.ayws.i()
            if (r2 == 0) goto L_0x0bea
            java.util.Random r2 = g
            double r2 = r2.nextDouble()
            double r4 = defpackage.ayws.j()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0bea
            android.content.Context r2 = r39.getContext()
            wtz r2 = defpackage.wtz.a((android.content.Context) r2)
            wtx r2 = r2.b()
            if (r2 == 0) goto L_0x0b5a
            wml r2 = defpackage.wml.a()
            java.lang.String r3 = r14.name
            int r4 = defpackage.wtx.c
            int r5 = defpackage.wtx.d
            r2.a((java.lang.String) r3, (int) r4, (int) r5, (int) r15)
            goto L_0x0be5
        L_0x0b5a:
            return
        L_0x0b5b:
            r0 = move-exception
            goto L_0x0b99
        L_0x0b5d:
            r0 = move-exception
            r7 = 51
            goto L_0x0b99
        L_0x0b61:
            r0 = move-exception
            r7 = 51
            goto L_0x0b97
        L_0x0b65:
            r0 = move-exception
            r7 = 51
            goto L_0x0b74
        L_0x0b69:
            r0 = move-exception
            r7 = 51
            r15 = 2
            goto L_0x0b74
        L_0x0b6e:
            r0 = move-exception
            r7 = 51
            r15 = 2
            r36 = -1
        L_0x0b74:
            r2 = r0
        L_0x0b75:
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ xsa -> 0x0b8a }
            long r5 = r3 - r16
            throw r2     // Catch:{ xsa -> 0x0b7c }
        L_0x0b7c:
            r0 = move-exception
            goto L_0x0b99
        L_0x0b7e:
            r0 = move-exception
            r7 = 51
            r15 = 2
            r36 = -1
            xsa r2 = new xsa     // Catch:{ xsa -> 0x0b8a }
            r2.<init>()     // Catch:{ xsa -> 0x0b8a }
            throw r2     // Catch:{ xsa -> 0x0b8a }
        L_0x0b8a:
            r0 = move-exception
            goto L_0x0b97
        L_0x0b8c:
            r0 = move-exception
            r15 = 2
        L_0x0b8e:
            r2 = r0
            goto L_0x0c7e
        L_0x0b91:
            r0 = move-exception
            r7 = 51
            r15 = 2
            r36 = -1
        L_0x0b97:
            r5 = r36
        L_0x0b99:
            android.content.Context r2 = r39.getContext()     // Catch:{ all -> 0x0c7b }
            java.lang.String r3 = r14.name     // Catch:{ all -> 0x0c7b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c7b }
            r4.<init>(r7)     // Catch:{ all -> 0x0c7b }
            java.lang.String r7 = "***Sync canceled***, duration: "
            r4.append(r7)     // Catch:{ all -> 0x0c7b }
            r4.append(r5)     // Catch:{ all -> 0x0c7b }
            java.lang.String r5 = "PeopleSync"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0c7b }
            defpackage.wus.a((android.content.Context) r2, (java.lang.String) r5, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0c7b }
            boolean r2 = defpackage.ayws.i()
            if (r2 == 0) goto L_0x0bea
            java.util.Random r2 = g
            double r2 = r2.nextDouble()
            double r4 = defpackage.ayws.j()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0bea
            android.content.Context r2 = r39.getContext()
            wtz r2 = defpackage.wtz.a((android.content.Context) r2)
            wtx r2 = r2.b()
            if (r2 == 0) goto L_0x0be9
            wml r2 = defpackage.wml.a()
            java.lang.String r3 = r14.name
            int r4 = defpackage.wtx.c
            int r5 = defpackage.wtx.d
            r6 = 3
            r2.a((java.lang.String) r3, (int) r4, (int) r5, (int) r6)
        L_0x0be5:
            defpackage.wtx.h()
            goto L_0x0bea
        L_0x0be9:
            return
        L_0x0bea:
            aywy r2 = defpackage.aywy.a
            ayxk r2 = r2.a()
            boolean r2 = r2.aM()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0c7a
            android.content.Context r2 = r39.getContext()
            android.content.Context r3 = r39.getContext()
            defpackage.wtz.a((android.content.Context) r3)
            java.lang.String r3 = "pluscontacts.db"
            long r2 = defpackage.jit.a((android.content.Context) r2, (java.lang.String) r3)
            defpackage.wml.a()
            java.lang.String r4 = r14.name
            defpackage.xip.a()
            java.util.Random r5 = defpackage.wml.a
            double r5 = r5.nextDouble()
            aywy r7 = defpackage.aywy.a
            ayxk r7 = r7.a()
            double r7 = r7.aL()
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            double r7 = r7.doubleValue()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0c7a
            xmh r5 = defpackage.xmh.o
            aucd r5 = r5.o()
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x0c3e
            goto L_0x0c44
        L_0x0c3e:
            r5.c()
            r6 = 0
            r5.c = r6
        L_0x0c44:
            aucj r6 = r5.b
            xmh r6 = (defpackage.xmh) r6
            int r7 = r6.a
            r8 = 1
            r7 = r7 | r8
            r6.a = r7
            r6.b = r2
            aucj r2 = r5.i()
            xmh r2 = (defpackage.xmh) r2
            xol r3 = defpackage.xol.w
            aucd r3 = r3.o()
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x0c61
            goto L_0x0c67
        L_0x0c61:
            r3.c()
            r5 = 0
            r3.c = r5
        L_0x0c67:
            aucj r5 = r3.b
            xol r5 = (defpackage.xol) r5
            r2.getClass()
            r5.m = r2
            int r2 = r5.a
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r5.a = r2
            defpackage.wmm.a(r4, r3)
            return
        L_0x0c7a:
            return
        L_0x0c7b:
            r0 = move-exception
            goto L_0x0b8e
        L_0x0c7e:
            boolean r3 = defpackage.ayws.i()
            if (r3 == 0) goto L_0x0cb1
            java.util.Random r3 = g
            double r3 = r3.nextDouble()
            double r5 = defpackage.ayws.j()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0cb1
            android.content.Context r3 = r39.getContext()
            wtz r3 = defpackage.wtz.a((android.content.Context) r3)
            wtx r3 = r3.b()
            if (r3 != 0) goto L_0x0ca1
            return
        L_0x0ca1:
            wml r3 = defpackage.wml.a()
            java.lang.String r4 = r14.name
            int r5 = defpackage.wtx.c
            int r6 = defpackage.wtx.d
            r3.a((java.lang.String) r4, (int) r5, (int) r6, (int) r15)
            defpackage.wtx.h()
        L_0x0cb1:
            throw r2
        L_0x0cb2:
            return
        L_0x0cb3:
            r0 = move-exception
            r2 = r0
            monitor-exit(r39)     // Catch:{ all -> 0x0cb3 }
            goto L_0x0cb8
        L_0x0cb7:
            throw r2
        L_0x0cb8:
            goto L_0x0cb7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xei.a(android.accounts.Account, android.os.Bundle, android.content.SyncResult):void");
    }

    /* access modifiers changed from: protected */
    public final void a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        if (aywy.a.a().d() && bundle != null && !bundle.getBoolean("user_or_self_requested", false)) {
            Log.w("PeopleSync", "Only user requested syncs are run during API tests");
            return;
        }
        xip.a();
        if (Boolean.valueOf(aywy.a.a().bP()).booleanValue()) {
            try {
                a(account, bundle, syncResult);
            } catch (Exception e2) {
                xdt.b("PeopleSync", "Unable to perform sync due to general exception: %s", e2);
                yde.a.a(getContext()).a(e2, ((Double) xhi.a.a()).doubleValue());
            }
        } else {
            a(account, bundle, syncResult);
        }
    }
}
