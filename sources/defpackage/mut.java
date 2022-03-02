package defpackage;

import java.io.File;
import java.util.Comparator;

/* renamed from: mut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mut implements Comparator {
    static final Comparator a = new mut();

    private mut() {
    }

    public final int compare(Object obj, Object obj2) {
        return (((File) obj).lastModified() > ((File) obj2).lastModified() ? 1 : (((File) obj).lastModified() == ((File) obj2).lastModified() ? 0 : -1));
    }
}
