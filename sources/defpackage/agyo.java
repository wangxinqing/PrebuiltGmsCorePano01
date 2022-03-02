package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;

/* renamed from: agyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agyo extends agyr {
    private final amzy a;

    static {
        anil.a("RegExUrlChecker");
    }

    public agyo(amzy amzy) {
        amzt j = amzy.j();
        anhk i = amzy.listIterator();
        while (i.hasNext()) {
            Pattern pattern = (Pattern) i.next();
            if ((pattern.flags() & 2) == 0) {
                j.c(Pattern.compile(pattern.pattern(), pattern.flags() | 2));
            } else {
                j.c(pattern);
            }
        }
        this.a = j.a();
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        anhk i = this.a.listIterator();
        while (i.hasNext()) {
            if (((Pattern) i.next()).matcher(str).matches()) {
                return true;
            }
        }
        agyq.a(Uri.parse(str));
        return false;
    }
}
