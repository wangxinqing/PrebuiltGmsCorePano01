package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.ContentProvider;

/* renamed from: mtl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class mtl extends ContentProvider {
    public final Bundle call(String str, String str2, Bundle bundle) {
        if (!"getCardList".equals(str)) {
            return super.call(str, str2, bundle);
        }
        Bundle bundle2 = new Bundle();
        aucd o = bdb.b.o();
        aucd o2 = bda.e.o();
        String uri = aryo.a("pair_header_suggestion").toString();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        bda bda = (bda) o2.b;
        uri.getClass();
        int i = bda.a | 1;
        bda.a = i;
        bda.b = uri;
        "pair_header_suggestion".getClass();
        int i2 = i | 2;
        bda.a = i2;
        bda.c = "pair_header_suggestion";
        bda.d = 3;
        bda.a = i2 | 4;
        o.a((bda) o2.i());
        aucd o3 = bda.e.o();
        String uri2 = aryo.a("ota_contextual_cards").toString();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        bda bda2 = (bda) o3.b;
        uri2.getClass();
        int i3 = bda2.a | 1;
        bda2.a = i3;
        bda2.b = uri2;
        "ota_contextual_cards".getClass();
        int i4 = i3 | 2;
        bda2.a = i4;
        bda2.c = "ota_contextual_cards";
        bda2.d = 3;
        bda2.a = i4 | 4;
        o.a((bda) o3.i());
        bundle2.putByteArray("cardList", ((bdb) o.i()).k());
        return bundle2;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
