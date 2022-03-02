package defpackage;

/* renamed from: avxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avxd {
    public String a;
    public String b;
    public String c;

    public avxd() {
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FeedUrl");
        stringBuffer.append(" url:");
        stringBuffer.append(this.a);
        stringBuffer.append(" service:");
        stringBuffer.append(this.b);
        stringBuffer.append(" authToken:");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }

    public avxd(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
