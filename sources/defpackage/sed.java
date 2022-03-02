package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;

/* renamed from: sed  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sed extends nis {
    private final OpenFileDescriptorRequest a;
    private final tbw b;
    private final sdw c;
    private final String d;
    private final see e;
    private final agzt f;

    public sed(OpenFileDescriptorRequest openFileDescriptorRequest, tbw tbw, sdw sdw, String str, see see, agzt agzt) {
        super(160, "OpenFileDescriptorOperation");
        this.a = openFileDescriptorRequest;
        this.b = tbw;
        this.c = sdw;
        this.d = str;
        this.e = see;
        this.f = agzt;
    }

    private final void a() {
        afsh.b("%s: file not found: %s", (Object) "MobStore.OpenFileDescriptorOperation", (Object) this.a.a);
        String valueOf = String.valueOf(this.a.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("File not found: ");
        sb.append(valueOf);
        this.b.a(new Status(33500, sb.toString()), (OpenFileDescriptorResponse) null);
        a(this.a.b, 6);
    }

    private final void a(int i, int i2) {
        a(i, i2, ampu.a);
    }

    private final void a(int i, int i2, amri amri) {
        int i3;
        if (i != 0) {
            i3 = i != 1 ? 2 : 4;
        } else {
            i3 = 3;
        }
        aucd o = aokq.f.o();
        String str = this.d;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aokq aokq = (aokq) o.b;
        str.getClass();
        aokq.a = 1 | aokq.a;
        aokq.b = str;
        aokq.c = aonb.a(i2);
        aokq.a |= 2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aokq aokq2 = (aokq) o.b;
        aokq2.d = aomz.a(i3);
        aokq2.a |= 4;
        if (amri.a()) {
            long longValue = ((Long) amri.b()).longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aokq aokq3 = (aokq) o.b;
            aokq3.a |= 8;
            aokq3.e = longValue;
        }
        this.c.a((aokq) o.i());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011f, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0120, code lost:
        r10.b.a(r11.a, (com.google.android.gms.mobstore.OpenFileDescriptorResponse) null);
        a(r10.a.b, r11.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0130, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011f A[Catch:{ RemoteException -> 0x0105 }, ExcHandler: sef (r11v1 'e' sef A[CUSTOM_DECLARE, Catch:{ RemoteException -> 0x0105 }]), Splitter:B:1:0x0007] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r11) {
        /*
            r10 = this;
            java.lang.String r0 = "MobStore.OpenFileDescriptorOperation"
            r1 = 0
            r2 = 10
            r3 = 1
            r4 = 0
            com.google.android.gms.mobstore.OpenFileDescriptorRequest r5 = r10.a     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            android.net.Uri r5 = r5.a     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            defpackage.seh.a(r5, r11)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            com.google.android.gms.mobstore.OpenFileDescriptorRequest r5 = r10.a     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            int r6 = r5.b     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            r7 = 5
            if (r6 != 0) goto L_0x0027
            see r6 = r10.e     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            android.net.Uri r5 = r5.a     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            ost r8 = defpackage.see.b(r5)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            oss r8 = r8.b     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            if (r8 != 0) goto L_0x0023
            oss r8 = defpackage.oss.c     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
        L_0x0023:
            r6.a(r8, r5)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            goto L_0x0030
        L_0x0027:
            if (r6 != r3) goto L_0x00d2
            see r6 = r10.e     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            android.net.Uri r5 = r5.a     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            r6.a(r5)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
        L_0x0030:
            agzt r5 = r10.f     // Catch:{ ahbk -> 0x00c4, sef -> 0x011f }
            ahab r11 = defpackage.ahab.a(r11, r5)     // Catch:{ ahbk -> 0x00c4, sef -> 0x011f }
            com.google.android.gms.mobstore.OpenFileDescriptorRequest r5 = r10.a     // Catch:{ ahbk -> 0x00c4, sef -> 0x011f }
            android.net.Uri r5 = r5.a     // Catch:{ ahbk -> 0x00c4, sef -> 0x011f }
            java.io.File r11 = r11.b(r5)     // Catch:{ ahbk -> 0x00c4, sef -> 0x011f }
            ampu r5 = defpackage.ampu.a     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            com.google.android.gms.mobstore.OpenFileDescriptorRequest r6 = r10.a     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            int r6 = r6.b     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            if (r6 != 0) goto L_0x0055
            long r5 = r11.length()     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            amri r5 = defpackage.amri.b(r5)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0062
        L_0x0055:
            if (r6 != r3) goto L_0x0061
            java.io.File r6 = r11.getParentFile()     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            r6.mkdirs()     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            r6 = 738197504(0x2c000000, float:1.8189894E-12)
            goto L_0x0062
        L_0x0061:
            r6 = 0
        L_0x0062:
            android.os.ParcelFileDescriptor r6 = android.os.ParcelFileDescriptor.open(r11, r6)     // Catch:{ FileNotFoundException -> 0x007b }
            com.google.android.gms.mobstore.OpenFileDescriptorResponse r8 = new com.google.android.gms.mobstore.OpenFileDescriptorResponse     // Catch:{ FileNotFoundException -> 0x007b }
            r8.<init>(r6)     // Catch:{ FileNotFoundException -> 0x007b }
            tbw r6 = r10.b     // Catch:{ FileNotFoundException -> 0x007b }
            com.google.android.gms.common.api.Status r9 = com.google.android.gms.common.api.Status.a     // Catch:{ FileNotFoundException -> 0x007b }
            r6.a(r9, r8)     // Catch:{ FileNotFoundException -> 0x007b }
            com.google.android.gms.mobstore.OpenFileDescriptorRequest r6 = r10.a     // Catch:{ FileNotFoundException -> 0x007b }
            int r6 = r6.b     // Catch:{ FileNotFoundException -> 0x007b }
            r8 = 3
            r10.a(r6, r8, r5)     // Catch:{ FileNotFoundException -> 0x007b }
            return
        L_0x007b:
            r5 = move-exception
            boolean r11 = r11.exists()     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            if (r11 == 0) goto L_0x00c0
            java.lang.String r11 = "%s: file can not be opened with the requested mode: %s"
            com.google.android.gms.mobstore.OpenFileDescriptorRequest r5 = r10.a     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            android.net.Uri r5 = r5.a     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            defpackage.afsh.b((java.lang.String) r11, (java.lang.Object) r0, (java.lang.Object) r5)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            com.google.android.gms.common.api.Status r11 = new com.google.android.gms.common.api.Status     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            com.google.android.gms.mobstore.OpenFileDescriptorRequest r5 = r10.a     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            android.net.Uri r5 = r5.a     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            int r6 = r6.length()     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            int r6 = r6 + 22
            r8.<init>(r6)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            java.lang.String r6 = "Access denied to uri: "
            r8.append(r6)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            r8.append(r5)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            java.lang.String r5 = r8.toString()     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            r11.<init>(r2, r5)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            tbw r5 = r10.b     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            r5.a(r11, r4)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            com.google.android.gms.mobstore.OpenFileDescriptorRequest r11 = r10.a     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            int r11 = r11.b     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            r10.a(r11, r7)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            return
        L_0x00c0:
            r10.a()     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            return
        L_0x00c4:
            r11 = move-exception
            java.lang.Throwable r5 = r11.getCause()     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            boolean r5 = r5 instanceof defpackage.ahbf     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            if (r5 == 0) goto L_0x00d1
            r10.a()     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            return
        L_0x00d1:
            throw r11     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
        L_0x00d2:
            tbw r11 = r10.b     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            com.google.android.gms.common.api.Status r6 = new com.google.android.gms.common.api.Status     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            android.net.Uri r5 = r5.a     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            int r8 = r8.length()     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            int r8 = r8 + 31
            r9.<init>(r8)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            java.lang.String r8 = "Open Type not supported (yet): "
            r9.append(r8)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            r9.append(r5)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            java.lang.String r5 = r9.toString()     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            r6.<init>(r2, r5)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            r11.a(r6, r4)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            com.google.android.gms.mobstore.OpenFileDescriptorRequest r11 = r10.a     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            int r11 = r11.b     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            r10.a(r11, r7)     // Catch:{ sef -> 0x011f, ahbk -> 0x0107 }
            return
        L_0x0105:
            r11 = move-exception
            goto L_0x0131
        L_0x0107:
            r11 = move-exception
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status     // Catch:{ RemoteException -> 0x0105 }
            java.lang.String r11 = r11.getMessage()     // Catch:{ RemoteException -> 0x0105 }
            r5.<init>(r2, r11)     // Catch:{ RemoteException -> 0x0105 }
            tbw r11 = r10.b     // Catch:{ RemoteException -> 0x0105 }
            r11.a(r5, r4)     // Catch:{ RemoteException -> 0x0105 }
            com.google.android.gms.mobstore.OpenFileDescriptorRequest r11 = r10.a     // Catch:{ RemoteException -> 0x0105 }
            int r11 = r11.b     // Catch:{ RemoteException -> 0x0105 }
            r2 = 4
            r10.a(r11, r2)     // Catch:{ RemoteException -> 0x0105 }
            return
        L_0x011f:
            r11 = move-exception
            tbw r2 = r10.b     // Catch:{ RemoteException -> 0x0105 }
            com.google.android.gms.common.api.Status r5 = r11.a     // Catch:{ RemoteException -> 0x0105 }
            r2.a(r5, r4)     // Catch:{ RemoteException -> 0x0105 }
            com.google.android.gms.mobstore.OpenFileDescriptorRequest r2 = r10.a     // Catch:{ RemoteException -> 0x0105 }
            int r2 = r2.b     // Catch:{ RemoteException -> 0x0105 }
            int r11 = r11.b     // Catch:{ RemoteException -> 0x0105 }
            r10.a(r2, r11)     // Catch:{ RemoteException -> 0x0105 }
            return
        L_0x0131:
            com.google.android.gms.mobstore.OpenFileDescriptorRequest r2 = r10.a
            int r2 = r2.b
            r4 = 7
            r10.a(r2, r4)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r1] = r0
            java.lang.String r0 = "%s: Client died during OpenFileDescriptorOperation"
            defpackage.afsh.b((java.lang.Throwable) r11, (java.lang.String) r0, (java.lang.Object[]) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sed.a(android.content.Context):void");
    }

    public final void a(Status status) {
        afsh.c("%s: onFailure: %s", "MobStore.OpenFileDescriptorOperation", status);
        this.b.a(status, (OpenFileDescriptorResponse) null);
    }
}
