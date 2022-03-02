package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: qrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qrz extends qsc {
    static final String a = String.format("(%s=1 OR %s=1) AND %s IS NOT NULL", new Object[]{"is_music", "is_podcast", "title"});
    static final String[] b = {"_id", "date_modified", "title", "album", "album_id", "artist", "artist_id"};

    public qrz(qsf qsf) {
        this.d = qsf;
    }

    /* access modifiers changed from: protected */
    public final Uri a() {
        return MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
    }

    /* access modifiers changed from: protected */
    public final String[] b() {
        return b;
    }

    public final qsj a(Long l, Long l2) {
        boolean z;
        String str;
        if (l2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (axvz.a.a().q()) {
            str = a;
        } else {
            str = null;
        }
        Cursor a2 = this.d.a(a(z, false, l, l2, str));
        if (a2 != null) {
            return new qsj(a2);
        }
        return null;
    }
}
