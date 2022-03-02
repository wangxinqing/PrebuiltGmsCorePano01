package defpackage;

import android.os.Process;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: jjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jjh {
    public static void a(List list) {
        if (Process.is64Bit()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((File) it.next()).getName().contains("64")) {
                    it.remove();
                }
            }
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((File) it2.next()).getName().contains("64")) {
                it2.remove();
            }
        }
    }
}
