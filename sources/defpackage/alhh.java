package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: alhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alhh {
    protected final Context a;

    public alhh(Context context) {
        this.a = context;
    }

    private final alhg a(XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        while (true) {
            try {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals("FooterButton")) {
                        return new alhg(this.a, asAttributeSet);
                    }
                    throw new InflateException(String.valueOf(xmlPullParser.getPositionDescription()).concat(": not a FooterButton"));
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

    public final alhg a(int i) {
        XmlResourceParser xml = this.a.getResources().getXml(i);
        try {
            return a((XmlPullParser) xml);
        } finally {
            xml.close();
        }
    }
}
