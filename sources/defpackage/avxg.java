package defpackage;

import android.util.Xml;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: avxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avxg {
    public final acuy a;

    public avxg(acuy acuy) {
        this.a = acuy;
    }

    public static final avxb a(InputStream inputStream) {
        try {
            return new avxf(inputStream, Xml.newPullParser());
        } catch (XmlPullParserException e) {
            throw new avxa("Could not create XmlPullParser", e);
        }
    }

    public static final avxb a(Class cls, InputStream inputStream) {
        if (cls == avxe.class) {
            return a(inputStream);
        }
        throw new IllegalArgumentException("SubscribedFeeds supports only a single feed type");
    }
}
