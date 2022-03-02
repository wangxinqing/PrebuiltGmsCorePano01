package defpackage;

import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: ahye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahye {
    public ajaa h;
    public aiab i;
    public volatile boolean j;
    public int k;
    public File l;
    protected File[] m;

    public final void a(ajaa ajaa, aiab aiab, String str) {
        if (str.isEmpty() || !str.equals(str.replaceAll("[^A-Za-z0-9]", ""))) {
            throw new IllegalArgumentException("The cache directory name must be non-empty and only alpha numeric.");
        }
        this.j = false;
        this.h = ajaa;
        File b = ajaa.b();
        if (b != null) {
            this.h.f().execute(new ahyc(this, aiab, b, str));
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr);

    public final void b() {
        this.h.f().execute(new ahyd(this));
    }

    public final void c() {
        ahyp.b(this.m[0]);
    }

    public final void b(byte[] bArr) {
        if (ahyp.a(this.l)) {
            File file = this.m[0];
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            try {
                this.i.a(dataOutputStream, bArr);
                ahyp.a((Closeable) fileOutputStream);
                ahyp.a((Closeable) dataOutputStream);
            } catch (IOException e) {
                ahyp.b(file);
                throw e;
            } catch (Throwable th) {
                ahyp.a((Closeable) fileOutputStream);
                ahyp.a((Closeable) dataOutputStream);
                throw th;
            }
        } else {
            throw new IOException("Cache directory can not be validated.");
        }
    }
}
