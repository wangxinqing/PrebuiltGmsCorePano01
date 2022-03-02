package defpackage;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: wum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wum implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final String b;
    public final String c;
    public final Boolean d;
    private final List e;

    public wum(String str, String str2, String str3, Boolean bool, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
        this.e = list;
    }

    public static final wuq a(Exception exc, String str) {
        StringWriter stringWriter = new StringWriter();
        apev.a((Throwable) exc, new PrintWriter(stringWriter));
        return wuq.a(String.valueOf(str).concat("_error"), stringWriter.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            wum wum = (wum) obj;
            return amqx.a(this.a, wum.a) && amqx.a(this.b, wum.b) && amqx.a(this.c, wum.c) && this.e.equals(wum.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("name", (Object) this.a);
        a2.a("consentText", (Object) this.b);
        a2.a("feedbackComponent", (Object) this.c);
        a2.a("debugDataSources", (Object) this.e);
        a2.a();
        return a2.toString();
    }

    public final amzy a() {
        return amzy.a((Collection) this.e);
    }
}
