package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: qlm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qlm {
    public static List a(Context context) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            for (int i = 0; i < locales.size(); i++) {
                arrayList.add(locales.get(i).toLanguageTag());
            }
        } else {
            Locale locale = context.getResources().getConfiguration().locale;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            arrayList.add(locale.toLanguageTag());
        }
        return arrayList;
    }
}
