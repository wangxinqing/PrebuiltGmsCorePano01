package defpackage;

import android.os.Build;
import java.util.Objects;

/* renamed from: op  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class op {
    public static boolean a(Object obj, Object obj2) {
        int i = Build.VERSION.SDK_INT;
        return Objects.equals(obj, obj2);
    }
}
