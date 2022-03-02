package defpackage;

import android.database.CursorWindow;

/* renamed from: llu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class llu extends lmu {
    private final alsg a;

    public llu(alsg alsg) {
        super(lms.a);
        this.a = alsg;
    }

    /* access modifiers changed from: protected */
    public final boolean a(CursorWindow cursorWindow, int i, Object obj) {
        if (obj instanceof amjf) {
            return llt.a(cursorWindow, i, (amjf) obj, this.a);
        }
        return cursorWindow.putString((String) obj, i, 1) & cursorWindow.putLong(3, i, 0);
    }
}
