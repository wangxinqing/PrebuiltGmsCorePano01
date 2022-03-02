package com.google.android.ads.tasks;

import com.google.ads.afma.proto2api.c;
import java.lang.reflect.InvocationTargetException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class n extends v {
    public n(bhm bhm, String str, String str2, aucd aucd, int i) {
        super(bhm, str, str2, aucd, i, 73);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.d.invoke((Object) null, new Object[]{this.a.a})).booleanValue();
            aucd aucd = this.g;
            if (booleanValue) {
                i = 2;
            }
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            c cVar = (c) aucd.b;
            c cVar2 = c.Q;
            cVar.J = i - 1;
            cVar.c |= 8;
        } catch (InvocationTargetException e) {
            aucd aucd2 = this.g;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            c cVar3 = (c) aucd2.b;
            c cVar4 = c.Q;
            cVar3.J = 2;
            cVar3.c |= 8;
        }
    }
}
