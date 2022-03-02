package defpackage;

import android.util.SparseArray;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: jzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum jzl {
    FILE(1, "https://www.googleapis.com/auth/drive.file", false),
    APPDATA(2, "https://www.googleapis.com/auth/drive.appdata", false),
    FULL(3, "https://www.googleapis.com/auth/drive", true),
    APPS(4, "https://www.googleapis.com/auth/drive.apps", true);
    
    public static final Set e = null;
    private static final SparseArray i = null;
    public final String f;
    public final int g;
    public final boolean h;

    static {
        jzl jzl;
        int i2;
        jzl jzl2;
        jzl jzl3;
        e = EnumSet.of(jzl3, jzl2, jzl);
        i = new SparseArray();
        for (jzl jzl4 : values()) {
            i.put(jzl4.g, jzl4);
        }
    }

    private jzl(int i2, String str, boolean z) {
        this.g = i2;
        this.f = str;
        this.h = z;
    }

    public static Set a(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            hashSet.add(((jzl) it.next()).f);
        }
        return hashSet;
    }

    public static jzl a(int i2) {
        return (jzl) i.get(i2);
    }
}
