package defpackage;

import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: qsb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qsb extends qsc {
    protected static final String[] a = {"_id", "date_modified", "date_added", "_display_name", "title", "media_type", "mime_type", "_data"};
    static final String[] b = {"_id", "date_modified", "media_type"};

    public qsb(qsf qsf) {
        this.d = qsf;
    }

    /* access modifiers changed from: protected */
    public final Uri a() {
        return MediaStore.Files.getContentUri("external");
    }

    /* access modifiers changed from: protected */
    public final String[] b() {
        return a;
    }

    /* access modifiers changed from: protected */
    public final String[] c() {
        return b;
    }
}
