package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/* renamed from: khx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khx {
    public static final ith a = new ith("ContentManager", "");
    public final kkb b;
    public final kkf c;
    public final jiq d;
    public final lrs e;

    public khx(kkb kkb, kkf kkf, jiq jiq, lrs lrs) {
        iva.a((Object) kkb);
        this.b = kkb;
        iva.a((Object) kkf);
        this.c = kkf;
        iva.a((Object) jiq);
        this.d = jiq;
        iva.a((Object) lrs);
        this.e = lrs;
    }

    public final ParcelFileDescriptor a(String str) {
        String uuid;
        FileOutputStream fileOutputStream;
        knh d2 = this.c.d(str);
        FileInputStream fileInputStream = null;
        if (d2 == null) {
            return null;
        }
        try {
            if (d2.b == null) {
                uuid = UUID.randomUUID().toString();
                this.c.e(uuid);
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(a(d2.c, 1));
                    try {
                        fileOutputStream = new FileOutputStream(a(uuid, 0));
                        try {
                            lrk.a(d2.d, fileInputStream2, fileOutputStream);
                            jjt.a((Closeable) fileInputStream2);
                            jjt.a((Closeable) fileOutputStream);
                            d2.a(uuid);
                            d2.t();
                            this.c.f(uuid);
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            jjt.a((Closeable) fileInputStream);
                            jjt.a((Closeable) fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                        fileInputStream = fileInputStream2;
                        jjt.a((Closeable) fileInputStream);
                        jjt.a((Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                    jjt.a((Closeable) fileInputStream);
                    jjt.a((Closeable) fileOutputStream);
                    throw th;
                }
            }
            d2.e = System.currentTimeMillis();
            d2.t();
            return ParcelFileDescriptor.open(a(d2.b, 0), 268435456);
        } catch (lrn e2) {
            throw new IOException(e2);
        } catch (Throwable th4) {
            this.c.f(uuid);
            throw th4;
        }
    }

    public final lsr b(String str) {
        knh d2 = this.c.d(str);
        if (d2 == null) {
            return null;
        }
        String str2 = d2.b;
        if (str2 != null) {
            return new lsr(new FileInputStream(a(str2, 0)), d2.f);
        }
        try {
            return new lsr(lrk.a(d2.d, (InputStream) new FileInputStream(a(d2.c, 1))), d2.f);
        } catch (lrn e2) {
            throw new IOException(e2);
        }
    }

    public final File a(String str, int i) {
        if (i == 0) {
            return new File(this.e.e(), str);
        }
        File f = this.e.f();
        if (f != null) {
            return new File(f, str);
        }
        throw new IOException("Cannot get path for a file on encrypted shared storage because shared storage is not available.");
    }

    public final kie a() {
        return a(536870912);
    }

    public final kie a(int i) {
        boolean z = true;
        if (!(i == 536870912 || i == 805306368)) {
            z = false;
        }
        iva.b(z, "Invalid file mode provided!");
        String uuid = UUID.randomUUID().toString();
        File a2 = a(uuid, 0);
        this.c.e(uuid);
        if (a2.createNewFile()) {
            return new kie(this.b, this.c, this.d, this, uuid, i);
        }
        boolean exists = a2.exists();
        if (!exists) {
            this.c.f(uuid);
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Failed to create a new file, exists=");
        sb.append(exists);
        throw new IOException(sb.toString());
    }

    public final boolean a(kmp kmp) {
        if (!kmp.am()) {
            return false;
        }
        a.b("Entry reports up-to-date content, relying on content existing");
        String q = kmp.q();
        knh d2 = this.c.d(q);
        if (d2 == null) {
            a.b("Content with hash %s missing from database", q);
            return false;
        }
        try {
            String str = d2.b;
            if (str != null) {
                return a(str, 0).exists();
            }
            return a(d2.c, 1).exists();
        } catch (IOException e2) {
            a.b("ContentManager", String.format("Content with hash %s was deleted outside of ContentManager.", new Object[]{q}), (Throwable) e2);
            return false;
        }
    }
}
