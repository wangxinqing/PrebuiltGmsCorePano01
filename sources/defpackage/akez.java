package defpackage;

import android.net.Uri;
import java.util.Comparator;

/* renamed from: akez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akez implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Uri uri;
        aker aker = (aker) obj;
        aker aker2 = (aker) obj2;
        Uri uri2 = null;
        if (aker != null) {
            uri = aker.a;
        } else {
            uri = null;
        }
        if (aker2 != null) {
            uri2 = aker2.a;
        }
        if (uri == null) {
            return uri2 != null ? -1 : 0;
        }
        if (uri2 == null) {
            return 1;
        }
        return uri.compareTo(uri2);
    }
}
