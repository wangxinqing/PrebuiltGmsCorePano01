package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: jbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jbt implements FilenameFilter {
    public final boolean accept(File file, String str) {
        return str.endsWith("alarms");
    }
}
