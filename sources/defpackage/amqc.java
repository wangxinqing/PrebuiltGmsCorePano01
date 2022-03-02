package defpackage;

import java.util.Arrays;

/* renamed from: amqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amqc extends amqm {
    private final char[] a;

    public amqc(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.a = charArray;
        Arrays.sort(charArray);
    }

    public final boolean a(char c) {
        return Arrays.binarySearch(this.a, c) >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.a) {
            sb.append(amqm.c(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
