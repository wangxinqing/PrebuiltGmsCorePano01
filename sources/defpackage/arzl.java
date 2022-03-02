package defpackage;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;

/* renamed from: arzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arzl implements InputFilter {
    private static final Charset a = Charset.forName("UTF-8");
    private final int b;

    public arzl(int i) {
        this.b = i;
    }

    private static int a(String str) {
        return str.getBytes(a).length;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int a2 = a(spanned.subSequence(0, i3).toString());
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        int a3 = a(charSequence2);
        int a4 = a(spanned.subSequence(i4, spanned.length()).toString());
        boolean z = false;
        while (a2 + a3 + a4 > this.b && a3 > 0) {
            int codePointCount = charSequence2.codePointCount(0, charSequence2.length());
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < codePointCount - 1; i5++) {
                sb.appendCodePoint(charSequence2.codePointAt(charSequence2.offsetByCodePoints(0, i5)));
            }
            charSequence2 = sb.toString();
            a3 = a(charSequence2);
            z = true;
        }
        if (!z) {
            return null;
        }
        SpannableString spannableString = new SpannableString(charSequence2);
        if (charSequence instanceof Spanned) {
            TextUtils.copySpansFrom((Spanned) charSequence, i, i + charSequence2.length(), (Class) null, spannableString, 0);
        }
        return spannableString;
    }
}
