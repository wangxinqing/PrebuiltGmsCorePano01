package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: abgf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abgf {
    static final anaf a;
    static final anaf b;
    private final Context c;

    static {
        anab anab = new anab();
        anab.a(1, 1);
        anab.a(2, 3);
        anab.a(3, 2);
        anab.a(4, 5);
        anab.a(5, 4);
        anab.a(6, 13);
        anab.a(7, 6);
        anab.a(8, 10);
        anab.a(9, 19);
        anab.a(10, 9);
        anab.a(11, 14);
        anab.a(12, 11);
        anab.a(13, 8);
        anab.a(14, 15);
        anab.a(15, 16);
        anab.a(16, 17);
        anab.a(17, 18);
        anab.a(18, 12);
        a = anab.a();
        anab anab2 = new anab();
        anab2.a(1, 1);
        anab2.a(2, 2);
        b = anab2.a();
    }

    public abgf(Context context) {
        this.c = context;
    }

    public final String a(String str, abge abge) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!TextUtils.isDigitsOnly(str) && (str.length() <= 1 || TextUtils.indexOf(str, '-') != 0 || !TextUtils.isDigitsOnly(str.substring(1)))) {
            return str;
        }
        return this.c.getResources().getString(abge.a(Integer.parseInt(str)));
    }
}
