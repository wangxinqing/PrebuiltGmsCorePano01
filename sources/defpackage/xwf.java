package defpackage;

import android.content.ContentProviderOperation;
import android.database.Cursor;

/* renamed from: xwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xwf extends xwa {
    public static final String[] b = {"sourceid", "_id", "data14", "data15", "data_version", "data_sync4", "data_sync2", "data_sync1"};
    private final yaz c;
    private final xvp d;
    private final xyt e;
    private final amri f;
    private final xwt g;

    public xwf(Cursor cursor, xwt xwt, yaz yaz, xvp xvp, xyt xyt, amri amri) {
        super(cursor);
        this.g = xwt;
        this.c = yaz;
        this.d = xvp;
        this.e = xyt;
        this.f = amri;
    }

    private static final ContentProviderOperation.Builder a(long j, Long l, String str) {
        ContentProviderOperation.Builder a = xwc.a(j, l.longValue());
        long longValue = l.longValue() + 1;
        return a.withValue("data_version", Long.valueOf(longValue)).withValue("data_sync4", Long.valueOf(yau.a(longValue))).withValue("data_sync2", str).withValue("data_sync3", str);
    }

    private static boolean a(byte[] bArr) {
        return bArr == null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0252, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0254, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        defpackage.xyi.a(false, defpackage.xjo.PHOTO, defpackage.xnd.UPDATE, r0, r1.c, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0268, code lost:
        throw new defpackage.xwe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0332, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0348, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x034b, code lost:
        r18 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x034d, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        android.util.Log.e(r8, "deletePersonPhoto() failed.", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0353, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0362, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0368, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0369, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x036b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x036d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0370, code lost:
        r18 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        r2 = defpackage.xyi.a(false, defpackage.xjo.PHOTO, defpackage.xnd.REMOVE, r0, r1.c, 1);
        r4 = defpackage.xnd.REMOVE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0381, code lost:
        android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0384, code lost:
        if (r2 == r4) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x038e, code lost:
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0392, code lost:
        android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0395, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0254 A[ExcHandler: xya (e xya), Splitter:B:57:0x0162] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x036d A[ExcHandler: xya (e xya), Splitter:B:122:0x029a] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x039d A[SYNTHETIC, Splitter:B:186:0x039d] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0386 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03a0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r2 = "data_sync1"
            java.lang.String r3 = "FSA2_SyncUpPhotoCursor"
        L_0x0006:
            boolean r4 = r20.d()
            if (r4 == 0) goto L_0x03ea
            xvp r4 = r1.d
            r4.a()
            java.lang.String r4 = "sourceid"
            java.lang.String r4 = r1.a(r4)
            java.lang.String r6 = "_id"
            java.lang.Long r6 = r1.b(r6)
            long r6 = r6.longValue()
            java.lang.String r8 = "data14"
            java.lang.Long r8 = r1.b(r8)
            java.lang.String r9 = "data_sync2"
            java.lang.String r9 = r1.a(r9)
            java.lang.String r10 = "data_version"
            java.lang.Long r10 = r1.b(r10)
            java.lang.String r11 = "data_sync4"
            java.lang.Long r11 = r1.b(r11)
            xyt r15 = r1.e     // Catch:{ IOException -> 0x03a3 }
            if (r8 == 0) goto L_0x0050
            android.net.Uri r16 = android.provider.ContactsContract.DisplayPhoto.CONTENT_URI     // Catch:{ IOException -> 0x03a3 }
            android.net.Uri$Builder r5 = r16.buildUpon()     // Catch:{ IOException -> 0x03a3 }
            long r12 = r8.longValue()     // Catch:{ IOException -> 0x03a3 }
            android.net.Uri$Builder r5 = android.content.ContentUris.appendId(r5, r12)     // Catch:{ IOException -> 0x03a3 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x03a3 }
            goto L_0x005e
        L_0x0050:
            android.net.Uri r5 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ IOException -> 0x03a3 }
            android.net.Uri$Builder r5 = r5.buildUpon()     // Catch:{ IOException -> 0x03a3 }
            android.net.Uri$Builder r5 = android.content.ContentUris.appendId(r5, r6)     // Catch:{ IOException -> 0x03a3 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x03a3 }
        L_0x005e:
            android.content.ContentResolver r12 = r15.a     // Catch:{ all -> 0x0396 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0396 }
            java.lang.String r13 = "r"
            android.content.res.AssetFileDescriptor r5 = r12.openAssetFileDescriptor(r5, r13)     // Catch:{ all -> 0x0396 }
            if (r5 == 0) goto L_0x009f
            java.io.FileInputStream r12 = r5.createInputStream()     // Catch:{ all -> 0x0099 }
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0099 }
            r13.<init>()     // Catch:{ all -> 0x0099 }
            r15 = 4096(0x1000, float:5.74E-42)
            byte[] r15 = new byte[r15]     // Catch:{ all -> 0x0099 }
        L_0x0079:
            int r14 = r12.read(r15)     // Catch:{ all -> 0x0099 }
            r17 = r12
            r12 = -1
            if (r14 != r12) goto L_0x0091
            r13.flush()     // Catch:{ all -> 0x0099 }
            r13.size()     // Catch:{ all -> 0x0099 }
            byte[] r12 = r13.toByteArray()     // Catch:{ all -> 0x0099 }
            r5.close()     // Catch:{ IOException -> 0x03a3 }
            r5 = r12
            goto L_0x00a0
        L_0x0091:
            r12 = 0
            r13.write(r15, r12, r14)     // Catch:{ all -> 0x0099 }
            r12 = r17
            goto L_0x0079
        L_0x0099:
            r0 = move-exception
            r6 = r0
            r18 = r2
            goto L_0x039b
        L_0x009f:
            r5 = 0
        L_0x00a0:
            defpackage.xip.a()
            ayrj r12 = defpackage.ayrj.a
            aytn r12 = r12.a()
            boolean r12 = r12.bq()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x00b8
            goto L_0x00f9
        L_0x00b8:
            if (r11 == 0) goto L_0x00f9
            boolean r11 = a(r5)
            if (r11 != 0) goto L_0x00f9
            if (r8 != 0) goto L_0x00f9
            int r8 = r5.length
            r11 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r5, r11, r8)
            defpackage.xip.a()
            ayrj r11 = defpackage.ayrj.a
            aytn r11 = r11.a()
            long r11 = r11.aD()
            int r12 = (int) r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            int r11 = r11.intValue()
            if (r8 == 0) goto L_0x00f9
            int r12 = r8.getWidth()
            if (r12 != r11) goto L_0x00f9
            int r8 = r8.getHeight()
            if (r8 != r11) goto L_0x00f9
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r4
            java.lang.String r4 = "Skipped the low res photo uploading for contact %s"
            defpackage.xdt.a((java.lang.String) r3, (java.lang.String) r4, (java.lang.Object[]) r5)
            goto L_0x0006
        L_0x00f9:
            java.lang.String r8 = "Start to upload photo for contact %s"
            defpackage.xdt.a((java.lang.String) r3, (java.lang.String) r8, (java.lang.Object) r4)
            boolean r8 = a(r5)
            java.lang.String r11 = "FSA2_PhotoSyncGrpc"
            if (r8 != 0) goto L_0x026c
            xnd r8 = defpackage.xnd.UPDATE     // Catch:{ xwe -> 0x0269 }
            r12 = 1
            r1.a(r8, r12)     // Catch:{ xwe -> 0x0269 }
            java.lang.String r8 = "data15"
            byte[] r8 = r1.c(r8)     // Catch:{ xwe -> 0x0269 }
            java.lang.String r12 = r1.a(r2)     // Catch:{ xwe -> 0x0269 }
            long r13 = defpackage.xyx.a(r8)     // Catch:{ xwe -> 0x0269 }
            java.lang.String r8 = defpackage.xwz.b(r12)     // Catch:{ xwe -> 0x0269 }
            boolean r15 = android.text.TextUtils.isEmpty(r8)     // Catch:{ xwe -> 0x0269 }
            r17 = r11
            r11 = 3
            if (r15 == 0) goto L_0x0129
            goto L_0x0145
        L_0x0129:
            long r18 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0144 }
            int r8 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r8 != 0) goto L_0x0145
            java.lang.String r4 = "Photo content is not changed, skip syncing it and clear dirty."
            android.util.Log.e(r3, r4)     // Catch:{ xwe -> 0x0269 }
            xnd r4 = defpackage.xnd.UPDATE     // Catch:{ xwe -> 0x0269 }
            r1.a(r4, r11)     // Catch:{ xwe -> 0x0269 }
            r20.a()     // Catch:{ xwe -> 0x0269 }
            android.content.ContentProviderOperation$Builder r5 = a(r6, r10, r9)     // Catch:{ xwe -> 0x0269 }
            goto L_0x03eb
        L_0x0144:
            r0 = move-exception
        L_0x0145:
            java.lang.String r8 = java.lang.Long.toString(r13)     // Catch:{ xwe -> 0x0269 }
            java.lang.String r8 = defpackage.xwz.a((java.lang.String) r12, (java.lang.String) r8)     // Catch:{ xwe -> 0x0269 }
            if (r5 == 0) goto L_0x0162
            int r12 = r5.length     // Catch:{ xwe -> 0x0269 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ xwe -> 0x0269 }
            r14 = 19
            r13.<init>(r14)     // Catch:{ xwe -> 0x0269 }
            java.lang.String r14 = "-length="
            r13.append(r14)     // Catch:{ xwe -> 0x0269 }
            r13.append(r12)     // Catch:{ xwe -> 0x0269 }
            r13.toString()     // Catch:{ xwe -> 0x0269 }
        L_0x0162:
            xwt r12 = r1.g     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            boolean r13 = android.text.TextUtils.isEmpty(r4)     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            if (r13 == 0) goto L_0x016c
            goto L_0x023a
        L_0x016c:
            if (r5 == 0) goto L_0x023a
            aqxi r13 = defpackage.aqxi.h     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            aucd r13 = r13.o()     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            boolean r14 = r13.c     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            if (r14 != 0) goto L_0x0179
            goto L_0x017f
        L_0x0179:
            r13.c()     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            r14 = 0
            r13.c = r14     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
        L_0x017f:
            aucj r14 = r13.b     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            aqxi r14 = (defpackage.aqxi) r14     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            int r15 = defpackage.aqwt.a(r11)     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            r14.a = r15     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            boolean r14 = r13.c     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            if (r14 != 0) goto L_0x018e
            goto L_0x0194
        L_0x018e:
            r13.c()     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            r14 = 0
            r13.c = r14     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
        L_0x0194:
            aucj r14 = r13.b     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            aqxi r14 = (defpackage.aqxi) r14     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            r4.getClass()     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            r14.b = r4     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            r4 = 0
            byte r15 = r5[r4]     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            r4 = -119(0xffffffffffffff89, float:NaN)
            if (r15 != r4) goto L_0x01a6
            r4 = 4
            goto L_0x01a7
        L_0x01a6:
            r4 = 3
        L_0x01a7:
            int r4 = defpackage.aqxh.a(r4)     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            r14.g = r4     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            auay r4 = defpackage.auay.a((byte[]) r5)     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            boolean r5 = r13.c     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            if (r5 != 0) goto L_0x01b6
            goto L_0x01bc
        L_0x01b6:
            r13.c()     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            r5 = 0
            r13.c = r5     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
        L_0x01bc:
            aucj r5 = r13.b     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            aqxi r5 = (defpackage.aqxi) r5     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            r4.getClass()     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            r5.c = r4     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            aqwp r4 = r12.f     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            r4.getClass()     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            r5.d = r4     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            aucj r4 = r13.i()     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            aqxi r4 = (defpackage.aqxi) r4     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            yav r5 = r12.d     // Catch:{ eif -> 0x0230, babk -> 0x022e, xya -> 0x0254 }
            r5.a()     // Catch:{ eif -> 0x0230, babk -> 0x022e, xya -> 0x0254 }
            xpp r5 = r12.b     // Catch:{ eif -> 0x0230, babk -> 0x022e, xya -> 0x0254 }
            com.google.android.gms.common.internal.ClientContext r13 = r12.a     // Catch:{ eif -> 0x0230, babk -> 0x022e, xya -> 0x0254 }
            aqxj r4 = r5.a((com.google.android.gms.common.internal.ClientContext) r13, (defpackage.aqxi) r4)     // Catch:{ eif -> 0x0230, babk -> 0x022e, xya -> 0x0254 }
            yav r5 = r12.d     // Catch:{ eif -> 0x0230, babk -> 0x022e, xya -> 0x0254 }
            java.lang.String r12 = "FSA_updatePersonPhoto"
            int r13 = defpackage.xxa.a(r4)     // Catch:{ eif -> 0x0230, babk -> 0x022e, xya -> 0x0254 }
            r14 = 1
            r5.a(r12, r14, r13)     // Catch:{ eif -> 0x0230, babk -> 0x022e, xya -> 0x0254 }
            if (r4 == 0) goto L_0x021b
            java.lang.String r5 = r4.a     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            boolean r5 = r5.isEmpty()     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            if (r5 != 0) goto L_0x021b
            java.lang.String r4 = r4.a     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            ayrj r5 = defpackage.ayrj.a     // Catch:{ xwe -> 0x0269 }
            aytn r5 = r5.a()     // Catch:{ xwe -> 0x0269 }
            boolean r5 = r5.bu()     // Catch:{ xwe -> 0x0269 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ xwe -> 0x0269 }
            boolean r5 = r5.booleanValue()     // Catch:{ xwe -> 0x0269 }
            if (r5 == 0) goto L_0x020d
            r9 = r4
            goto L_0x020e
        L_0x020d:
        L_0x020e:
            r20.a()     // Catch:{ xwe -> 0x0269 }
            android.content.ContentProviderOperation$Builder r4 = a(r6, r10, r9)     // Catch:{ xwe -> 0x0269 }
            android.content.ContentProviderOperation$Builder r5 = r4.withValue(r2, r8)     // Catch:{ xwe -> 0x0269 }
            goto L_0x03eb
        L_0x021b:
            if (r4 == 0) goto L_0x0223
            java.lang.String r4 = "photoToken is empty."
            defpackage.xwt.a(r4)     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            goto L_0x0228
        L_0x0223:
            java.lang.String r4 = "response is null."
            defpackage.xwt.a(r4)     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
        L_0x0228:
            xya r4 = new xya     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            r4.<init>(r11)     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            throw r4     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
        L_0x022e:
            r0 = move-exception
            goto L_0x0231
        L_0x0230:
            r0 = move-exception
        L_0x0231:
            r4 = r0
            java.lang.String r5 = "writePhoto() failed."
            r8 = r17
            android.util.Log.e(r8, r5, r4)     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            throw r4     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
        L_0x023a:
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            if (r4 == 0) goto L_0x0246
            java.lang.String r4 = "contactId was null."
            defpackage.xwt.a(r4)     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            goto L_0x024b
        L_0x0246:
            java.lang.String r4 = "bytes[] was null."
            defpackage.xwt.a(r4)     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
        L_0x024b:
            xya r4 = new xya     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            r5 = 2
            r4.<init>(r5)     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
            throw r4     // Catch:{ eif -> 0x0256, xya -> 0x0254, babk -> 0x0252 }
        L_0x0252:
            r0 = move-exception
            goto L_0x0257
        L_0x0254:
            r0 = move-exception
            goto L_0x0257
        L_0x0256:
            r0 = move-exception
        L_0x0257:
            r9 = r0
            xjo r7 = defpackage.xjo.PHOTO     // Catch:{ xwe -> 0x0269 }
            r6 = 0
            xnd r8 = defpackage.xnd.UPDATE     // Catch:{ xwe -> 0x0269 }
            yaz r10 = r1.c     // Catch:{ xwe -> 0x0269 }
            r11 = 1
            defpackage.xyi.a(r6, r7, r8, r9, r10, r11)     // Catch:{ xwe -> 0x0269 }
            xwe r4 = new xwe     // Catch:{ xwe -> 0x0269 }
            r4.<init>()     // Catch:{ xwe -> 0x0269 }
            throw r4     // Catch:{ xwe -> 0x0269 }
        L_0x0269:
            r0 = move-exception
            goto L_0x0006
        L_0x026c:
            r8 = r11
            ayrj r5 = defpackage.ayrj.a
            aytn r5 = r5.a()
            boolean r5 = r5.bp()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0291
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 != 0) goto L_0x0288
            goto L_0x0291
        L_0x0288:
            r20.a()
            android.content.ContentProviderOperation$Builder r5 = defpackage.xwc.a(r6)
            goto L_0x03eb
        L_0x0291:
            xnd r5 = defpackage.xnd.REMOVE
            r9 = 1
            r1.a(r5, r9)
            android.os.SystemClock.elapsedRealtime()
            xwt r5 = r1.g     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            if (r4 == 0) goto L_0x0354
            aqvc r9 = defpackage.aqvc.c     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            aucd r9 = r9.o()     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            boolean r10 = r9.c     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            if (r10 != 0) goto L_0x02a9
            goto L_0x02af
        L_0x02a9:
            r9.c()     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            r10 = 0
            r9.c = r10     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
        L_0x02af:
            aucj r10 = r9.b     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            aqvc r10 = (defpackage.aqvc) r10     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            r4.getClass()     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            aucx r11 = r10.a     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            boolean r11 = r11.a()     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            if (r11 == 0) goto L_0x02bf
            goto L_0x02c7
        L_0x02bf:
            aucx r11 = r10.a     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            aucx r11 = defpackage.aucj.a((defpackage.aucx) r11)     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            r10.a = r11     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
        L_0x02c7:
            aucx r10 = r10.a     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            r10.add(r4)     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            aqwp r4 = r5.f     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            boolean r10 = r9.c     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            if (r10 != 0) goto L_0x02d3
            goto L_0x02d9
        L_0x02d3:
            r9.c()     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            r10 = 0
            r9.c = r10     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
        L_0x02d9:
            aucj r10 = r9.b     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            aqvc r10 = (defpackage.aqvc) r10     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            r4.getClass()     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            r10.b = r4     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            aucj r4 = r9.i()     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            r12 = r4
            aqvc r12 = (defpackage.aqvc) r12     // Catch:{ eif -> 0x036f, xya -> 0x036d, babk -> 0x036b }
            yav r4 = r5.d     // Catch:{ eif -> 0x034a, babk -> 0x0348, xya -> 0x036d }
            r4.a()     // Catch:{ eif -> 0x034a, babk -> 0x0348, xya -> 0x036d }
            xpp r4 = r5.b     // Catch:{ eif -> 0x034a, babk -> 0x0348, xya -> 0x036d }
            com.google.android.gms.common.internal.ClientContext r11 = r5.a     // Catch:{ eif -> 0x034a, babk -> 0x0348, xya -> 0x036d }
            xpo r9 = r4.b     // Catch:{ eif -> 0x0338, babk -> 0x0336, xya -> 0x036d }
            int r4 = r4.a     // Catch:{ eif -> 0x0338, babk -> 0x0336, xya -> 0x036d }
            long r13 = (long) r4     // Catch:{ eif -> 0x0338, babk -> 0x0336, xya -> 0x036d }
            baaj r4 = defpackage.xpo.j     // Catch:{ eif -> 0x0338, babk -> 0x0336, xya -> 0x036d }
            if (r4 == 0) goto L_0x02fe
            r18 = r2
            goto L_0x0316
        L_0x02fe:
            baai r4 = defpackage.baai.UNARY     // Catch:{ eif -> 0x0338, babk -> 0x0336, xya -> 0x036d }
            java.lang.String r10 = "google.internal.people.v2.InternalPeopleService/DeletePersonPhoto"
            aqvc r15 = defpackage.aqvc.c     // Catch:{ eif -> 0x0338, babk -> 0x0336, xya -> 0x036d }
            baah r15 = defpackage.baoq.a(r15)     // Catch:{ eif -> 0x0338, babk -> 0x0336, xya -> 0x036d }
            aqvd r16 = defpackage.aqvd.a     // Catch:{ eif -> 0x0338, babk -> 0x0336, xya -> 0x036d }
            r18 = r2
            baah r2 = defpackage.baoq.a(r16)     // Catch:{ eif -> 0x0334, babk -> 0x0332, xya -> 0x0364 }
            baaj r2 = defpackage.baaj.a(r4, r10, r15, r2)     // Catch:{ eif -> 0x0334, babk -> 0x0332, xya -> 0x0364 }
            defpackage.xpo.j = r2     // Catch:{ eif -> 0x0334, babk -> 0x0332, xya -> 0x0364 }
        L_0x0316:
            izd r9 = r9.a     // Catch:{ eif -> 0x0334, babk -> 0x0332, xya -> 0x0364 }
            baaj r10 = defpackage.xpo.j     // Catch:{ eif -> 0x0334, babk -> 0x0332, xya -> 0x0364 }
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ eif -> 0x0334, babk -> 0x0332, xya -> 0x0364 }
            java.lang.Object r2 = r9.a(r10, r11, r12, r13, r15)     // Catch:{ eif -> 0x0334, babk -> 0x0332, xya -> 0x0364 }
            aqvd r2 = (defpackage.aqvd) r2     // Catch:{ eif -> 0x0334, babk -> 0x0332, xya -> 0x0364 }
            yav r4 = r5.d     // Catch:{ eif -> 0x0346, babk -> 0x0344, xya -> 0x0364 }
            java.lang.String r5 = "FSA_deletePersonPhoto"
            int r2 = defpackage.xxa.a(r2)     // Catch:{ eif -> 0x0346, babk -> 0x0344, xya -> 0x0364 }
            r9 = 1
            r4.a(r5, r9, r2)     // Catch:{ eif -> 0x0346, babk -> 0x0344, xya -> 0x0364 }
            android.os.SystemClock.elapsedRealtime()
            goto L_0x0386
        L_0x0332:
            r0 = move-exception
            goto L_0x033b
        L_0x0334:
            r0 = move-exception
            goto L_0x033b
        L_0x0336:
            r0 = move-exception
            goto L_0x0339
        L_0x0338:
            r0 = move-exception
        L_0x0339:
            r18 = r2
        L_0x033b:
            r2 = r0
            java.lang.String r4 = "InternalPeopleServiceGrpcClient"
            java.lang.String r5 = "Error making Grpc request."
            android.util.Log.e(r4, r5, r2)     // Catch:{ eif -> 0x0346, babk -> 0x0344, xya -> 0x0364 }
            throw r2     // Catch:{ eif -> 0x0346, babk -> 0x0344, xya -> 0x0364 }
        L_0x0344:
            r0 = move-exception
            goto L_0x034d
        L_0x0346:
            r0 = move-exception
            goto L_0x034d
        L_0x0348:
            r0 = move-exception
            goto L_0x034b
        L_0x034a:
            r0 = move-exception
        L_0x034b:
            r18 = r2
        L_0x034d:
            r2 = r0
            java.lang.String r4 = "deletePersonPhoto() failed."
            android.util.Log.e(r8, r4, r2)     // Catch:{ eif -> 0x0366, xya -> 0x0364, babk -> 0x0362 }
            throw r2     // Catch:{ eif -> 0x0366, xya -> 0x0364, babk -> 0x0362 }
        L_0x0354:
            r18 = r2
            java.lang.String r2 = "deletePersonPhoto() failed since contactID was null."
            android.util.Log.e(r8, r2)     // Catch:{ eif -> 0x0366, xya -> 0x0364, babk -> 0x0362 }
            xya r2 = new xya     // Catch:{ eif -> 0x0366, xya -> 0x0364, babk -> 0x0362 }
            r4 = 2
            r2.<init>(r4)     // Catch:{ eif -> 0x0366, xya -> 0x0364, babk -> 0x0362 }
            throw r2     // Catch:{ eif -> 0x0366, xya -> 0x0364, babk -> 0x0362 }
        L_0x0362:
            r0 = move-exception
            goto L_0x0372
        L_0x0364:
            r0 = move-exception
            goto L_0x0372
        L_0x0366:
            r0 = move-exception
            goto L_0x0372
        L_0x0368:
            r0 = move-exception
            r2 = r0
            goto L_0x0392
        L_0x036b:
            r0 = move-exception
            goto L_0x0370
        L_0x036d:
            r0 = move-exception
            goto L_0x0370
        L_0x036f:
            r0 = move-exception
        L_0x0370:
            r18 = r2
        L_0x0372:
            r11 = r0
            xjo r9 = defpackage.xjo.PHOTO     // Catch:{ all -> 0x0368 }
            xnd r10 = defpackage.xnd.REMOVE     // Catch:{ all -> 0x0368 }
            yaz r12 = r1.c     // Catch:{ all -> 0x0368 }
            r8 = 0
            r13 = 1
            xnd r2 = defpackage.xyi.a(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0368 }
            xnd r4 = defpackage.xnd.REMOVE     // Catch:{ all -> 0x0368 }
            android.os.SystemClock.elapsedRealtime()
            if (r2 != r4) goto L_0x038e
        L_0x0386:
            r20.a()
            android.content.ContentProviderOperation$Builder r5 = defpackage.xwc.a(r6)
            goto L_0x03eb
        L_0x038e:
            r2 = r18
            goto L_0x0006
        L_0x0392:
            android.os.SystemClock.elapsedRealtime()
            throw r2
        L_0x0396:
            r0 = move-exception
            r18 = r2
            r6 = r0
            r5 = 0
        L_0x039b:
            if (r5 == 0) goto L_0x03a0
            r5.close()     // Catch:{ IOException -> 0x03a1 }
        L_0x03a0:
            throw r6     // Catch:{ IOException -> 0x03a1 }
        L_0x03a1:
            r0 = move-exception
            goto L_0x03a6
        L_0x03a3:
            r0 = move-exception
            r18 = r2
        L_0x03a6:
            r2 = r0
            xnd r5 = defpackage.xnd.UPDATE
            r6 = 1
            r1.a(r5, r6)
            xnd r5 = defpackage.xnd.UPDATE
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            xnd r6 = defpackage.xnd.UPDATE
            if (r5 == r6) goto L_0x03b9
            java.lang.String r6 = "delete"
            goto L_0x03bb
        L_0x03b9:
            java.lang.String r6 = "update"
        L_0x03bb:
            r8 = 0
            r7[r8] = r6
            r6 = 1
            r7[r6] = r4
            java.lang.String r4 = "%s photo for contactId=%s failed."
            java.lang.String r4 = java.lang.String.format(r4, r7)
            android.util.Log.e(r3, r4, r2)
            yaz r4 = r1.c
            xjo r6 = defpackage.xjo.PHOTO
            java.lang.String r7 = "IO_EXCEPTION"
            r4.a((defpackage.xjo) r6, (defpackage.xnd) r5, (java.lang.String) r7, (java.lang.Exception) r2)
            r2 = 2
            r1.a(r5, r2)
            yaz r2 = r1.c
            ybh r2 = (defpackage.ybh) r2
            android.content.SyncResult r2 = r2.a
            android.content.SyncStats r2 = r2.stats
            long r4 = r2.numIoExceptions
            r6 = 1
            long r4 = r4 + r6
            r2.numIoExceptions = r4
            r2 = r18
            goto L_0x0006
        L_0x03ea:
            r5 = 0
        L_0x03eb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwf.b():java.lang.Object");
    }

    private final void a() {
        if (this.f.a()) {
            xip.a();
            if (((Boolean) xgn.a.a()).booleanValue()) {
                ((xxj) this.f.b()).e(1);
            }
        }
    }

    private final void a(xnd xnd, int i) {
        this.c.a(xnd, xjo.PHOTO, false, i, 1);
    }
}
