package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Set;

/* renamed from: lki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lki implements FilenameFilter {
    final /* synthetic */ Set a;

    public lki(Set set) {
        this.a = set;
    }

    public final boolean accept(File file, String str) {
        if (str.length() < 36) {
            return true;
        }
        if (!this.a.contains(str.substring(0, 36))) {
            return true;
        }
        return false;
    }
}
