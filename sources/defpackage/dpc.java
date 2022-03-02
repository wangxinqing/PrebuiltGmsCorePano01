package defpackage;

import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.analytics.internal.Command;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: dpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dpc {
    public final Map a;
    public final List b;
    public final long c;
    public final long d;
    public final int e;
    public final boolean f;
    public final String g;

    public dpc(dlz dlz, Map map, long j, boolean z) {
        this(dlz, map, j, z, 0, 0, (List) null);
    }

    private static String a(dlz dlz, Object obj) {
        if (obj != null) {
            String obj2 = obj.toString();
            if (obj2.startsWith("&")) {
                obj2 = obj2.substring(1);
            }
            int length = obj2.length();
            if (length > 256) {
                obj2 = obj2.substring(0, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                dlz.c("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
            }
            if (!TextUtils.isEmpty(obj2)) {
                return obj2;
            }
        }
        return null;
    }

    private static String b(dlz dlz, Object obj) {
        String str;
        if (obj != null) {
            str = obj.toString();
        } else {
            str = "";
        }
        int length = str.length();
        if (length <= 8192) {
            return str;
        }
        String substring = str.substring(0, FragmentTransaction.TRANSIT_EXIT_MASK);
        dlz.c("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
        return substring;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ht=");
        sb.append(this.d);
        if (this.c != 0) {
            sb.append(", dbId=");
            sb.append(this.c);
        }
        if (this.e != 0) {
            sb.append(", appUID=");
            sb.append(this.e);
        }
        ArrayList arrayList = new ArrayList(this.a.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            sb.append(", ");
            sb.append(str);
            sb.append("=");
            sb.append((String) this.a.get(str));
        }
        return sb.toString();
    }

    public dpc(dlz dlz, Map map, long j, boolean z, long j2, int i, List list) {
        List list2;
        String str;
        String a2;
        String a3;
        iva.a((Object) dlz);
        iva.a((Object) map);
        this.d = j;
        this.f = z;
        this.c = j2;
        this.e = i;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = list;
        }
        this.b = list2;
        String str2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Command command = (Command) it.next();
                if ("appendVersion".equals(command.a)) {
                    str = command.b;
                    break;
                }
            }
        }
        str = null;
        this.g = !TextUtils.isEmpty(str) ? str : str2;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (a(entry.getKey()) && (a3 = a(dlz, entry.getKey())) != null) {
                hashMap.put(a3, b(dlz, entry.getValue()));
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (!a(entry2.getKey()) && (a2 = a(dlz, entry2.getKey())) != null) {
                hashMap.put(a2, b(dlz, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.g)) {
            dpx.a((Map) hashMap, "_v", this.g);
            if (this.g.equals("ma4.0.0") || this.g.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.a = Collections.unmodifiableMap(hashMap);
    }

    private static boolean a(Object obj) {
        if (obj != null) {
            return obj.toString().startsWith("&");
        }
        return false;
    }

    public final String a(String str, String str2) {
        iva.c(str);
        iva.b(!str.startsWith("&"), "Short param name required");
        String str3 = (String) this.a.get(str);
        return str3 != null ? str3 : str2;
    }
}
