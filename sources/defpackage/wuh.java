package defpackage;

import android.net.Uri;
import java.io.Serializable;

/* renamed from: wuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wuh implements Serializable {
    String a;
    String[] b;
    String c;
    String[] d;

    public wuh(Uri uri, String[] strArr) {
        this(uri, strArr, (String) null, (String[]) null);
    }

    public wuh(Uri uri, String[] strArr, String str, String[] strArr2) {
        this.a = uri.toString();
        this.b = strArr;
        this.c = str;
        this.d = strArr2;
    }
}
