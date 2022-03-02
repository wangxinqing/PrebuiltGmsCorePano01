package defpackage;

import android.content.ComponentName;
import android.text.TextUtils;

/* renamed from: qnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qnj {
    public final String a;
    public final String b;
    public final ComponentName c;
    public final String d;
    public final Long e;
    public final anax f = null;

    public qnj(qni qni) {
        this.a = qni.a;
        this.b = qni.b;
        this.c = qni.c;
        this.d = qni.d;
        this.e = qni.e;
    }

    public final boolean a() {
        return !TextUtils.isEmpty(this.a);
    }

    public final boolean b() {
        return this.c != null;
    }
}
