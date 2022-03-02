package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.c;

/* renamed from: dkd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class dkd extends dkq {
    public final dmd a;
    public boolean b;

    public dkd(dmd dmd) {
        super(dmd.b(), dmd.c);
        this.a = dmd;
    }

    /* access modifiers changed from: protected */
    public final void a(dkn dkn) {
        String str;
        dlm dlm = (dlm) dkn.b(dlm.class);
        if (TextUtils.isEmpty(dlm.b)) {
            dlm.b = this.a.g().b();
        }
        if (this.b && TextUtils.isEmpty(dlm.d)) {
            dls f = this.a.f();
            f.q();
            c b2 = f.b();
            String str2 = null;
            if (b2 != null) {
                str = b2.a;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            dlm.d = str2;
            f.q();
            c b3 = f.b();
            boolean z = false;
            if (b3 != null && !b3.b) {
                z = true;
            }
            dlm.e = z;
        }
    }
}
