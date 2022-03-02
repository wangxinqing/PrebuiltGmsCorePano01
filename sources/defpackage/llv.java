package defpackage;

import android.database.CursorWindow;
import java.util.Map;

/* renamed from: llv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class llv extends lmu {
    private final alsg a;

    public llv(alsg alsg) {
        super(lms.b);
        this.a = alsg;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ boolean a(CursorWindow cursorWindow, int i, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return cursorWindow.putString((String) entry.getKey(), i, 3) | llt.a(cursorWindow, i, (amjf) entry.getValue(), this.a);
    }
}
