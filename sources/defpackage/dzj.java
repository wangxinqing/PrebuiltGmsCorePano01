package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: dzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dzj extends ybp {
    public String a;
    public String b;
    public ilg c;
    public dzi d;
    private int m;

    public dzj(Context context, String str, String str2, String str3) {
        super(context, str, (String) null, str2, str3, 0);
    }

    /* access modifiers changed from: protected */
    public final void a(icc icc) {
        dzi dzi = this.d;
        if (dzi != null) {
            dzi.a = true;
            this.d = null;
        }
        if (!TextUtils.isEmpty(this.l)) {
            this.d = new dzi(this);
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
