package defpackage;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: ahys  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahys {
    public final oc a;
    public final int b;
    public final aiab c;

    public ahys(int i, File file, aiab aiab) {
        this.b = i;
        this.c = aiab;
        this.a = new oc(file);
    }

    public final audx a(auef auef) {
        DataInputStream dataInputStream;
        oc ocVar = this.a;
        if (ocVar.b.exists()) {
            ocVar.a.delete();
            ocVar.b.renameTo(ocVar.a);
        }
        FileInputStream fileInputStream = new FileInputStream(ocVar.a);
        if (this.c != null) {
            try {
                dataInputStream = new DataInputStream(fileInputStream);
                try {
                    int readUnsignedShort = dataInputStream.readUnsignedShort();
                    int i = this.b;
                    if (readUnsignedShort == i) {
                        audx audx = (audx) auef.a(this.c.a(dataInputStream).b);
                        ajre.a((Closeable) null);
                        ajre.a((Closeable) dataInputStream);
                        return audx;
                    }
                    throw new IOException(String.format("Invalid version, desired = %d, actual = %d", new Object[]{Integer.valueOf(i), Integer.valueOf(readUnsignedShort)}));
                } catch (Throwable th) {
                    th = th;
                    ajre.a((Closeable) null);
                    ajre.a((Closeable) dataInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = null;
                ajre.a((Closeable) null);
                ajre.a((Closeable) dataInputStream);
                throw th;
            }
        } else {
            throw new IOException("No cipher specified.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ea A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.audx r5) {
        /*
            r4 = this;
            java.lang.String r0 = "AtomicFile"
            oc r1 = r4.a     // Catch:{ IOException -> 0x00ca }
            java.io.File r2 = r1.a     // Catch:{ IOException -> 0x00ca }
            boolean r2 = r2.exists()     // Catch:{ IOException -> 0x00ca }
            if (r2 != 0) goto L_0x000d
            goto L_0x0045
        L_0x000d:
            java.io.File r2 = r1.b     // Catch:{ IOException -> 0x00ca }
            boolean r2 = r2.exists()     // Catch:{ IOException -> 0x00ca }
            if (r2 != 0) goto L_0x0040
            java.io.File r2 = r1.a     // Catch:{ IOException -> 0x00ca }
            java.io.File r3 = r1.b     // Catch:{ IOException -> 0x00ca }
            boolean r2 = r2.renameTo(r3)     // Catch:{ IOException -> 0x00ca }
            if (r2 != 0) goto L_0x0045
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ca }
            r2.<init>()     // Catch:{ IOException -> 0x00ca }
            java.lang.String r3 = "Couldn't rename file "
            r2.append(r3)     // Catch:{ IOException -> 0x00ca }
            java.io.File r3 = r1.a     // Catch:{ IOException -> 0x00ca }
            r2.append(r3)     // Catch:{ IOException -> 0x00ca }
            java.lang.String r3 = " to backup file "
            r2.append(r3)     // Catch:{ IOException -> 0x00ca }
            java.io.File r3 = r1.b     // Catch:{ IOException -> 0x00ca }
            r2.append(r3)     // Catch:{ IOException -> 0x00ca }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x00ca }
            android.util.Log.w(r0, r2)     // Catch:{ IOException -> 0x00ca }
            goto L_0x0045
        L_0x0040:
            java.io.File r2 = r1.a     // Catch:{ IOException -> 0x00ca }
            r2.delete()     // Catch:{ IOException -> 0x00ca }
        L_0x0045:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x004d }
            java.io.File r3 = r1.a     // Catch:{ FileNotFoundException -> 0x004d }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x004d }
            goto L_0x0061
        L_0x004d:
            r2 = move-exception
            java.io.File r2 = r1.a     // Catch:{ IOException -> 0x00ca }
            java.io.File r2 = r2.getParentFile()     // Catch:{ IOException -> 0x00ca }
            boolean r2 = r2.mkdirs()     // Catch:{ IOException -> 0x00ca }
            if (r2 == 0) goto L_0x00b1
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0097 }
            java.io.File r3 = r1.a     // Catch:{ FileNotFoundException -> 0x0097 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0097 }
        L_0x0061:
            aiab r1 = r4.c     // Catch:{ IOException -> 0x0095 }
            if (r1 == 0) goto L_0x008d
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0095 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0095 }
            int r3 = r4.b     // Catch:{ IOException -> 0x0095 }
            r1.writeShort(r3)     // Catch:{ IOException -> 0x0095 }
            byte[] r5 = r5.k()     // Catch:{ IOException -> 0x0095 }
            aiab r3 = r4.c     // Catch:{ IOException -> 0x0095 }
            r3.a((java.io.DataOutputStream) r1, (byte[]) r5)     // Catch:{ IOException -> 0x0095 }
            oc r5 = r4.a     // Catch:{ IOException -> 0x0095 }
            defpackage.oc.a(r2)     // Catch:{ IOException -> 0x0095 }
            r2.close()     // Catch:{ IOException -> 0x0086 }
            java.io.File r5 = r5.b     // Catch:{ IOException -> 0x0086 }
            r5.delete()     // Catch:{ IOException -> 0x0086 }
            return
        L_0x0086:
            r5 = move-exception
            java.lang.String r1 = "finishWrite: Got exception:"
            android.util.Log.w(r0, r1, r5)     // Catch:{ IOException -> 0x0095 }
            return
        L_0x008d:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ IOException -> 0x0095 }
            java.lang.String r1 = "No cipher specified."
            r5.<init>(r1)     // Catch:{ IOException -> 0x0095 }
            throw r5     // Catch:{ IOException -> 0x0095 }
        L_0x0095:
            r5 = move-exception
            goto L_0x00cc
        L_0x0097:
            r5 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch:{ IOException -> 0x00ca }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ca }
            r2.<init>()     // Catch:{ IOException -> 0x00ca }
            java.lang.String r3 = "Couldn't create "
            r2.append(r3)     // Catch:{ IOException -> 0x00ca }
            java.io.File r1 = r1.a     // Catch:{ IOException -> 0x00ca }
            r2.append(r1)     // Catch:{ IOException -> 0x00ca }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x00ca }
            r5.<init>(r1)     // Catch:{ IOException -> 0x00ca }
            throw r5     // Catch:{ IOException -> 0x00ca }
        L_0x00b1:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ IOException -> 0x00ca }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ca }
            r2.<init>()     // Catch:{ IOException -> 0x00ca }
            java.lang.String r3 = "Couldn't create directory "
            r2.append(r3)     // Catch:{ IOException -> 0x00ca }
            java.io.File r1 = r1.a     // Catch:{ IOException -> 0x00ca }
            r2.append(r1)     // Catch:{ IOException -> 0x00ca }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x00ca }
            r5.<init>(r1)     // Catch:{ IOException -> 0x00ca }
            throw r5     // Catch:{ IOException -> 0x00ca }
        L_0x00ca:
            r5 = move-exception
            r2 = 0
        L_0x00cc:
            if (r2 == 0) goto L_0x00ea
            oc r5 = r4.a
            defpackage.oc.a(r2)
            r2.close()     // Catch:{ IOException -> 0x00e3 }
            java.io.File r1 = r5.a     // Catch:{ IOException -> 0x00e3 }
            r1.delete()     // Catch:{ IOException -> 0x00e3 }
            java.io.File r1 = r5.b     // Catch:{ IOException -> 0x00e3 }
            java.io.File r5 = r5.a     // Catch:{ IOException -> 0x00e3 }
            r1.renameTo(r5)     // Catch:{ IOException -> 0x00e3 }
            return
        L_0x00e3:
            r5 = move-exception
            java.lang.String r1 = "failWrite: Got exception:"
            android.util.Log.w(r0, r1, r5)
            return
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahys.a(audx):void");
    }
}
