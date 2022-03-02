package defpackage;

import java.io.File;
import java.io.FileFilter;

/* renamed from: ngk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ngk implements FileFilter {
    public static final FileFilter a = new ngk();

    private ngk() {
    }

    public final boolean accept(File file) {
        return file.isDirectory();
    }
}
