package defpackage;

import android.content.Context;
import java.io.IOException;

/* renamed from: gxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gxf implements gxl {
    final /* synthetic */ int a;
    private Object b = null;

    public gxf(int i) {
        this.a = i;
    }

    public final void a(Object obj) {
        if (this.b == null) {
            this.b = gxn.a(obj, this.a);
        }
    }

    public final void a(StringBuilder sb, Context context) {
        try {
            Object obj = this.b;
            if (obj != null) {
                ish.a(obj.toString(), (Appendable) sb);
            }
        } catch (IOException e) {
            gxn.a.f("IOException writing StringBuilder", e, new Object[0]);
        }
    }
}
