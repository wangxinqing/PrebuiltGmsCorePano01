package defpackage;

import java.lang.Character;
import java.text.Collator;
import java.text.RuleBasedCollator;
import java.util.Locale;

/* renamed from: wub  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wub {
    private static final Object a = new Object();
    private static Locale b;
    private static RuleBasedCollator c;

    public static String a(String str) {
        RuleBasedCollator ruleBasedCollator;
        synchronized (a) {
            Locale locale = Locale.getDefault();
            if (!locale.equals(b)) {
                b = locale;
                RuleBasedCollator ruleBasedCollator2 = (RuleBasedCollator) Collator.getInstance(locale);
                c = ruleBasedCollator2;
                ruleBasedCollator2.setStrength(0);
                c.setDecomposition(1);
            }
            ruleBasedCollator = c;
        }
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            } else if (!Character.isLetterOrDigit(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                int i2 = 0;
                for (char c2 : charArray) {
                    if (Character.isLetterOrDigit(c2)) {
                        charArray[i2] = c2;
                        i2++;
                    }
                }
                str = new String(charArray, 0, i2);
            } else {
                i++;
            }
        }
        String d = jjp.d(ruleBasedCollator.getCollationKey(str).toByteArray());
        return d.substring(0, d.length() - 2);
    }

    public static boolean b(Character.UnicodeBlock unicodeBlock) {
        return Character.UnicodeBlock.KATAKANA.equals(unicodeBlock) || Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS.equals(unicodeBlock) || Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS.equals(unicodeBlock) || Character.UnicodeBlock.HIRAGANA.equals(unicodeBlock);
    }

    public static boolean a(Character.UnicodeBlock unicodeBlock) {
        return Character.UnicodeBlock.HANGUL_SYLLABLES.equals(unicodeBlock) || Character.UnicodeBlock.HANGUL_JAMO.equals(unicodeBlock) || Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO.equals(unicodeBlock);
    }
}
