package defpackage;

import java.io.File;
import java.util.Comparator;

/* renamed from: ngl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ngl implements Comparator {
    private static final int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            ngz.a("FontDisk", "Invalid directory with version %s exists under directoryDir", str);
            return -1;
        }
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return a(((File) obj2).getName()) - a(((File) obj).getName());
    }
}
