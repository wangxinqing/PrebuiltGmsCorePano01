package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: annj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class annj implements FilenameFilter {
    private final Pattern a;

    public annj(Pattern pattern) {
        amrl.a((Object) pattern);
        this.a = pattern;
    }

    public final boolean accept(File file, String str) {
        return this.a.matcher(str).matches();
    }
}
