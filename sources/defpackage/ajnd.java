package defpackage;

import android.content.Context;
import com.google.android.location.reporting.state.update.AccountConfig;
import java.util.Collections;
import java.util.List;

/* renamed from: ajnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajnd {
    public final ajmm a;
    private final hya b;
    private final List c;

    private ajnd(hya hya, ajmm ajmm, List list) {
        this.b = hya;
        this.a = ajmm;
        this.c = Collections.unmodifiableList(list);
    }

    public static ajnd a(Context context) {
        ajnw.a(context);
        return new ajnd(hya.a(context), ajmm.a(context), ajnw.a(aztb.a.a().bq()));
    }

    public final int b(AccountConfig accountConfig, String str) {
        int a2 = a(accountConfig, str);
        if (a2 == 0) {
            return !accountConfig.h() ? 7 : 0;
        }
        return a2;
    }

    public final int a(AccountConfig accountConfig, String str) {
        if (!accountConfig.d) {
            return 3;
        }
        if (str == null) {
            return 4;
        }
        if (!this.c.contains(str) || !this.b.b(str)) {
            return 5;
        }
        if (str.equals("com.google.android.gms")) {
            if (!this.a.a().b.a) {
                return 14;
            }
            if (!this.a.a().b.c) {
                return 13;
            }
        }
        if (accountConfig.i()) {
            return accountConfig.s == 2 ? 10 : 0;
        }
        return 7;
    }
}
