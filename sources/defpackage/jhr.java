package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Process;

/* renamed from: jhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jhr {
    public static jhp a = new jhp();

    public static jhr a(Context context) {
        return a.a(context);
    }

    public static jhr b(Context context) {
        if (jkr.i() && awyg.a.a().o()) {
            return new jhw(context);
        }
        if (jkr.h()) {
            return new jhv(context);
        }
        if (jkr.b()) {
            return new jhu(context);
        }
        int i = Build.VERSION.SDK_INT;
        if (context.checkPermission("android.permission.UPDATE_APP_OPS_STATS", Process.myPid(), Process.myUid()) == 0) {
            return new jhs(context);
        }
        return new jht();
    }

    @Deprecated
    public abstract int a(String str, int i, String str2);

    public abstract String a(String str);

    public abstract void a(String str, int i, String str2, String str3);

    public abstract void a(String str, int i, jhq jhq);

    public abstract void a(String str, jhq jhq);

    public abstract void a(jhq jhq);

    public abstract int b(String str, int i, String str2, String str3);

    @Deprecated
    public abstract void b(String str, int i, String str2);

    @Deprecated
    public abstract int c(String str, int i, String str2);

    public abstract int c(String str, int i, String str2, String str3);

    public abstract int d(String str, int i, String str2);

    public abstract int e(String str, int i, String str2);
}
