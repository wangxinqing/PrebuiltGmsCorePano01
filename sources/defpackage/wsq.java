package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: wsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wsq {
    public static boolean b(Context context) {
        return ((long) ((ActivityManager) context.getSystemService("activity")).getMemoryClass()) >= aywy.a.a().cO();
    }

    public static final int a(Context context) {
        if (((long) ((ActivityManager) context.getSystemService("activity")).getMemoryClass()) >= aywy.a.a().al()) {
            return (int) aywy.a.a().cd();
        }
        return (int) aywy.a.a().ce();
    }
}
