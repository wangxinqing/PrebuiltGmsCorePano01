package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* renamed from: aeej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aeej {
    public static ContentResolver a = null;
    protected final String b;
    protected final Object c;

    protected aeej(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static aeej a(String str) {
        return new aeeh(str, false);
    }

    public abstract Object a();

    public static void a(Context context) {
        a = context.getContentResolver();
    }
}
