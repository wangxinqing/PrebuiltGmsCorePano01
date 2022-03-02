package defpackage;

/* renamed from: avwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class avwx {
    public String a = null;
    public String b = null;
    public String c = null;
    public String d = null;
    public String e = null;
    public String f = null;
    public String g = null;
    public String h = null;
    public String i = null;
    public String j = null;
    public String k = null;
    public String l = null;
    public boolean m = false;

    protected static final void a(StringBuffer stringBuffer, String str, String str2) {
        if (!avwy.a(str2)) {
            stringBuffer.append(str);
            stringBuffer.append(": ");
            stringBuffer.append(str2);
            stringBuffer.append("\n");
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        a(stringBuffer);
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    public void a(StringBuffer stringBuffer) {
        a(stringBuffer, "ID", this.a);
        a(stringBuffer, "TITLE", this.b);
        a(stringBuffer, "EDIT URI", this.c);
        a(stringBuffer, "HTML URI", this.d);
        a(stringBuffer, "SUMMARY", this.e);
        a(stringBuffer, "CONTENT", this.f);
        a(stringBuffer, "AUTHOR", this.g);
        a(stringBuffer, "CATEGORY", this.i);
        a(stringBuffer, "CATEGORY SCHEME", this.j);
        a(stringBuffer, "PUBLICATION DATE", this.k);
        a(stringBuffer, "UPDATE DATE", this.l);
        a(stringBuffer, "DELETED", String.valueOf(this.m));
    }
}
