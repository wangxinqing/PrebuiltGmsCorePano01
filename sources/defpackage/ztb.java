package defpackage;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.provider.ContactsContract;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ztb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ztb {
    private static Set g;
    private int a = 20;
    private int b = 5;
    private final zsn c;
    private final boolean d;
    private final boolean e;
    private boolean f = true;
    private final Context h;
    private final zsv i;
    private final zsg j;
    private int k;
    private int l = 2;
    private final int m;

    public ztb(Context context, int i2) {
        zsn zsn = new zsn(context);
        this.h = context;
        this.m = i2;
        this.i = new zsv();
        new zss();
        this.c = zsn;
        this.j = zsg.a("WriteContactsHelper");
        this.k = 0;
        this.d = azfa.a.a().L();
        this.e = azfa.b();
    }

    private final long a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Groups.CONTENT_URI).withValue("account_name", str2).withValue("account_type", "com.google").withValue("group_visible", 1).withValue("title", str).build());
        try {
            return Long.parseLong(this.h.getContentResolver().applyBatch("com.android.contacts", arrayList)[0].uri.getLastPathSegment());
        } catch (OperationApplicationException | RemoteException e2) {
            this.j.a(e2, "Failed to create new group for contacts to be restored.");
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03b7, code lost:
        if (defpackage.zsv.a(r4, r0) == false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03ba, code lost:
        if (r31 != false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03e5, code lost:
        if (defpackage.zsv.a(r4, r0) != false) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0157, code lost:
        if (r7 != null) goto L_0x0169;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0393 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x05fc  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0613  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0616  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0640  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0643  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x06a4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.aqxb r43, boolean r44, java.lang.String r45, defpackage.zzb r46) {
        /*
            r42 = this;
            r1 = r42
            r2 = r43
            r3 = r45
            r4 = r46
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            boolean r0 = defpackage.zsm.a(r0)
            if (r0 != 0) goto L_0x0018
            zsg r0 = r1.j
            java.lang.String r2 = "Don't have WRITE_CONTACTS permission; giving up writing contacts."
            r0.c(r2)
            return
        L_0x0018:
            zsp r5 = new zsp
            r6 = 4
            r5.<init>(r6)
            r5.a()
            zsz r0 = new zsz     // Catch:{ zsu -> 0x0039, zst -> 0x0037, InterruptedException -> 0x002d }
            android.content.Context r8 = r1.h     // Catch:{ zsu -> 0x0039, zst -> 0x0037, InterruptedException -> 0x002d }
            r0.<init>(r8)     // Catch:{ zsu -> 0x0039, zst -> 0x0037, InterruptedException -> 0x002d }
            aqxb r0 = r0.a()     // Catch:{ zsu -> 0x0039, zst -> 0x0037, InterruptedException -> 0x002d }
            goto L_0x0042
        L_0x002d:
            r0 = move-exception
            zsg r8 = r1.j
            java.lang.String r9 = "Interrupted while reading contacts from device."
            r8.a((java.lang.Throwable) r0, (java.lang.String) r9)
            r0 = 0
            goto L_0x0042
        L_0x0037:
            r0 = move-exception
            goto L_0x003a
        L_0x0039:
            r0 = move-exception
        L_0x003a:
            zsg r8 = r1.j
            java.lang.String r9 = "Failed to read contacts from device."
            r8.a((java.lang.Throwable) r0, (java.lang.String) r9)
            r0 = 0
        L_0x0042:
            android.content.Context r8 = r1.h
            java.lang.String r9 = "write_contacts_helper:read_existing_contacts"
            r10 = 0
            r5.a(r8, r9, r10)
            zsv r8 = r1.i
            r9 = 1
            if (r0 == 0) goto L_0x008b
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            r8.a = r11
            aucx r0 = r0.a
            int r11 = r0.size()
            r12 = 0
        L_0x005d:
            if (r12 >= r11) goto L_0x008b
            java.lang.Object r13 = r0.get(r12)
            aqxx r13 = (defpackage.aqxx) r13
            java.util.Set r14 = defpackage.zsv.a((defpackage.aqxx) r13)
            java.lang.Object[] r15 = new java.lang.Object[r9]
            r15[r10] = r14
            int r14 = java.util.Arrays.hashCode(r15)
            android.util.SparseArray r15 = r8.a
            java.lang.Object r15 = r15.get(r14)
            java.util.Set r15 = (java.util.Set) r15
            if (r15 != 0) goto L_0x0080
            java.util.HashSet r15 = new java.util.HashSet
            r15.<init>()
        L_0x0080:
            r15.add(r13)
            android.util.SparseArray r13 = r8.a
            r13.put(r14, r15)
            int r12 = r12 + 1
            goto L_0x005d
        L_0x008b:
            boolean r0 = r1.e
            if (r0 == 0) goto L_0x009c
            zsr r0 = new zsr
            android.content.Context r8 = r1.h
            r0.<init>(r8)
            java.util.Set r0 = r0.a()
            g = r0
        L_0x009c:
            boolean r0 = r1.d
            java.lang.String r8 = "com.google"
            if (r0 != 0) goto L_0x00a3
            goto L_0x00d9
        L_0x00a3:
            azfa r0 = defpackage.azfa.a
            azfb r0 = r0.a()
            boolean r0 = r0.M()
            if (r0 != 0) goto L_0x00b5
            zsv r0 = r1.i
            r0.a((defpackage.aqxb) r2)
            goto L_0x00d9
        L_0x00b5:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            aucx r11 = r2.a
            int r12 = r11.size()
            r13 = 0
        L_0x00c1:
            if (r13 < r12) goto L_0x078b
            aqxb r11 = defpackage.aqxb.c
            aucd r11 = r11.o()
            aqxa r11 = (defpackage.aqxa) r11
            r11.a(r0)
            aucj r0 = r11.i()
            aqxb r0 = (defpackage.aqxb) r0
            zsv r11 = r1.i
            r11.a((defpackage.aqxb) r0)
        L_0x00d9:
            aucx r0 = r2.a
            aqxx[] r11 = new defpackage.aqxx[r10]
            java.lang.Object[] r0 = r0.toArray(r11)
            r11 = r0
            aqxx[] r11 = (defpackage.aqxx[]) r11
            r5.a()
            aqxq r0 = r2.b
            if (r0 != 0) goto L_0x00ed
            aqxq r0 = defpackage.aqxq.b
        L_0x00ed:
            azfa r2 = defpackage.azfa.a
            azfb r2 = r2.a()
            boolean r2 = r2.i()
            r2 = r2 ^ r9
            r12 = 3
            r13 = 2
            r14 = -2
            if (r2 == 0) goto L_0x0181
            if (r0 == 0) goto L_0x010b
            java.lang.String r7 = r0.a
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x010b
            java.lang.String r0 = r0.a
            goto L_0x010e
        L_0x010b:
            java.lang.String r0 = ""
        L_0x010e:
            android.content.Context r7 = r1.h
            r6 = 2131953794(0x7f130882, float:1.954407E38)
            java.lang.String r6 = r7.getString(r6)
            java.lang.Object[] r7 = new java.lang.Object[r9]
            r7[r10] = r0
            java.lang.String r6 = java.lang.String.format(r6, r7)
            android.content.Context r0 = r1.h     // Catch:{ SQLiteException -> 0x015e, all -> 0x015b }
            android.content.ContentResolver r16 = r0.getContentResolver()     // Catch:{ SQLiteException -> 0x015e, all -> 0x015b }
            android.net.Uri r17 = android.provider.ContactsContract.Groups.CONTENT_URI     // Catch:{ SQLiteException -> 0x015e, all -> 0x015b }
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x015e, all -> 0x015b }
            java.lang.String r7 = "_id"
            r0[r10] = r7     // Catch:{ SQLiteException -> 0x015e, all -> 0x015b }
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x015e, all -> 0x015b }
            r7[r10] = r3     // Catch:{ SQLiteException -> 0x015e, all -> 0x015b }
            r7[r9] = r8     // Catch:{ SQLiteException -> 0x015e, all -> 0x015b }
            r7[r13] = r6     // Catch:{ SQLiteException -> 0x015e, all -> 0x015b }
            java.lang.String r19 = "account_name=? AND account_type=? AND title=?"
            r21 = 0
            r18 = r0
            r20 = r7
            android.database.Cursor r7 = r16.query(r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x015e, all -> 0x015b }
            if (r7 == 0) goto L_0x0157
            boolean r0 = r7.moveToFirst()     // Catch:{ SQLiteException -> 0x0155, all -> 0x0153 }
            if (r0 == 0) goto L_0x0157
            long r16 = r7.getLong(r10)     // Catch:{ SQLiteException -> 0x0155, all -> 0x0153 }
            r7.close()
            r12 = r16
            goto L_0x016f
        L_0x0153:
            r0 = move-exception
            goto L_0x017b
        L_0x0155:
            r0 = move-exception
            goto L_0x0160
        L_0x0157:
            if (r7 == 0) goto L_0x015a
            goto L_0x0169
        L_0x015a:
            goto L_0x016c
        L_0x015b:
            r0 = move-exception
            r7 = 0
            goto L_0x017b
        L_0x015e:
            r0 = move-exception
            r7 = 0
        L_0x0160:
            zsg r12 = r1.j     // Catch:{ all -> 0x017a }
            java.lang.String r13 = "Failed to query group for contacts to be restored."
            r12.a((java.lang.Throwable) r0, (java.lang.String) r13)     // Catch:{ all -> 0x017a }
            if (r7 == 0) goto L_0x016e
        L_0x0169:
            r7.close()
        L_0x016c:
            r12 = r14
            goto L_0x016f
        L_0x016e:
            r12 = r14
        L_0x016f:
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0178
            long r14 = r1.a((java.lang.String) r6, (java.lang.String) r3)
            goto L_0x0182
        L_0x0178:
            r14 = r12
            goto L_0x0182
        L_0x017a:
            r0 = move-exception
        L_0x017b:
            if (r7 == 0) goto L_0x0180
            r7.close()
        L_0x0180:
            throw r0
        L_0x0181:
        L_0x0182:
            int r6 = r11.length
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            android.util.SparseArray r13 = new android.util.SparseArray
            r13.<init>()
            if (r44 != 0) goto L_0x0195
            goto L_0x01bc
        L_0x0195:
            r0 = 0
        L_0x0196:
            int r10 = r11.length
            if (r0 >= r10) goto L_0x01bc
            r10 = r11[r0]
            java.lang.String r9 = r10.g
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x01a4
            goto L_0x01b7
        L_0x01a4:
            boolean r9 = r45.isEmpty()
            if (r9 != 0) goto L_0x01b7
            java.lang.String r9 = r10.x
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L_0x01b7
            r9 = r11[r0]
            a((defpackage.aqxx) r9, (android.util.SparseArray) r13)
        L_0x01b7:
            int r0 = r0 + 1
            r9 = 1
            r10 = 0
            goto L_0x0196
        L_0x01bc:
            azfa r0 = defpackage.azfa.a
            azfb r0 = r0.a()
            boolean r9 = r0.w()
            boolean r10 = defpackage.azfa.d()
            r19 = r5
            double r4 = defpackage.azfa.l()
            azeu r0 = defpackage.azeu.a
            azev r0 = r0.a()
            boolean r20 = r0.a()
            r0 = -1
            r0 = 0
            r21 = -1
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x01ec:
            r29 = r4
            int r4 = r11.length
            if (r0 >= r4) goto L_0x06a4
            r4 = r11[r0]
            if (r4 == 0) goto L_0x0229
            java.lang.String r5 = r4.g
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0227
            java.lang.String r5 = r4.a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0227
            java.lang.String r5 = r4.o
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0227
            aucx r5 = r4.d
            int r5 = r5.size()
            if (r5 != 0) goto L_0x0227
            aucx r5 = r4.e
            int r5 = r5.size()
            if (r5 != 0) goto L_0x0227
            aucx r5 = r4.f
            int r5 = r5.size()
            if (r5 == 0) goto L_0x0229
            r5 = 0
            goto L_0x022a
        L_0x0227:
            r5 = 0
            goto L_0x022a
        L_0x0229:
            r5 = 1
        L_0x022a:
            r18 = 1
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x025b
            r31 = r5
            java.lang.String r5 = r4.g
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x025d
            java.lang.String r5 = r4.g
            r32 = r11
            boolean r11 = r1.e
            if (r11 != 0) goto L_0x024b
            boolean r5 = defpackage.aekr.a(r5)
            if (r5 == 0) goto L_0x0256
            r31 = 0
            goto L_0x025f
        L_0x024b:
            java.util.Set r11 = g
            boolean r5 = r11.contains(r5)
            if (r5 == 0) goto L_0x0256
            r31 = 0
            goto L_0x025f
        L_0x0256:
            if (r20 == 0) goto L_0x025f
            int r24 = r24 + 1
            goto L_0x025f
        L_0x025b:
            r31 = r5
        L_0x025d:
            r32 = r11
        L_0x025f:
            boolean r5 = r1.d
            if (r5 != 0) goto L_0x026b
            r33 = r0
            r35 = r6
            r36 = r14
            goto L_0x0366
        L_0x026b:
            if (r31 == 0) goto L_0x0360
            java.lang.String r5 = r4.g
            boolean r5 = r8.equals(r5)
            if (r5 != 0) goto L_0x0360
            zsv r5 = r1.i
            android.util.SparseArray r5 = r5.b
            if (r5 == 0) goto L_0x0360
            r33 = r0
            r11 = 1
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r11 = r4.a
            r17 = 0
            r0[r17] = r11
            int r0 = java.util.Arrays.hashCode(r0)
            java.lang.Object r0 = r5.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x0362
            java.util.Iterator r0 = r0.iterator()
        L_0x0296:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0362
            java.lang.Object r5 = r0.next()
            aqxx r5 = (defpackage.aqxx) r5
            java.lang.String r11 = r4.a
            r34 = r0
            java.lang.String r0 = r5.a
            boolean r0 = defpackage.ius.a(r11, r0)
            if (r0 == 0) goto L_0x0358
            aucx r0 = r4.d
            r35 = r6
            r11 = 0
            aqxs[] r6 = new defpackage.aqxs[r11]
            java.lang.Object[] r0 = r0.toArray(r6)
            aqxs[] r0 = (defpackage.aqxs[]) r0
            java.util.Set r0 = defpackage.zsv.a((defpackage.aqxs[]) r0)
            aucx r6 = r5.d
            r36 = r14
            aqxs[] r14 = new defpackage.aqxs[r11]
            java.lang.Object[] r6 = r6.toArray(r14)
            aqxs[] r6 = (defpackage.aqxs[]) r6
            java.util.Set r6 = defpackage.zsv.a((defpackage.aqxs[]) r6)
            boolean r11 = r6.containsAll(r0)
            if (r11 == 0) goto L_0x0350
            boolean r0 = r0.containsAll(r6)
            r6 = 1
            r0 = r0 ^ r6
            aucx r6 = r4.e
            r11 = 0
            aqxu[] r14 = new defpackage.aqxu[r11]
            java.lang.Object[] r6 = r6.toArray(r14)
            aqxu[] r6 = (defpackage.aqxu[]) r6
            java.util.Set r6 = defpackage.zsv.a((defpackage.aqxu[]) r6)
            aucx r14 = r5.e
            aqxu[] r15 = new defpackage.aqxu[r11]
            java.lang.Object[] r11 = r14.toArray(r15)
            aqxu[] r11 = (defpackage.aqxu[]) r11
            java.util.Set r11 = defpackage.zsv.a((defpackage.aqxu[]) r11)
            boolean r14 = r11.containsAll(r6)
            if (r14 == 0) goto L_0x0348
            if (r0 != 0) goto L_0x0308
            boolean r6 = r6.containsAll(r11)
            if (r6 != 0) goto L_0x0308
            r0 = 1
            goto L_0x0309
        L_0x0308:
        L_0x0309:
            aucx r6 = r4.f
            r11 = 0
            aqxv[] r14 = new defpackage.aqxv[r11]
            java.lang.Object[] r6 = r6.toArray(r14)
            aqxv[] r6 = (defpackage.aqxv[]) r6
            java.util.Set r6 = defpackage.zsv.a((defpackage.aqxv[]) r6)
            aucx r5 = r5.f
            aqxv[] r14 = new defpackage.aqxv[r11]
            java.lang.Object[] r5 = r5.toArray(r14)
            aqxv[] r5 = (defpackage.aqxv[]) r5
            java.util.Set r5 = defpackage.zsv.a((defpackage.aqxv[]) r5)
            boolean r11 = r5.containsAll(r6)
            if (r11 == 0) goto L_0x0340
            if (r0 != 0) goto L_0x033d
            boolean r0 = r6.containsAll(r5)
            if (r0 != 0) goto L_0x0335
            goto L_0x033d
        L_0x0335:
            r0 = r34
            r6 = r35
            r14 = r36
            goto L_0x0296
        L_0x033d:
            r31 = 0
            goto L_0x0366
        L_0x0340:
            r0 = r34
            r6 = r35
            r14 = r36
            goto L_0x0296
        L_0x0348:
            r0 = r34
            r6 = r35
            r14 = r36
            goto L_0x0296
        L_0x0350:
            r0 = r34
            r6 = r35
            r14 = r36
            goto L_0x0296
        L_0x0358:
            r35 = r6
            r36 = r14
            r0 = r34
            goto L_0x0296
        L_0x0360:
            r33 = r0
        L_0x0362:
            r35 = r6
            r36 = r14
        L_0x0366:
            java.util.Set r0 = defpackage.zsv.a((defpackage.aqxx) r4)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r0
            int r5 = java.util.Arrays.hashCode(r6)
            java.lang.Object r5 = r12.get(r5)
            java.util.Set r5 = (java.util.Set) r5
            if (r9 != 0) goto L_0x037d
            goto L_0x0391
        L_0x037d:
            if (r31 == 0) goto L_0x0391
            java.lang.String r6 = r4.g
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L_0x0391
            if (r5 == 0) goto L_0x0391
            boolean r5 = defpackage.zsv.a((defpackage.aqxx) r4, (java.util.Set) r5)
            if (r5 == 0) goto L_0x0391
            r31 = 0
        L_0x0391:
            if (r44 == 0) goto L_0x03ba
            if (r9 == 0) goto L_0x03ba
            if (r31 != 0) goto L_0x0398
            goto L_0x03e7
        L_0x0398:
            java.lang.String r5 = r4.g
            boolean r5 = r8.equals(r5)
            if (r5 != 0) goto L_0x03bd
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r0
            int r0 = java.util.Arrays.hashCode(r6)
            java.lang.Object r0 = r13.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 != 0) goto L_0x03b3
            goto L_0x03bd
        L_0x03b3:
            boolean r0 = defpackage.zsv.a((defpackage.aqxx) r4, (java.util.Set) r0)
            if (r0 == 0) goto L_0x03bd
            goto L_0x03bc
        L_0x03ba:
            if (r31 != 0) goto L_0x03bd
        L_0x03bc:
            goto L_0x03e7
        L_0x03bd:
            zsv r0 = r1.i
            android.util.SparseArray r5 = r0.a
            if (r5 == 0) goto L_0x03f3
            java.util.Set r5 = defpackage.zsv.a((defpackage.aqxx) r4)
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x03f3
            android.util.SparseArray r0 = r0.a
            r6 = 1
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r6 = 0
            r11[r6] = r5
            int r5 = java.util.Arrays.hashCode(r11)
            java.lang.Object r0 = r0.get(r5)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x03f3
            boolean r0 = defpackage.zsv.a((defpackage.aqxx) r4, (java.util.Set) r0)
            if (r0 == 0) goto L_0x03f3
        L_0x03e7:
            r31 = r9
            r34 = r10
            r38 = r13
            r0 = r25
            r3 = r28
            goto L_0x05f4
        L_0x03f3:
            int r0 = r7.size()
            boolean r5 = android.text.TextUtils.isEmpty(r45)
            if (r5 != 0) goto L_0x03ff
            r5 = r8
            goto L_0x0400
        L_0x03ff:
            r5 = 0
        L_0x0400:
            android.net.Uri r6 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            android.content.ContentProviderOperation$Builder r6 = android.content.ContentProviderOperation.newInsert(r6)
            java.lang.String r11 = "account_type"
            android.content.ContentProviderOperation$Builder r5 = r6.withValue(r11, r5)
            java.lang.String r6 = "account_name"
            android.content.ContentProviderOperation$Builder r5 = r5.withValue(r6, r3)
            r6 = 1
            android.content.ContentProviderOperation$Builder r5 = r5.withYieldAllowed(r6)
            android.content.ContentProviderOperation r5 = r5.build()
            r7.add(r5)
            java.lang.String r5 = r4.a
            boolean r5 = r5.isEmpty()
            java.lang.String r6 = "data1"
            java.lang.String r11 = "mimetype"
            java.lang.String r14 = "raw_contact_id"
            if (r5 != 0) goto L_0x0449
            android.net.Uri r5 = android.provider.ContactsContract.Data.CONTENT_URI
            android.content.ContentProviderOperation$Builder r5 = android.content.ContentProviderOperation.newInsert(r5)
            android.content.ContentProviderOperation$Builder r5 = r5.withValueBackReference(r14, r0)
            java.lang.String r15 = "vnd.android.cursor.item/name"
            android.content.ContentProviderOperation$Builder r5 = r5.withValue(r11, r15)
            java.lang.String r15 = r4.a
            android.content.ContentProviderOperation$Builder r5 = r5.withValue(r6, r15)
            android.content.ContentProviderOperation r5 = r5.build()
            r7.add(r5)
        L_0x0449:
            if (r10 == 0) goto L_0x0491
            boolean r5 = r1.f
            if (r5 == 0) goto L_0x0491
            auay r5 = r4.q
            boolean r5 = r5.j()
            if (r5 != 0) goto L_0x0460
            auay r5 = r4.q
            byte[] r5 = r5.k()
            int r25 = r25 + 1
            goto L_0x0470
        L_0x0460:
            auay r5 = r4.p
            boolean r5 = r5.j()
            if (r5 != 0) goto L_0x046f
            auay r5 = r4.p
            byte[] r5 = r5.k()
            goto L_0x0470
        L_0x046f:
            r5 = 0
        L_0x0470:
            if (r5 == 0) goto L_0x0490
            android.net.Uri r15 = android.provider.ContactsContract.Data.CONTENT_URI
            android.content.ContentProviderOperation$Builder r15 = android.content.ContentProviderOperation.newInsert(r15)
            android.content.ContentProviderOperation$Builder r15 = r15.withValueBackReference(r14, r0)
            java.lang.String r3 = "vnd.android.cursor.item/photo"
            android.content.ContentProviderOperation$Builder r3 = r15.withValue(r11, r3)
            java.lang.String r15 = "data15"
            android.content.ContentProviderOperation$Builder r3 = r3.withValue(r15, r5)
            android.content.ContentProviderOperation r3 = r3.build()
            r7.add(r3)
            goto L_0x0492
        L_0x0490:
            goto L_0x0492
        L_0x0491:
        L_0x0492:
            aucx r3 = r4.e
            int r3 = r3.size()
            java.lang.String r5 = "data3"
            java.lang.String r15 = "data2"
            if (r3 <= 0) goto L_0x04ef
            aucx r3 = r4.e
            r31 = r9
            int r9 = r3.size()
            r34 = r10
            r10 = 0
        L_0x04a9:
            if (r10 >= r9) goto L_0x04f3
            java.lang.Object r38 = r3.get(r10)
            r39 = r3
            r3 = r38
            aqxu r3 = (defpackage.aqxu) r3
            android.net.Uri r38 = android.provider.ContactsContract.Data.CONTENT_URI
            r40 = r9
            android.content.ContentProviderOperation$Builder r9 = android.content.ContentProviderOperation.newInsert(r38)
            android.content.ContentProviderOperation$Builder r9 = r9.withValueBackReference(r14, r0)
            r38 = r13
            java.lang.String r13 = "vnd.android.cursor.item/phone_v2"
            android.content.ContentProviderOperation$Builder r9 = r9.withValue(r11, r13)
            java.lang.String r13 = r3.a
            android.content.ContentProviderOperation$Builder r9 = r9.withValue(r6, r13)
            int r13 = r3.e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            android.content.ContentProviderOperation$Builder r9 = r9.withValue(r15, r13)
            java.lang.String r3 = r3.b
            android.content.ContentProviderOperation$Builder r3 = r9.withValue(r5, r3)
            android.content.ContentProviderOperation r3 = r3.build()
            r7.add(r3)
            int r10 = r10 + 1
            r13 = r38
            r3 = r39
            r9 = r40
            goto L_0x04a9
        L_0x04ef:
            r31 = r9
            r34 = r10
        L_0x04f3:
            r38 = r13
            aucx r3 = r4.d
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0544
            aucx r3 = r4.d
            int r9 = r3.size()
            r10 = 0
        L_0x0504:
            if (r10 >= r9) goto L_0x0544
            java.lang.Object r13 = r3.get(r10)
            aqxs r13 = (defpackage.aqxs) r13
            android.net.Uri r39 = android.provider.ContactsContract.Data.CONTENT_URI
            r40 = r3
            android.content.ContentProviderOperation$Builder r3 = android.content.ContentProviderOperation.newInsert(r39)
            android.content.ContentProviderOperation$Builder r3 = r3.withValueBackReference(r14, r0)
            r39 = r9
            java.lang.String r9 = "vnd.android.cursor.item/email_v2"
            android.content.ContentProviderOperation$Builder r3 = r3.withValue(r11, r9)
            java.lang.String r9 = r13.a
            android.content.ContentProviderOperation$Builder r3 = r3.withValue(r6, r9)
            int r9 = r13.e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.content.ContentProviderOperation$Builder r3 = r3.withValue(r15, r9)
            java.lang.String r9 = r13.b
            android.content.ContentProviderOperation$Builder r3 = r3.withValue(r5, r9)
            android.content.ContentProviderOperation r3 = r3.build()
            r7.add(r3)
            int r10 = r10 + 1
            r9 = r39
            r3 = r40
            goto L_0x0504
        L_0x0544:
            aucx r3 = r4.f
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0593
            aucx r3 = r4.f
            int r9 = r3.size()
            r10 = 0
        L_0x0553:
            if (r10 >= r9) goto L_0x0593
            java.lang.Object r13 = r3.get(r10)
            aqxv r13 = (defpackage.aqxv) r13
            android.net.Uri r39 = android.provider.ContactsContract.Data.CONTENT_URI
            r40 = r3
            android.content.ContentProviderOperation$Builder r3 = android.content.ContentProviderOperation.newInsert(r39)
            android.content.ContentProviderOperation$Builder r3 = r3.withValueBackReference(r14, r0)
            r39 = r9
            java.lang.String r9 = "vnd.android.cursor.item/postal-address_v2"
            android.content.ContentProviderOperation$Builder r3 = r3.withValue(r11, r9)
            java.lang.String r9 = r13.a
            android.content.ContentProviderOperation$Builder r3 = r3.withValue(r6, r9)
            int r9 = r13.c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.content.ContentProviderOperation$Builder r3 = r3.withValue(r15, r9)
            java.lang.String r9 = r13.b
            android.content.ContentProviderOperation$Builder r3 = r3.withValue(r5, r9)
            android.content.ContentProviderOperation r3 = r3.build()
            r7.add(r3)
            int r10 = r10 + 1
            r9 = r39
            r3 = r40
            goto L_0x0553
        L_0x0593:
            java.lang.String r3 = r4.o
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x05b8
            android.net.Uri r3 = android.provider.ContactsContract.Data.CONTENT_URI
            android.content.ContentProviderOperation$Builder r3 = android.content.ContentProviderOperation.newInsert(r3)
            android.content.ContentProviderOperation$Builder r3 = r3.withValueBackReference(r14, r0)
            java.lang.String r5 = "vnd.android.cursor.item/note"
            android.content.ContentProviderOperation$Builder r3 = r3.withValue(r11, r5)
            java.lang.String r5 = r4.o
            android.content.ContentProviderOperation$Builder r3 = r3.withValue(r6, r5)
            android.content.ContentProviderOperation r3 = r3.build()
            r7.add(r3)
        L_0x05b8:
            if (r2 != 0) goto L_0x05bb
            goto L_0x05e0
        L_0x05bb:
            r9 = -1
            int r3 = (r36 > r9 ? 1 : (r36 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x05e0
            android.net.Uri r3 = android.provider.ContactsContract.Data.CONTENT_URI
            android.content.ContentProviderOperation$Builder r3 = android.content.ContentProviderOperation.newInsert(r3)
            android.content.ContentProviderOperation$Builder r0 = r3.withValueBackReference(r14, r0)
            java.lang.String r3 = "vnd.android.cursor.item/group_membership"
            android.content.ContentProviderOperation$Builder r0 = r0.withValue(r11, r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r36)
            android.content.ContentProviderOperation$Builder r0 = r0.withValue(r6, r3)
            android.content.ContentProviderOperation r0 = r0.build()
            r7.add(r0)
        L_0x05e0:
            int r28 = r28 + 1
            boolean r0 = a(r4)
            if (r0 != 0) goto L_0x05eb
            int r26 = r26 + 1
            goto L_0x05ed
        L_0x05eb:
            int r27 = r27 + 1
        L_0x05ed:
            a((defpackage.aqxx) r4, (android.util.SparseArray) r12)
            r0 = r25
            r3 = r28
        L_0x05f4:
            int r4 = r1.a
            if (r3 >= r4) goto L_0x060f
            int r4 = r1.b
            if (r0 >= r4) goto L_0x060f
            int r6 = r35 + -1
            r4 = r33
            if (r4 >= r6) goto L_0x0611
            r5 = r46
            r25 = r0
            r28 = r3
            r0 = r4
            r9 = r29
            r6 = r35
            goto L_0x068c
        L_0x060f:
            r4 = r33
        L_0x0611:
            if (r3 > 0) goto L_0x0616
            r5 = r29
            goto L_0x061b
        L_0x0616:
            r5 = r29
            r1.a((java.util.ArrayList) r7, (double) r5)     // Catch:{ RemoteException -> 0x061e }
        L_0x061b:
            r21 = r4
            goto L_0x0633
        L_0x061e:
            r0 = move-exception
            r4 = r0
            boolean r0 = r4 instanceof android.os.TransactionTooLargeException
            if (r0 == 0) goto L_0x069d
            int r0 = r1.l
            if (r0 <= 0) goto L_0x069d
            int r0 = r0 + -1
            r1.l = r0
            r24 = 0
            r26 = 0
            r27 = 0
        L_0x0633:
            r9 = r22
            int r22 = r9 + r26
            r10 = r23
            int r23 = r10 + r27
            r9 = r5
            r5 = r46
            if (r5 != 0) goto L_0x0643
            r6 = r35
            goto L_0x067a
        L_0x0643:
            int r0 = r21 + 1
            if (r35 <= 0) goto L_0x0678
            r6 = r35
            if (r6 < r0) goto L_0x067a
            android.content.Context r4 = r5.a
            r11 = 2131953817(0x7f130899, float:1.9544116E38)
            java.lang.String r4 = r4.getString(r11)
            r11 = 2
            java.lang.Object[] r13 = new java.lang.Object[r11]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r14 = 0
            r13[r14] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r14 = 1
            r13[r14] = r11
            float r0 = (float) r0
            float r11 = (float) r6
            float r0 = r0 / r11
            r11 = 1134723072(0x43a28000, float:325.0)
            float r0 = r0 * r11
            int r0 = (int) r0
            int r0 = r0 + 175
            java.lang.String r4 = java.lang.String.format(r4, r13)
            r5.a((int) r0, (java.lang.String) r4)
            goto L_0x067a
        L_0x0678:
            r6 = r35
        L_0x067a:
            int r0 = r1.k
            int r0 = r0 + r3
            r1.k = r0
            r7.clear()
            r0 = r21
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x068c:
            r3 = 1
            int r0 = r0 + r3
            r3 = r45
            r4 = r9
            r9 = r31
            r11 = r32
            r10 = r34
            r14 = r36
            r13 = r38
            goto L_0x01ec
        L_0x069d:
            r9 = r5
            zsn r0 = r1.c
            r0.a(r4, r9)
            throw r4
        L_0x06a4:
            r5 = r46
            r32 = r11
            r9 = r22
            r10 = r23
            if (r5 == 0) goto L_0x06b5
            r46.a()
            r0 = 0
            r2 = 0
            r3 = 0
            goto L_0x06b8
        L_0x06b5:
            r0 = 0
            r2 = 0
            r3 = 0
        L_0x06b8:
            if (r0 >= r4) goto L_0x06cc
            r5 = r32[r0]
            boolean r5 = a(r5)
            if (r5 == 0) goto L_0x06c5
            int r2 = r2 + 1
            goto L_0x06c9
        L_0x06c5:
            if (r20 != 0) goto L_0x06c9
            int r3 = r3 + 1
        L_0x06c9:
            int r0 = r0 + 1
            goto L_0x06b8
        L_0x06cc:
            if (r20 != 0) goto L_0x06cf
            goto L_0x06d1
        L_0x06cf:
            int r3 = r24 - r2
        L_0x06d1:
            azfa r0 = defpackage.azfa.a
            azfb r0 = r0.a()
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x070e
            zsg r0 = r1.j
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r6 = 0
            r4[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 1
            r4[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r7 = 2
            r4[r7] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r7 = 3
            r4[r7] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r6 = 4
            r4[r6] = r5
            java.lang.String r5 = "Successfully restored the contacts: totalDeviceContacts = %d, totalSimContacts = %d, totalRestoredDeviceContacts = %d, totalRestoredSimContacts = %d, restoreSimContacts = %b"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r0.b(r4)
        L_0x070e:
            zsi r0 = defpackage.zsi.a()
            int r4 = r1.m
            avee r5 = defpackage.avee.g
            aucd r5 = r5.o()
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x071f
            goto L_0x0725
        L_0x071f:
            r5.c()
            r6 = 0
            r5.c = r6
        L_0x0725:
            aucj r6 = r5.b
            avee r6 = (defpackage.avee) r6
            r6.a = r3
            r6.b = r2
            r6.c = r9
            r6.d = r10
            r3 = 1
            r6.e = r3
            azfa r2 = defpackage.azfa.a
            azfb r2 = r2.a()
            boolean r2 = r2.B()
            if (r2 == 0) goto L_0x0741
            goto L_0x074a
        L_0x0741:
            boolean r2 = defpackage.jkr.h()
            if (r2 == 0) goto L_0x075d
            r2 = 3
            if (r4 != r2) goto L_0x075d
        L_0x074a:
            boolean r2 = r5.c
            if (r2 != 0) goto L_0x074f
            goto L_0x0755
        L_0x074f:
            r5.c()
            r2 = 0
            r5.c = r2
        L_0x0755:
            aucj r2 = r5.b
            avee r2 = (defpackage.avee) r2
            int r4 = r4 + -2
            r2.f = r4
        L_0x075d:
            aveu r2 = defpackage.aveu.p
            aucd r2 = r2.o()
            boolean r3 = r2.c
            if (r3 != 0) goto L_0x0768
            goto L_0x076e
        L_0x0768:
            r2.c()
            r3 = 0
            r2.c = r3
        L_0x076e:
            aucj r3 = r2.b
            aveu r3 = (defpackage.aveu) r3
            aucj r4 = r5.i()
            avee r4 = (defpackage.avee) r4
            r4.getClass()
            r3.i = r4
            r0.a((defpackage.aucd) r2)
            android.content.Context r0 = r1.h
            java.lang.String r2 = "write_contacts_helper:restore_contacts"
            r4 = r19
            r7 = 0
            r4.a(r0, r2, r7)
            return
        L_0x078b:
            r3 = 1
            r7 = 0
            r41 = r5
            r5 = r4
            r4 = r41
            java.lang.Object r9 = r11.get(r13)
            aqxx r9 = (defpackage.aqxx) r9
            java.lang.String r10 = r9.g
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x07c6
            java.lang.String r10 = r9.g
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L_0x07a9
            goto L_0x07c6
        L_0x07a9:
            boolean r10 = r1.e
            if (r10 == 0) goto L_0x07bb
            java.util.Set r10 = g
            java.lang.String r14 = r9.g
            boolean r10 = r10.contains(r14)
            if (r10 != 0) goto L_0x07c6
            r0.add(r9)
            goto L_0x07c6
        L_0x07bb:
            java.lang.String r10 = r9.g
            boolean r10 = defpackage.aekr.a(r10)
            if (r10 != 0) goto L_0x07c6
            r0.add(r9)
        L_0x07c6:
            int r13 = r13 + 1
            r3 = r45
            r9 = 1
            r10 = 0
            r41 = r5
            r5 = r4
            r4 = r41
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztb.a(aqxb, boolean, java.lang.String, zzb):void");
    }

    private static void a(aqxx aqxx, SparseArray sparseArray) {
        int hashCode = Arrays.hashCode(new Object[]{zsv.a(aqxx)});
        Set set = (Set) sparseArray.get(hashCode);
        if (set == null) {
            set = new HashSet();
        }
        set.add(aqxx);
        sparseArray.put(hashCode, set);
    }

    private final void a(ArrayList arrayList, double d2) {
        int i2;
        try {
            this.h.getContentResolver().applyBatch("com.android.contacts", arrayList);
        } catch (OperationApplicationException e2) {
            this.j.a((Throwable) e2, "Contact Insertion failed at operation level.");
            this.c.a(e2, d2);
            throw e2;
        } catch (RemoteException e3) {
            this.j.a((Throwable) e3, "Contact Insertion failed at remote level.");
            if ((e3 instanceof TransactionTooLargeException) && (i2 = this.l) > 0) {
                if (i2 == 2) {
                    this.a >>= 1;
                    this.b >>= 1;
                } else if (i2 == 1) {
                    this.f = false;
                }
            }
            this.c.a(e3, d2);
            throw e3;
        }
    }

    private static boolean a(aqxx aqxx) {
        return !aqxx.g.isEmpty() && aqxx.g.matches(".*sim.*|.*SIM.*");
    }

    public final void a(aqxb aqxb, String str, zzb zzb) {
        try {
            a(aqxb, false, str, zzb);
        } catch (InterruptedException e2) {
        }
    }

    public final void a(aqxb aqxb, String str, boolean z) {
        try {
            a(aqxb, z, str, (zzb) null);
        } catch (InterruptedException e2) {
        }
    }
}
