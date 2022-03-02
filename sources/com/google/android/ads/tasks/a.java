package com.google.android.ads.tasks;

import android.provider.Settings;
import com.google.ads.afma.proto2api.c;
import java.lang.reflect.InvocationTargetException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class a extends v {
    public a(bhm bhm, String str, String str2, aucd aucd, int i) {
        super(bhm, str, str2, aucd, i, 49);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        aucd aucd = this.g;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        c cVar = (c) aucd.b;
        c cVar2 = c.Q;
        int i = 2;
        cVar.A = 2;
        cVar.b |= 2048;
        try {
            boolean booleanValue = ((Boolean) this.d.invoke((Object) null, new Object[]{this.a.a})).booleanValue();
            aucd aucd2 = this.g;
            if (!booleanValue) {
                i = 1;
            }
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            c cVar3 = (c) aucd2.b;
            cVar3.A = i - 1;
            cVar3.b |= 2048;
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
