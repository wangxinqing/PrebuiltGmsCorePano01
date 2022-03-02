package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* renamed from: ahbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahbq extends ahbu implements ahaw, ahav, ahbn {
    private final FileInputStream a;
    private final File b;

    public ahbq(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    public final Long a() {
        return Long.valueOf(this.a.getChannel().size());
    }

    public final FileChannel b() {
        return this.a.getChannel();
    }

    public final File c() {
        return this.b;
    }
}
