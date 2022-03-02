package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aws {
    public final List a;
    public final List b;
    public final List c;

    public aws(List list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(((ayg) list.get(i)).a.a());
            this.b.add(((ayg) list.get(i)).b.a());
        }
    }
}
