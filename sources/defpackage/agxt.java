package defpackage;

import java.util.regex.Matcher;

/* renamed from: agxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agxt {
    private final agxw a = new agxw();

    public final boolean a(CharSequence charSequence, agxr agxr) {
        String str = agxr.a;
        if (str.length() != 0) {
            Matcher matcher = this.a.a(str).matcher(charSequence);
            if (!matcher.lookingAt() || !matcher.matches()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
