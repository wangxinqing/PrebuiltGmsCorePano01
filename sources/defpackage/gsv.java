package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.backup.ParcelableBackupDataInput;
import com.google.android.gms.backup.ParcelableBackupDataOutput;
import com.google.android.gms.romanesco.service.RomanescoModuleBackupAgentService;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;

/* renamed from: gsv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gsv extends bhw implements IInterface {
    private final ztb a;
    private final zsz b;
    private final gsa c;
    private final Context d;

    public gsv() {
        super("com.google.android.gms.backup.IChimeraModuleBackupAgent");
    }

    private static Pair a(List list, Account account) {
        int size = list.size();
        String str = null;
        Long l = null;
        aqxa aqxa = null;
        boolean z = false;
        for (int i = 0; i < size; i++) {
            gsc gsc = (gsc) list.get(i);
            zsg zsg = RomanescoModuleBackupAgentService.a;
            Object[] objArr = {gsc.a(), new String(aooa.a((Collection) gsc.c()))};
            if ("device_id".equals(gsc.a())) {
                List c2 = gsc.c();
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.put(aooa.a((Collection) c2));
                allocate.flip();
                l = Long.valueOf(allocate.getLong());
                Object[] objArr2 = {account, l};
            } else if ("contacts_backup_key_q".equals(gsc.a())) {
                RomanescoModuleBackupAgentService.a.b("Contacts backup found");
                aqxa = (aqxa) aqxb.c.o();
                aqxa.b(aooa.a((Collection) gsc.c()), aubs.c());
                z = true;
            }
        }
        if (z) {
            if (l != null) {
                str = Long.toString(l.longValue());
            }
            return new Pair(str, (aqxb) aqxa.i());
        }
        throw new RemoteException("Required contact backup not found in selected backup.");
    }

    private static void b(int i, int i2, int i3) {
        aucd o = avep.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((avep) o.b).a = aveo.a(3);
        if (o.c) {
            o.c();
            o.c = false;
        }
        avep avep = (avep) o.b;
        avep.b = i;
        avep.c = i2;
        avep.e = aven.a(i3);
        zsi.a().a((avep) o.i());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gsv(Context context) {
        super("com.google.android.gms.backup.IChimeraModuleBackupAgent");
        gsa gsa = new gsa(context);
        zsz zsz = new zsz(context);
        ztb ztb = new ztb(context, 3);
        this.c = gsa;
        this.b = zsz;
        this.a = ztb;
        this.d = context;
    }

    private final void b(List list, Account account) {
        try {
            Pair a2 = a(list, account);
            this.a.a((aqxb) a2.second, account.name, azfa.a.a().r());
            RomanescoModuleBackupAgentService.a.b("onRestore success");
            if (azfa.j()) {
                b(((aqxb) a2.second).a.size(), list.size(), 4);
            }
        } catch (OperationApplicationException e) {
            a(4, 7, 4);
            String valueOf = String.valueOf(e.getMessage());
            throw new RemoteException(valueOf.length() == 0 ? new String("Exception writing backup contacts to CP2: ") : "Exception writing backup contacts to CP2: ".concat(valueOf));
        }
    }

    private static void a() {
        aucd o = avem.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((avem) o.b).a = avel.a(4);
        zsi.a().a((avem) o.i());
    }

    private static void a(int i, int i2, int i3) {
        aucd o = avep.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((avep) o.b).a = aveo.a(i);
        if (o.c) {
            o.c();
            o.c = false;
        }
        ((avep) o.b).d = i2 - 2;
        ((avep) o.b).e = aven.a(i3);
        zsi.a().a((avep) o.i());
    }

    private static void a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new RemoteException(valueOf.length() == 0 ? new String("Cannot close ParcelFileDescriptor: ") : "Cannot close ParcelFileDescriptor: ".concat(valueOf));
        }
    }

    private static void a(ParcelableBackupDataInput parcelableBackupDataInput) {
        try {
            parcelableBackupDataInput.close();
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new RemoteException(valueOf.length() == 0 ? new String("Cannot close ParcelableBackupDataInput: ") : "Cannot close ParcelableBackupDataInput: ".concat(valueOf));
        }
    }

    private static void a(ParcelableBackupDataOutput parcelableBackupDataOutput) {
        try {
            parcelableBackupDataOutput.close();
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new RemoteException(valueOf.length() == 0 ? new String("Cannot close ParcelableBackupDataOutput: ") : "Cannot close ParcelableBackupDataOutput: ".concat(valueOf));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011b A[Catch:{ all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011c A[Catch:{ all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0132 A[Catch:{ all -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0138 A[Catch:{ all -> 0x0112 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r13, android.os.Parcel r14, android.os.Parcel r15) {
        /*
            r12 = this;
            r0 = 5
            r1 = 1
            r2 = 2
            r3 = 3
            r4 = 0
            if (r13 == r1) goto L_0x0149
            if (r13 == r2) goto L_0x000a
            return r4
        L_0x000a:
            android.os.Parcelable$Creator r13 = com.google.android.gms.backup.ParcelableBackupDataInput.CREATOR
            android.os.Parcelable r13 = defpackage.bhx.a((android.os.Parcel) r14, (android.os.Parcelable.Creator) r13)
            com.google.android.gms.backup.ParcelableBackupDataInput r13 = (com.google.android.gms.backup.ParcelableBackupDataInput) r13
            r14.readInt()
            android.os.Parcelable$Creator r5 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r14 = defpackage.bhx.a((android.os.Parcel) r14, (android.os.Parcelable.Creator) r5)
            android.os.ParcelFileDescriptor r14 = (android.os.ParcelFileDescriptor) r14
            r5 = 4
            boolean r6 = defpackage.jkr.h()     // Catch:{ IOException -> 0x0114 }
            if (r6 == 0) goto L_0x00f8
            azfa r6 = defpackage.azfa.a     // Catch:{ IOException -> 0x0114 }
            azfb r6 = r6.a()     // Catch:{ IOException -> 0x0114 }
            boolean r6 = r6.q()     // Catch:{ IOException -> 0x0114 }
            if (r6 == 0) goto L_0x00f8
            gsa r6 = r12.c     // Catch:{ IOException -> 0x0114 }
            android.accounts.Account r6 = r6.a()     // Catch:{ IOException -> 0x0114 }
            if (r6 != 0) goto L_0x0050
            java.lang.String r15 = "onRestore called but no backup account found"
            zsg r1 = com.google.android.gms.romanesco.service.RomanescoModuleBackupAgentService.a     // Catch:{ IOException -> 0x0114 }
            r1.d(r15)     // Catch:{ IOException -> 0x0114 }
            boolean r1 = defpackage.azfa.j()     // Catch:{ IOException -> 0x0114 }
            if (r1 != 0) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            r1 = 6
            a((int) r5, (int) r1, (int) r2)     // Catch:{ IOException -> 0x0114 }
        L_0x004a:
            android.os.RemoteException r1 = new android.os.RemoteException     // Catch:{ IOException -> 0x0114 }
            r1.<init>(r15)     // Catch:{ IOException -> 0x0114 }
            throw r1     // Catch:{ IOException -> 0x0114 }
        L_0x0050:
            zsg r7 = com.google.android.gms.romanesco.service.RomanescoModuleBackupAgentService.a     // Catch:{ IOException -> 0x0114 }
            java.lang.String r8 = "onRestore"
            r7.b(r8)     // Catch:{ IOException -> 0x0114 }
            android.os.ParcelFileDescriptor r7 = r13.a     // Catch:{ IOException -> 0x0114 }
            java.util.List r7 = defpackage.gsb.a(r7)     // Catch:{ IOException -> 0x0114 }
            boolean r8 = defpackage.azfh.c()     // Catch:{ IOException -> 0x0114 }
            if (r8 == 0) goto L_0x00f1
            android.content.Context r8 = r12.d     // Catch:{ IOException -> 0x0114 }
            java.lang.String r9 = r6.name     // Catch:{ IOException -> 0x0114 }
            android.content.SharedPreferences r8 = defpackage.zyq.a(r8)     // Catch:{ IOException -> 0x0114 }
            java.lang.String r10 = "is_restore_from_settings__"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ IOException -> 0x0114 }
            int r11 = r9.length()     // Catch:{ IOException -> 0x0114 }
            if (r11 != 0) goto L_0x007d
            java.lang.String r9 = new java.lang.String     // Catch:{ IOException -> 0x0114 }
            r9.<init>(r10)     // Catch:{ IOException -> 0x0114 }
            goto L_0x0081
        L_0x007d:
            java.lang.String r9 = r10.concat(r9)     // Catch:{ IOException -> 0x0114 }
        L_0x0081:
            boolean r2 = r8.getBoolean(r9, r4)     // Catch:{ IOException -> 0x0114 }
            if (r2 == 0) goto L_0x00f1
            android.util.Pair r2 = a(r7, r6)     // Catch:{ IOException -> 0x00ee }
            java.lang.Object r4 = r2.first     // Catch:{ IOException -> 0x00ee }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x00ee }
            boolean r4 = defpackage.amrk.a((java.lang.String) r4)     // Catch:{ IOException -> 0x00ee }
            if (r4 == 0) goto L_0x00c0
            zsg r4 = com.google.android.gms.romanesco.service.RomanescoModuleBackupAgentService.a     // Catch:{ IOException -> 0x00ee }
            java.lang.String r6 = "Do not restore GMS backup with null / Empty device id, deviceId found : "
            java.lang.Object r2 = r2.first     // Catch:{ IOException -> 0x00ee }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x00ee }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x00ee }
            int r7 = r2.length()     // Catch:{ IOException -> 0x00ee }
            if (r7 != 0) goto L_0x00ad
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x00ee }
            r2.<init>(r6)     // Catch:{ IOException -> 0x00ee }
            goto L_0x00b1
        L_0x00ad:
            java.lang.String r2 = r6.concat(r2)     // Catch:{ IOException -> 0x00ee }
        L_0x00b1:
            r4.d(r2)     // Catch:{ IOException -> 0x00ee }
            boolean r2 = defpackage.azfa.j()     // Catch:{ IOException -> 0x00ee }
            if (r2 != 0) goto L_0x00bb
            goto L_0x0108
        L_0x00bb:
            a((int) r5, (int) r3, (int) r3)     // Catch:{ IOException -> 0x00ee }
            goto L_0x0108
        L_0x00c0:
            zyz r4 = defpackage.zyz.a     // Catch:{ IOException -> 0x00ee }
            java.lang.String r6 = r6.name     // Catch:{ IOException -> 0x00ee }
            java.lang.Object r8 = r2.first     // Catch:{ IOException -> 0x00ee }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x00ee }
            java.lang.Object r9 = r2.second     // Catch:{ IOException -> 0x00ee }
            aqxb r9 = (defpackage.aqxb) r9     // Catch:{ IOException -> 0x00ee }
            android.util.LruCache r4 = r4.b     // Catch:{ IOException -> 0x00ee }
            zyy r10 = new zyy     // Catch:{ IOException -> 0x00ee }
            r10.<init>(r6, r8)     // Catch:{ IOException -> 0x00ee }
            r4.put(r10, r9)     // Catch:{ IOException -> 0x00ee }
            boolean r4 = defpackage.azfa.j()     // Catch:{ IOException -> 0x00ee }
            if (r4 == 0) goto L_0x0108
            java.lang.Object r2 = r2.second     // Catch:{ IOException -> 0x00ee }
            aqxb r2 = (defpackage.aqxb) r2     // Catch:{ IOException -> 0x00ee }
            aucx r2 = r2.a     // Catch:{ IOException -> 0x00ee }
            int r2 = r2.size()     // Catch:{ IOException -> 0x00ee }
            int r4 = r7.size()     // Catch:{ IOException -> 0x00ee }
            b(r2, r4, r3)     // Catch:{ IOException -> 0x00ee }
            goto L_0x0108
        L_0x00ee:
            r15 = move-exception
            r2 = 3
            goto L_0x0115
        L_0x00f1:
            r12.b(r7, r6)     // Catch:{ IOException -> 0x00f5 }
            goto L_0x0108
        L_0x00f5:
            r15 = move-exception
            r2 = 4
            goto L_0x0115
        L_0x00f8:
            zsg r3 = com.google.android.gms.romanesco.service.RomanescoModuleBackupAgentService.a     // Catch:{ IOException -> 0x0114 }
            java.lang.String r4 = "onRestore called but it is disabled."
            r3.b(r4)     // Catch:{ IOException -> 0x0114 }
            boolean r3 = defpackage.azfa.j()     // Catch:{ IOException -> 0x0114 }
            if (r3 == 0) goto L_0x0108
            a((int) r0, (int) r5, (int) r2)     // Catch:{ IOException -> 0x0114 }
        L_0x0108:
            a((com.google.android.gms.backup.ParcelableBackupDataInput) r13)
            if (r14 == 0) goto L_0x0392
            a((android.os.ParcelFileDescriptor) r14)
            goto L_0x0392
        L_0x0112:
            r15 = move-exception
            goto L_0x0140
        L_0x0114:
            r15 = move-exception
        L_0x0115:
            boolean r1 = defpackage.azfa.j()     // Catch:{ all -> 0x0112 }
            if (r1 != 0) goto L_0x011c
            goto L_0x0120
        L_0x011c:
            a((int) r5, (int) r0, (int) r2)     // Catch:{ all -> 0x0112 }
        L_0x0120:
            android.os.RemoteException r0 = new android.os.RemoteException     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = "Exception reading restore data: "
            java.lang.String r15 = r15.getMessage()     // Catch:{ all -> 0x0112 }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0112 }
            int r2 = r15.length()     // Catch:{ all -> 0x0112 }
            if (r2 != 0) goto L_0x0138
            java.lang.String r15 = new java.lang.String     // Catch:{ all -> 0x0112 }
            r15.<init>(r1)     // Catch:{ all -> 0x0112 }
            goto L_0x013c
        L_0x0138:
            java.lang.String r15 = r1.concat(r15)     // Catch:{ all -> 0x0112 }
        L_0x013c:
            r0.<init>(r15)     // Catch:{ all -> 0x0112 }
            throw r0     // Catch:{ all -> 0x0112 }
        L_0x0140:
            a((com.google.android.gms.backup.ParcelableBackupDataInput) r13)
            if (r14 == 0) goto L_0x0148
            a((android.os.ParcelFileDescriptor) r14)
        L_0x0148:
            throw r15
        L_0x0149:
            android.os.Parcelable$Creator r13 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r13 = defpackage.bhx.a((android.os.Parcel) r14, (android.os.Parcelable.Creator) r13)
            android.os.ParcelFileDescriptor r13 = (android.os.ParcelFileDescriptor) r13
            android.os.Parcelable$Creator r5 = com.google.android.gms.backup.ParcelableBackupDataOutput.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r14, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.backup.ParcelableBackupDataOutput r5 = (com.google.android.gms.backup.ParcelableBackupDataOutput) r5
            android.os.Parcelable$Creator r6 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r14 = defpackage.bhx.a((android.os.Parcel) r14, (android.os.Parcelable.Creator) r6)
            android.os.ParcelFileDescriptor r14 = (android.os.ParcelFileDescriptor) r14
            boolean r6 = defpackage.jkr.h()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r6 != 0) goto L_0x0169
            goto L_0x0353
        L_0x0169:
            boolean r6 = defpackage.azfa.f()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r6 == 0) goto L_0x0353
            zsg r6 = com.google.android.gms.romanesco.service.RomanescoModuleBackupAgentService.a     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r7 = "onBackup"
            r6.b(r7)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            azfa r6 = defpackage.azfa.a     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            azfb r6 = r6.a()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            boolean r6 = r6.v()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r6 == 0) goto L_0x0196
            java.lang.String r6 = "romanesco_presence_backup_value"
            java.nio.charset.Charset r7 = java.nio.charset.Charset.defaultCharset()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            byte[] r6 = r6.getBytes(r7)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r7 = "romanesco_presence_backup_key_q"
            int r8 = r6.length     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            gsc r6 = defpackage.gsc.a(r7, r8, r6)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r5.a(r6)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
        L_0x0196:
            zsz r6 = r12.b     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aqxb r6 = r6.a()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.Object r0 = r6.c(r0)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aucd r0 = (defpackage.aucd) r0     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r0.a((defpackage.aucj) r6)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aqxa r0 = (defpackage.aqxa) r0     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aqxq r6 = defpackage.aqxq.b     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aucd r6 = r6.o()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            amqb r7 = defpackage.amqb.LOWER_UNDERSCORE     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            amqb r8 = defpackage.amqb.UPPER_CAMEL     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r9 = android.os.Build.MANUFACTURER     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r9 = r9.toLowerCase()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r7 = r7.b(r8, r9)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r8 = android.os.Build.MODEL     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            int r9 = r9.length()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r10 = java.lang.String.valueOf(r8)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            int r10 = r10.length()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            int r9 = r9 + r3
            int r9 = r9 + r10
            r11.<init>(r9)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r11.append(r7)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r7 = " - "
            r11.append(r7)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r11.append(r8)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r7 = r11.toString()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            boolean r8 = r6.c     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r8 != 0) goto L_0x01e8
            goto L_0x01ed
        L_0x01e8:
            r6.c()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r6.c = r4     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
        L_0x01ed:
            aucj r8 = r6.b     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aqxq r8 = (defpackage.aqxq) r8     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r7.getClass()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r8.a = r7     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            boolean r7 = r0.c     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r7 != 0) goto L_0x01fb
            goto L_0x0200
        L_0x01fb:
            r0.c()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r0.c = r4     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
        L_0x0200:
            aucj r7 = r0.b     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aqxb r7 = (defpackage.aqxb) r7     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aucj r6 = r6.i()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aqxq r6 = (defpackage.aqxq) r6     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aqxb r8 = defpackage.aqxb.c     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r6.getClass()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r7.b = r6     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            azex r6 = defpackage.azex.a     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            azey r6 = r6.a()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            boolean r6 = r6.a()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r6 != 0) goto L_0x021e
            goto L_0x025a
        L_0x021e:
            azfa r6 = defpackage.azfa.a     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            azfb r6 = r6.a()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            long r6 = r6.g()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            int r7 = (int) r6     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aucj r6 = r0.b     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aqxb r6 = (defpackage.aqxb) r6     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aucx r6 = r6.a     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            int r6 = r6.size()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r6 <= r7) goto L_0x025a
            aucj r6 = r0.b     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aqxb r6 = (defpackage.aqxb) r6     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aucx r6 = r6.a     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.util.List r6 = r6.subList(r4, r7)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            boolean r7 = r0.c     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r7 != 0) goto L_0x0248
            goto L_0x024d
        L_0x0248:
            r0.c()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r0.c = r4     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
        L_0x024d:
            aucj r7 = r0.b     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aqxb r7 = (defpackage.aqxb) r7     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aucx r8 = defpackage.aucj.s()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r7.a = r8     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r0.a(r6)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
        L_0x025a:
            aucj r6 = r0.i()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aqxb r6 = (defpackage.aqxb) r6     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            byte[] r6 = r6.k()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            int r7 = r6.length     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r8 = "contacts_backup_key_q"
            gsc r6 = defpackage.gsc.a(r8, r7, r6)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r5.a(r6)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            azfa r6 = defpackage.azfa.a     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            azfb r6 = r6.a()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            boolean r6 = r6.a()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r6 != 0) goto L_0x027b
            goto L_0x02d3
        L_0x027b:
            android.content.Context r6 = r12.d     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            amri r6 = defpackage.zru.a((android.content.Context) r6)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            boolean r8 = r6.a()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r8 == 0) goto L_0x02a9
            java.lang.Object r6 = r6.b()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            long r8 = r6.longValue()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r6 = 8
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r6.putLong(r8)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            byte[] r6 = r6.array()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r8 = "device_id"
            int r9 = r6.length     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            gsc r6 = defpackage.gsc.a(r8, r9, r6)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r5.a(r6)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            goto L_0x02d3
        L_0x02a9:
            zsg r6 = com.google.android.gms.romanesco.service.RomanescoModuleBackupAgentService.a     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            gsa r8 = r12.c     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            android.accounts.Account r8 = r8.a()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            int r9 = r9.length()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            int r9 = r9 + 48
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r10.<init>(r9)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r9 = "Device Id not found while backup for account %s "
            r10.append(r9)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r10.append(r8)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r8 = r10.toString()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r6.d(r8)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
        L_0x02d3:
            azfa r6 = defpackage.azfa.a     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            azfb r6 = r6.a()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            boolean r6 = r6.j()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r6 == 0) goto L_0x0302
            zsg r6 = com.google.android.gms.romanesco.service.RomanescoModuleBackupAgentService.a     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aucj r8 = r0.b     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aqxb r8 = (defpackage.aqxb) r8     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aucx r8 = r8.a     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            int r8 = r8.size()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r2[r4] = r8     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r2[r1] = r8     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r8 = "Backed up %d contacts in %d bytes"
            java.lang.String r2 = java.lang.String.format(r8, r2)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r6.b(r2)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
        L_0x0302:
            zsg r2 = com.google.android.gms.romanesco.service.RomanescoModuleBackupAgentService.a     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r6 = "onBackup success."
            r2.b(r6)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            boolean r2 = defpackage.azfa.i()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r2 == 0) goto L_0x0387
            avem r2 = defpackage.avem.d     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aucd r2 = r2.o()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            boolean r6 = r2.c     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r6 != 0) goto L_0x031a
            goto L_0x031f
        L_0x031a:
            r2.c()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r2.c = r4     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
        L_0x031f:
            aucj r6 = r2.b     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            avem r6 = (defpackage.avem) r6     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            int r3 = defpackage.avel.a(r3)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r6.a = r3     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aucj r0 = r0.b     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aqxb r0 = (defpackage.aqxb) r0     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aucx r0 = r0.a     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            boolean r3 = r2.c     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r3 != 0) goto L_0x0338
            goto L_0x033d
        L_0x0338:
            r2.c()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r2.c = r4     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
        L_0x033d:
            aucj r3 = r2.b     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            avem r3 = (defpackage.avem) r3     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r3.b = r0     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r3.c = r7     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aucj r0 = r2.i()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            avem r0 = (defpackage.avem) r0     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            zsi r2 = defpackage.zsi.a()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r2.a((defpackage.avem) r0)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            goto L_0x0387
        L_0x0353:
            zsg r2 = com.google.android.gms.romanesco.service.RomanescoModuleBackupAgentService.a     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            java.lang.String r3 = "onBackup called but it is disabled."
            r2.b(r3)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            boolean r2 = defpackage.azfa.i()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r2 == 0) goto L_0x0387
            avem r2 = defpackage.avem.d     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aucd r2 = r2.o()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            boolean r3 = r2.c     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            if (r3 != 0) goto L_0x036b
            goto L_0x0370
        L_0x036b:
            r2.c()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r2.c = r4     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
        L_0x0370:
            aucj r3 = r2.b     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            avem r3 = (defpackage.avem) r3     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            int r0 = defpackage.avel.a(r0)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r3.a = r0     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            aucj r0 = r2.i()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            avem r0 = (defpackage.avem) r0     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            zsi r2 = defpackage.zsi.a()     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
            r2.a((defpackage.avem) r0)     // Catch:{ IOException -> 0x03c8, zsu -> 0x039d, zst -> 0x039b, InterruptedException -> 0x0399 }
        L_0x0387:
            a((com.google.android.gms.backup.ParcelableBackupDataOutput) r5)
            if (r13 == 0) goto L_0x038f
            a((android.os.ParcelFileDescriptor) r13)
        L_0x038f:
            a((android.os.ParcelFileDescriptor) r14)
        L_0x0392:
            r15.writeNoException()
            return r1
        L_0x0396:
            r15 = move-exception
            goto L_0x040a
        L_0x0399:
            r15 = move-exception
            goto L_0x039e
        L_0x039b:
            r15 = move-exception
            goto L_0x039e
        L_0x039d:
            r15 = move-exception
        L_0x039e:
            boolean r0 = defpackage.azfa.i()     // Catch:{ all -> 0x0396 }
            if (r0 != 0) goto L_0x03a5
            goto L_0x03a8
        L_0x03a5:
            a()     // Catch:{ all -> 0x0396 }
        L_0x03a8:
            android.os.RemoteException r0 = new android.os.RemoteException     // Catch:{ all -> 0x0396 }
            java.lang.String r1 = "Unable to read contacts from CP2: "
            java.lang.String r15 = r15.getMessage()     // Catch:{ all -> 0x0396 }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0396 }
            int r2 = r15.length()     // Catch:{ all -> 0x0396 }
            if (r2 != 0) goto L_0x03c0
            java.lang.String r15 = new java.lang.String     // Catch:{ all -> 0x0396 }
            r15.<init>(r1)     // Catch:{ all -> 0x0396 }
            goto L_0x03c4
        L_0x03c0:
            java.lang.String r15 = r1.concat(r15)     // Catch:{ all -> 0x0396 }
        L_0x03c4:
            r0.<init>(r15)     // Catch:{ all -> 0x0396 }
            throw r0     // Catch:{ all -> 0x0396 }
        L_0x03c8:
            r15 = move-exception
            boolean r0 = defpackage.azfa.g()     // Catch:{ all -> 0x0396 }
            java.lang.String r2 = "Exception writing backup data"
            if (r0 != 0) goto L_0x03db
            zsg r0 = com.google.android.gms.romanesco.service.RomanescoModuleBackupAgentService.a     // Catch:{ all -> 0x0396 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0396 }
            r1[r4] = r15     // Catch:{ all -> 0x0396 }
            r0.e(r2, r1)     // Catch:{ all -> 0x0396 }
            goto L_0x03e0
        L_0x03db:
            zsg r0 = com.google.android.gms.romanesco.service.RomanescoModuleBackupAgentService.a     // Catch:{ all -> 0x0396 }
            r0.a((java.lang.Throwable) r15, (java.lang.String) r2)     // Catch:{ all -> 0x0396 }
        L_0x03e0:
            boolean r0 = defpackage.azfa.i()     // Catch:{ all -> 0x0396 }
            if (r0 != 0) goto L_0x03e7
            goto L_0x03ea
        L_0x03e7:
            a()     // Catch:{ all -> 0x0396 }
        L_0x03ea:
            android.os.RemoteException r0 = new android.os.RemoteException     // Catch:{ all -> 0x0396 }
            java.lang.String r1 = "Exception writing backup data: "
            java.lang.String r15 = r15.getMessage()     // Catch:{ all -> 0x0396 }
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x0396 }
            int r2 = r15.length()     // Catch:{ all -> 0x0396 }
            if (r2 != 0) goto L_0x0402
            java.lang.String r15 = new java.lang.String     // Catch:{ all -> 0x0396 }
            r15.<init>(r1)     // Catch:{ all -> 0x0396 }
            goto L_0x0406
        L_0x0402:
            java.lang.String r15 = r1.concat(r15)     // Catch:{ all -> 0x0396 }
        L_0x0406:
            r0.<init>(r15)     // Catch:{ all -> 0x0396 }
            throw r0     // Catch:{ all -> 0x0396 }
        L_0x040a:
            a((com.google.android.gms.backup.ParcelableBackupDataOutput) r5)
            if (r13 == 0) goto L_0x0412
            a((android.os.ParcelFileDescriptor) r13)
        L_0x0412:
            a((android.os.ParcelFileDescriptor) r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsv.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
