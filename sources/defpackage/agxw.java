package defpackage;

import java.util.regex.Pattern;

/* renamed from: agxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agxw {
    private final agxv a = new agxv();

    public final Pattern a(String str) {
        Pattern pattern = (Pattern) this.a.a(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern compile = Pattern.compile(str);
        this.a.a(str, compile);
        return compile;
    }
}
