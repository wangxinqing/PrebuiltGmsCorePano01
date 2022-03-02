package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.util.LruCache;

/* renamed from: akfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akfs {
    public static akfs b;
    public static final Object c = new Object();
    public final LruCache a;

    static {
        qvj.b.d(5);
        qvj.b.d(1);
    }

    public akfs(Context context) {
        int memoryClass = ((ActivityManager) context.getSystemService("activity")).getMemoryClass() / 4;
        this.a = new akfq((memoryClass > 32 ? 32 : memoryClass) * 1048576);
        new akgb();
    }
}
