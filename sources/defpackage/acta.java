package defpackage;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: acta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acta extends acsz {
    protected Map c = null;

    public acta(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        this.b = Pattern.compile(actb.p.matcher(this.a).replaceAll("")).matcher(str);
        String str2 = this.a;
        nz nzVar = new nz();
        Matcher matcher = actb.p.matcher(str2);
        int i = 1;
        while (matcher.find()) {
            nzVar.put(matcher.group(1), Integer.valueOf(i));
            i++;
        }
        this.c = nzVar;
    }

    public final String b(String str) {
        if (this.c.containsKey(str)) {
            return this.b.group(((Integer) this.c.get(str)).intValue());
        }
        throw new IllegalArgumentException(str.length() == 0 ? new String("Unknown group ") : "Unknown group ".concat(str));
    }
}
