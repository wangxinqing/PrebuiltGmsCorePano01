package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;

/* renamed from: jbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jbo extends CursorWrapper implements CrossProcessCursor {
    private AbstractWindowedCursor a;

    public jbo(Cursor cursor) {
        super(cursor);
        for (int i = 0; i < 10 && (cursor instanceof CursorWrapper); i++) {
            cursor = ((CursorWrapper) cursor).getWrappedCursor();
        }
        if (!(cursor instanceof AbstractWindowedCursor)) {
            String valueOf = String.valueOf(cursor.getClass().getName());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown type: ") : "Unknown type: ".concat(valueOf));
        } else {
            this.a = (AbstractWindowedCursor) cursor;
        }
    }

    public final void a() {
        this.a.setWindow((CursorWindow) null);
    }

    public final void fillWindow(int i, CursorWindow cursorWindow) {
        this.a.fillWindow(i, cursorWindow);
    }

    public final CursorWindow getWindow() {
        return this.a.getWindow();
    }

    public final /* bridge */ /* synthetic */ Cursor getWrappedCursor() {
        return this.a;
    }

    public final boolean onMove(int i, int i2) {
        return this.a.onMove(i, i2);
    }
}
