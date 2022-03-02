package defpackage;

import android.net.Uri;

/* renamed from: ahee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahee {
    public amzt a;
    public aubs b;
    public ahga c;
    private Uri d;
    private audx e;
    private amzy f;
    private ahfm g;

    public final ahef a() {
        amzt amzt = this.a;
        if (amzt != null) {
            this.f = amzt.a();
        } else if (this.f == null) {
            this.f = amzy.h();
        }
        String str = this.d == null ? " uri" : "";
        if (this.e == null) {
            str = str.concat(" schema");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" handler");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" variantConfig");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" extensionRegistry");
        }
        if (str.isEmpty()) {
            return new ahcy(this.d, this.e, this.c, this.f, this.g, this.b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void a(ahfm ahfm) {
        if (ahfm != null) {
            this.g = ahfm;
            return;
        }
        throw new NullPointerException("Null variantConfig");
    }

    public final void a(Uri uri) {
        if (uri != null) {
            this.d = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public final void a(audx audx) {
        if (audx != null) {
            this.e = audx;
            return;
        }
        throw new NullPointerException("Null schema");
    }
}
