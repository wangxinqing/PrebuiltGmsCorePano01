package defpackage;

import android.content.SharedPreferences;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: afzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afzi implements afzh {
    private final SharedPreferences a;

    public afzi(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final List a(String str) {
        Set<String> stringSet = this.a.getStringSet(str, new HashSet());
        ArrayList arrayList = new ArrayList(stringSet.size());
        for (String b : stringSet) {
            try {
                arrayList.add(InetAddress.getByAddress(anml.g.b((CharSequence) b)));
            } catch (UnknownHostException e) {
            }
        }
        return arrayList;
    }

    public final void a(String str, List list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(anml.g.a(((InetAddress) list.get(i)).getAddress()));
        }
        this.a.edit().putStringSet(str, hashSet).apply();
    }
}
