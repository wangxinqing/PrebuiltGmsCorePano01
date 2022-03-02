package defpackage;

import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationManager;
import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: wih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wih {
    public static String a(Context context, String str) {
        if (URLUtil.isValidUrl(str)) {
            return "url";
        }
        String str2 = "";
        if (Build.VERSION.SDK_INT < 26) {
            return str2;
        }
        TextClassification classifyText = ((TextClassificationManager) context.getSystemService(TextClassificationManager.class)).getTextClassifier().classifyText(str, 0, str.length(), new LocaleList(new Locale[]{Locale.US}));
        if (classifyText.getEntityCount() > 0) {
            str2 = classifyText.getEntity(0);
        }
        ((anih) ((anih) vvj.a.d()).a("wih", "a", 117, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Text %s classified as %s", (Object) str, (Object) str2);
        return str2;
    }

    public static String a(Intent intent) {
        if (TextUtils.isEmpty(intent.getStringExtra("android.intent.extra.TEXT"))) {
            int i = Build.VERSION.SDK_INT;
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            if (resultsFromIntent != null) {
                CharSequence charSequence = resultsFromIntent.getCharSequence("android.intent.extra.TEXT");
                if (!TextUtils.isEmpty(charSequence)) {
                    return charSequence.toString();
                }
            }
            if (!TextUtils.isEmpty(intent.getStringExtra("android.intent.extra.PHONE_NUMBER"))) {
                return intent.getStringExtra("android.intent.extra.PHONE_NUMBER");
            }
            return null;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
        if (stringExtra == null) {
            return stringExtra;
        }
        ArrayList arrayList = new ArrayList();
        aucx aucx = ayni.a.a().bb().a;
        int size = aucx.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(Pattern.compile((String) aucx.get(i3), 40));
        }
        int size2 = arrayList.size();
        while (i2 < size2) {
            Matcher matcher = ((Pattern) arrayList.get(i2)).matcher(stringExtra);
            i2++;
            if (matcher.find()) {
                return stringExtra.substring(matcher.start(1), matcher.end());
            }
        }
        return stringExtra;
    }

    public static String a(String str, int i) {
        boolean z;
        String trim = str.trim();
        int a = whu.a(trim);
        if (a <= i) {
            return trim;
        }
        int a2 = whu.a("…");
        if (i >= a2) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        while (a + a2 > i && a > 0) {
            int codePointCount = trim.codePointCount(0, trim.length());
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < codePointCount - 1; i2++) {
                sb.appendCodePoint(trim.codePointAt(trim.offsetByCodePoints(0, i2)));
            }
            trim = sb.toString().trim();
            a = whu.a(trim);
        }
        return String.valueOf(trim).concat("…");
    }
}
