package defpackage;

import java.io.File;

/* renamed from: ammk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ammk extends ammi {
    public final File a;
    public final long b;

    public ammk(File file) {
        this.a = file;
        this.b = file.length();
    }

    public final long a() {
        return this.b;
    }
}
