package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeopleaffinities;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: xeg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xeg {
    static final Map a;
    static final Map b;
    static final Map c;
    private static final Iterable d = new yca();

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("home", 1);
        a.put("work", 2);
        a.put("mobile", 3);
        a.put("homeFax", 4);
        a.put("workFax", 5);
        a.put("otherFax", 6);
        a.put("pager", 7);
        a.put("companyMain", 8);
        a.put("assistent", 9);
        a.put("car", 10);
        a.put("radio", 11);
        a.put("isdn", 12);
        a.put("callback", 13);
        a.put("telex", 14);
        a.put("tty", 15);
        a.put("workMobile", 16);
        a.put("workPager", 17);
        a.put("main", 18);
        a.put("googleVoice", 19);
        a.put("other", -1);
        a.put((Object) null, -1);
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap2.put("home", 1);
        b.put("work", 2);
        b.put("other", -1);
        b.put((Object) null, -1);
        HashMap hashMap3 = new HashMap();
        c = hashMap3;
        hashMap3.put("home", 1);
        c.put("work", 2);
        c.put("other", -1);
        c.put((Object) null, -1);
    }

    public static double a(Mergedpeoplemetadata mergedpeoplemetadata, String str) {
        if (mergedpeoplemetadata != null) {
            for (Mergedpeopleaffinities mergedpeopleaffinities : a((Iterable) mergedpeoplemetadata.b)) {
                if (str.equals(mergedpeopleaffinities.c)) {
                    return mergedpeopleaffinities.d;
                }
            }
        }
        return 0.0d;
    }

    public static Iterable a(Iterable iterable) {
        return iterable == null ? d : iterable;
    }

    public static int b(Mergedpeoplemetadata mergedpeoplemetadata) {
        if (a(mergedpeoplemetadata)) {
            return 0;
        }
        if (mergedpeoplemetadata == null || !"circle".equals(mergedpeoplemetadata.c)) {
            return (mergedpeoplemetadata == null || !"contact".equals(mergedpeoplemetadata.c)) ? -1 : 1;
        }
        return 2;
    }

    public static Person.Images c(Person person) {
        return (Person.Images) a(person.q, (xdz) xeb.a);
    }

    public static boolean c(Mergedpeoplemetadata mergedpeoplemetadata) {
        return mergedpeoplemetadata != null && mergedpeoplemetadata.g;
    }

    public static Person.CoverPhotos d(Person person) {
        List list = person.h;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (Person.CoverPhotos) person.h.get(0);
    }

    public static final int e(Person person) {
        Person.Metadata metadata = person.x;
        return (metadata == null || !"page".equals(metadata.o)) ? 1 : 2;
    }

    public static boolean f(Person person) {
        Person.Metadata metadata = person.x;
        if (metadata == null || TextUtils.isEmpty(metadata.p)) {
            return false;
        }
        if (aywy.a.a().dm()) {
            return true;
        }
        List list = metadata.q;
        if (list != null) {
            return list.contains("googlePlus");
        }
        if (aywy.a.a().dl()) {
            return false;
        }
        return true;
    }

    public static boolean g(Person person) {
        Person.Metadata metadata = person.x;
        return metadata != null && !TextUtils.isEmpty(metadata.p);
    }

    public static boolean h(Person person) {
        Person.Metadata metadata = person.x;
        return metadata != null && a(metadata.g) > 0;
    }

    public static List i(Person person) {
        ArrayList arrayList = new ArrayList();
        if (h(person)) {
            for (String str : a((Iterable) person.x.g)) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                } else {
                    Log.w("PeopleProtoHelper", "Empty contact ID detected");
                }
            }
        }
        return arrayList;
    }

    public static boolean j(Person person) {
        return k(person) != null;
    }

    public static Person.Emails k(Person person) {
        Person.Metadata metadata = person.x;
        Object obj = null;
        if (metadata == null || f(person) || a(metadata.f) <= 0) {
            return null;
        }
        xdy xdy = xdy.a;
        List list = person.j;
        int a2 = a(list);
        int i = 0;
        while (true) {
            if (i >= a2) {
                break;
            }
            Object obj2 = list.get(i);
            Mergedpeoplemetadata a3 = xdy.a(obj2);
            if (a3 != null && a3.j) {
                obj = obj2;
                break;
            }
            i++;
        }
        return (Person.Emails) obj;
    }

    public static boolean l(Person person) {
        Person.Metadata metadata = person.x;
        return metadata != null && metadata.a.contains(8) && "menagerie".equals(person.x.h);
    }

    public static String m(Person person) {
        Person.Metadata metadata = person.x;
        if (metadata != null) {
            return metadata.p;
        }
        return null;
    }

    public static long n(Person person) {
        Person.Metadata metadata = person.x;
        return metadata != null ? metadata.n / 1000 : System.currentTimeMillis();
    }

    public static String o(Person person) {
        String m;
        if (f(person) && (m = m(person)) != null) {
            return ycm.f(m);
        }
        Person.Emails k = k(person);
        if (k == null) {
            return null;
        }
        if (!TextUtils.isEmpty(k.f)) {
            return ycm.h(k.f);
        }
        throw new xeh("Email empty.");
    }

    public static boolean p(Person person) {
        Person.Metadata metadata = person.x;
        return metadata != null && metadata.i;
    }

    public static boolean q(Person person) {
        Person.Metadata metadata = person.x;
        return metadata != null && a(metadata.f) > 0;
    }

    public static double a(Person.Metadata metadata, String str) {
        if (metadata != null) {
            for (Mergedpeopleaffinities mergedpeopleaffinities : a((Iterable) metadata.b)) {
                if (str.equals(mergedpeopleaffinities.c)) {
                    return mergedpeopleaffinities.d;
                }
            }
        }
        return 0.0d;
    }

    public static int a(Person.Emails emails) {
        return ((Integer) a(b, (Object) emails.e)).intValue();
    }

    public static int a(Person.PhoneNumbers phoneNumbers) {
        return ((Integer) a(a, (Object) phoneNumbers.e)).intValue();
    }

    public static Person.Names b(Person person) {
        return (Person.Names) a(person.y, (xdz) xec.a);
    }

    public static int a(List list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static String b(Mergedpeoplemetadata mergedpeoplemetadata, String str) {
        if (mergedpeoplemetadata != null) {
            for (Mergedpeopleaffinities mergedpeopleaffinities : a((Iterable) mergedpeoplemetadata.b)) {
                if (str.equals(mergedpeopleaffinities.c)) {
                    return mergedpeopleaffinities.b;
                }
            }
        }
        return null;
    }

    public static String b(Person.Metadata metadata, String str) {
        if (metadata != null) {
            for (Mergedpeopleaffinities mergedpeopleaffinities : a((Iterable) metadata.b)) {
                if (str.equals(mergedpeopleaffinities.c)) {
                    return mergedpeopleaffinities.b;
                }
            }
        }
        return null;
    }

    private static Object a(List list, xdz xdz) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (a(xdz.a(obj))) {
                    return obj;
                }
            }
        }
        return null;
    }

    static Object a(Map map, Object obj) {
        if (map.containsKey(obj)) {
            return map.get(obj);
        }
        return map.get((Object) null);
    }

    public static boolean a(Mergedpeoplemetadata mergedpeoplemetadata) {
        String str;
        if (mergedpeoplemetadata == null || (str = mergedpeoplemetadata.c) == null) {
            return true;
        }
        return "profile".equals(str);
    }

    public static boolean a(Person person) {
        Person.Metadata metadata = person.x;
        return metadata != null && metadata.b() && person.x.q.contains("googlePlus") && !person.x.q.contains("googlePlusDisabledByAdmin");
    }
}
