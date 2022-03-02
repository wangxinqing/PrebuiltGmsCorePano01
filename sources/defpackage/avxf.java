package defpackage;

import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: avxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avxf extends avxb {
    public avxf(InputStream inputStream, XmlPullParser xmlPullParser) {
        super(inputStream, xmlPullParser);
    }

    /* access modifiers changed from: protected */
    public final avwx a() {
        return new avxe();
    }

    /* access modifiers changed from: protected */
    public final void b(avwx avwx) {
        XmlPullParser xmlPullParser = this.a;
        if (avwx instanceof avxe) {
            avxe avxe = (avxe) avwx;
            String name = xmlPullParser.getName();
            if ("feedurl".equals(name)) {
                avxd avxd = new avxd();
                avxd.a = xmlPullParser.getAttributeValue((String) null, "value");
                avxd.b = xmlPullParser.getAttributeValue((String) null, "service");
                avxd.c = xmlPullParser.getAttributeValue((String) null, "authtoken");
                avxe.n = avxd;
            }
            if ("routingInfo".equals(name)) {
                avxe.o = avwz.a(xmlPullParser);
            }
            if ("clientToken".equals(name)) {
                avxe.p = avwz.a(xmlPullParser);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Expected SubscribedFeedsEntry!");
    }
}
