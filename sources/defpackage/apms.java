package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.appindexing.service.OneoffRebuildIndexChimeraService;
import com.google.firebase.appindexing.internal.CallStatus;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: apms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apms extends bhw implements apmt {
    public final prm a;
    public final oyq b;
    public final oyt c;
    public final oxx d;
    public final String e;
    public final ozc f;
    private final int g;
    private final owx h;

    public apms() {
        super("com.google.firebase.appindexing.internal.IAppIndexingService");
    }

    private static int a(Object[] objArr) {
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private static int b(MutateRequest mutateRequest) {
        int i = mutateRequest.a;
        if (i == 1 || i == 2) {
            return a((Object[]) mutateRequest.b);
        }
        if (i == 3) {
            return a((Object[]) mutateRequest.c);
        }
        if (i != 6) {
            return (i == 7 && mutateRequest.e != null) ? 1 : 0;
        }
        return a((Object[]) mutateRequest.d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b2 A[Catch:{ all -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0157 A[Catch:{ all -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.appindexing.internal.CallStatus a(defpackage.aonk r17, defpackage.ifu r18, com.google.firebase.appindexing.internal.MutateRequest r19, boolean r20) {
        /*
            r16 = this;
            r10 = r16
            r11 = r18
            r0 = r19
            java.lang.String r12 = r17.name()
            r13 = 2
            r15 = 1
            prm r2 = r10.a     // Catch:{ all -> 0x0164 }
            android.content.Context r2 = r2.b     // Catch:{ all -> 0x0164 }
            oyb r9 = defpackage.oyb.a((android.content.Context) r2)     // Catch:{ all -> 0x0164 }
            oxc r8 = new oxc     // Catch:{ all -> 0x0164 }
            java.lang.String r3 = r10.e     // Catch:{ all -> 0x0164 }
            int r4 = r10.g     // Catch:{ all -> 0x0164 }
            int r2 = r0.a     // Catch:{ all -> 0x0164 }
            switch(r2) {
                case 1: goto L_0x0046;
                case 2: goto L_0x0042;
                case 3: goto L_0x003e;
                case 4: goto L_0x003a;
                case 5: goto L_0x0036;
                case 6: goto L_0x0032;
                case 7: goto L_0x0022;
                default: goto L_0x001f;
            }     // Catch:{ all -> 0x0164 }
        L_0x001f:
            aolv r2 = defpackage.aolv.CONTENT_MUTATE_REQUEST_INVALID     // Catch:{ all -> 0x0164 }
            goto L_0x004a
        L_0x0022:
            com.google.firebase.appindexing.internal.ActionImpl r2 = r0.e     // Catch:{ all -> 0x0164 }
            com.google.firebase.appindexing.internal.ActionImpl$MetadataImpl r2 = r2.e     // Catch:{ all -> 0x0164 }
            int r2 = r2.a     // Catch:{ all -> 0x0164 }
            if (r2 == r15) goto L_0x002e
            aolv r2 = defpackage.aolv.ACTION_END     // Catch:{ all -> 0x0164 }
            r6 = r2
            goto L_0x004b
        L_0x002e:
            aolv r2 = defpackage.aolv.ACTION_START     // Catch:{ all -> 0x0164 }
            r6 = r2
            goto L_0x004b
        L_0x0032:
            aolv r2 = defpackage.aolv.CONTENT_REMOVE_TYPES     // Catch:{ all -> 0x0164 }
            r6 = r2
            goto L_0x004b
        L_0x0036:
            aolv r2 = defpackage.aolv.CONTENT_UPDATE_TAGS     // Catch:{ all -> 0x0164 }
            r6 = r2
            goto L_0x004b
        L_0x003a:
            aolv r2 = defpackage.aolv.CONTENT_REMOVE_ALL     // Catch:{ all -> 0x0164 }
            r6 = r2
            goto L_0x004b
        L_0x003e:
            aolv r2 = defpackage.aolv.CONTENT_REMOVE     // Catch:{ all -> 0x0164 }
            r6 = r2
            goto L_0x004b
        L_0x0042:
            aolv r2 = defpackage.aolv.CONTENT_PATCH     // Catch:{ all -> 0x0164 }
            r6 = r2
            goto L_0x004b
        L_0x0046:
            aolv r2 = defpackage.aolv.CONTENT_UPDATE     // Catch:{ all -> 0x0164 }
            r6 = r2
            goto L_0x004b
        L_0x004a:
            r6 = r2
        L_0x004b:
            int r7 = b(r19)     // Catch:{ all -> 0x0164 }
            boolean r2 = defpackage.pba.l()     // Catch:{ all -> 0x0164 }
            if (r2 == 0) goto L_0x00a5
            int r2 = r0.a     // Catch:{ all -> 0x0164 }
            if (r2 == r15) goto L_0x0081
            if (r2 == r13) goto L_0x0081
            r5 = 6
            if (r2 == r5) goto L_0x0060
            r1 = 0
            goto L_0x00a6
        L_0x0060:
            java.lang.String[] r2 = r0.d     // Catch:{ all -> 0x0164 }
            if (r2 == 0) goto L_0x007f
            anav r2 = defpackage.anax.j()     // Catch:{ all -> 0x0164 }
            java.lang.String[] r5 = r0.d     // Catch:{ all -> 0x0164 }
            int r1 = r5.length     // Catch:{ all -> 0x0164 }
            r15 = 0
        L_0x006c:
            if (r15 >= r1) goto L_0x007a
            r14 = r5[r15]     // Catch:{ all -> 0x0164 }
            aonm r14 = defpackage.ovx.a(r14, r9)     // Catch:{ all -> 0x0164 }
            r2.b(r14)     // Catch:{ all -> 0x0164 }
            int r15 = r15 + 1
            goto L_0x006c
        L_0x007a:
            anax r1 = r2.a()     // Catch:{ all -> 0x0164 }
            goto L_0x00a6
        L_0x007f:
            r1 = 0
            goto L_0x00a6
        L_0x0081:
            com.google.firebase.appindexing.internal.Thing[] r1 = r0.b     // Catch:{ all -> 0x0164 }
            if (r1 == 0) goto L_0x00a5
            anav r1 = defpackage.anax.j()     // Catch:{ all -> 0x0164 }
            com.google.firebase.appindexing.internal.Thing[] r2 = r0.b     // Catch:{ all -> 0x0164 }
            int r5 = r2.length     // Catch:{ all -> 0x0164 }
            r14 = 0
        L_0x008d:
            if (r14 >= r5) goto L_0x00a0
            r15 = r2[r14]     // Catch:{ all -> 0x0164 }
            if (r15 != 0) goto L_0x0094
            goto L_0x009d
        L_0x0094:
            java.lang.String r15 = r15.e     // Catch:{ all -> 0x0164 }
            aonm r15 = defpackage.ovx.a(r15, r9)     // Catch:{ all -> 0x0164 }
            r1.b(r15)     // Catch:{ all -> 0x0164 }
        L_0x009d:
            int r14 = r14 + 1
            goto L_0x008d
        L_0x00a0:
            anax r1 = r1.a()     // Catch:{ all -> 0x0164 }
            goto L_0x00a6
        L_0x00a5:
            r1 = 0
        L_0x00a6:
            r2 = r8
            r5 = r17
            r14 = r8
            r8 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0164 }
            int r1 = r0.a     // Catch:{ all -> 0x0161 }
            if (r1 == 0) goto L_0x0157
            java.lang.String r1 = r10.e     // Catch:{ all -> 0x0161 }
            boolean r1 = defpackage.ozx.c(r1)     // Catch:{ all -> 0x0161 }
            if (r1 != 0) goto L_0x00c9
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a     // Catch:{ all -> 0x0161 }
            a((defpackage.ifu) r11, (java.lang.String) r12, (com.google.android.gms.common.api.Status) r0)     // Catch:{ all -> 0x0161 }
            oyq r0 = r10.b     // Catch:{ all -> 0x0161 }
            aolx r1 = defpackage.aolx.NOT_ALLOWED     // Catch:{ all -> 0x0161 }
            r14.a(r0, r1)     // Catch:{ all -> 0x0161 }
            com.google.firebase.appindexing.internal.CallStatus r0 = com.google.firebase.appindexing.internal.CallStatus.a     // Catch:{ all -> 0x0161 }
            return r0
        L_0x00c9:
            int r1 = r0.a     // Catch:{ all -> 0x0161 }
            if (r1 == r13) goto L_0x00ce
        L_0x00cd:
            goto L_0x00fe
        L_0x00ce:
            boolean r1 = defpackage.pba.h()     // Catch:{ all -> 0x0161 }
            if (r1 != 0) goto L_0x00cd
            oyq r1 = r10.b     // Catch:{ all -> 0x0161 }
            aolx r2 = defpackage.aolx.FEATURE_OFF     // Catch:{ all -> 0x0161 }
            r14.a(r1, r2)     // Catch:{ all -> 0x0161 }
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "Feature off: "
            java.lang.String r0 = a((com.google.firebase.appindexing.internal.MutateRequest) r19)     // Catch:{ all -> 0x0161 }
            int r3 = r0.length()     // Catch:{ all -> 0x0161 }
            if (r3 != 0) goto L_0x00ef
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0161 }
            r0.<init>(r2)     // Catch:{ all -> 0x0161 }
            goto L_0x00f3
        L_0x00ef:
            java.lang.String r0 = r2.concat(r0)     // Catch:{ all -> 0x0161 }
        L_0x00f3:
            r2 = 17513(0x4469, float:2.4541E-41)
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0161 }
            a((defpackage.ifu) r11, (java.lang.String) r12, (com.google.android.gms.common.api.Status) r1)     // Catch:{ all -> 0x0161 }
            com.google.firebase.appindexing.internal.CallStatus r0 = com.google.firebase.appindexing.internal.CallStatus.a     // Catch:{ all -> 0x0161 }
            return r0
        L_0x00fe:
            java.lang.String r1 = "Icing"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x0161 }
            if (r1 == 0) goto L_0x0118
            java.lang.String r1 = "Requested %s (%d things)."
            java.lang.String r2 = a((com.google.firebase.appindexing.internal.MutateRequest) r19)     // Catch:{ all -> 0x0161 }
            int r3 = b(r19)     // Catch:{ all -> 0x0161 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0161 }
            defpackage.oso.a((java.lang.String) r1, (java.lang.Object) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0161 }
        L_0x0118:
            prm r1 = r10.a     // Catch:{ all -> 0x0161 }
            android.content.Context r1 = r1.b     // Catch:{ all -> 0x0161 }
            ovw r7 = defpackage.ovw.a((android.content.Context) r1)     // Catch:{ all -> 0x0161 }
            prm r1 = r10.a     // Catch:{ all -> 0x0161 }
            osf r1 = r1.b()     // Catch:{ all -> 0x0161 }
            owf r8 = r1.q     // Catch:{ all -> 0x0161 }
            owm r15 = new owm     // Catch:{ all -> 0x0161 }
            prm r1 = r10.a     // Catch:{ all -> 0x0161 }
            android.content.Context r3 = r1.b     // Catch:{ all -> 0x0161 }
            r1 = r15
            r2 = r16
            r4 = r14
            r5 = r18
            r6 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0161 }
            owx r0 = r10.h     // Catch:{ all -> 0x0161 }
            r1 = r17
            r2 = r20
            boolean r0 = r0.a(r1, r15, r2)     // Catch:{ all -> 0x0161 }
            if (r0 != 0) goto L_0x0154
            java.lang.String r0 = "AppIndexing call rejected: too many calls in progress."
            defpackage.oso.a(r0)     // Catch:{ all -> 0x0161 }
            oyq r0 = r10.b     // Catch:{ all -> 0x0161 }
            aolx r1 = defpackage.aolx.CALL_IN_PROGRESS     // Catch:{ all -> 0x0161 }
            r14.a(r0, r1)     // Catch:{ all -> 0x0161 }
            com.google.firebase.appindexing.internal.CallStatus r0 = com.google.firebase.appindexing.internal.CallStatus.c     // Catch:{ all -> 0x0161 }
            return r0
        L_0x0154:
            com.google.firebase.appindexing.internal.CallStatus r0 = com.google.firebase.appindexing.internal.CallStatus.a     // Catch:{ all -> 0x0161 }
            return r0
        L_0x0157:
            oyq r0 = r10.b     // Catch:{ all -> 0x0161 }
            aolx r1 = defpackage.aolx.INVALID_REQUEST     // Catch:{ all -> 0x0161 }
            r14.a(r0, r1)     // Catch:{ all -> 0x0161 }
            com.google.firebase.appindexing.internal.CallStatus r0 = com.google.firebase.appindexing.internal.CallStatus.b     // Catch:{ all -> 0x0161 }
            return r0
        L_0x0161:
            r0 = move-exception
            r1 = r14
            goto L_0x0166
        L_0x0164:
            r0 = move-exception
            r1 = 0
        L_0x0166:
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r3 = 0
            r2[r3] = r12
            java.lang.String r4 = r10.e
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = "%s[%s]"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r3] = r2
            java.lang.String r3 = "Error performing: %s"
            defpackage.oso.c((java.lang.Throwable) r0, (java.lang.String) r3, (java.lang.Object[]) r4)
            r10.a((defpackage.oxc) r1, (java.lang.Throwable) r0)
            boolean r1 = defpackage.jix.a()
            if (r1 == 0) goto L_0x0190
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c
            a((defpackage.ifu) r11, (java.lang.String) r2, (com.google.android.gms.common.api.Status) r0)
            com.google.firebase.appindexing.internal.CallStatus r0 = com.google.firebase.appindexing.internal.CallStatus.a
            return r0
        L_0x0190:
            goto L_0x0192
        L_0x0191:
            throw r0
        L_0x0192:
            goto L_0x0191
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apms.a(aonk, ifu, com.google.firebase.appindexing.internal.MutateRequest, boolean):com.google.firebase.appindexing.internal.CallStatus");
    }

    public apms(prm prm, oyq oyq, oyt oyt, oxx oxx, String str, int i, owx owx, ozc ozc) {
        super("com.google.firebase.appindexing.internal.IAppIndexingService");
        this.a = prm;
        this.b = oyq;
        this.c = oyt;
        this.d = oxx;
        this.e = str;
        this.g = i;
        this.h = owx;
        this.f = ozc;
    }

    private static String a(MutateRequest mutateRequest) {
        int i = mutateRequest.a;
        if (i == 1) {
            return "update";
        }
        if (i == 2) {
            return "patch";
        }
        if (i == 3) {
            return "remove";
        }
        if (i == 4) {
            return "remove all";
        }
        if (i != 6) {
            return i != 7 ? "(unknown)" : "report user action";
        }
        return "remove types";
    }

    private static ppr a(String str, aonk aonk, oxu oxu) {
        return new owj(aonk, str, oxu);
    }

    private final void a(aonk aonk, ifu ifu, MutateRequest mutateRequest) {
        Status status;
        oso.a("Dispatching legacy %s call.", (Object) aonk.name());
        int i = a(aonk, ifu, mutateRequest, false).d;
        if (i != 1) {
            if (i != 3) {
                status = new Status(17512, "Invalid request");
            } else {
                status = new Status(17601, "Call in progress");
            }
            try {
                ifu.a(status);
            } catch (RemoteException e2) {
                oso.c((Throwable) e2, "Client died during %s", aonk.name());
            }
        }
    }

    private static void a(ifu ifu, String str, Status status) {
        try {
            ifu.a(status);
        } catch (Throwable th) {
            oso.c(th, "Client died while providing callback for: %s", str);
        }
    }

    private final void a(oxc oxc, Throwable th) {
        if (oxc != null) {
            oxc.a(this.b, aolx.INTERNAL_ERROR);
        }
        this.c.a("AppIndexingService INTERNAL_ERROR", th, axrp.f());
    }

    public static boolean a(owm owm) {
        return owm.a instanceof oxk;
    }

    public final CallStatus a(ifu ifu, MutateRequest mutateRequest) {
        return a(aonk.APP_INDEXING_MUTATE, ifu, mutateRequest, ((Boolean) pba.b.c()).booleanValue());
    }

    public final Thing a(ovw ovw, List list, String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        List list2 = list;
        if (!((Boolean) ozx.aD.c()).booleanValue()) {
            return null;
        }
        oyb a2 = oyb.a(this.a.b);
        HashMap hashMap = new HashMap();
        String[] strArr = {str2};
        String[] strArr2 = {"action", "section_thing_proto"};
        SQLiteDatabase readableDatabase = ovw.getReadableDatabase();
        readableDatabase.beginTransactionNonExclusive();
        try {
            for (oxe oxe : ovv.a(readableDatabase, str, a2)) {
                oxe oxe2 = oxe;
                sQLiteDatabase = readableDatabase;
                String[] strArr3 = strArr2;
                try {
                    Cursor query = readableDatabase.query(oyc.a(oxe.a()), strArr2, "uri=? AND tag IS NULL AND action IN ('add','del','mod')", strArr, (String) null, (String) null, "seqno DESC", "1");
                    try {
                        if (query.moveToFirst()) {
                            if ("add".equals(query.getString(0))) {
                                hashMap.put(oxe2, oyl.a((avqi) aucj.a((aucj) avqi.f, ByteBuffer.wrap(query.getBlob(1)))));
                            } else if ("del".equals(query.getString(0))) {
                                hashMap.put(oxe2, (Object) null);
                            }
                        }
                        if (query != null) {
                            query.close();
                            readableDatabase = sQLiteDatabase;
                            strArr2 = strArr3;
                        } else {
                            readableDatabase = sQLiteDatabase;
                            strArr2 = strArr3;
                        }
                    } catch (auda e2) {
                        throw new IllegalArgumentException("Failed to deserialize bytes", e2);
                    } catch (Throwable th2) {
                        th = th2;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            readableDatabase.endTransaction();
            for (int size = list.size() - 1; size >= 0; size--) {
                oxe a3 = oxe.a(((osz) list2.get(size)).c, ((osz) list2.get(size)).e, oyb.a(this.a.b));
                Thing thing = (Thing) hashMap.get(a3);
                if (thing != null) {
                    return thing;
                }
                if (hashMap.containsKey(a3)) {
                    list2.remove(size);
                }
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase = readableDatabase;
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public final List a(String str) {
        ArrayList arrayList = new ArrayList();
        ozs a2 = this.a.b().a();
        synchronized (a2.a()) {
            for (pao d2 : a2.a(this.f, (String[]) null, true, str)) {
                osz d3 = a2.d(d2);
                if (oxe.a(d3.c)) {
                    arrayList.add(d3);
                }
            }
        }
        return arrayList;
    }

    public final List a(List list, String[] strArr) {
        List a2 = ovw.a(this.a.b(), list, strArr);
        ArrayList arrayList = new ArrayList(a2.size());
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(oyl.a((avqi) a2.get(i)));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b9 A[SYNTHETIC, Splitter:B:21:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.apmq r17, com.google.firebase.appindexing.internal.GetIndexableRequest r18) {
        /*
            r16 = this;
            r10 = r16
            r11 = r17
            r0 = r18
            aonk r13 = defpackage.aonk.APP_INDEXING_GET     // Catch:{ all -> 0x0081 }
            oxc r14 = new oxc     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = r10.e     // Catch:{ all -> 0x0081 }
            int r3 = r10.g     // Catch:{ all -> 0x0081 }
            aolv r5 = defpackage.aolv.CONTENT_GET     // Catch:{ all -> 0x0081 }
            r6 = 1
            r7 = 0
            r1 = r14
            r4 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0081 }
            defpackage.iva.a((java.lang.Object) r18)     // Catch:{ all -> 0x007f }
            prm r1 = r10.a     // Catch:{ all -> 0x007f }
            android.content.Context r1 = r1.b     // Catch:{ all -> 0x007f }
            java.lang.String r2 = r0.b     // Catch:{ all -> 0x007f }
            ovw r8 = defpackage.ovw.a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x007f }
            if (r8 == 0) goto L_0x006c
            java.lang.String r1 = r10.e     // Catch:{ all -> 0x007f }
            boolean r1 = defpackage.ozx.c(r1)     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x006c
            java.lang.String r1 = "Requested to get Indexable for: "
            java.lang.String r2 = r0.a     // Catch:{ all -> 0x007f }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x007f }
            int r3 = r2.length()     // Catch:{ all -> 0x007f }
            if (r3 != 0) goto L_0x0042
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x007f }
            r2.<init>(r1)     // Catch:{ all -> 0x007f }
            goto L_0x0046
        L_0x0042:
            java.lang.String r2 = r1.concat(r2)     // Catch:{ all -> 0x007f }
        L_0x0046:
            defpackage.oso.a(r2)     // Catch:{ all -> 0x007f }
            prm r1 = r10.a     // Catch:{ all -> 0x007f }
            ppp r15 = r1.c     // Catch:{ all -> 0x007f }
            java.lang.String r9 = r10.e     // Catch:{ all -> 0x007f }
            owh r7 = new owh     // Catch:{ all -> 0x007f }
            oyt r3 = r10.c     // Catch:{ all -> 0x007f }
            oyq r5 = r10.b     // Catch:{ all -> 0x007f }
            oxx r6 = r10.d     // Catch:{ all -> 0x007f }
            r1 = r7
            r2 = r16
            r4 = r14
            r12 = r7
            r7 = r18
            r0 = r9
            r9 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x007f }
            ppr r0 = a((java.lang.String) r0, (defpackage.aonk) r13, (defpackage.oxu) r12)     // Catch:{ all -> 0x007f }
            r15.d(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x006c:
            oyq r0 = r10.b     // Catch:{ all -> 0x007f }
            aolx r1 = defpackage.aolx.NOT_ALLOWED     // Catch:{ all -> 0x007f }
            r14.a(r0, r1)     // Catch:{ all -> 0x007f }
            com.google.firebase.appindexing.internal.GetIndexableResponse r0 = new com.google.firebase.appindexing.internal.GetIndexableResponse     // Catch:{ all -> 0x007f }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.a     // Catch:{ all -> 0x007f }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x007f }
            r11.a(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x007f:
            r0 = move-exception
            goto L_0x0083
        L_0x0081:
            r0 = move-exception
            r14 = 0
        L_0x0083:
            java.lang.String r1 = r10.e
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 14
            r3.<init>(r2)
            java.lang.String r2 = "GetIndexable["
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = "]"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r5 = "Error performing: %s"
            defpackage.oso.c((java.lang.Throwable) r0, (java.lang.String) r5, (java.lang.Object[]) r3)
            r10.a((defpackage.oxc) r14, (java.lang.Throwable) r0)
            boolean r3 = defpackage.jix.a()
            if (r3 == 0) goto L_0x00d0
            com.google.firebase.appindexing.internal.GetIndexableResponse r0 = new com.google.firebase.appindexing.internal.GetIndexableResponse     // Catch:{ all -> 0x00c5 }
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.Status.c     // Catch:{ all -> 0x00c5 }
            r5 = 0
            r0.<init>(r3, r5)     // Catch:{ all -> 0x00c5 }
            r11.a(r0)     // Catch:{ all -> 0x00c5 }
            return
        L_0x00c5:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r1
            java.lang.String r1 = "Client died while providing callback for: %s"
            defpackage.oso.c((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.Object[]) r2)
            return
        L_0x00d0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apms.a(apmq, com.google.firebase.appindexing.internal.GetIndexableRequest):void");
    }

    public final void a(ovw ovw, oyb oyb) {
        if (ovw.a(this.a.b(), this.f, oyb)) {
            OneoffRebuildIndexChimeraService.a(this.a.b, this.e, aomb.ONE_OFF_REASON_REBUILD);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: apmo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: apmo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: apmo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: apmo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: apmo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: apmo} */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v10, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r2v11, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r2v12, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r2v13, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x017a A[SYNTHETIC, Splitter:B:67:0x017a] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0192  */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r26, android.os.Parcel r27, android.os.Parcel r28) {
        /*
            r25 = this;
            r12 = r25
            r0 = r27
            java.lang.String r1 = "com.google.firebase.appindexing.internal.IAppIndexingCallback"
            r13 = 1
            java.lang.String r2 = "com.google.android.gms.common.api.internal.IStatusCallback"
            switch(r26) {
                case 1: goto L_0x0366;
                case 2: goto L_0x0338;
                case 3: goto L_0x0305;
                case 4: goto L_0x000c;
                case 5: goto L_0x02d8;
                case 6: goto L_0x0221;
                case 7: goto L_0x01ef;
                case 8: goto L_0x01bf;
                case 9: goto L_0x0193;
                case 10: goto L_0x000f;
                default: goto L_0x000c;
            }
        L_0x000c:
            r3 = r12
            r1 = 0
            return r1
        L_0x000f:
            android.os.IBinder r2 = r27.readStrongBinder()
            if (r2 == 0) goto L_0x0028
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r3 = r1 instanceof defpackage.apmq
            if (r3 == 0) goto L_0x0021
            apmq r1 = (defpackage.apmq) r1
            r11 = r1
            goto L_0x0029
        L_0x0021:
            apmo r1 = new apmo
            r1.<init>(r2)
            r11 = r1
            goto L_0x0029
        L_0x0028:
            r11 = 0
        L_0x0029:
            java.lang.String[] r10 = r27.createStringArray()
            android.os.Parcelable$Creator r1 = com.google.firebase.appindexing.GetOptions.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r0, (android.os.Parcelable.Creator) r1)
            r8 = r0
            com.google.firebase.appindexing.GetOptions r8 = (com.google.firebase.appindexing.GetOptions) r8
            java.lang.String r0 = r8.a
            if (r0 != 0) goto L_0x003b
            goto L_0x0045
        L_0x003b:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = r8.a
            r9 = r0
            goto L_0x0048
        L_0x0045:
            java.lang.String r0 = r12.e
            r9 = r0
        L_0x0048:
            oxc r7 = new oxc
            java.lang.String r1 = r12.e
            int r2 = r12.g
            aonk r3 = defpackage.aonk.APP_INDEXING_GET
            aolv r4 = defpackage.aolv.CONTENT_GET
            int r6 = r10.length
            r16 = 0
            r0 = r7
            r5 = r6
            r15 = r6
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            prm r0 = r12.a     // Catch:{ all -> 0x0127 }
            android.content.Context r0 = r0.b     // Catch:{ all -> 0x0127 }
            ovw r0 = defpackage.ovw.a((android.content.Context) r0, (java.lang.String) r9)     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x00fb
            java.lang.String r1 = r12.e     // Catch:{ all -> 0x00f1 }
            boolean r1 = defpackage.ozx.c(r1)     // Catch:{ all -> 0x00f1 }
            if (r1 == 0) goto L_0x00e8
            boolean r1 = r8.b     // Catch:{ all -> 0x00f1 }
            if (r1 != 0) goto L_0x0074
            goto L_0x0090
        L_0x0074:
            if (r15 <= r13) goto L_0x0090
            oyq r0 = r12.b     // Catch:{ all -> 0x0127 }
            aolx r1 = defpackage.aolx.INVALID_ARGUMENT_CHECK_SEQUENCE_TABLE     // Catch:{ all -> 0x0127 }
            r7.a(r0, r1)     // Catch:{ all -> 0x0127 }
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x0127 }
            r1 = 17511(0x4467, float:2.4538E-41)
            java.lang.String r2 = "Can only check one url in the sequence table at a time."
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0127 }
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0127 }
            r11.a((com.google.android.gms.common.api.Status) r0, (java.util.List) r1)     // Catch:{ all -> 0x0127 }
            r3 = r12
            goto L_0x018d
        L_0x0090:
            java.lang.String r1 = "Requested to get Indexables for: "
            java.lang.String r2 = java.util.Arrays.toString(r10)     // Catch:{ all -> 0x00f1 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00f1 }
            int r3 = r2.length()     // Catch:{ all -> 0x00f1 }
            if (r3 != 0) goto L_0x00a6
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0127 }
            r2.<init>(r1)     // Catch:{ all -> 0x0127 }
            goto L_0x00aa
        L_0x00a6:
            java.lang.String r2 = r1.concat(r2)     // Catch:{ all -> 0x00f1 }
        L_0x00aa:
            defpackage.oso.a(r2)     // Catch:{ all -> 0x00f1 }
            prm r1 = r12.a     // Catch:{ all -> 0x00f1 }
            ppp r15 = r1.c     // Catch:{ all -> 0x00f1 }
            java.lang.String r6 = r12.e     // Catch:{ all -> 0x00f1 }
            aonk r5 = defpackage.aonk.APP_INDEXING_GET     // Catch:{ all -> 0x00f1 }
            owi r4 = new owi     // Catch:{ all -> 0x00f1 }
            oyt r3 = r12.c     // Catch:{ all -> 0x00f1 }
            oyq r2 = r12.b     // Catch:{ all -> 0x00f1 }
            oxx r1 = r12.d     // Catch:{ all -> 0x00f1 }
            r16 = r1
            r1 = r4
            r17 = r2
            r2 = r25
            r14 = r4
            r4 = r7
            r13 = r5
            r5 = r17
            r12 = r6
            r6 = r16
            r18 = r7
            r7 = r9
            r26 = r9
            r9 = r0
            r16 = r10
            r27 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00e4 }
            ppr r0 = a((java.lang.String) r12, (defpackage.aonk) r13, (defpackage.oxu) r14)     // Catch:{ all -> 0x00e4 }
            r15.d(r0)     // Catch:{ all -> 0x00e4 }
            r3 = r25
            goto L_0x018d
        L_0x00e4:
            r0 = move-exception
            r3 = r25
            goto L_0x0122
        L_0x00e8:
            r18 = r7
            r26 = r9
            r16 = r10
            r27 = r11
            goto L_0x0103
        L_0x00f1:
            r0 = move-exception
            r26 = r9
            r16 = r10
            r3 = r25
            r2 = r7
            r15 = r11
            goto L_0x012f
        L_0x00fb:
            r18 = r7
            r26 = r9
            r16 = r10
            r27 = r11
        L_0x0103:
            r3 = r25
            oyq r0 = r3.b     // Catch:{ all -> 0x0121 }
            aolx r1 = defpackage.aolx.NOT_ALLOWED     // Catch:{ all -> 0x0121 }
            r2 = r18
            r2.a(r0, r1)     // Catch:{ all -> 0x011d }
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a     // Catch:{ all -> 0x011d }
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ all -> 0x011d }
            r15 = r27
            r15.a((com.google.android.gms.common.api.Status) r0, (java.util.List) r1)     // Catch:{ all -> 0x011b }
            goto L_0x018d
        L_0x011b:
            r0 = move-exception
            goto L_0x012f
        L_0x011d:
            r0 = move-exception
            r15 = r27
            goto L_0x012f
        L_0x0121:
            r0 = move-exception
        L_0x0122:
            r15 = r27
            r2 = r18
            goto L_0x012f
        L_0x0127:
            r0 = move-exception
            r2 = r7
            r26 = r9
            r16 = r10
            r15 = r11
            r3 = r12
        L_0x012f:
            java.lang.String r1 = java.util.Arrays.toString(r16)
            java.lang.String r4 = java.lang.String.valueOf(r26)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 7
            int r4 = r4 + r5
            r6.<init>(r4)
            java.lang.String r4 = "get("
            r6.append(r4)
            r4 = r26
            r6.append(r4)
            java.lang.String r4 = ", "
            r6.append(r4)
            r6.append(r1)
            java.lang.String r1 = "]"
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r4 = 0
            r5[r4] = r1
            java.lang.String r4 = "Error performing: %s"
            defpackage.oso.c((java.lang.Throwable) r0, (java.lang.String) r4, (java.lang.Object[]) r5)
            r3.a((defpackage.oxc) r2, (java.lang.Throwable) r0)
            boolean r2 = defpackage.jix.a()
            if (r2 == 0) goto L_0x0192
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c     // Catch:{ all -> 0x0181 }
            r2 = 0
            r15.a((com.google.android.gms.common.api.Status) r0, (java.util.List) r2)     // Catch:{ all -> 0x0181 }
            goto L_0x018d
        L_0x0181:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r2 = 0
            r4[r2] = r1
            java.lang.String r1 = "Client died while providing callback for: %s"
            defpackage.oso.c((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.Object[]) r4)
        L_0x018d:
            r28.writeNoException()
            goto L_0x0397
        L_0x0192:
            throw r0
        L_0x0193:
            r3 = r12
            android.os.IBinder r1 = r27.readStrongBinder()
            if (r1 == 0) goto L_0x01ac
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof defpackage.ifu
            if (r4 == 0) goto L_0x01a6
            r15 = r2
            ifu r15 = (defpackage.ifu) r15
            goto L_0x01ad
        L_0x01a6:
            ifs r15 = new ifs
            r15.<init>(r1)
            goto L_0x01ad
        L_0x01ac:
            r15 = 0
        L_0x01ad:
            java.lang.String[] r0 = r27.createStringArray()
            aonk r1 = defpackage.aonk.APP_INDEXING_REMOVE_TYPES
            com.google.firebase.appindexing.internal.MutateRequest r0 = com.google.firebase.appindexing.internal.MutateRequest.b((java.lang.String[]) r0)
            r3.a((defpackage.aonk) r1, (defpackage.ifu) r15, (com.google.firebase.appindexing.internal.MutateRequest) r0)
            r28.writeNoException()
            goto L_0x0397
        L_0x01bf:
            r3 = r12
            android.os.IBinder r1 = r27.readStrongBinder()
            if (r1 == 0) goto L_0x01d8
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof defpackage.ifu
            if (r4 == 0) goto L_0x01d2
            r15 = r2
            ifu r15 = (defpackage.ifu) r15
            goto L_0x01d9
        L_0x01d2:
            ifs r15 = new ifs
            r15.<init>(r1)
            goto L_0x01d9
        L_0x01d8:
            r15 = 0
        L_0x01d9:
            android.os.Parcelable$Creator r1 = com.google.firebase.appindexing.internal.MutateRequest.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r0, (android.os.Parcelable.Creator) r1)
            com.google.firebase.appindexing.internal.MutateRequest r0 = (com.google.firebase.appindexing.internal.MutateRequest) r0
            com.google.firebase.appindexing.internal.CallStatus r0 = r3.a((defpackage.ifu) r15, (com.google.firebase.appindexing.internal.MutateRequest) r0)
            r28.writeNoException()
            r4 = r28
            defpackage.bhx.b(r4, r0)
            goto L_0x0397
        L_0x01ef:
            r4 = r28
            r3 = r12
            android.os.IBinder r1 = r27.readStrongBinder()
            if (r1 == 0) goto L_0x020a
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r5 = r2 instanceof defpackage.ifu
            if (r5 == 0) goto L_0x0204
            r15 = r2
            ifu r15 = (defpackage.ifu) r15
            goto L_0x020b
        L_0x0204:
            ifs r15 = new ifs
            r15.<init>(r1)
            goto L_0x020b
        L_0x020a:
            r15 = 0
        L_0x020b:
            android.os.Parcelable$Creator r1 = com.google.firebase.appindexing.internal.Thing.CREATOR
            java.lang.Object[] r0 = r0.createTypedArray(r1)
            com.google.firebase.appindexing.internal.Thing[] r0 = (com.google.firebase.appindexing.internal.Thing[]) r0
            aonk r1 = defpackage.aonk.APP_INDEXING_PATCH
            com.google.firebase.appindexing.internal.MutateRequest r0 = com.google.firebase.appindexing.internal.MutateRequest.b((com.google.firebase.appindexing.internal.Thing[]) r0)
            r3.a((defpackage.aonk) r1, (defpackage.ifu) r15, (com.google.firebase.appindexing.internal.MutateRequest) r0)
            r28.writeNoException()
            goto L_0x0397
        L_0x0221:
            r4 = r28
            r3 = r12
            android.os.IBinder r2 = r27.readStrongBinder()
            if (r2 == 0) goto L_0x023d
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r5 = r1 instanceof defpackage.apmq
            if (r5 == 0) goto L_0x0236
            apmq r1 = (defpackage.apmq) r1
            r2 = r1
            goto L_0x023e
        L_0x0236:
            apmo r1 = new apmo
            r1.<init>(r2)
            r2 = r1
            goto L_0x023e
        L_0x023d:
            r2 = 0
        L_0x023e:
            android.os.Parcelable$Creator r1 = com.google.firebase.appindexing.Query.CREATOR
            java.lang.Object[] r0 = r0.createTypedArray(r1)
            r10 = r0
            com.google.firebase.appindexing.Query[] r10 = (com.google.firebase.appindexing.Query[]) r10
            oxc r1 = new oxc
            java.lang.String r0 = r3.e
            int r5 = r3.g
            aonk r21 = defpackage.aonk.APP_INDEXING_SEARCH
            aolv r22 = defpackage.aolv.CONTENT_SEARCH
            int r6 = r10.length
            r24 = 0
            r18 = r1
            r19 = r0
            r20 = r5
            r23 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24)
            java.lang.String r0 = r3.e     // Catch:{ all -> 0x02b8 }
            boolean r0 = defpackage.ozx.c(r0)     // Catch:{ all -> 0x02b8 }
            if (r0 == 0) goto L_0x02aa
            agvx r0 = defpackage.pba.p     // Catch:{ all -> 0x02b8 }
            java.lang.Object r0 = r0.c()     // Catch:{ all -> 0x02b8 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x02b8 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02b8 }
            if (r0 == 0) goto L_0x0295
            prm r0 = r3.a     // Catch:{ all -> 0x02b8 }
            ppp r0 = r0.c     // Catch:{ all -> 0x02b8 }
            java.lang.String r11 = r3.e     // Catch:{ all -> 0x02b8 }
            aonk r12 = defpackage.aonk.APP_INDEXING_SEARCH     // Catch:{ all -> 0x02b8 }
            oyd r13 = new oyd     // Catch:{ all -> 0x02b8 }
            prm r5 = r3.a     // Catch:{ all -> 0x02b8 }
            osf r6 = r5.b()     // Catch:{ all -> 0x02b8 }
            ozc r8 = r3.f     // Catch:{ all -> 0x02b8 }
            r5 = r13
            r7 = r1
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x02b8 }
            ppr r5 = a((java.lang.String) r11, (defpackage.aonk) r12, (defpackage.oxu) r13)     // Catch:{ all -> 0x02b8 }
            r0.d(r5)     // Catch:{ all -> 0x02b8 }
            goto L_0x02d2
        L_0x0295:
            oyq r0 = r3.b     // Catch:{ all -> 0x02b8 }
            aolx r5 = defpackage.aolx.FEATURE_OFF     // Catch:{ all -> 0x02b8 }
            r1.a(r0, r5)     // Catch:{ all -> 0x02b8 }
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x02b8 }
            r5 = 17513(0x4469, float:2.4541E-41)
            java.lang.String r6 = "search"
            r0.<init>(r5, r6)     // Catch:{ all -> 0x02b8 }
            r5 = 0
            r2.a((com.google.android.gms.common.api.Status) r0, (com.google.firebase.appindexing.ResultSet[]) r5)     // Catch:{ all -> 0x02b8 }
            goto L_0x02d2
        L_0x02aa:
            oyq r0 = r3.b     // Catch:{ all -> 0x02b8 }
            aolx r5 = defpackage.aolx.NOT_ALLOWED     // Catch:{ all -> 0x02b8 }
            r1.a(r0, r5)     // Catch:{ all -> 0x02b8 }
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a     // Catch:{ all -> 0x02b8 }
            r5 = 0
            r2.a((com.google.android.gms.common.api.Status) r0, (com.google.firebase.appindexing.ResultSet[]) r5)     // Catch:{ all -> 0x02b8 }
            goto L_0x02d2
        L_0x02b8:
            r0 = move-exception
            r3.a((defpackage.oxc) r1, (java.lang.Throwable) r0)
            boolean r1 = defpackage.jix.a()
            if (r1 == 0) goto L_0x02d7
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c     // Catch:{ all -> 0x02c9 }
            r5 = 0
            r2.a((com.google.android.gms.common.api.Status) r0, (com.google.firebase.appindexing.ResultSet[]) r5)     // Catch:{ all -> 0x02c9 }
            goto L_0x02d2
        L_0x02c9:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Client died while providing callback for query"
            defpackage.oso.c((java.lang.Throwable) r0, (java.lang.String) r2, (java.lang.Object[]) r1)
        L_0x02d2:
            r28.writeNoException()
            goto L_0x0397
        L_0x02d7:
            throw r0
        L_0x02d8:
            r4 = r28
            r3 = r12
            r5 = 0
            android.os.IBinder r2 = r27.readStrongBinder()
            if (r2 == 0) goto L_0x02f4
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r5 = r1 instanceof defpackage.apmq
            if (r5 == 0) goto L_0x02ee
            r15 = r1
            apmq r15 = (defpackage.apmq) r15
            goto L_0x02f5
        L_0x02ee:
            apmo r15 = new apmo
            r15.<init>(r2)
            goto L_0x02f5
        L_0x02f4:
            r15 = r5
        L_0x02f5:
            android.os.Parcelable$Creator r1 = com.google.firebase.appindexing.internal.GetIndexableRequest.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r0, (android.os.Parcelable.Creator) r1)
            com.google.firebase.appindexing.internal.GetIndexableRequest r0 = (com.google.firebase.appindexing.internal.GetIndexableRequest) r0
            r3.a((defpackage.apmq) r15, (com.google.firebase.appindexing.internal.GetIndexableRequest) r0)
            r28.writeNoException()
            goto L_0x0397
        L_0x0305:
            r4 = r28
            r3 = r12
            r5 = 0
            android.os.IBinder r0 = r27.readStrongBinder()
            if (r0 == 0) goto L_0x0321
            android.os.IInterface r1 = r0.queryLocalInterface(r2)
            boolean r2 = r1 instanceof defpackage.ifu
            if (r2 == 0) goto L_0x031b
            r15 = r1
            ifu r15 = (defpackage.ifu) r15
            goto L_0x0322
        L_0x031b:
            ifs r15 = new ifs
            r15.<init>(r0)
            goto L_0x0322
        L_0x0321:
            r15 = r5
        L_0x0322:
            aonk r0 = defpackage.aonk.APP_INDEXING_REMOVE_ALL
            com.google.firebase.appindexing.internal.MutateRequest r1 = new com.google.firebase.appindexing.internal.MutateRequest
            r6 = 4
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r3.a((defpackage.aonk) r0, (defpackage.ifu) r15, (com.google.firebase.appindexing.internal.MutateRequest) r1)
            r28.writeNoException()
            goto L_0x0397
        L_0x0338:
            r4 = r28
            r3 = r12
            r5 = 0
            android.os.IBinder r1 = r27.readStrongBinder()
            if (r1 == 0) goto L_0x0354
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r5 = r2 instanceof defpackage.ifu
            if (r5 == 0) goto L_0x034e
            r15 = r2
            ifu r15 = (defpackage.ifu) r15
            goto L_0x0355
        L_0x034e:
            ifs r15 = new ifs
            r15.<init>(r1)
            goto L_0x0355
        L_0x0354:
            r15 = r5
        L_0x0355:
            java.lang.String[] r0 = r27.createStringArray()
            aonk r1 = defpackage.aonk.APP_INDEXING_REMOVE
            com.google.firebase.appindexing.internal.MutateRequest r0 = com.google.firebase.appindexing.internal.MutateRequest.a((java.lang.String[]) r0)
            r3.a((defpackage.aonk) r1, (defpackage.ifu) r15, (com.google.firebase.appindexing.internal.MutateRequest) r0)
            r28.writeNoException()
            goto L_0x0397
        L_0x0366:
            r4 = r28
            r3 = r12
            r5 = 0
            android.os.IBinder r1 = r27.readStrongBinder()
            if (r1 == 0) goto L_0x0382
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r5 = r2 instanceof defpackage.ifu
            if (r5 == 0) goto L_0x037c
            r15 = r2
            ifu r15 = (defpackage.ifu) r15
            goto L_0x0383
        L_0x037c:
            ifs r15 = new ifs
            r15.<init>(r1)
            goto L_0x0383
        L_0x0382:
            r15 = r5
        L_0x0383:
            android.os.Parcelable$Creator r1 = com.google.firebase.appindexing.internal.Thing.CREATOR
            java.lang.Object[] r0 = r0.createTypedArray(r1)
            com.google.firebase.appindexing.internal.Thing[] r0 = (com.google.firebase.appindexing.internal.Thing[]) r0
            aonk r1 = defpackage.aonk.APP_INDEXING_UPDATE
            com.google.firebase.appindexing.internal.MutateRequest r0 = com.google.firebase.appindexing.internal.MutateRequest.a((com.google.firebase.appindexing.internal.Thing[]) r0)
            r3.a((defpackage.aonk) r1, (defpackage.ifu) r15, (com.google.firebase.appindexing.internal.MutateRequest) r0)
            r28.writeNoException()
        L_0x0397:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apms.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
