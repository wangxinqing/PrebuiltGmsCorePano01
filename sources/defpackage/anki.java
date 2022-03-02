package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: anki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anki extends ankg {
    private static final Map c;
    private final anim d;

    static {
        EnumMap enumMap = new EnumMap(anim.class);
        for (anim anim : anim.values()) {
            anki[] ankiArr = new anki[10];
            for (int i = 0; i < 10; i++) {
                ankiArr[i] = new anki(i, anim, anin.a);
            }
            enumMap.put(anim, ankiArr);
        }
        c = Collections.unmodifiableMap(enumMap);
    }

    private anki(int i, anim anim, anin anin) {
        super(anin, i);
        ankq.a(anim, "format char");
        this.d = anim;
        if (!anin.a()) {
            char c2 = anim.l;
            c2 = anin.b() ? c2 & 65503 : c2;
            StringBuilder sb = new StringBuilder("%");
            anin.a(sb);
            sb.append((char) c2);
            sb.toString();
        }
    }

    public static anki a(int i, anim anim, anin anin) {
        if (i < 10 && anin.a()) {
            return ((anki[]) c.get(anim))[i];
        }
        return new anki(i, anim, anin);
    }

    public final void a(ankh ankh, Object obj) {
        ankh.a(obj, this.d, this.b);
    }
}
