package defpackage;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@Deprecated
/* renamed from: bdr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bdr {
    protected final Resources b;

    protected bdr(Resources resources) {
        this.b = resources;
    }

    private final void a(XmlPullParser xmlPullParser, Object obj, AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                Object b2 = b(xmlPullParser.getName(), attributeSet);
                a(obj, b2);
                a(xmlPullParser, b2, attributeSet);
            }
        }
    }

    private final Object b(String str, AttributeSet attributeSet) {
        try {
            return a(str, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (Exception e2) {
            String positionDescription = attributeSet.getPositionDescription();
            StringBuilder sb = new StringBuilder(String.valueOf(positionDescription).length() + 24 + String.valueOf(str).length());
            sb.append(positionDescription);
            sb.append(": Error inflating class ");
            sb.append(str);
            throw new InflateException(sb.toString(), e2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object a(String str, AttributeSet attributeSet);

    /* access modifiers changed from: protected */
    public abstract void a(Object obj, Object obj2);

    public final Object a(int i) {
        XmlResourceParser xml = this.b.getXml(i);
        try {
            return a((XmlPullParser) xml);
        } finally {
            xml.close();
        }
    }

    public final Object a(XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        while (true) {
            try {
                int next = xmlPullParser.next();
                if (next == 2) {
                    Object b2 = b(xmlPullParser.getName(), asAttributeSet);
                    a(xmlPullParser, b2, asAttributeSet);
                    return b2;
                } else if (next == 1) {
                    throw new InflateException(String.valueOf(xmlPullParser.getPositionDescription()).concat(": No start tag found!"));
                }
            } catch (XmlPullParserException e) {
                throw new InflateException(e.getMessage(), e);
            } catch (IOException e2) {
                String positionDescription = xmlPullParser.getPositionDescription();
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(positionDescription).length() + 2 + String.valueOf(message).length());
                sb.append(positionDescription);
                sb.append(": ");
                sb.append(message);
                throw new InflateException(sb.toString(), e2);
            }
        }
    }
}
