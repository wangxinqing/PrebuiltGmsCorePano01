package defpackage;

import android.content.ContentValues;
import android.os.Bundle;

/* renamed from: ysw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ysw {
    public static final String[] a = {"url", "type", "title", "description", "thumbnailUrl", "callToActionDisplayName"};
    public final ContentValues b;

    public ysw(ContentValues contentValues) {
        this.b = contentValues;
    }

    public final String a() {
        return this.b.getAsString("type");
    }

    public final String b() {
        return this.b.getAsString("title");
    }

    public final String c() {
        return this.b.getAsString("thumbnailUrl");
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("content_values", this.b);
        return bundle;
    }

    public ysw(Bundle bundle) {
        this.b = (ContentValues) bundle.getParcelable("content_values");
    }
}
