package defpackage;

import android.content.Context;

/* renamed from: lww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lww {
    public static lww a;

    public static final lsy a(Context context) {
        return new lsy(context);
    }

    public static final jbs b(Context context) {
        return new jbs(context);
    }

    public static final ltb c(Context context) {
        return new ltb(context);
    }

    public static final ltp d(Context context) {
        return new ltp(context);
    }

    public static final lts e(Context context) {
        return new lts(context);
    }

    public static final luu f(Context context) {
        return new luu(context);
    }

    public static final lwf g(Context context) {
        return new lwf(context);
    }

    public static final lvy h(Context context) {
        return new lvy(context);
    }

    public static synchronized void a() {
        synchronized (lww.class) {
            if (a == null) {
                a = new lww();
            }
        }
    }
}
