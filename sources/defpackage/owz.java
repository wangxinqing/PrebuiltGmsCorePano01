package defpackage;

import android.os.Parcel;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: owz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class owz {
    private static final anli a = anln.b();

    public static void a(Map map) {
        String str;
        String[] strArr;
        HashMap hashMap = new HashMap();
        for (List list : map.values()) {
            for (int i = 0; i < list.size(); i++) {
                Thing thing = (Thing) list.get(i);
                String str2 = thing.c.c;
                if (!str2.isEmpty()) {
                    Parcel obtain = Parcel.obtain();
                    apnc.a(thing, obtain, 0);
                    obtain.setDataPosition(0);
                    Thing thing2 = (Thing) Thing.CREATOR.createFromParcel(obtain);
                    list.set(i, thing2);
                    if (hashMap.get(str2) != null) {
                        str = (String) hashMap.get(str2);
                    } else {
                        String a2 = anml.e.a(a.a(str2, amqn.c).b());
                        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 6);
                        sb.append("__a_");
                        sb.append(a2);
                        sb.append("__");
                        String sb2 = sb.toString();
                        hashMap.put(str2, sb2);
                        str = sb2;
                    }
                    String[] b = thing2.b("keywords");
                    if (b != null) {
                        int length = b.length;
                        strArr = (String[]) Arrays.copyOf(b, length + 1);
                        strArr[length] = str;
                    } else {
                        strArr = new String[]{str};
                    }
                    thing2.b.putStringArray("keywords", strArr);
                }
            }
        }
    }
}
