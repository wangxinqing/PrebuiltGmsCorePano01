package defpackage;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: avwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avwz {
    public static String a(XmlPullParser xmlPullParser) {
        if (xmlPullParser.next() == 4) {
            return xmlPullParser.getText();
        }
        return null;
    }
}
