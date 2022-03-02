package defpackage;

import android.os.PatternMatcher;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: iny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iny implements FilenameFilter {
    final /* synthetic */ PatternMatcher a;

    public iny(PatternMatcher patternMatcher) {
        this.a = patternMatcher;
    }

    public final boolean accept(File file, String str) {
        return this.a.match(str);
    }
}
