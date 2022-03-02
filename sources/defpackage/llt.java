package defpackage;

import android.database.CursorWindow;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: llt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class llt {
    public static amjf a(DataHolder dataHolder, int i, alsg alsg) {
        int a = dataHolder.a(i);
        int b = dataHolder.b("valueType", i, a);
        if (b == 0) {
            return aluw.a;
        }
        if (b == 1) {
            return ((alul) alsg).a(dataHolder.c("value", i, a)).e();
        } else if (b == 2) {
            try {
                return aluw.b((amic) new alze(dataHolder.c("value", i, a)).a((alzf) alsd.a));
            } catch (Exception e) {
                throw new IllegalArgumentException("Cannot deserialize JSON value.", e);
            }
        } else {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown object type: ");
            sb.append(b);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static DataHolder a(alsg alsg, Iterable iterable) {
        return new llu(alsg).a(iterable);
    }

    public static boolean a(CursorWindow cursorWindow, int i, amjf amjf, alsg alsg) {
        amje amje = amje.KIND_NOT_SET;
        int ordinal = amjf.b.ordinal();
        if (ordinal == 1) {
            boolean putLong = cursorWindow.putLong(2, i, 0);
            amic a = amjf.a();
            if (a.b == amib.NULL_VALUE) {
                return cursorWindow.putLong(0, i, 0) & putLong;
            }
            return cursorWindow.putString(alsc.a(a), i, 1) & putLong;
        } else if (ordinal == 2) {
            altx b = ((alul) alsg).a(amjf.b());
            return cursorWindow.putString(b.f(), i, 2) & cursorWindow.putLong(1, i, 0) & cursorWindow.putString(b.d(), i, 1);
        } else {
            String valueOf = String.valueOf(amjf.b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Unknown value type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
