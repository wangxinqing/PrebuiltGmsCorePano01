package defpackage;

import com.google.android.gms.location.places.personalized.AliasedPlace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: byt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class byt {
    private Map a = null;
    private final ick b;

    public byt(ick ick) {
        this.b = ick;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        Map map = this.a;
        if (map != null && map.containsKey(str)) {
            return (String) this.a.get(str);
        }
        if (this.a == null) {
            this.a = new HashMap();
        }
        for (AliasedPlace aliasedPlace : this.b.e()) {
            Iterator it = aliasedPlace.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = aliasedPlace.a;
                        this.a.put(str, str2);
                        return str2;
                    }
                }
            }
        }
        this.a.put(str, (Object) null);
        return null;
    }
}
