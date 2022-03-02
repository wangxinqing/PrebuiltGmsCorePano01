package defpackage;

import java.io.OutputStream;
import java.io.Writer;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: acuz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acuz implements XmlSerializer {
    private final XmlSerializer a;

    public acuz(XmlSerializer xmlSerializer) {
        this.a = xmlSerializer;
    }

    static String a(String str) {
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt >= ' ' || charAt == 10 || charAt == 9 || charAt == 13) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder(str.length());
                sb.append(str, 0, i);
                while (true) {
                    i++;
                    if (i >= str.length()) {
                        return sb.toString();
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 >= ' ' || charAt2 == 10 || charAt2 == 9 || charAt2 == 13) {
                        sb.append(charAt2);
                    }
                }
            }
        }
        return str;
    }

    public final XmlSerializer attribute(String str, String str2, String str3) {
        return this.a.attribute(str, str2, a(str3));
    }

    public final void cdsect(String str) {
        this.a.cdsect(str);
    }

    public final void comment(String str) {
        this.a.comment(str);
    }

    public final void docdecl(String str) {
        this.a.docdecl(str);
    }

    public final void endDocument() {
        this.a.endDocument();
    }

    public final XmlSerializer endTag(String str, String str2) {
        return this.a.endTag(str, str2);
    }

    public final void entityRef(String str) {
        this.a.entityRef(str);
    }

    public final void flush() {
        this.a.flush();
    }

    public final int getDepth() {
        return this.a.getDepth();
    }

    public final boolean getFeature(String str) {
        return this.a.getFeature(str);
    }

    public final String getName() {
        return this.a.getName();
    }

    public final String getNamespace() {
        return this.a.getNamespace();
    }

    public final String getPrefix(String str, boolean z) {
        return this.a.getPrefix(str, z);
    }

    public final Object getProperty(String str) {
        return this.a.getProperty(str);
    }

    public final void ignorableWhitespace(String str) {
        this.a.ignorableWhitespace(str);
    }

    public final void processingInstruction(String str) {
        this.a.processingInstruction(str);
    }

    public final void setFeature(String str, boolean z) {
        this.a.setFeature(str, z);
    }

    public final void setOutput(OutputStream outputStream, String str) {
        this.a.setOutput(outputStream, str);
    }

    public final void setPrefix(String str, String str2) {
        this.a.setPrefix(str, str2);
    }

    public final void setProperty(String str, Object obj) {
        this.a.setProperty(str, obj);
    }

    public final void startDocument(String str, Boolean bool) {
        this.a.startDocument(str, bool);
    }

    public final XmlSerializer startTag(String str, String str2) {
        return this.a.startTag(str, str2);
    }

    public final XmlSerializer text(String str) {
        return this.a.text(a(str));
    }

    public final void setOutput(Writer writer) {
        this.a.setOutput(writer);
    }

    public final XmlSerializer text(char[] cArr, int i, int i2) {
        return text(new String(cArr, i, i2));
    }
}
