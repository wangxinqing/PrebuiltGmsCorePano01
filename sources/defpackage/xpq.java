package defpackage;

import android.content.Context;
import com.android.volley.Request;
import com.google.android.gms.common.internal.ClientContext;
import java.util.HashMap;

/* renamed from: xpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xpq extends xpr {
    final xpr m;
    public String n;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xpq(defpackage.xpr r9) {
        /*
            r8 = this;
            android.content.Context r1 = r9.i
            java.lang.String r2 = r9.e
            java.lang.String r0 = r9.d
            if (r0 == 0) goto L_0x0010
            java.lang.String r3 = ""
            java.lang.String r0 = r0.replace(r2, r3)
            r3 = r0
            goto L_0x0012
        L_0x0010:
            r0 = 0
            r3 = r0
        L_0x0012:
            boolean r4 = r9.a
            boolean r0 = r9.c
            r5 = 0
            if (r0 == 0) goto L_0x002a
            ikz r0 = defpackage.iks.a
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002a
            r0 = 1
            r5 = 1
            goto L_0x002b
        L_0x002a:
        L_0x002b:
            r6 = 0
            r7 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.m = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpq.<init>(xpr):void");
    }

    public final int a() {
        return this.m.g;
    }

    public final String a(String str, String str2) {
        return this.m.a(str, str2);
    }

    public final int b() {
        return this.m.h;
    }

    public final HashMap a(Context context, ClientContext clientContext) {
        HashMap a = super.a(context, clientContext);
        String str = this.n;
        if (str != null) {
            a.put("x-goog-sherlog-context", str);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public final void a(Request request, String str) {
        this.m.a(request, str);
    }

    public final void a(Request request, boolean z, String str) {
        this.m.a(request, z, str);
    }
}
