package defpackage;

import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bor {
    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return Process.is64Bit();
        }
        int i = Build.VERSION.SDK_INT;
        for (String equals : Build.SUPPORTED_64_BIT_ABIS) {
            if (equals.equals(Build.CPU_ABI)) {
                return true;
            }
        }
        return false;
    }

    public static List b() {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (a()) {
            Collections.addAll(arrayList, Build.SUPPORTED_64_BIT_ABIS);
        } else {
            Collections.addAll(arrayList, Build.SUPPORTED_32_BIT_ABIS);
        }
        return arrayList;
    }
}
