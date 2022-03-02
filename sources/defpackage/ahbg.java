package defpackage;

import java.io.Closeable;
import java.nio.channels.FileLock;

/* renamed from: ahbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahbg implements Closeable {
    private FileLock a;

    public ahbg(FileLock fileLock) {
        this.a = fileLock;
    }

    public final void close() {
        FileLock fileLock = this.a;
        if (fileLock != null) {
            fileLock.release();
            this.a = null;
        }
    }
}
