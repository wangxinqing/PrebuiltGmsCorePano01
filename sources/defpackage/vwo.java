package defpackage;

import android.net.Uri;

/* renamed from: vwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vwo {
    public final String a;
    public final Uri b;
    public final boolean c;

    public vwo(String str, Uri uri, boolean z) {
        this.a = str;
        this.b = uri;
        this.c = z;
    }

    public final String toString() {
        return String.format("Profile<name: %s, uri: %s>", new Object[]{this.a, this.b});
    }
}
