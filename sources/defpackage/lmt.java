package defpackage;

import android.database.CursorWindow;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lmt {
    public final List a = new ArrayList();
    public int b = 0;
    public final /* synthetic */ lmu c;

    public lmt(lmu lmu) {
        this.c = lmu;
    }

    public final void a(Object obj) {
        try {
            lmu lmu = this.c;
            List list = this.a;
            int i = this.b;
            this.b = i + 1;
            lmu.a(list, obj, i);
        } catch (RuntimeException e) {
            List list2 = this.a;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((CursorWindow) list2.get(i2)).close();
            }
            this.a.clear();
            throw e;
        }
    }
}
