package defpackage;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: oyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oyw {
    public final XmlPullParser a;
    private final int b;
    private int c = -1;

    public oyw(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
        this.b = xmlPullParser.getDepth();
    }

    public final boolean a() {
        int i;
        this.c = this.a.next();
        while (true) {
            if ((this.c == 3 && this.a.getDepth() <= this.b) || (i = this.c) == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            this.c = this.a.next();
        }
    }

    public final String b() {
        return this.a.getName();
    }
}
