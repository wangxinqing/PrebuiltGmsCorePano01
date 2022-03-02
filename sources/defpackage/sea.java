package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sea {
    static ost a(Uri uri, List list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            ost ost = (ost) list.get(i);
            String path = uri.getPath();
            String str = ost.a;
            ArrayList arrayList = new ArrayList(Uri.parse(str).getPathSegments());
            ArrayList arrayList2 = new ArrayList(uri.getPathSegments());
            if (arrayList2.size() >= 3 && arrayList.size() >= 3 && TextUtils.equals((CharSequence) arrayList.get(2), "*")) {
                arrayList.set(2, (String) arrayList2.get(2));
                String str2 = File.separator;
                String join = TextUtils.join(File.separator, arrayList);
                String str3 = File.separator;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(join).length() + String.valueOf(str3).length());
                sb.append(str2);
                sb.append(join);
                sb.append(str3);
                str = sb.toString();
            }
            i++;
            if (path.startsWith(str)) {
                return ost;
            }
        }
        return null;
    }
}
