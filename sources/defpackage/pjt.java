package defpackage;

import android.accounts.Account;
import java.util.Iterator;
import java.util.List;

/* renamed from: pjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pjt extends awem {
    private final awef b;
    private final awef c;

    public pjt(bapu bapu, bapu bapu2, awef awef, awef awef2) {
        super(bapu2, awey.a(pjt.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        pjp pjp;
        List list = (List) obj;
        pjn pjn = (pjn) list.get(0);
        List list2 = (List) list.get(1);
        Account c2 = pjn.c();
        if (!pjn.d()) {
            if (c2 != null) {
                pjp = pjp.SUPERFLOUS;
            } else {
                pjp = pjp.PASS;
            }
        } else if (c2 != null) {
            if (c2.type.equals("com.google")) {
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (c2.equals((Account) it.next())) {
                            pjp = pjp.PASS;
                            break;
                        }
                    } else {
                        pjp = pjp.UNKNOWN_ACCOUNT;
                        break;
                    }
                }
            } else {
                pjp = pjp.BAD_TYPE;
            }
        } else {
            pjp = pjp.UNKNOWN_ACCOUNT;
        }
        return aorl.a((Object) pjp);
    }
}
