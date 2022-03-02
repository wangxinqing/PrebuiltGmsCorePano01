package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: trm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class trm implements tny {
    public final tob a;
    public final aoru b = tid.b();
    public final aoru c = tid.b();
    public final trl d = new trl();
    public final tol e;
    public final tkz f;

    public trm(Context context, tob tob) {
        tol tol = new tol(new tnf(context));
        tkz tkz = new tkz("sendPayload");
        this.a = tob;
        this.e = tol;
        tob.a(asav.PAYLOAD_TRANSFER, (tny) this);
        this.f = tkz;
    }

    public static int a(asog asog) {
        tri tri = tri.UNKNOWN;
        asal asal = asal.UNKNOWN_EVENT_TYPE;
        asao asao = asao.UNKNOWN_PACKET_TYPE;
        asog asog2 = asog.UNKNOWN_PAYLOAD_STATUS;
        int ordinal = asog.ordinal();
        if (ordinal != 1) {
            return (ordinal == 7 || ordinal == 8) ? 4 : 2;
        }
        return 1;
    }

    public static boolean a(asap asap) {
        return (asap.b & 1) != 0;
    }

    public final void b(tlh tlh, String[] strArr, ParcelablePayload parcelablePayload) {
        a((Runnable) new trf(this, tlh, strArr, parcelablePayload));
    }

    private static asog a(asal asal) {
        tri tri = tri.UNKNOWN;
        asal asal2 = asal.UNKNOWN_EVENT_TYPE;
        asao asao = asao.UNKNOWN_PACKET_TYPE;
        asog asog = asog.UNKNOWN_PAYLOAD_STATUS;
        int ordinal = asal.ordinal();
        if (ordinal == 1) {
            return asog.REMOTE_ERROR;
        }
        if (ordinal == 2) {
            return asog.REMOTE_CANCELLATION;
        }
        ((anih) tky.a.d()).a("Unknown PayloadStatus for ControlMessage.EventType %s!", (Object) asal);
        return asog.UNKNOWN_PAYLOAD_STATUS;
    }

    private final void a(List list, asas asas, long j, asal asal) {
        asas asas2 = asas;
        aucd o = asam.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        asam asam = (asam) o.b;
        asam.b = asal.d;
        int i = asam.a | 1;
        asam.a = i;
        asam.a = i | 2;
        asam.c = j;
        asam asam2 = (asam) o.i();
        tob tob = this.a;
        aucd o2 = asat.f.o();
        asao asao = asao.CONTROL;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        asat asat = (asat) o2.b;
        asat.b = asao.d;
        int i2 = asat.a | 1;
        asat.a = i2;
        asas.getClass();
        asat.c = asas2;
        int i3 = i2 | 2;
        asat.a = i3;
        asam2.getClass();
        asat.e = asam2;
        asat.a = i3 | 8;
        tob.a(list, tpk.a(asav.PAYLOAD_TRANSFER, (audx) o2.i()).k(), asas2.b, asam2.c, "CONTROL");
    }

    private final void a(tlh tlh, String str, asas asas, long j, asog asog) {
        a((Runnable) new trc(this, asas, asog, j, tlh, str));
        tri tri = tri.UNKNOWN;
        asal asal = asal.UNKNOWN_EVENT_TYPE;
        asao asao = asao.UNKNOWN_PACKET_TYPE;
        asog asog2 = asog.UNKNOWN_PAYLOAD_STATUS;
        int ordinal = asog.ordinal();
        if (ordinal == 2) {
            asas asas2 = asas;
            long j2 = j;
            a((List) anda.a((Object[]) new String[]{str}), asas2, j2, asal.PAYLOAD_ERROR);
        } else if (ordinal != 7) {
            ((anih) tky.a.d()).a("Unhandled finished incoming payload %d with status %s!", asas.b, (Object) asog);
        } else {
            asas asas3 = asas;
            long j3 = j;
            a((List) anda.a((Object[]) new String[]{str}), asas3, j3, asal.PAYLOAD_CANCELED);
        }
    }

    /* JADX WARNING: type inference failed for: r3v16, types: [asao] */
    /* JADX WARNING: type inference failed for: r3v17, types: [asao] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.asai r17, java.lang.String r18, defpackage.tlh r19, defpackage.asoe r20) {
        /*
            r16 = this;
            r8 = r16
            r6 = r18
            r5 = r19
            r0 = r17
            asaw r0 = r0.c
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            asaw r0 = defpackage.asaw.j
        L_0x000f:
            asat r0 = r0.e
            if (r0 == 0) goto L_0x0015
            r1 = r0
            goto L_0x0018
        L_0x0015:
            asat r0 = defpackage.asat.f
            r1 = r0
        L_0x0018:
            tri r0 = defpackage.tri.UNKNOWN
            asal r0 = defpackage.asal.UNKNOWN_EVENT_TYPE
            asao r0 = defpackage.asao.UNKNOWN_PACKET_TYPE
            asog r0 = defpackage.asog.UNKNOWN_PAYLOAD_STATUS
            int r0 = r1.b
            asao r0 = defpackage.asao.a(r0)
            if (r0 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            asao r0 = defpackage.asao.UNKNOWN_PACKET_TYPE
        L_0x002b:
            int r0 = r0.ordinal()
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == r4) goto L_0x00f0
            if (r0 == r2) goto L_0x0054
            jjg r0 = defpackage.tky.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            int r2 = r1.a
            r2 = r2 & r4
            if (r2 == 0) goto L_0x004d
            int r1 = r1.b
            asao r3 = defpackage.asao.a(r1)
            if (r3 != 0) goto L_0x004d
            asao r3 = defpackage.asao.UNKNOWN_PACKET_TYPE
        L_0x004d:
            java.lang.String r1 = "Unhandled PayloadTransferFrame of type %s!"
            r0.a((java.lang.String) r1, (java.lang.Object) r3)
            return
        L_0x0054:
            asas r0 = r1.c
            if (r0 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            asas r0 = defpackage.asas.e
        L_0x005b:
            asam r1 = r1.e
            if (r1 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            asam r1 = defpackage.asam.d
        L_0x0062:
            trl r3 = r8.d
            long r9 = r0.b
            trk r3 = r3.a(r9)
            if (r3 != 0) goto L_0x007c
            jjg r2 = defpackage.tky.a
            anie r2 = r2.d()
            anih r2 = (defpackage.anih) r2
            long r3 = r0.b
            java.lang.String r0 = "Got ControlMessage for unknown payload %d, ignoring: %s"
            r2.a((java.lang.String) r0, (long) r3, (java.lang.Object) r1)
            return
        L_0x007c:
            int r7 = r1.b
            asal r7 = defpackage.asal.a(r7)
            if (r7 != 0) goto L_0x0086
            asal r7 = defpackage.asal.UNKNOWN_EVENT_TYPE
        L_0x0086:
            int r7 = r7.ordinal()
            if (r7 == r4) goto L_0x00cc
            if (r7 == r2) goto L_0x00a6
            jjg r0 = defpackage.tky.a
            anie r0 = r0.d()
            anih r0 = (defpackage.anih) r0
            int r1 = r1.b
            asal r1 = defpackage.asal.a(r1)
            if (r1 != 0) goto L_0x00a0
            asal r1 = defpackage.asal.UNKNOWN_EVENT_TYPE
        L_0x00a0:
            java.lang.String r2 = "Unhandled control message %s for payload %s!"
            r0.a((java.lang.String) r2, (java.lang.Object) r1, (java.lang.Object) r3)
            return
        L_0x00a6:
            boolean r2 = r3.b
            if (r2 == 0) goto L_0x00c6
            long r9 = r1.c
            int r1 = r1.b
            asal r1 = defpackage.asal.a(r1)
            if (r1 != 0) goto L_0x00b6
            asal r1 = defpackage.asal.UNKNOWN_EVENT_TYPE
        L_0x00b6:
            asog r7 = a((defpackage.asal) r1)
            r1 = r16
            r2 = r19
            r3 = r18
            r4 = r0
            r5 = r9
            r1.a((defpackage.tlh) r2, (java.lang.String) r3, (defpackage.asas) r4, (long) r5, (defpackage.asog) r7)
            goto L_0x00c9
        L_0x00c6:
            r3.a((java.lang.String) r6, (defpackage.asam) r1)
        L_0x00c9:
            jjg r0 = defpackage.tky.a
            return
        L_0x00cc:
            boolean r2 = r3.b
            if (r2 == 0) goto L_0x00ec
            long r9 = r1.c
            int r1 = r1.b
            asal r1 = defpackage.asal.a(r1)
            if (r1 != 0) goto L_0x00dc
            asal r1 = defpackage.asal.UNKNOWN_EVENT_TYPE
        L_0x00dc:
            asog r7 = a((defpackage.asal) r1)
            r1 = r16
            r2 = r19
            r3 = r18
            r4 = r0
            r5 = r9
            r1.a((defpackage.tlh) r2, (java.lang.String) r3, (defpackage.asas) r4, (long) r5, (defpackage.asog) r7)
            return
        L_0x00ec:
            r3.a((java.lang.String) r6, (defpackage.asam) r1)
            return
        L_0x00f0:
            asas r0 = r1.c
            if (r0 == 0) goto L_0x00f6
            r7 = r0
            goto L_0x00f9
        L_0x00f6:
            asas r0 = defpackage.asas.e
            r7 = r0
        L_0x00f9:
            asap r0 = r1.d
            if (r0 != 0) goto L_0x0101
            asap r0 = defpackage.asap.e
            r9 = r0
            goto L_0x0102
        L_0x0101:
            r9 = r0
        L_0x0102:
            jjg r0 = defpackage.tky.a
            long r10 = r9.c
            r12 = 0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x02e0
            boolean r0 = a((defpackage.asap) r9)
            if (r0 == 0) goto L_0x0114
            goto L_0x02e0
        L_0x0114:
            tqz r0 = new tqz
            r0.<init>(r5, r6, r7)
            r8.a((java.lang.Runnable) r0)
            tol r0 = r8.e
            int r10 = r1.b
            asao r10 = defpackage.asao.a(r10)
            if (r10 != 0) goto L_0x0128
            asao r10 = defpackage.asao.UNKNOWN_PACKET_TYPE
        L_0x0128:
            asao r11 = defpackage.asao.DATA
            r12 = 3
            r13 = 0
            if (r10 != r11) goto L_0x0271
            asas r10 = r1.c
            if (r10 == 0) goto L_0x0133
            goto L_0x0135
        L_0x0133:
            asas r10 = defpackage.asas.e
        L_0x0135:
            int r10 = r10.c
            int r10 = defpackage.asar.a(r10)
            if (r10 == 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r10 = 1
        L_0x013f:
            int r10 = r10 + -1
            if (r10 == r4) goto L_0x0245
            if (r10 == r2) goto L_0x0190
            if (r10 == r12) goto L_0x014a
            r10 = r3
            goto L_0x0272
        L_0x014a:
            android.os.ParcelFileDescriptor[] r0 = android.os.ParcelFileDescriptor.createPipe()     // Catch:{ IOException -> 0x0172 }
            uil r10 = new uil
            r10.<init>()
            asas r1 = r1.c
            if (r1 == 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            asas r1 = defpackage.asas.e
        L_0x015a:
            long r14 = r1.b
            r10.a((long) r14)
            r10.a((int) r12)
            r1 = r0[r13]
            r10.a((android.os.ParcelFileDescriptor) r1)
            com.google.android.gms.nearby.internal.connection.ParcelablePayload r1 = r10.a
            tof r10 = new tof
            r0 = r0[r4]
            r10.<init>(r1, r0)
            goto L_0x0272
        L_0x0172:
            r0 = move-exception
            r10 = r0
            jjg r0 = defpackage.tky.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r0.a((java.lang.Throwable) r10)
            asas r1 = r1.c
            if (r1 == 0) goto L_0x0184
            goto L_0x0186
        L_0x0184:
            asas r1 = defpackage.asas.e
        L_0x0186:
            long r10 = r1.b
            java.lang.String r1 = "Failed to create InternalPayload %d because unable to create ParcelFileDescriptor pipe."
            r0.a((java.lang.String) r1, (long) r10)
            r10 = r3
            goto L_0x0272
        L_0x0190:
            java.io.File r10 = new java.io.File
            java.lang.String r11 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r11 = android.os.Environment.getExternalStoragePublicDirectory(r11)
            java.lang.String r14 = "Nearby"
            r10.<init>(r11, r14)
            boolean r11 = r10.exists()
            if (r11 == 0) goto L_0x01a4
        L_0x01a3:
            goto L_0x01c3
        L_0x01a4:
            boolean r11 = r10.mkdirs()
            if (r11 != 0) goto L_0x01a3
            jjg r0 = defpackage.tky.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            asas r1 = r1.c
            if (r1 == 0) goto L_0x01b7
            goto L_0x01b9
        L_0x01b7:
            asas r1 = defpackage.asas.e
        L_0x01b9:
            long r10 = r1.b
            java.lang.String r1 = "Failed to create InternalPayload %d because unable to create Nearby directory."
            r0.a((java.lang.String) r1, (long) r10)
            r10 = r3
            goto L_0x0272
        L_0x01c3:
            java.io.File r11 = new java.io.File
            asas r14 = r1.c
            if (r14 == 0) goto L_0x01ca
            goto L_0x01cc
        L_0x01ca:
            asas r14 = defpackage.asas.e
        L_0x01cc:
            long r14 = r14.b
            java.lang.String r14 = java.lang.String.valueOf(r14)
            r11.<init>(r10, r14)
            r10 = 671088640(0x28000000, float:7.1054274E-15)
            android.os.ParcelFileDescriptor r10 = android.os.ParcelFileDescriptor.open(r11, r10)     // Catch:{ IOException -> 0x0224 }
            tnf r0 = r0.a
            android.content.Context r0 = r0.a
            java.lang.String r14 = "com.google.android.gms.fileprovider"
            android.net.Uri r0 = defpackage.ki.a(r0, r14, r11)
            uil r14 = new uil
            r14.<init>()
            asas r15 = r1.c
            if (r15 == 0) goto L_0x01ef
            goto L_0x01f1
        L_0x01ef:
            asas r15 = defpackage.asas.e
        L_0x01f1:
            long r12 = r15.b
            r14.a((long) r12)
            r14.a((int) r2)
            r14.a((android.os.ParcelFileDescriptor) r10)
            java.lang.String r10 = r11.getPath()
            r14.a((java.lang.String) r10)
            asas r1 = r1.c
            if (r1 == 0) goto L_0x0208
            goto L_0x020a
        L_0x0208:
            asas r1 = defpackage.asas.e
        L_0x020a:
            long r10 = r1.d
            r14.b(r10)
            com.google.android.gms.nearby.internal.connection.ParcelablePayload r1 = r14.a
            r1.h = r0
            android.content.Context r10 = r5.c
            java.lang.String r11 = r5.d
            int r12 = android.os.Build.VERSION.SDK_INT
            r12 = 67
            r10.grantUriPermission(r11, r0, r12)
            toe r10 = new toe
            r10.<init>(r1)
            goto L_0x0272
        L_0x0224:
            r0 = move-exception
            r10 = r0
            jjg r0 = defpackage.tky.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r0.a((java.lang.Throwable) r10)
            asas r1 = r1.c
            if (r1 == 0) goto L_0x0236
            goto L_0x0238
        L_0x0236:
            asas r1 = defpackage.asas.e
        L_0x0238:
            long r12 = r1.b
            java.lang.String r1 = r11.getPath()
            java.lang.String r10 = "Failed to create InternalPayload %d because unable to create java file %s."
            r0.a((java.lang.String) r10, (long) r12, (java.lang.Object) r1)
            r10 = r3
            goto L_0x0272
        L_0x0245:
            uil r0 = new uil
            r0.<init>()
            asas r10 = r1.c
            if (r10 == 0) goto L_0x024f
            goto L_0x0251
        L_0x024f:
            asas r10 = defpackage.asas.e
        L_0x0251:
            long r10 = r10.b
            r0.a((long) r10)
            r0.a((int) r4)
            asap r1 = r1.d
            if (r1 == 0) goto L_0x025e
            goto L_0x0260
        L_0x025e:
            asap r1 = defpackage.asap.e
        L_0x0260:
            auay r1 = r1.d
            byte[] r1 = r1.k()
            r0.a((byte[]) r1)
            com.google.android.gms.nearby.internal.connection.ParcelablePayload r0 = r0.a
            tod r10 = new tod
            r10.<init>(r0)
            goto L_0x0272
        L_0x0271:
            r10 = r3
        L_0x0272:
            if (r10 == 0) goto L_0x028c
            trk r3 = new trk
            java.lang.String[] r0 = new java.lang.String[r4]
            r1 = 0
            r0[r1] = r6
            java.util.ArrayList r0 = defpackage.anda.a((java.lang.Object[]) r0)
            r3.<init>(r10, r0, r4)
            trl r0 = r8.d
            long r10 = r10.a()
            r0.a(r10, r3)
            goto L_0x028d
        L_0x028c:
        L_0x028d:
            if (r3 != 0) goto L_0x02d7
            jjg r0 = defpackage.tky.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            long r10 = r7.b
            int r1 = r7.c
            int r1 = defpackage.asar.a(r1)
            if (r1 == 0) goto L_0x02a2
            goto L_0x02a3
        L_0x02a2:
            r1 = 1
        L_0x02a3:
            if (r1 == r4) goto L_0x02b3
            if (r1 == r2) goto L_0x02b0
            r2 = 3
            if (r1 == r2) goto L_0x02ad
            java.lang.String r1 = "STREAM"
            goto L_0x02b5
        L_0x02ad:
            java.lang.String r1 = "FILE"
            goto L_0x02b5
        L_0x02b0:
            java.lang.String r1 = "BYTES"
            goto L_0x02b5
        L_0x02b3:
            java.lang.String r1 = "UNKNOWN_PAYLOAD_TYPE"
        L_0x02b5:
            java.lang.String r2 = "PayloadManager failed to create InternalPayload from PayloadTransferFrame with ID %d and type %s, aborting receipt."
            r0.a((java.lang.String) r2, (long) r10, (java.lang.Object) r1)
            tra r0 = new tra
            r0.<init>(r5, r6, r7)
            r8.a((java.lang.Runnable) r0)
            java.lang.String[] r0 = new java.lang.String[r4]
            r1 = 0
            r0[r1] = r6
            java.util.ArrayList r2 = defpackage.anda.a((java.lang.Object[]) r0)
            long r4 = r9.c
            asal r6 = defpackage.asal.PAYLOAD_ERROR
            r1 = r16
            r3 = r7
            r1.a((java.util.List) r2, (defpackage.asas) r3, (long) r4, (defpackage.asal) r6)
            return
        L_0x02d7:
            trb r0 = new trb
            r0.<init>(r5, r6, r3)
            r8.a((java.lang.Runnable) r0)
            goto L_0x02ea
        L_0x02e0:
            trl r0 = r8.d
            long r1 = r7.b
            trk r3 = r0.a(r1)
            if (r3 == 0) goto L_0x0342
        L_0x02ea:
            boolean r0 = r3.b()
            if (r0 == 0) goto L_0x0301
            long r9 = r9.c
            asog r0 = defpackage.asog.LOCAL_CANCELLATION
            r1 = r16
            r2 = r19
            r3 = r18
            r4 = r7
            r5 = r9
            r7 = r0
            r1.a((defpackage.tlh) r2, (java.lang.String) r3, (defpackage.asas) r4, (long) r5, (defpackage.asog) r7)
            return
        L_0x0301:
            long r0 = r9.c
            r3.a((java.lang.String) r6, (long) r0)
            toc r0 = r3.a     // Catch:{ IOException -> 0x0323 }
            auay r1 = r9.d     // Catch:{ IOException -> 0x0323 }
            byte[] r1 = r1.k()     // Catch:{ IOException -> 0x0323 }
            r0.a((byte[]) r1)     // Catch:{ IOException -> 0x0323 }
            trd r0 = new trd
            r1 = r0
            r2 = r16
            r3 = r7
            r4 = r9
            r5 = r19
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            r8.a((java.lang.Runnable) r0)
            return
        L_0x0323:
            r0 = move-exception
            jjg r0 = defpackage.tky.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "Unable to attach chunk for incoming Payload %s, abandoning."
            r0.a((java.lang.String) r1, (java.lang.Object) r3)
            long r9 = r9.c
            asog r0 = defpackage.asog.LOCAL_ERROR
            r1 = r16
            r2 = r19
            r3 = r18
            r4 = r7
            r5 = r9
            r7 = r0
            r1.a((defpackage.tlh) r2, (java.lang.String) r3, (defpackage.asas) r4, (long) r5, (defpackage.asog) r7)
            return
        L_0x0342:
            jjg r0 = defpackage.tky.a
            anie r0 = r0.d()
            r1 = r0
            anih r1 = (defpackage.anih) r1
            long r3 = r7.b
            long r5 = r9.c
            java.lang.String r2 = "PayloadManager failed to retrieve Payload %d for chunk at offset %d, discarding."
            r1.a((java.lang.String) r2, (long) r3, (long) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.trm.a(asai, java.lang.String, tlh, asoe):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        this.c.execute(runnable);
    }

    public final void a(tlh tlh, String str, PayloadTransferUpdate payloadTransferUpdate, boolean z) {
        tlh.a(str, payloadTransferUpdate);
        if (z) {
            this.d.b(payloadTransferUpdate.a);
        }
    }

    public final void a(tlh tlh, String str, CountDownLatch countDownLatch) {
        a((Runnable) new tqy(this, str, tlh, countDownLatch));
    }

    public final void a(tlh tlh, List list, asas asas, long j, asog asog) {
        a((Runnable) new tqw(this, asas, asog, j, list, tlh));
        tri tri = tri.UNKNOWN;
        asal asal = asal.UNKNOWN_EVENT_TYPE;
        asao asao = asao.UNKNOWN_PACKET_TYPE;
        asog asog2 = asog.UNKNOWN_PAYLOAD_STATUS;
        int ordinal = asog.ordinal();
        if (ordinal == 2) {
            a(list, asas, j, asal.PAYLOAD_ERROR);
        } else if (ordinal == 3) {
        } else {
            if (ordinal == 4) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.a.a(tlh, (String) it.next());
                }
            } else if (ordinal == 7) {
                a(list, asas, j, asal.PAYLOAD_CANCELED);
            } else if (ordinal != 8) {
                ((anih) tky.a.d()).a("Unhandled finished outgoing payload with status %s!", (Object) asog);
            }
        }
    }

    public final void a(tlh tlh, String[] strArr, ParcelablePayload parcelablePayload) {
        a((Runnable) new tre(tlh, strArr, parcelablePayload));
    }
}
