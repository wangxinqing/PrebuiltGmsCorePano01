package defpackage;

import android.text.TextUtils;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeResult;
import java.util.Collection;

/* renamed from: wmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wmh {
    public final wlz a;
    public final amzy b;
    public final amzy c;

    public wmh(wlz wlz) {
        this.a = wlz;
        amzt j = amzy.j();
        amzt j2 = amzy.j();
        for (int i = 0; i < wlz.a.size(); i++) {
            wly wly = (wly) wlz.a.get(i);
            j.c(anax.a((Collection) wly.b));
            j2.c(anax.a((Collection) wly.d));
        }
        this.b = j.a();
        this.c = j2.a();
    }

    public final ClassifyAccountTypeResult a(String str, String str2) {
        wmc wmc;
        if (str == null) {
            wmb a2 = wmb.a(this.a.b);
            if (a2 == null) {
                a2 = wmb.NULL_ACCOUNT;
            }
            return ClassifyAccountTypeResult.a((String) null, str2, a2, wmc.EXACT);
        }
        for (int i = 0; i < this.a.a.size(); i++) {
            if (((anax) this.c.get(i)).contains(str)) {
                wmc = wmc.NONE;
            } else {
                wly wly = (wly) this.a.a.get(i);
                if (!wly.e && (!(!TextUtils.isEmpty(str2)) ? wly.f.size() != 0 : !wly.f.contains(str2))) {
                    wmc = wmc.NONE;
                } else if (!((anax) this.b.get(i)).contains(str)) {
                    aucx aucx = wly.c;
                    int size = aucx.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            wmc = wmc.NONE;
                            break;
                        }
                        int i3 = i2 + 1;
                        if (str.contains((String) aucx.get(i2))) {
                            wmc = wmc.SUBSTRING;
                            break;
                        }
                        i2 = i3;
                    }
                } else {
                    wmc = wmc.EXACT;
                }
            }
            if (wmc != wmc.NONE) {
                wmb a3 = wmb.a(((wly) this.a.a.get(i)).a);
                if (a3 == null) {
                    a3 = wmb.UNKNOWN;
                }
                return ClassifyAccountTypeResult.a(str, str2, a3, wmc);
            }
        }
        wmb a4 = wmb.a(this.a.c);
        if (a4 == null) {
            a4 = wmb.UNKNOWN;
        }
        return ClassifyAccountTypeResult.a(str, str2, a4, wmc.NONE);
    }
}
