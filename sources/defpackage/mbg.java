package defpackage;

import java.io.File;

/* renamed from: mbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mbg {
    public final File a;
    public final File b;
    public final File c;

    public mbg(File file, File file2, File file3) {
        this.a = file;
        this.b = file2;
        this.c = file3;
    }

    public static mbg a(File file) {
        return new mbg(file, (File) null, (File) null);
    }

    public final boolean b() {
        File file;
        if (!this.a.isFile() || (file = this.b) == null || !file.isDirectory()) {
            return false;
        }
        return true;
    }

    public final File a() {
        return this.a.getParentFile();
    }
}
