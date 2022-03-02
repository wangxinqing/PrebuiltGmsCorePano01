package defpackage;

import android.database.Cursor;
import android.database.CursorWrapper;

/* renamed from: xby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xby extends CursorWrapper {
    private final int a = 100;

    public xby(Cursor cursor) {
        super(cursor);
    }

    public final int getCount() {
        return Math.min(super.getCount(), this.a);
    }
}
