package defpackage;

import android.os.Build;
import android.view.View;

/* renamed from: py  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class py {
    public final int a;
    private final Class b;
    private final int c;

    public py(int i, Class cls) {
        this(i, cls, (byte[]) null);
    }

    public abstract Object a(View view);

    public final boolean a() {
        return Build.VERSION.SDK_INT >= this.c;
    }

    public final Object b(View view) {
        if (a()) {
            return a(view);
        }
        int i = Build.VERSION.SDK_INT;
        Object tag = view.getTag(this.a);
        if (!this.b.isInstance(tag)) {
            return null;
        }
        return tag;
    }

    public py(int i, Class cls, byte[] bArr) {
        this.a = i;
        this.b = cls;
        this.c = 28;
    }
}
