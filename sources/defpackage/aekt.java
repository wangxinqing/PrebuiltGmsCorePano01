package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import java.io.Closeable;

/* renamed from: aekt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aekt implements Closeable {
    public static final String[] a = {"android.provider.ALTERNATE_CONTACTS_STRUCTURE", "android.provider.CONTACTS_STRUCTURE"};
    public final Context b;
    public XmlResourceParser c;
    public boolean d;
    public boolean e;
    public boolean f;

    public aekt(Context context) {
        this.b = context;
    }

    public final void a() {
        this.f = false;
        this.d = false;
        this.e = false;
    }

    public final void close() {
        XmlResourceParser xmlResourceParser = this.c;
        if (xmlResourceParser != null) {
            xmlResourceParser.close();
            this.c = null;
        }
    }
}
