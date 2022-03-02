package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* renamed from: ahbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahbr extends ahbv implements ahaw, ahav, ahbo {
    private final FileOutputStream a;
    private final File b;

    public ahbr(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    public final void a() {
        this.a.getFD().sync();
    }

    public final FileChannel b() {
        return this.a.getChannel();
    }

    public final File c() {
        return this.b;
    }
}
