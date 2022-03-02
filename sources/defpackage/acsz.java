package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: acsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class acsz {
    protected final String a;
    protected Matcher b = null;

    public acsz(String str) {
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        this.b = Pattern.compile(this.a).matcher(str);
    }

    public String b(String str) {
        throw null;
    }

    public final void c(String str) {
        Matcher matcher = this.b;
        if (matcher != null) {
            matcher.reset(str);
        } else {
            a(str);
        }
    }

    public final boolean a() {
        return this.b.matches();
    }
}
