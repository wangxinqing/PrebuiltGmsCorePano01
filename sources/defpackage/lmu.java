package defpackage;

import android.database.CursorWindow;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lmu {
    private final String[] a;
    private final int b;

    protected lmu(String[] strArr) {
        this.a = strArr;
        this.b = strArr.length;
    }

    private final CursorWindow a(int i) {
        CursorWindow cursorWindow = new CursorWindow(false);
        cursorWindow.setNumColumns(this.b);
        cursorWindow.setStartPosition(i);
        return cursorWindow;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(CursorWindow cursorWindow, int i, Object obj);

    public final DataHolder a(Iterable iterable) {
        CursorWindow[] cursorWindowArr;
        if (iterable.iterator().hasNext()) {
            ArrayList arrayList = new ArrayList();
            try {
                int i = 0;
                for (Object a2 : iterable) {
                    int i2 = i + 1;
                    a((List) arrayList, a2, i);
                    i = i2;
                }
                cursorWindowArr = (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
            } catch (RuntimeException e) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((CursorWindow) arrayList.get(i3)).close();
                }
                throw e;
            }
        } else {
            cursorWindowArr = new CursorWindow[0];
        }
        return a(cursorWindowArr);
    }

    public final DataHolder a(CursorWindow[] cursorWindowArr) {
        return new DataHolder(this.a, cursorWindowArr, 0, (Bundle) null);
    }

    public final void a(List list, Object obj, int i) {
        CursorWindow cursorWindow;
        int size = list.size();
        if (size == 0) {
            cursorWindow = a(i);
            list.add(cursorWindow);
        } else {
            cursorWindow = (CursorWindow) list.get(size - 1);
        }
        if (!cursorWindow.allocRow()) {
            cursorWindow = a(i);
            list.add(cursorWindow);
            if (!cursorWindow.allocRow()) {
                throw new IllegalStateException("Cannot allocate window space.");
            }
        }
        if (!a(cursorWindow, i, obj)) {
            cursorWindow.freeLastRow();
            CursorWindow a2 = a(i);
            list.add(a2);
            if (!a2.allocRow()) {
                throw new IllegalStateException("Cannot allocate window space.");
            } else if (!a(a2, i, obj)) {
                StringBuilder sb = new StringBuilder(43);
                sb.append("Single row exceeds window size: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
    }
}
