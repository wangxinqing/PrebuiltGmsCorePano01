package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: blm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class blm implements FilenameFilter {
    public static final FilenameFilter a = new blm();

    private blm() {
    }

    public final boolean accept(File file, String str) {
        ReadWriteLock readWriteLock = blu.e;
        return str.endsWith(".apk");
    }
}
