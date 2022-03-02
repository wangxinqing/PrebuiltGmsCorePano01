package defpackage;

import android.database.Cursor;

/* renamed from: qth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class qth extends amvu {
    protected long a;
    protected int b;
    protected Cursor c;

    public qth(long j, int i) {
        this.b = i;
        this.a = j;
    }

    /* access modifiers changed from: protected */
    public final Object a() {
        if (this.c == null) {
            this.c = b();
        }
        Cursor cursor = this.c;
        if (cursor != null) {
            if (cursor.moveToNext()) {
                Object c2 = c();
                if (this.c.isLast()) {
                    this.c.close();
                    this.c = null;
                }
                return c2;
            }
            this.c.close();
        }
        return d();
    }

    /* access modifiers changed from: protected */
    public abstract Cursor b();

    /* access modifiers changed from: protected */
    public abstract Object c();
}
