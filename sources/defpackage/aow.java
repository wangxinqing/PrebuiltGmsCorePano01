package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* renamed from: aow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aow {
    public final ob a;
    public final String b;

    public aow(Set set, String str, boolean z) {
        ob obVar = new ob();
        this.a = obVar;
        if (z) {
            obVar.add(new String[0]);
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ob obVar2 = this.a;
                String[] split = ((String) it.next()).split("/", -1);
                for (int i = 0; i < split.length; i++) {
                    split[i] = Uri.decode(split[i]);
                }
                obVar2.add(split);
            }
        }
        this.b = str;
    }

    public static final boolean a(String[] strArr, String[] strArr2) {
        int length = strArr.length;
        if (strArr2.length < length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!Objects.equals(strArr2[i], strArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final boolean a(List list) {
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (a((String[]) it.next(), strArr)) {
                return true;
            }
        }
        return false;
    }
}
