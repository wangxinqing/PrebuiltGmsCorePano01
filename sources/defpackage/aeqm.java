package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: aeqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeqm implements FilenameFilter {
    private final Pattern a;

    public aeqm(Pattern pattern) {
        this.a = pattern;
    }

    public final boolean accept(File file, String str) {
        return this.a.matcher(str).matches();
    }
}
