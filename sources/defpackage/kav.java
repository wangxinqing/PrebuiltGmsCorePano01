package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: kav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kav extends kad {
    private static final ith i = new ith("CreateFileAction", "");
    public Long h;
    private final String j;

    public kav(kkz kkz, AppIdentity appIdentity, String str, MetadataBundle metadataBundle, DriveId driveId, kdo kdo) {
        super(kaj.CREATE_FILE, kkz, appIdentity, metadataBundle, driveId, kdo);
        this.j = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: kkf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: kkf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: kkf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: khq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: java.util.concurrent.atomic.AtomicBoolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x023e, code lost:
        throw new defpackage.kcp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x023f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0240, code lost:
        r13 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0242, code lost:
        r13 = r3;
        i.c(r15, "Unexpected UploadConflictException", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0250, code lost:
        throw new defpackage.kcn(r14, r0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0251, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0252, code lost:
        r14 = "Upload failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x025b, code lost:
        r0 = th;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0262, code lost:
        if (r13.compareAndSet(true, false) != false) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0264, code lost:
        r11.a(r12.a());
        r11.a((java.util.List) r12.e());
        r11.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0276, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b3, code lost:
        r3 = r29;
        r14 = r18;
        r15 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00be, code lost:
        r13 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c3, code lost:
        r3 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ce, code lost:
        r13 = r29;
        r14 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0190, code lost:
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0193, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0194, code lost:
        r14 = "Upload failed";
        r3 = r9;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a4, code lost:
        throw new defpackage.kcn(r14, r0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ab, code lost:
        throw ((defpackage.kcn) r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ac, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ad, code lost:
        r14 = "Upload failed";
        r15 = "CreateFileAction";
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b2, code lost:
        defpackage.iva.a(r(), (java.lang.Object) "Conflict should only happen while creating a singleton file");
        r0 = r1.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c1, code lost:
        if (b() == false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c3, code lost:
        a(r0.d, r26, r0.i.a(r2, (java.lang.String) r10.e.a(defpackage.lce.E), r26.ai()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01de, code lost:
        r13 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ee, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        a(r22, r23, r24, r26, false, r28, r29);
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f7, code lost:
        if (r13.compareAndSet(true, false) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01fc, code lost:
        r6 = r26;
        r13 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r5 = r23;
        r0.z.a(r5, (java.lang.String) r10.e.a(defpackage.lce.E), r26.ai(), new defpackage.lnk(302, 2, false, true));
        r0 = r0.d;
        r7 = r10.b;
        r8 = r24;
        defpackage.lrt.b(r0, r7, r8, false);
        defpackage.lrt.a(r0, r7, r26.a(), r24, false);
        defpackage.kbc.a(r0, r7, r8, false);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0242 A[Catch:{ InterruptedException -> 0x0251, kji -> 0x01ac, kjj -> 0x0193, all -> 0x018f, all -> 0x023f, all -> 0x025b }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bd A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c2 A[ExcHandler: kjj (e kjj), Splitter:B:10:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cd A[ExcHandler: InterruptedException (e java.lang.InterruptedException), Splitter:B:10:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x019e A[Catch:{ InterruptedException -> 0x0251, kji -> 0x01ac, kjj -> 0x0193, all -> 0x018f, all -> 0x023f, all -> 0x025b }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01a5 A[Catch:{ InterruptedException -> 0x0251, kji -> 0x01ac, kjj -> 0x0193, all -> 0x018f, all -> 0x023f, all -> 0x025b }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b2 A[Catch:{ InterruptedException -> 0x0251, kji -> 0x01ac, kjj -> 0x0193, all -> 0x018f, all -> 0x023f, all -> 0x025b }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x0173=Splitter:B:60:0x0173, B:53:0x0155=Splitter:B:53:0x0155} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.google.android.gms.common.internal.ClientContext r22, defpackage.khq r23, long r24, defpackage.kmp r26, boolean r27, defpackage.kan r28, java.util.concurrent.atomic.AtomicBoolean r29) {
        /*
            r21 = this;
            r10 = r21
            r2 = r22
            r3 = r23
            r7 = r24
            r1 = r28
            r9 = r29
            java.lang.String r6 = "CreateFileAction"
            java.lang.String r5 = "Upload failed"
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r10.e
            com.google.android.gms.drive.internal.model.File r0 = defpackage.lbb.a((com.google.android.gms.drive.metadata.internal.MetadataBundle) r0)
            boolean r4 = r21.r()
            if (r4 != 0) goto L_0x001d
            goto L_0x0034
        L_0x001d:
            if (r27 == 0) goto L_0x0034
            com.google.android.gms.drive.metadata.internal.MetadataBundle r4 = r10.e
            kyq r11 = defpackage.lce.E
            java.lang.Object r4 = r4.a((defpackage.kyq) r11)
            java.lang.String r4 = (java.lang.String) r4
            boolean r11 = r26.ai()
            com.google.android.gms.drive.internal.model.FileLocalId r4 = defpackage.lnn.a((java.lang.String) r4, (boolean) r11)
            r0.a((com.google.android.gms.drive.internal.model.FileLocalId) r4)
        L_0x0034:
            lsm r4 = r1.a
            java.lang.Long r11 = r10.h
            long r13 = r11.longValue()
            r15 = 0
            java.lang.String r16 = r0.toString()
            r0 = 409(0x199, float:5.73E-43)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
            com.google.android.gms.drive.metadata.internal.MetadataBundle r0 = r10.e
            lby r11 = defpackage.lce.N
            java.lang.Object r0 = r0.a((defpackage.kyq) r11)
            java.lang.String r0 = (java.lang.String) r0
            lbq r20 = defpackage.lbq.a(r0)
            r11 = r26
            r12 = r4
            r17 = r27
            r18 = r23
            kjl r0 = defpackage.kjl.a(r11, r12, r13, r15, r16, r17, r18, r19, r20)
            lfq r11 = r1.d
            lfp r11 = r11.f()
            kjn r12 = r4.u
            kjm r12 = r12.a(r0, r4, r11)
            long r13 = r0.e
            r11.a((long) r13)
            lic r0 = r1.c     // Catch:{ InterruptedException -> 0x0251, kji -> 0x01ac, kjj -> 0x0193, all -> 0x018f }
            kjk r15 = r28.a()     // Catch:{ InterruptedException -> 0x0251, kji -> 0x01ac, kjj -> 0x0193, all -> 0x018f }
            lnj r15 = r12.a(r15, r0, r2)     // Catch:{ InterruptedException -> 0x0251, kji -> 0x01ac, kjj -> 0x0193, all -> 0x018f }
            kkf r4 = r4.d     // Catch:{ InterruptedException -> 0x0251, kji -> 0x01ac, kjj -> 0x0193, all -> 0x018f }
            java.lang.String r13 = r3.b     // Catch:{ InterruptedException -> 0x0251, kji -> 0x01ac, kjj -> 0x0193, all -> 0x018f }
            java.lang.String r14 = r15.g()     // Catch:{ InterruptedException -> 0x0251, kji -> 0x01ac, kjj -> 0x0193, all -> 0x018f }
            r18 = r5
            java.lang.String r5 = r15.K()     // Catch:{ InterruptedException -> 0x018a, kji -> 0x0184, kjj -> 0x017f, all -> 0x018f }
            r4.d()     // Catch:{ InterruptedException -> 0x018a, kji -> 0x0184, kjj -> 0x017f, all -> 0x018f }
            kkz r0 = r10.b     // Catch:{ kcs -> 0x00d4, InterruptedException -> 0x00cd, kji -> 0x00c7, kjj -> 0x00c2, all -> 0x00bd }
            khq r0 = defpackage.khq.a((defpackage.kkz) r0)     // Catch:{ kcs -> 0x00d4, InterruptedException -> 0x00cd, kji -> 0x00c7, kjj -> 0x00c2, all -> 0x00bd }
            kmp r0 = r4.a((defpackage.khq) r0, (java.lang.String) r14)     // Catch:{ kcs -> 0x00d4, InterruptedException -> 0x00cd, kji -> 0x00c7, kjj -> 0x00c2, all -> 0x00bd }
            boolean r19 = r21.r()     // Catch:{ kcs -> 0x00d4, InterruptedException -> 0x00cd, kji -> 0x00c7, kjj -> 0x00c2, all -> 0x00bd }
            defpackage.iva.a((boolean) r19)     // Catch:{ kcs -> 0x00d4, InterruptedException -> 0x00cd, kji -> 0x00c7, kjj -> 0x00c2, all -> 0x00bd }
            r19 = r6
            knc r6 = r0.a()     // Catch:{ kcs -> 0x00bb, InterruptedException -> 0x00cd, kji -> 0x00b2, kjj -> 0x00c2, all -> 0x00bd }
            knc r9 = r21.s()     // Catch:{ kcs -> 0x00bb, InterruptedException -> 0x00cd, kji -> 0x00b2, kjj -> 0x00c2, all -> 0x00bd }
            boolean r6 = r6.equals(r9)     // Catch:{ kcs -> 0x00bb, InterruptedException -> 0x00cd, kji -> 0x00b2, kjj -> 0x00c2, all -> 0x00bd }
            if (r6 == 0) goto L_0x00ae
            goto L_0x00d7
        L_0x00ae:
            r0.ao()     // Catch:{ kcs -> 0x00bb, InterruptedException -> 0x00cd, kji -> 0x00b2, kjj -> 0x00c2, all -> 0x00bd }
            goto L_0x00d7
        L_0x00b2:
            r0 = move-exception
            r3 = r29
            r14 = r18
            r15 = r19
            goto L_0x01b0
        L_0x00bb:
            r0 = move-exception
            goto L_0x00d7
        L_0x00bd:
            r0 = move-exception
            r13 = r29
            goto L_0x025c
        L_0x00c2:
            r0 = move-exception
            r3 = r29
            goto L_0x0181
        L_0x00c7:
            r0 = move-exception
            r3 = r29
            r15 = r6
            goto L_0x0187
        L_0x00cd:
            r0 = move-exception
            r13 = r29
            r14 = r18
            goto L_0x0254
        L_0x00d4:
            r0 = move-exception
            r19 = r6
        L_0x00d7:
            kkz r0 = r10.b     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            khq r0 = defpackage.khq.a((defpackage.kkz) r0)     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            knc r6 = r21.s()     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            kmp r0 = r4.a((defpackage.khq) r0, (defpackage.knc) r6)     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            r10.a(r4, r0, r14)     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            boolean r6 = r21.r()     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            if (r6 == 0) goto L_0x0101
            agvx r6 = defpackage.jzq.aA     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            java.lang.Object r6 = r6.c()     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            if (r9 != 0) goto L_0x00fd
            goto L_0x00fe
        L_0x00fd:
            r6 = 0
        L_0x00fe:
            r0.d((java.lang.String) r6)     // Catch:{ kcs -> 0x0146, all -> 0x013d }
        L_0x0101:
            if (r5 == 0) goto L_0x010d
            java.lang.String r6 = r10.j     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            r0.b(r6, r5)     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            r5 = 1
            r0.g((boolean) r5)     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            goto L_0x0110
        L_0x010d:
            r0.m()     // Catch:{ kcs -> 0x0146, all -> 0x013d }
        L_0x0110:
            defpackage.kju.a((defpackage.kkf) r4, (defpackage.lnj) r15, (defpackage.kmp) r0, (java.lang.String) r13)     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            r0.M()     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            r5 = 0
            r0.n(r5)     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            kkz r6 = r10.b     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            defpackage.lrt.a((defpackage.kkf) r4, (defpackage.kkz) r6, (long) r7, (boolean) r5)     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            kkz r5 = r10.b     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            defpackage.lrt.a(r4, r5, r7)     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            kkz r5 = r10.b     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            knc r6 = r0.a()     // Catch:{ kcs -> 0x0146, all -> 0x013d }
            r9 = 0
            r13 = r4
            r14 = r18
            r15 = r19
            r7 = r24
            r3 = r29
            defpackage.lrt.a(r4, r5, r6, r7, r9)     // Catch:{ kcs -> 0x013b }
            r13.f()     // Catch:{ kcs -> 0x013b }
            goto L_0x0155
        L_0x013b:
            r0 = move-exception
            goto L_0x014e
        L_0x013d:
            r0 = move-exception
            r3 = r29
            r13 = r4
            r14 = r18
            r15 = r19
            goto L_0x0173
        L_0x0146:
            r0 = move-exception
            r3 = r29
            r13 = r4
            r14 = r18
            r15 = r19
        L_0x014e:
            ith r4 = i     // Catch:{ all -> 0x0172 }
            java.lang.String r5 = "Unable to retrieve entry."
            r4.c(r15, r5, r0)     // Catch:{ all -> 0x0172 }
        L_0x0155:
            r13.e()     // Catch:{ InterruptedException -> 0x017b, kji -> 0x0179, kjj -> 0x0177 }
            r1 = 0
            r2 = 1
            boolean r0 = r3.compareAndSet(r2, r1)
            if (r0 == 0) goto L_0x01fb
        L_0x0160:
            int r0 = r12.a()
            r11.a((int) r0)
            amzy r0 = r12.e()
            r11.a((java.util.List) r0)
            r11.b()
            return
        L_0x0172:
            r0 = move-exception
        L_0x0173:
            r13.e()     // Catch:{ InterruptedException -> 0x017b, kji -> 0x0179, kjj -> 0x0177 }
            throw r0     // Catch:{ InterruptedException -> 0x017b, kji -> 0x0179, kjj -> 0x0177 }
        L_0x0177:
            r0 = move-exception
            goto L_0x0196
        L_0x0179:
            r0 = move-exception
            goto L_0x01b0
        L_0x017b:
            r0 = move-exception
            r13 = r3
            goto L_0x0254
        L_0x017f:
            r0 = move-exception
            r3 = r9
        L_0x0181:
            r14 = r18
            goto L_0x0196
        L_0x0184:
            r0 = move-exception
            r15 = r6
            r3 = r9
        L_0x0187:
            r14 = r18
            goto L_0x01b0
        L_0x018a:
            r0 = move-exception
            r14 = r18
            goto L_0x0253
        L_0x018f:
            r0 = move-exception
            r13 = r9
            goto L_0x025c
        L_0x0193:
            r0 = move-exception
            r14 = r5
            r3 = r9
        L_0x0196:
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ all -> 0x023f }
            boolean r1 = r1 instanceof defpackage.kcn     // Catch:{ all -> 0x023f }
            if (r1 != 0) goto L_0x01a5
            kcn r1 = new kcn     // Catch:{ all -> 0x023f }
            r2 = 1
            r1.<init>(r14, r0, r2)     // Catch:{ all -> 0x023f }
            throw r1     // Catch:{ all -> 0x023f }
        L_0x01a5:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x023f }
            kcn r0 = (defpackage.kcn) r0     // Catch:{ all -> 0x023f }
            throw r0     // Catch:{ all -> 0x023f }
        L_0x01ac:
            r0 = move-exception
            r14 = r5
            r15 = r6
            r3 = r9
        L_0x01b0:
            if (r27 == 0) goto L_0x0242
            boolean r0 = r21.r()     // Catch:{ all -> 0x023f }
            java.lang.String r4 = "Conflict should only happen while creating a singleton file"
            defpackage.iva.a((boolean) r0, (java.lang.Object) r4)     // Catch:{ all -> 0x023f }
            lsm r0 = r1.a     // Catch:{ all -> 0x023f }
            boolean r4 = r21.b()     // Catch:{ all -> 0x023f }
            if (r4 != 0) goto L_0x01fc
            lnn r4 = r0.i     // Catch:{ all -> 0x023f }
            com.google.android.gms.drive.metadata.internal.MetadataBundle r5 = r10.e     // Catch:{ all -> 0x023f }
            kyq r6 = defpackage.lce.E     // Catch:{ all -> 0x023f }
            java.lang.Object r5 = r5.a((defpackage.kyq) r6)     // Catch:{ all -> 0x023f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x023f }
            boolean r6 = r26.ai()     // Catch:{ all -> 0x023f }
            java.lang.String r4 = r4.a((com.google.android.gms.common.internal.ClientContext) r2, (java.lang.String) r5, (boolean) r6)     // Catch:{ all -> 0x023f }
            kkf r0 = r0.d     // Catch:{ all -> 0x023f }
            r6 = r26
            r10.a(r0, r6, r4)     // Catch:{ all -> 0x023f }
            r7 = 0
            r1 = r21
            r2 = r22
            r13 = r3
            r3 = r23
            r4 = r24
            r6 = r26
            r8 = r28
            r9 = r29
            r1.a(r2, r3, r4, r6, r7, r8, r9)     // Catch:{ all -> 0x025b }
            r1 = 0
            r2 = 1
            boolean r0 = r13.compareAndSet(r2, r1)
            if (r0 == 0) goto L_0x01fb
            goto L_0x0160
        L_0x01fb:
            return
        L_0x01fc:
            r6 = r26
            r13 = r3
            lnk r1 = new lnk     // Catch:{ all -> 0x025b }
            r2 = 302(0x12e, float:4.23E-43)
            r3 = 2
            r4 = 0
            r5 = 1
            r1.<init>(r2, r3, r4, r5)     // Catch:{ all -> 0x025b }
            lel r2 = r0.z     // Catch:{ all -> 0x025b }
            com.google.android.gms.drive.metadata.internal.MetadataBundle r3 = r10.e     // Catch:{ all -> 0x025b }
            kyq r4 = defpackage.lce.E     // Catch:{ all -> 0x025b }
            java.lang.Object r3 = r3.a((defpackage.kyq) r4)     // Catch:{ all -> 0x025b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x025b }
            boolean r4 = r26.ai()     // Catch:{ all -> 0x025b }
            r5 = r23
            r2.a(r5, r3, r4, r1)     // Catch:{ all -> 0x025b }
            kkf r0 = r0.d     // Catch:{ all -> 0x025b }
            kkz r7 = r10.b     // Catch:{ all -> 0x025b }
            r8 = r24
            r1 = 0
            defpackage.lrt.b(r0, r7, r8, r1)     // Catch:{ all -> 0x025b }
            knc r3 = r26.a()     // Catch:{ all -> 0x025b }
            r6 = 0
            r1 = r0
            r2 = r7
            r4 = r24
            defpackage.lrt.a(r1, r2, r3, r4, r6)     // Catch:{ all -> 0x025b }
            r1 = 0
            defpackage.kbc.a(r0, r7, r8, r1)     // Catch:{ all -> 0x025b }
            kcp r0 = new kcp     // Catch:{ all -> 0x025b }
            r0.<init>()     // Catch:{ all -> 0x025b }
            throw r0     // Catch:{ all -> 0x025b }
        L_0x023f:
            r0 = move-exception
            r13 = r3
            goto L_0x025c
        L_0x0242:
            r13 = r3
            ith r1 = i     // Catch:{ all -> 0x025b }
            java.lang.String r2 = "Unexpected UploadConflictException"
            r1.c(r15, r2, r0)     // Catch:{ all -> 0x025b }
            kcn r1 = new kcn     // Catch:{ all -> 0x025b }
            r2 = 1
            r1.<init>(r14, r0, r2)     // Catch:{ all -> 0x025b }
            throw r1     // Catch:{ all -> 0x025b }
        L_0x0251:
            r0 = move-exception
            r14 = r5
        L_0x0253:
            r13 = r9
        L_0x0254:
            kcn r1 = new kcn     // Catch:{ all -> 0x025b }
            r2 = 1
            r1.<init>(r14, r0, r2)     // Catch:{ all -> 0x025b }
            throw r1     // Catch:{ all -> 0x025b }
        L_0x025b:
            r0 = move-exception
        L_0x025c:
            r1 = 0
            r2 = 1
            boolean r1 = r13.compareAndSet(r2, r1)
            if (r1 == 0) goto L_0x0275
            int r1 = r12.a()
            r11.a((int) r1)
            amzy r1 = r12.e()
            r11.a((java.util.List) r1)
            r11.b()
        L_0x0275:
            goto L_0x0277
        L_0x0276:
            throw r0
        L_0x0277:
            goto L_0x0276
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kav.a(com.google.android.gms.common.internal.ClientContext, khq, long, kmp, boolean, kan, java.util.concurrent.atomic.AtomicBoolean):void");
    }

    /* access modifiers changed from: protected */
    public final String e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kav kav = (kav) obj;
            return a((kac) kav) && ius.a(this.j, kav.j) && ius.a(this.h, kav.h);
        }
    }

    /* access modifiers changed from: protected */
    public final MetadataBundle f() {
        return this.e;
    }

    public final JSONObject h() {
        JSONObject h2 = super.h();
        h2.put("contentId", this.j);
        h2.putOpt("pendingUploadSqlId", this.h);
        return h2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(n()), this.j, this.h});
    }

    public final boolean j() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean o() {
        return true;
    }

    public final String toString() {
        return String.format(Locale.US, "CreateFileAction[%s, pendingUploadSqlId=%d, contentHash=%s]", new Object[]{m(), this.h, this.j});
    }

    public kav(kkz kkz, JSONObject jSONObject) {
        super(kaj.CREATE_FILE, kkz, jSONObject);
        this.j = jSONObject.getString("contentId");
        if (jSONObject.has("pendingUploadSqlId")) {
            this.h = Long.valueOf(Long.parseLong(jSONObject.getString("pendingUploadSqlId")));
        }
    }

    /* access modifiers changed from: protected */
    public final String a(khq khq) {
        return (String) this.e.a((kyq) lce.N);
    }

    /* access modifiers changed from: protected */
    public final void a(kam kam, kmp kmp) {
        boolean z;
        kkf kkf = kam.a;
        knh d = kkf.d(this.j);
        if (d != null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, "Content does not exist: %s", this.j);
        kmp.a(d.f);
        kor a = kkf.a(this.j, (String) null, kam.b, kmp.a());
        String str = this.j;
        kmp.c(str, lru.b(str));
        kmp.b(Long.valueOf(kam.b));
        this.h = Long.valueOf(a.m);
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext) {
        p();
        kkf kkf = kan.a.d;
        khq d = d(kkf);
        kmp a = kkf.a(d, s());
        try {
            a(clientContext, d, kan.b, a, true, kan, new AtomicBoolean(true));
            kmp a2 = kkf.a(khq.a(this.b), s());
            if (a2 != null) {
                kan.d.a(a2);
            }
        } catch (Throwable th) {
            kmp a3 = kkf.a(khq.a(this.b), s());
            if (a3 != null) {
                kan.d.a(a3);
            }
            throw th;
        }
    }
}
