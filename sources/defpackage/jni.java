package defpackage;

import android.content.Context;

/* renamed from: jni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jni {
    public static jni a = new jni();
    private jnh b = null;

    public static jnh b(Context context) {
        return a.a(context);
    }

    public synchronized jnh a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new jnh(context);
        }
        return this.b;
    }
}
