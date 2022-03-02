package defpackage;

import android.util.Xml;
import java.io.OutputStream;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: avxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class avxc {
    public final avwx a;

    public avxc(avwx avwx) {
        this.a = avwx;
    }

    public final void a(OutputStream outputStream) {
        try {
            acuz acuz = new acuz(Xml.newSerializer());
            acuz.setOutput(outputStream, "UTF-8");
            acuz.startDocument("UTF-8", Boolean.FALSE);
            acuz.setPrefix("", "http://www.w3.org/2005/Atom");
            acuz.setPrefix("gd", "http://schemas.google.com/g/2005");
            a((XmlSerializer) acuz);
            acuz.startTag("http://www.w3.org/2005/Atom", "entry");
            String str = this.a.b;
            if (!avwy.a(str)) {
                acuz.startTag((String) null, "title");
                acuz.text(str);
                acuz.endTag((String) null, "title");
            }
            String str2 = this.a.e;
            if (!avwy.a(str2)) {
                acuz.startTag((String) null, "summary");
                acuz.text(str2);
                acuz.endTag((String) null, "summary");
            }
            String str3 = this.a.f;
            if (str3 != null) {
                acuz.startTag((String) null, "content");
                acuz.attribute((String) null, "type", "text");
                acuz.text(str3);
                acuz.endTag((String) null, "content");
            }
            avwx avwx = this.a;
            String str4 = avwx.g;
            String str5 = avwx.h;
            if (!avwy.a(str4) && !avwy.a(str5)) {
                acuz.startTag((String) null, "author");
                acuz.startTag((String) null, "name");
                acuz.text(str4);
                acuz.endTag((String) null, "name");
                acuz.startTag((String) null, "email");
                acuz.text(str5);
                acuz.endTag((String) null, "email");
                acuz.endTag((String) null, "author");
            }
            avwx avwx2 = this.a;
            String str6 = avwx2.i;
            String str7 = avwx2.j;
            if (!avwy.a(str6) || !avwy.a(str7)) {
                acuz.startTag((String) null, "category");
                if (!avwy.a(str6)) {
                    acuz.attribute((String) null, "term", str6);
                }
                if (!avwy.a(str7)) {
                    acuz.attribute((String) null, "scheme", str7);
                }
                acuz.endTag((String) null, "category");
            }
            b(acuz);
            acuz.endTag("http://www.w3.org/2005/Atom", "entry");
            acuz.endDocument();
            acuz.flush();
        } catch (XmlPullParserException e) {
            throw new avxa("Unable to create XmlSerializer.", e);
        }
    }

    /* access modifiers changed from: protected */
    public void a(XmlSerializer xmlSerializer) {
    }

    /* access modifiers changed from: protected */
    public void b(XmlSerializer xmlSerializer) {
    }
}
