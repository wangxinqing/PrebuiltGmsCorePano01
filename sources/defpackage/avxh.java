package defpackage;

import org.xmlpull.v1.XmlSerializer;

/* renamed from: avxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avxh extends avxc {
    public avxh(avxe avxe) {
        super(avxe);
    }

    /* access modifiers changed from: protected */
    public final void a(XmlSerializer xmlSerializer) {
        xmlSerializer.setPrefix("gsync", "http://schemas.google.com/gsync/data");
    }

    /* access modifiers changed from: protected */
    public final void b(XmlSerializer xmlSerializer) {
        avxe avxe = (avxe) this.a;
        avxd avxd = avxe.n;
        xmlSerializer.startTag("http://schemas.google.com/gsync/data", "feedurl");
        xmlSerializer.attribute((String) null, "value", avxd.a);
        xmlSerializer.attribute((String) null, "service", avxd.b);
        xmlSerializer.attribute((String) null, "authtoken", avxd.c);
        xmlSerializer.endTag("http://schemas.google.com/gsync/data", "feedurl");
        String str = avxe.p;
        String str2 = "";
        if (avwy.a(str)) {
            str = str2;
        }
        xmlSerializer.startTag("http://schemas.google.com/gsync/data", "clientToken");
        xmlSerializer.text(str);
        xmlSerializer.endTag("http://schemas.google.com/gsync/data", "clientToken");
        String str3 = avxe.o;
        if (!avwy.a(str3)) {
            str2 = str3;
        }
        xmlSerializer.startTag("http://schemas.google.com/gsync/data", "routingInfo");
        xmlSerializer.text(str2);
        xmlSerializer.endTag("http://schemas.google.com/gsync/data", "routingInfo");
    }
}
