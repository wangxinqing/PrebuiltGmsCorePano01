package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: yrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yrl extends ybp {
    public String a;
    public String b;
    public ilg c;
    public yrk d;
    private int m;

    public yrl(Context context, String str, String str2, String str3, String str4) {
        super(context, str, str2, str3, str4, 0);
    }

    /* access modifiers changed from: protected */
    public final void a(icc icc) {
        yrk yrk = this.d;
        if (yrk != null) {
            yrk.a = true;
            this.d = null;
        }
        if (!TextUtils.isEmpty(this.l)) {
            this.d = new yrk(this);
            ibq ibq = wlt.a;
            String str = this.i;
            String str2 = this.j;
            wll wll = new wll();
            wll.a = this.l;
            wll.c = this.m;
            wll.b = this.b;
            xdm.a(icc, str, str2, wll).a((icm) this.d);
        }
    }

    public final boolean a() {
        return this.b != null;
    }

    public final void a(String str) {
        String str2 = this.a;
        if (str2 == null || !str2.equals(str)) {
            this.b = null;
            this.c = null;
        } else if (this.d != null) {
            return;
        }
        this.m = 20;
        this.a = str;
        super.b(str);
    }
}
