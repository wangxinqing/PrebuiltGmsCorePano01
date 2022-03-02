package defpackage;

import java.io.File;
import java.util.Iterator;

/* renamed from: huq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class huq implements Iterable {
    public final File a;
    public final String[] b;
    private boolean c = false;

    private huq(String[] strArr, File file) {
        this.b = strArr;
        this.a = file;
    }

    static huq a(File file) {
        return new huq(file.list(), file);
    }

    public final Iterator iterator() {
        if (!this.c) {
            this.c = true;
            return new hup(this);
        }
        throw new IllegalStateException("Already consumed this FileIterable");
    }
}
