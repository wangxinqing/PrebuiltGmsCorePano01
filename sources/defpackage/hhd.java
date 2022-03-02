package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: hhd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hhd {
    aucd a;
    private final File b;
    private long c = -1;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hhd(java.io.File r6) {
        /*
            r5 = this;
            r5.<init>()
            r0 = -1
            r5.c = r0
            r5.b = r6
            boolean r2 = r6.isDirectory()
            java.lang.String r3 = "downloadstore"
            if (r2 != 0) goto L_0x001f
            defpackage.bma.a((java.io.File) r6)
            boolean r2 = r6.mkdir()
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = "Failed to create download dir"
            android.util.Log.e(r3, r2)
        L_0x001f:
            java.io.File r6 = a((java.io.File) r6)
            boolean r2 = r6.exists()
            if (r2 == 0) goto L_0x0083
            byte[] r6 = defpackage.bkq.a((java.io.File) r6)
            if (r6 == 0) goto L_0x0083
            aubs r2 = defpackage.aubs.b()     // Catch:{ auda -> 0x003c }
            hhf r4 = defpackage.hhf.d     // Catch:{ auda -> 0x003c }
            aucj r6 = defpackage.aucj.a((defpackage.aucj) r4, (byte[]) r6, (defpackage.aubs) r2)     // Catch:{ auda -> 0x003c }
            hhf r6 = (defpackage.hhf) r6     // Catch:{ auda -> 0x003c }
            goto L_0x005b
        L_0x003c:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r2 = "Failed to parse download store state: "
            int r4 = r6.length()
            if (r4 != 0) goto L_0x0053
            java.lang.String r6 = new java.lang.String
            r6.<init>(r2)
            goto L_0x0057
        L_0x0053:
            java.lang.String r6 = r2.concat(r6)
        L_0x0057:
            android.util.Log.e(r3, r6)
            r6 = 0
        L_0x005b:
            if (r6 == 0) goto L_0x0083
            int r2 = r6.b
            r4 = 1
            if (r2 != r4) goto L_0x006d
            r2 = 5
            java.lang.Object r2 = r6.c(r2)
            aucd r2 = (defpackage.aucd) r2
            r2.a((defpackage.aucj) r6)
            goto L_0x0087
        L_0x006d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r4 = 68
            r6.<init>(r4)
            java.lang.String r4 = "Discarding download store state with unexpected version: "
            r6.append(r4)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            android.util.Log.i(r3, r6)
        L_0x0083:
            aucd r2 = c()
        L_0x0087:
            r5.a = r2
            aucj r6 = r2.b
            hhf r6 = (defpackage.hhf) r6
            aucx r6 = r6.c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x00a2
            aucd r2 = r5.a
            int r6 = r6 + -1
            hhe r6 = r2.p((int) r6)
            long r2 = r6.b
            long r2 = r2 + r0
            r5.c = r2
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhd.<init>(java.io.File):void");
    }

    private static File a(File file) {
        return new File(file, "download_store.pb");
    }

    private static aucd c() {
        aucd o = hhf.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        hhf hhf = (hhf) o.b;
        hhf.a |= 1;
        hhf.b = 1;
        return o;
    }

    private final int e(long j) {
        for (int i = 0; i < ((hhf) this.a.b).c.size(); i++) {
            if (j == this.a.p(i).b) {
                return i;
            }
        }
        return -1;
    }

    public final synchronized void b() {
        File[] listFiles = this.b.listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
        aucd c2 = c();
        this.a = c2;
        a(c2);
    }

    public final synchronized void d(long j) {
        int e = e(j);
        if (e != -1) {
            hhe p = this.a.p(e);
            aucd aucd = this.a;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            hhf hhf = (hhf) aucd.b;
            hhf hhf2 = hhf.d;
            hhf.a();
            hhf.c.remove(e);
            String str = p.d;
            if (!awxo.g() && a(str) == null) {
                new File(this.b, str).delete();
            }
            a(this.a);
            return;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Deleting a non-exisitent reocrd: ");
        sb.append(j);
        sb.toString();
    }

    private final boolean a(aucd aucd) {
        boolean z = false;
        if (bkq.a(((hhf) aucd.i()).k(), new File(this.b, "pending_download_store.pb"), a(this.b), false) > 0) {
            z = true;
        }
        if (!z) {
            Log.e("downloadstore", "Failed to write state");
        }
        return z;
    }

    public final synchronized boolean b(long j) {
        int e = e(j);
        if (e == -1) {
            return false;
        }
        hhe p = this.a.p(e);
        aucd aucd = this.a;
        aucd aucd2 = (aucd) p.c(5);
        aucd2.a((aucj) p);
        int i = p.g + 1;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        hhe hhe = (hhe) aucd2.b;
        hhe hhe2 = hhe.m;
        hhe.a |= 32;
        hhe.g = i;
        aucd.a(e, aucd2);
        return a(this.a);
    }

    public final synchronized ParcelFileDescriptor c(long j) {
        int e;
        e = e(j);
        if (e != -1) {
        } else {
            StringBuilder sb = new StringBuilder(37);
            sb.append("No record for id ");
            sb.append(j);
            throw new FileNotFoundException(sb.toString());
        }
        return ParcelFileDescriptor.open(new File(this.b, this.a.p(e).d), 268435456);
    }

    public final synchronized hhe a(long j) {
        for (hhe hhe : Collections.unmodifiableList(((hhf) this.a.b).c)) {
            if (j == hhe.b) {
                return hhe;
            }
        }
        return null;
    }

    public final synchronized hhe a(String str) {
        for (hhe hhe : Collections.unmodifiableList(((hhf) this.a.b).c)) {
            if (str.equals(hhe.d)) {
                return hhe;
            }
        }
        return null;
    }

    public final synchronized hhe a(String str, String str2, boolean z, boolean z2, long j, long j2, boolean z3, int i) {
        synchronized (this) {
            aucd o = hhe.m.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            hhe hhe = (hhe) o.b;
            str2.getClass();
            int i2 = hhe.a | 4;
            hhe.a = i2;
            hhe.d = str2;
            str.getClass();
            int i3 = i2 | 2;
            hhe.a = i3;
            hhe.c = str;
            long j3 = this.c;
            this.c = -1 + j3;
            int i4 = i3 | 1;
            hhe.a = i4;
            hhe.b = j3;
            int i5 = i4 | 8;
            hhe.a = i5;
            hhe.e = 2;
            int i6 = i5 | 16;
            hhe.a = i6;
            hhe.f = z;
            int i7 = i6 | 64;
            hhe.a = i7;
            hhe.h = j2;
            int i8 = i7 | 128;
            hhe.a = i8;
            hhe.i = z2;
            int i9 = i8 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            hhe.a = i9;
            hhe.j = j;
            int i10 = i9 | 1024;
            hhe.a = i10;
            hhe.l = z3;
            hhe.a = i10 | 512;
            hhe.k = i;
            hhe hhe2 = (hhe) o.i();
            aucd aucd = this.a;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            hhf hhf = (hhf) aucd.b;
            hhf hhf2 = hhf.d;
            hhe2.getClass();
            hhf.a();
            hhf.c.add(hhe2);
            if (!a(this.a)) {
                return null;
            }
            return hhe2;
        }
    }

    public final synchronized List a() {
        return Collections.unmodifiableList(((hhf) this.a.b).c);
    }

    public final synchronized Map a(Set set, long... jArr) {
        nz nzVar;
        nzVar = new nz(r0);
        for (long j : jArr) {
            hhe a2 = a(j);
            if (a2 == null) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("No such record: ");
                sb.append(j);
                Log.w("downloadstore", sb.toString());
            } else {
                int i = a2.e;
                Long valueOf = Long.valueOf(j);
                if (!set.contains(valueOf)) {
                    if (i != 8) {
                        i = 16;
                    }
                }
                nzVar.put(valueOf, Integer.valueOf(i));
            }
        }
        return nzVar;
    }

    public final synchronized void a(long j, int i, long j2) {
        int e = e(j);
        if (e != -1) {
            hhe p = this.a.p(e);
            aucd aucd = this.a;
            aucd aucd2 = (aucd) p.c(5);
            aucd2.a((aucj) p);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            hhe hhe = (hhe) aucd2.b;
            hhe hhe2 = hhe.m;
            int i2 = hhe.a | 8;
            hhe.a = i2;
            hhe.e = i;
            hhe.a = i2 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            hhe.j = j2;
            aucd.a(e, aucd2);
            a(this.a);
        }
    }
}
