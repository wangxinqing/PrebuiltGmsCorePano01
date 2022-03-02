package defpackage;

import android.content.Context;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.UserQuota;
import java.util.Collections;

/* renamed from: yjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yjr extends bhw implements yjs {
    private final Context a;

    public yjr() {
        super("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
    }

    public final void a(yjp yjp) {
        yjp.a(0, Collections.singletonList(new AutoBackupSettings(1, (String) null, false, true, false, true, true, false, false, false, (UserQuota) null)));
    }

    public yjr(Context context) {
        super("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        this.a = context;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v10, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v12, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v13, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v9, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v15, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v16, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v17, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v18, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v19, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v20, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v21, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r4v22, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 15 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r19, android.os.Parcel r20, android.os.Parcel r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = 1
            r3 = 0
            java.lang.String r4 = "com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks"
            r5 = 0
            switch(r19) {
                case 1: goto L_0x0233;
                case 2: goto L_0x0209;
                case 3: goto L_0x01ea;
                case 4: goto L_0x01cc;
                case 5: goto L_0x01ab;
                case 6: goto L_0x017b;
                case 7: goto L_0x0147;
                case 8: goto L_0x0129;
                case 9: goto L_0x0103;
                case 10: goto L_0x00e2;
                case 11: goto L_0x00c1;
                case 12: goto L_0x0098;
                case 13: goto L_0x0075;
                case 14: goto L_0x0051;
                case 15: goto L_0x0030;
                case 16: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            return r3
        L_0x000d:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x0025
            android.os.IInterface r4 = r1.queryLocalInterface(r4)
            boolean r5 = r4 instanceof defpackage.yjp
            if (r5 == 0) goto L_0x001f
            r5 = r4
            yjp r5 = (defpackage.yjp) r5
            goto L_0x0026
        L_0x001f:
            yjn r5 = new yjn
            r5.<init>(r1)
            goto L_0x0026
        L_0x0025:
        L_0x0026:
            com.google.android.gms.photos.autobackup.model.AutoBackupEngineStatus r1 = new com.google.android.gms.photos.autobackup.model.AutoBackupEngineStatus
            r1.<init>(r2, r3)
            r5.a((com.google.android.gms.photos.autobackup.model.AutoBackupEngineStatus) r1)
            goto L_0x024f
        L_0x0030:
            android.os.IBinder r3 = r20.readStrongBinder()
            if (r3 == 0) goto L_0x0048
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof defpackage.yjp
            if (r5 == 0) goto L_0x0042
            r5 = r4
            yjp r5 = (defpackage.yjp) r5
            goto L_0x0049
        L_0x0042:
            yjn r5 = new yjn
            r5.<init>(r3)
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            defpackage.bhx.a(r20)
            r5.g()
            goto L_0x024f
        L_0x0051:
            android.os.IBinder r3 = r20.readStrongBinder()
            if (r3 == 0) goto L_0x0069
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof defpackage.yjp
            if (r5 == 0) goto L_0x0063
            r5 = r4
            yjp r5 = (defpackage.yjp) r5
            goto L_0x006a
        L_0x0063:
            yjn r5 = new yjn
            r5.<init>(r3)
            goto L_0x006a
        L_0x0069:
        L_0x006a:
            r20.readString()
            r20.createStringArray()
            r5.e()
            goto L_0x024f
        L_0x0075:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x008d
            android.os.IInterface r4 = r1.queryLocalInterface(r4)
            boolean r5 = r4 instanceof defpackage.yjp
            if (r5 == 0) goto L_0x0087
            r5 = r4
            yjp r5 = (defpackage.yjp) r5
            goto L_0x008e
        L_0x0087:
            yjn r5 = new yjn
            r5.<init>(r1)
            goto L_0x008e
        L_0x008d:
        L_0x008e:
            com.google.android.gms.photos.autobackup.model.MigrationStatus r1 = new com.google.android.gms.photos.autobackup.model.MigrationStatus
            r1.<init>(r2, r3)
            r5.a((com.google.android.gms.photos.autobackup.model.MigrationStatus) r1)
            goto L_0x024f
        L_0x0098:
            android.os.IBinder r3 = r20.readStrongBinder()
            if (r3 == 0) goto L_0x00b0
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof defpackage.yjp
            if (r5 == 0) goto L_0x00aa
            r5 = r4
            yjp r5 = (defpackage.yjp) r5
            goto L_0x00b1
        L_0x00aa:
            yjn r5 = new yjn
            r5.<init>(r3)
            goto L_0x00b1
        L_0x00b0:
        L_0x00b1:
            r20.readString()
            android.os.Parcelable$Creator r3 = com.google.android.gms.photos.autobackup.model.SyncSettings.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r1, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.photos.autobackup.model.SyncSettings r1 = (com.google.android.gms.photos.autobackup.model.SyncSettings) r1
            r5.j()
            goto L_0x024f
        L_0x00c1:
            android.os.IBinder r3 = r20.readStrongBinder()
            if (r3 == 0) goto L_0x00d9
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof defpackage.yjp
            if (r5 == 0) goto L_0x00d3
            r5 = r4
            yjp r5 = (defpackage.yjp) r5
            goto L_0x00da
        L_0x00d3:
            yjn r5 = new yjn
            r5.<init>(r3)
            goto L_0x00da
        L_0x00d9:
        L_0x00da:
            r20.readString()
            r5.i()
            goto L_0x024f
        L_0x00e2:
            android.os.IBinder r3 = r20.readStrongBinder()
            if (r3 == 0) goto L_0x00fa
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof defpackage.yjp
            if (r5 == 0) goto L_0x00f4
            r5 = r4
            yjp r5 = (defpackage.yjp) r5
            goto L_0x00fb
        L_0x00f4:
            yjn r5 = new yjn
            r5.<init>(r3)
            goto L_0x00fb
        L_0x00fa:
        L_0x00fb:
            r20.readString()
            r5.c()
            goto L_0x024f
        L_0x0103:
            android.os.IBinder r3 = r20.readStrongBinder()
            if (r3 == 0) goto L_0x011b
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof defpackage.yjp
            if (r5 == 0) goto L_0x0115
            r5 = r4
            yjp r5 = (defpackage.yjp) r5
            goto L_0x011c
        L_0x0115:
            yjn r5 = new yjn
            r5.<init>(r3)
            goto L_0x011c
        L_0x011b:
        L_0x011c:
            android.os.Parcelable$Creator r3 = com.google.android.gms.photos.autobackup.model.AutoBackupSettings.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r1, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.photos.autobackup.model.AutoBackupSettings r1 = (com.google.android.gms.photos.autobackup.model.AutoBackupSettings) r1
            r5.h()
            goto L_0x024f
        L_0x0129:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x0141
            android.os.IInterface r3 = r1.queryLocalInterface(r4)
            boolean r4 = r3 instanceof defpackage.yjp
            if (r4 == 0) goto L_0x013b
            r5 = r3
            yjp r5 = (defpackage.yjp) r5
            goto L_0x0142
        L_0x013b:
            yjn r5 = new yjn
            r5.<init>(r1)
            goto L_0x0142
        L_0x0141:
        L_0x0142:
            r5.f()
            goto L_0x024f
        L_0x0147:
            android.os.IBinder r3 = r20.readStrongBinder()
            if (r3 == 0) goto L_0x015f
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof defpackage.yjp
            if (r5 == 0) goto L_0x0159
            r5 = r4
            yjp r5 = (defpackage.yjp) r5
            goto L_0x0160
        L_0x0159:
            yjn r5 = new yjn
            r5.<init>(r3)
            goto L_0x0160
        L_0x015f:
        L_0x0160:
            r20.readString()
            com.google.android.gms.photos.autobackup.model.AutoBackupStatus r1 = new com.google.android.gms.photos.autobackup.model.AutoBackupStatus
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r5.a((com.google.android.gms.photos.autobackup.model.AutoBackupStatus) r1)
            goto L_0x024f
        L_0x017b:
            android.os.IBinder r3 = r20.readStrongBinder()
            if (r3 == 0) goto L_0x0193
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof defpackage.yjp
            if (r5 == 0) goto L_0x018d
            r5 = r4
            yjp r5 = (defpackage.yjp) r5
            goto L_0x0194
        L_0x018d:
            yjn r5 = new yjn
            r5.<init>(r3)
            goto L_0x0194
        L_0x0193:
        L_0x0194:
            r20.readString()
            android.os.Parcelable$Creator r3 = com.google.android.gms.photos.autobackup.model.LocalFolder.CREATOR
            android.os.Parcelable r1 = defpackage.bhx.a((android.os.Parcel) r1, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.photos.autobackup.model.LocalFolder r1 = (com.google.android.gms.photos.autobackup.model.LocalFolder) r1
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status
            r4 = 8
            r3.<init>(r4)
            r5.a((com.google.android.gms.common.api.Status) r3, (com.google.android.gms.photos.autobackup.model.LocalFolder) r1)
            goto L_0x024f
        L_0x01ab:
            android.os.IBinder r3 = r20.readStrongBinder()
            if (r3 == 0) goto L_0x01c3
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof defpackage.yjp
            if (r5 == 0) goto L_0x01bd
            r5 = r4
            yjp r5 = (defpackage.yjp) r5
            goto L_0x01c4
        L_0x01bd:
            yjn r5 = new yjn
            r5.<init>(r3)
            goto L_0x01c4
        L_0x01c3:
        L_0x01c4:
            r20.readString()
            r5.d()
            goto L_0x024f
        L_0x01cc:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x01e4
            android.os.IInterface r3 = r1.queryLocalInterface(r4)
            boolean r4 = r3 instanceof defpackage.yjp
            if (r4 == 0) goto L_0x01de
            r5 = r3
            yjp r5 = (defpackage.yjp) r5
            goto L_0x01e5
        L_0x01de:
            yjn r5 = new yjn
            r5.<init>(r1)
            goto L_0x01e5
        L_0x01e4:
        L_0x01e5:
            r0.a(r5)
            goto L_0x024f
        L_0x01ea:
            android.os.IBinder r3 = r20.readStrongBinder()
            if (r3 == 0) goto L_0x0201
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r6 = r4 instanceof defpackage.yjp
            if (r6 == 0) goto L_0x01fb
            yjp r4 = (defpackage.yjp) r4
            goto L_0x0202
        L_0x01fb:
            yjn r4 = new yjn
            r4.<init>(r3)
            goto L_0x0202
        L_0x0201:
            r4 = r5
        L_0x0202:
            r20.readString()
            r4.a((android.app.PendingIntent) r5)
            goto L_0x024f
        L_0x0209:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x0221
            android.os.IInterface r4 = r1.queryLocalInterface(r4)
            boolean r5 = r4 instanceof defpackage.yjp
            if (r5 == 0) goto L_0x021b
            r5 = r4
            yjp r5 = (defpackage.yjp) r5
            goto L_0x0222
        L_0x021b:
            yjn r5 = new yjn
            r5.<init>(r1)
            goto L_0x0222
        L_0x0221:
        L_0x0222:
            android.content.Context r1 = r0.a
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            r6 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r1, r3, r4, r6)
            r5.a((android.app.PendingIntent) r1)
            goto L_0x024f
        L_0x0233:
            android.os.IBinder r1 = r20.readStrongBinder()
            if (r1 == 0) goto L_0x024b
            android.os.IInterface r3 = r1.queryLocalInterface(r4)
            boolean r4 = r3 instanceof defpackage.yjp
            if (r4 == 0) goto L_0x0245
            r5 = r3
            yjp r5 = (defpackage.yjp) r5
            goto L_0x024c
        L_0x0245:
            yjn r5 = new yjn
            r5.<init>(r1)
            goto L_0x024c
        L_0x024b:
        L_0x024c:
            r5.b()
        L_0x024f:
            r21.writeNoException()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yjr.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
