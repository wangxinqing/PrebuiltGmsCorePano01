package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dvi {
    protected String a;
    protected String b;
    protected final Map c = new HashMap();
    public String d;
    protected String e;
    public String f;
    public String g;
    public String h;
    protected boolean i;

    public final dvj a() {
        return new dvj(this.a, this.b, this.e, this.g, this.h, this.c, this.i, this.d, this.f);
    }

    public final void a(String str, boolean z) {
        this.e = str;
        this.i = z;
    }

    public final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("A valid tableName must be supplied");
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            return;
        }
        throw new IllegalArgumentException("A valid corpus ID must be supplied");
    }

    public final void a(String str, String str2) {
        if (this.c.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Corpus map already contains mapping for section ") : "Corpus map already contains mapping for section ".concat(valueOf));
        } else {
            this.c.put(str, str2);
        }
    }
}
