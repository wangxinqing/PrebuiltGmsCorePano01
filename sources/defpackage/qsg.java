package defpackage;

import android.database.Cursor;

/* renamed from: qsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class qsg implements AutoCloseable {
    protected Cursor a;

    public final boolean a() {
        return !this.a.isClosed() && this.a.getCount() != 0 && !this.a.isLast();
    }

    public final qsv b() {
        if (this.a.moveToNext()) {
            return c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract qsv c();

    public final void close() {
        this.a.close();
    }

    public final qsv d() {
        if (this.a.isClosed() || this.a.getCount() == 0) {
            return null;
        }
        int position = this.a.getPosition();
        this.a.moveToFirst();
        qsv c = c();
        this.a.moveToPosition(position);
        return c;
    }
}
