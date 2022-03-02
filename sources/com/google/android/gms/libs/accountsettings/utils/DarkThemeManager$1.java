package com.google.android.gms.libs.accountsettings.utils;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DarkThemeManager$1 extends nla {
    final /* synthetic */ qud a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DarkThemeManager$1(qud qud, String str) {
        super(str);
        this.a = qud;
    }

    public final void a(Context context, Intent intent) {
        boolean z;
        qud qud = this.a;
        boolean f = qud.f();
        Boolean bool = qud.a;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (f != z && qud.a(f, qud.g()) != qud.d) {
            qud.a = null;
            qud.c.recreate();
        }
    }
}
