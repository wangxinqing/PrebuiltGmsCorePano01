package defpackage;

import java.util.Arrays;

/* renamed from: bbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bbg {
    private final bbh a = new bbh();

    public final bbh a() {
        String[] strArr = new String[this.a.size()];
        this.a.keySet().toArray(strArr);
        Arrays.sort(strArr);
        return this.a;
    }

    public final void a(String str, String str2) {
        bbh bbh = this.a;
        StringBuilder sb = new StringBuilder(str2.length() + 4 + str.length());
        sb.append(str2);
        sb.append(" AS ");
        sb.append(str);
        bbh.a(str, sb.toString());
    }

    public final void a(String[] strArr) {
        for (String str : strArr) {
            this.a.a(str, str);
        }
    }
}
