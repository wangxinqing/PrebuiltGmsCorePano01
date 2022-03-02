package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: jkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jkx {
    public static Set a(Collection collection) {
        iva.a((Object) collection, (Object) "scopeStrings can't be null.");
        return a((String[]) collection.toArray(new String[collection.size()]));
    }

    public static Set a(String... strArr) {
        iva.a((Object) strArr, (Object) "scopeStrings can't be null.");
        HashSet hashSet = new HashSet(r1);
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                hashSet.add(new Scope(str));
            }
        }
        return hashSet;
    }

    public static String[] a(Set set) {
        iva.a((Object) set, (Object) "scopes can't be null.");
        return a((Scope[]) set.toArray(new Scope[set.size()]));
    }

    public static String[] a(Scope[] scopeArr) {
        iva.a((Object) scopeArr, (Object) "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int i = 0; i < scopeArr.length; i++) {
            strArr[i] = scopeArr[i].b;
        }
        return strArr;
    }
}
