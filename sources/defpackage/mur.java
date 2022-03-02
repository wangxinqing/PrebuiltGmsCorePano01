package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: mur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mur implements FilenameFilter {
    static final FilenameFilter a = new mur();

    private mur() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith("anr_");
    }
}
