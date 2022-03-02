package defpackage;

import android.content.Context;
import android.net.Uri;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

/* renamed from: kja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kja implements kjm {
    protected final Context a;
    protected final kjl b;
    protected final kht c;
    final kjn d;
    int e = 0;

    public kja(Context context, kjl kjl, kht kht, kjn kjn) {
        iva.a((Object) context);
        this.a = context;
        iva.a((Object) kjl);
        this.b = kjl;
        iva.a((Object) kht);
        this.c = kht;
        iva.a((Object) kjn);
        this.d = kjn;
    }

    private static final Uri.Builder f() {
        Uri.Builder builder = new Uri.Builder();
        List c2 = amsk.a("://").c((CharSequence) jzq.K.c());
        builder.scheme((String) c2.get(0));
        builder.authority((String) c2.get(1));
        builder.appendPath("upload");
        for (String appendPath : amsk.a("/").a((CharSequence) "/drive/v2beta/")) {
            builder.appendPath(appendPath);
        }
        return builder;
    }

    public final int a() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public final URL b() {
        String str;
        kjl kjl = this.b;
        if (!kjl.c) {
            iva.a((Object) kjl.d);
            iva.a((Object) this.b.d.a);
            Uri.Builder appendQueryParameter = f().appendPath("files").appendPath(this.b.d.a).appendQueryParameter("setModifiedDate", "true");
            if (!c().isEmpty()) {
                appendQueryParameter.appendQueryParameter("uploadType", c());
            }
            str = appendQueryParameter.build().toString();
        } else {
            Uri.Builder appendQueryParameter2 = f().appendPath("files").appendQueryParameter("setModifiedDate", "true");
            if (!c().isEmpty()) {
                appendQueryParameter2.appendQueryParameter("uploadType", c());
            }
            str = appendQueryParameter2.build().toString();
        }
        return kjn.a(str, new HashMap());
    }

    /* access modifiers changed from: protected */
    public abstract String c();

    /* access modifiers changed from: protected */
    public final String d() {
        return !this.b.c ? "PUT" : "POST";
    }
}
