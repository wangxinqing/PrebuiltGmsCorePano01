package defpackage;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: azyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azyi {
    static final amre a = amre.a(',');
    public static final azyi b = new azyi().a(new azxu(), true).a(azxv.a, false);
    public final Map c;
    public final byte[] d;

    private azyi() {
        this.c = new LinkedHashMap(0);
        this.d = new byte[0];
    }

    public final azyi a(azyg azyg, boolean z) {
        return new azyi(azyg, z, this);
    }

    private azyi(azyg azyg, boolean z, azyi azyi) {
        String a2 = azyg.a();
        amrl.a(!a2.contains(","), (Object) "Comma is currently not allowed in message encoding");
        int size = azyi.c.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(!azyi.c.containsKey(azyg.a()) ? size + 1 : size);
        for (azyh azyh : azyi.c.values()) {
            String a3 = azyh.a.a();
            if (!a3.equals(a2)) {
                linkedHashMap.put(a3, new azyh(azyh.a, azyh.b));
            }
        }
        linkedHashMap.put(a2, new azyh(azyg, z));
        this.c = Collections.unmodifiableMap(linkedHashMap);
        amre amre = a;
        HashSet hashSet = new HashSet(this.c.size());
        for (Map.Entry entry : this.c.entrySet()) {
            if (((azyh) entry.getValue()).b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.d = amre.a((Iterable) Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}
