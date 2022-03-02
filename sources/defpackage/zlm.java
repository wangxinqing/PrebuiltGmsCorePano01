package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.widget.MultiAutoCompleteTextView;
import com.google.android.gms.plus.sharebox.MentionSpan;

/* renamed from: zlm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zlm implements MultiAutoCompleteTextView.Tokenizer {
    static final int a(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt == 10) {
                return i;
            }
            if (Character.isWhitespace(charAt)) {
                i3++;
                if (i3 < 4) {
                    int i4 = i + 1;
                    while (i4 < length) {
                        char charAt2 = charSequence.charAt(i4);
                        if (charAt2 != 10) {
                            if (!Character.isWhitespace(charAt2)) {
                                break;
                            }
                            i4++;
                        } else {
                            return i;
                        }
                    }
                    if (i4 != length) {
                        int i5 = i4;
                        charAt = charSequence.charAt(i4);
                        i = i5;
                    }
                }
                return i;
            }
            if (i > i2 && a(charAt) && (i == 0 || Character.isWhitespace(charSequence.charAt(i - 1)))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean a(char c) {
        return c == '+' || c == '@';
    }

    public final int findTokenEnd(CharSequence charSequence, int i) {
        return a(charSequence, i, i);
    }

    public final int findTokenStart(CharSequence charSequence, int i) {
        int length;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            char charAt = charSequence.charAt(i2);
            if (charAt == 10) {
                break;
            }
            if (a(charAt) && (i2 == 0 || Character.isWhitespace(charSequence.charAt(i2 - 1)))) {
                if (charSequence instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequence;
                    MentionSpan[] mentionSpanArr = (MentionSpan[]) spannable.getSpans(i2, i2, MentionSpan.class);
                    if (mentionSpanArr == null || mentionSpanArr.length == 0) {
                        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(i2, i2, URLSpan.class);
                        if (!(uRLSpanArr == null || (length = uRLSpanArr.length) == 0)) {
                            int i3 = 0;
                            while (i3 < length) {
                                if (!MentionSpan.a(uRLSpanArr[i3])) {
                                    i3++;
                                }
                            }
                        }
                    }
                    return i;
                }
                int a = a(charSequence, i2, i);
                while (a < i && Character.isWhitespace(charSequence.charAt(a))) {
                    a++;
                }
                if (a == i) {
                    return i2;
                }
            }
        }
        return i;
    }

    public final CharSequence terminateToken(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0 || Character.isWhitespace(charSequence.charAt(length - 1))) {
            return charSequence;
        }
        if (charSequence instanceof Spanned) {
            String valueOf = String.valueOf(charSequence);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
            sb.append(valueOf);
            sb.append(" ");
            SpannableString spannableString = new SpannableString(sb.toString());
            TextUtils.copySpansFrom((Spanned) charSequence, 0, charSequence.length(), Object.class, spannableString, 0);
            return spannableString;
        }
        String valueOf2 = String.valueOf(charSequence);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1);
        sb2.append(valueOf2);
        sb2.append(" ");
        return sb2.toString();
    }
}
